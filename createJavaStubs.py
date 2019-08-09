import argparse
from urllib.request import urlopen
import AdvancedHTMLParser
from AdvancedHTMLParser import TagCollection
import os
import re
import html
import itertools 

def parseCommandLine():
    parser = argparse.ArgumentParser()
    parser.add_argument('--java', help='Java version, for example default value: 8')
    parser.add_argument('--outputFolder', help='Root folder of all scala files, default is working dir')
    parser.add_argument('--all', default=False, action='store_true', help='Load all classes')
    parser.add_argument('--overwrite', default=False, action='store_true', help='Ovewrite existent files')
    parser.add_argument('--classname', help='Full java class name which you want to create,\nFor instance: java.net.URLClassLoader')
    args = parser.parse_args()
    if not args.java:
        args.java = '8'
    if not args.outputFolder:
        args.outputFolder = os.getcwd()
    if not args.classname and not args.all:
        parser.print_help()
        exit(-1)
    return args

def requestParseAndSave(classname, args, all_classes):
    def splitClassname(c):
        a = ''
        b = ''
        s = c.split('.')
        for iname, namespace in enumerate(s):
            if namespace[0].isupper():
                a = '.'.join(s[:iname])
                b = '.'.join(s[iname:])
                break
        return [a, b]
    print(classname)
    classpackage, classshortname = splitClassname(classname)
    
    filepath = classpackage.replace('.', '/') + '/' + classshortname
    scalafile = filepath + ".scala"
    if not os.path.exists(scalafile):
        dirs = os.path.dirname(scalafile)
        os.makedirs(dirs, exist_ok=True)
    elif all_classes and not args.overwrite:
        return []
    full_url = 'http://docs.oracle.com/javase/' + args.java + '/docs/api/' + filepath
    try:
        htmlStr = urlopen(full_url + '.html').read().decode('utf-8')
        dom = AdvancedHTMLParser.AdvancedHTMLParser()
        dom.parseStr(htmlStr)
    except:
        return []
    
    links = []

    def parseLink(tag, refs):
        if refs == None:
            return
        baseurl = filepath.split('/')[:-1]
        url = tag.attributesDict['href']
        if not url:
            return
        for elem in url.split('/'):
            if len(elem) == 0:
                continue
            if elem == '..':
                baseurl = baseurl[:-1]
            else:
                if elem[0] == '#':
                    return
                baseurl.append(elem.split("#")[0].split('.html')[0])
        new_classname = '.'.join(baseurl)
        if (new_classname not in refs) and (new_classname != classname) and new_classname.startswith('java'):
            refs.append(new_classname)

    def cleanToken(dirty_token):
        return html.unescape(dirty_token).replace('\n', '').strip()
    def tokenize(tag, refs):
        tokens = []
        if isinstance(tag, str):
            if len(tag)>0:
                split_tokens = re.split('([,\(\)\[\] ])', tag)
                for elem in split_tokens:
                    if len(elem):
                        clean_tag = cleanToken(elem)
                        if len(clean_tag)>0:
                            tokens.append(clean_tag)

        elif tag.tagName:
            if tag.tagName == 'a':
                parseLink(tag, refs)
            for block in tag.blocks:
                tokens += tokenize(block, refs)
        else:
            tokens.append(cleanToken(tag.textContent))
        return tokens

    def parseText(tag):
        if isinstance(tag, str):
            return html.unescape(tag)
        elif tag != None:
            return html.unescape(tag.textContent)
        else:
            return ''

    def isRealCode(root, code):
        parent = code.parentNode
        while parent != root:
            if parent.tagName == 'div':
                return False
            parent = parent.parentNode
        return True

    def parseMethod(tag):
        tokens = []
        tags = TagCollection(tag)
        tag_codes = tags.getElementsByTagName('code')
        for code in tag_codes:
            if isRealCode(tag, code):
                tokens += tokenize(code, links)
        tag_div = tags.getElementsByTagName('div')
        desc = ''
        if tag_div and len(tag_div)>0:
            desc = parseText(tag_div[0])
        return {'desc' : desc, 'tokens': tokens}

    def parseDefinition(tag):
        tokens = tokenize(tag, links)
        desc_text = parseText(tag.nextElementSibling)
        return {'desc' : desc_text, 'tokens': tokens}

    def makeImports(imports_list):
        result = ''
        imports_list.sort()
        groups = itertools.groupby(imports_list, lambda x: splitClassname(x)[0])
        for group, imps_bin in groups:
            if group != classpackage:
                imps = list(imps_bin)
                if len(imps) == 1:
                    result += 'import ' + imps[0] + '\n'
                else:
                    result += 'import ' + group + '.{' + ', '.join(imps).replace(group + '.', '') + '}\n'
        if len(result)>0:
            result = '\n' + result
        return result
    
    def makeComment(indent, desc):
        spaces = (' ' * indent)
        multiline = desc.split('\n')
        return spaces + '/** ' + ('\n' + spaces + ' * ').join(multiline) + (' */\n' if len(multiline) == 1 else '\n' + spaces +' */\n')

    def translateGenericParams(tokens):
        idx = 0
        translations = {
            'extends' : '<:',
            'super' : '>:',
            '&' : 'with'
        }
        while idx < len(tokens):
            for java, scala in translations.items():
                if tokens[idx] == java:
                    tokens[idx] = scala
                    break
            token = tokens[idx]

            if token == '<:' or token == '>:':
                tokens[idx-1:idx + 2] = [' '.join(tokens[idx-1:idx + 2])]
            else:
                idx += 1
        return tokens

    def transformTokens(tokens):
        idx = 0
        translations = {
            'public' : '',
            'interface' : 'trait',
            '?' : '_',
            'void' : 'Unit',
            'byte' : 'Byte',
            'char' : 'Char',
            'short' : 'Short',
            'int' : 'Int',
            'long' : 'Long',
            'float' : 'Float',
            'double' : 'Double',
            'boolean' : 'Boolean'
        }
        while idx < len(tokens):
            for java, scala in translations.items():
                if tokens[idx] == java:
                    tokens[idx] = scala
                    break
            token = tokens[idx]
            if len(token)==0:
                tokens.pop(idx)
                continue

            if token == ']' and idx > 0 and tokens[idx-1] == '[':
                tokens[idx-2:idx + 1] = ['Array[' + tokens[idx-2] + ']']
                idx = idx - 1
            elif token == '...':
                tokens[idx-1:idx + 1] = [tokens[idx-1] + '*']
            elif token.endswith('...'):
                tokens[idx] = tokens[idx].replace('...', '*')
            elif token == '>':
                idx_start = idx - 1
                while idx_start >=0 and tokens[idx_start] != '<':
                    idx_start -= 1
                params = translateGenericParams(tokens[idx_start+1:idx])
                params = ', '.join(x for x in params if x != ',')
                if idx_start > 0:
                    tokens[idx_start-1:idx + 1] = [tokens[idx_start-1] + '[' + params + ']']
                    idx = idx_start
                else:
                    tokens[0:idx + 1] = ['[' + params + ']']
                    idx = idx_start + 1
            else:
                idx += 1
        return tokens

    def makeClassDefinition(tokens, class_enum):
        new_tokens = transformTokens(tokens)
        if class_enum:
            idx = new_tokens.index(classshortname)
            new_tokens[idx] = classshortname + ' private (name: String, ordinal: Int)'
            while idx < len(new_tokens):
                if new_tokens[idx].startswith('Enum['):
                    new_tokens[idx] += '(name, ordinal)'
                idx += 1
        idx = 0
        while idx < len(new_tokens):
            if new_tokens[idx] == 'implements':
                j = idx + 1
                while j < len(new_tokens):
                    if new_tokens[j] == ',':
                        new_tokens.pop(j)
                    else:
                        j += 1
                new_tokens[idx:] = ['with ' + ' with '.join(new_tokens[idx+1:])]
            elif new_tokens[idx] == '@interface':
                new_tokens[idx:] = ['\n', 'final', 'class', new_tokens[idx+1], 'extends', 'StaticAnnotation']
            elif new_tokens[idx] == 'extends':
                j = idx + 1
                while j < len(new_tokens):
                    if new_tokens[j] == ',':
                        new_tokens.pop(j)
                    elif new_tokens[j].startswith('implements') or new_tokens[j].startswith('with'):
                        break;
                    else:
                        j += 1
                if j > idx + 2:
                    new_tokens[idx:j] = ['extends ' + ' with '.join(new_tokens[idx+1:])]
                else:
                    idx = j
            else:
                idx += 1
        return ' '.join(new_tokens).replace('@', '\n@').strip() + ' {\n'

    def splitByComma(tokens):
        if ',' not in tokens:
            return [tokens]
        new_tokens = []
        prev = 0
        idx = 0
        while idx < len(tokens):
            if tokens[idx] == ',':
                new_tokens.append(tokens[prev:idx])
                prev = idx + 1
            idx += 1
        if idx > prev:
            new_tokens.append(tokens[prev:])
        return new_tokens

    enum_value = [0]
    def makeMethod(indent, method, class_abstract, class_enum):
        tokens = transformTokens(method['tokens'])
        generic = None
        if tokens[0][0] == '[':
            generic = tokens[0]
            tokens.pop(0)
        access = None
        if tokens[0] in ['protected', 'private']:
            access = tokens[0]
            tokens.pop(0)
        abstract = False
        if tokens[0] in ['abstract']:
            abstract = True
            tokens.pop(0)
        lineType = None
        if len(tokens)>1 and tokens[1] != '(':
            lineType = tokens[0]
            tokens.pop(0)
        name = tokens[0] if tokens[0] != classshortname else 'this'
        params = None
        if len(tokens) > 1 and tokens[1] == '(':
            param_tokens = splitByComma(tokens[2:-1])
            params = []
            for param in param_tokens:
                if len(param) == 0:
                    continue
                param_type, param_name = param
                params.append(param_name + ': ' + param_type)
        line = (access + ' ') if access else ''
        enum_value_line = False
        if class_enum and params == None and lineType == None:
            line += 'final val ' + name + ' = new ' + classshortname + '(' + name + ', ' + str(enum_value[0]) + ')'
            enum_value_line = True
            enum_value[0] += 1
        elif lineType == 'class':
            line += 'object ' + name.split('.')[-1] + ' extends ' + name
            lineType = None
            abstract = True
        else:
            line += ('def ' if params != None else 'val ') + name + (generic if generic != None else '')
        if params != None:
            line += '(' + ', '.join(params) + ')'
        if lineType != None:
            line += ': ' + lineType
        result = ''
        result += makeComment(indent, method['desc'])
        if not class_abstract and not enum_value_line:
            result += (' ' * indent) + '@stub\n'
        result += (' ' * indent) + line + (' = ???\n' if not abstract and not class_abstract and not enum_value_line else '\n')
        return result

    tag_inheritances = dom.getElementsByClassName('contentContainer').getElementsByClassName('inheritance')
    inheritances = []
    if tag_inheritances:
        for i in tag_inheritances:
            if i.firstElementChild.firstElementChild:
                ancector_classname = i.firstElementChild.firstElementChild.innerText
                inheritances.append(ancector_classname)
                links.append(ancector_classname)
    
    tag_description = dom.getElementsByClassName('description')
    definition = None
    if tag_description:
        tag_pre = tag_description.getElementsByTagName('pre')
        if tag_pre:
            definition = parseDefinition(tag_pre[0])

    tag_all_members = dom.getElementsByClassName('memberSummary')
    constructors = []
    methods = []
    for tag_members in tag_all_members:
        if tag_members.firstElementChild.firstElementChild and tag_members.firstElementChild.firstElementChild.innerText == 'Constructors':
            for i in tag_members.children[2:-1]:
                constructors.append(parseMethod(i))
        else:
            for i in tag_members.children[2:-1]:
                    methods.append(parseMethod(i))

    if args.overwrite or not os.path.exists(scalafile):
        ###### Create a code
        # Package
        code = 'package ' + classpackage + '\n'
        # Imports
        indent = 0
        imports_list = links
        if '@interface' in definition['tokens']:
            imports_list.append('scala.annotation.StaticAnnotation')
        code += makeImports(imports_list)
        code += '\n' + makeComment(0, definition['desc'])
        class_abstract = 'abstract' in definition['tokens']
        class_static = not set(['static', 'enum']).isdisjoint(definition['tokens'])
        class_enum = False
        if class_static:
            if 'static' in definition['tokens']:
                definition['tokens'].remove('static')
            if 'class' in definition['tokens']:
                definition['tokens'].remove('class')
            if 'enum' in definition['tokens']:
                class_enum = True
                definition['tokens'].remove('enum')
                definition['tokens'] = ['class'] + definition['tokens']
            else:
                if 'final' in definition['tokens']:
                    definition['tokens'].remove('final')
                    definition['tokens'] = ['final', 'object'] + definition['tokens']
                else:
                    definition['tokens'] = ['object'] + definition['tokens']

        enum_value[0] = 0
        code += makeClassDefinition(definition['tokens'], class_enum = class_enum)
        indent = 4
        static_methods = []
        for con in constructors:
            code += '\n' + makeMethod(indent, con, class_abstract=False, class_enum = class_enum)
        for met in methods:
            if class_static or ('static' in met['tokens']):
                if 'static' in met['tokens']:
                    met['tokens'].remove('static')
                static_methods.append(met)
                continue
            code += '\n' + makeMethod(indent, met, class_abstract=class_abstract, class_enum = class_enum)
        if not class_static or class_enum:
            code += '}\n'
        if len(static_methods) > 0:
            if not class_static or class_enum:
                code += '\nobject ' + classshortname + ' {'
            for met in static_methods:
                code += '\n' + makeMethod(indent, met, class_abstract=False, class_enum = class_enum)
            code += '}\n'
        # print(code)
        full_scalapath = os.path.join(args.outputFolder, scalafile)
        with open(full_scalapath, 'w') as f:
            f.write(code)
    return links
def getAllClassNames(args):
    full_url = 'http://docs.oracle.com/javase/' + args.java + '/docs/api/allclasses-noframe.html'
    htmlStr = urlopen(full_url).read().decode('utf-8')
    dom = AdvancedHTMLParser.AdvancedHTMLParser()
    dom.parseStr(htmlStr)
    tags = dom.getElementsByClassName('indexContainer').getElementsByTagName('a')
    result = []
    for tag in tags:
        if 'href' in tag.attributesDict:
            url = tag.attributesDict['href']
            url = url.split("#")[0].split('.html')[0]
            url = url.replace('/', '.')
            if url.startswith('java'):
                result.append(url)
    return result
def main():
    args = parseCommandLine()
    visited = []
    jobs = [args.classname] if not args.all else getAllClassNames(args)
    while len(jobs)>0:
        classname = jobs[0]
        jobs = jobs[1:]
        if classname not in visited:
            links = requestParseAndSave(classname, args, all_classes = args.all)
            visited.append(classname)
            for link in links:
                if link not in visited:
                    jobs.append(link)

if __name__ == "__main__":
    main()