package javax.naming

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** This class represents the binary form of the address of
 *  a communications end-point.
 * 
 *  A BinaryRefAddr consists of a type that describes the communication mechanism
 *  and an opaque buffer containing the address description
 *  specific to that communication mechanism. The format and interpretation of
 *  the address type and the contents of the opaque buffer are based on
 *  the agreement of three parties: the client that uses the address,
 *  the object/server that can be reached using the address,
 *  and the administrator or program that creates the address.
 * 
 *  An example of a binary reference address is an BER X.500 presentation address.
 *  Another example of a binary reference address is a serialized form of
 *  a service's object handle.
 * 
 *  A binary reference address is immutable in the sense that its fields
 *  once created, cannot be replaced. However, it is possible to access
 *  the byte array used to hold the opaque buffer. Programs are strongly
 *  recommended against changing this byte array. Changes to this
 *  byte array need to be explicitly synchronized.
 */
class BinaryRefAddr extends RefAddr {

    /** Constructs a new instance of BinaryRefAddr using its address type and a byte
     *  array for contents.
     */
    @stub
    def this(addrType: String, src: Array[Byte]) = ???

    /** Constructs a new instance of BinaryRefAddr using its address type and
     *  a region of a byte array for contents.
     */
    @stub
    def this(addrType: String, src: Array[Byte], offset: Int, count: Int) = ???

    /** Determines whether obj is equal to this address. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Retrieves the contents of this address as an Object. */
    @stub
    def getContent(): Object = ???

    /** Computes the hash code of this address using its address type and contents. */
    @stub
    def hashCode(): Int = ???

    /** Generates the string representation of this address. */
    @stub
    def toString(): String = ???
}
