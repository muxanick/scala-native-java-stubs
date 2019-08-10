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
    parser.add_argument('--first', help='First class to start if --all defined (skip until this clas)')
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

def requestParseAndSave(classname, classpackage, classshortname, args, global_indent, urlpath, parentname):
    classfullname = classshortname if parentname == None else '.'.join([parentname, classshortname])
    full_url = 'http://docs.oracle.com/javase/' + args.java + '/docs/api/' + urlpath
    try:
        htmlStr = urlopen(full_url + '.html').read().decode('utf-8', 'ignore')
        dom = AdvancedHTMLParser.AdvancedHTMLParser()
        dom.parseStr(htmlStr)
    except Exception as e:
        print(e)
        return []
    
    links = set()

    def parseLink(tag, refs):
        if refs == None:
            return
        baseurl = urlpath.split('/')[:-1]
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
        if (new_classname != classname) and new_classname.startswith('java'):
            refs.add(new_classname)

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
        sorted_imports = list(imports_list)
        sorted_imports.sort()
        groups = itertools.groupby(sorted_imports, lambda x: splitClassname(x)[0])
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

    def makeClassDefinition(tokens, indent):
        new_tokens = transformTokens(tokens.copy())
        name_idx = 0
        for i, tok in enumerate(new_tokens):
            if tok.startswith(classfullname + '[') or tok == classfullname:
                name_idx = i
                break;
        head_tokens = new_tokens[0:name_idx]
        # Class definition and methods
        class_access = ' '.join(set(['public', 'private', 'protected']).intersection(set(head_tokens)))
        if class_access:
            head_tokens.remove(class_access)
        class_final = 'final' in head_tokens
        if class_final:
            head_tokens.remove('final')
        class_abstract = 'abstract' in head_tokens
        if class_abstract:
            head_tokens.remove('abstract')
        class_static = 'static' in head_tokens
        if class_static:
            head_tokens.remove('static')
        class_enum = 'enum' in head_tokens
        if class_enum:
            head_tokens.remove('enum')
        class_interface = 'interface' in head_tokens
        if class_interface:
            head_tokens.remove('interface')
        class_class = 'class' in head_tokens
        if class_class:
            head_tokens.remove('class')
        class_annotation = '@interface' in head_tokens
        if class_annotation:
            head_tokens.remove('@interface')
            class_class = True
            class_final = True
        
        class_tokens = [class_access] if len(class_access)>0 else []
        if class_abstract:
            class_tokens.append('abstract')
        elif class_final:
            class_tokens.append('final')

        if class_interface:
            class_tokens.append('trait')
        elif class_enum:
            class_tokens.append('class')
        elif class_static:
            class_tokens.append('object')
        else:
            assert class_class
            class_tokens.append('class')

        new_tokens[0:name_idx] = class_tokens
        name_idx = len(class_tokens)

        if class_annotation:
            new_tokens[name_idx:name_idx+1] = [new_tokens[name_idx],'extends', 'StaticAnnotation']

        head_str = ''.join(head_tokens)

        if class_enum:
            idx = name_idx
            new_tokens[idx] = classshortname + ' private (name: String, ordinal: Int)'
            while idx < len(new_tokens):
                if new_tokens[idx].startswith('Enum['):
                    new_tokens[idx] += '(name, ordinal)'
                    new_tokens[idx] = new_tokens[idx].replace(classfullname, classshortname)
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
            elif new_tokens[idx].startswith(classfullname):
                new_tokens[idx] = new_tokens[idx].replace(classfullname, classshortname)
                idx += 1
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
        spaces = (' ' * indent)
        text = ''
        if len(head_str)>0:
            text += head_str[0] + head_str[1:].replace('@', '\n' + spaces +'@') + '\n'
        text += spaces + ' '.join(new_tokens) + ' {\n'
        return class_abstract, class_static, class_enum, class_access, text

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
    def makeMethod(indent, method, class_static, class_abstract, class_enum, links):
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
        if tokens[0] in ['default']:
            abstract = False
            tokens.pop(0)
        lineType = None
        if len(tokens)>1 and tokens[1] != '(':
            lineType = tokens[0].replace(classfullname, classshortname)
            tokens.pop(0)
        name = tokens[0] if tokens[0] != classfullname and tokens[0] != classshortname else ('this' if not class_static else 'apply')
        params = None
        if len(tokens) > 1 and tokens[1] == '(':
            param_tokens = splitByComma(tokens[2:-1])
            params = []
            for param in param_tokens:
                if len(param) == 0:
                    continue
                param_type, param_name = param
                params.append(param_name + ': ' + (param_type if param_type != 'Object' else 'Any'))
        line = (' ' * indent) + ((access + ' ') if access else '')
        enum_value_line = False
        custom_desc = None
        if class_enum and params == None and lineType == None:
            line += 'final val ' + name + ': ' + classshortname + ' = new ' + classshortname + '("' + name + '", ' + str(enum_value[0]) + ')'
            enum_value_line = True
            enum_value[0] += 1
        elif lineType == 'class' or lineType == 'interface':
            real_name = name.split('[')[0]
            new_urlpath = classpackage.replace('.', '/') + '/' + real_name
            names = real_name.split('.')
            names = ['.'.join(names[0:-1]), names[-1]]
            sub_links, _, sub_code_desc, sub_code = requestParseAndSave(classpackage + '.' + real_name, classpackage, names[-1], args, global_indent=indent, urlpath=new_urlpath, parentname=names[0])
            custom_desc = sub_code_desc
            links.update(sub_links)
            line = sub_code
            lineType = None
            abstract = True
        else:
            line += ('def ' if params != None else 'val ') + name + (generic if generic != None else '')
        if params != None:
            line += '(' + ', '.join(params) + ')'
        if lineType != None:
            line += ': ' + (lineType if lineType != 'Object' else 'Any')
        result = ''
        if custom_desc == None:
            result += makeComment(indent, method['desc'])
        else:
            result += custom_desc
        if not abstract and not class_abstract and not enum_value_line:
            result += (' ' * indent) + '@stub\n'
        result += line + (' = ???\n' if not abstract and not class_abstract and not enum_value_line else '\n')
        return result

    tag_inheritances = dom.getElementsByClassName('contentContainer').getElementsByClassName('inheritance')
    inheritances = []
    if tag_inheritances:
        for i in tag_inheritances:
            if i.firstElementChild.firstElementChild:
                ancector_classname = i.firstElementChild.firstElementChild.innerText
                inheritances.append(ancector_classname)
                links.add(ancector_classname)
    
    tag_description = dom.getElementsByClassName('description')
    definition = None
    if tag_description:
        tags_pre = tag_description.getElementsByTagName('pre')
        if tags_pre:
            for tag_pre in tags_pre:
                tag_desc = tag_pre.parentNode.parentNode.parentNode
                if tag_desc == tag_description[0]:
                    definition = parseDefinition(tag_pre)
                    break
    assert definition != None, "No class found"

    tag_all_members = dom.getElementsByClassName('memberSummary')
    constructors = []
    enums = []
    methods = []
    for tag_members in tag_all_members:
        section_name = ''
        if tag_members.firstElementChild.firstElementChild:
            section_name = tag_members.firstElementChild.firstElementChild.innerText
        if section_name == 'Constructors':
            for i in tag_members.children[2:]:
                constructors.append(parseMethod(i))
        elif section_name == 'Enum Constants':
            for i in tag_members.children[2:]:
                enums.append(parseMethod(i))
        else:
            for i in tag_members.children[2:]:
                methods.append(parseMethod(i))

    ###### Create a code
    # Description
    code_desc = makeComment(global_indent, definition['desc'])
    code = ''
    
    enum_value[0] = 0
    indent = global_indent + 0
    class_abstract, class_static, class_enum, class_access, definition_text = makeClassDefinition(definition['tokens'], indent)
    code += definition_text
    indent = global_indent + 4
    static_methods = enums
    for con in constructors:
        code += '\n' + makeMethod(indent, con, class_static = class_static, class_abstract=False, class_enum = class_enum, links=links)
    for met in methods:
        if class_static or ('static' in met['tokens']):
            if 'static' in met['tokens']:
                met['tokens'].remove('static')
            static_methods.append(met)
            continue
        code += '\n' + makeMethod(indent, met, class_static = class_static, class_abstract=class_abstract, class_enum = class_enum, links=links)
    if not class_static or class_enum:
        code += (' '*global_indent) + '}\n'
    if len(static_methods) > 0:
        if not class_static or class_enum:
            code += '\n' + (' '*global_indent) + (class_access + ' ' if len(class_access)>0 else '') + 'object ' + classshortname + ' {'
        for met in static_methods:
            code += '\n' + makeMethod(indent, met, class_static = class_static, class_abstract=False, class_enum = class_enum, links=links)
        code += (' '*global_indent) + '}\n'

    code_header = ''
    if parentname == None:
        # Package
        code_header = 'package ' + classpackage + '\n'
        # Imports
        indent = global_indent + 0
        imports_list = links.copy()
        imports_list.add('scala.scalanative.annotation.stub')
        if '@interface' in definition['tokens']:
            imports_list.add('scala.annotation.StaticAnnotation')
        code_header += makeImports(imports_list) + '\n'
    # print(code)
    return links, code_header, code_desc, code
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
                if url == args.first:
                    result = []
                result.append(url)
    return result
def main():
    args = parseCommandLine()
    visited = set()
    jobs = [args.classname] if not args.all else getAllClassNames(args)
    while len(jobs)>0:
        classname = jobs[0]
        jobs = jobs[1:]
        if classname not in visited:
            classpackage, classshortname = splitClassname(classname)
            if '.' in classshortname:
                continue
            urlpath = classpackage.replace('.', '/') + '/' + classshortname
            print(classname)
            scalafile = urlpath + ".scala"
            if not os.path.exists(scalafile):
                dirs = os.path.dirname(scalafile)
                os.makedirs(dirs, exist_ok=True)
            elif args.all and not args.overwrite:
                continue
            links, code_header, code_desc, code = requestParseAndSave(classname, classpackage, classshortname, args, 0, urlpath = urlpath, parentname = None)
            code = code_header + code_desc + code
            if args.overwrite or not os.path.exists(scalafile):
                full_scalapath = os.path.join(args.outputFolder, scalafile)
                with open(full_scalapath, 'w') as f:
                    f.write(code)
            visited.add(classname)
            for link in links:
                if link not in visited:
                    jobs.append(link)

if __name__ == "__main__":
    main()