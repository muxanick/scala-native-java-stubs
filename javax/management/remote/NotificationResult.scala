package javax.management.remote

import java.io.Serializable
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** Result of a query for buffered notifications.  Notifications in
 *  a notification buffer have positive, monotonically increasing
 *  sequence numbers.  The result of a notification query contains the
 *  following elements:
 * 
 *  
 * 
 *  The sequence number of the earliest notification still in
 *  the buffer.
 * 
 *  The sequence number of the next notification available for
 *  querying.  This will be the starting sequence number for the next
 *  notification query.
 * 
 *  An array of (Notification,listenerID) pairs corresponding to
 *  the returned notifications and the listeners they correspond to.
 * 
 *  
 * 
 *  It is possible for the nextSequenceNumber to be less
 *  than the earliestSequenceNumber.  This signifies that
 *  notifications between the two might have been lost.
 */
class NotificationResult extends Object with Serializable {

    /** Constructs a notification query result. */
    @stub
    def this(earliestSequenceNumber: Long, nextSequenceNumber: Long, targetedNotifications: Array[TargetedNotification]) = ???

    /** Returns the sequence number of the earliest notification still
     *  in the buffer.
     */
    @stub
    def getEarliestSequenceNumber(): Long = ???

    /** Returns the sequence number of the next notification available
     *  for querying.
     */
    @stub
    def getNextSequenceNumber(): Long = ???

    /** Returns the notifications resulting from the query, and the
     *  listeners they correspond to.
     */
    @stub
    def getTargetedNotifications(): Array[TargetedNotification] = ???

    /** Returns a string representation of the object. */
    @stub
    def toString(): String = ???
}
