package java.rmi.dgc

import java.io.Serializable
import java.lang.Object

/** A lease contains a unique VM identifier and a lease duration. A
 *  Lease object is used to request and grant leases to remote object
 *  references.
 */
final class Lease extends Object with Serializable {

    /** Returns the lease duration. */
    @stub
    def getValue(): Long = ???
}
