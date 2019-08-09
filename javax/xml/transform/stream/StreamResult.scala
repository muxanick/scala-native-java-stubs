package javax.xml.transform.stream

import java.io.{File, OutputStream, Writer}
import java.lang.{Object, String}
import javax.xml.transform.Result

// Acts as an holder for a transformation result,
// which may be XML, plain Text, HTML, or some other form of markup.
class StreamResult extends Object with Result {

    @stub
    // Zero-argument default constructor.
    def this() = ???

    @stub
    // Construct a StreamResult from a File.
    def this(f: File) = ???

    @stub
    // Construct a StreamResult from a byte stream.
    def this(outputStream: OutputStream) = ???

    @stub
    // Construct a StreamResult from a URL.
    def this(systemId: String) = ???

    @stub
    // Get the byte stream that was set with setOutputStream.
    def getOutputStream(): OutputStream = ???

    @stub
    // Get the system identifier that was set with setSystemId.
    def getSystemId(): String = ???

    @stub
    // Get the character stream that was set with setWriter.
    def getWriter(): Writer = ???

    @stub
    // Set the ByteStream that is to be written to.
    def setOutputStream(outputStream: OutputStream): Unit = ???

    @stub
    // Set the system ID from a File reference.
    def setSystemId(f: File): Unit = ???

    @stub
    // Set the systemID that may be used in association
    // with the byte or character stream, or, if neither is set, use
    // this value as a writeable URI (probably a file name).
    def setSystemId(systemId: String): Unit = ???
}
