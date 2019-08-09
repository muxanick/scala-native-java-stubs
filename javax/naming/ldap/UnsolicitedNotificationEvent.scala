package javax.naming.ldap

import java.lang.Object
import java.util.EventObject
import scala.scalanative.annotation.stub

/** This class represents an event fired in response to an unsolicited
 *  notification sent by the LDAP server.
 */
class UnsolicitedNotificationEvent extends EventObject {

    /** Constructs a new instance of UnsolicitedNotificationEvent. */
    @stub
    def this(src: Object, notice: UnsolicitedNotification) = ???

    /** Invokes the notificationReceived() method on
     *  a listener using this event.
     */
    @stub
    def dispatch(listener: UnsolicitedNotificationListener): Unit = ???

    /** Returns the unsolicited notification. */
    @stub
    def getNotification(): UnsolicitedNotification = ???
}
