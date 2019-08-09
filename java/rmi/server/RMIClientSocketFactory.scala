package java.rmi.server

// An RMIClientSocketFactory instance is used by the RMI runtime
// in order to obtain client sockets for RMI calls.  A remote object can be
// associated with an RMIClientSocketFactory when it is
// created/exported via the constructors or exportObject methods
// of java.rmi.server.UnicastRemoteObject and
// java.rmi.activation.Activatable .
//
// An RMIClientSocketFactory instance associated with a remote
// object will be downloaded to clients when the remote object's reference is
// transmitted in an RMI call.  This RMIClientSocketFactory will
// be used to create connections to the remote object for remote method calls.
//
// An RMIClientSocketFactory instance can also be associated
// with a remote object registry so that clients can use custom socket
// communication with a remote object registry.
//
// An implementation of this interface should be serializable and
// should implement Object.equals(java.lang.Object) to return true when
// passed an instance that represents the same (functionally equivalent)
// client socket factory, and false otherwise (and it should also
// implement Object.hashCode() consistently with its
// Object.equals implementation).
trait RMIClientSocketFactory {
}
