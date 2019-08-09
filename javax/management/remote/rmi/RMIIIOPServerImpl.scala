package javax.management.remote.rmi

import java.lang.{Object, String}
import javax.security.auth.Subject

/** An RMIServerImpl that is exported through IIOP and that
 *  creates client connections as RMI objects exported through IIOP.
 *  User code does not usually reference this class directly.
 */
class RMIIIOPServerImpl extends RMIServerImpl {

    /** Closes a client connection made by makeClient. */
    @stub
    protected def closeClient(client: RMIConnection): Unit = ???

    /** Called by RMIServerImpl.close() to close the connector server by
     *  unexporting this object.
     */
    @stub
    protected def closeServer(): Unit = ???

    /** Exports this RMI object. */
    @stub
    protected def export(): Unit = ???

    /** Returns the protocol string for this object. */
    @stub
    protected def getProtocol(): String = ???

    /** Creates a new client connection as an RMI object exported
     *  through IIOP.
     */
    @stub
    protected def makeClient(connectionId: String, subject: Subject): RMIConnection = ???
}
