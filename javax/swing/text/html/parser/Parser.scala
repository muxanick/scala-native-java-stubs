package javax.swing.text.html.parser

import java.io.Reader
import java.lang.{Object, String, StringBuffer}
import javax.swing.text.SimpleAttributeSet

/** A simple DTD-driven HTML parser. The parser reads an
 *  HTML file from an InputStream and calls various methods
 *  (which should be overridden in a subclass) when tags and
 *  data are encountered.
 *  
 *  Unfortunately there are many badly implemented HTML parsers
 *  out there, and as a result there are many badly formatted
 *  HTML files. This parser attempts to parse most HTML files.
 *  This means that the implementation sometimes deviates from
 *  the SGML specification in favor of HTML.
 *  
 *  The parser treats \r and \r\n as \n. Newlines after starttags
 *  and before end tags are ignored just as specified in the SGML/HTML
 *  specification.
 *  
 *  The html spec does not specify how spaces are to be coalesced very well.
 *  Specifically, the following scenarios are not discussed (note that a
 *  space should be used here, but I am using &nbsp to force the space to
 *  be displayed):
 *  
 *  '<b>blah <i> <strike> foo' which can be treated as:
 *  '<b>blah <i><strike>foo'
 *  as well as:
 *  '<p><a href="xx"> <em>Using</em></a></p>'
 *  which appears to be treated as:
 *  '<p><a href="xx"><em>Using</em></a></p>'
 *  
 *  If strict is false, when a tag that breaks flow,
 *  (TagElement.breaksFlows) or trailing whitespace is
 *  encountered, all whitespace will be ignored until a non whitespace
 *  character is encountered. This appears to give behavior closer to
 *  the popular browsers.
 */
class Parser extends Object with DTDConstants {

    /**  */
    @stub
    protected val dtd: DTD = ???

    /** Handle an end tag. */
    @stub
    protected def endTag(omitted: Boolean): Unit = ???

    /**  */
    @stub
    protected def error(err: String): Unit = ???

    /**  */
    @stub
    protected def error(err: String, arg1: String): Unit = ???

    /**  */
    @stub
    protected def error(err: String, arg1: String, arg2: String): Unit = ???

    /** Invoke the error handler. */
    @stub
    protected def error(err: String, arg1: String, arg2: String, arg3: String): Unit = ???

    /**  */
    @stub
    protected def flushAttributes(): Unit = ???

    /**  */
    @stub
    protected def getAttributes(): SimpleAttributeSet = ???

    /**  */
    @stub
    protected def getCurrentLine(): Int = ???

    /**  */
    @stub
    protected def getCurrentPos(): Int = ???

    /** Called when an HTML comment is encountered. */
    @stub
    protected def handleComment(text: Array[Char]): Unit = ???

    /** Called when an empty tag is encountered. */
    @stub
    protected def handleEmptyTag(tag: TagElement): Unit = ???

    /** Called when an end tag is encountered. */
    @stub
    protected def handleEndTag(tag: TagElement): Unit = ???

    /**  */
    @stub
    protected def handleEOFInComment(): Unit = ???

    /** An error has occurred. */
    @stub
    protected def handleError(ln: Int, msg: String): Unit = ???

    /** Called when a start tag is encountered. */
    @stub
    protected def handleStartTag(tag: TagElement): Unit = ???

    /** Called when PCDATA is encountered. */
    @stub
    protected def handleText(text: Array[Char]): Unit = ???

    /** Called when an HTML title tag is encountered. */
    @stub
    protected def handleTitle(text: Array[Char]): Unit = ???

    /**  */
    @stub
    protected def makeTag(elem: Element): TagElement = ???

    /** Makes a TagElement. */
    @stub
    protected def makeTag(elem: Element, fictional: Boolean): TagElement = ???

    /** Marks the first time a tag has been seen in a document */
    @stub
    protected def markFirstTime(elem: Element): Unit = ???

    /** Parse an HTML stream, given a DTD. */
    @stub
    def parse(in: Reader): Unit = ???

    /** Parses th Document Declaration Type markup declaration. */
    @stub
    def parseDTDMarkup(): String = ???

    /** Parse markup declarations. */
    @stub
    protected def parseMarkupDeclarations(strBuff: StringBuffer): Boolean = ???
}
