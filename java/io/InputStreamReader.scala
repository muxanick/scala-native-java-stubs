package java.io

import java.lang.{Object, String}
import java.nio.charset.{Charset, CharsetDecoder}

// An InputStreamReader is a bridge from byte streams to character streams: It
// reads bytes and decodes them into characters using a specified charset.  The charset that it uses
// may be specified by name or may be given explicitly, or the platform's
// default charset may be accepted.
//
//  Each invocation of one of an InputStreamReader's read() methods may
// cause one or more bytes to be read from the underlying byte-input stream.
// To enable the efficient conversion of bytes to characters, more bytes may
// be read ahead from the underlying stream than are necessary to satisfy the
// current read operation.
//
//  For top efficiency, consider wrapping an InputStreamReader within a
// BufferedReader.  For example:
//
// 
// BufferedReader in
//   = new BufferedReader(new InputStreamReader(System.in));
// 
class InputStreamReader extends Reader {

    @stub
    // Creates an InputStreamReader that uses the default charset.
    def this(in: InputStream) = ???

    @stub
    // Creates an InputStreamReader that uses the given charset.
    def this(in: InputStream, cs: Charset) = ???

    @stub
    // Creates an InputStreamReader that uses the given charset decoder.
    def this(in: InputStream, dec: CharsetDecoder) = ???

    @stub
    // Closes the stream and releases any system resources associated with
    // it.
    def close(): Unit = ???

    @stub
    // Returns the name of the character encoding being used by this stream.
    def getEncoding(): String = ???

    @stub
    // Reads a single character.
    def read(): Int = ???

    @stub
    // Reads characters into a portion of an array.
    def read(cbuf: Array[Char], offset: Int, length: Int): Int = ???
}
