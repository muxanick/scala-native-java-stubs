package java.io

import java.lang.{Deprecated, Object}

// This class is an input stream filter that provides the added
// functionality of keeping track of the current line number.
// 
// A line is a sequence of bytes ending with a carriage return
// character ('\r'), a newline character
// ('\n'), or a carriage return character followed
// immediately by a linefeed character. In all three cases, the line
// terminating character(s) are returned as a single newline character.
// 
// The line number begins at 0, and is incremented by
// 1 when a read returns a newline character.
@Deprecated class LineNumberInputStream extends FilterInputStream {

    @stub
    // Deprecated. 
    def available(): Int = ???

    @stub
    // Deprecated. 
    def getLineNumber(): Int = ???

    @stub
    // Deprecated. 
    def mark(readlimit: Int): Unit = ???

    @stub
    // Deprecated. 
    def read(): Int = ???

    @stub
    // Deprecated. 
    def read(b: Array[Byte], off: Int, len: Int): Int = ???

    @stub
    // Deprecated. 
    def reset(): Unit = ???

    @stub
    // Deprecated. 
    def setLineNumber(lineNumber: Int): Unit = ???
}
