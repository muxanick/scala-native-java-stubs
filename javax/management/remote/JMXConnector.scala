package javax.management.remote

import java.io.Closeable
import java.lang.{Object, String}
import java.util.Map
import javax.management.{MBeanServerConnection, NotificationFilter, NotificationListener}
import javax.security.auth.Subject

// The client end of a JMX API connector.  An object of this type can
// be used to establish a connection to a connector server.
//
// A newly-created object of this type is unconnected.  Its connect method must be called before it can be used.
// However, objects created by JMXConnectorFactory.connect are already connected.
trait JMXConnector extends Closeable {

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
    def connect(env: Map[String, _]): Unit = ???

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
}
