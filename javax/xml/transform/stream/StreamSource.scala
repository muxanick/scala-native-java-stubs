package javax.xml.transform.stream

import java.io.{File, InputStream, Reader}
import java.lang.{Object, String}
import javax.xml.transform.Source

// Acts as an holder for a transformation Source in the form
// of a stream of XML markup.
//
// Note: Due to their internal use of either a Reader or InputStream instance,
// StreamSource instances may only be used once.
class StreamSource extends Object with Source {

    @stub
    // Zero-argument default constructor.
    def this() = ???

    @stub
    // Construct a StreamSource from a File.
    def this(f: File) = ???

    @stub
    // Construct a StreamSource from a byte stream.
    def this(inputStream: InputStream) = ???

    @stub
    // Construct a StreamSource from a byte stream.
    def this(inputStream: InputStream, systemId: String) = ???

    @stub
    // Construct a StreamSource from a character reader.
    def this(reader: Reader) = ???

    @stub
    // Construct a StreamSource from a character reader.
    def this(reader: Reader, systemId: String) = ???

    @stub
    // Get the byte stream that was set with setByteStream.
    def getInputStream(): InputStream = ???

    @stub
    // Get the public identifier that was set with setPublicId.
    def getPublicId(): String = ???

    @stub
    // Get the character stream that was set with setReader.
    def getReader(): Reader = ???

    @stub
    // Get the system identifier that was set with setSystemId.
    def getSystemId(): String = ???

    @stub
    // Set the byte stream to be used as input.
    def setInputStream(inputStream: InputStream): Unit = ???

    @stub
    // Set the public identifier for this Source.
    def setPublicId(publicId: String): Unit = ???

    @stub
    // Set the input to be a character reader.
    def setReader(reader: Reader): Unit = ???

    @stub
    // Set the system ID from a File reference.
    def setSystemId(f: File): Unit = ???
}
