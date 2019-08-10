package javax.naming

import java.io.Serializable
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** This class represents the address of a communications end-point.
 *  It consists of a type that describes the communication mechanism
 *  and an address contents determined by an RefAddr subclass.
 * 
 *  For example, an address type could be "BSD Printer Address",
 *  which specifies that it is an address to be used with the BSD printing
 *  protocol. Its contents could be the machine name identifying the
 *  location of the printer server that understands this protocol.
 * 
 *  A RefAddr is contained within a Reference.
 * 
 *  RefAddr is an abstract class. Concrete implementations of it
 *  determine its synchronization properties.
 */
abstract class RefAddr extends Object with Serializable {

    /** Constructs a new instance of RefAddr using its address type. */
    @stub
    protected def this(addrType: String) = ???

    /** Contains the type of this address. */
    protected val addrType: String

    /** Determines whether obj is equal to this RefAddr. */
    def equals(obj: Any): Boolean

    /** Retrieves the contents of this address. */
    def getContent(): Any

    /** Retrieves the address type of this address. */
    def getType(): String

    /** Computes the hash code of this address using its address type and contents. */
    def hashCode(): Int

    /** Generates the string representation of this address. */
    def toString(): String
}
