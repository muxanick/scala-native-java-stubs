package java.util.zip

import java.io.{FilterInputStream, InputStream}
import java.lang.Object

// An input stream that also maintains a checksum of the data being read.
// The checksum can then be used to verify the integrity of the input data.
class CheckedInputStream extends FilterInputStream {

    @stub
    // Returns the Checksum for this input stream.
    def getChecksum(): Checksum = ???

    @stub
    // Reads a byte.
    def read(): Int = ???

    @stub
    // Reads into an array of bytes.
    def read(buf: Array[Byte], off: Int, len: Int): Int = ???
}
