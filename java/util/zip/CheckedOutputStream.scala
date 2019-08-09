package java.util.zip

import java.io.{FilterOutputStream, OutputStream}
import java.lang.Object
import scala.scalanative.annotation.stub

/** An output stream that also maintains a checksum of the data being
 *  written. The checksum can then be used to verify the integrity of
 *  the output data.
 */
class CheckedOutputStream extends FilterOutputStream {

    /** Creates an output stream with the specified Checksum. */
    @stub
    def this(out: OutputStream, cksum: Checksum) = ???

    /** Returns the Checksum for this output stream. */
    @stub
    def getChecksum(): Checksum = ???

    /** Writes an array of bytes. */
    @stub
    def write(b: Array[Byte], off: Int, len: Int): Unit = ???

    /** Writes a byte. */
    @stub
    def write(b: Int): Unit = ???
}
