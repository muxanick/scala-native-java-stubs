package javax.management

import java.lang.{Class, Object}
import scala.scalanative.annotation.stub

/** An MBean whose management interface is determined by reflection
 *  on a Java interface, and that emits notifications.
 * 
 *  The following example shows how to use the public constructor
 *  StandardEmitterMBean(implementation, mbeanInterface, emitter) to
 *  create an MBean emitting notifications with any
 *  implementation class name Impl, with a management
 *  interface defined (as for current Standard MBeans) by any interface
 *  Intf, and with any implementation of the interface
 *  NotificationEmitter. The example uses the class
 *  NotificationBroadcasterSupport as an implementation
 *  of the interface NotificationEmitter.
 * 
 *      
 *      MBeanServer mbs;
 *      ...
 *      final String[] types = new String[] {"sun.disc.space","sun.disc.alarm"};
 *      final MBeanNotificationInfo info = new MBeanNotificationInfo(
 *                                           types,
 *                                           Notification.class.getName(),
 *                                           "Notification about disc info.");
 *      final NotificationEmitter emitter =
 *                     new NotificationBroadcasterSupport(info);
 * 
 *      final Intf impl = new Impl(...);
 *      final Object mbean = new StandardEmitterMBean(
 *                                      impl, Intf.class, emitter);
 *      mbs.registerMBean(mbean, objectName);
 *      
 */
class StandardEmitterMBean extends StandardMBean with NotificationEmitter {

    /** Make an MBean whose management interface is specified by
     *  mbeanInterface, and where notifications are handled by
     *  the given NotificationEmitter.
     */
    @stub
    protected def this(mbeanInterface: Class[_], isMXBean: Boolean, emitter: NotificationEmitter) = ???

    /** Make an MBean whose management interface is specified by
     *  mbeanInterface, and
     *  where notifications are handled by the given NotificationEmitter.
     */
    @stub
    protected def this(mbeanInterface: Class[_], emitter: NotificationEmitter) = ???

    /** Make an MBean whose management interface is specified by
     *  mbeanInterface, with the given implementation and where
     *  notifications are handled by the given NotificationEmitter.
     */
    @stub
    def this(implementation: T, mbeanInterface: Class[T], isMXBean: Boolean, emitter: NotificationEmitter) = ???

    /** Make an MBean whose management interface is specified by
     *  mbeanInterface, with the given implementation and
     *  where notifications are handled by the given NotificationEmitter.
     */
    @stub
    def this(implementation: T, mbeanInterface: Class[T], emitter: NotificationEmitter) = ???

    /** Adds a listener to this MBean. */
    @stub
    def addNotificationListener(listener: NotificationListener, filter: NotificationFilter, handback: Object): Unit = ???

    /** Returns an array indicating, for each notification this
     *  MBean may send, the name of the Java class of the notification
     *  and the notification type.
     */
    @stub
    def getNotificationInfo(): Array[MBeanNotificationInfo] = ???

    /** Removes a listener from this MBean. */
    @stub
    def removeNotificationListener(listener: NotificationListener): Unit = ???

    /** Removes a listener from this MBean. */
    @stub
    def removeNotificationListener(listener: NotificationListener, filter: NotificationFilter, handback: Object): Unit = ???

    /** Sends a notification. */
    @stub
    def sendNotification(n: Notification): Unit = ???
}
