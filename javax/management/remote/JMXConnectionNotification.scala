package javax.management.remote

import java.lang.{Object, String}
import java.util.EventObject
import javax.management.Notification
import scala.scalanative.annotation.stub

/** Notification emitted when a client connection is opened or
 *  closed or when notifications are lost.  These notifications are
 *  sent by connector servers (instances of JMXConnectorServer)
 *  and by connector clients (instances of JMXConnector).  For
 *  certain connectors, a session can consist of a sequence of
 *  connections.  Connection-opened and connection-closed notifications
 *  will be sent for each one.
 * 
 *  The notification type is one of the following:
 * 
 *  
 * 
 *  
 *  Type
 *  Meaning
 *  
 * 
 *  
 *  jmx.remote.connection.opened
 *  A new client connection has been opened.
 *  
 * 
 *  
 *  jmx.remote.connection.closed
 *  A client connection has been closed.
 *  
 * 
 *  
 *  jmx.remote.connection.failed
 *  A client connection has failed unexpectedly.
 *  
 * 
 *  
 *  jmx.remote.connection.notifs.lost
 *  A client connection has potentially lost notifications.  This
 *  notification only appears on the client side.
 *  
 *  
 * 
 *  The timeStamp of the notification is a time value
 *  (consistent with System.currentTimeMillis()) indicating
 *  when the notification was constructed.
 */
class JMXConnectionNotification extends Notification {

    /** Constructs a new connection notification. */
    @stub
    def this(type: String, source: Any, connectionId: String, sequenceNumber: Long, message: String, userData: Any) = ???

    /** The connection ID to which this notification pertains. */
    @stub
    def getConnectionId(): String = ???
}

object JMXConnectionNotification {
    /** Notification type string for a connection-closed notification. */
    @stub
    val CLOSED: String = ???

    /** Notification type string for a connection-failed notification. */
    @stub
    val FAILED: String = ???

    /** Notification type string for a connection that has possibly
     *  lost notifications.
     */
    @stub
    val NOTIFS_LOST: String = ???

    /** Notification type string for a connection-opened notification. */
    @stub
    val OPENED: String = ???
}
