package java.nio

import java.lang.{Appendable, CharSequence, Comparable, Object, Readable, String}
import java.util.stream.IntStream

/** A char buffer.
 * 
 *   This class defines four categories of operations upon
 *  char buffers:
 * 
 *  
 * 
 *     Absolute and relative get and
 *    put methods that read and write
 *    single chars; 
 * 
 *     Relative bulk get
 *    methods that transfer contiguous sequences of chars from this buffer
 *    into an array; and
 * 
 *     Relative bulk put
 *    methods that transfer contiguous sequences of chars from a
 *    char array, a string, or some other char
 *    buffer into this buffer; and 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 *     Methods for compacting, duplicating, and slicing
 *    a char buffer.  
 * 
 *  
 * 
 *   Char buffers can be created either by allocation, which allocates space for the buffer's
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 *  content, by wrapping an existing
 *  char array or string into a buffer, or by creating a
 *  view of an existing byte buffer.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 *   Like a byte buffer, a char buffer is either direct or non-direct.  A
 *  char buffer created via the wrap methods of this class will
 *  be non-direct.  A char buffer created as a view of a byte buffer will
 *  be direct if, and only if, the byte buffer itself is direct.  Whether or not
 *  a char buffer is direct may be determined by invoking the isDirect method.  
 * 
 * 
 * 
 * 
 * 
 *   This class implements the CharSequence interface so that
 *  character buffers may be used wherever character sequences are accepted, for
 *  example in the regular-expression package java.util.regex.
 *  
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 *   Methods in this class that do not otherwise have a value to return are
 *  specified to return the buffer upon which they are invoked.  This allows
 *  method invocations to be chained.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 *  The sequence of statements
 * 
 *  
 *  cb.put("text/");
 *  cb.put(subtype);
 *  cb.put("; charset=");
 *  cb.put(enc);
 * 
 *  can, for example, be replaced by the single statement
 * 
 *  
 *  cb.put("text/").put(subtype).put("; charset=").put(enc);
 */
abstract class CharBuffer extends Buffer with Comparable[CharBuffer] with Appendable with CharSequence with Readable {

    /** Appends the specified char  to this
     *  buffer  (optional operation).
     */
    def append(c: Char): CharBuffer

    /** Appends the specified character sequence  to this
     *  buffer  (optional operation).
     */
    def append(csq: CharSequence): CharBuffer

    /** Appends a subsequence of the  specified character sequence  to this
     *  buffer  (optional operation).
     */
    def append(csq: CharSequence, start: Int, end: Int): CharBuffer

    /** Returns the char array that backs this
     *  buffer  (optional operation).
     */
    def array(): Array[Char]

    /** Returns the offset within this buffer's backing array of the first
     *  element of the buffer  (optional operation).
     */
    def arrayOffset(): Int

    /** Creates a new, read-only char buffer that shares this buffer's
     *  content.
     */
    def asReadOnlyBuffer(): CharBuffer

    /** Reads the character at the given index relative to the current
     *  position.
     */
    def charAt(index: Int): Char

    /** Returns a stream of int zero-extending the char values
     *  from this sequence.
     */
    def chars(): IntStream

    /** Compacts this buffer  (optional operation). */
    def compact(): CharBuffer

    /** Compares this buffer to another. */
    def compareTo(that: CharBuffer): Int

    /** Creates a new char buffer that shares this buffer's content. */
    def duplicate(): CharBuffer

    /** Tells whether or not this buffer is equal to another object. */
    def equals(ob: Object): Boolean

    /** Relative get method. */
    def get(): Char

    /** Relative bulk get method. */
    def get(dst: Array[Char]): CharBuffer

    /** Relative bulk get method. */
    def get(dst: Array[Char], offset: Int, length: Int): CharBuffer

    /** Absolute get method. */
    def get(index: Int): Char

    /** Tells whether or not this buffer is backed by an accessible char
     *  array.
     */
    def hasArray(): Boolean

    /** Returns the current hash code of this buffer. */
    def hashCode(): Int

    /** Tells whether or not this char buffer is direct. */
    def isDirect(): Boolean

    /** Returns the length of this character buffer. */
    def length(): Int

    /** Retrieves this buffer's byte order. */
    def order(): ByteOrder

    /** Relative put method  (optional operation). */
    def put(c: Char): CharBuffer

    /** Relative bulk put method  (optional operation). */
    def put(src: Array[Char]): CharBuffer

    /** Relative bulk put method  (optional operation). */
    def put(src: Array[Char], offset: Int, length: Int): CharBuffer

    /** Relative bulk put method  (optional operation). */
    def put(src: CharBuffer): CharBuffer

    /** Absolute put method  (optional operation). */
    def put(index: Int, c: Char): CharBuffer

    /** Relative bulk put method  (optional operation). */
    def put(src: String): CharBuffer

    /** Relative bulk put method  (optional operation). */
    def put(src: String, start: Int, end: Int): CharBuffer

    /** Attempts to read characters into the specified character buffer. */
    def read(target: CharBuffer): Int

    /** Creates a new char buffer whose content is a shared subsequence of
     *  this buffer's content.
     */
    def slice(): CharBuffer

    /** Creates a new character buffer that represents the specified subsequence
     *  of this buffer, relative to the current position.
     */
    def subSequence(start: Int, end: Int): CharBuffer

    /** Returns a string containing the characters in this buffer. */
    def toString(): String
}

object CharBuffer {
    /** Allocates a new char buffer. */
    @stub
    def allocate(capacity: Int): CharBuffer = ???

    /** Wraps a char array into a buffer. */
    @stub
    def wrap(array: Array[Char]): CharBuffer = ???

    /** Wraps a char array into a buffer. */
    @stub
    def wrap(array: Array[Char], offset: Int, length: Int): CharBuffer = ???

    /** Wraps a character sequence into a buffer. */
    @stub
    def wrap(csq: CharSequence): CharBuffer = ???
}
