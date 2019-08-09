package javax.imageio.stream

import java.lang.Object

// An implementation of ImageOutputStream that writes its
// output to a regular OutputStream.  A file is used to
// cache data until it is flushed to the output stream.
class FileCacheImageOutputStream extends ImageOutputStreamImpl {

    @stub
    // Closes this FileCacheImageOutputStream.
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
    // Returns true since this
    // ImageOutputStream maintains a file cache.
    def isCachedFile(): Boolean = ???

    @stub
    // Returns false since this
    // ImageOutputStream does not maintain a main memory
    // cache.
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
    // Sets the current stream position and resets the bit offset to
    // 0.
    def seek(pos: Long): Unit = ???

    @stub
    // Writes a sequence of bytes to the stream at the current
    // position.
    def write(b: Array[Byte], off: Int, len: Int): Unit = ???
}
