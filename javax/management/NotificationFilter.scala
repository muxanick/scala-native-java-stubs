package javax.management

import java.io.Serializable
import scala.scalanative.annotation.stub

/** To be implemented by a any class acting as a notification filter.
 *  It allows a registered notification listener to filter the notifications of interest.
 */
trait NotificationFilter extends Serializable {

    /** Invoked before sending the specified notification to the listener. */
    @stub
    def isNotificationEnabled(notification: Notification): Boolean = ???
}
