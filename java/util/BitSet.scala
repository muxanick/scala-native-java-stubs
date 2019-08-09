package java.util

import java.io.Serializable
import java.lang.{Cloneable, Object, String}
import java.nio.{ByteBuffer, LongBuffer}
import java.util.stream.IntStream
import scala.scalanative.annotation.stub

/** This class implements a vector of bits that grows as needed. Each
 *  component of the bit set has a boolean value. The
 *  bits of a BitSet are indexed by nonnegative integers.
 *  Individual indexed bits can be examined, set, or cleared. One
 *  BitSet may be used to modify the contents of another
 *  BitSet through logical AND, logical inclusive OR, and
 *  logical exclusive OR operations.
 * 
 *  By default, all bits in the set initially have the value
 *  false.
 * 
 *  Every bit set has a current size, which is the number of bits
 *  of space currently in use by the bit set. Note that the size is
 *  related to the implementation of a bit set, so it may change with
 *  implementation. The length of a bit set relates to logical length
 *  of a bit set and is defined independently of implementation.
 * 
 *  Unless otherwise noted, passing a null parameter to any of the
 *  methods in a BitSet will result in a
 *  NullPointerException.
 * 
 *  A BitSet is not safe for multithreaded use without
 *  external synchronization.
 */
class BitSet extends Object with Cloneable with Serializable {

    /** Creates a new bit set. */
    @stub
    def this() = ???

    /** Creates a bit set whose initial size is large enough to explicitly
     *  represent bits with indices in the range 0 through
     *  nbits-1.
     */
    @stub
    def this(nbits: Int) = ???

    /** Performs a logical AND of this target bit set with the
     *  argument bit set.
     */
    @stub
    def and(set: BitSet): Unit = ???

    /** Clears all of the bits in this BitSet whose corresponding
     *  bit is set in the specified BitSet.
     */
    @stub
    def andNot(set: BitSet): Unit = ???

    /** Returns the number of bits set to true in this BitSet. */
    @stub
    def cardinality(): Int = ???

    /** Sets all of the bits in this BitSet to false. */
    @stub
    def clear(): Unit = ???

    /** Sets the bit specified by the index to false. */
    @stub
    def clear(bitIndex: Int): Unit = ???

    /** Sets the bits from the specified fromIndex (inclusive) to the
     *  specified toIndex (exclusive) to false.
     */
    @stub
    def clear(fromIndex: Int, toIndex: Int): Unit = ???

    /** Cloning this BitSet produces a new BitSet
     *  that is equal to it.
     */
    @stub
    def clone(): Object = ???

    /** Compares this object against the specified object. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Sets the bit at the specified index to the complement of its
     *  current value.
     */
    @stub
    def flip(bitIndex: Int): Unit = ???

    /** Sets each bit from the specified fromIndex (inclusive) to the
     *  specified toIndex (exclusive) to the complement of its current
     *  value.
     */
    @stub
    def flip(fromIndex: Int, toIndex: Int): Unit = ???

    /** Returns the value of the bit with the specified index. */
    @stub
    def get(bitIndex: Int): Boolean = ???

    /** Returns a new BitSet composed of bits from this BitSet
     *  from fromIndex (inclusive) to toIndex (exclusive).
     */
    @stub
    def get(fromIndex: Int, toIndex: Int): BitSet = ???

    /** Returns the hash code value for this bit set. */
    @stub
    def hashCode(): Int = ???

    /** Returns true if the specified BitSet has any bits set to
     *  true that are also set to true in this BitSet.
     */
    @stub
    def intersects(set: BitSet): Boolean = ???

    /** Returns true if this BitSet contains no bits that are set
     *  to true.
     */
    @stub
    def isEmpty(): Boolean = ???

    /** Returns the "logical size" of this BitSet: the index of
     *  the highest set bit in the BitSet plus one.
     */
    @stub
    def length(): Int = ???

    /** Returns the index of the first bit that is set to false
     *  that occurs on or after the specified starting index.
     */
    @stub
    def nextClearBit(fromIndex: Int): Int = ???

    /** Returns the index of the first bit that is set to true
     *  that occurs on or after the specified starting index.
     */
    @stub
    def nextSetBit(fromIndex: Int): Int = ???

    /** Performs a logical OR of this bit set with the bit set
     *  argument.
     */
    @stub
    def or(set: BitSet): Unit = ???

    /** Returns the index of the nearest bit that is set to false
     *  that occurs on or before the specified starting index.
     */
    @stub
    def previousClearBit(fromIndex: Int): Int = ???

    /** Returns the index of the nearest bit that is set to true
     *  that occurs on or before the specified starting index.
     */
    @stub
    def previousSetBit(fromIndex: Int): Int = ???

    /** Sets the bit at the specified index to true. */
    @stub
    def set(bitIndex: Int): Unit = ???

    /** Sets the bit at the specified index to the specified value. */
    @stub
    def set(bitIndex: Int, value: Boolean): Unit = ???

    /** Sets the bits from the specified fromIndex (inclusive) to the
     *  specified toIndex (exclusive) to true.
     */
    @stub
    def set(fromIndex: Int, toIndex: Int): Unit = ???

    /** Sets the bits from the specified fromIndex (inclusive) to the
     *  specified toIndex (exclusive) to the specified value.
     */
    @stub
    def set(fromIndex: Int, toIndex: Int, value: Boolean): Unit = ???

    /** Returns the number of bits of space actually in use by this
     *  BitSet to represent bit values.
     */
    @stub
    def size(): Int = ???

    /** Returns a stream of indices for which this BitSet
     *  contains a bit in the set state.
     */
    @stub
    def stream(): IntStream = ???

    /** Returns a new byte array containing all the bits in this bit set. */
    @stub
    def toByteArray(): Array[Byte] = ???

    /** Returns a new long array containing all the bits in this bit set. */
    @stub
    def toLongArray(): Array[Long] = ???

    /** Returns a string representation of this bit set. */
    @stub
    def toString(): String = ???

    /** Performs a logical XOR of this bit set with the bit set
     *  argument.
     */
    @stub
    def xor(set: BitSet): Unit = ???
}

object BitSet {
    /** Returns a new bit set containing all the bits in the given byte array. */
    @stub
    def valueOf(bytes: Array[Byte]): BitSet = ???

    /** Returns a new bit set containing all the bits in the given byte
     *  buffer between its position and limit.
     */
    @stub
    def valueOf(bb: ByteBuffer): BitSet = ???

    /** Returns a new bit set containing all the bits in the given long array. */
    @stub
    def valueOf(longs: Array[Long]): BitSet = ???

    /** Returns a new bit set containing all the bits in the given long
     *  buffer between its position and limit.
     */
    @stub
    def valueOf(lb: LongBuffer): BitSet = ???
}
