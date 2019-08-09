package java.util

import java.lang.{Object, String}
import java.nio.ByteBuffer

// This class implements an encoder for encoding byte data using
// the Base64 encoding scheme as specified in RFC 4648 and RFC 2045.
//
//  Instances of Base64.Encoder class are safe for use by
// multiple concurrent threads.
//
//  Unless otherwise noted, passing a null argument to
// a method of this class will cause a
// NullPointerException to
// be thrown.
object Base64.Encoder extends Object {

    @stub
    // Encodes all bytes from the specified byte array into a newly-allocated
    // byte array using the Base64 encoding scheme.
    def encode(src: Array[Byte]): Array[Byte] = ???

    @stub
    // Encodes all bytes from the specified byte array using the
    // Base64 encoding scheme, writing the resulting bytes to the
    // given output byte array, starting at offset 0.
    def encode(src: Array[Byte], dst: Array[Byte]): Int = ???

    @stub
    // Encodes all remaining bytes from the specified byte buffer into
    // a newly-allocated ByteBuffer using the Base64 encoding
    // scheme.
    def encode(buffer: ByteBuffer): ByteBuffer = ???

    @stub
    // Encodes the specified byte array into a String using the Base64
    // encoding scheme.
    def encodeToString(src: Array[Byte]): String = ???

    @stub
    // Returns an encoder instance that encodes equivalently to this one,
    // but without adding any padding character at the end of the encoded
    // byte data.
    def withoutPadding(): Base64.Encoder = ???
}
