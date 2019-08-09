package java.net

import java.lang.{Object, String}

// Utility class for HTML form decoding. This class contains static methods
// for decoding a String from the application/x-www-form-urlencoded
// MIME format.
// 
// The conversion process is the reverse of that used by the URLEncoder class. It is assumed
// that all characters in the encoded string are one of the following:
// "a" through "z",
// "A" through "Z",
// "0" through "9", and
// "-", "_",
// ".", and "*". The
// character "%" is allowed but is interpreted
// as the start of a special escaped sequence.
// 
// The following rules are applied in the conversion:
//
// 
// The alphanumeric characters "a" through
//     "z", "A" through
//     "Z" and "0"
//     through "9" remain the same.
// The special characters ".",
//     "-", "*", and
//     "_" remain the same.
// The plus sign "+" is converted into a
//     space character "   " .
// A sequence of the form "%xy" will be
//     treated as representing a byte where xy is the two-digit
//     hexadecimal representation of the 8 bits. Then, all substrings
//     that contain one or more of these byte sequences consecutively
//     will be replaced by the character(s) whose encoding would result
//     in those consecutive bytes.
//     The encoding scheme used to decode these characters may be specified,
//     or if unspecified, the default encoding of the platform will be used.
// 
// 
// There are two possible ways in which this decoder could deal with
// illegal strings.  It could either leave illegal characters alone or
// it could throw an IllegalArgumentException.
// Which approach the decoder takes is left to the
// implementation.
class URLDecoder extends Object {
}

object URLDecoder {
    @stub
    // Deprecated. 
    //The resulting string may vary depending on the platform's
    //          default encoding. Instead, use the decode(String,String) method
    //          to specify the encoding.
    //
    def decode(s: String): String = ???
}
