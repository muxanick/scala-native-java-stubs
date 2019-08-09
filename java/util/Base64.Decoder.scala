package java.util

import java.io.InputStream
import java.lang.{Object, String}
import java.nio.ByteBuffer
import scala.scalanative.annotation.stub

/** This class implements a decoder for decoding byte data using the
 *  Base64 encoding scheme as specified in RFC 4648 and RFC 2045.
 * 
 *   The Base64 padding character '=' is accepted and
 *  interpreted as the end of the encoded byte data, but is not
 *  required. So if the final unit of the encoded byte data only has
 *  two or three Base64 characters (without the corresponding padding
 *  character(s) padded), they are decoded as if followed by padding
 *  character(s). If there is a padding character present in the
 *  final unit, the correct number of padding character(s) must be
 *  present, otherwise IllegalArgumentException (
 *  IOException when reading from a Base64 stream) is thrown
 *  during decoding.
 * 
 *   Instances of Base64.Decoder class are safe for use by
 *  multiple concurrent threads.
 * 
 *   Unless otherwise noted, passing a null argument to
 *  a method of this class will cause a
 *  NullPointerException to
 *  be thrown.
 */
object Base64.Decoder extends Object {

    /** Decodes all bytes from the input byte array using the Base64
     *  encoding scheme, writing the results into a newly-allocated output
     *  byte array.
     */
    @stub
    def decode(src: Array[Byte]): Array[Byte] = ???

    /** Decodes all bytes from the input byte array using the Base64
     *  encoding scheme, writing the results into the given output byte array,
     *  starting at offset 0.
     */
    @stub
    def decode(src: Array[Byte], dst: Array[Byte]): Int = ???

    /** Decodes all bytes from the input byte buffer using the Base64
     *  encoding scheme, writing the results into a newly-allocated ByteBuffer.
     */
    @stub
    def decode(buffer: ByteBuffer): ByteBuffer = ???

    /** Decodes a Base64 encoded String into a newly-allocated byte array
     *  using the Base64 encoding scheme.
     */
    @stub
    def decode(src: String): Array[Byte] = ???

    /** Returns an input stream for decoding Base64 encoded byte stream. */
    @stub
    def wrap(is: InputStream): InputStream = ???
}
