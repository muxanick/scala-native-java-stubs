package java.io

import java.lang.{Object, String}
import java.nio.charset.{Charset, CharsetDecoder}

/** An InputStreamReader is a bridge from byte streams to character streams: It
 *  reads bytes and decodes them into characters using a specified charset.  The charset that it uses
 *  may be specified by name or may be given explicitly, or the platform's
 *  default charset may be accepted.
 * 
 *   Each invocation of one of an InputStreamReader's read() methods may
 *  cause one or more bytes to be read from the underlying byte-input stream.
 *  To enable the efficient conversion of bytes to characters, more bytes may
 *  be read ahead from the underlying stream than are necessary to satisfy the
 *  current read operation.
 * 
 *   For top efficiency, consider wrapping an InputStreamReader within a
 *  BufferedReader.  For example:
 * 
 *  
 *  BufferedReader in
 *    = new BufferedReader(new InputStreamReader(System.in));
 *  
 */
class InputStreamReader extends Reader {

    /** Creates an InputStreamReader that uses the default charset. */
    @stub
    def this(in: InputStream) = ???

    /** Creates an InputStreamReader that uses the given charset. */
    @stub
    def this(in: InputStream, cs: Charset) = ???

    /** Creates an InputStreamReader that uses the given charset decoder. */
    @stub
    def this(in: InputStream, dec: CharsetDecoder) = ???

    /** Closes the stream and releases any system resources associated with
     *  it.
     */
    @stub
    def close(): Unit = ???

    /** Returns the name of the character encoding being used by this stream. */
    @stub
    def getEncoding(): String = ???

    /** Reads a single character. */
    @stub
    def read(): Int = ???

    /** Reads characters into a portion of an array. */
    @stub
    def read(cbuf: Array[Char], offset: Int, length: Int): Int = ???
}
