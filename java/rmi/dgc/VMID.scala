package java.rmi.dgc

import java.io.Serializable
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** A VMID is a identifier that is unique across all Java virtual
 *  machines.  VMIDs are used by the distributed garbage collector
 *  to identify client VMs.
 */
final class VMID extends Object with Serializable {

    /** Create a new VMID. */
    @stub
    def this() = ???

    /** Compare this VMID to another, and return true if they are the
     *  same identifier.
     */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Compute hash code for this VMID. */
    @stub
    def hashCode(): Int = ???

    /** Return string representation of this VMID. */
    @stub
    def toString(): String = ???
}

object VMID {
    /** Deprecated.   */
    @stub
    def isUnique(): Boolean = ???
}
