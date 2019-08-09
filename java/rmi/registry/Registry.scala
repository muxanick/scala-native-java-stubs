package java.rmi.registry

import java.lang.String
import java.rmi.Remote
import scala.scalanative.annotation.stub

/** Registry is a remote interface to a simple remote
 *  object registry that provides methods for storing and retrieving
 *  remote object references bound with arbitrary string names.  The
 *  bind, unbind, and rebind
 *  methods are used to alter the name bindings in the registry, and
 *  the lookup and list methods are used to
 *  query the current name bindings.
 * 
 *  In its typical usage, a Registry enables RMI client
 *  bootstrapping: it provides a simple means for a client to obtain an
 *  initial reference to a remote object.  Therefore, a registry's
 *  remote object implementation is typically exported with a
 *  well-known address, such as with a well-known ObjID and TCP port number
 *  (default is 1099).
 * 
 *  The LocateRegistry class provides a programmatic API for
 *  constructing a bootstrap reference to a Registry at a
 *  remote address (see the static getRegistry methods)
 *  and for creating and exporting a Registry in the
 *  current VM on a particular local address (see the static
 *  createRegistry methods).
 * 
 *  A Registry implementation may choose to restrict
 *  access to some or all of its methods (for example, methods that
 *  mutate the registry's bindings may be restricted to calls
 *  originating from the local host).  If a Registry
 *  method chooses to deny access for a given invocation, its
 *  implementation may throw AccessException, which
 *  (because it extends RemoteException) will be
 *  wrapped in a ServerException when caught by a
 *  remote client.
 * 
 *  The names used for bindings in a Registry are pure
 *  strings, not parsed.  A service which stores its remote reference
 *  in a Registry may wish to use a package name as a
 *  prefix in the name binding to reduce the likelihood of name
 *  collisions in the registry.
 */
trait Registry extends Remote {

    /** Binds a remote reference to the specified name in
     *  this registry.
     */
    @stub
    def bind(name: String, obj: Remote): Unit = ???

    /** Returns an array of the names bound in this registry. */
    @stub
    def list(): Array[String] = ???

    /** Returns the remote reference bound to the specified
     *  name in this registry.
     */
    @stub
    def lookup(name: String): Remote = ???

    /** Replaces the binding for the specified name in
     *  this registry with the supplied remote reference.
     */
    @stub
    def rebind(name: String, obj: Remote): Unit = ???

    /** Removes the binding for the specified name in
     *  this registry.
     */
    @stub
    def unbind(name: String): Unit = ???
}

object Registry {
    /** Well known port for registry. */
    @stub
    val REGISTRY_PORT: Int = ???
}
