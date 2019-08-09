package javax.management.remote.rmi

import java.lang.{Object, String}
import java.util.Map
import javax.management.{MBeanServer, NotificationBroadcasterSupport}
import javax.management.remote.{JMXConnectorServer, JMXServiceURL, MBeanServerForwarder}

// A JMX API connector server that creates RMI-based connections
// from remote clients.  Usually, such connector servers are made
// using JMXConnectorServerFactory.  However, specialized applications can
// use this class directly, for example with an RMIServerImpl
// object.
class RMIConnectorServer extends JMXConnectorServer {

    @stub
    // Makes an RMIConnectorServer.
    def this(url: JMXServiceURL, environment: Map[String, _]) = ???

    @stub
    // Makes an RMIConnectorServer for the given MBean
    // server.
    def this(url: JMXServiceURL, environment: Map[String, _], mbeanServer: MBeanServer) = ???

    @stub
    // Called by a subclass when a client connection is closed
    // normally.
    protected def connectionClosed(connectionId: String, message: String, userData: Object): Unit = ???

    @stub
    // Called by a subclass when a client connection fails.
    protected def connectionFailed(connectionId: String, message: String, userData: Object): Unit = ???

    @stub
    // Called by a subclass when a new client connection is opened.
    protected def connectionOpened(connectionId: String, message: String, userData: Object): Unit = ???

    @stub
    // The address of this connector server.
    def getAddress(): JMXServiceURL = ???

    @stub
    // The attributes for this connector server.
    def getAttributes(): Map[String, _] = ???

    @stub
    // Determines whether the connector server is active.
    def isActive(): Boolean = ???

    @stub
    // Inserts an object that intercepts requests for the MBean server
    // that arrive through this connector server.
    def setMBeanServerForwarder(mbsf: MBeanServerForwarder): Unit = ???

    @stub
    // Activates the connector server, that is starts listening for
    // client connections.
    def start(): Unit = ???

    @stub
    // Deactivates the connector server, that is, stops listening for
    // client connections.
    def stop(): Unit = ???
}

object RMIConnectorServer {
    @stub
    // Name of the attribute that specifies whether the RMIServer stub that represents an RMI connector server should
    // override an existing stub at the same address.
    def JNDI_REBIND_ATTRIBUTE: String = ???

    @stub
    // Name of the attribute that specifies the RMIClientSocketFactory for the RMI objects created in
    // conjunction with this connector.
    def RMI_CLIENT_SOCKET_FACTORY_ATTRIBUTE: String = ???
}
