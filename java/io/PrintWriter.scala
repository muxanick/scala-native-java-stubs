package java.io

import java.lang.{CharSequence, Object, String}
import java.util.Locale
import scala.scalanative.annotation.stub

/** Prints formatted representations of objects to a text-output stream.  This
 *  class implements all of the print methods found in PrintStream.  It does not contain methods for writing raw bytes, for which
 *  a program should use unencoded byte streams.
 * 
 *   Unlike the PrintStream class, if automatic flushing is enabled
 *  it will be done only when one of the println, printf, or
 *  format methods is invoked, rather than whenever a newline character
 *  happens to be output.  These methods use the platform's own notion of line
 *  separator rather than the newline character.
 * 
 *   Methods in this class never throw I/O exceptions, although some of its
 *  constructors may.  The client may inquire as to whether any errors have
 *  occurred by invoking checkError().
 */
class PrintWriter extends Writer {

    /** Creates a new PrintWriter, without automatic line flushing, with the
     *  specified file.
     */
    @stub
    def this(file: File) = ???

    /** Creates a new PrintWriter, without automatic line flushing, with the
     *  specified file and charset.
     */
    @stub
    def this(file: File, csn: String) = ???

    /** Creates a new PrintWriter, without automatic line flushing, from an
     *  existing OutputStream.
     */
    @stub
    def this(out: OutputStream) = ???

    /** Creates a new PrintWriter from an existing OutputStream. */
    @stub
    def this(out: OutputStream, autoFlush: Boolean) = ???

    /** Creates a new PrintWriter, without automatic line flushing, with the
     *  specified file name.
     */
    @stub
    def this(fileName: String) = ???

    /** Creates a new PrintWriter, without automatic line flushing, with the
     *  specified file name and charset.
     */
    @stub
    def this(fileName: String, csn: String) = ???

    /** Creates a new PrintWriter, without automatic line flushing. */
    @stub
    def this(out: Writer) = ???

    /** Creates a new PrintWriter. */
    @stub
    def this(out: Writer, autoFlush: Boolean) = ???

    /** The underlying character-output stream of this
     *  PrintWriter.
     */
    @stub
    protected val out: Writer = ???

    /** Appends the specified character to this writer. */
    @stub
    def append(c: Char): PrintWriter = ???

    /** Appends the specified character sequence to this writer. */
    @stub
    def append(csq: CharSequence): PrintWriter = ???

    /** Appends a subsequence of the specified character sequence to this writer. */
    @stub
    def append(csq: CharSequence, start: Int, end: Int): PrintWriter = ???

    /** Flushes the stream if it's not closed and checks its error state. */
    @stub
    def checkError(): Boolean = ???

    /** Clears the error state of this stream. */
    @stub
    protected def clearError(): Unit = ???

    /** Closes the stream and releases any system resources associated
     *  with it.
     */
    @stub
    def close(): Unit = ???

    /** Flushes the stream. */
    @stub
    def flush(): Unit = ???

    /** Writes a formatted string to this writer using the specified format
     *  string and arguments.
     */
    @stub
    def format(l: Locale, format: String, args: Object*): PrintWriter = ???

    /** Writes a formatted string to this writer using the specified format
     *  string and arguments.
     */
    @stub
    def format(format: String, args: Object*): PrintWriter = ???

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
    def print(obj: Any): Unit = ???

    /** Prints a string. */
    @stub
    def print(s: String): Unit = ???

    /** A convenience method to write a formatted string to this writer using
     *  the specified format string and arguments.
     */
    @stub
    def printf(l: Locale, format: String, args: Object*): PrintWriter = ???

    /** A convenience method to write a formatted string to this writer using
     *  the specified format string and arguments.
     */
    @stub
    def printf(format: String, args: Object*): PrintWriter = ???

    /** Terminates the current line by writing the line separator string. */
    @stub
    def println(): Unit = ???

    /** Prints a boolean value and then terminates the line. */
    @stub
    def println(x: Boolean): Unit = ???

    /** Prints a character and then terminates the line. */
    @stub
    def println(x: Char): Unit = ???

    /** Prints an array of characters and then terminates the line. */
    @stub
    def println(x: Array[Char]): Unit = ???

    /** Prints a double-precision floating-point number and then terminates the
     *  line.
     */
    @stub
    def println(x: Double): Unit = ???

    /** Prints a floating-point number and then terminates the line. */
    @stub
    def println(x: Float): Unit = ???

    /** Prints an integer and then terminates the line. */
    @stub
    def println(x: Int): Unit = ???

    /** Prints a long integer and then terminates the line. */
    @stub
    def println(x: Long): Unit = ???

    /** Prints an Object and then terminates the line. */
    @stub
    def println(x: Any): Unit = ???

    /** Prints a String and then terminates the line. */
    @stub
    def println(x: String): Unit = ???

    /** Indicates that an error has occurred. */
    @stub
    protected def setError(): Unit = ???

    /** Writes an array of characters. */
    @stub
    def write(buf: Array[Char]): Unit = ???

    /** Writes A Portion of an array of characters. */
    @stub
    def write(buf: Array[Char], off: Int, len: Int): Unit = ???

    /** Writes a single character. */
    @stub
    def write(c: Int): Unit = ???

    /** Writes a string. */
    @stub
    def write(s: String): Unit = ???

    /** Writes a portion of a string. */
    @stub
    def write(s: String, off: Int, len: Int): Unit = ???
}
