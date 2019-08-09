package java.rmi.registry

import java.lang.{Object, String}
import java.rmi.server.{RMIClientSocketFactory, RMIServerSocketFactory}

// LocateRegistry is used to obtain a reference to a bootstrap
// remote object registry on a particular host (including the local host), or
// to create a remote object registry that accepts calls on a specific port.
//
//  Note that a getRegistry call does not actually make a
// connection to the remote host.  It simply creates a local reference to
// the remote registry and will succeed even if no registry is running on
// the remote host.  Therefore, a subsequent method invocation to a remote
// registry returned as a result of this method may fail.
final class LocateRegistry extends Object {
}

object LocateRegistry {
    @stub
    // Creates and exports a Registry instance on the local
    // host that accepts requests on the specified port.
    def createRegistry(port: Int): Registry = ???

    @stub
    // Creates and exports a Registry instance on the local
    // host that uses custom socket factories for communication with that
    // instance.
    def createRegistry(port: Int, csf: RMIClientSocketFactory, ssf: RMIServerSocketFactory): Registry = ???

    @stub
    // Returns a reference to the the remote object Registry for
    // the local host on the default registry port of 1099.
    def getRegistry(): Registry = ???

    @stub
    // Returns a reference to the the remote object Registry for
    // the local host on the specified port.
    def getRegistry(port: Int): Registry = ???

    @stub
    // Returns a reference to the remote object Registry on the
    // specified host on the default registry port of 1099.
    def getRegistry(host: String): Registry = ???

    @stub
    // Returns a reference to the remote object Registry on the
    // specified host and port.
    def getRegistry(host: String, port: Int): Registry = ???
}
