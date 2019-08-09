package javax.imageio.stream

import java.io.{File, OutputStream}
import java.lang.Object
import scala.scalanative.annotation.stub

/** An implementation of ImageOutputStream that writes its
 *  output to a regular OutputStream.  A file is used to
 *  cache data until it is flushed to the output stream.
 */
class FileCacheImageOutputStream extends ImageOutputStreamImpl {

    /** Constructs a FileCacheImageOutputStream that will write
     *  to a given outputStream.
     */
    @stub
    def this(stream: OutputStream, cacheDir: File) = ???

    /** Closes this FileCacheImageOutputStream. */
    @stub
    def close(): Unit = ???

    /** Discards the initial portion of the stream prior to the
     *  indicated position.
     */
    @stub
    def flushBefore(pos: Long): Unit = ???

    /** Returns true since this
     *  ImageOutputStream caches data in order to allow
     *  seeking backwards.
     */
    @stub
    def isCached(): Boolean = ???

    /** Returns true since this
     *  ImageOutputStream maintains a file cache.
     */
    @stub
    def isCachedFile(): Boolean = ???

    /** Returns false since this
     *  ImageOutputStream does not maintain a main memory
     *  cache.
     */
    @stub
    def isCachedMemory(): Boolean = ???

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
