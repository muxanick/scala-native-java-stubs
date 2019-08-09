package javax.management.remote

import java.io.Serializable
import java.lang.{Integer, Object}
import javax.management.Notification

/** A (Notification, Listener ID) pair.
 *  This class is used to associate an emitted notification
 *     with the listener ID to which it is targeted.
 */
class TargetedNotification extends Object with Serializable {

    /** The ID of the listener to which the notification is
     *     targeted.
     */
    @stub
    def getListenerID(): Integer = ???

    /** The emitted notification. */
    @stub
    def getNotification(): Notification = ???
}
