package javax.imageio.stream

import java.io.File
import java.lang.Object

/** An implementation of ImageInputStream that gets its
 *  input from a File or RandomAccessFile.
 *  The file contents are assumed to be stable during the lifetime of
 *  the object.
 */
class FileImageInputStream extends ImageInputStreamImpl {

    /** Constructs a FileImageInputStream that will read
     *  from a given File.
     */
    @stub
    def this(f: File) = ???

    /** Closes the stream. */
    @stub
    def close(): Unit = ???

    /** Finalizes this object prior to garbage collection. */
    @stub
    protected def finalize(): Unit = ???

    /** Returns the length of the underlying file, or -1
     *  if it is unknown.
     */
    @stub
    def length(): Long = ???

    /** Reads a single byte from the stream and returns it as an
     *  int between 0 and 255.
     */
    @stub
    def read(): Int = ???

    /** Reads up to len bytes from the stream, and stores
     *  them into b starting at index off.
     */
    @stub
    def read(b: Array[Byte], off: Int, len: Int): Int = ???
}
