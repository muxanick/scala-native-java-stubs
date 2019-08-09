package javax.xml.transform.sax

import java.lang.{Object, String}
import javax.xml.transform.Result
import scala.scalanative.annotation.stub

/** Acts as an holder for a transformation Result. */
class SAXResult extends Object with Result {

    /** Zero-argument default constructor. */
    @stub
    def this() = ???

    /** Create a SAXResult that targets a SAX2 ContentHandler. */
    @stub
    def this(handler: ContentHandler) = ???

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

    /** Method setSystemId Set the systemID that may be used in association
     *  with the ContentHandler.
     */
    @stub
    def setSystemId(systemId: String): Unit = ???
}

object SAXResult {
    /** If TransformerFactory.getFeature(java.lang.String)
     *  returns true when passed this value as an argument,
     *  the Transformer supports Result output of this type.
     */
    @stub
    val FEATURE: String = ???
}
