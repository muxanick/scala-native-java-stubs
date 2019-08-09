package java.nio

import java.lang.{Comparable, Object, String}
import scala.scalanative.annotation.stub

/** A short buffer.
 * 
 *   This class defines four categories of operations upon
 *  short buffers:
 * 
 *  
 * 
 *     Absolute and relative get and
 *    put methods that read and write
 *    single shorts; 
 * 
 *     Relative bulk get
 *    methods that transfer contiguous sequences of shorts from this buffer
 *    into an array; and
 * 
 *     Relative bulk put
 *    methods that transfer contiguous sequences of shorts from a
 *    short array or some other short
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
 *    a short buffer.  
 * 
 *  
 * 
 *   Short buffers can be created either by allocation, which allocates space for the buffer's
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 *  content, by wrapping an existing
 *  short array  into a buffer, or by creating a
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
 *   Like a byte buffer, a short buffer is either direct or non-direct.  A
 *  short buffer created via the wrap methods of this class will
 *  be non-direct.  A short buffer created as a view of a byte buffer will
 *  be direct if, and only if, the byte buffer itself is direct.  Whether or not
 *  a short buffer is direct may be determined by invoking the isDirect method.  
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
 *   Methods in this class that do not otherwise have a value to return are
 *  specified to return the buffer upon which they are invoked.  This allows
 *  method invocations to be chained.
 */
abstract class ShortBuffer extends Buffer with Comparable[ShortBuffer] {

    /** Returns the short array that backs this
     *  buffer  (optional operation).
     */
    def array(): Array[Short]

    /** Returns the offset within this buffer's backing array of the first
     *  element of the buffer  (optional operation).
     */
    def arrayOffset(): Int

    /** Creates a new, read-only short buffer that shares this buffer's
     *  content.
     */
    def asReadOnlyBuffer(): ShortBuffer

    /** Compacts this buffer  (optional operation). */
    def compact(): ShortBuffer

    /** Compares this buffer to another. */
    def compareTo(that: ShortBuffer): Int

    /** Creates a new short buffer that shares this buffer's content. */
    def duplicate(): ShortBuffer

    /** Tells whether or not this buffer is equal to another object. */
    def equals(ob: Object): Boolean

    /** Relative get method. */
    def get(): Short

    /** Absolute get method. */
    def get(index: Int): Short

    /** Relative bulk get method. */
    def get(dst: Array[Short]): ShortBuffer

    /** Relative bulk get method. */
    def get(dst: Array[Short], offset: Int, length: Int): ShortBuffer

    /** Tells whether or not this buffer is backed by an accessible short
     *  array.
     */
    def hasArray(): Boolean

    /** Returns the current hash code of this buffer. */
    def hashCode(): Int

    /** Tells whether or not this short buffer is direct. */
    def isDirect(): Boolean

    /** Retrieves this buffer's byte order. */
    def order(): ByteOrder

    /** Absolute put method  (optional operation). */
    def put(index: Int, s: Short): ShortBuffer

    /** Relative put method  (optional operation). */
    def put(s: Short): ShortBuffer

    /** Relative bulk put method  (optional operation). */
    def put(src: Array[Short]): ShortBuffer

    /** Relative bulk put method  (optional operation). */
    def put(src: Array[Short], offset: Int, length: Int): ShortBuffer

    /** Relative bulk put method  (optional operation). */
    def put(src: ShortBuffer): ShortBuffer

    /** Creates a new short buffer whose content is a shared subsequence of
     *  this buffer's content.
     */
    def slice(): ShortBuffer

    /** Returns a string summarizing the state of this buffer. */
    def toString(): String
}

object ShortBuffer {
    /** Allocates a new short buffer. */
    @stub
    def allocate(capacity: Int): ShortBuffer = ???

    /** Wraps a short array into a buffer. */
    @stub
    def wrap(array: Array[Short]): ShortBuffer = ???

    /** Wraps a short array into a buffer. */
    @stub
    def wrap(array: Array[Short], offset: Int, length: Int): ShortBuffer = ???
}
