package javax.xml.transform.sax

import java.lang.{Object, String}
import javax.xml.transform.Result
import org.xml.sax.ContentHandler
import org.xml.sax.ext.LexicalHandler

// Acts as an holder for a transformation Result.
class SAXResult extends Object with Result {

    @stub
    // Zero-argument default constructor.
    def this() = ???

    @stub
    // Get the ContentHandler that is the Result.
    def getHandler(): ContentHandler = ???

    @stub
    // Get a SAX2 LexicalHandler for the output.
    def getLexicalHandler(): LexicalHandler = ???

    @stub
    // Get the system identifier that was set with setSystemId.
    def getSystemId(): String = ???

    @stub
    // Set the target to be a SAX2 ContentHandler.
    def setHandler(handler: ContentHandler): Unit = ???

    @stub
    // Set the SAX2 LexicalHandler for the output.
    def setLexicalHandler(handler: LexicalHandler): Unit = ???
}
