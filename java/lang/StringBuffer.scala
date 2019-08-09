package java.lang

import java.io.Serializable

/** A thread-safe, mutable sequence of characters.
 *  A string buffer is like a String, but can be modified. At any
 *  point in time it contains some particular sequence of characters, but
 *  the length and content of the sequence can be changed through certain
 *  method calls.
 *  
 *  String buffers are safe for use by multiple threads. The methods
 *  are synchronized where necessary so that all the operations on any
 *  particular instance behave as if they occur in some serial order
 *  that is consistent with the order of the method calls made by each of
 *  the individual threads involved.
 *  
 *  The principal operations on a StringBuffer are the
 *  append and insert methods, which are
 *  overloaded so as to accept data of any type. Each effectively
 *  converts a given datum to a string and then appends or inserts the
 *  characters of that string to the string buffer. The
 *  append method always adds these characters at the end
 *  of the buffer; the insert method adds the characters at
 *  a specified point.
 *  
 *  For example, if z refers to a string buffer object
 *  whose current contents are "start", then
 *  the method call z.append("le") would cause the string
 *  buffer to contain "startle", whereas
 *  z.insert(4, "le") would alter the string buffer to
 *  contain "starlet".
 *  
 *  In general, if sb refers to an instance of a StringBuffer,
 *  then sb.append(x) has the same effect as
 *  sb.insert(sb.length(), x).
 *  
 *  Whenever an operation occurs involving a source sequence (such as
 *  appending or inserting from a source sequence), this class synchronizes
 *  only on the string buffer performing the operation, not on the source.
 *  Note that while StringBuffer is designed to be safe to use
 *  concurrently from multiple threads, if the constructor or the
 *  append or insert operation is passed a source sequence
 *  that is shared across threads, the calling code must ensure
 *  that the operation has a consistent and unchanging view of the source
 *  sequence for the duration of the operation.
 *  This could be satisfied by the caller holding a lock during the
 *  operation's call, by using an immutable source sequence, or by not
 *  sharing the source sequence across threads.
 *  
 *  Every string buffer has a capacity. As long as the length of the
 *  character sequence contained in the string buffer does not exceed
 *  the capacity, it is not necessary to allocate a new internal
 *  buffer array. If the internal buffer overflows, it is
 *  automatically made larger.
 *  
 *  Unless otherwise noted, passing a null argument to a constructor
 *  or method in this class will cause a NullPointerException to be
 *  thrown.
 *  
 *  As of  release JDK 5, this class has been supplemented with an equivalent
 *  class designed for use by a single thread, StringBuilder.  The
 *  StringBuilder class should generally be used in preference to
 *  this one, as it supports all of the same operations but it is faster, as
 *  it performs no synchronization.
 */
final class StringBuffer extends Object with Serializable with CharSequence {

    /** Constructs a string buffer with no characters in it and an
     *  initial capacity of 16 characters.
     */
    @stub
    def this() = ???

    /** Constructs a string buffer that contains the same characters
     *  as the specified CharSequence.
     */
    @stub
    def this(seq: CharSequence) = ???

    /** Constructs a string buffer with no characters in it and
     *  the specified initial capacity.
     */
    @stub
    def this(capacity: Int) = ???

    /** Appends the string representation of the boolean
     *  argument to the sequence.
     */
    @stub
    def append(b: Boolean): StringBuffer = ???

    /** Appends the string representation of the char
     *  argument to this sequence.
     */
    @stub
    def append(c: Char): StringBuffer = ???

    /** Appends the string representation of the char array
     *  argument to this sequence.
     */
    @stub
    def append(str: Array[Char]): StringBuffer = ???

    /** Appends the string representation of a subarray of the
     *  char array argument to this sequence.
     */
    @stub
    def append(str: Array[Char], offset: Int, len: Int): StringBuffer = ???

    /** Appends the specified CharSequence to this
     *  sequence.
     */
    @stub
    def append(s: CharSequence): StringBuffer = ???

    /** Appends a subsequence of the specified CharSequence to this
     *  sequence.
     */
    @stub
    def append(s: CharSequence, start: Int, end: Int): StringBuffer = ???

    /** Appends the string representation of the double
     *  argument to this sequence.
     */
    @stub
    def append(d: Double): StringBuffer = ???

    /** Appends the string representation of the float
     *  argument to this sequence.
     */
    @stub
    def append(f: Float): StringBuffer = ???

    /** Appends the string representation of the int
     *  argument to this sequence.
     */
    @stub
    def append(i: Int): StringBuffer = ???

    /** Appends the string representation of the long
     *  argument to this sequence.
     */
    @stub
    def append(lng: Long): StringBuffer = ???

    /** Appends the string representation of the Object argument. */
    @stub
    def append(obj: Object): StringBuffer = ???

    /** Appends the specified string to this character sequence. */
    @stub
    def append(str: String): StringBuffer = ???

    /** Appends the specified StringBuffer to this sequence. */
    @stub
    def append(sb: StringBuffer): StringBuffer = ???

    /** Appends the string representation of the codePoint
     *  argument to this sequence.
     */
    @stub
    def appendCodePoint(codePoint: Int): StringBuffer = ???

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
    def delete(start: Int, end: Int): StringBuffer = ???

    /** Removes the char at the specified position in this
     *  sequence.
     */
    @stub
    def deleteCharAt(index: Int): StringBuffer = ???

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
    def insert(offset: Int, b: Boolean): StringBuffer = ???

    /** Inserts the string representation of the char
     *  argument into this sequence.
     */
    @stub
    def insert(offset: Int, c: Char): StringBuffer = ???

    /** Inserts the string representation of the char array
     *  argument into this sequence.
     */
    @stub
    def insert(offset: Int, str: Array[Char]): StringBuffer = ???

    /** Inserts the string representation of a subarray of the str
     *  array argument into this sequence.
     */
    @stub
    def insert(index: Int, str: Array[Char], offset: Int, len: Int): StringBuffer = ???

    /** Inserts the specified CharSequence into this sequence. */
    @stub
    def insert(dstOffset: Int, s: CharSequence): StringBuffer = ???

    /** Inserts a subsequence of the specified CharSequence into
     *  this sequence.
     */
    @stub
    def insert(dstOffset: Int, s: CharSequence, start: Int, end: Int): StringBuffer = ???

    /** Inserts the string representation of the double
     *  argument into this sequence.
     */
    @stub
    def insert(offset: Int, d: Double): StringBuffer = ???

    /** Inserts the string representation of the float
     *  argument into this sequence.
     */
    @stub
    def insert(offset: Int, f: Float): StringBuffer = ???

    /** Inserts the string representation of the second int
     *  argument into this sequence.
     */
    @stub
    def insert(offset: Int, i: Int): StringBuffer = ???

    /** Inserts the string representation of the long
     *  argument into this sequence.
     */
    @stub
    def insert(offset: Int, l: Long): StringBuffer = ???

    /** Inserts the string representation of the Object
     *  argument into this character sequence.
     */
    @stub
    def insert(offset: Int, obj: Object): StringBuffer = ???

    /** Inserts the string into this character sequence. */
    @stub
    def insert(offset: Int, str: String): StringBuffer = ???

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
    def replace(start: Int, end: Int, str: String): StringBuffer = ???

    /** Causes this character sequence to be replaced by the reverse of
     *  the sequence.
     */
    @stub
    def reverse(): StringBuffer = ???

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
}
