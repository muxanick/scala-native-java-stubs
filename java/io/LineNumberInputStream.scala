package java.io

import java.lang.{Deprecated, Object}
import scala.scalanative.annotation.stub

/** This class is an input stream filter that provides the added
 *  functionality of keeping track of the current line number.
 *  
 *  A line is a sequence of bytes ending with a carriage return
 *  character ('\r'), a newline character
 *  ('\n'), or a carriage return character followed
 *  immediately by a linefeed character. In all three cases, the line
 *  terminating character(s) are returned as a single newline character.
 *  
 *  The line number begins at 0, and is incremented by
 *  1 when a read returns a newline character.
 */
@Deprecated
class LineNumberInputStream extends FilterInputStream {

    /** Deprecated.  */
    @stub
    def this(in: InputStream) = ???

    /** Deprecated.  */
    @stub
    def available(): Int = ???

    /** Deprecated.  */
    @stub
    def getLineNumber(): Int = ???

    /** Deprecated.  */
    @stub
    def mark(readlimit: Int): Unit = ???

    /** Deprecated.  */
    @stub
    def read(): Int = ???

    /** Deprecated.  */
    @stub
    def read(b: Array[Byte], off: Int, len: Int): Int = ???

    /** Deprecated.  */
    @stub
    def reset(): Unit = ???

    /** Deprecated.  */
    @stub
    def setLineNumber(lineNumber: Int): Unit = ???

    /** Deprecated.  */
    @stub
    def skip(n: Long): Long = ???
}
