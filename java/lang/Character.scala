package java.lang

import java.io.Serializable

// The Character class wraps a value of the primitive
// type char in an object. An object of class
// Character contains a single field whose type is
// char.
// 
// In addition, this class provides a large number of static methods for
// determining a character's category (lowercase letter, digit, etc.)
// and for converting characters from uppercase to lowercase and vice
// versa.
//
// Unicode Conformance
// 
// The fields and methods of class Character are defined in terms
// of character information from the Unicode Standard, specifically the
// UnicodeData file that is part of the Unicode Character Database.
// This file specifies properties including name and category for every
// assigned Unicode code point or character range. The file is available
// from the Unicode Consortium at
// http://www.unicode.org.
// 
// The Java SE 8 Platform uses character information from version 6.2
// of the Unicode Standard, with two extensions. First, the Java SE 8 Platform
// allows an implementation of class Character to use the Japanese Era
// code point, U+32FF, from the first version of the Unicode Standard
// after 6.2 that assigns the code point. Second, in recognition of the fact
// that new currencies appear frequently, the Java SE 8 Platform allows an
// implementation of class Character to use the Currency Symbols
// block from version 10.0 of the Unicode Standard. Consequently, the
// behavior of fields and methods of class Character may vary across
// implementations of the Java SE 8 Platform when processing the aforementioned
// code points ( outside of version 6.2 ), except for the following methods
// that define Java identifiers:
// isJavaIdentifierStart(int), isJavaIdentifierStart(char),
// isJavaIdentifierPart(int), and isJavaIdentifierPart(char).
// Code points in Java identifiers must be drawn from version 6.2 of
// the Unicode Standard.
//
// Unicode Character Representations
//
// The char data type (and therefore the value that a
// Character object encapsulates) are based on the
// original Unicode specification, which defined characters as
// fixed-width 16-bit entities. The Unicode Standard has since been
// changed to allow for characters whose representation requires more
// than 16 bits.  The range of legal code points is now
// U+0000 to U+10FFFF, known as Unicode scalar value.
// (Refer to the 
// definition of the U+n notation in the Unicode
// Standard.)
//
// The set of characters from U+0000 to U+FFFF is
// sometimes referred to as the Basic Multilingual Plane (BMP).
// Characters whose code points are greater
// than U+FFFF are called supplementary characters.  The Java
// platform uses the UTF-16 representation in char arrays and
// in the String and StringBuffer classes. In
// this representation, supplementary characters are represented as a pair
// of char values, the first from the high-surrogates
// range, (\uD800-\uDBFF), the second from the
// low-surrogates range (\uDC00-\uDFFF).
//
// A char value, therefore, represents Basic
// Multilingual Plane (BMP) code points, including the surrogate
// code points, or code units of the UTF-16 encoding. An
// int value represents all Unicode code points,
// including supplementary code points. The lower (least significant)
// 21 bits of int are used to represent Unicode code
// points and the upper (most significant) 11 bits must be zero.
// Unless otherwise specified, the behavior with respect to
// supplementary characters and surrogate char values is
// as follows:
//
// 
// The methods that only accept a char value cannot support
// supplementary characters. They treat char values from the
// surrogate ranges as undefined characters. For example,
// Character.isLetter('\uD840') returns false, even though
// this specific value if followed by any low-surrogate value in a string
// would represent a letter.
//
// The methods that accept an int value support all
// Unicode characters, including supplementary characters. For
// example, Character.isLetter(0x2F81A) returns
// true because the code point value represents a letter
// (a CJK ideograph).
// 
//
// In the Java SE API documentation, Unicode code point is
// used for character values in the range between U+0000 and U+10FFFF,
// and Unicode code unit is used for 16-bit
// char values that are code units of the UTF-16
// encoding. For more information on Unicode terminology, refer to the
// Unicode Glossary.
final class Character extends Object with Serializable, with Comparable[Character] {

    @stub
    // Returns the value of this Character object.
    def charValue(): Char = ???

    @stub
    // Compares two Character objects numerically.
    def compareTo(anotherCharacter: Character): Int = ???

    @stub
    // Compares this object against the specified object.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns a hash code for this Character; equal to the result
    // of invoking charValue().
    def hashCode(): Int = ???

    @stub
    // Returns a String object representing this
    // Character's value.
    def toString(): String = ???
}

object Character {
    @stub
    // Instances of this class represent particular subsets of the Unicode
    // character set.
    def Character.Subset: class = ???

    @stub
    // A family of character subsets representing the character blocks in the
    // Unicode specification.
    def Character.UnicodeBlock: class = ???

    @stub
    // The number of bytes used to represent a char value in unsigned
    // binary form.
    def BYTES: Int = ???

    @stub
    // General category "Mc" in the Unicode specification.
    def COMBINING_SPACING_MARK: Byte = ???

    @stub
    // General category "Pc" in the Unicode specification.
    def CONNECTOR_PUNCTUATION: Byte = ???

    @stub
    // General category "Cc" in the Unicode specification.
    def CONTROL: Byte = ???

    @stub
    // General category "Sc" in the Unicode specification.
    def CURRENCY_SYMBOL: Byte = ???

    @stub
    // General category "Pd" in the Unicode specification.
    def DASH_PUNCTUATION: Byte = ???

    @stub
    // General category "Nd" in the Unicode specification.
    def DECIMAL_DIGIT_NUMBER: Byte = ???

    @stub
    // Weak bidirectional character type "AN" in the Unicode specification.
    def DIRECTIONALITY_ARABIC_NUMBER: Byte = ???

    @stub
    // Weak bidirectional character type "BN" in the Unicode specification.
    def DIRECTIONALITY_BOUNDARY_NEUTRAL: Byte = ???

    @stub
    // Weak bidirectional character type "CS" in the Unicode specification.
    def DIRECTIONALITY_COMMON_NUMBER_SEPARATOR: Byte = ???

    @stub
    // Weak bidirectional character type "EN" in the Unicode specification.
    def DIRECTIONALITY_EUROPEAN_NUMBER: Byte = ???

    @stub
    // Weak bidirectional character type "ES" in the Unicode specification.
    def DIRECTIONALITY_EUROPEAN_NUMBER_SEPARATOR: Byte = ???

    @stub
    // Weak bidirectional character type "ET" in the Unicode specification.
    def DIRECTIONALITY_EUROPEAN_NUMBER_TERMINATOR: Byte = ???

    @stub
    // Strong bidirectional character type "L" in the Unicode specification.
    def DIRECTIONALITY_LEFT_TO_RIGHT: Byte = ???

    @stub
    // Strong bidirectional character type "LRE" in the Unicode specification.
    def DIRECTIONALITY_LEFT_TO_RIGHT_EMBEDDING: Byte = ???

    @stub
    // Strong bidirectional character type "LRO" in the Unicode specification.
    def DIRECTIONALITY_LEFT_TO_RIGHT_OVERRIDE: Byte = ???

    @stub
    // Weak bidirectional character type "NSM" in the Unicode specification.
    def DIRECTIONALITY_NONSPACING_MARK: Byte = ???

    @stub
    // Neutral bidirectional character type "ON" in the Unicode specification.
    def DIRECTIONALITY_OTHER_NEUTRALS: Byte = ???

    @stub
    // Neutral bidirectional character type "B" in the Unicode specification.
    def DIRECTIONALITY_PARAGRAPH_SEPARATOR: Byte = ???

    @stub
    // Weak bidirectional character type "PDF" in the Unicode specification.
    def DIRECTIONALITY_POP_DIRECTIONAL_FORMAT: Byte = ???

    @stub
    // Strong bidirectional character type "R" in the Unicode specification.
    def DIRECTIONALITY_RIGHT_TO_LEFT: Byte = ???

    @stub
    // Strong bidirectional character type "AL" in the Unicode specification.
    def DIRECTIONALITY_RIGHT_TO_LEFT_ARABIC: Byte = ???

    @stub
    // Strong bidirectional character type "RLE" in the Unicode specification.
    def DIRECTIONALITY_RIGHT_TO_LEFT_EMBEDDING: Byte = ???

    @stub
    // Strong bidirectional character type "RLO" in the Unicode specification.
    def DIRECTIONALITY_RIGHT_TO_LEFT_OVERRIDE: Byte = ???

    @stub
    // Neutral bidirectional character type "S" in the Unicode specification.
    def DIRECTIONALITY_SEGMENT_SEPARATOR: Byte = ???

    @stub
    // Undefined bidirectional character type.
    def DIRECTIONALITY_UNDEFINED: Byte = ???

    @stub
    // Neutral bidirectional character type "WS" in the Unicode specification.
    def DIRECTIONALITY_WHITESPACE: Byte = ???

    @stub
    // General category "Me" in the Unicode specification.
    def ENCLOSING_MARK: Byte = ???

    @stub
    // General category "Pe" in the Unicode specification.
    def END_PUNCTUATION: Byte = ???

    @stub
    // General category "Pf" in the Unicode specification.
    def FINAL_QUOTE_PUNCTUATION: Byte = ???

    @stub
    // General category "Cf" in the Unicode specification.
    def FORMAT: Byte = ???

    @stub
    // General category "Pi" in the Unicode specification.
    def INITIAL_QUOTE_PUNCTUATION: Byte = ???

    @stub
    // General category "Nl" in the Unicode specification.
    def LETTER_NUMBER: Byte = ???

    @stub
    // General category "Zl" in the Unicode specification.
    def LINE_SEPARATOR: Byte = ???

    @stub
    // General category "Ll" in the Unicode specification.
    def LOWERCASE_LETTER: Byte = ???

    @stub
    // General category "Sm" in the Unicode specification.
    def MATH_SYMBOL: Byte = ???

    @stub
    // The maximum value of a
    // 
    // Unicode code point, constant U+10FFFF.
    def MAX_CODE_POINT: Int = ???

    @stub
    // The maximum value of a
    // 
    // Unicode high-surrogate code unit
    // in the UTF-16 encoding, constant '\uDBFF'.
    def MAX_HIGH_SURROGATE: Char = ???

    @stub
    // The maximum value of a
    // 
    // Unicode low-surrogate code unit
    // in the UTF-16 encoding, constant '\uDFFF'.
    def MAX_LOW_SURROGATE: Char = ???

    @stub
    // The maximum radix available for conversion to and from strings.
    def MAX_RADIX: Int = ???

    @stub
    // The maximum value of a Unicode surrogate code unit in the
    // UTF-16 encoding, constant '\uDFFF'.
    def MAX_SURROGATE: Char = ???

    @stub
    // The constant value of this field is the largest value of type
    // char, '\uFFFF'.
    def MAX_VALUE: Char = ???

    @stub
    // The minimum value of a
    // 
    // Unicode code point, constant U+0000.
    def MIN_CODE_POINT: Int = ???

    @stub
    // The minimum value of a
    // 
    // Unicode high-surrogate code unit
    // in the UTF-16 encoding, constant '\uD800'.
    def MIN_HIGH_SURROGATE: Char = ???

    @stub
    // The minimum value of a
    // 
    // Unicode low-surrogate code unit
    // in the UTF-16 encoding, constant '\uDC00'.
    def MIN_LOW_SURROGATE: Char = ???

    @stub
    // The minimum radix available for conversion to and from strings.
    def MIN_RADIX: Int = ???

    @stub
    // The minimum value of a
    // 
    // Unicode supplementary code point, constant U+10000.
    def MIN_SUPPLEMENTARY_CODE_POINT: Int = ???

    @stub
    // The minimum value of a Unicode surrogate code unit in the
    // UTF-16 encoding, constant '\uD800'.
    def MIN_SURROGATE: Char = ???

    @stub
    // The constant value of this field is the smallest value of type
    // char, '\u0000'.
    def MIN_VALUE: Char = ???

    @stub
    // General category "Lm" in the Unicode specification.
    def MODIFIER_LETTER: Byte = ???

    @stub
    // General category "Sk" in the Unicode specification.
    def MODIFIER_SYMBOL: Byte = ???

    @stub
    // General category "Mn" in the Unicode specification.
    def NON_SPACING_MARK: Byte = ???

    @stub
    // General category "Lo" in the Unicode specification.
    def OTHER_LETTER: Byte = ???

    @stub
    // General category "No" in the Unicode specification.
    def OTHER_NUMBER: Byte = ???

    @stub
    // General category "Po" in the Unicode specification.
    def OTHER_PUNCTUATION: Byte = ???

    @stub
    // General category "So" in the Unicode specification.
    def OTHER_SYMBOL: Byte = ???

    @stub
    // General category "Zp" in the Unicode specification.
    def PARAGRAPH_SEPARATOR: Byte = ???

    @stub
    // General category "Co" in the Unicode specification.
    def PRIVATE_USE: Byte = ???

    @stub
    // The number of bits used to represent a char value in unsigned
    // binary form, constant 16.
    def SIZE: Int = ???

    @stub
    // General category "Zs" in the Unicode specification.
    def SPACE_SEPARATOR: Byte = ???

    @stub
    // General category "Ps" in the Unicode specification.
    def START_PUNCTUATION: Byte = ???

    @stub
    // General category "Cs" in the Unicode specification.
    def SURROGATE: Byte = ???

    @stub
    // General category "Lt" in the Unicode specification.
    def TITLECASE_LETTER: Byte = ???

    @stub
    // The Class instance representing the primitive type
    // char.
    def TYPE: Class[Character] = ???

    @stub
    // General category "Cn" in the Unicode specification.
    def UNASSIGNED: Byte = ???

    @stub
    // Determines the number of char values needed to
    // represent the specified character (Unicode code point).
    def charCount(codePoint: Int): Int = ???

    @stub
    // Returns the code point at the given index of the
    // char array.
    def codePointAt(a: Array[Char], index: Int): Int = ???

    @stub
    // Returns the code point at the given index of the
    // char array, where only array elements with
    // index less than limit can be used.
    def codePointAt(a: Array[Char], index: Int, limit: Int): Int = ???

    @stub
    // Returns the code point at the given index of the
    // CharSequence.
    def codePointAt(seq: CharSequence, index: Int): Int = ???

    @stub
    // Returns the code point preceding the given index of the
    // char array.
    def codePointBefore(a: Array[Char], index: Int): Int = ???

    @stub
    // Returns the code point preceding the given index of the
    // char array, where only array elements with
    // index greater than or equal to start
    // can be used.
    def codePointBefore(a: Array[Char], index: Int, start: Int): Int = ???

    @stub
    // Returns the code point preceding the given index of the
    // CharSequence.
    def codePointBefore(seq: CharSequence, index: Int): Int = ???

    @stub
    // Returns the number of Unicode code points in a subarray of the
    // char array argument.
    def codePointCount(a: Array[Char], offset: Int, count: Int): Int = ???

    @stub
    // Returns the number of Unicode code points in the text range of
    // the specified char sequence.
    def codePointCount(seq: CharSequence, beginIndex: Int, endIndex: Int): Int = ???

    @stub
    // Compares two char values numerically.
    def compare(x: Char, y: Char): Int = ???

    @stub
    // Returns the numeric value of the character ch in the
    // specified radix.
    def digit(ch: Char, radix: Int): Int = ???

    @stub
    // Returns the numeric value of the specified character (Unicode
    // code point) in the specified radix.
    def digit(codePoint: Int, radix: Int): Int = ???

    @stub
    // Determines the character representation for a specific digit in
    // the specified radix.
    def forDigit(digit: Int, radix: Int): Char = ???

    @stub
    // Returns the Unicode directionality property for the given
    // character.
    def getDirectionality(ch: Char): Byte = ???

    @stub
    // Returns the Unicode directionality property for the given
    // character (Unicode code point).
    def getDirectionality(codePoint: Int): Byte = ???

    @stub
    // Returns the Unicode name of the specified character
    // codePoint, or null if the code point is
    // unassigned.
    def getName(codePoint: Int): String = ???

    @stub
    // Returns the int value that the specified Unicode
    // character represents.
    def getNumericValue(ch: Char): Int = ???

    @stub
    // Returns the int value that the specified
    // character (Unicode code point) represents.
    def getNumericValue(codePoint: Int): Int = ???

    @stub
    // Returns a value indicating a character's general category.
    def getType(ch: Char): Int = ???

    @stub
    // Returns a value indicating a character's general category.
    def getType(codePoint: Int): Int = ???

    @stub
    // Returns a hash code for a char value; compatible with
    // Character.hashCode().
    def hashCode(value: Char): Int = ???

    @stub
    // Returns the leading surrogate (a
    // 
    // high surrogate code unit) of the
    // 
    // surrogate pair
    // representing the specified supplementary character (Unicode
    // code point) in the UTF-16 encoding.
    def highSurrogate(codePoint: Int): Char = ???

    @stub
    // Determines if the specified character (Unicode code point) is an alphabet.
    def isAlphabetic(codePoint: Int): Boolean = ???

    @stub
    // Determines whether the specified character (Unicode code point)
    // is in the Basic Multilingual Plane (BMP).
    def isBmpCodePoint(codePoint: Int): Boolean = ???

    @stub
    // Determines if a character is defined in Unicode.
    def isDefined(ch: Char): Boolean = ???

    @stub
    // Determines if a character (Unicode code point) is defined in Unicode.
    def isDefined(codePoint: Int): Boolean = ???

    @stub
    // Determines if the specified character is a digit.
    def isDigit(ch: Char): Boolean = ???

    @stub
    // Determines if the specified character (Unicode code point) is a digit.
    def isDigit(codePoint: Int): Boolean = ???

    @stub
    // Determines if the given char value is a
    // 
    // Unicode high-surrogate code unit
    // (also known as leading-surrogate code unit).
    def isHighSurrogate(ch: Char): Boolean = ???

    @stub
    // Determines if the specified character should be regarded as
    // an ignorable character in a Java identifier or a Unicode identifier.
    def isIdentifierIgnorable(ch: Char): Boolean = ???

    @stub
    // Determines if the specified character (Unicode code point) should be regarded as
    // an ignorable character in a Java identifier or a Unicode identifier.
    def isIdentifierIgnorable(codePoint: Int): Boolean = ???

    @stub
    // Determines if the specified character (Unicode code point) is a CJKV
    // (Chinese, Japanese, Korean and Vietnamese) ideograph, as defined by
    // the Unicode Standard.
    def isIdeographic(codePoint: Int): Boolean = ???

    @stub
    // Determines if the specified character is an ISO control
    // character.
    def isISOControl(ch: Char): Boolean = ???

    @stub
    // Determines if the referenced character (Unicode code point) is an ISO control
    // character.
    def isISOControl(codePoint: Int): Boolean = ???

    @stub
    // Determines if the specified character may be part of a Java
    // identifier as other than the first character.
    def isJavaIdentifierPart(ch: Char): Boolean = ???

    @stub
    // Determines if the character (Unicode code point) may be part of a Java
    // identifier as other than the first character.
    def isJavaIdentifierPart(codePoint: Int): Boolean = ???

    @stub
    // Determines if the specified character is
    // permissible as the first character in a Java identifier.
    def isJavaIdentifierStart(ch: Char): Boolean = ???

    @stub
    // Determines if the character (Unicode code point) is
    // permissible as the first character in a Java identifier.
    def isJavaIdentifierStart(codePoint: Int): Boolean = ???

    @stub
    // Deprecated. 
    //Replaced by isJavaIdentifierStart(char).
    //
    def isJavaLetter(ch: Char): Boolean = ???

    @stub
    // Deprecated. 
    //Replaced by isJavaIdentifierPart(char).
    //
    def isJavaLetterOrDigit(ch: Char): Boolean = ???

    @stub
    // Determines if the specified character is a letter.
    def isLetter(ch: Char): Boolean = ???

    @stub
    // Determines if the specified character (Unicode code point) is a letter.
    def isLetter(codePoint: Int): Boolean = ???

    @stub
    // Determines if the specified character is a letter or digit.
    def isLetterOrDigit(ch: Char): Boolean = ???

    @stub
    // Determines if the specified character (Unicode code point) is a letter or digit.
    def isLetterOrDigit(codePoint: Int): Boolean = ???

    @stub
    // Determines if the specified character is a lowercase character.
    def isLowerCase(ch: Char): Boolean = ???

    @stub
    // Determines if the specified character (Unicode code point) is a
    // lowercase character.
    def isLowerCase(codePoint: Int): Boolean = ???

    @stub
    // Determines if the given char value is a
    // 
    // Unicode low-surrogate code unit
    // (also known as trailing-surrogate code unit).
    def isLowSurrogate(ch: Char): Boolean = ???

    @stub
    // Determines whether the character is mirrored according to the
    // Unicode specification.
    def isMirrored(ch: Char): Boolean = ???

    @stub
    // Determines whether the specified character (Unicode code point)
    // is mirrored according to the Unicode specification.
    def isMirrored(codePoint: Int): Boolean = ???

    @stub
    // Deprecated. 
    //Replaced by isWhitespace(char).
    //
    def isSpace(ch: Char): Boolean = ???

    @stub
    // Determines if the specified character is a Unicode space character.
    def isSpaceChar(ch: Char): Boolean = ???

    @stub
    // Determines if the specified character (Unicode code point) is a
    // Unicode space character.
    def isSpaceChar(codePoint: Int): Boolean = ???

    @stub
    // Determines whether the specified character (Unicode code point)
    // is in the supplementary character range.
    def isSupplementaryCodePoint(codePoint: Int): Boolean = ???

    @stub
    // Determines if the given char value is a Unicode
    // surrogate code unit.
    def isSurrogate(ch: Char): Boolean = ???

    @stub
    // Determines whether the specified pair of char
    // values is a valid
    // 
    // Unicode surrogate pair.
    def isSurrogatePair(high: Char, low: Char): Boolean = ???

    @stub
    // Determines if the specified character is a titlecase character.
    def isTitleCase(ch: Char): Boolean = ???

    @stub
    // Determines if the specified character (Unicode code point) is a titlecase character.
    def isTitleCase(codePoint: Int): Boolean = ???

    @stub
    // Determines if the specified character may be part of a Unicode
    // identifier as other than the first character.
    def isUnicodeIdentifierPart(ch: Char): Boolean = ???

    @stub
    // Determines if the specified character (Unicode code point) may be part of a Unicode
    // identifier as other than the first character.
    def isUnicodeIdentifierPart(codePoint: Int): Boolean = ???

    @stub
    // Determines if the specified character is permissible as the
    // first character in a Unicode identifier.
    def isUnicodeIdentifierStart(ch: Char): Boolean = ???

    @stub
    // Determines if the specified character (Unicode code point) is permissible as the
    // first character in a Unicode identifier.
    def isUnicodeIdentifierStart(codePoint: Int): Boolean = ???

    @stub
    // Determines if the specified character is an uppercase character.
    def isUpperCase(ch: Char): Boolean = ???

    @stub
    // Determines if the specified character (Unicode code point) is an uppercase character.
    def isUpperCase(codePoint: Int): Boolean = ???

    @stub
    // Determines whether the specified code point is a valid
    // 
    // Unicode code point value.
    def isValidCodePoint(codePoint: Int): Boolean = ???

    @stub
    // Determines if the specified character is white space according to Java.
    def isWhitespace(ch: Char): Boolean = ???

    @stub
    // Determines if the specified character (Unicode code point) is
    // white space according to Java.
    def isWhitespace(codePoint: Int): Boolean = ???

    @stub
    // Returns the trailing surrogate (a
    // 
    // low surrogate code unit) of the
    // 
    // surrogate pair
    // representing the specified supplementary character (Unicode
    // code point) in the UTF-16 encoding.
    def lowSurrogate(codePoint: Int): Char = ???

    @stub
    // Returns the index within the given char subarray
    // that is offset from the given index by
    // codePointOffset code points.
    def offsetByCodePoints(a: Array[Char], start: Int, count: Int, index: Int, codePointOffset: Int): Int = ???

    @stub
    // Returns the index within the given char sequence that is offset
    // from the given index by codePointOffset
    // code points.
    def offsetByCodePoints(seq: CharSequence, index: Int, codePointOffset: Int): Int = ???

    @stub
    // Returns the value obtained by reversing the order of the bytes in the
    // specified char value.
    def reverseBytes(ch: Char): Char = ???

    @stub
    // Converts the specified character (Unicode code point) to its
    // UTF-16 representation stored in a char array.
    def toChars(codePoint: Int): Array[Char] = ???

    @stub
    // Converts the specified character (Unicode code point) to its
    // UTF-16 representation.
    def toChars(codePoint: Int, dst: Array[Char], dstIndex: Int): Int = ???

    @stub
    // Converts the specified surrogate pair to its supplementary code
    // point value.
    def toCodePoint(high: Char, low: Char): Int = ???

    @stub
    // Converts the character argument to lowercase using case
    // mapping information from the UnicodeData file.
    def toLowerCase(ch: Char): Char = ???

    @stub
    // Converts the character (Unicode code point) argument to
    // lowercase using case mapping information from the UnicodeData
    // file.
    def toLowerCase(codePoint: Int): Int = ???

    @stub
    // Returns a String object representing the
    // specified char.
    def toString(c: Char): String = ???

    @stub
    // Converts the character argument to titlecase using case mapping
    // information from the UnicodeData file.
    def toTitleCase(ch: Char): Char = ???

    @stub
    // Converts the character (Unicode code point) argument to titlecase using case mapping
    // information from the UnicodeData file.
    def toTitleCase(codePoint: Int): Int = ???

    @stub
    // Converts the character argument to uppercase using case mapping
    // information from the UnicodeData file.
    def toUpperCase(ch: Char): Char = ???

    @stub
    // Converts the character (Unicode code point) argument to
    // uppercase using case mapping information from the UnicodeData
    // file.
    def toUpperCase(codePoint: Int): Int = ???
}
