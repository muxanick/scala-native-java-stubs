package java.util.zip

import java.io.{FilterInputStream, InputStream}
import java.lang.Object

/** An input stream that also maintains a checksum of the data being read.
 *  The checksum can then be used to verify the integrity of the input data.
 */
class CheckedInputStream extends FilterInputStream {

    /** Returns the Checksum for this input stream. */
    @stub
    def getChecksum(): Checksum = ???

    /** Reads a byte. */
    @stub
    def read(): Int = ???

    /** Reads into an array of bytes. */
    @stub
    def read(buf: Array[Byte], off: Int, len: Int): Int = ???
}
