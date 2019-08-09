package javax.imageio.stream

import java.io.OutputStream
import java.lang.Object
import scala.scalanative.annotation.stub

/** An implementation of ImageOutputStream that writes its
 *  output to a regular OutputStream.  A memory buffer is
 *  used to cache at least the data between the discard position and
 *  the current write position.  The only constructor takes an
 *  OutputStream, so this class may not be used for
 *  read/modify/write operations.  Reading can occur only on parts of
 *  the stream that have already been written to the cache and not
 *  yet flushed.
 */
class MemoryCacheImageOutputStream extends ImageOutputStreamImpl {

    /** Constructs a MemoryCacheImageOutputStream that will write
     *  to a given OutputStream.
     */
    @stub
    def this(stream: OutputStream) = ???

    /** Closes this MemoryCacheImageOutputStream. */
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

    /** Returns false since this
     *  ImageOutputStream does not maintain a file cache.
     */
    @stub
    def isCachedFile(): Boolean = ???

    /** Returns true since this
     *  ImageOutputStream maintains a main memory cache.
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

    /** Writes a sequence of bytes to the stream at the current
     *  position.
     */
    @stub
    def write(b: Array[Byte], off: Int, len: Int): Unit = ???

    /** Writes a single byte to the stream at the current position. */
    @stub
    def write(b: Int): Unit = ???
}
