package javax.imageio.stream

import java.lang.Object

// An implementation of ImageInputStream that gets its
// input from a regular InputStream.  A memory buffer is
// used to cache at least the data between the discard position and
// the current read position.
//
//  In general, it is preferable to use a
// FileCacheImageInputStream when reading from a regular
// InputStream.  This class is provided for cases where
// it is not possible to create a writable temporary file.
class MemoryCacheImageInputStream extends ImageInputStreamImpl {

    @stub
    // Closes this MemoryCacheImageInputStream, freeing
    // the cache.
    def close(): Unit = ???

    @stub
    // Finalizes this object prior to garbage collection.
    protected def finalize(): Unit = ???

    @stub
    // Discards the initial portion of the stream prior to the
    // indicated position.
    def flushBefore(pos: Long): Unit = ???

    @stub
    // Returns true since this
    // ImageInputStream caches data in order to allow
    // seeking backwards.
    def isCached(): Boolean = ???

    @stub
    // Returns false since this
    // ImageInputStream does not maintain a file cache.
    def isCachedFile(): Boolean = ???

    @stub
    // Returns true since this
    // ImageInputStream maintains a main memory cache.
    def isCachedMemory(): Boolean = ???

    @stub
    // Reads a single byte from the stream and returns it as an
    // int between 0 and 255.
    def read(): Int = ???
}
