package javax.naming.ldap

import java.lang.Object
import java.util.EventObject

// This class represents an event fired in response to an unsolicited
// notification sent by the LDAP server.
class UnsolicitedNotificationEvent extends EventObject {

    @stub
    // Invokes the notificationReceived() method on
    // a listener using this event.
    def dispatch(listener: UnsolicitedNotificationListener): Unit = ???
}
