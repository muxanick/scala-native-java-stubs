package javax.imageio.stream

import java.io.File
import java.lang.Object

// An implementation of ImageInputStream that gets its
// input from a File or RandomAccessFile.
// The file contents are assumed to be stable during the lifetime of
// the object.
class FileImageInputStream extends ImageInputStreamImpl {

    @stub
    // Constructs a FileImageInputStream that will read
    // from a given File.
    def this(f: File) = ???

    @stub
    // Closes the stream.
    def close(): Unit = ???

    @stub
    // Finalizes this object prior to garbage collection.
    protected def finalize(): Unit = ???

    @stub
    // Returns the length of the underlying file, or -1
    // if it is unknown.
    def length(): Long = ???

    @stub
    // Reads a single byte from the stream and returns it as an
    // int between 0 and 255.
    def read(): Int = ???

    @stub
    // Reads up to len bytes from the stream, and stores
    // them into b starting at index off.
    def read(b: Array[Byte], off: Int, len: Int): Int = ???
}
