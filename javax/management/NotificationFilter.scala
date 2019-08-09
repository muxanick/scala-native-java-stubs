package javax.management

import java.io.Serializable

/** To be implemented by a any class acting as a notification filter.
 *  It allows a registered notification listener to filter the notifications of interest.
 */
trait NotificationFilter extends Serializable {
}
