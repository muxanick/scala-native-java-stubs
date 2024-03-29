package java.nio

import java.lang.{Comparable, Object, String}
import scala.scalanative.annotation.stub

/** A byte buffer.
 * 
 *   This class defines six categories of operations upon
 *  byte buffers:
 * 
 *  
 * 
 *     Absolute and relative get and
 *    put methods that read and write
 *    single bytes; 
 * 
 *     Relative bulk get
 *    methods that transfer contiguous sequences of bytes from this buffer
 *    into an array; 
 * 
 *     Relative bulk put
 *    methods that transfer contiguous sequences of bytes from a
 *    byte array or some other byte
 *    buffer into this buffer; 
 * 
 * 
 * 
 *     Absolute and relative get
 *    and put methods that read and
 *    write values of other primitive types, translating them to and from
 *    sequences of bytes in a particular byte order; 
 * 
 *     Methods for creating view buffers,
 *    which allow a byte buffer to be viewed as a buffer containing values of
 *    some other primitive type; and 
 * 
 * 
 * 
 *     Methods for compacting, duplicating, and slicing
 *    a byte buffer.  
 * 
 *  
 * 
 *   Byte buffers can be created either by allocation, which allocates space for the buffer's
 * 
 * 
 * 
 *  content, or by wrapping an
 *  existing byte array  into a buffer.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 *  
 *   Direct vs. non-direct buffers 
 * 
 *   A byte buffer is either direct or non-direct.  Given a
 *  direct byte buffer, the Java virtual machine will make a best effort to
 *  perform native I/O operations directly upon it.  That is, it will attempt to
 *  avoid copying the buffer's content to (or from) an intermediate buffer
 *  before (or after) each invocation of one of the underlying operating
 *  system's native I/O operations.
 * 
 *   A direct byte buffer may be created by invoking the allocateDirect factory method of this class.  The
 *  buffers returned by this method typically have somewhat higher allocation
 *  and deallocation costs than non-direct buffers.  The contents of direct
 *  buffers may reside outside of the normal garbage-collected heap, and so
 *  their impact upon the memory footprint of an application might not be
 *  obvious.  It is therefore recommended that direct buffers be allocated
 *  primarily for large, long-lived buffers that are subject to the underlying
 *  system's native I/O operations.  In general it is best to allocate direct
 *  buffers only when they yield a measureable gain in program performance.
 * 
 *   A direct byte buffer may also be created by mapping a region of a file
 *  directly into memory.  An implementation of the Java platform may optionally
 *  support the creation of direct byte buffers from native code via JNI.  If an
 *  instance of one of these kinds of buffers refers to an inaccessible region
 *  of memory then an attempt to access that region will not change the buffer's
 *  content and will cause an unspecified exception to be thrown either at the
 *  time of the access or at some later time.
 * 
 *   Whether a byte buffer is direct or non-direct may be determined by
 *  invoking its isDirect method.  This method is provided so
 *  that explicit buffer management can be done in performance-critical code.
 * 
 * 
 *  
 *   Access to binary data 
 * 
 *   This class defines methods for reading and writing values of all other
 *  primitive types, except boolean.  Primitive values are translated
 *  to (or from) sequences of bytes according to the buffer's current byte
 *  order, which may be retrieved and modified via the order
 *  methods.  Specific byte orders are represented by instances of the ByteOrder class.  The initial order of a byte buffer is always BIG_ENDIAN.
 * 
 *   For access to heterogeneous binary data, that is, sequences of values of
 *  different types, this class defines a family of absolute and relative
 *  get and put methods for each type.  For 32-bit floating-point
 *  values, for example, this class defines:
 * 
 *  
 *  float  getFloat()
 *  float  getFloat(int index)
 *   void  putFloat(float f)
 *   void  putFloat(int index, float f)
 * 
 *   Corresponding methods are defined for the types char,
 *  short, int, long, and double.  The index
 *  parameters of the absolute get and put methods are in terms of
 *  bytes rather than of the type being read or written.
 * 
 *  
 * 
 *   For access to homogeneous binary data, that is, sequences of values of
 *  the same type, this class defines methods that can create views of a
 *  given byte buffer.  A view buffer is simply another buffer whose
 *  content is backed by the byte buffer.  Changes to the byte buffer's content
 *  will be visible in the view buffer, and vice versa; the two buffers'
 *  position, limit, and mark values are independent.  The asFloatBuffer method, for example, creates an instance of
 *  the FloatBuffer class that is backed by the byte buffer upon which
 *  the method is invoked.  Corresponding view-creation methods are defined for
 *  the types char, short, int, long, and
 *  double.
 * 
 *   View buffers have three important advantages over the families of
 *  type-specific get and put methods described above:
 * 
 *  
 * 
 *     A view buffer is indexed not in terms of bytes but rather in terms
 *    of the type-specific size of its values;  
 * 
 *     A view buffer provides relative bulk get and put
 *    methods that can transfer contiguous sequences of values between a buffer
 *    and an array or some other buffer of the same type; and  
 * 
 *     A view buffer is potentially much more efficient because it will
 *    be direct if, and only if, its backing byte buffer is direct.  
 * 
 *  
 * 
 *   The byte order of a view buffer is fixed to be that of its byte buffer
 *  at the time that the view is created.  
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 *   Invocation chaining 
 * 
 * 
 *   Methods in this class that do not otherwise have a value to return are
 *  specified to return the buffer upon which they are invoked.  This allows
 *  method invocations to be chained.
 * 
 * 
 * 
 *  The sequence of statements
 * 
 *  
 *  bb.putInt(0xCAFEBABE);
 *  bb.putShort(3);
 *  bb.putShort(45);
 * 
 *  can, for example, be replaced by the single statement
 * 
 *  
 *  bb.putInt(0xCAFEBABE).putShort(3).putShort(45);
 */
abstract class ByteBuffer extends Buffer with Comparable[ByteBuffer] {

    /** Returns the byte array that backs this
     *  buffer  (optional operation).
     */
    def array(): Array[Byte]

    /** Returns the offset within this buffer's backing array of the first
     *  element of the buffer  (optional operation).
     */
    def arrayOffset(): Int

    /** Creates a view of this byte buffer as a char buffer. */
    def asCharBuffer(): CharBuffer

    /** Creates a view of this byte buffer as a double buffer. */
    def asDoubleBuffer(): DoubleBuffer

    /** Creates a view of this byte buffer as a float buffer. */
    def asFloatBuffer(): FloatBuffer

    /** Creates a view of this byte buffer as an int buffer. */
    def asIntBuffer(): IntBuffer

    /** Creates a view of this byte buffer as a long buffer. */
    def asLongBuffer(): LongBuffer

    /** Creates a new, read-only byte buffer that shares this buffer's
     *  content.
     */
    def asReadOnlyBuffer(): ByteBuffer

    /** Creates a view of this byte buffer as a short buffer. */
    def asShortBuffer(): ShortBuffer

    /** Compacts this buffer  (optional operation). */
    def compact(): ByteBuffer

    /** Compares this buffer to another. */
    def compareTo(that: ByteBuffer): Int

    /** Creates a new byte buffer that shares this buffer's content. */
    def duplicate(): ByteBuffer

    /** Tells whether or not this buffer is equal to another object. */
    def equals(ob: Any): Boolean

    /** Relative get method. */
    def get(): Byte

    /** Relative bulk get method. */
    def get(dst: Array[Byte]): ByteBuffer

    /** Relative bulk get method. */
    def get(dst: Array[Byte], offset: Int, length: Int): ByteBuffer

    /** Absolute get method. */
    def get(index: Int): Byte

    /** Relative get method for reading a char value. */
    def getChar(): Char

    /** Absolute get method for reading a char value. */
    def getChar(index: Int): Char

    /** Relative get method for reading a double value. */
    def getDouble(): Double

    /** Absolute get method for reading a double value. */
    def getDouble(index: Int): Double

    /** Relative get method for reading a float value. */
    def getFloat(): Float

    /** Absolute get method for reading a float value. */
    def getFloat(index: Int): Float

    /** Relative get method for reading an int value. */
    def getInt(): Int

    /** Absolute get method for reading an int value. */
    def getInt(index: Int): Int

    /** Relative get method for reading a long value. */
    def getLong(): Long

    /** Absolute get method for reading a long value. */
    def getLong(index: Int): Long

    /** Relative get method for reading a short value. */
    def getShort(): Short

    /** Absolute get method for reading a short value. */
    def getShort(index: Int): Short

    /** Tells whether or not this buffer is backed by an accessible byte
     *  array.
     */
    def hasArray(): Boolean

    /** Returns the current hash code of this buffer. */
    def hashCode(): Int

    /** Tells whether or not this byte buffer is direct. */
    def isDirect(): Boolean

    /** Retrieves this buffer's byte order. */
    def order(): ByteOrder

    /** Modifies this buffer's byte order. */
    def order(bo: ByteOrder): ByteBuffer

    /** Relative put method  (optional operation). */
    def put(b: Byte): ByteBuffer

    /** Relative bulk put method  (optional operation). */
    def put(src: Array[Byte]): ByteBuffer

    /** Relative bulk put method  (optional operation). */
    def put(src: Array[Byte], offset: Int, length: Int): ByteBuffer

    /** Relative bulk put method  (optional operation). */
    def put(src: ByteBuffer): ByteBuffer

    /** Absolute put method  (optional operation). */
    def put(index: Int, b: Byte): ByteBuffer

    /** Relative put method for writing a char
     *  value  (optional operation).
     */
    def putChar(value: Char): ByteBuffer

    /** Absolute put method for writing a char
     *  value  (optional operation).
     */
    def putChar(index: Int, value: Char): ByteBuffer

    /** Relative put method for writing a double
     *  value  (optional operation).
     */
    def putDouble(value: Double): ByteBuffer

    /** Absolute put method for writing a double
     *  value  (optional operation).
     */
    def putDouble(index: Int, value: Double): ByteBuffer

    /** Relative put method for writing a float
     *  value  (optional operation).
     */
    def putFloat(value: Float): ByteBuffer

    /** Absolute put method for writing a float
     *  value  (optional operation).
     */
    def putFloat(index: Int, value: Float): ByteBuffer

    /** Relative put method for writing an int
     *  value  (optional operation).
     */
    def putInt(value: Int): ByteBuffer

    /** Absolute put method for writing an int
     *  value  (optional operation).
     */
    def putInt(index: Int, value: Int): ByteBuffer

    /** Absolute put method for writing a long
     *  value  (optional operation).
     */
    def putLong(index: Int, value: Long): ByteBuffer

    /** Relative put method for writing a long
     *  value  (optional operation).
     */
    def putLong(value: Long): ByteBuffer

    /** Absolute put method for writing a short
     *  value  (optional operation).
     */
    def putShort(index: Int, value: Short): ByteBuffer

    /** Relative put method for writing a short
     *  value  (optional operation).
     */
    def putShort(value: Short): ByteBuffer

    /** Creates a new byte buffer whose content is a shared subsequence of
     *  this buffer's content.
     */
    def slice(): ByteBuffer

    /** Returns a string summarizing the state of this buffer. */
    def toString(): String
}

object ByteBuffer {
    /** Allocates a new byte buffer. */
    @stub
    def allocate(capacity: Int): ByteBuffer = ???

    /** Allocates a new direct byte buffer. */
    @stub
    def allocateDirect(capacity: Int): ByteBuffer = ???

    /** Wraps a byte array into a buffer. */
    @stub
    def wrap(array: Array[Byte]): ByteBuffer = ???

    /** Wraps a byte array into a buffer. */
    @stub
    def wrap(array: Array[Byte], offset: Int, length: Int): ByteBuffer = ???
}
