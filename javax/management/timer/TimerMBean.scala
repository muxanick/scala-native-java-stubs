package javax.management.timer

import java.lang.{Boolean, Integer, Long, Object, String}
import java.util.{Date, Vector}
import scala.scalanative.annotation.stub

/** Exposes the management interface of the timer MBean. */
trait TimerMBean {

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
