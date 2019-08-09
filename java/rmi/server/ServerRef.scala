package java.rmi.server

import java.lang.{Deprecated, Object}
import java.rmi.Remote

/** A ServerRef represents the server-side handle for a remote object
 *  implementation.
 */
@Deprecated trait ServerRef extends RemoteRef {

    /** Deprecated.  */
    @stub
    def exportObject(obj: Remote, data: Object): RemoteStub = ???
}
