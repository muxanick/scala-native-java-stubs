package javax.management

import java.lang.Object
import java.util.concurrent.Executor
import scala.scalanative.annotation.stub

/** Provides an implementation of NotificationEmitter
 *  interface.  This can be used as the super class of an MBean that
 *  sends notifications.
 * 
 *  By default, the notification dispatch model is synchronous.
 *  That is, when a thread calls sendNotification, the
 *  NotificationListener.handleNotification method of each listener
 *  is called within that thread. You can override this default
 *  by overriding handleNotification in a subclass, or by passing an
 *  Executor to the constructor.
 * 
 *  If the method call of a filter or listener throws an Exception,
 *  then that exception does not prevent other listeners from being invoked.  However,
 *  if the method call of a filter or of Executor.execute or of
 *  handleNotification (when no Excecutor is specified) throws an
 *  Error, then that Error is propagated to the caller of
 *  sendNotification.
 * 
 *  Remote listeners added using the JMX Remote API (see JMXConnector) are not
 *  usually called synchronously.  That is, when sendNotification returns, it is
 *  not guaranteed that any remote listeners have yet received the notification.
 */
class NotificationBroadcasterSupport extends Object with NotificationEmitter {

    /** Constructs a NotificationBroadcasterSupport where each listener is invoked by the
     *  thread sending the notification.
     */
    @stub
    def this() = ???

    /** Constructs a NotificationBroadcasterSupport where each listener is invoked using
     *  the given Executor.
     */
    @stub
    def this(executor: Executor) = ???

    /** Constructs a NotificationBroadcasterSupport with information about the notifications that may be sent,
     *  and where each listener is invoked using the given Executor.
     */
    @stub
    def this(executor: Executor, info: MBeanNotificationInfo*) = ???

    /** Constructs a NotificationBroadcasterSupport with information
     *  about the notifications that may be sent.
     */
    @stub
    def this(info: MBeanNotificationInfo*) = ???

    /** Adds a listener. */
    @stub
    def addNotificationListener(listener: NotificationListener, filter: NotificationFilter, handback: Object): Unit = ???

    /** Returns an array indicating, for each notification this
     *  MBean may send, the name of the Java class of the notification
     *  and the notification type.
     */
    @stub
    def getNotificationInfo(): Array[MBeanNotificationInfo] = ???

    /** This method is called by sendNotification for each listener in order to send the
     *  notification to that listener.
     */
    @stub
    protected def handleNotification(listener: NotificationListener, notif: Notification, handback: Object): Unit = ???

    /** Removes a listener from this MBean. */
    @stub
    def removeNotificationListener(listener: NotificationListener): Unit = ???

    /** Removes a listener from this MBean. */
    @stub
    def removeNotificationListener(listener: NotificationListener, filter: NotificationFilter, handback: Object): Unit = ???

    /** Sends a notification. */
    @stub
    def sendNotification(notification: Notification): Unit = ???
}
