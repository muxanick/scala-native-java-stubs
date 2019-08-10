package java.rmi.server

import java.lang.Object
import java.lang.reflect.{InvocationHandler, Method}
import scala.scalanative.annotation.stub

/** An implementation of the InvocationHandler interface for
 *  use with Java Remote Method Invocation (Java RMI).  This invocation
 *  handler can be used in conjunction with a dynamic proxy instance as a
 *  replacement for a pregenerated stub class.
 * 
 *  Applications are not expected to use this class directly.  A remote
 *  object exported to use a dynamic proxy with UnicastRemoteObject
 *  or Activatable has an instance of this class as that proxy's
 *  invocation handler.
 */
class RemoteObjectInvocationHandler extends RemoteObject with InvocationHandler {

    /** Creates a new RemoteObjectInvocationHandler constructed
     *  with the specified RemoteRef.
     */
    @stub
    def this(ref: RemoteRef) = ???

    /** Processes a method invocation made on the encapsulating
     *  proxy instance, proxy, and returns the result.
     */
    @stub
    def invoke(proxy: Any, method: Method, args: Array[Object]): Any = ???
}
