package javax.management.timer

import java.lang.{Boolean, Integer, Long, Object, String}
import java.util.{Date, Vector}
import javax.management.{MBeanNotificationInfo, MBeanRegistration, MBeanServer, NotificationBroadcasterSupport, ObjectName}

// Provides the implementation of the timer MBean.
// The timer MBean sends out an alarm at a specified time
// that wakes up all the listeners registered to receive timer notifications.
// 
//
// This class manages a list of dated timer notifications.
// A method allows users to add/remove as many notifications as required.
// When a timer notification is emitted by the timer and becomes obsolete,
// it is automatically removed from the list of timer notifications.
// Additional timer notifications can be added into regularly repeating notifications.
// 
//
// Note:
// 
// When sending timer notifications, the timer updates the notification sequence number
// irrespective of the notification type.
// The timer service relies on the system date of the host where the Timer class is loaded.
// Listeners may receive untimely notifications
// if their host has a different system date.
// To avoid such problems, synchronize the system date of all host machines where timing is needed.
// The default behavior for periodic notifications is fixed-delay execution, as
//     specified in Timer. In order to use fixed-rate execution, use the
//     overloaded addNotification(String, String, Object, Date, long, long, boolean) method.
// Notification listeners are potentially all executed in the same
// thread.  Therefore, they should execute rapidly to avoid holding up
// other listeners or perturbing the regularity of fixed-delay
// executions.  See NotificationBroadcasterSupport.
// 
class Timer extends NotificationBroadcasterSupport with TimerMBean, with MBeanRegistration {

    @stub
    // Creates a new timer notification with the specified type, message
    // and userData and inserts it into the list of notifications with a given date
    // and a null period and number of occurrences.
    def addNotification(type: String, message: String, userData: Object, date: Date): Integer = ???

    @stub
    // Creates a new timer notification with the specified type, message
    // and userData and inserts it into the list of notifications with a given date
    // and period and a null number of occurrences.
    def addNotification(type: String, message: String, userData: Object, date: Date, period: Long): Integer = ???

    @stub
    // Creates a new timer notification with the specified type, message
    // and userData and inserts it into the list of notifications with a given date,
    // period and number of occurrences.
    def addNotification(type: String, message: String, userData: Object, date: Date, period: Long, nbOccurences: Long): Integer = ???

    @stub
    // Creates a new timer notification with the specified type, message
    // and userData and inserts it into the list of notifications with a given date,
    // period and number of occurrences.
    def addNotification(type: String, message: String, userData: Object, date: Date, period: Long, nbOccurences: Long, fixedRate: Boolean): Integer = ???

    @stub
    // Gets all timer notification identifiers registered into the list of notifications.
    def getAllNotificationIDs(): Vector[Integer] = ???

    @stub
    // Gets a copy of the date associated to a timer notification.
    def getDate(id: Integer): Date = ???

    @stub
    // Gets a copy of the flag indicating whether a periodic notification is
    // executed at fixed-delay or at fixed-rate.
    def getFixedRate(id: Integer): Boolean = ???

    @stub
    // Gets the number of timer notifications registered into the list of notifications.
    def getNbNotifications(): Int = ???

    @stub
    // Gets a copy of the remaining number of occurrences associated to a timer notification.
    def getNbOccurences(id: Integer): Long = ???

    @stub
    // Gets all the identifiers of timer notifications corresponding to the specified type.
    def getNotificationIDs(type: String): Vector[Integer] = ???

    @stub
    // Returns an array indicating, for each notification this
    // MBean may send, the name of the Java class of the notification
    // and the notification type.
    def getNotificationInfo(): Array[MBeanNotificationInfo] = ???

    @stub
    // Gets the timer notification detailed message corresponding to the specified identifier.
    def getNotificationMessage(id: Integer): String = ???

    @stub
    // Gets the timer notification type corresponding to the specified identifier.
    def getNotificationType(id: Integer): String = ???

    @stub
    // Gets the timer notification user data object corresponding to the specified identifier.
    def getNotificationUserData(id: Integer): Object = ???

    @stub
    // Gets a copy of the period (in milliseconds) associated to a timer notification.
    def getPeriod(id: Integer): Long = ???

    @stub
    // Gets the flag indicating whether or not the timer sends past notifications.
    def getSendPastNotifications(): Boolean = ???

    @stub
    // Tests whether the timer MBean is active.
    def isActive(): Boolean = ???

    @stub
    // Tests whether the list of timer notifications is empty.
    def isEmpty(): Boolean = ???

    @stub
    // Allows the timer MBean to perform any operations needed after having been
    // unregistered by the MBean server.
    def postDeregister(): Unit = ???

    @stub
    // Allows the timer MBean to perform any operations needed after having been
    // registered in the MBean server or after the registration has failed.
    def postRegister(registrationDone: Boolean): Unit = ???

    @stub
    // Allows the timer MBean to perform any operations it needs before being unregistered
    // by the MBean server.
    def preDeregister(): Unit = ???

    @stub
    // Allows the timer MBean to perform any operations it needs before being registered
    // in the MBean server.
    def preRegister(server: MBeanServer, name: ObjectName): ObjectName = ???

    @stub
    // Removes all the timer notifications from the list of notifications
    // and resets the counter used to update the timer notification identifiers.
    def removeAllNotifications(): Unit = ???

    @stub
    // Removes the timer notification corresponding to the specified identifier from the list of notifications.
    def removeNotification(id: Integer): Unit = ???

    @stub
    // Removes all the timer notifications corresponding to the specified type from the list of notifications.
    def removeNotifications(type: String): Unit = ???

    @stub
    // Sets the flag indicating whether the timer sends past notifications or not.
    def setSendPastNotifications(value: Boolean): Unit = ???

    @stub
    // Starts the timer.
    def start(): Unit = ???
}

object Timer {
    @stub
    // Number of milliseconds in one day.
    def ONE_DAY: Long = ???

    @stub
    // Number of milliseconds in one hour.
    def ONE_HOUR: Long = ???

    @stub
    // Number of milliseconds in one minute.
    def ONE_MINUTE: Long = ???

    @stub
    // Number of milliseconds in one second.
    def ONE_SECOND: Long = ???
}
