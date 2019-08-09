package javax.management.remote.rmi

import java.lang.{Object, String}
import java.util.Map
import javax.management.{MBeanServer, NotificationBroadcasterSupport}
import javax.management.remote.{JMXConnector, JMXConnectorServer, JMXServiceURL, MBeanServerForwarder}
import scala.scalanative.annotation.stub

/** A JMX API connector server that creates RMI-based connections
 *  from remote clients.  Usually, such connector servers are made
 *  using JMXConnectorServerFactory.  However, specialized applications can
 *  use this class directly, for example with an RMIServerImpl
 *  object.
 */
class RMIConnectorServer extends JMXConnectorServer {

    /** Makes an RMIConnectorServer. */
    @stub
    def this(url: JMXServiceURL, environment: Map[String, _]) = ???

    /** Makes an RMIConnectorServer for the given MBean
     *  server.
     */
    @stub
    def this(url: JMXServiceURL, environment: Map[String, _], mbeanServer: MBeanServer) = ???

    /** Makes an RMIConnectorServer for the given MBean
     *  server.
     */
    @stub
    def this(url: JMXServiceURL, environment: Map[String, _], rmiServerImpl: RMIServerImpl, mbeanServer: MBeanServer) = ???

    /** Called by a subclass when a client connection is closed
     *  normally.
     */
    @stub
    protected def connectionClosed(connectionId: String, message: String, userData: Object): Unit = ???

    /** Called by a subclass when a client connection fails. */
    @stub
    protected def connectionFailed(connectionId: String, message: String, userData: Object): Unit = ???

    /** Called by a subclass when a new client connection is opened. */
    @stub
    protected def connectionOpened(connectionId: String, message: String, userData: Object): Unit = ???

    /** The address of this connector server. */
    @stub
    def getAddress(): JMXServiceURL = ???

    /** The attributes for this connector server. */
    @stub
    def getAttributes(): Map[String, _] = ???

    /** Determines whether the connector server is active. */
    @stub
    def isActive(): Boolean = ???

    /** Inserts an object that intercepts requests for the MBean server
     *  that arrive through this connector server.
     */
    @stub
    def setMBeanServerForwarder(mbsf: MBeanServerForwarder): Unit = ???

    /** Activates the connector server, that is starts listening for
     *  client connections.
     */
    @stub
    def start(): Unit = ???

    /** Deactivates the connector server, that is, stops listening for
     *  client connections.
     */
    @stub
    def stop(): Unit = ???

    /** Returns a client stub for this connector server. */
    @stub
    def toJMXConnector(env: Map[String, _]): JMXConnector = ???
}

object RMIConnectorServer {
    /** Name of the attribute that specifies whether the RMIServer stub that represents an RMI connector server should
     *  override an existing stub at the same address.
     */
    @stub
    val JNDI_REBIND_ATTRIBUTE: String = ???

    /** Name of the attribute that specifies the RMIClientSocketFactory for the RMI objects created in
     *  conjunction with this connector.
     */
    @stub
    val RMI_CLIENT_SOCKET_FACTORY_ATTRIBUTE: String = ???

    /** Name of the attribute that specifies the RMIServerSocketFactory for the RMI objects created in
     *  conjunction with this connector.
     */
    @stub
    val RMI_SERVER_SOCKET_FACTORY_ATTRIBUTE: String = ???
}
