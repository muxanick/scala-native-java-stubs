package javax.management.remote.rmi

import java.io.Closeable
import java.lang.{ClassLoader, Object, String}
import javax.management.MBeanServer
import javax.security.auth.Subject

// An RMI object representing a connector server.  Remote clients
// can make connections using the newClient(Object) method.  This
// method returns an RMI object representing the connection.
//
// User code does not usually reference this class directly.
// RMI connection servers are usually created with the class RMIConnectorServer.  Remote clients usually create connections
// either with JMXConnectorFactory
// or by instantiating RMIConnector.
//
// This is an abstract class.  Concrete subclasses define the
// details of the client connection objects, such as whether they use
// JRMP or IIOP.
abstract class RMIServerImpl extends Object with Closeable, with RMIServer {

    // Method called when a client connection created by makeClient is closed.
    protected def clientClosed(client: RMIConnection): Unit

    // Closes this connection server.
    def close(): Unit

    // Closes a client connection made by makeClient.
    protected def closeClient(client: RMIConnection): Unit

    // Called by close() to close the connector server.
    protected def closeServer(): Unit

    // Exports this RMI object.
    protected def export(): Unit

    // Gets the default ClassLoader used by this connector
    // server.
    def getDefaultClassLoader(): ClassLoader

    // The MBeanServer to which this connector server
    // is attached.
    def getMBeanServer(): MBeanServer

    // Returns the protocol string for this object.
    protected def getProtocol(): String

    // The version of the RMI Connector Protocol understood by this
    // connector server.
    def getVersion(): String

    // Creates a new client connection.
    protected def makeClient(connectionId: String, subject: Subject): RMIConnection

    // Creates a new client connection.
    def newClient(credentials: Object): RMIConnection

    // Sets the default ClassLoader for this connector
    // server.
    def setDefaultClassLoader(cl: ClassLoader): Unit

    // Sets the MBeanServer to which this connector
    // server is attached.
    def setMBeanServer(mbs: MBeanServer): Unit
}
