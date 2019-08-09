package java.lang

import java.io.Serializable
import java.nio.charset.Charset
import java.util.{Comparator, Locale}
import scala.scalanative.annotation.stub

/** The String class represents character strings. All
 *  string literals in Java programs, such as "abc", are
 *  implemented as instances of this class.
 *  
 *  Strings are constant; their values cannot be changed after they
 *  are created. String buffers support mutable strings.
 *  Because String objects are immutable they can be shared. For example:
 *  
 *      String str = "abc";
 *  
 *  is equivalent to:
 *  
 *      char data[] = {'a', 'b', 'c'};
 *      String str = new String(data);
 *  
 *  Here are some more examples of how strings can be used:
 *  
 *      System.out.println("abc");
 *      String cde = "cde";
 *      System.out.println("abc" + cde);
 *      String c = "abc".substring(2,3);
 *      String d = cde.substring(1, 2);
 *  
 *  
 *  The class String includes methods for examining
 *  individual characters of the sequence, for comparing strings, for
 *  searching strings, for extracting substrings, and for creating a
 *  copy of a string with all characters translated to uppercase or to
 *  lowercase. Case mapping is based on the Unicode Standard version
 *  specified by the Character class.
 *  
 *  The Java language provides special support for the string
 *  concatenation operator ( + ), and for conversion of
 *  other objects to strings. String concatenation is implemented
 *  through the StringBuilder(or StringBuffer)
 *  class and its append method.
 *  String conversions are implemented through the method
 *  toString, defined by Object and
 *  inherited by all classes in Java. For additional information on
 *  string concatenation and conversion, see Gosling, Joy, and Steele,
 *  The Java Language Specification.
 * 
 *   Unless otherwise noted, passing a null argument to a constructor
 *  or method in this class will cause a NullPointerException to be
 *  thrown.
 * 
 *  A String represents a string in the UTF-16 format
 *  in which supplementary characters are represented by surrogate
 *  pairs (see the section Unicode
 *  Character Representations in the Character class for
 *  more information).
 *  Index values refer to char code units, so a supplementary
 *  character uses two positions in a String.
 *  The String class provides methods for dealing with
 *  Unicode code points (i.e., characters), in addition to those for
 *  dealing with Unicode code units (i.e., char values).
 */
final class String extends Object with Serializable with Comparable[String] with CharSequence {

    /** Initializes a newly created String object so that it represents
     *  an empty character sequence.
     */
    @stub
    def this() = ???

    /** Constructs a new String by decoding the specified array of bytes
     *  using the platform's default charset.
     */
    @stub
    def this(bytes: Array[Byte]) = ???

    /** Constructs a new String by decoding the specified array of
     *  bytes using the specified charset.
     */
    @stub
    def this(bytes: Array[Byte], charset: Charset) = ???

    /** Deprecated. 
     * This method does not properly convert bytes into
     *  characters.  As of JDK 1.1, the preferred way to do this is via the
     *  String constructors that take a Charset, charset name, or that use the platform's
     *  default charset.
     * 
     */
    @stub
    def this(ascii: Array[Byte], hibyte: Int) = ???

    /** Constructs a new String by decoding the specified subarray of
     *  bytes using the platform's default charset.
     */
    @stub
    def this(bytes: Array[Byte], offset: Int, length: Int) = ???

    /** Constructs a new String by decoding the specified subarray of
     *  bytes using the specified charset.
     */
    @stub
    def this(bytes: Array[Byte], offset: Int, length: Int, charset: Charset) = ???

    /** Deprecated. 
     * This method does not properly convert bytes into characters.
     *  As of JDK 1.1, the preferred way to do this is via the
     *  String constructors that take a Charset, charset name, or that use the platform's
     *  default charset.
     * 
     */
    @stub
    def this(ascii: Array[Byte], hibyte: Int, offset: Int, count: Int) = ???

    /** Constructs a new String by decoding the specified subarray of
     *  bytes using the specified charset.
     */
    @stub
    def this(bytes: Array[Byte], offset: Int, length: Int, charsetName: String) = ???

    /** Constructs a new String by decoding the specified array of bytes
     *  using the specified charset.
     */
    @stub
    def this(bytes: Array[Byte], charsetName: String) = ???

    /** Allocates a new String so that it represents the sequence of
     *  characters currently contained in the character array argument.
     */
    @stub
    def this(value: Array[Char]) = ???

    /** Allocates a new String that contains characters from a subarray
     *  of the character array argument.
     */
    @stub
    def this(value: Array[Char], offset: Int, count: Int) = ???

    /** Allocates a new String that contains characters from a subarray
     *  of the Unicode code point array
     *  argument.
     */
    @stub
    def this(codePoints: Array[Int], offset: Int, count: Int) = ???

    /** Initializes a newly created String object so that it represents
     *  the same sequence of characters as the argument; in other words, the
     *  newly created string is a copy of the argument string.
     */
    @stub
    def this(original: String) = ???

    /** Allocates a new string that contains the sequence of characters
     *  currently contained in the string buffer argument.
     */
    @stub
    def this(buffer: StringBuffer) = ???

    /** Allocates a new string that contains the sequence of characters
     *  currently contained in the string builder argument.
     */
    @stub
    def this(builder: StringBuilder) = ???

    /** Returns the char value at the
     *  specified index.
     */
    @stub
    def charAt(index: Int): Char = ???

    /** Returns the character (Unicode code point) at the specified
     *  index.
     */
    @stub
    def codePointAt(index: Int): Int = ???

    /** Returns the character (Unicode code point) before the specified
     *  index.
     */
    @stub
    def codePointBefore(index: Int): Int = ???

    /** Returns the number of Unicode code points in the specified text
     *  range of this String.
     */
    @stub
    def codePointCount(beginIndex: Int, endIndex: Int): Int = ???

    /** Compares two strings lexicographically. */
    @stub
    def compareTo(anotherString: String): Int = ???

    /** Compares two strings lexicographically, ignoring case
     *  differences.
     */
    @stub
    def compareToIgnoreCase(str: String): Int = ???

    /** Concatenates the specified string to the end of this string. */
    @stub
    def concat(str: String): String = ???

    /** Returns true if and only if this string contains the specified
     *  sequence of char values.
     */
    @stub
    def contains(s: CharSequence): Boolean = ???

    /** Compares this string to the specified CharSequence. */
    @stub
    def contentEquals(cs: CharSequence): Boolean = ???

    /** Compares this string to the specified StringBuffer. */
    @stub
    def contentEquals(sb: StringBuffer): Boolean = ???

    /** Tests if this string ends with the specified suffix. */
    @stub
    def endsWith(suffix: String): Boolean = ???

    /** Compares this string to the specified object. */
    @stub
    def equals(anObject: Object): Boolean = ???

    /** Compares this String to another String, ignoring case
     *  considerations.
     */
    @stub
    def equalsIgnoreCase(anotherString: String): Boolean = ???

    /** Encodes this String into a sequence of bytes using the
     *  platform's default charset, storing the result into a new byte array.
     */
    @stub
    def getBytes(): Array[Byte] = ???

    /** Encodes this String into a sequence of bytes using the given
     *  charset, storing the result into a
     *  new byte array.
     */
    @stub
    def getBytes(charset: Charset): Array[Byte] = ???

    /** Deprecated. 
     * This method does not properly convert characters into
     *  bytes.  As of JDK 1.1, the preferred way to do this is via the
     *  getBytes() method, which uses the platform's default charset.
     * 
     */
    @stub
    def getBytes(srcBegin: Int, srcEnd: Int, dst: Array[Byte], dstBegin: Int): Unit = ???

    /** Encodes this String into a sequence of bytes using the named
     *  charset, storing the result into a new byte array.
     */
    @stub
    def getBytes(charsetName: String): Array[Byte] = ???

    /** Copies characters from this string into the destination character
     *  array.
     */
    @stub
    def getChars(srcBegin: Int, srcEnd: Int, dst: Array[Char], dstBegin: Int): Unit = ???

    /** Returns a hash code for this string. */
    @stub
    def hashCode(): Int = ???

    /** Returns the index within this string of the first occurrence of
     *  the specified character.
     */
    @stub
    def indexOf(ch: Int): Int = ???

    /** Returns the index within this string of the first occurrence of the
     *  specified character, starting the search at the specified index.
     */
    @stub
    def indexOf(ch: Int, fromIndex: Int): Int = ???

    /** Returns the index within this string of the first occurrence of the
     *  specified substring.
     */
    @stub
    def indexOf(str: String): Int = ???

    /** Returns the index within this string of the first occurrence of the
     *  specified substring, starting at the specified index.
     */
    @stub
    def indexOf(str: String, fromIndex: Int): Int = ???

    /** Returns a canonical representation for the string object. */
    @stub
    def intern(): String = ???

    /** Returns true if, and only if, length() is 0. */
    @stub
    def isEmpty(): Boolean = ???

    /** Returns the index within this string of the last occurrence of
     *  the specified character.
     */
    @stub
    def lastIndexOf(ch: Int): Int = ???

    /** Returns the index within this string of the last occurrence of
     *  the specified character, searching backward starting at the
     *  specified index.
     */
    @stub
    def lastIndexOf(ch: Int, fromIndex: Int): Int = ???

    /** Returns the index within this string of the last occurrence of the
     *  specified substring.
     */
    @stub
    def lastIndexOf(str: String): Int = ???

    /** Returns the index within this string of the last occurrence of the
     *  specified substring, searching backward starting at the specified index.
     */
    @stub
    def lastIndexOf(str: String, fromIndex: Int): Int = ???

    /** Returns the length of this string. */
    @stub
    def length(): Int = ???

    /** Tells whether or not this string matches the given regular expression. */
    @stub
    def matches(regex: String): Boolean = ???

    /** Returns the index within this String that is
     *  offset from the given index by
     *  codePointOffset code points.
     */
    @stub
    def offsetByCodePoints(index: Int, codePointOffset: Int): Int = ???

    /** Tests if two string regions are equal. */
    @stub
    def regionMatches(ignoreCase: Boolean, toffset: Int, other: String, ooffset: Int, len: Int): Boolean = ???

    /** Tests if two string regions are equal. */
    @stub
    def regionMatches(toffset: Int, other: String, ooffset: Int, len: Int): Boolean = ???

    /** Returns a string resulting from replacing all occurrences of
     *  oldChar in this string with newChar.
     */
    @stub
    def replace(oldChar: Char, newChar: Char): String = ???

    /** Replaces each substring of this string that matches the literal target
     *  sequence with the specified literal replacement sequence.
     */
    @stub
    def replace(target: CharSequence, replacement: CharSequence): String = ???

    /** Replaces each substring of this string that matches the given regular expression with the
     *  given replacement.
     */
    @stub
    def replaceAll(regex: String, replacement: String): String = ???

    /** Replaces the first substring of this string that matches the given regular expression with the
     *  given replacement.
     */
    @stub
    def replaceFirst(regex: String, replacement: String): String = ???

    /** Splits this string around matches of the given regular expression. */
    @stub
    def split(regex: String): Array[String] = ???

    /** Splits this string around matches of the given
     *  regular expression.
     */
    @stub
    def split(regex: String, limit: Int): Array[String] = ???

    /** Tests if this string starts with the specified prefix. */
    @stub
    def startsWith(prefix: String): Boolean = ???

    /** Tests if the substring of this string beginning at the
     *  specified index starts with the specified prefix.
     */
    @stub
    def startsWith(prefix: String, toffset: Int): Boolean = ???

    /** Returns a character sequence that is a subsequence of this sequence. */
    @stub
    def subSequence(beginIndex: Int, endIndex: Int): CharSequence = ???

    /** Returns a string that is a substring of this string. */
    @stub
    def substring(beginIndex: Int): String = ???

    /** Returns a string that is a substring of this string. */
    @stub
    def substring(beginIndex: Int, endIndex: Int): String = ???

    /** Converts this string to a new character array. */
    @stub
    def toCharArray(): Array[Char] = ???

    /** Converts all of the characters in this String to lower
     *  case using the rules of the default locale.
     */
    @stub
    def toLowerCase(): String = ???

    /** Converts all of the characters in this String to lower
     *  case using the rules of the given Locale.
     */
    @stub
    def toLowerCase(locale: Locale): String = ???

    /** This object (which is already a string!) is itself returned. */
    @stub
    def toString(): String = ???

    /** Converts all of the characters in this String to upper
     *  case using the rules of the default locale.
     */
    @stub
    def toUpperCase(): String = ???

    /** Converts all of the characters in this String to upper
     *  case using the rules of the given Locale.
     */
    @stub
    def toUpperCase(locale: Locale): String = ???

    /** Returns a string whose value is this string, with any leading and trailing
     *  whitespace removed.
     */
    @stub
    def trim(): String = ???
}

object String {
    /** A Comparator that orders String objects as by
     *  compareToIgnoreCase.
     */
    @stub
    val CASE_INSENSITIVE_ORDER: Comparator[String] = ???

    /** Equivalent to valueOf(char[]). */
    @stub
    def copyValueOf(data: Array[Char]): String = ???

    /** Equivalent to valueOf(char[], int, int). */
    @stub
    def copyValueOf(data: Array[Char], offset: Int, count: Int): String = ???

    /** Returns a formatted string using the specified locale, format string,
     *  and arguments.
     */
    @stub
    def format(l: Locale, format: String, args: Object*): String = ???

    /** Returns a formatted string using the specified format string and
     *  arguments.
     */
    @stub
    def format(format: String, args: Object*): String = ???

    /** Returns a new String composed of copies of the
     *  CharSequence elements joined together with a copy of
     *  the specified delimiter.
     */
    @stub
    def join(delimiter: CharSequence, elements: CharSequence*): String = ???

    /** Returns a new String composed of copies of the
     *  CharSequence elements joined together with a copy of the
     *  specified delimiter.
     */
    @stub
    def join(delimiter: CharSequence, elements: Iterable[_ <: CharSequence]): String = ???

    /** Returns the string representation of the boolean argument. */
    @stub
    def valueOf(b: Boolean): String = ???

    /** Returns the string representation of the char
     *  argument.
     */
    @stub
    def valueOf(c: Char): String = ???

    /** Returns the string representation of the char array
     *  argument.
     */
    @stub
    def valueOf(data: Array[Char]): String = ???

    /** Returns the string representation of a specific subarray of the
     *  char array argument.
     */
    @stub
    def valueOf(data: Array[Char], offset: Int, count: Int): String = ???

    /** Returns the string representation of the double argument. */
    @stub
    def valueOf(d: Double): String = ???

    /** Returns the string representation of the float argument. */
    @stub
    def valueOf(f: Float): String = ???

    /** Returns the string representation of the int argument. */
    @stub
    def valueOf(i: Int): String = ???

    /** Returns the string representation of the long argument. */
    @stub
    def valueOf(l: Long): String = ???

    /** Returns the string representation of the Object argument. */
    @stub
    def valueOf(obj: Object): String = ???
}
