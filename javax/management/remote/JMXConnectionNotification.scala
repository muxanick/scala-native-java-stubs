package javax.management.remote

import java.lang.{Object, String}
import java.util.EventObject
import javax.management.Notification

// Notification emitted when a client connection is opened or
// closed or when notifications are lost.  These notifications are
// sent by connector servers (instances of JMXConnectorServer)
// and by connector clients (instances of JMXConnector).  For
// certain connectors, a session can consist of a sequence of
// connections.  Connection-opened and connection-closed notifications
// will be sent for each one.
//
// The notification type is one of the following:
//
// 
//
// 
// Type
// Meaning
// 
//
// 
// jmx.remote.connection.opened
// A new client connection has been opened.
// 
//
// 
// jmx.remote.connection.closed
// A client connection has been closed.
// 
//
// 
// jmx.remote.connection.failed
// A client connection has failed unexpectedly.
// 
//
// 
// jmx.remote.connection.notifs.lost
// A client connection has potentially lost notifications.  This
// notification only appears on the client side.
// 
// 
//
// The timeStamp of the notification is a time value
// (consistent with System.currentTimeMillis()) indicating
// when the notification was constructed.
class JMXConnectionNotification extends Notification {
}

object JMXConnectionNotification {
    @stub
    // Notification type string for a connection-closed notification.
    def CLOSED: String = ???

    @stub
    // Notification type string for a connection-failed notification.
    def FAILED: String = ???

    @stub
    // Notification type string for a connection that has possibly
    // lost notifications.
    def NOTIFS_LOST: String = ???
}
