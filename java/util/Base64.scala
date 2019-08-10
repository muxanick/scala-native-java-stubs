package java.util

import java.io.{InputStream, OutputStream}
import java.lang.{Object, String}
import java.nio.ByteBuffer
import scala.scalanative.annotation.stub

/** This class consists exclusively of static methods for obtaining
 *  encoders and decoders for the Base64 encoding scheme. The
 *  implementation of this class supports the following types of Base64
 *  as specified in
 *  RFC 4648 and
 *  RFC 2045.
 * 
 *  
 *  Basic
 *   Uses "The Base64 Alphabet" as specified in Table 1 of
 *      RFC 4648 and RFC 2045 for encoding and decoding operation.
 *      The encoder does not add any line feed (line separator)
 *      character. The decoder rejects data that contains characters
 *      outside the base64 alphabet.
 * 
 *  URL and Filename safe
 *   Uses the "URL and Filename safe Base64 Alphabet" as specified
 *      in Table 2 of RFC 4648 for encoding and decoding. The
 *      encoder does not add any line feed (line separator) character.
 *      The decoder rejects data that contains characters outside the
 *      base64 alphabet.
 * 
 *  MIME
 *   Uses the "The Base64 Alphabet" as specified in Table 1 of
 *      RFC 2045 for encoding and decoding operation. The encoded output
 *      must be represented in lines of no more than 76 characters each
 *      and uses a carriage return '\r' followed immediately by
 *      a linefeed '\n' as the line separator. No line separator
 *      is added to the end of the encoded output. All line separators
 *      or other characters not found in the base64 alphabet table are
 *      ignored in decoding operation.
 *  
 * 
 *   Unless otherwise noted, passing a null argument to a
 *  method of this class will cause a NullPointerException to be thrown.
 */
class Base64 extends Object {
}

object Base64 {
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
    object Decoder extends Object {

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
    object Encoder extends Object {

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
        def withoutPadding(): Encoder = ???

        /** Wraps an output stream for encoding byte data using the Base64
         *  encoding scheme.
         */
        @stub
        def wrap(os: OutputStream): OutputStream = ???
    }


    /** Returns a Base64.Decoder that decodes using the
     *  Basic type base64 encoding scheme.
     */
    @stub
    def getDecoder(): Base64.Decoder = ???

    /** Returns a Base64.Encoder that encodes using the
     *  Basic type base64 encoding scheme.
     */
    @stub
    def getEncoder(): Base64.Encoder = ???

    /** Returns a Base64.Decoder that decodes using the
     *  MIME type base64 decoding scheme.
     */
    @stub
    def getMimeDecoder(): Base64.Decoder = ???

    /** Returns a Base64.Encoder that encodes using the
     *  MIME type base64 encoding scheme.
     */
    @stub
    def getMimeEncoder(): Base64.Encoder = ???

    /** Returns a Base64.Encoder that encodes using the
     *  MIME type base64 encoding scheme
     *  with specified line length and line separators.
     */
    @stub
    def getMimeEncoder(lineLength: Int, lineSeparator: Array[Byte]): Base64.Encoder = ???

    /** Returns a Base64.Decoder that decodes using the
     *  URL and Filename safe type base64
     *  encoding scheme.
     */
    @stub
    def getUrlDecoder(): Base64.Decoder = ???

    /** Returns a Base64.Encoder that encodes using the
     *  URL and Filename safe type base64
     *  encoding scheme.
     */
    @stub
    def getUrlEncoder(): Base64.Encoder = ???
}
