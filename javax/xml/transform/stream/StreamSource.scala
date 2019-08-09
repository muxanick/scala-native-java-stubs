package javax.xml.transform.stream

import java.io.{File, InputStream, Reader}
import java.lang.{Object, String}
import javax.xml.transform.Source

/** Acts as an holder for a transformation Source in the form
 *  of a stream of XML markup.
 * 
 *  Note: Due to their internal use of either a Reader or InputStream instance,
 *  StreamSource instances may only be used once.
 */
class StreamSource extends Object with Source {

    /** Zero-argument default constructor. */
    @stub
    def this() = ???

    /** Construct a StreamSource from a File. */
    @stub
    def this(f: File) = ???

    /** Construct a StreamSource from a byte stream. */
    @stub
    def this(inputStream: InputStream) = ???

    /** Construct a StreamSource from a byte stream. */
    @stub
    def this(inputStream: InputStream, systemId: String) = ???

    /** Construct a StreamSource from a character reader. */
    @stub
    def this(reader: Reader) = ???

    /** Construct a StreamSource from a character reader. */
    @stub
    def this(reader: Reader, systemId: String) = ???

    /** Get the byte stream that was set with setByteStream. */
    @stub
    def getInputStream(): InputStream = ???

    /** Get the public identifier that was set with setPublicId. */
    @stub
    def getPublicId(): String = ???

    /** Get the character stream that was set with setReader. */
    @stub
    def getReader(): Reader = ???

    /** Get the system identifier that was set with setSystemId. */
    @stub
    def getSystemId(): String = ???

    /** Set the byte stream to be used as input. */
    @stub
    def setInputStream(inputStream: InputStream): Unit = ???

    /** Set the public identifier for this Source. */
    @stub
    def setPublicId(publicId: String): Unit = ???

    /** Set the input to be a character reader. */
    @stub
    def setReader(reader: Reader): Unit = ???

    /** Set the system ID from a File reference. */
    @stub
    def setSystemId(f: File): Unit = ???
}
