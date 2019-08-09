package java.nio

import java.lang.{Comparable, Object, String}

// A float buffer.
//
//  This class defines four categories of operations upon
// float buffers:
//
// 
//
//    Absolute and relative get and
//   put methods that read and write
//   single floats; 
//
//    Relative bulk get
//   methods that transfer contiguous sequences of floats from this buffer
//   into an array; and
//
//    Relative bulk put
//   methods that transfer contiguous sequences of floats from a
//   float array or some other float
//   buffer into this buffer; and 
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//    Methods for compacting, duplicating, and slicing
//   a float buffer.  
//
// 
//
//  Float buffers can be created either by allocation, which allocates space for the buffer's
//
//
//
//
//
//
//
//
// content, by wrapping an existing
// float array  into a buffer, or by creating a
// view of an existing byte buffer.
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//  Like a byte buffer, a float buffer is either direct or non-direct.  A
// float buffer created via the wrap methods of this class will
// be non-direct.  A float buffer created as a view of a byte buffer will
// be direct if, and only if, the byte buffer itself is direct.  Whether or not
// a float buffer is direct may be determined by invoking the isDirect method.  
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//  Methods in this class that do not otherwise have a value to return are
// specified to return the buffer upon which they are invoked.  This allows
// method invocations to be chained.
abstract class FloatBuffer extends Buffer with Comparable[FloatBuffer] {

    // Returns the float array that backs this
    // buffer  (optional operation).
    def array(): Array[float]

    // Returns the offset within this buffer's backing array of the first
    // element of the buffer  (optional operation).
    def arrayOffset(): Int

    // Creates a new, read-only float buffer that shares this buffer's
    // content.
    def asReadOnlyBuffer(): FloatBuffer

    // Compacts this buffer  (optional operation).
    def compact(): FloatBuffer

    // Compares this buffer to another.
    def compareTo(that: FloatBuffer): Int

    // Creates a new float buffer that shares this buffer's content.
    def duplicate(): FloatBuffer

    // Tells whether or not this buffer is equal to another object.
    def equals(ob: Object): Boolean

    // Relative get method.
    def get(): float

    // Relative bulk get method.
    def get(dst: Array[float]): FloatBuffer

    // Relative bulk get method.
    def get(dst: Array[float], offset: Int, length: Int): FloatBuffer

    // Absolute get method.
    def get(index: Int): float

    // Tells whether or not this buffer is backed by an accessible float
    // array.
    def hasArray(): Boolean

    // Returns the current hash code of this buffer.
    def hashCode(): Int

    // Tells whether or not this float buffer is direct.
    def isDirect(): Boolean

    // Retrieves this buffer's byte order.
    def order(): ByteOrder

    // Relative put method  (optional operation).
    def put(f: float): FloatBuffer

    // Relative bulk put method  (optional operation).
    def put(src: Array[float]): FloatBuffer

    // Relative bulk put method  (optional operation).
    def put(src: Array[float], offset: Int, length: Int): FloatBuffer

    // Relative bulk put method  (optional operation).
    def put(src: FloatBuffer): FloatBuffer

    // Absolute put method  (optional operation).
    def put(index: Int, f: float): FloatBuffer

    // Creates a new float buffer whose content is a shared subsequence of
    // this buffer's content.
    def slice(): FloatBuffer

    // Returns a string summarizing the state of this buffer.
    def toString(): String
}

object FloatBuffer {
    @stub
    // Allocates a new float buffer.
    def allocate(capacity: Int): FloatBuffer = ???

    @stub
    // Wraps a float array into a buffer.
    def wrap(array: Array[float]): FloatBuffer = ???
}
