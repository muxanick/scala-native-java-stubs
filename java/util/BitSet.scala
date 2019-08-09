package java.util

import java.io.Serializable
import java.lang.{Cloneable, Object, String}
import java.nio.{ByteBuffer, LongBuffer}
import java.util.stream.IntStream

// This class implements a vector of bits that grows as needed. Each
// component of the bit set has a boolean value. The
// bits of a BitSet are indexed by nonnegative integers.
// Individual indexed bits can be examined, set, or cleared. One
// BitSet may be used to modify the contents of another
// BitSet through logical AND, logical inclusive OR, and
// logical exclusive OR operations.
//
// By default, all bits in the set initially have the value
// false.
//
// Every bit set has a current size, which is the number of bits
// of space currently in use by the bit set. Note that the size is
// related to the implementation of a bit set, so it may change with
// implementation. The length of a bit set relates to logical length
// of a bit set and is defined independently of implementation.
//
// Unless otherwise noted, passing a null parameter to any of the
// methods in a BitSet will result in a
// NullPointerException.
//
// A BitSet is not safe for multithreaded use without
// external synchronization.
class BitSet extends Object with Cloneable, with Serializable {

    @stub
    // Creates a new bit set.
    def this() = ???

    @stub
    // Performs a logical AND of this target bit set with the
    // argument bit set.
    def and(set: BitSet): Unit = ???

    @stub
    // Clears all of the bits in this BitSet whose corresponding
    // bit is set in the specified BitSet.
    def andNot(set: BitSet): Unit = ???

    @stub
    // Returns the number of bits set to true in this BitSet.
    def cardinality(): Int = ???

    @stub
    // Sets all of the bits in this BitSet to false.
    def clear(): Unit = ???

    @stub
    // Sets the bit specified by the index to false.
    def clear(bitIndex: Int): Unit = ???

    @stub
    // Sets the bits from the specified fromIndex (inclusive) to the
    // specified toIndex (exclusive) to false.
    def clear(fromIndex: Int, toIndex: Int): Unit = ???

    @stub
    // Cloning this BitSet produces a new BitSet
    // that is equal to it.
    def clone(): Object = ???

    @stub
    // Compares this object against the specified object.
    def equals(obj: Object): Boolean = ???

    @stub
    // Sets the bit at the specified index to the complement of its
    // current value.
    def flip(bitIndex: Int): Unit = ???

    @stub
    // Sets each bit from the specified fromIndex (inclusive) to the
    // specified toIndex (exclusive) to the complement of its current
    // value.
    def flip(fromIndex: Int, toIndex: Int): Unit = ???

    @stub
    // Returns the value of the bit with the specified index.
    def get(bitIndex: Int): Boolean = ???

    @stub
    // Returns a new BitSet composed of bits from this BitSet
    // from fromIndex (inclusive) to toIndex (exclusive).
    def get(fromIndex: Int, toIndex: Int): BitSet = ???

    @stub
    // Returns the hash code value for this bit set.
    def hashCode(): Int = ???

    @stub
    // Returns true if the specified BitSet has any bits set to
    // true that are also set to true in this BitSet.
    def intersects(set: BitSet): Boolean = ???

    @stub
    // Returns true if this BitSet contains no bits that are set
    // to true.
    def isEmpty(): Boolean = ???

    @stub
    // Returns the "logical size" of this BitSet: the index of
    // the highest set bit in the BitSet plus one.
    def length(): Int = ???

    @stub
    // Returns the index of the first bit that is set to false
    // that occurs on or after the specified starting index.
    def nextClearBit(fromIndex: Int): Int = ???

    @stub
    // Returns the index of the first bit that is set to true
    // that occurs on or after the specified starting index.
    def nextSetBit(fromIndex: Int): Int = ???

    @stub
    // Performs a logical OR of this bit set with the bit set
    // argument.
    def or(set: BitSet): Unit = ???

    @stub
    // Returns the index of the nearest bit that is set to false
    // that occurs on or before the specified starting index.
    def previousClearBit(fromIndex: Int): Int = ???

    @stub
    // Returns the index of the nearest bit that is set to true
    // that occurs on or before the specified starting index.
    def previousSetBit(fromIndex: Int): Int = ???

    @stub
    // Sets the bit at the specified index to true.
    def set(bitIndex: Int): Unit = ???

    @stub
    // Sets the bit at the specified index to the specified value.
    def set(bitIndex: Int, value: Boolean): Unit = ???

    @stub
    // Sets the bits from the specified fromIndex (inclusive) to the
    // specified toIndex (exclusive) to true.
    def set(fromIndex: Int, toIndex: Int): Unit = ???

    @stub
    // Sets the bits from the specified fromIndex (inclusive) to the
    // specified toIndex (exclusive) to the specified value.
    def set(fromIndex: Int, toIndex: Int, value: Boolean): Unit = ???

    @stub
    // Returns the number of bits of space actually in use by this
    // BitSet to represent bit values.
    def size(): Int = ???

    @stub
    // Returns a stream of indices for which this BitSet
    // contains a bit in the set state.
    def stream(): IntStream = ???

    @stub
    // Returns a new byte array containing all the bits in this bit set.
    def toByteArray(): Array[Byte] = ???

    @stub
    // Returns a new long array containing all the bits in this bit set.
    def toLongArray(): Array[Long] = ???

    @stub
    // Returns a string representation of this bit set.
    def toString(): String = ???
}

object BitSet {
    @stub
    // Returns a new bit set containing all the bits in the given byte array.
    def valueOf(bytes: Array[Byte]): BitSet = ???

    @stub
    // Returns a new bit set containing all the bits in the given byte
    // buffer between its position and limit.
    def valueOf(bb: ByteBuffer): BitSet = ???

    @stub
    // Returns a new bit set containing all the bits in the given long array.
    def valueOf(longs: Array[Long]): BitSet = ???

    @stub
    // Returns a new bit set containing all the bits in the given long
    // buffer between its position and limit.
    def valueOf(lb: LongBuffer): BitSet = ???
}
