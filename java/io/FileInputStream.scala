package java.io

import java.lang.Object
import java.nio.channels.FileChannel

/** A FileInputStream obtains input bytes
 *  from a file in a file system. What files
 *  are  available depends on the host environment.
 * 
 *  FileInputStream is meant for reading streams of raw bytes
 *  such as image data. For reading streams of characters, consider using
 *  FileReader.
 */
class FileInputStream extends InputStream {

    /** Creates a FileInputStream by
     *  opening a connection to an actual file,
     *  the file named by the File
     *  object file in the file system.
     */
    @stub
    def this(file: File) = ???

    /** Creates a FileInputStream by using the file descriptor
     *  fdObj, which represents an existing connection to an
     *  actual file in the file system.
     */
    @stub
    def this(fdObj: FileDescriptor) = ???

    /** Returns an estimate of the number of remaining bytes that can be read (or
     *  skipped over) from this input stream without blocking by the next
     *  invocation of a method for this input stream.
     */
    @stub
    def available(): Int = ???

    /** Closes this file input stream and releases any system resources
     *  associated with the stream.
     */
    @stub
    def close(): Unit = ???

    /** Ensures that the close method of this file input stream is
     *  called when there are no more references to it.
     */
    @stub
    protected def finalize(): Unit = ???

    /** Returns the unique FileChannel
     *  object associated with this file input stream.
     */
    @stub
    def getChannel(): FileChannel = ???

    /** Returns the FileDescriptor
     *  object  that represents the connection to
     *  the actual file in the file system being
     *  used by this FileInputStream.
     */
    @stub
    def getFD(): FileDescriptor = ???

    /** Reads a byte of data from this input stream. */
    @stub
    def read(): Int = ???

    /** Reads up to b.length bytes of data from this input
     *  stream into an array of bytes.
     */
    @stub
    def read(b: Array[Byte]): Int = ???

    /** Reads up to len bytes of data from this input stream
     *  into an array of bytes.
     */
    @stub
    def read(b: Array[Byte], off: Int, len: Int): Int = ???
}
