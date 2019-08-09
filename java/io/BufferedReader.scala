package java.io

import java.lang.{Object, String}
import java.util.stream.Stream

/** Reads text from a character-input stream, buffering characters so as to
 *  provide for the efficient reading of characters, arrays, and lines.
 * 
 *   The buffer size may be specified, or the default size may be used.  The
 *  default is large enough for most purposes.
 * 
 *   In general, each read request made of a Reader causes a corresponding
 *  read request to be made of the underlying character or byte stream.  It is
 *  therefore advisable to wrap a BufferedReader around any Reader whose read()
 *  operations may be costly, such as FileReaders and InputStreamReaders.  For
 *  example,
 * 
 *  
 *  BufferedReader in
 *    = new BufferedReader(new FileReader("foo.in"));
 *  
 * 
 *  will buffer the input from the specified file.  Without buffering, each
 *  invocation of read() or readLine() could cause bytes to be read from the
 *  file, converted into characters, and then returned, which can be very
 *  inefficient.
 * 
 *   Programs that use DataInputStreams for textual input can be localized by
 *  replacing each DataInputStream with an appropriate BufferedReader.
 */
class BufferedReader extends Reader {

    /** Creates a buffering character-input stream that uses a default-sized
     *  input buffer.
     */
    @stub
    def this(in: Reader) = ???

    /** Closes the stream and releases any system resources associated with
     *  it.
     */
    @stub
    def close(): Unit = ???

    /** Returns a Stream, the elements of which are lines read from
     *  this BufferedReader.
     */
    @stub
    def lines(): Stream[String] = ???

    /** Marks the present position in the stream. */
    @stub
    def mark(readAheadLimit: Int): Unit = ???

    /** Tells whether this stream supports the mark() operation, which it does. */
    @stub
    def markSupported(): Boolean = ???

    /** Reads a single character. */
    @stub
    def read(): Int = ???

    /** Reads characters into a portion of an array. */
    @stub
    def read(cbuf: Array[Char], off: Int, len: Int): Int = ???

    /** Reads a line of text. */
    @stub
    def readLine(): String = ???

    /** Tells whether this stream is ready to be read. */
    @stub
    def ready(): Boolean = ???

    /** Resets the stream to the most recent mark. */
    @stub
    def reset(): Unit = ???
}
