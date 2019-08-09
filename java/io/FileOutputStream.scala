package java.io

import java.lang.{Object, String}
import java.nio.channels.FileChannel
import scala.scalanative.annotation.stub

/** A file output stream is an output stream for writing data to a
 *  File or to a FileDescriptor. Whether or not
 *  a file is available or may be created depends upon the underlying
 *  platform.  Some platforms, in particular, allow a file to be opened
 *  for writing by only one FileOutputStream (or other
 *  file-writing object) at a time.  In such situations the constructors in
 *  this class will fail if the file involved is already open.
 * 
 *  FileOutputStream is meant for writing streams of raw bytes
 *  such as image data. For writing streams of characters, consider using
 *  FileWriter.
 */
class FileOutputStream extends OutputStream {

    /** Creates a file output stream to write to the file represented by
     *  the specified File object.
     */
    @stub
    def this(file: File) = ???

    /** Creates a file output stream to write to the file represented by
     *  the specified File object.
     */
    @stub
    def this(file: File, append: Boolean) = ???

    /** Creates a file output stream to write to the specified file
     *  descriptor, which represents an existing connection to an actual
     *  file in the file system.
     */
    @stub
    def this(fdObj: FileDescriptor) = ???

    /** Creates a file output stream to write to the file with the
     *  specified name.
     */
    @stub
    def this(name: String) = ???

    /** Creates a file output stream to write to the file with the specified
     *  name.
     */
    @stub
    def this(name: String, append: Boolean) = ???

    /** Closes this file output stream and releases any system resources
     *  associated with this stream.
     */
    @stub
    def close(): Unit = ???

    /** Cleans up the connection to the file, and ensures that the
     *  close method of this file output stream is
     *  called when there are no more references to this stream.
     */
    @stub
    protected def finalize(): Unit = ???

    /** Returns the unique FileChannel
     *  object associated with this file output stream.
     */
    @stub
    def getChannel(): FileChannel = ???

    /** Returns the file descriptor associated with this stream. */
    @stub
    def getFD(): FileDescriptor = ???

    /** Writes b.length bytes from the specified byte array
     *  to this file output stream.
     */
    @stub
    def write(b: Array[Byte]): Unit = ???

    /** Writes len bytes from the specified byte array
     *  starting at offset off to this file output stream.
     */
    @stub
    def write(b: Array[Byte], off: Int, len: Int): Unit = ???

    /** Writes the specified byte to this file output stream. */
    @stub
    def write(b: Int): Unit = ???
}
