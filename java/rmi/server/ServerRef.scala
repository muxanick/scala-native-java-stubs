package java.rmi.server

import java.lang.{Deprecated, Object, String}
import java.rmi.Remote
import scala.scalanative.annotation.stub

/** A ServerRef represents the server-side handle for a remote object
 *  implementation.
 */
@Deprecated trait ServerRef extends RemoteRef {

    /** Deprecated.  */
    @stub
    def exportObject(obj: Remote, data: Any): RemoteStub = ???

    /** Deprecated.  */
    @stub
    def getClientHost(): String = ???
}

object ServerRef {
    /** Deprecated.  */
    @stub
    val serialVersionUID: Long = ???
}
