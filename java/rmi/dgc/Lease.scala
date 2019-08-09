package java.rmi.dgc

import java.io.Serializable
import java.lang.Object
import scala.scalanative.annotation.stub

/** A lease contains a unique VM identifier and a lease duration. A
 *  Lease object is used to request and grant leases to remote object
 *  references.
 */
final class Lease extends Object with Serializable {

    /** Constructs a lease with a specific VMID and lease duration. */
    @stub
    def this(id: VMID, duration: Long) = ???

    /** Returns the lease duration. */
    @stub
    def getValue(): Long = ???

    /** Returns the client VMID associated with the lease. */
    @stub
    def getVMID(): VMID = ???
}
