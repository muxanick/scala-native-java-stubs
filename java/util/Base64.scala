package java.util

import java.lang.Object

// This class consists exclusively of static methods for obtaining
// encoders and decoders for the Base64 encoding scheme. The
// implementation of this class supports the following types of Base64
// as specified in
// RFC 4648 and
// RFC 2045.
//
// 
// Basic
//  Uses "The Base64 Alphabet" as specified in Table 1 of
//     RFC 4648 and RFC 2045 for encoding and decoding operation.
//     The encoder does not add any line feed (line separator)
//     character. The decoder rejects data that contains characters
//     outside the base64 alphabet.
//
// URL and Filename safe
//  Uses the "URL and Filename safe Base64 Alphabet" as specified
//     in Table 2 of RFC 4648 for encoding and decoding. The
//     encoder does not add any line feed (line separator) character.
//     The decoder rejects data that contains characters outside the
//     base64 alphabet.
//
// MIME
//  Uses the "The Base64 Alphabet" as specified in Table 1 of
//     RFC 2045 for encoding and decoding operation. The encoded output
//     must be represented in lines of no more than 76 characters each
//     and uses a carriage return '\r' followed immediately by
//     a linefeed '\n' as the line separator. No line separator
//     is added to the end of the encoded output. All line separators
//     or other characters not found in the base64 alphabet table are
//     ignored in decoding operation.
// 
//
//  Unless otherwise noted, passing a null argument to a
// method of this class will cause a NullPointerException to be thrown.
class Base64 extends Object {
}

object Base64 {
    @stub
    // This class implements a decoder for decoding byte data using the
    // Base64 encoding scheme as specified in RFC 4648 and RFC 2045.
    def Base64.Decoder: class = ???

    @stub
    // Returns a Base64.Decoder that decodes using the
    // Basic type base64 encoding scheme.
    def getDecoder(): Base64.Decoder = ???

    @stub
    // Returns a Base64.Encoder that encodes using the
    // Basic type base64 encoding scheme.
    def getEncoder(): Base64.Encoder = ???

    @stub
    // Returns a Base64.Decoder that decodes using the
    // MIME type base64 decoding scheme.
    def getMimeDecoder(): Base64.Decoder = ???

    @stub
    // Returns a Base64.Encoder that encodes using the
    // MIME type base64 encoding scheme.
    def getMimeEncoder(): Base64.Encoder = ???

    @stub
    // Returns a Base64.Encoder that encodes using the
    // MIME type base64 encoding scheme
    // with specified line length and line separators.
    def getMimeEncoder(lineLength: Int, lineSeparator: Array[Byte]): Base64.Encoder = ???

    @stub
    // Returns a Base64.Decoder that decodes using the
    // URL and Filename safe type base64
    // encoding scheme.
    def getUrlDecoder(): Base64.Decoder = ???
}
