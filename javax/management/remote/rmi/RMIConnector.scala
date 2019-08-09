package javax.management.remote.rmi

import java.io.Serializable
import java.lang.{Object, String}
import java.util.Map
import javax.management.{MBeanServerConnection, NotificationFilter, NotificationListener}
import javax.management.remote.{JMXAddressable, JMXConnector, JMXServiceURL}
import javax.security.auth.Subject

/** A connection to a remote RMI connector.  Usually, such
 *  connections are made using JMXConnectorFactory.
 *  However, specialized applications can use this class directly, for
 *  example with an RMIServer stub obtained without going
 *  through JNDI.
 */
class RMIConnector extends Object with JMXConnector with Serializable with JMXAddressable {

    /** Constructs an RMIConnector that will connect
     *  the RMI connector server with the given address.
     */
    @stub
    def this(url: JMXServiceURL, environment: Map[String, _]) = ???

    /** Adds a listener to be informed of changes in connection
     *  status.
     */
    @stub
    def addConnectionNotificationListener(listener: NotificationListener, filter: NotificationFilter, handback: Object): Unit = ???

    /** Closes the client connection to its server. */
    @stub
    def close(): Unit = ???

    /** Establishes the connection to the connector server. */
    @stub
    def connect(): Unit = ???

    /** Establishes the connection to the connector server. */
    @stub
    def connect(environment: Map[String, _]): Unit = ???

    /** The address of this connector. */
    @stub
    def getAddress(): JMXServiceURL = ???

    /** Gets this connection's ID from the connector server. */
    @stub
    def getConnectionId(): String = ???

    /** Returns an MBeanServerConnection object
     *  representing a remote MBean server.
     */
    @stub
    def getMBeanServerConnection(): MBeanServerConnection = ???

    /** Returns an MBeanServerConnection object representing
     *  a remote MBean server on which operations are performed on behalf of
     *  the supplied delegation subject.
     */
    @stub
    def getMBeanServerConnection(delegationSubject: Subject): MBeanServerConnection = ???

    /** Removes a listener from the list to be informed of changes
     *  in status.
     */
    @stub
    def removeConnectionNotificationListener(listener: NotificationListener): Unit = ???

    /** Removes a listener from the list to be informed of changes
     *  in status.
     */
    @stub
    def removeConnectionNotificationListener(listener: NotificationListener, filter: NotificationFilter, handback: Object): Unit = ???
}
