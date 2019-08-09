package java.rmi.server

import java.lang.{Deprecated, Object}

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
}
