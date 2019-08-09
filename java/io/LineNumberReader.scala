package java.io

import java.lang.{Object, String}

// A buffered character-input stream that keeps track of line numbers.  This
// class defines methods setLineNumber(int) and getLineNumber() for setting and getting the current line number
// respectively.
//
//  By default, line numbering begins at 0. This number increments at every
// line terminator as the data is read, and can be changed
// with a call to setLineNumber(int).  Note however, that
// setLineNumber(int) does not actually change the current position in
// the stream; it only changes the value that will be returned by
// getLineNumber().
//
//  A line is considered to be terminated by any one of a
// line feed ('\n'), a carriage return ('\r'), or a carriage return followed
// immediately by a linefeed.
class LineNumberReader extends BufferedReader {

    @stub
    // Create a new line-numbering reader, using the default input-buffer
    // size.
    def this(in: Reader) = ???

    @stub
    // Get the current line number.
    def getLineNumber(): Int = ???

    @stub
    // Mark the present position in the stream.
    def mark(readAheadLimit: Int): Unit = ???

    @stub
    // Read a single character.
    def read(): Int = ???

    @stub
    // Read characters into a portion of an array.
    def read(cbuf: Array[Char], off: Int, len: Int): Int = ???

    @stub
    // Read a line of text.
    def readLine(): String = ???

    @stub
    // Reset the stream to the most recent mark.
    def reset(): Unit = ???

    @stub
    // Set the current line number.
    def setLineNumber(lineNumber: Int): Unit = ???
}
