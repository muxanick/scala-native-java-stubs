package java.lang

import java.io.Serializable
import java.nio.charset.Charset
import java.util.Locale

// The String class represents character strings. All
// string literals in Java programs, such as "abc", are
// implemented as instances of this class.
// 
// Strings are constant; their values cannot be changed after they
// are created. String buffers support mutable strings.
// Because String objects are immutable they can be shared. For example:
// 
//     String str = "abc";
// 
// is equivalent to:
// 
//     char data[] = {'a', 'b', 'c'};
//     String str = new String(data);
// 
// Here are some more examples of how strings can be used:
// 
//     System.out.println("abc");
//     String cde = "cde";
//     System.out.println("abc" + cde);
//     String c = "abc".substring(2,3);
//     String d = cde.substring(1, 2);
// 
// 
// The class String includes methods for examining
// individual characters of the sequence, for comparing strings, for
// searching strings, for extracting substrings, and for creating a
// copy of a string with all characters translated to uppercase or to
// lowercase. Case mapping is based on the Unicode Standard version
// specified by the Character class.
// 
// The Java language provides special support for the string
// concatenation operator ( + ), and for conversion of
// other objects to strings. String concatenation is implemented
// through the StringBuilder(or StringBuffer)
// class and its append method.
// String conversions are implemented through the method
// toString, defined by Object and
// inherited by all classes in Java. For additional information on
// string concatenation and conversion, see Gosling, Joy, and Steele,
// The Java Language Specification.
//
//  Unless otherwise noted, passing a null argument to a constructor
// or method in this class will cause a NullPointerException to be
// thrown.
//
// A String represents a string in the UTF-16 format
// in which supplementary characters are represented by surrogate
// pairs (see the section Unicode
// Character Representations in the Character class for
// more information).
// Index values refer to char code units, so a supplementary
// character uses two positions in a String.
// The String class provides methods for dealing with
// Unicode code points (i.e., characters), in addition to those for
// dealing with Unicode code units (i.e., char values).
final class String extends Object with Serializable, with Comparable[String], with CharSequence {

    @stub
    // Initializes a newly created String object so that it represents
    // an empty character sequence.
    def this() = ???

    @stub
    // Constructs a new String by decoding the specified array of bytes
    // using the platform's default charset.
    def this(bytes: Array[Byte]) = ???

    @stub
    // Constructs a new String by decoding the specified array of
    // bytes using the specified charset.
    def this(bytes: Array[Byte], charset: Charset) = ???

    @stub
    // Deprecated. 
    //This method does not properly convert bytes into
    // characters.  As of JDK 1.1, the preferred way to do this is via the
    // String constructors that take a Charset, charset name, or that use the platform's
    // default charset.
    //
    def this(ascii: Array[Byte], hibyte: Int) = ???

    @stub
    // Constructs a new String by decoding the specified subarray of
    // bytes using the platform's default charset.
    def this(bytes: Array[Byte], offset: Int, length: Int) = ???

    @stub
    // Constructs a new String by decoding the specified subarray of
    // bytes using the specified charset.
    def this(bytes: Array[Byte], offset: Int, length: Int, charset: Charset) = ???

    @stub
    // Deprecated. 
    //This method does not properly convert bytes into characters.
    // As of JDK 1.1, the preferred way to do this is via the
    // String constructors that take a Charset, charset name, or that use the platform's
    // default charset.
    //
    def this(ascii: Array[Byte], hibyte: Int, offset: Int, count: Int) = ???

    @stub
    // Constructs a new String by decoding the specified subarray of
    // bytes using the specified charset.
    def this(bytes: Array[Byte], offset: Int, length: Int, charsetName: String) = ???

    @stub
    // Constructs a new String by decoding the specified array of bytes
    // using the specified charset.
    def this(bytes: Array[Byte], charsetName: String) = ???

    @stub
    // Allocates a new String so that it represents the sequence of
    // characters currently contained in the character array argument.
    def this(value: Array[Char]) = ???

    @stub
    // Allocates a new String that contains characters from a subarray
    // of the character array argument.
    def this(value: Array[Char], offset: Int, count: Int) = ???

    @stub
    // Allocates a new String that contains characters from a subarray
    // of the Unicode code point array
    // argument.
    def this(codePoints: Array[Int], offset: Int, count: Int) = ???

    @stub
    // Initializes a newly created String object so that it represents
    // the same sequence of characters as the argument; in other words, the
    // newly created string is a copy of the argument string.
    def this(original: String) = ???

    @stub
    // Allocates a new string that contains the sequence of characters
    // currently contained in the string buffer argument.
    def this(buffer: StringBuffer) = ???

    @stub
    // Returns the char value at the
    // specified index.
    def charAt(index: Int): Char = ???

    @stub
    // Returns the character (Unicode code point) at the specified
    // index.
    def codePointAt(index: Int): Int = ???

    @stub
    // Returns the character (Unicode code point) before the specified
    // index.
    def codePointBefore(index: Int): Int = ???

    @stub
    // Returns the number of Unicode code points in the specified text
    // range of this String.
    def codePointCount(beginIndex: Int, endIndex: Int): Int = ???

    @stub
    // Compares two strings lexicographically.
    def compareTo(anotherString: String): Int = ???

    @stub
    // Compares two strings lexicographically, ignoring case
    // differences.
    def compareToIgnoreCase(str: String): Int = ???

    @stub
    // Concatenates the specified string to the end of this string.
    def concat(str: String): String = ???

    @stub
    // Returns true if and only if this string contains the specified
    // sequence of char values.
    def contains(s: CharSequence): Boolean = ???

    @stub
    // Compares this string to the specified CharSequence.
    def contentEquals(cs: CharSequence): Boolean = ???

    @stub
    // Compares this string to the specified StringBuffer.
    def contentEquals(sb: StringBuffer): Boolean = ???

    @stub
    // Tests if this string ends with the specified suffix.
    def endsWith(suffix: String): Boolean = ???

    @stub
    // Compares this string to the specified object.
    def equals(anObject: Object): Boolean = ???

    @stub
    // Compares this String to another String, ignoring case
    // considerations.
    def equalsIgnoreCase(anotherString: String): Boolean = ???

    @stub
    // Encodes this String into a sequence of bytes using the
    // platform's default charset, storing the result into a new byte array.
    def getBytes(): Array[Byte] = ???

    @stub
    // Encodes this String into a sequence of bytes using the given
    // charset, storing the result into a
    // new byte array.
    def getBytes(charset: Charset): Array[Byte] = ???

    @stub
    // Deprecated. 
    //This method does not properly convert characters into
    // bytes.  As of JDK 1.1, the preferred way to do this is via the
    // getBytes() method, which uses the platform's default charset.
    //
    def getBytes(srcBegin: Int, srcEnd: Int, dst: Array[Byte], dstBegin: Int): Unit = ???

    @stub
    // Encodes this String into a sequence of bytes using the named
    // charset, storing the result into a new byte array.
    def getBytes(charsetName: String): Array[Byte] = ???

    @stub
    // Copies characters from this string into the destination character
    // array.
    def getChars(srcBegin: Int, srcEnd: Int, dst: Array[Char], dstBegin: Int): Unit = ???

    @stub
    // Returns a hash code for this string.
    def hashCode(): Int = ???

    @stub
    // Returns the index within this string of the first occurrence of
    // the specified character.
    def indexOf(ch: Int): Int = ???

    @stub
    // Returns the index within this string of the first occurrence of the
    // specified character, starting the search at the specified index.
    def indexOf(ch: Int, fromIndex: Int): Int = ???

    @stub
    // Returns the index within this string of the first occurrence of the
    // specified substring.
    def indexOf(str: String): Int = ???

    @stub
    // Returns the index within this string of the first occurrence of the
    // specified substring, starting at the specified index.
    def indexOf(str: String, fromIndex: Int): Int = ???

    @stub
    // Returns a canonical representation for the string object.
    def intern(): String = ???

    @stub
    // Returns true if, and only if, length() is 0.
    def isEmpty(): Boolean = ???

    @stub
    // Returns the index within this string of the last occurrence of
    // the specified character.
    def lastIndexOf(ch: Int): Int = ???

    @stub
    // Returns the index within this string of the last occurrence of
    // the specified character, searching backward starting at the
    // specified index.
    def lastIndexOf(ch: Int, fromIndex: Int): Int = ???

    @stub
    // Returns the index within this string of the last occurrence of the
    // specified substring.
    def lastIndexOf(str: String): Int = ???

    @stub
    // Returns the index within this string of the last occurrence of the
    // specified substring, searching backward starting at the specified index.
    def lastIndexOf(str: String, fromIndex: Int): Int = ???

    @stub
    // Returns the length of this string.
    def length(): Int = ???

    @stub
    // Tells whether or not this string matches the given regular expression.
    def matches(regex: String): Boolean = ???

    @stub
    // Returns the index within this String that is
    // offset from the given index by
    // codePointOffset code points.
    def offsetByCodePoints(index: Int, codePointOffset: Int): Int = ???

    @stub
    // Tests if two string regions are equal.
    def regionMatches(ignoreCase: Boolean, toffset: Int, other: String, ooffset: Int, len: Int): Boolean = ???

    @stub
    // Tests if two string regions are equal.
    def regionMatches(toffset: Int, other: String, ooffset: Int, len: Int): Boolean = ???

    @stub
    // Returns a string resulting from replacing all occurrences of
    // oldChar in this string with newChar.
    def replace(oldChar: Char, newChar: Char): String = ???

    @stub
    // Replaces each substring of this string that matches the literal target
    // sequence with the specified literal replacement sequence.
    def replace(target: CharSequence, replacement: CharSequence): String = ???

    @stub
    // Replaces each substring of this string that matches the given regular expression with the
    // given replacement.
    def replaceAll(regex: String, replacement: String): String = ???

    @stub
    // Replaces the first substring of this string that matches the given regular expression with the
    // given replacement.
    def replaceFirst(regex: String, replacement: String): String = ???

    @stub
    // Splits this string around matches of the given regular expression.
    def split(regex: String): Array[String] = ???

    @stub
    // Splits this string around matches of the given
    // regular expression.
    def split(regex: String, limit: Int): Array[String] = ???

    @stub
    // Tests if this string starts with the specified prefix.
    def startsWith(prefix: String): Boolean = ???

    @stub
    // Tests if the substring of this string beginning at the
    // specified index starts with the specified prefix.
    def startsWith(prefix: String, toffset: Int): Boolean = ???

    @stub
    // Returns a character sequence that is a subsequence of this sequence.
    def subSequence(beginIndex: Int, endIndex: Int): CharSequence = ???

    @stub
    // Returns a string that is a substring of this string.
    def substring(beginIndex: Int): String = ???

    @stub
    // Returns a string that is a substring of this string.
    def substring(beginIndex: Int, endIndex: Int): String = ???

    @stub
    // Converts this string to a new character array.
    def toCharArray(): Array[Char] = ???

    @stub
    // Converts all of the characters in this String to lower
    // case using the rules of the default locale.
    def toLowerCase(): String = ???

    @stub
    // Converts all of the characters in this String to lower
    // case using the rules of the given Locale.
    def toLowerCase(locale: Locale): String = ???

    @stub
    // This object (which is already a string!) is itself returned.
    def toString(): String = ???

    @stub
    // Converts all of the characters in this String to upper
    // case using the rules of the default locale.
    def toUpperCase(): String = ???

    @stub
    // Converts all of the characters in this String to upper
    // case using the rules of the given Locale.
    def toUpperCase(locale: Locale): String = ???

    @stub
    // Returns a string whose value is this string, with any leading and trailing
    // whitespace removed.
    def trim(): String = ???
}

object String {
    @stub
    // Equivalent to valueOf(char[]).
    def copyValueOf(data: Array[Char]): String = ???

    @stub
    // Equivalent to valueOf(char[], int, int).
    def copyValueOf(data: Array[Char], offset: Int, count: Int): String = ???

    @stub
    // Returns a formatted string using the specified locale, format string,
    // and arguments.
    def format(l: Locale, format: String, args: Object*): String = ???

    @stub
    // Returns a formatted string using the specified format string and
    // arguments.
    def format(format: String, args: Object*): String = ???

    @stub
    // Returns a new String composed of copies of the
    // CharSequence elements joined together with a copy of
    // the specified delimiter.
    def join(delimiter: CharSequence, elements: CharSequence*): String = ???

    @stub
    // Returns a new String composed of copies of the
    // CharSequence elements joined together with a copy of the
    // specified delimiter.
    def join(delimiter: CharSequence, elements: Iterable[_ <: CharSequence]): String = ???

    @stub
    // Returns the string representation of the boolean argument.
    def valueOf(b: Boolean): String = ???

    @stub
    // Returns the string representation of the char
    // argument.
    def valueOf(c: Char): String = ???

    @stub
    // Returns the string representation of the char array
    // argument.
    def valueOf(data: Array[Char]): String = ???

    @stub
    // Returns the string representation of a specific subarray of the
    // char array argument.
    def valueOf(data: Array[Char], offset: Int, count: Int): String = ???

    @stub
    // Returns the string representation of the double argument.
    def valueOf(d: double): String = ???

    @stub
    // Returns the string representation of the float argument.
    def valueOf(f: float): String = ???

    @stub
    // Returns the string representation of the int argument.
    def valueOf(i: Int): String = ???

    @stub
    // Returns the string representation of the long argument.
    def valueOf(l: Long): String = ???
}
