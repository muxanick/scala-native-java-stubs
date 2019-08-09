package java.util

import java.io.Serializable
import java.lang.{Comparable, Object, String}

/** A class that represents an immutable universally unique identifier (UUID).
 *  A UUID represents a 128-bit value.
 * 
 *   There exist different variants of these global identifiers.  The methods
 *  of this class are for manipulating the Leach-Salz variant, although the
 *  constructors allow the creation of any variant of UUID (described below).
 * 
 *   The layout of a variant 2 (Leach-Salz) UUID is as follows:
 * 
 *  The most significant long consists of the following unsigned fields:
 *  
 *  0xFFFFFFFF00000000 time_low
 *  0x00000000FFFF0000 time_mid
 *  0x000000000000F000 version
 *  0x0000000000000FFF time_hi
 *  
 *  The least significant long consists of the following unsigned fields:
 *  
 *  0xC000000000000000 variant
 *  0x3FFF000000000000 clock_seq
 *  0x0000FFFFFFFFFFFF node
 *  
 * 
 *   The variant field contains a value which identifies the layout of the
 *  UUID.  The bit layout described above is valid only for a UUID with a variant value of 2, which indicates the Leach-Salz variant.
 * 
 *   The version field holds a value that describes the type of this UUID.  There are four different basic types of UUIDs: time-based, DCE
 *  security, name-based, and randomly generated UUIDs.  These types have a
 *  version value of 1, 2, 3 and 4, respectively.
 * 
 *   For more information including algorithms used to create UUIDs,
 *  see  RFC 4122: A
 *  Universally Unique IDentifier (UUID) URN Namespace, section 4.2
 *  "Algorithms for Creating a Time-Based UUID".
 */
final class UUID extends Object with Serializable with Comparable[UUID] {

    /** The clock sequence value associated with this UUID. */
    @stub
    def clockSequence(): Int = ???

    /** Compares this UUID with the specified UUID. */
    @stub
    def compareTo(val: UUID): Int = ???

    /** Compares this object to the specified object. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Returns the least significant 64 bits of this UUID's 128 bit value. */
    @stub
    def getLeastSignificantBits(): Long = ???

    /** Returns the most significant 64 bits of this UUID's 128 bit value. */
    @stub
    def getMostSignificantBits(): Long = ???

    /** Returns a hash code for this UUID. */
    @stub
    def hashCode(): Int = ???

    /** The node value associated with this UUID. */
    @stub
    def node(): Long = ???

    /** The timestamp value associated with this UUID. */
    @stub
    def timestamp(): Long = ???

    /** Returns a String object representing this UUID. */
    @stub
    def toString(): String = ???

    /** The variant number associated with this UUID. */
    @stub
    def variant(): Int = ???
}

object UUID {
    /** Creates a UUID from the string standard representation as
     *  described in the toString() method.
     */
    @stub
    def fromString(name: String): UUID = ???

    /** Static factory to retrieve a type 3 (name based) UUID based on
     *  the specified byte array.
     */
    @stub
    def nameUUIDFromBytes(name: Array[Byte]): UUID = ???

    /** Static factory to retrieve a type 4 (pseudo randomly generated) UUID. */
    @stub
    def randomUUID(): UUID = ???
}
