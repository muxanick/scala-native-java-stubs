package java.io

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** Writes text to a character-output stream, buffering characters so as to
 *  provide for the efficient writing of single characters, arrays, and strings.
 * 
 *   The buffer size may be specified, or the default size may be accepted.
 *  The default is large enough for most purposes.
 * 
 *   A newLine() method is provided, which uses the platform's own notion of
 *  line separator as defined by the system property line.separator.
 *  Not all platforms use the newline character ('\n') to terminate lines.
 *  Calling this method to terminate each output line is therefore preferred to
 *  writing a newline character directly.
 * 
 *   In general, a Writer sends its output immediately to the underlying
 *  character or byte stream.  Unless prompt output is required, it is advisable
 *  to wrap a BufferedWriter around any Writer whose write() operations may be
 *  costly, such as FileWriters and OutputStreamWriters.  For example,
 * 
 *  
 *  PrintWriter out
 *    = new PrintWriter(new BufferedWriter(new FileWriter("foo.out")));
 *  
 * 
 *  will buffer the PrintWriter's output to the file.  Without buffering, each
 *  invocation of a print() method would cause characters to be converted into
 *  bytes that would then be written immediately to the file, which can be very
 *  inefficient.
 */
class BufferedWriter extends Writer {

    /** Creates a buffered character-output stream that uses a default-sized
     *  output buffer.
     */
    @stub
    def this(out: Writer) = ???

    /** Creates a new buffered character-output stream that uses an output
     *  buffer of the given size.
     */
    @stub
    def this(out: Writer, sz: Int) = ???

    /** Closes the stream, flushing it first. */
    @stub
    def close(): Unit = ???

    /** Flushes the stream. */
    @stub
    def flush(): Unit = ???

    /** Writes a line separator. */
    @stub
    def newLine(): Unit = ???

    /** Writes a portion of an array of characters. */
    @stub
    def write(cbuf: Array[Char], off: Int, len: Int): Unit = ???

    /** Writes a single character. */
    @stub
    def write(c: Int): Unit = ???

    /** Writes a portion of a String. */
    @stub
    def write(s: String, off: Int, len: Int): Unit = ???
}
