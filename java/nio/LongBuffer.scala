package java.nio

import java.lang.{Comparable, Object, String}

/** A long buffer.
 * 
 *   This class defines four categories of operations upon
 *  long buffers:
 * 
 *  
 * 
 *     Absolute and relative get and
 *    put methods that read and write
 *    single longs; 
 * 
 *     Relative bulk get
 *    methods that transfer contiguous sequences of longs from this buffer
 *    into an array; and
 * 
 *     Relative bulk put
 *    methods that transfer contiguous sequences of longs from a
 *    long array or some other long
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
 *    a long buffer.  
 * 
 *  
 * 
 *   Long buffers can be created either by allocation, which allocates space for the buffer's
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 *  content, by wrapping an existing
 *  long array  into a buffer, or by creating a
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
 *   Like a byte buffer, a long buffer is either direct or non-direct.  A
 *  long buffer created via the wrap methods of this class will
 *  be non-direct.  A long buffer created as a view of a byte buffer will
 *  be direct if, and only if, the byte buffer itself is direct.  Whether or not
 *  a long buffer is direct may be determined by invoking the isDirect method.  
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
abstract class LongBuffer extends Buffer with Comparable[LongBuffer] {

    /** Returns the long array that backs this
     *  buffer  (optional operation).
     */
    def array(): Array[Long]

    /** Returns the offset within this buffer's backing array of the first
     *  element of the buffer  (optional operation).
     */
    def arrayOffset(): Int

    /** Creates a new, read-only long buffer that shares this buffer's
     *  content.
     */
    def asReadOnlyBuffer(): LongBuffer

    /** Compacts this buffer  (optional operation). */
    def compact(): LongBuffer

    /** Compares this buffer to another. */
    def compareTo(that: LongBuffer): Int

    /** Creates a new long buffer that shares this buffer's content. */
    def duplicate(): LongBuffer

    /** Tells whether or not this buffer is equal to another object. */
    def equals(ob: Object): Boolean

    /** Relative get method. */
    def get(): Long

    /** Absolute get method. */
    def get(index: Int): Long

    /** Relative bulk get method. */
    def get(dst: Array[Long]): LongBuffer

    /** Relative bulk get method. */
    def get(dst: Array[Long], offset: Int, length: Int): LongBuffer

    /** Tells whether or not this buffer is backed by an accessible long
     *  array.
     */
    def hasArray(): Boolean

    /** Returns the current hash code of this buffer. */
    def hashCode(): Int

    /** Tells whether or not this long buffer is direct. */
    def isDirect(): Boolean

    /** Retrieves this buffer's byte order. */
    def order(): ByteOrder

    /** Absolute put method  (optional operation). */
    def put(index: Int, l: Long): LongBuffer

    /** Relative put method  (optional operation). */
    def put(l: Long): LongBuffer

    /** Relative bulk put method  (optional operation). */
    def put(src: Array[Long]): LongBuffer

    /** Relative bulk put method  (optional operation). */
    def put(src: Array[Long], offset: Int, length: Int): LongBuffer

    /** Relative bulk put method  (optional operation). */
    def put(src: LongBuffer): LongBuffer

    /** Creates a new long buffer whose content is a shared subsequence of
     *  this buffer's content.
     */
    def slice(): LongBuffer

    /** Returns a string summarizing the state of this buffer. */
    def toString(): String
}

object LongBuffer {
    /** Allocates a new long buffer. */
    @stub
    def allocate(capacity: Int): LongBuffer = ???

    /** Wraps a long array into a buffer. */
    @stub
    def wrap(array: Array[Long]): LongBuffer = ???
}
