package javax.imageio.stream

import java.io.{File, RandomAccessFile}
import java.lang.Object
import scala.scalanative.annotation.stub

/** An implementation of ImageOutputStream that writes its
 *  output directly to a File or
 *  RandomAccessFile.
 */
class FileImageOutputStream extends ImageOutputStreamImpl {

    /** Constructs a FileImageOutputStream that will write
     *  to a given File.
     */
    @stub
    def this(f: File) = ???

    /** Constructs a FileImageOutputStream that will write
     *  to a given RandomAccessFile.
     */
    @stub
    def this(raf: RandomAccessFile) = ???

    /** Closes the stream. */
    @stub
    def close(): Unit = ???

    /** Finalizes this object prior to garbage collection. */
    @stub
    protected def finalize(): Unit = ???

    /** Returns -1L to indicate that the stream has unknown
     *  length.
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

    /** Sets the current stream position and resets the bit offset to
     *  0.
     */
    @stub
    def seek(pos: Long): Unit = ???

    /** Writes a sequence of bytes to the stream at the current
     *  position.
     */
    @stub
    def write(b: Array[Byte], off: Int, len: Int): Unit = ???

    /** Writes a single byte to the stream at the current position. */
    @stub
    def write(b: Int): Unit = ???
}
