package java.io

import java.lang.Object
import scala.scalanative.annotation.stub

/** Piped character-input streams. */
class PipedReader extends Reader {

    /** Creates a PipedReader so
     *  that it is not yet connected.
     */
    @stub
    def this() = ???

    /** Creates a PipedReader so that it is not yet
     *  connected and uses
     *  the specified pipe size for the pipe's buffer.
     */
    @stub
    def this(pipeSize: Int) = ???

    /** Creates a PipedReader so
     *  that it is connected to the piped writer
     *  src.
     */
    @stub
    def this(src: PipedWriter) = ???

    /** Creates a PipedReader so that it is connected
     *  to the piped writer src and uses the specified
     *  pipe size for the pipe's buffer.
     */
    @stub
    def this(src: PipedWriter, pipeSize: Int) = ???

    /** Closes this piped stream and releases any system resources
     *  associated with the stream.
     */
    @stub
    def close(): Unit = ???

    /** Causes this piped reader to be connected
     *  to the piped  writer src.
     */
    @stub
    def connect(src: PipedWriter): Unit = ???

    /** Reads the next character of data from this piped stream. */
    @stub
    def read(): Int = ???

    /** Reads up to len characters of data from this piped
     *  stream into an array of characters.
     */
    @stub
    def read(cbuf: Array[Char], off: Int, len: Int): Int = ???

    /** Tell whether this stream is ready to be read. */
    @stub
    def ready(): Boolean = ???
}
