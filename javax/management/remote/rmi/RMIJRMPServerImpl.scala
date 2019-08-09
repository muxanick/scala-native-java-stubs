package javax.management.remote.rmi

import java.lang.{Object, String}
import java.rmi.Remote
import java.rmi.server.{RMIClientSocketFactory, RMIServerSocketFactory}
import java.util.Map
import javax.security.auth.Subject
import scala.scalanative.annotation.stub

/** An RMIServer object that is exported through JRMP and that
 *  creates client connections as RMI objects exported through JRMP.
 *  User code does not usually reference this class directly.
 */
class RMIJRMPServerImpl extends RMIServerImpl {

    /** Creates a new RMIServer object that will be exported
     *  on the given port using the given socket factories.
     */
    @stub
    def this(port: Int, csf: RMIClientSocketFactory, ssf: RMIServerSocketFactory, env: Map[String, _]) = ???

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

    /** Returns a serializable stub for this RMIServer object. */
    @stub
    def toStub(): Remote = ???
}
