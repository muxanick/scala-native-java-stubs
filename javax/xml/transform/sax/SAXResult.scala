package javax.xml.transform.sax

import java.lang.{Object, String}
import javax.xml.transform.Result
import org.xml.sax.ContentHandler
import org.xml.sax.ext.LexicalHandler

/** Acts as an holder for a transformation Result. */
class SAXResult extends Object with Result {

    /** Zero-argument default constructor. */
    @stub
    def this() = ???

    /** Get the ContentHandler that is the Result. */
    @stub
    def getHandler(): ContentHandler = ???

    /** Get a SAX2 LexicalHandler for the output. */
    @stub
    def getLexicalHandler(): LexicalHandler = ???

    /** Get the system identifier that was set with setSystemId. */
    @stub
    def getSystemId(): String = ???

    /** Set the target to be a SAX2 ContentHandler. */
    @stub
    def setHandler(handler: ContentHandler): Unit = ???

    /** Set the SAX2 LexicalHandler for the output. */
    @stub
    def setLexicalHandler(handler: LexicalHandler): Unit = ???
}
