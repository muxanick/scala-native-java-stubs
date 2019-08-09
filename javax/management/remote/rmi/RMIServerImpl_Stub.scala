package javax.management.remote.rmi

import java.lang.{Object, String}
import java.rmi.server.{RemoteObject, RemoteRef, RemoteStub}
import scala.scalanative.annotation.stub

/** 
 * See Also:
 * Serialized Form
 * 
 */
final class RMIServerImpl_Stub extends RemoteStub with RMIServer {

    /**  */
    @stub
    def this(ref: RemoteRef) = ???

    /** The version of the RMI Connector Protocol understood by this
     *  connector server.
     */
    @stub
    def getVersion(): String = ???

    /** Makes a new connection through this RMI connector. */
    @stub
    def newClient($param_Object_1: Object): RMIConnection = ???
}
