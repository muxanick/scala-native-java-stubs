package javax.management.timer

import java.lang.{Boolean, Integer, Long, Object, String}
import java.util.{Date, Vector}
import javax.management.{MBeanNotificationInfo, MBeanRegistration, MBeanServer, NotificationBroadcasterSupport, ObjectName}
import scala.scalanative.annotation.stub

/** Provides the implementation of the timer MBean.
 *  The timer MBean sends out an alarm at a specified time
 *  that wakes up all the listeners registered to receive timer notifications.
 *  
 * 
 *  This class manages a list of dated timer notifications.
 *  A method allows users to add/remove as many notifications as required.
 *  When a timer notification is emitted by the timer and becomes obsolete,
 *  it is automatically removed from the list of timer notifications.
 *  Additional timer notifications can be added into regularly repeating notifications.
 *  
 * 
 *  Note:
 *  
 *  When sending timer notifications, the timer updates the notification sequence number
 *  irrespective of the notification type.
 *  The timer service relies on the system date of the host where the Timer class is loaded.
 *  Listeners may receive untimely notifications
 *  if their host has a different system date.
 *  To avoid such problems, synchronize the system date of all host machines where timing is needed.
 *  The default behavior for periodic notifications is fixed-delay execution, as
 *      specified in Timer. In order to use fixed-rate execution, use the
 *      overloaded addNotification(String, String, Object, Date, long, long, boolean) method.
 *  Notification listeners are potentially all executed in the same
 *  thread.  Therefore, they should execute rapidly to avoid holding up
 *  other listeners or perturbing the regularity of fixed-delay
 *  executions.  See NotificationBroadcasterSupport.
 *  
 */
class Timer extends NotificationBroadcasterSupport with TimerMBean with MBeanRegistration {

    /** Default constructor. */
    @stub
    def this() = ???

    /** Creates a new timer notification with the specified type, message
     *  and userData and inserts it into the list of notifications with a given date
     *  and a null period and number of occurrences.
     */
    @stub
    def addNotification(type: String, message: String, userData: Object, date: Date): Integer = ???

    /** Creates a new timer notification with the specified type, message
     *  and userData and inserts it into the list of notifications with a given date
     *  and period and a null number of occurrences.
     */
    @stub
    def addNotification(type: String, message: String, userData: Object, date: Date, period: Long): Integer = ???

    /** Creates a new timer notification with the specified type, message
     *  and userData and inserts it into the list of notifications with a given date,
     *  period and number of occurrences.
     */
    @stub
    def addNotification(type: String, message: String, userData: Object, date: Date, period: Long, nbOccurences: Long): Integer = ???

    /** Creates a new timer notification with the specified type, message
     *  and userData and inserts it into the list of notifications with a given date,
     *  period and number of occurrences.
     */
    @stub
    def addNotification(type: String, message: String, userData: Object, date: Date, period: Long, nbOccurences: Long, fixedRate: Boolean): Integer = ???

    /** Gets all timer notification identifiers registered into the list of notifications. */
    @stub
    def getAllNotificationIDs(): Vector[Integer] = ???

    /** Gets a copy of the date associated to a timer notification. */
    @stub
    def getDate(id: Integer): Date = ???

    /** Gets a copy of the flag indicating whether a periodic notification is
     *  executed at fixed-delay or at fixed-rate.
     */
    @stub
    def getFixedRate(id: Integer): Boolean = ???

    /** Gets the number of timer notifications registered into the list of notifications. */
    @stub
    def getNbNotifications(): Int = ???

    /** Gets a copy of the remaining number of occurrences associated to a timer notification. */
    @stub
    def getNbOccurences(id: Integer): Long = ???

    /** Gets all the identifiers of timer notifications corresponding to the specified type. */
    @stub
    def getNotificationIDs(type: String): Vector[Integer] = ???

    /** Returns an array indicating, for each notification this
     *  MBean may send, the name of the Java class of the notification
     *  and the notification type.
     */
    @stub
    def getNotificationInfo(): Array[MBeanNotificationInfo] = ???

    /** Gets the timer notification detailed message corresponding to the specified identifier. */
    @stub
    def getNotificationMessage(id: Integer): String = ???

    /** Gets the timer notification type corresponding to the specified identifier. */
    @stub
    def getNotificationType(id: Integer): String = ???

    /** Gets the timer notification user data object corresponding to the specified identifier. */
    @stub
    def getNotificationUserData(id: Integer): Object = ???

    /** Gets a copy of the period (in milliseconds) associated to a timer notification. */
    @stub
    def getPeriod(id: Integer): Long = ???

    /** Gets the flag indicating whether or not the timer sends past notifications. */
    @stub
    def getSendPastNotifications(): Boolean = ???

    /** Tests whether the timer MBean is active. */
    @stub
    def isActive(): Boolean = ???

    /** Tests whether the list of timer notifications is empty. */
    @stub
    def isEmpty(): Boolean = ???

    /** Allows the timer MBean to perform any operations needed after having been
     *  unregistered by the MBean server.
     */
    @stub
    def postDeregister(): Unit = ???

    /** Allows the timer MBean to perform any operations needed after having been
     *  registered in the MBean server or after the registration has failed.
     */
    @stub
    def postRegister(registrationDone: Boolean): Unit = ???

    /** Allows the timer MBean to perform any operations it needs before being unregistered
     *  by the MBean server.
     */
    @stub
    def preDeregister(): Unit = ???

    /** Allows the timer MBean to perform any operations it needs before being registered
     *  in the MBean server.
     */
    @stub
    def preRegister(server: MBeanServer, name: ObjectName): ObjectName = ???

    /** Removes all the timer notifications from the list of notifications
     *  and resets the counter used to update the timer notification identifiers.
     */
    @stub
    def removeAllNotifications(): Unit = ???

    /** Removes the timer notification corresponding to the specified identifier from the list of notifications. */
    @stub
    def removeNotification(id: Integer): Unit = ???

    /** Removes all the timer notifications corresponding to the specified type from the list of notifications. */
    @stub
    def removeNotifications(type: String): Unit = ???

    /** Sets the flag indicating whether the timer sends past notifications or not. */
    @stub
    def setSendPastNotifications(value: Boolean): Unit = ???

    /** Starts the timer. */
    @stub
    def start(): Unit = ???

    /** Stops the timer. */
    @stub
    def stop(): Unit = ???
}

object Timer {
    /** Number of milliseconds in one day. */
    @stub
    val ONE_DAY: Long = ???

    /** Number of milliseconds in one hour. */
    @stub
    val ONE_HOUR: Long = ???

    /** Number of milliseconds in one minute. */
    @stub
    val ONE_MINUTE: Long = ???

    /** Number of milliseconds in one second. */
    @stub
    val ONE_SECOND: Long = ???

    /** Number of milliseconds in one week. */
    @stub
    val ONE_WEEK: Long = ???
}
