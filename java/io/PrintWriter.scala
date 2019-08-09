package java.io

import java.lang.{CharSequence, Object, String}
import java.util.Locale

// Prints formatted representations of objects to a text-output stream.  This
// class implements all of the print methods found in PrintStream.  It does not contain methods for writing raw bytes, for which
// a program should use unencoded byte streams.
//
//  Unlike the PrintStream class, if automatic flushing is enabled
// it will be done only when one of the println, printf, or
// format methods is invoked, rather than whenever a newline character
// happens to be output.  These methods use the platform's own notion of line
// separator rather than the newline character.
//
//  Methods in this class never throw I/O exceptions, although some of its
// constructors may.  The client may inquire as to whether any errors have
// occurred by invoking checkError().
class PrintWriter extends Writer {

    @stub
    // Creates a new PrintWriter, without automatic line flushing, with the
    // specified file.
    def this(file: File) = ???

    @stub
    // Creates a new PrintWriter, without automatic line flushing, with the
    // specified file and charset.
    def this(file: File, csn: String) = ???

    @stub
    // Creates a new PrintWriter, without automatic line flushing, from an
    // existing OutputStream.
    def this(out: OutputStream) = ???

    @stub
    // Creates a new PrintWriter from an existing OutputStream.
    def this(out: OutputStream, autoFlush: Boolean) = ???

    @stub
    // Creates a new PrintWriter, without automatic line flushing, with the
    // specified file name.
    def this(fileName: String) = ???

    @stub
    // Creates a new PrintWriter, without automatic line flushing, with the
    // specified file name and charset.
    def this(fileName: String, csn: String) = ???

    @stub
    // Creates a new PrintWriter, without automatic line flushing.
    def this(out: Writer) = ???

    @stub
    // Appends the specified character to this writer.
    def append(c: Char): PrintWriter = ???

    @stub
    // Appends the specified character sequence to this writer.
    def append(csq: CharSequence): PrintWriter = ???

    @stub
    // Appends a subsequence of the specified character sequence to this writer.
    def append(csq: CharSequence, start: Int, end: Int): PrintWriter = ???

    @stub
    // Flushes the stream if it's not closed and checks its error state.
    def checkError(): Boolean = ???

    @stub
    // Clears the error state of this stream.
    protected def clearError(): Unit = ???

    @stub
    // Closes the stream and releases any system resources associated
    // with it.
    def close(): Unit = ???

    @stub
    // Flushes the stream.
    def flush(): Unit = ???

    @stub
    // Writes a formatted string to this writer using the specified format
    // string and arguments.
    def format(l: Locale, format: String, args: Object*): PrintWriter = ???

    @stub
    // Writes a formatted string to this writer using the specified format
    // string and arguments.
    def format(format: String, args: Object*): PrintWriter = ???

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
    // A convenience method to write a formatted string to this writer using
    // the specified format string and arguments.
    def printf(l: Locale, format: String, args: Object*): PrintWriter = ???

    @stub
    // A convenience method to write a formatted string to this writer using
    // the specified format string and arguments.
    def printf(format: String, args: Object*): PrintWriter = ???

    @stub
    // Terminates the current line by writing the line separator string.
    def println(): Unit = ???

    @stub
    // Prints a boolean value and then terminates the line.
    def println(x: Boolean): Unit = ???

    @stub
    // Prints a character and then terminates the line.
    def println(x: Char): Unit = ???

    @stub
    // Prints an array of characters and then terminates the line.
    def println(x: Array[Char]): Unit = ???

    @stub
    // Prints a double-precision floating-point number and then terminates the
    // line.
    def println(x: double): Unit = ???

    @stub
    // Prints a floating-point number and then terminates the line.
    def println(x: float): Unit = ???

    @stub
    // Prints an integer and then terminates the line.
    def println(x: Int): Unit = ???

    @stub
    // Prints a long integer and then terminates the line.
    def println(x: Long): Unit = ???

    @stub
    // Prints an Object and then terminates the line.
    def println(x: Object): Unit = ???

    @stub
    // Prints a String and then terminates the line.
    def println(x: String): Unit = ???

    @stub
    // Indicates that an error has occurred.
    protected def setError(): Unit = ???

    @stub
    // Writes an array of characters.
    def write(buf: Array[Char]): Unit = ???

    @stub
    // Writes A Portion of an array of characters.
    def write(buf: Array[Char], off: Int, len: Int): Unit = ???

    @stub
    // Writes a single character.
    def write(c: Int): Unit = ???

    @stub
    // Writes a string.
    def write(s: String): Unit = ???
}
