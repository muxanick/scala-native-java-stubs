package javax.imageio.stream

import java.io.{File, InputStream}
import java.lang.Object
import scala.scalanative.annotation.stub

/** An implementation of ImageInputStream that gets its
 *  input from a regular InputStream.  A file is used to
 *  cache previously read data.
 */
class FileCacheImageInputStream extends ImageInputStreamImpl {

    /** Constructs a FileCacheImageInputStream that will read
     *  from a given InputStream.
     */
    @stub
    def this(stream: InputStream, cacheDir: File) = ???

    /** Closes this FileCacheImageInputStream, closing
     *  and removing the cache file.
     */
    @stub
    def close(): Unit = ???

    /** Finalizes this object prior to garbage collection. */
    @stub
    protected def finalize(): Unit = ???

    /** Returns true since this
     *  ImageInputStream caches data in order to allow
     *  seeking backwards.
     */
    @stub
    def isCached(): Boolean = ???

    /** Returns true since this
     *  ImageInputStream maintains a file cache.
     */
    @stub
    def isCachedFile(): Boolean = ???

    /** Returns false since this
     *  ImageInputStream does not maintain a main memory
     *  cache.
     */
    @stub
    def isCachedMemory(): Boolean = ???

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
