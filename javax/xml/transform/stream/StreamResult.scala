package javax.xml.transform.stream

import java.io.{File, OutputStream, Writer}
import java.lang.{Object, String}
import javax.xml.transform.Result
import scala.scalanative.annotation.stub

/** Acts as an holder for a transformation result,
 *  which may be XML, plain Text, HTML, or some other form of markup.
 */
class StreamResult extends Object with Result {

    /** Zero-argument default constructor. */
    @stub
    def this() = ???

    /** Construct a StreamResult from a File. */
    @stub
    def this(f: File) = ???

    /** Construct a StreamResult from a byte stream. */
    @stub
    def this(outputStream: OutputStream) = ???

    /** Construct a StreamResult from a URL. */
    @stub
    def this(systemId: String) = ???

    /** Construct a StreamResult from a character stream. */
    @stub
    def this(writer: Writer) = ???

    /** Get the byte stream that was set with setOutputStream. */
    @stub
    def getOutputStream(): OutputStream = ???

    /** Get the system identifier that was set with setSystemId. */
    @stub
    def getSystemId(): String = ???

    /** Get the character stream that was set with setWriter. */
    @stub
    def getWriter(): Writer = ???

    /** Set the ByteStream that is to be written to. */
    @stub
    def setOutputStream(outputStream: OutputStream): Unit = ???

    /** Set the system ID from a File reference. */
    @stub
    def setSystemId(f: File): Unit = ???

    /** Set the systemID that may be used in association
     *  with the byte or character stream, or, if neither is set, use
     *  this value as a writeable URI (probably a file name).
     */
    @stub
    def setSystemId(systemId: String): Unit = ???

    /** Set the writer that is to receive the result. */
    @stub
    def setWriter(writer: Writer): Unit = ???
}

object StreamResult {
    /** If TransformerFactory.getFeature(java.lang.String)
     *  returns true when passed this value as an argument,
     *  the Transformer supports Result output of this type.
     */
    @stub
    val FEATURE: String = ???
}
