package java.lang

import java.io.Serializable

// A mutable sequence of characters.  This class provides an API compatible
// with StringBuffer, but with no guarantee of synchronization.
// This class is designed for use as a drop-in replacement for
// StringBuffer in places where the string buffer was being
// used by a single thread (as is generally the case).   Where possible,
// it is recommended that this class be used in preference to
// StringBuffer as it will be faster under most implementations.
//
// The principal operations on a StringBuilder are the
// append and insert methods, which are
// overloaded so as to accept data of any type. Each effectively
// converts a given datum to a string and then appends or inserts the
// characters of that string to the string builder. The
// append method always adds these characters at the end
// of the builder; the insert method adds the characters at
// a specified point.
// 
// For example, if z refers to a string builder object
// whose current contents are "start", then
// the method call z.append("le") would cause the string
// builder to contain "startle", whereas
// z.insert(4, "le") would alter the string builder to
// contain "starlet".
// 
// In general, if sb refers to an instance of a StringBuilder,
// then sb.append(x) has the same effect as
// sb.insert(sb.length(), x).
// 
// Every string builder has a capacity. As long as the length of the
// character sequence contained in the string builder does not exceed
// the capacity, it is not necessary to allocate a new internal
// buffer. If the internal buffer overflows, it is automatically made larger.
//
// Instances of StringBuilder are not safe for
// use by multiple threads. If such synchronization is required then it is
// recommended that StringBuffer be used.
//
// Unless otherwise noted, passing a null argument to a constructor
// or method in this class will cause a NullPointerException to be
// thrown.
final class StringBuilder extends Object with Serializable, with CharSequence {

    @stub
    // Constructs a string builder with no characters in it and an
    // initial capacity of 16 characters.
    def this() = ???

    @stub
    // Constructs a string builder that contains the same characters
    // as the specified CharSequence.
    def this(seq: CharSequence) = ???

    @stub
    // Constructs a string builder with no characters in it and an
    // initial capacity specified by the capacity argument.
    def this(capacity: Int) = ???

    @stub
    // Appends the string representation of the boolean
    // argument to the sequence.
    def append(b: Boolean): StringBuilder = ???

    @stub
    // Appends the string representation of the char
    // argument to this sequence.
    def append(c: Char): StringBuilder = ???

    @stub
    // Appends the string representation of the char array
    // argument to this sequence.
    def append(str: Array[Char]): StringBuilder = ???

    @stub
    // Appends the string representation of a subarray of the
    // char array argument to this sequence.
    def append(str: Array[Char], offset: Int, len: Int): StringBuilder = ???

    @stub
    // Appends the specified character sequence to this Appendable.
    def append(s: CharSequence): StringBuilder = ???

    @stub
    // Appends a subsequence of the specified CharSequence to this
    // sequence.
    def append(s: CharSequence, start: Int, end: Int): StringBuilder = ???

    @stub
    // Appends the string representation of the double
    // argument to this sequence.
    def append(d: double): StringBuilder = ???

    @stub
    // Appends the string representation of the float
    // argument to this sequence.
    def append(f: float): StringBuilder = ???

    @stub
    // Appends the string representation of the int
    // argument to this sequence.
    def append(i: Int): StringBuilder = ???

    @stub
    // Appends the string representation of the long
    // argument to this sequence.
    def append(lng: Long): StringBuilder = ???

    @stub
    // Appends the string representation of the Object argument.
    def append(obj: Object): StringBuilder = ???

    @stub
    // Appends the specified string to this character sequence.
    def append(str: String): StringBuilder = ???

    @stub
    // Appends the specified StringBuffer to this sequence.
    def append(sb: StringBuffer): StringBuilder = ???

    @stub
    // Appends the string representation of the codePoint
    // argument to this sequence.
    def appendCodePoint(codePoint: Int): StringBuilder = ???

    @stub
    // Returns the current capacity.
    def capacity(): Int = ???

    @stub
    // Returns the char value in this sequence at the specified index.
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
    // range of this sequence.
    def codePointCount(beginIndex: Int, endIndex: Int): Int = ???

    @stub
    // Removes the characters in a substring of this sequence.
    def delete(start: Int, end: Int): StringBuilder = ???

    @stub
    // Removes the char at the specified position in this
    // sequence.
    def deleteCharAt(index: Int): StringBuilder = ???

    @stub
    // Ensures that the capacity is at least equal to the specified minimum.
    def ensureCapacity(minimumCapacity: Int): Unit = ???

    @stub
    // Characters are copied from this sequence into the
    // destination character array dst.
    def getChars(srcBegin: Int, srcEnd: Int, dst: Array[Char], dstBegin: Int): Unit = ???

    @stub
    // Returns the index within this string of the first occurrence of the
    // specified substring.
    def indexOf(str: String): Int = ???

    @stub
    // Returns the index within this string of the first occurrence of the
    // specified substring, starting at the specified index.
    def indexOf(str: String, fromIndex: Int): Int = ???

    @stub
    // Inserts the string representation of the boolean
    // argument into this sequence.
    def insert(offset: Int, b: Boolean): StringBuilder = ???

    @stub
    // Inserts the string representation of the char
    // argument into this sequence.
    def insert(offset: Int, c: Char): StringBuilder = ???

    @stub
    // Inserts the string representation of the char array
    // argument into this sequence.
    def insert(offset: Int, str: Array[Char]): StringBuilder = ???

    @stub
    // Inserts the string representation of a subarray of the str
    // array argument into this sequence.
    def insert(index: Int, str: Array[Char], offset: Int, len: Int): StringBuilder = ???

    @stub
    // Inserts the specified CharSequence into this sequence.
    def insert(dstOffset: Int, s: CharSequence): StringBuilder = ???

    @stub
    // Inserts a subsequence of the specified CharSequence into
    // this sequence.
    def insert(dstOffset: Int, s: CharSequence, start: Int, end: Int): StringBuilder = ???

    @stub
    // Inserts the string representation of the double
    // argument into this sequence.
    def insert(offset: Int, d: double): StringBuilder = ???

    @stub
    // Inserts the string representation of the float
    // argument into this sequence.
    def insert(offset: Int, f: float): StringBuilder = ???

    @stub
    // Inserts the string representation of the second int
    // argument into this sequence.
    def insert(offset: Int, i: Int): StringBuilder = ???

    @stub
    // Inserts the string representation of the long
    // argument into this sequence.
    def insert(offset: Int, l: Long): StringBuilder = ???

    @stub
    // Inserts the string representation of the Object
    // argument into this character sequence.
    def insert(offset: Int, obj: Object): StringBuilder = ???

    @stub
    // Inserts the string into this character sequence.
    def insert(offset: Int, str: String): StringBuilder = ???

    @stub
    // Returns the index within this string of the rightmost occurrence
    // of the specified substring.
    def lastIndexOf(str: String): Int = ???

    @stub
    // Returns the index within this string of the last occurrence of the
    // specified substring.
    def lastIndexOf(str: String, fromIndex: Int): Int = ???

    @stub
    // Returns the length (character count).
    def length(): Int = ???

    @stub
    // Returns the index within this sequence that is offset from the
    // given index by codePointOffset code
    // points.
    def offsetByCodePoints(index: Int, codePointOffset: Int): Int = ???

    @stub
    // Replaces the characters in a substring of this sequence
    // with characters in the specified String.
    def replace(start: Int, end: Int, str: String): StringBuilder = ???

    @stub
    // Causes this character sequence to be replaced by the reverse of
    // the sequence.
    def reverse(): StringBuilder = ???

    @stub
    // The character at the specified index is set to ch.
    def setCharAt(index: Int, ch: Char): Unit = ???

    @stub
    // Sets the length of the character sequence.
    def setLength(newLength: Int): Unit = ???

    @stub
    // Returns a new character sequence that is a subsequence of this sequence.
    def subSequence(start: Int, end: Int): CharSequence = ???

    @stub
    // Returns a new String that contains a subsequence of
    // characters currently contained in this character sequence.
    def substring(start: Int): String = ???

    @stub
    // Returns a new String that contains a subsequence of
    // characters currently contained in this sequence.
    def substring(start: Int, end: Int): String = ???

    @stub
    // Returns a string representing the data in this sequence.
    def toString(): String = ???
}
