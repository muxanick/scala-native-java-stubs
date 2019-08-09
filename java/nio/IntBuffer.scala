package java.nio

import java.lang.{Comparable, Object, String}
import scala.scalanative.annotation.stub

/** An int buffer.
 * 
 *   This class defines four categories of operations upon
 *  int buffers:
 * 
 *  
 * 
 *     Absolute and relative get and
 *    put methods that read and write
 *    single ints; 
 * 
 *     Relative bulk get
 *    methods that transfer contiguous sequences of ints from this buffer
 *    into an array; and
 * 
 *     Relative bulk put
 *    methods that transfer contiguous sequences of ints from an
 *    int array or some other int
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
 *    an int buffer.  
 * 
 *  
 * 
 *   Int buffers can be created either by allocation, which allocates space for the buffer's
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 *  content, by wrapping an existing
 *  int array  into a buffer, or by creating a
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
 *   Like a byte buffer, an int buffer is either direct or non-direct.  A
 *  int buffer created via the wrap methods of this class will
 *  be non-direct.  An int buffer created as a view of a byte buffer will
 *  be direct if, and only if, the byte buffer itself is direct.  Whether or not
 *  an int buffer is direct may be determined by invoking the isDirect method.  
 * 
 * 
 * 
 * 
 * 
 * 
 * 
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
abstract class IntBuffer extends Buffer with Comparable[IntBuffer] {

    /** Returns the int array that backs this
     *  buffer  (optional operation).
     */
    def array(): Array[Int]

    /** Returns the offset within this buffer's backing array of the first
     *  element of the buffer  (optional operation).
     */
    def arrayOffset(): Int

    /** Creates a new, read-only int buffer that shares this buffer's
     *  content.
     */
    def asReadOnlyBuffer(): IntBuffer

    /** Compacts this buffer  (optional operation). */
    def compact(): IntBuffer

    /** Compares this buffer to another. */
    def compareTo(that: IntBuffer): Int

    /** Creates a new int buffer that shares this buffer's content. */
    def duplicate(): IntBuffer

    /** Tells whether or not this buffer is equal to another object. */
    def equals(ob: Object): Boolean

    /** Relative get method. */
    def get(): Int

    /** Absolute get method. */
    def get(index: Int): Int

    /** Relative bulk get method. */
    def get(dst: Array[Int]): IntBuffer

    /** Relative bulk get method. */
    def get(dst: Array[Int], offset: Int, length: Int): IntBuffer

    /** Tells whether or not this buffer is backed by an accessible int
     *  array.
     */
    def hasArray(): Boolean

    /** Returns the current hash code of this buffer. */
    def hashCode(): Int

    /** Tells whether or not this int buffer is direct. */
    def isDirect(): Boolean

    /** Retrieves this buffer's byte order. */
    def order(): ByteOrder

    /** Relative put method  (optional operation). */
    def put(i: Int): IntBuffer

    /** Relative bulk put method  (optional operation). */
    def put(src: Array[Int]): IntBuffer

    /** Relative bulk put method  (optional operation). */
    def put(src: Array[Int], offset: Int, length: Int): IntBuffer

    /** Relative bulk put method  (optional operation). */
    def put(src: IntBuffer): IntBuffer

    /** Absolute put method  (optional operation). */
    def put(index: Int, i: Int): IntBuffer

    /** Creates a new int buffer whose content is a shared subsequence of
     *  this buffer's content.
     */
    def slice(): IntBuffer

    /** Returns a string summarizing the state of this buffer. */
    def toString(): String
}

object IntBuffer {
    /** Allocates a new int buffer. */
    @stub
    def allocate(capacity: Int): IntBuffer = ???

    /** Wraps an int array into a buffer. */
    @stub
    def wrap(array: Array[Int]): IntBuffer = ???

    /** Wraps an int array into a buffer. */
    @stub
    def wrap(array: Array[Int], offset: Int, length: Int): IntBuffer = ???
}
