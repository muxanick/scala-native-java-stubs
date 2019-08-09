package java.rmi.server

import java.lang.{Deprecated, Object}
import scala.scalanative.annotation.stub

/** The RemoteStub class is the common superclass of
 *  statically generated client
 *  stubs and provides the framework to support a wide range of remote
 *  reference semantics.  Stub objects are surrogates that support
 *  exactly the same set of remote interfaces defined by the actual
 *  implementation of the remote object.
 */
@Deprecated abstract class RemoteStub extends RemoteObject {

    /** Deprecated.  */
    @stub
    protected def this() = ???

    /** Deprecated.  */
    @stub
    protected def this(ref: RemoteRef) = ???
}

object RemoteStub {
    /** Deprecated. 
     * No replacement.  The setRef method
     *  was intended for setting the remote reference of a remote
     *  stub. This is unnecessary, since RemoteStubs can be created
     *  and initialized with a remote reference through use of
     *  the RemoteStub(RemoteRef) constructor.
     * 
     */
    @stub
    protected def setRef(stub: RemoteStub, ref: RemoteRef): Unit = ???
}
