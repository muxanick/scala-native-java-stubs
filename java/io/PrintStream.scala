package java.io

import java.lang.{Appendable, CharSequence, Object, String}
import java.util.Locale
import scala.scalanative.annotation.stub

/** A PrintStream adds functionality to another output stream,
 *  namely the ability to print representations of various data values
 *  conveniently.  Two other features are provided as well.  Unlike other output
 *  streams, a PrintStream never throws an
 *  IOException; instead, exceptional situations merely set an
 *  internal flag that can be tested via the checkError method.
 *  Optionally, a PrintStream can be created so as to flush
 *  automatically; this means that the flush method is
 *  automatically invoked after a byte array is written, one of the
 *  println methods is invoked, or a newline character or byte
 *  ('\n') is written.
 * 
 *   All characters printed by a PrintStream are converted into
 *  bytes using the platform's default character encoding.  The PrintWriter class should be used in situations that require writing
 *  characters rather than bytes.
 */
class PrintStream extends FilterOutputStream with Appendable with Closeable {

    /** Creates a new print stream, without automatic line flushing, with the
     *  specified file.
     */
    @stub
    def this(file: File) = ???

    /** Creates a new print stream, without automatic line flushing, with the
     *  specified file and charset.
     */
    @stub
    def this(file: File, csn: String) = ???

    /** Creates a new print stream. */
    @stub
    def this(out: OutputStream) = ???

    /** Creates a new print stream. */
    @stub
    def this(out: OutputStream, autoFlush: Boolean) = ???

    /** Creates a new print stream. */
    @stub
    def this(out: OutputStream, autoFlush: Boolean, encoding: String) = ???

    /** Creates a new print stream, without automatic line flushing, with the
     *  specified file name.
     */
    @stub
    def this(fileName: String) = ???

    /** Creates a new print stream, without automatic line flushing, with the
     *  specified file name and charset.
     */
    @stub
    def this(fileName: String, csn: String) = ???

    /** Appends the specified character to this output stream. */
    @stub
    def append(c: Char): PrintStream = ???

    /** Appends the specified character sequence to this output stream. */
    @stub
    def append(csq: CharSequence): PrintStream = ???

    /** Appends a subsequence of the specified character sequence to this output
     *  stream.
     */
    @stub
    def append(csq: CharSequence, start: Int, end: Int): PrintStream = ???

    /** Flushes the stream and checks its error state. */
    @stub
    def checkError(): Boolean = ???

    /** Clears the internal error state of this stream. */
    @stub
    protected def clearError(): Unit = ???

    /** Closes the stream. */
    @stub
    def close(): Unit = ???

    /** Flushes the stream. */
    @stub
    def flush(): Unit = ???

    /** Writes a formatted string to this output stream using the specified
     *  format string and arguments.
     */
    @stub
    def format(l: Locale, format: String, args: Object*): PrintStream = ???

    /** Writes a formatted string to this output stream using the specified
     *  format string and arguments.
     */
    @stub
    def format(format: String, args: Object*): PrintStream = ???

    /** Prints a boolean value. */
    @stub
    def print(b: Boolean): Unit = ???

    /** Prints a character. */
    @stub
    def print(c: Char): Unit = ???

    /** Prints an array of characters. */
    @stub
    def print(s: Array[Char]): Unit = ???

    /** Prints a double-precision floating-point number. */
    @stub
    def print(d: Double): Unit = ???

    /** Prints a floating-point number. */
    @stub
    def print(f: Float): Unit = ???

    /** Prints an integer. */
    @stub
    def print(i: Int): Unit = ???

    /** Prints a long integer. */
    @stub
    def print(l: Long): Unit = ???

    /** Prints an object. */
    @stub
    def print(obj: Object): Unit = ???

    /** Prints a string. */
    @stub
    def print(s: String): Unit = ???

    /** A convenience method to write a formatted string to this output stream
     *  using the specified format string and arguments.
     */
    @stub
    def printf(l: Locale, format: String, args: Object*): PrintStream = ???

    /** A convenience method to write a formatted string to this output stream
     *  using the specified format string and arguments.
     */
    @stub
    def printf(format: String, args: Object*): PrintStream = ???

    /** Terminates the current line by writing the line separator string. */
    @stub
    def println(): Unit = ???

    /** Prints a boolean and then terminate the line. */
    @stub
    def println(x: Boolean): Unit = ???

    /** Prints a character and then terminate the line. */
    @stub
    def println(x: Char): Unit = ???

    /** Prints an array of characters and then terminate the line. */
    @stub
    def println(x: Array[Char]): Unit = ???

    /** Prints a double and then terminate the line. */
    @stub
    def println(x: Double): Unit = ???

    /** Prints a float and then terminate the line. */
    @stub
    def println(x: Float): Unit = ???

    /** Prints an integer and then terminate the line. */
    @stub
    def println(x: Int): Unit = ???

    /** Prints a long and then terminate the line. */
    @stub
    def println(x: Long): Unit = ???

    /** Prints an Object and then terminate the line. */
    @stub
    def println(x: Object): Unit = ???

    /** Prints a String and then terminate the line. */
    @stub
    def println(x: String): Unit = ???

    /** Sets the error state of the stream to true. */
    @stub
    protected def setError(): Unit = ???

    /** Writes len bytes from the specified byte array starting at
     *  offset off to this stream.
     */
    @stub
    def write(buf: Array[Byte], off: Int, len: Int): Unit = ???

    /** Writes the specified byte to this stream. */
    @stub
    def write(b: Int): Unit = ???
}
