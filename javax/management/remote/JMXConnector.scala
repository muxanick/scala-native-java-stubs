package javax.management.remote

import java.io.Closeable
import java.lang.{Object, String}
import java.util.Map
import javax.management.{MBeanServerConnection, NotificationFilter, NotificationListener}
import javax.security.auth.Subject
import scala.scalanative.annotation.stub

/** The client end of a JMX API connector.  An object of this type can
 *  be used to establish a connection to a connector server.
 * 
 *  A newly-created object of this type is unconnected.  Its connect method must be called before it can be used.
 *  However, objects created by JMXConnectorFactory.connect are already connected.
 */
trait JMXConnector extends Closeable {

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
    def connect(env: Map[String, _]): Unit = ???

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
    def removeConnectionNotificationListener(l: NotificationListener, f: NotificationFilter, handback: Object): Unit = ???
}

object JMXConnector {
    /** Name of the attribute that specifies the credentials to send
     *  to the connector server during connection.
     */
    @stub
    val CREDENTIALS: String = ???
}
