package javax.management.remote.rmi

import java.lang.{Object, String}
import javax.security.auth.Subject

// An RMIServerImpl that is exported through IIOP and that
// creates client connections as RMI objects exported through IIOP.
// User code does not usually reference this class directly.
class RMIIIOPServerImpl extends RMIServerImpl {

    @stub
    // Closes a client connection made by makeClient.
    protected def closeClient(client: RMIConnection): Unit = ???

    @stub
    // Called by RMIServerImpl.close() to close the connector server by
    // unexporting this object.
    protected def closeServer(): Unit = ???

    @stub
    // Exports this RMI object.
    protected def export(): Unit = ???

    @stub
    // Returns the protocol string for this object.
    protected def getProtocol(): String = ???

    @stub
    // Creates a new client connection as an RMI object exported
    // through IIOP.
    protected def makeClient(connectionId: String, subject: Subject): RMIConnection = ???
}
