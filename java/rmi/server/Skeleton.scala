package java.rmi.server

import java.lang.Deprecated
import java.rmi.Remote

// The Skeleton interface is used solely by the RMI
// implementation.
//
//  Every version 1.1 (and version 1.1 compatible skeletons generated in
// 1.2 using rmic -vcompat) skeleton class generated by the rmic
// stub compiler implements this interface. A skeleton for a remote object is
// a server-side entity that dispatches calls to the actual remote object
// implementation.
@Deprecated trait Skeleton {

    @stub
    // Deprecated. 
    //no replacement
    //
    def dispatch(obj: Remote, theCall: RemoteCall, opnum: Int, hash: Long): Unit = ???
}