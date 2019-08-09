package java.io

import java.lang.{Appendable, CharSequence, Object, String}
import java.util.Locale

// A PrintStream adds functionality to another output stream,
// namely the ability to print representations of various data values
// conveniently.  Two other features are provided as well.  Unlike other output
// streams, a PrintStream never throws an
// IOException; instead, exceptional situations merely set an
// internal flag that can be tested via the checkError method.
// Optionally, a PrintStream can be created so as to flush
// automatically; this means that the flush method is
// automatically invoked after a byte array is written, one of the
// println methods is invoked, or a newline character or byte
// ('\n') is written.
//
//  All characters printed by a PrintStream are converted into
// bytes using the platform's default character encoding.  The PrintWriter class should be used in situations that require writing
// characters rather than bytes.
class PrintStream extends FilterOutputStream with Appendable, with Closeable {

    @stub
    // Creates a new print stream, without automatic line flushing, with the
    // specified file.
    def this(file: File) = ???

    @stub
    // Creates a new print stream, without automatic line flushing, with the
    // specified file and charset.
    def this(file: File, csn: String) = ???

    @stub
    // Creates a new print stream.
    def this(out: OutputStream) = ???

    @stub
    // Creates a new print stream.
    def this(out: OutputStream, autoFlush: Boolean) = ???

    @stub
    // Creates a new print stream.
    def this(out: OutputStream, autoFlush: Boolean, encoding: String) = ???

    @stub
    // Creates a new print stream, without automatic line flushing, with the
    // specified file name.
    def this(fileName: String) = ???

    @stub
    // Appends the specified character to this output stream.
    def append(c: Char): PrintStream = ???

    @stub
    // Appends the specified character sequence to this output stream.
    def append(csq: CharSequence): PrintStream = ???

    @stub
    // Appends a subsequence of the specified character sequence to this output
    // stream.
    def append(csq: CharSequence, start: Int, end: Int): PrintStream = ???

    @stub
    // Flushes the stream and checks its error state.
    def checkError(): Boolean = ???

    @stub
    // Clears the internal error state of this stream.
    protected def clearError(): Unit = ???

    @stub
    // Closes the stream.
    def close(): Unit = ???

    @stub
    // Flushes the stream.
    def flush(): Unit = ???

    @stub
    // Writes a formatted string to this output stream using the specified
    // format string and arguments.
    def format(l: Locale, format: String, args: Object*): PrintStream = ???

    @stub
    // Writes a formatted string to this output stream using the specified
    // format string and arguments.
    def format(format: String, args: Object*): PrintStream = ???

    @stub
    // Prints a boolean value.
    def print(b: Boolean): Unit = ???

    @stub
    // Prints a character.
    def print(c: Char): Unit = ???

    @stub
    // Prints an array of characters.
    def print(s: Array[Char]): Unit = ???

    @stub
    // Prints a double-precision floating-point number.
    def print(d: double): Unit = ???

    @stub
    // Prints a floating-point number.
    def print(f: float): Unit = ???

    @stub
    // Prints an integer.
    def print(i: Int): Unit = ???

    @stub
    // Prints a long integer.
    def print(l: Long): Unit = ???

    @stub
    // Prints an object.
    def print(obj: Object): Unit = ???

    @stub
    // Prints a string.
    def print(s: String): Unit = ???

    @stub
    // A convenience method to write a formatted string to this output stream
    // using the specified format string and arguments.
    def printf(l: Locale, format: String, args: Object*): PrintStream = ???

    @stub
    // A convenience method to write a formatted string to this output stream
    // using the specified format string and arguments.
    def printf(format: String, args: Object*): PrintStream = ???

    @stub
    // Terminates the current line by writing the line separator string.
    def println(): Unit = ???

    @stub
    // Prints a boolean and then terminate the line.
    def println(x: Boolean): Unit = ???

    @stub
    // Prints a character and then terminate the line.
    def println(x: Char): Unit = ???

    @stub
    // Prints an array of characters and then terminate the line.
    def println(x: Array[Char]): Unit = ???

    @stub
    // Prints a double and then terminate the line.
    def println(x: double): Unit = ???

    @stub
    // Prints a float and then terminate the line.
    def println(x: float): Unit = ???

    @stub
    // Prints an integer and then terminate the line.
    def println(x: Int): Unit = ???

    @stub
    // Prints a long and then terminate the line.
    def println(x: Long): Unit = ???

    @stub
    // Prints an Object and then terminate the line.
    def println(x: Object): Unit = ???

    @stub
    // Prints a String and then terminate the line.
    def println(x: String): Unit = ???

    @stub
    // Sets the error state of the stream to true.
    protected def setError(): Unit = ???

    @stub
    // Writes len bytes from the specified byte array starting at
    // offset off to this stream.
    def write(buf: Array[Byte], off: Int, len: Int): Unit = ???
}
