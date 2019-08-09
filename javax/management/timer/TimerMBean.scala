package javax.management.timer

import java.lang.{Boolean, Integer, Long, Object, String}
import java.util.{Date, Vector}

// Exposes the management interface of the timer MBean.
trait TimerMBean {

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
