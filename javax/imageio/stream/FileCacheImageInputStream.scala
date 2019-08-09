package javax.imageio.stream

import java.lang.Object

// An implementation of ImageInputStream that gets its
// input from a regular InputStream.  A file is used to
// cache previously read data.
class FileCacheImageInputStream extends ImageInputStreamImpl {

    @stub
    // Closes this FileCacheImageInputStream, closing
    // and removing the cache file.
    def close(): Unit = ???

    @stub
    // Finalizes this object prior to garbage collection.
    protected def finalize(): Unit = ???

    @stub
    // Returns true since this
    // ImageInputStream caches data in order to allow
    // seeking backwards.
    def isCached(): Boolean = ???

    @stub
    // Returns true since this
    // ImageInputStream maintains a file cache.
    def isCachedFile(): Boolean = ???

    @stub
    // Returns false since this
    // ImageInputStream does not maintain a main memory
    // cache.
    def isCachedMemory(): Boolean = ???

    @stub
    // Reads a single byte from the stream and returns it as an
    // int between 0 and 255.
    def read(): Int = ???
}
