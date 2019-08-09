package java.util

import java.lang.{Object, String}
import java.nio.ByteBuffer

// This class implements a decoder for decoding byte data using the
// Base64 encoding scheme as specified in RFC 4648 and RFC 2045.
//
//  The Base64 padding character '=' is accepted and
// interpreted as the end of the encoded byte data, but is not
// required. So if the final unit of the encoded byte data only has
// two or three Base64 characters (without the corresponding padding
// character(s) padded), they are decoded as if followed by padding
// character(s). If there is a padding character present in the
// final unit, the correct number of padding character(s) must be
// present, otherwise IllegalArgumentException (
// IOException when reading from a Base64 stream) is thrown
// during decoding.
//
//  Instances of Base64.Decoder class are safe for use by
// multiple concurrent threads.
//
//  Unless otherwise noted, passing a null argument to
// a method of this class will cause a
// NullPointerException to
// be thrown.
object Base64.Decoder extends Object {

    @stub
    // Decodes all bytes from the input byte array using the Base64
    // encoding scheme, writing the results into a newly-allocated output
    // byte array.
    def decode(src: Array[Byte]): Array[Byte] = ???

    @stub
    // Decodes all bytes from the input byte array using the Base64
    // encoding scheme, writing the results into the given output byte array,
    // starting at offset 0.
    def decode(src: Array[Byte], dst: Array[Byte]): Int = ???

    @stub
    // Decodes all bytes from the input byte buffer using the Base64
    // encoding scheme, writing the results into a newly-allocated ByteBuffer.
    def decode(buffer: ByteBuffer): ByteBuffer = ???

    @stub
    // Decodes a Base64 encoded String into a newly-allocated byte array
    // using the Base64 encoding scheme.
    def decode(src: String): Array[Byte] = ???
}
