package javax.management.remote.rmi

import java.io.Serializable
import java.lang.{Object, String}
import java.util.Map
import javax.management.{MBeanServerConnection, NotificationFilter, NotificationListener}
import javax.management.remote.{JMXAddressable, JMXConnector, JMXServiceURL}
import javax.security.auth.Subject

// A connection to a remote RMI connector.  Usually, such
// connections are made using JMXConnectorFactory.
// However, specialized applications can use this class directly, for
// example with an RMIServer stub obtained without going
// through JNDI.
class RMIConnector extends Object with JMXConnector, with Serializable, with JMXAddressable {

    @stub
    // Constructs an RMIConnector that will connect
    // the RMI connector server with the given address.
    def this(url: JMXServiceURL, environment: Map[String, _]) = ???

    @stub
    // Adds a listener to be informed of changes in connection
    // status.
    def addConnectionNotificationListener(listener: NotificationListener, filter: NotificationFilter, handback: Object): Unit = ???

    @stub
    // Closes the client connection to its server.
    def close(): Unit = ???

    @stub
    // Establishes the connection to the connector server.
    def connect(): Unit = ???

    @stub
    // Establishes the connection to the connector server.
    def connect(environment: Map[String, _]): Unit = ???

    @stub
    // The address of this connector.
    def getAddress(): JMXServiceURL = ???

    @stub
    // Gets this connection's ID from the connector server.
    def getConnectionId(): String = ???

    @stub
    // Returns an MBeanServerConnection object
    // representing a remote MBean server.
    def getMBeanServerConnection(): MBeanServerConnection = ???

    @stub
    // Returns an MBeanServerConnection object representing
    // a remote MBean server on which operations are performed on behalf of
    // the supplied delegation subject.
    def getMBeanServerConnection(delegationSubject: Subject): MBeanServerConnection = ???

    @stub
    // Removes a listener from the list to be informed of changes
    // in status.
    def removeConnectionNotificationListener(listener: NotificationListener): Unit = ???

    @stub
    // Removes a listener from the list to be informed of changes
    // in status.
    def removeConnectionNotificationListener(listener: NotificationListener, filter: NotificationFilter, handback: Object): Unit = ???
}
