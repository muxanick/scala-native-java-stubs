package java.net

import java.lang.{Object, String}

// Provides methods to convert internationalized domain names (IDNs) between
// a normal Unicode representation and an ASCII Compatible Encoding (ACE) representation.
// Internationalized domain names can use characters from the entire range of
// Unicode, while traditional domain names are restricted to ASCII characters.
// ACE is an encoding of Unicode strings that uses only ASCII characters and
// can be used with software (such as the Domain Name System) that only
// understands traditional domain names.
//
// Internationalized domain names are defined in RFC 3490.
// RFC 3490 defines two operations: ToASCII and ToUnicode. These 2 operations employ
// Nameprep algorithm, which is a
// profile of Stringprep, and
// Punycode algorithm to convert
// domain name string back and forth.
//
// The behavior of aforementioned conversion process can be adjusted by various flags:
//   
//     If the ALLOW_UNASSIGNED flag is used, the domain name string to be converted
//         can contain code points that are unassigned in Unicode 3.2, which is the
//         Unicode version on which IDN conversion is based. If the flag is not used,
//         the presence of such unassigned code points is treated as an error.
//     If the USE_STD3_ASCII_RULES flag is used, ASCII strings are checked against RFC 1122 and RFC 1123.
//         It is an error if they don't meet the requirements.
//   
// These flags can be logically OR'ed together.
//
// The security consideration is important with respect to internationalization
// domain name support. For example, English domain names may be homographed
// - maliciously misspelled by substitution of non-Latin letters.
// Unicode Technical Report #36
// discusses security issues of IDN support as well as possible solutions.
// Applications are responsible for taking adequate security measures when using
// international domain names.
final class IDN extends Object {
}

object IDN {
    @stub
    // Flag to allow processing of unassigned code points
    def ALLOW_UNASSIGNED: Int = ???

    @stub
    // Translates a string from Unicode to ASCII Compatible Encoding (ACE),
    // as defined by the ToASCII operation of RFC 3490.
    def toASCII(input: String): String = ???

    @stub
    // Translates a string from Unicode to ASCII Compatible Encoding (ACE),
    // as defined by the ToASCII operation of RFC 3490.
    def toASCII(input: String, flag: Int): String = ???

    @stub
    // Translates a string from ASCII Compatible Encoding (ACE) to Unicode,
    // as defined by the ToUnicode operation of RFC 3490.
    def toUnicode(input: String): String = ???
}
