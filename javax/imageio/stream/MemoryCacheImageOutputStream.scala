package javax.imageio.stream

import java.lang.Object

// An implementation of ImageOutputStream that writes its
// output to a regular OutputStream.  A memory buffer is
// used to cache at least the data between the discard position and
// the current write position.  The only constructor takes an
// OutputStream, so this class may not be used for
// read/modify/write operations.  Reading can occur only on parts of
// the stream that have already been written to the cache and not
// yet flushed.
class MemoryCacheImageOutputStream extends ImageOutputStreamImpl {

    @stub
    // Closes this MemoryCacheImageOutputStream.
    def close(): Unit = ???

    @stub
    // Discards the initial portion of the stream prior to the
    // indicated position.
    def flushBefore(pos: Long): Unit = ???

    @stub
    // Returns true since this
    // ImageOutputStream caches data in order to allow
    // seeking backwards.
    def isCached(): Boolean = ???

    @stub
    // Returns false since this
    // ImageOutputStream does not maintain a file cache.
    def isCachedFile(): Boolean = ???

    @stub
    // Returns true since this
    // ImageOutputStream maintains a main memory cache.
    def isCachedMemory(): Boolean = ???

    @stub
    // Returns -1L to indicate that the stream has unknown
    // length.
    def length(): Long = ???

    @stub
    // Reads a single byte from the stream and returns it as an
    // int between 0 and 255.
    def read(): Int = ???

    @stub
    // Reads up to len bytes from the stream, and stores
    // them into b starting at index off.
    def read(b: Array[Byte], off: Int, len: Int): Int = ???

    @stub
    // Writes a sequence of bytes to the stream at the current
    // position.
    def write(b: Array[Byte], off: Int, len: Int): Unit = ???
}
