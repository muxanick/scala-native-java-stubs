package java.util

import java.io.OutputStream
import java.lang.{Object, String}
import java.nio.ByteBuffer
import scala.scalanative.annotation.stub

/** This class implements an encoder for encoding byte data using
 *  the Base64 encoding scheme as specified in RFC 4648 and RFC 2045.
 * 
 *   Instances of Base64.Encoder class are safe for use by
 *  multiple concurrent threads.
 * 
 *   Unless otherwise noted, passing a null argument to
 *  a method of this class will cause a
 *  NullPointerException to
 *  be thrown.
 */
object Base64.Encoder extends Object {

    /** Encodes all bytes from the specified byte array into a newly-allocated
     *  byte array using the Base64 encoding scheme.
     */
    @stub
    def encode(src: Array[Byte]): Array[Byte] = ???

    /** Encodes all bytes from the specified byte array using the
     *  Base64 encoding scheme, writing the resulting bytes to the
     *  given output byte array, starting at offset 0.
     */
    @stub
    def encode(src: Array[Byte], dst: Array[Byte]): Int = ???

    /** Encodes all remaining bytes from the specified byte buffer into
     *  a newly-allocated ByteBuffer using the Base64 encoding
     *  scheme.
     */
    @stub
    def encode(buffer: ByteBuffer): ByteBuffer = ???

    /** Encodes the specified byte array into a String using the Base64
     *  encoding scheme.
     */
    @stub
    def encodeToString(src: Array[Byte]): String = ???

    /** Returns an encoder instance that encodes equivalently to this one,
     *  but without adding any padding character at the end of the encoded
     *  byte data.
     */
    @stub
    def withoutPadding(): Base64.Encoder = ???

    /** Wraps an output stream for encoding byte data using the Base64
     *  encoding scheme.
     */
    @stub
    def wrap(os: OutputStream): OutputStream = ???
}
