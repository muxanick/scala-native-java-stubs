package javax.management.remote

import java.io.Serializable
import java.lang.{Integer, Object, String}
import javax.management.Notification
import scala.scalanative.annotation.stub

/** A (Notification, Listener ID) pair.
 *  This class is used to associate an emitted notification
 *     with the listener ID to which it is targeted.
 */
class TargetedNotification extends Object with Serializable {

    /** Constructs a TargetedNotification object. */
    @stub
    def this(notification: Notification, listenerID: Integer) = ???

    /** The ID of the listener to which the notification is
     *     targeted.
     */
    @stub
    def getListenerID(): Integer = ???

    /** The emitted notification. */
    @stub
    def getNotification(): Notification = ???

    /** Returns a textual representation of this Targeted Notification. */
    @stub
    def toString(): String = ???
}
