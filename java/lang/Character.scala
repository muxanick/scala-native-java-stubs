package java.lang

import java.io.Serializable
import scala.scalanative.annotation.stub

/** The Character class wraps a value of the primitive
 *  type char in an object. An object of class
 *  Character contains a single field whose type is
 *  char.
 *  
 *  In addition, this class provides a large number of static methods for
 *  determining a character's category (lowercase letter, digit, etc.)
 *  and for converting characters from uppercase to lowercase and vice
 *  versa.
 * 
 *  Unicode Conformance
 *  
 *  The fields and methods of class Character are defined in terms
 *  of character information from the Unicode Standard, specifically the
 *  UnicodeData file that is part of the Unicode Character Database.
 *  This file specifies properties including name and category for every
 *  assigned Unicode code point or character range. The file is available
 *  from the Unicode Consortium at
 *  http://www.unicode.org.
 *  
 *  The Java SE 8 Platform uses character information from version 6.2
 *  of the Unicode Standard, with two extensions. First, the Java SE 8 Platform
 *  allows an implementation of class Character to use the Japanese Era
 *  code point, U+32FF, from the first version of the Unicode Standard
 *  after 6.2 that assigns the code point. Second, in recognition of the fact
 *  that new currencies appear frequently, the Java SE 8 Platform allows an
 *  implementation of class Character to use the Currency Symbols
 *  block from version 10.0 of the Unicode Standard. Consequently, the
 *  behavior of fields and methods of class Character may vary across
 *  implementations of the Java SE 8 Platform when processing the aforementioned
 *  code points ( outside of version 6.2 ), except for the following methods
 *  that define Java identifiers:
 *  isJavaIdentifierStart(int), isJavaIdentifierStart(char),
 *  isJavaIdentifierPart(int), and isJavaIdentifierPart(char).
 *  Code points in Java identifiers must be drawn from version 6.2 of
 *  the Unicode Standard.
 * 
 *  Unicode Character Representations
 * 
 *  The char data type (and therefore the value that a
 *  Character object encapsulates) are based on the
 *  original Unicode specification, which defined characters as
 *  fixed-width 16-bit entities. The Unicode Standard has since been
 *  changed to allow for characters whose representation requires more
 *  than 16 bits.  The range of legal code points is now
 *  U+0000 to U+10FFFF, known as Unicode scalar value.
 *  (Refer to the 
 *  definition of the U+n notation in the Unicode
 *  Standard.)
 * 
 *  The set of characters from U+0000 to U+FFFF is
 *  sometimes referred to as the Basic Multilingual Plane (BMP).
 *  Characters whose code points are greater
 *  than U+FFFF are called supplementary characters.  The Java
 *  platform uses the UTF-16 representation in char arrays and
 *  in the String and StringBuffer classes. In
 *  this representation, supplementary characters are represented as a pair
 *  of char values, the first from the high-surrogates
 *  range, (\uD800-\uDBFF), the second from the
 *  low-surrogates range (\uDC00-\uDFFF).
 * 
 *  A char value, therefore, represents Basic
 *  Multilingual Plane (BMP) code points, including the surrogate
 *  code points, or code units of the UTF-16 encoding. An
 *  int value represents all Unicode code points,
 *  including supplementary code points. The lower (least significant)
 *  21 bits of int are used to represent Unicode code
 *  points and the upper (most significant) 11 bits must be zero.
 *  Unless otherwise specified, the behavior with respect to
 *  supplementary characters and surrogate char values is
 *  as follows:
 * 
 *  
 *  The methods that only accept a char value cannot support
 *  supplementary characters. They treat char values from the
 *  surrogate ranges as undefined characters. For example,
 *  Character.isLetter('\uD840') returns false, even though
 *  this specific value if followed by any low-surrogate value in a string
 *  would represent a letter.
 * 
 *  The methods that accept an int value support all
 *  Unicode characters, including supplementary characters. For
 *  example, Character.isLetter(0x2F81A) returns
 *  true because the code point value represents a letter
 *  (a CJK ideograph).
 *  
 * 
 *  In the Java SE API documentation, Unicode code point is
 *  used for character values in the range between U+0000 and U+10FFFF,
 *  and Unicode code unit is used for 16-bit
 *  char values that are code units of the UTF-16
 *  encoding. For more information on Unicode terminology, refer to the
 *  Unicode Glossary.
 */
final class Character extends Object with Serializable with Comparable[Character] {

    /** Constructs a newly allocated Character object that
     *  represents the specified char value.
     */
    @stub
    def this(value: Char) = ???

    /** Returns the value of this Character object. */
    @stub
    def charValue(): Char = ???

    /** Compares two Character objects numerically. */
    @stub
    def compareTo(anotherCharacter: Character): Int = ???

    /** Compares this object against the specified object. */
    @stub
    def equals(obj: Any): Boolean = ???

    /** Returns a hash code for this Character; equal to the result
     *  of invoking charValue().
     */
    @stub
    def hashCode(): Int = ???

    /** Returns a String object representing this
     *  Character's value.
     */
    @stub
    def toString(): String = ???
}

object Character {
    /** Instances of this class represent particular subsets of the Unicode
     *  character set.
     */
    type Subset = Character_Subset

    /** A family of character subsets representing the character blocks in the
     *  Unicode specification.
     */
    type UnicodeBlock = Character_UnicodeBlock

    /** A family of character subsets representing the character scripts
     *  defined in the 
     *  Unicode Standard Annex #24: Script Names.
     */
    type UnicodeScript = Character_UnicodeScript

    /** The number of bytes used to represent a char value in unsigned
     *  binary form.
     */
    @stub
    val BYTES: Int = ???

    /** General category "Mc" in the Unicode specification. */
    @stub
    val COMBINING_SPACING_MARK: Byte = ???

    /** General category "Pc" in the Unicode specification. */
    @stub
    val CONNECTOR_PUNCTUATION: Byte = ???

    /** General category "Cc" in the Unicode specification. */
    @stub
    val CONTROL: Byte = ???

    /** General category "Sc" in the Unicode specification. */
    @stub
    val CURRENCY_SYMBOL: Byte = ???

    /** General category "Pd" in the Unicode specification. */
    @stub
    val DASH_PUNCTUATION: Byte = ???

    /** General category "Nd" in the Unicode specification. */
    @stub
    val DECIMAL_DIGIT_NUMBER: Byte = ???

    /** Weak bidirectional character type "AN" in the Unicode specification. */
    @stub
    val DIRECTIONALITY_ARABIC_NUMBER: Byte = ???

    /** Weak bidirectional character type "BN" in the Unicode specification. */
    @stub
    val DIRECTIONALITY_BOUNDARY_NEUTRAL: Byte = ???

    /** Weak bidirectional character type "CS" in the Unicode specification. */
    @stub
    val DIRECTIONALITY_COMMON_NUMBER_SEPARATOR: Byte = ???

    /** Weak bidirectional character type "EN" in the Unicode specification. */
    @stub
    val DIRECTIONALITY_EUROPEAN_NUMBER: Byte = ???

    /** Weak bidirectional character type "ES" in the Unicode specification. */
    @stub
    val DIRECTIONALITY_EUROPEAN_NUMBER_SEPARATOR: Byte = ???

    /** Weak bidirectional character type "ET" in the Unicode specification. */
    @stub
    val DIRECTIONALITY_EUROPEAN_NUMBER_TERMINATOR: Byte = ???

    /** Strong bidirectional character type "L" in the Unicode specification. */
    @stub
    val DIRECTIONALITY_LEFT_TO_RIGHT: Byte = ???

    /** Strong bidirectional character type "LRE" in the Unicode specification. */
    @stub
    val DIRECTIONALITY_LEFT_TO_RIGHT_EMBEDDING: Byte = ???

    /** Strong bidirectional character type "LRO" in the Unicode specification. */
    @stub
    val DIRECTIONALITY_LEFT_TO_RIGHT_OVERRIDE: Byte = ???

    /** Weak bidirectional character type "NSM" in the Unicode specification. */
    @stub
    val DIRECTIONALITY_NONSPACING_MARK: Byte = ???

    /** Neutral bidirectional character type "ON" in the Unicode specification. */
    @stub
    val DIRECTIONALITY_OTHER_NEUTRALS: Byte = ???

    /** Neutral bidirectional character type "B" in the Unicode specification. */
    @stub
    val DIRECTIONALITY_PARAGRAPH_SEPARATOR: Byte = ???

    /** Weak bidirectional character type "PDF" in the Unicode specification. */
    @stub
    val DIRECTIONALITY_POP_DIRECTIONAL_FORMAT: Byte = ???

    /** Strong bidirectional character type "R" in the Unicode specification. */
    @stub
    val DIRECTIONALITY_RIGHT_TO_LEFT: Byte = ???

    /** Strong bidirectional character type "AL" in the Unicode specification. */
    @stub
    val DIRECTIONALITY_RIGHT_TO_LEFT_ARABIC: Byte = ???

    /** Strong bidirectional character type "RLE" in the Unicode specification. */
    @stub
    val DIRECTIONALITY_RIGHT_TO_LEFT_EMBEDDING: Byte = ???

    /** Strong bidirectional character type "RLO" in the Unicode specification. */
    @stub
    val DIRECTIONALITY_RIGHT_TO_LEFT_OVERRIDE: Byte = ???

    /** Neutral bidirectional character type "S" in the Unicode specification. */
    @stub
    val DIRECTIONALITY_SEGMENT_SEPARATOR: Byte = ???

    /** Undefined bidirectional character type. */
    @stub
    val DIRECTIONALITY_UNDEFINED: Byte = ???

    /** Neutral bidirectional character type "WS" in the Unicode specification. */
    @stub
    val DIRECTIONALITY_WHITESPACE: Byte = ???

    /** General category "Me" in the Unicode specification. */
    @stub
    val ENCLOSING_MARK: Byte = ???

    /** General category "Pe" in the Unicode specification. */
    @stub
    val END_PUNCTUATION: Byte = ???

    /** General category "Pf" in the Unicode specification. */
    @stub
    val FINAL_QUOTE_PUNCTUATION: Byte = ???

    /** General category "Cf" in the Unicode specification. */
    @stub
    val FORMAT: Byte = ???

    /** General category "Pi" in the Unicode specification. */
    @stub
    val INITIAL_QUOTE_PUNCTUATION: Byte = ???

    /** General category "Nl" in the Unicode specification. */
    @stub
    val LETTER_NUMBER: Byte = ???

    /** General category "Zl" in the Unicode specification. */
    @stub
    val LINE_SEPARATOR: Byte = ???

    /** General category "Ll" in the Unicode specification. */
    @stub
    val LOWERCASE_LETTER: Byte = ???

    /** General category "Sm" in the Unicode specification. */
    @stub
    val MATH_SYMBOL: Byte = ???

    /** The maximum value of a
     *  
     *  Unicode code point, constant U+10FFFF.
     */
    @stub
    val MAX_CODE_POINT: Int = ???

    /** The maximum value of a
     *  
     *  Unicode high-surrogate code unit
     *  in the UTF-16 encoding, constant '\uDBFF'.
     */
    @stub
    val MAX_HIGH_SURROGATE: Char = ???

    /** The maximum value of a
     *  
     *  Unicode low-surrogate code unit
     *  in the UTF-16 encoding, constant '\uDFFF'.
     */
    @stub
    val MAX_LOW_SURROGATE: Char = ???

    /** The maximum radix available for conversion to and from strings. */
    @stub
    val MAX_RADIX: Int = ???

    /** The maximum value of a Unicode surrogate code unit in the
     *  UTF-16 encoding, constant '\uDFFF'.
     */
    @stub
    val MAX_SURROGATE: Char = ???

    /** The constant value of this field is the largest value of type
     *  char, '\uFFFF'.
     */
    @stub
    val MAX_VALUE: Char = ???

    /** The minimum value of a
     *  
     *  Unicode code point, constant U+0000.
     */
    @stub
    val MIN_CODE_POINT: Int = ???

    /** The minimum value of a
     *  
     *  Unicode high-surrogate code unit
     *  in the UTF-16 encoding, constant '\uD800'.
     */
    @stub
    val MIN_HIGH_SURROGATE: Char = ???

    /** The minimum value of a
     *  
     *  Unicode low-surrogate code unit
     *  in the UTF-16 encoding, constant '\uDC00'.
     */
    @stub
    val MIN_LOW_SURROGATE: Char = ???

    /** The minimum radix available for conversion to and from strings. */
    @stub
    val MIN_RADIX: Int = ???

    /** The minimum value of a
     *  
     *  Unicode supplementary code point, constant U+10000.
     */
    @stub
    val MIN_SUPPLEMENTARY_CODE_POINT: Int = ???

    /** The minimum value of a Unicode surrogate code unit in the
     *  UTF-16 encoding, constant '\uD800'.
     */
    @stub
    val MIN_SURROGATE: Char = ???

    /** The constant value of this field is the smallest value of type
     *  char, '\u0000'.
     */
    @stub
    val MIN_VALUE: Char = ???

    /** General category "Lm" in the Unicode specification. */
    @stub
    val MODIFIER_LETTER: Byte = ???

    /** General category "Sk" in the Unicode specification. */
    @stub
    val MODIFIER_SYMBOL: Byte = ???

    /** General category "Mn" in the Unicode specification. */
    @stub
    val NON_SPACING_MARK: Byte = ???

    /** General category "Lo" in the Unicode specification. */
    @stub
    val OTHER_LETTER: Byte = ???

    /** General category "No" in the Unicode specification. */
    @stub
    val OTHER_NUMBER: Byte = ???

    /** General category "Po" in the Unicode specification. */
    @stub
    val OTHER_PUNCTUATION: Byte = ???

    /** General category "So" in the Unicode specification. */
    @stub
    val OTHER_SYMBOL: Byte = ???

    /** General category "Zp" in the Unicode specification. */
    @stub
    val PARAGRAPH_SEPARATOR: Byte = ???

    /** General category "Co" in the Unicode specification. */
    @stub
    val PRIVATE_USE: Byte = ???

    /** The number of bits used to represent a char value in unsigned
     *  binary form, constant 16.
     */
    @stub
    val SIZE: Int = ???

    /** General category "Zs" in the Unicode specification. */
    @stub
    val SPACE_SEPARATOR: Byte = ???

    /** General category "Ps" in the Unicode specification. */
    @stub
    val START_PUNCTUATION: Byte = ???

    /** General category "Cs" in the Unicode specification. */
    @stub
    val SURROGATE: Byte = ???

    /** General category "Lt" in the Unicode specification. */
    @stub
    val TITLECASE_LETTER: Byte = ???

    /** The Class instance representing the primitive type
     *  char.
     */
    @stub
    val TYPE: Class[Character] = ???

    /** General category "Cn" in the Unicode specification. */
    @stub
    val UNASSIGNED: Byte = ???

    /** General category "Lu" in the Unicode specification. */
    @stub
    val UPPERCASE_LETTER: Byte = ???

    /** Determines the number of char values needed to
     *  represent the specified character (Unicode code point).
     */
    @stub
    def charCount(codePoint: Int): Int = ???

    /** Returns the code point at the given index of the
     *  char array.
     */
    @stub
    def codePointAt(a: Array[Char], index: Int): Int = ???

    /** Returns the code point at the given index of the
     *  char array, where only array elements with
     *  index less than limit can be used.
     */
    @stub
    def codePointAt(a: Array[Char], index: Int, limit: Int): Int = ???

    /** Returns the code point at the given index of the
     *  CharSequence.
     */
    @stub
    def codePointAt(seq: CharSequence, index: Int): Int = ???

    /** Returns the code point preceding the given index of the
     *  char array.
     */
    @stub
    def codePointBefore(a: Array[Char], index: Int): Int = ???

    /** Returns the code point preceding the given index of the
     *  char array, where only array elements with
     *  index greater than or equal to start
     *  can be used.
     */
    @stub
    def codePointBefore(a: Array[Char], index: Int, start: Int): Int = ???

    /** Returns the code point preceding the given index of the
     *  CharSequence.
     */
    @stub
    def codePointBefore(seq: CharSequence, index: Int): Int = ???

    /** Returns the number of Unicode code points in a subarray of the
     *  char array argument.
     */
    @stub
    def codePointCount(a: Array[Char], offset: Int, count: Int): Int = ???

    /** Returns the number of Unicode code points in the text range of
     *  the specified char sequence.
     */
    @stub
    def codePointCount(seq: CharSequence, beginIndex: Int, endIndex: Int): Int = ???

    /** Compares two char values numerically. */
    @stub
    def compare(x: Char, y: Char): Int = ???

    /** Returns the numeric value of the character ch in the
     *  specified radix.
     */
    @stub
    def digit(ch: Char, radix: Int): Int = ???

    /** Returns the numeric value of the specified character (Unicode
     *  code point) in the specified radix.
     */
    @stub
    def digit(codePoint: Int, radix: Int): Int = ???

    /** Determines the character representation for a specific digit in
     *  the specified radix.
     */
    @stub
    def forDigit(digit: Int, radix: Int): Char = ???

    /** Returns the Unicode directionality property for the given
     *  character.
     */
    @stub
    def getDirectionality(ch: Char): Byte = ???

    /** Returns the Unicode directionality property for the given
     *  character (Unicode code point).
     */
    @stub
    def getDirectionality(codePoint: Int): Byte = ???

    /** Returns the Unicode name of the specified character
     *  codePoint, or null if the code point is
     *  unassigned.
     */
    @stub
    def getName(codePoint: Int): String = ???

    /** Returns the int value that the specified Unicode
     *  character represents.
     */
    @stub
    def getNumericValue(ch: Char): Int = ???

    /** Returns the int value that the specified
     *  character (Unicode code point) represents.
     */
    @stub
    def getNumericValue(codePoint: Int): Int = ???

    /** Returns a value indicating a character's general category. */
    @stub
    def getType(ch: Char): Int = ???

    /** Returns a value indicating a character's general category. */
    @stub
    def getType(codePoint: Int): Int = ???

    /** Returns a hash code for a char value; compatible with
     *  Character.hashCode().
     */
    @stub
    def hashCode(value: Char): Int = ???

    /** Returns the leading surrogate (a
     *  
     *  high surrogate code unit) of the
     *  
     *  surrogate pair
     *  representing the specified supplementary character (Unicode
     *  code point) in the UTF-16 encoding.
     */
    @stub
    def highSurrogate(codePoint: Int): Char = ???

    /** Determines if the specified character (Unicode code point) is an alphabet. */
    @stub
    def isAlphabetic(codePoint: Int): Boolean = ???

    /** Determines whether the specified character (Unicode code point)
     *  is in the Basic Multilingual Plane (BMP).
     */
    @stub
    def isBmpCodePoint(codePoint: Int): Boolean = ???

    /** Determines if a character is defined in Unicode. */
    @stub
    def isDefined(ch: Char): Boolean = ???

    /** Determines if a character (Unicode code point) is defined in Unicode. */
    @stub
    def isDefined(codePoint: Int): Boolean = ???

    /** Determines if the specified character is a digit. */
    @stub
    def isDigit(ch: Char): Boolean = ???

    /** Determines if the specified character (Unicode code point) is a digit. */
    @stub
    def isDigit(codePoint: Int): Boolean = ???

    /** Determines if the given char value is a
     *  
     *  Unicode high-surrogate code unit
     *  (also known as leading-surrogate code unit).
     */
    @stub
    def isHighSurrogate(ch: Char): Boolean = ???

    /** Determines if the specified character should be regarded as
     *  an ignorable character in a Java identifier or a Unicode identifier.
     */
    @stub
    def isIdentifierIgnorable(ch: Char): Boolean = ???

    /** Determines if the specified character (Unicode code point) should be regarded as
     *  an ignorable character in a Java identifier or a Unicode identifier.
     */
    @stub
    def isIdentifierIgnorable(codePoint: Int): Boolean = ???

    /** Determines if the specified character (Unicode code point) is a CJKV
     *  (Chinese, Japanese, Korean and Vietnamese) ideograph, as defined by
     *  the Unicode Standard.
     */
    @stub
    def isIdeographic(codePoint: Int): Boolean = ???

    /** Determines if the specified character is an ISO control
     *  character.
     */
    @stub
    def isISOControl(ch: Char): Boolean = ???

    /** Determines if the referenced character (Unicode code point) is an ISO control
     *  character.
     */
    @stub
    def isISOControl(codePoint: Int): Boolean = ???

    /** Determines if the specified character may be part of a Java
     *  identifier as other than the first character.
     */
    @stub
    def isJavaIdentifierPart(ch: Char): Boolean = ???

    /** Determines if the character (Unicode code point) may be part of a Java
     *  identifier as other than the first character.
     */
    @stub
    def isJavaIdentifierPart(codePoint: Int): Boolean = ???

    /** Determines if the specified character is
     *  permissible as the first character in a Java identifier.
     */
    @stub
    def isJavaIdentifierStart(ch: Char): Boolean = ???

    /** Determines if the character (Unicode code point) is
     *  permissible as the first character in a Java identifier.
     */
    @stub
    def isJavaIdentifierStart(codePoint: Int): Boolean = ???

    /** Deprecated. 
     * Replaced by isJavaIdentifierStart(char).
     * 
     */
    @stub
    def isJavaLetter(ch: Char): Boolean = ???

    /** Deprecated. 
     * Replaced by isJavaIdentifierPart(char).
     * 
     */
    @stub
    def isJavaLetterOrDigit(ch: Char): Boolean = ???

    /** Determines if the specified character is a letter. */
    @stub
    def isLetter(ch: Char): Boolean = ???

    /** Determines if the specified character (Unicode code point) is a letter. */
    @stub
    def isLetter(codePoint: Int): Boolean = ???

    /** Determines if the specified character is a letter or digit. */
    @stub
    def isLetterOrDigit(ch: Char): Boolean = ???

    /** Determines if the specified character (Unicode code point) is a letter or digit. */
    @stub
    def isLetterOrDigit(codePoint: Int): Boolean = ???

    /** Determines if the specified character is a lowercase character. */
    @stub
    def isLowerCase(ch: Char): Boolean = ???

    /** Determines if the specified character (Unicode code point) is a
     *  lowercase character.
     */
    @stub
    def isLowerCase(codePoint: Int): Boolean = ???

    /** Determines if the given char value is a
     *  
     *  Unicode low-surrogate code unit
     *  (also known as trailing-surrogate code unit).
     */
    @stub
    def isLowSurrogate(ch: Char): Boolean = ???

    /** Determines whether the character is mirrored according to the
     *  Unicode specification.
     */
    @stub
    def isMirrored(ch: Char): Boolean = ???

    /** Determines whether the specified character (Unicode code point)
     *  is mirrored according to the Unicode specification.
     */
    @stub
    def isMirrored(codePoint: Int): Boolean = ???

    /** Deprecated. 
     * Replaced by isWhitespace(char).
     * 
     */
    @stub
    def isSpace(ch: Char): Boolean = ???

    /** Determines if the specified character is a Unicode space character. */
    @stub
    def isSpaceChar(ch: Char): Boolean = ???

    /** Determines if the specified character (Unicode code point) is a
     *  Unicode space character.
     */
    @stub
    def isSpaceChar(codePoint: Int): Boolean = ???

    /** Determines whether the specified character (Unicode code point)
     *  is in the supplementary character range.
     */
    @stub
    def isSupplementaryCodePoint(codePoint: Int): Boolean = ???

    /** Determines if the given char value is a Unicode
     *  surrogate code unit.
     */
    @stub
    def isSurrogate(ch: Char): Boolean = ???

    /** Determines whether the specified pair of char
     *  values is a valid
     *  
     *  Unicode surrogate pair.
     */
    @stub
    def isSurrogatePair(high: Char, low: Char): Boolean = ???

    /** Determines if the specified character is a titlecase character. */
    @stub
    def isTitleCase(ch: Char): Boolean = ???

    /** Determines if the specified character (Unicode code point) is a titlecase character. */
    @stub
    def isTitleCase(codePoint: Int): Boolean = ???

    /** Determines if the specified character may be part of a Unicode
     *  identifier as other than the first character.
     */
    @stub
    def isUnicodeIdentifierPart(ch: Char): Boolean = ???

    /** Determines if the specified character (Unicode code point) may be part of a Unicode
     *  identifier as other than the first character.
     */
    @stub
    def isUnicodeIdentifierPart(codePoint: Int): Boolean = ???

    /** Determines if the specified character is permissible as the
     *  first character in a Unicode identifier.
     */
    @stub
    def isUnicodeIdentifierStart(ch: Char): Boolean = ???

    /** Determines if the specified character (Unicode code point) is permissible as the
     *  first character in a Unicode identifier.
     */
    @stub
    def isUnicodeIdentifierStart(codePoint: Int): Boolean = ???

    /** Determines if the specified character is an uppercase character. */
    @stub
    def isUpperCase(ch: Char): Boolean = ???

    /** Determines if the specified character (Unicode code point) is an uppercase character. */
    @stub
    def isUpperCase(codePoint: Int): Boolean = ???

    /** Determines whether the specified code point is a valid
     *  
     *  Unicode code point value.
     */
    @stub
    def isValidCodePoint(codePoint: Int): Boolean = ???

    /** Determines if the specified character is white space according to Java. */
    @stub
    def isWhitespace(ch: Char): Boolean = ???

    /** Determines if the specified character (Unicode code point) is
     *  white space according to Java.
     */
    @stub
    def isWhitespace(codePoint: Int): Boolean = ???

    /** Returns the trailing surrogate (a
     *  
     *  low surrogate code unit) of the
     *  
     *  surrogate pair
     *  representing the specified supplementary character (Unicode
     *  code point) in the UTF-16 encoding.
     */
    @stub
    def lowSurrogate(codePoint: Int): Char = ???

    /** Returns the index within the given char subarray
     *  that is offset from the given index by
     *  codePointOffset code points.
     */
    @stub
    def offsetByCodePoints(a: Array[Char], start: Int, count: Int, index: Int, codePointOffset: Int): Int = ???

    /** Returns the index within the given char sequence that is offset
     *  from the given index by codePointOffset
     *  code points.
     */
    @stub
    def offsetByCodePoints(seq: CharSequence, index: Int, codePointOffset: Int): Int = ???

    /** Returns the value obtained by reversing the order of the bytes in the
     *  specified char value.
     */
    @stub
    def reverseBytes(ch: Char): Char = ???

    /** Converts the specified character (Unicode code point) to its
     *  UTF-16 representation stored in a char array.
     */
    @stub
    def toChars(codePoint: Int): Array[Char] = ???

    /** Converts the specified character (Unicode code point) to its
     *  UTF-16 representation.
     */
    @stub
    def toChars(codePoint: Int, dst: Array[Char], dstIndex: Int): Int = ???

    /** Converts the specified surrogate pair to its supplementary code
     *  point value.
     */
    @stub
    def toCodePoint(high: Char, low: Char): Int = ???

    /** Converts the character argument to lowercase using case
     *  mapping information from the UnicodeData file.
     */
    @stub
    def toLowerCase(ch: Char): Char = ???

    /** Converts the character (Unicode code point) argument to
     *  lowercase using case mapping information from the UnicodeData
     *  file.
     */
    @stub
    def toLowerCase(codePoint: Int): Int = ???

    /** Returns a String object representing the
     *  specified char.
     */
    @stub
    def toString(c: Char): String = ???

    /** Converts the character argument to titlecase using case mapping
     *  information from the UnicodeData file.
     */
    @stub
    def toTitleCase(ch: Char): Char = ???

    /** Converts the character (Unicode code point) argument to titlecase using case mapping
     *  information from the UnicodeData file.
     */
    @stub
    def toTitleCase(codePoint: Int): Int = ???

    /** Converts the character argument to uppercase using case mapping
     *  information from the UnicodeData file.
     */
    @stub
    def toUpperCase(ch: Char): Char = ???

    /** Converts the character (Unicode code point) argument to
     *  uppercase using case mapping information from the UnicodeData
     *  file.
     */
    @stub
    def toUpperCase(codePoint: Int): Int = ???

    /** Returns a Character instance representing the specified
     *  char value.
     */
    @stub
    def valueOf(c: Char): Character = ???
}
