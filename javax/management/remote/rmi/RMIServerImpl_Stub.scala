package javax.management.remote.rmi

import java.lang.{Object, String}
import java.rmi.server.{RemoteObject, RemoteStub}

/** 
 * See Also:
 * Serialized Form
 * 
 */
final class RMIServerImpl_Stub extends RemoteStub with RMIServer {

    /** The version of the RMI Connector Protocol understood by this
     *  connector server.
     */
    @stub
    def getVersion(): String = ???
}
