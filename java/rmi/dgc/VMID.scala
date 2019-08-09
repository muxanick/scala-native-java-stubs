package java.rmi.dgc

import java.io.Serializable
import java.lang.Object

// A VMID is a identifier that is unique across all Java virtual
// machines.  VMIDs are used by the distributed garbage collector
// to identify client VMs.
final class VMID extends Object with Serializable {

    @stub
    // Compare this VMID to another, and return true if they are the
    // same identifier.
    def equals(obj: Object): Boolean = ???

    @stub
    // Compute hash code for this VMID.
    def hashCode(): Int = ???
}

object VMID {
    @stub
    // Deprecated.  
    def isUnique(): Boolean = ???
}
