package javax.imageio.stream

import java.io.File
import java.lang.Object

// An implementation of ImageOutputStream that writes its
// output directly to a File or
// RandomAccessFile.
class FileImageOutputStream extends ImageOutputStreamImpl {

    @stub
    // Constructs a FileImageOutputStream that will write
    // to a given File.
    def this(f: File) = ???

    @stub
    // Closes the stream.
    def close(): Unit = ???

    @stub
    // Finalizes this object prior to garbage collection.
    protected def finalize(): Unit = ???

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
