package javax.imageio.stream

import java.lang.Object

/** An implementation of ImageInputStream that gets its
 *  input from a regular InputStream.  A memory buffer is
 *  used to cache at least the data between the discard position and
 *  the current read position.
 * 
 *   In general, it is preferable to use a
 *  FileCacheImageInputStream when reading from a regular
 *  InputStream.  This class is provided for cases where
 *  it is not possible to create a writable temporary file.
 */
class MemoryCacheImageInputStream extends ImageInputStreamImpl {

    /** Closes this MemoryCacheImageInputStream, freeing
     *  the cache.
     */
    @stub
    def close(): Unit = ???

    /** Finalizes this object prior to garbage collection. */
    @stub
    protected def finalize(): Unit = ???

    /** Discards the initial portion of the stream prior to the
     *  indicated position.
     */
    @stub
    def flushBefore(pos: Long): Unit = ???

    /** Returns true since this
     *  ImageInputStream caches data in order to allow
     *  seeking backwards.
     */
    @stub
    def isCached(): Boolean = ???

    /** Returns false since this
     *  ImageInputStream does not maintain a file cache.
     */
    @stub
    def isCachedFile(): Boolean = ???

    /** Returns true since this
     *  ImageInputStream maintains a main memory cache.
     */
    @stub
    def isCachedMemory(): Boolean = ???

    /** Reads a single byte from the stream and returns it as an
     *  int between 0 and 255.
     */
    @stub
    def read(): Int = ???
}
