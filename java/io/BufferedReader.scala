package java.io

import java.lang.{Object, String}
import java.util.stream.Stream

// Reads text from a character-input stream, buffering characters so as to
// provide for the efficient reading of characters, arrays, and lines.
//
//  The buffer size may be specified, or the default size may be used.  The
// default is large enough for most purposes.
//
//  In general, each read request made of a Reader causes a corresponding
// read request to be made of the underlying character or byte stream.  It is
// therefore advisable to wrap a BufferedReader around any Reader whose read()
// operations may be costly, such as FileReaders and InputStreamReaders.  For
// example,
//
// 
// BufferedReader in
//   = new BufferedReader(new FileReader("foo.in"));
// 
//
// will buffer the input from the specified file.  Without buffering, each
// invocation of read() or readLine() could cause bytes to be read from the
// file, converted into characters, and then returned, which can be very
// inefficient.
//
//  Programs that use DataInputStreams for textual input can be localized by
// replacing each DataInputStream with an appropriate BufferedReader.
class BufferedReader extends Reader {

    @stub
    // Creates a buffering character-input stream that uses a default-sized
    // input buffer.
    def this(in: Reader) = ???

    @stub
    // Closes the stream and releases any system resources associated with
    // it.
    def close(): Unit = ???

    @stub
    // Returns a Stream, the elements of which are lines read from
    // this BufferedReader.
    def lines(): Stream[String] = ???

    @stub
    // Marks the present position in the stream.
    def mark(readAheadLimit: Int): Unit = ???

    @stub
    // Tells whether this stream supports the mark() operation, which it does.
    def markSupported(): Boolean = ???

    @stub
    // Reads a single character.
    def read(): Int = ???

    @stub
    // Reads characters into a portion of an array.
    def read(cbuf: Array[Char], off: Int, len: Int): Int = ???

    @stub
    // Reads a line of text.
    def readLine(): String = ???

    @stub
    // Tells whether this stream is ready to be read.
    def ready(): Boolean = ???

    @stub
    // Resets the stream to the most recent mark.
    def reset(): Unit = ???
}
