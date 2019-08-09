package javax.management.remote.rmi

import java.lang.{Object, String}
import javax.security.auth.Subject

/** An RMIServer object that is exported through JRMP and that
 *  creates client connections as RMI objects exported through JRMP.
 *  User code does not usually reference this class directly.
 */
class RMIJRMPServerImpl extends RMIServerImpl {

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
     *  through JRMP.
     */
    @stub
    protected def makeClient(connectionId: String, subject: Subject): RMIConnection = ???
}
