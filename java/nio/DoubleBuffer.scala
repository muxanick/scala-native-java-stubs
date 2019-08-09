package java.nio

import java.lang.{Comparable, Object, String}

/** A double buffer.
 * 
 *   This class defines four categories of operations upon
 *  double buffers:
 * 
 *  
 * 
 *     Absolute and relative get and
 *    put methods that read and write
 *    single doubles; 
 * 
 *     Relative bulk get
 *    methods that transfer contiguous sequences of doubles from this buffer
 *    into an array; and
 * 
 *     Relative bulk put
 *    methods that transfer contiguous sequences of doubles from a
 *    double array or some other double
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
 *    a double buffer.  
 * 
 *  
 * 
 *   Double buffers can be created either by allocation, which allocates space for the buffer's
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 *  content, by wrapping an existing
 *  double array  into a buffer, or by creating a
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
 *   Like a byte buffer, a double buffer is either direct or non-direct.  A
 *  double buffer created via the wrap methods of this class will
 *  be non-direct.  A double buffer created as a view of a byte buffer will
 *  be direct if, and only if, the byte buffer itself is direct.  Whether or not
 *  a double buffer is direct may be determined by invoking the isDirect method.  
 * 
 * 
 * 
 * 
 * 
 * 
 * 
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
abstract class DoubleBuffer extends Buffer with Comparable[DoubleBuffer] {

    /** Returns the double array that backs this
     *  buffer  (optional operation).
     */
    def array(): Array[Double]

    /** Returns the offset within this buffer's backing array of the first
     *  element of the buffer  (optional operation).
     */
    def arrayOffset(): Int

    /** Creates a new, read-only double buffer that shares this buffer's
     *  content.
     */
    def asReadOnlyBuffer(): DoubleBuffer

    /** Compacts this buffer  (optional operation). */
    def compact(): DoubleBuffer

    /** Compares this buffer to another. */
    def compareTo(that: DoubleBuffer): Int

    /** Creates a new double buffer that shares this buffer's content. */
    def duplicate(): DoubleBuffer

    /** Tells whether or not this buffer is equal to another object. */
    def equals(ob: Object): Boolean

    /** Relative get method. */
    def get(): Double

    /** Relative bulk get method. */
    def get(dst: Array[Double]): DoubleBuffer

    /** Relative bulk get method. */
    def get(dst: Array[Double], offset: Int, length: Int): DoubleBuffer

    /** Absolute get method. */
    def get(index: Int): Double

    /** Tells whether or not this buffer is backed by an accessible double
     *  array.
     */
    def hasArray(): Boolean

    /** Returns the current hash code of this buffer. */
    def hashCode(): Int

    /** Tells whether or not this double buffer is direct. */
    def isDirect(): Boolean

    /** Retrieves this buffer's byte order. */
    def order(): ByteOrder

    /** Relative put method  (optional operation). */
    def put(d: Double): DoubleBuffer

    /** Relative bulk put method  (optional operation). */
    def put(src: Array[Double]): DoubleBuffer

    /** Relative bulk put method  (optional operation). */
    def put(src: Array[Double], offset: Int, length: Int): DoubleBuffer

    /** Relative bulk put method  (optional operation). */
    def put(src: DoubleBuffer): DoubleBuffer

    /** Absolute put method  (optional operation). */
    def put(index: Int, d: Double): DoubleBuffer

    /** Creates a new double buffer whose content is a shared subsequence of
     *  this buffer's content.
     */
    def slice(): DoubleBuffer

    /** Returns a string summarizing the state of this buffer. */
    def toString(): String
}

object DoubleBuffer {
    /** Allocates a new double buffer. */
    @stub
    def allocate(capacity: Int): DoubleBuffer = ???

    /** Wraps a double array into a buffer. */
    @stub
    def wrap(array: Array[Double]): DoubleBuffer = ???
}
