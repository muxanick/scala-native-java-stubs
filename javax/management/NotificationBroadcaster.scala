package javax.management

import java.lang.Object
import scala.scalanative.annotation.stub

/** Interface implemented by an MBean that emits Notifications. It
 *  allows a listener to be registered with the MBean as a notification
 *  listener.
 * 
 *  Notification dispatch
 * 
 *  When an MBean emits a notification, it considers each listener that has been
 *  added with addNotificationListener and not
 *  subsequently removed with removeNotificationListener.
 *  If a filter was provided with that listener, and if the filter's
 *  isNotificationEnabled method returns
 *  false, the listener is ignored.  Otherwise, the listener's
 *  handleNotification method is called with
 *  the notification, as well as the handback object that was provided to
 *  addNotificationListener.
 * 
 *  If the same listener is added more than once, it is considered as many times as it was
 *  added.  It is often useful to add the same listener with different filters or handback
 *  objects.
 * 
 *  Implementations of this interface can differ regarding the thread in which the methods
 *  of filters and listeners are called.
 * 
 *  If the method call of a filter or listener throws an Exception, then that
 *  exception should not prevent other listeners from being invoked.  However, if the method
 *  call throws an Error, then it is recommended that processing of the notification
 *  stop at that point, and if it is possible to propagate the Error to the sender of
 *  the notification, this should be done.
 * 
 *  New code should use the NotificationEmitter interface
 *  instead.
 * 
 *  Implementations of this interface and of NotificationEmitter
 *  should be careful about synchronization.  In particular, it is not a good
 *  idea for an implementation to hold any locks while it is calling a
 *  listener.  To deal with the possibility that the list of listeners might
 *  change while a notification is being dispatched, a good strategy is to
 *  use a CopyOnWriteArrayList for this list.
 */
trait NotificationBroadcaster {

    /** Adds a listener to this MBean. */
    @stub
    def addNotificationListener(listener: NotificationListener, filter: NotificationFilter, handback: Any): Unit = ???

    /** Returns an array indicating, for each notification this
     *  MBean may send, the name of the Java class of the notification
     *  and the notification type.
     */
    @stub
    def getNotificationInfo(): Array[MBeanNotificationInfo] = ???

    /** Removes a listener from this MBean. */
    @stub
    def removeNotificationListener(listener: NotificationListener): Unit = ???
}
