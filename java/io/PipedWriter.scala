package java.io

import java.lang.Object
import scala.scalanative.annotation.stub

/** Piped character-output streams. */
class PipedWriter extends Writer {

    /** Creates a piped writer that is not yet connected to a
     *  piped reader.
     */
    @stub
    def this() = ???

    /** Creates a piped writer connected to the specified piped
     *  reader.
     */
    @stub
    def this(snk: PipedReader) = ???

    /** Closes this piped output stream and releases any system resources
     *  associated with this stream.
     */
    @stub
    def close(): Unit = ???

    /** Connects this piped writer to a receiver. */
    @stub
    def connect(snk: PipedReader): Unit = ???

    /** Flushes this output stream and forces any buffered output characters
     *  to be written out.
     */
    @stub
    def flush(): Unit = ???

    /** Writes len characters from the specified character array
     *  starting at offset off to this piped output stream.
     */
    @stub
    def write(cbuf: Array[Char], off: Int, len: Int): Unit = ???

    /** Writes the specified char to the piped output stream. */
    @stub
    def write(c: Int): Unit = ???
}
