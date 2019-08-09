package java.util.zip

import java.io.{FilterOutputStream, OutputStream}
import java.lang.Object

// An output stream that also maintains a checksum of the data being
// written. The checksum can then be used to verify the integrity of
// the output data.
class CheckedOutputStream extends FilterOutputStream {

    @stub
    // Returns the Checksum for this output stream.
    def getChecksum(): Checksum = ???

    @stub
    // Writes an array of bytes.
    def write(b: Array[Byte], off: Int, len: Int): Unit = ???
}
