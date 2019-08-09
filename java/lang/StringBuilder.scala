package java.lang

import java.io.Serializable
import scala.scalanative.annotation.stub

/** A mutable sequence of characters.  This class provides an API compatible
 *  with StringBuffer, but with no guarantee of synchronization.
 *  This class is designed for use as a drop-in replacement for
 *  StringBuffer in places where the string buffer was being
 *  used by a single thread (as is generally the case).   Where possible,
 *  it is recommended that this class be used in preference to
 *  StringBuffer as it will be faster under most implementations.
 * 
 *  The principal operations on a StringBuilder are the
 *  append and insert methods, which are
 *  overloaded so as to accept data of any type. Each effectively
 *  converts a given datum to a string and then appends or inserts the
 *  characters of that string to the string builder. The
 *  append method always adds these characters at the end
 *  of the builder; the insert method adds the characters at
 *  a specified point.
 *  
 *  For example, if z refers to a string builder object
 *  whose current contents are "start", then
 *  the method call z.append("le") would cause the string
 *  builder to contain "startle", whereas
 *  z.insert(4, "le") would alter the string builder to
 *  contain "starlet".
 *  
 *  In general, if sb refers to an instance of a StringBuilder,
 *  then sb.append(x) has the same effect as
 *  sb.insert(sb.length(), x).
 *  
 *  Every string builder has a capacity. As long as the length of the
 *  character sequence contained in the string builder does not exceed
 *  the capacity, it is not necessary to allocate a new internal
 *  buffer. If the internal buffer overflows, it is automatically made larger.
 * 
 *  Instances of StringBuilder are not safe for
 *  use by multiple threads. If such synchronization is required then it is
 *  recommended that StringBuffer be used.
 * 
 *  Unless otherwise noted, passing a null argument to a constructor
 *  or method in this class will cause a NullPointerException to be
 *  thrown.
 */
final class StringBuilder extends Object with Serializable with CharSequence {

    /** Constructs a string builder with no characters in it and an
     *  initial capacity of 16 characters.
     */
    @stub
    def this() = ???

    /** Constructs a string builder that contains the same characters
     *  as the specified CharSequence.
     */
    @stub
    def this(seq: CharSequence) = ???

    /** Constructs a string builder with no characters in it and an
     *  initial capacity specified by the capacity argument.
     */
    @stub
    def this(capacity: Int) = ???

    /** Constructs a string builder initialized to the contents of the
     *  specified string.
     */
    @stub
    def this(str: String) = ???

    /** Appends the string representation of the boolean
     *  argument to the sequence.
     */
    @stub
    def append(b: Boolean): StringBuilder = ???

    /** Appends the string representation of the char
     *  argument to this sequence.
     */
    @stub
    def append(c: Char): StringBuilder = ???

    /** Appends the string representation of the char array
     *  argument to this sequence.
     */
    @stub
    def append(str: Array[Char]): StringBuilder = ???

    /** Appends the string representation of a subarray of the
     *  char array argument to this sequence.
     */
    @stub
    def append(str: Array[Char], offset: Int, len: Int): StringBuilder = ???

    /** Appends the specified character sequence to this Appendable. */
    @stub
    def append(s: CharSequence): StringBuilder = ???

    /** Appends a subsequence of the specified CharSequence to this
     *  sequence.
     */
    @stub
    def append(s: CharSequence, start: Int, end: Int): StringBuilder = ???

    /** Appends the string representation of the double
     *  argument to this sequence.
     */
    @stub
    def append(d: Double): StringBuilder = ???

    /** Appends the string representation of the float
     *  argument to this sequence.
     */
    @stub
    def append(f: Float): StringBuilder = ???

    /** Appends the string representation of the int
     *  argument to this sequence.
     */
    @stub
    def append(i: Int): StringBuilder = ???

    /** Appends the string representation of the long
     *  argument to this sequence.
     */
    @stub
    def append(lng: Long): StringBuilder = ???

    /** Appends the string representation of the Object argument. */
    @stub
    def append(obj: Object): StringBuilder = ???

    /** Appends the specified string to this character sequence. */
    @stub
    def append(str: String): StringBuilder = ???

    /** Appends the specified StringBuffer to this sequence. */
    @stub
    def append(sb: StringBuffer): StringBuilder = ???

    /** Appends the string representation of the codePoint
     *  argument to this sequence.
     */
    @stub
    def appendCodePoint(codePoint: Int): StringBuilder = ???

    /** Returns the current capacity. */
    @stub
    def capacity(): Int = ???

    /** Returns the char value in this sequence at the specified index. */
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
     *  range of this sequence.
     */
    @stub
    def codePointCount(beginIndex: Int, endIndex: Int): Int = ???

    /** Removes the characters in a substring of this sequence. */
    @stub
    def delete(start: Int, end: Int): StringBuilder = ???

    /** Removes the char at the specified position in this
     *  sequence.
     */
    @stub
    def deleteCharAt(index: Int): StringBuilder = ???

    /** Ensures that the capacity is at least equal to the specified minimum. */
    @stub
    def ensureCapacity(minimumCapacity: Int): Unit = ???

    /** Characters are copied from this sequence into the
     *  destination character array dst.
     */
    @stub
    def getChars(srcBegin: Int, srcEnd: Int, dst: Array[Char], dstBegin: Int): Unit = ???

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

    /** Inserts the string representation of the boolean
     *  argument into this sequence.
     */
    @stub
    def insert(offset: Int, b: Boolean): StringBuilder = ???

    /** Inserts the string representation of the char
     *  argument into this sequence.
     */
    @stub
    def insert(offset: Int, c: Char): StringBuilder = ???

    /** Inserts the string representation of the char array
     *  argument into this sequence.
     */
    @stub
    def insert(offset: Int, str: Array[Char]): StringBuilder = ???

    /** Inserts the string representation of a subarray of the str
     *  array argument into this sequence.
     */
    @stub
    def insert(index: Int, str: Array[Char], offset: Int, len: Int): StringBuilder = ???

    /** Inserts the specified CharSequence into this sequence. */
    @stub
    def insert(dstOffset: Int, s: CharSequence): StringBuilder = ???

    /** Inserts a subsequence of the specified CharSequence into
     *  this sequence.
     */
    @stub
    def insert(dstOffset: Int, s: CharSequence, start: Int, end: Int): StringBuilder = ???

    /** Inserts the string representation of the double
     *  argument into this sequence.
     */
    @stub
    def insert(offset: Int, d: Double): StringBuilder = ???

    /** Inserts the string representation of the float
     *  argument into this sequence.
     */
    @stub
    def insert(offset: Int, f: Float): StringBuilder = ???

    /** Inserts the string representation of the second int
     *  argument into this sequence.
     */
    @stub
    def insert(offset: Int, i: Int): StringBuilder = ???

    /** Inserts the string representation of the long
     *  argument into this sequence.
     */
    @stub
    def insert(offset: Int, l: Long): StringBuilder = ???

    /** Inserts the string representation of the Object
     *  argument into this character sequence.
     */
    @stub
    def insert(offset: Int, obj: Object): StringBuilder = ???

    /** Inserts the string into this character sequence. */
    @stub
    def insert(offset: Int, str: String): StringBuilder = ???

    /** Returns the index within this string of the rightmost occurrence
     *  of the specified substring.
     */
    @stub
    def lastIndexOf(str: String): Int = ???

    /** Returns the index within this string of the last occurrence of the
     *  specified substring.
     */
    @stub
    def lastIndexOf(str: String, fromIndex: Int): Int = ???

    /** Returns the length (character count). */
    @stub
    def length(): Int = ???

    /** Returns the index within this sequence that is offset from the
     *  given index by codePointOffset code
     *  points.
     */
    @stub
    def offsetByCodePoints(index: Int, codePointOffset: Int): Int = ???

    /** Replaces the characters in a substring of this sequence
     *  with characters in the specified String.
     */
    @stub
    def replace(start: Int, end: Int, str: String): StringBuilder = ???

    /** Causes this character sequence to be replaced by the reverse of
     *  the sequence.
     */
    @stub
    def reverse(): StringBuilder = ???

    /** The character at the specified index is set to ch. */
    @stub
    def setCharAt(index: Int, ch: Char): Unit = ???

    /** Sets the length of the character sequence. */
    @stub
    def setLength(newLength: Int): Unit = ???

    /** Returns a new character sequence that is a subsequence of this sequence. */
    @stub
    def subSequence(start: Int, end: Int): CharSequence = ???

    /** Returns a new String that contains a subsequence of
     *  characters currently contained in this character sequence.
     */
    @stub
    def substring(start: Int): String = ???

    /** Returns a new String that contains a subsequence of
     *  characters currently contained in this sequence.
     */
    @stub
    def substring(start: Int, end: Int): String = ???

    /** Returns a string representing the data in this sequence. */
    @stub
    def toString(): String = ???

    /** Attempts to reduce storage used for the character sequence. */
    @stub
    def trimToSize(): Unit = ???
}
