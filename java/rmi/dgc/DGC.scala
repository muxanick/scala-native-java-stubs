package java.rmi.dgc

import java.rmi.Remote
import java.rmi.server.ObjID

// The DGC abstraction is used for the server side of the distributed
// garbage collection algorithm. This interface contains the two
// methods: dirty and clean. A dirty call is made when a remote
// reference is unmarshaled in a client (the client is indicated by
// its VMID). A corresponding clean call is made when no more
// references to the remote reference exist in the client. A failed
// dirty call must schedule a strong clean call so that the call's
// sequence number can be retained in order to detect future calls
// received out of order by the distributed garbage collector.
//
// A reference to a remote object is leased for a period of time by
// the client holding the reference. The lease period starts when the
// dirty call is received. It is the client's responsibility to renew
// the leases, by making additional dirty calls, on the remote
// references it holds before such leases expire. If the client does
// not renew the lease before it expires, the distributed garbage
// collector assumes that the remote object is no longer referenced by
// that client.
trait DGC extends Remote {

    @stub
    // The clean call removes the 'vmid' from the reference list of
    // each remote object indicated in 'id's.
    def clean(ids: Array[ObjID], sequenceNum: Long, vmid: VMID, strong: Boolean): Unit = ???
}
