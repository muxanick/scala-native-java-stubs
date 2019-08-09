package javax.management.monitor

import java.lang.{Object, String}
import javax.management.{MBeanNotificationInfo, NotificationBroadcasterSupport, ObjectName}

/** Defines a monitor MBean designed to observe the values of a string
 *  attribute.
 *  
 *  A string monitor sends notifications as follows:
 *  
 *   if the attribute value matches the string to compare value,
 *       a match notification is sent.
 *       The notify match flag must be set to true.
 *       Subsequent matchings of the string to compare values do not
 *       cause further notifications unless
 *       the attribute value differs from the string to compare value.
 *   if the attribute value differs from the string to compare value,
 *       a differ notification is sent.
 *       The notify differ flag must be set to true.
 *       Subsequent differences from the string to compare value do
 *       not cause further notifications unless
 *       the attribute value matches the string to compare value.
 *  
 */
class StringMonitor extends Monitor with StringMonitorMBean {

    /** Deprecated. 
     * As of JMX 1.2, replaced by
     *  getDerivedGauge(ObjectName)
     * 
     */
    @stub
    def getDerivedGauge(): String = ???

    /** Gets the derived gauge of the specified object, if this object is
     *  contained in the set of observed MBeans, or null otherwise.
     */
    @stub
    def getDerivedGauge(object: ObjectName): String = ???

    /** Deprecated. 
     * As of JMX 1.2, replaced by
     *  getDerivedGaugeTimeStamp(ObjectName)
     * 
     */
    @stub
    def getDerivedGaugeTimeStamp(): Long = ???

    /** Gets the derived gauge timestamp of the specified object, if
     *  this object is contained in the set of observed MBeans, or
     *  0 otherwise.
     */
    @stub
    def getDerivedGaugeTimeStamp(object: ObjectName): Long = ???

    /** Returns a NotificationInfo object containing the name of
     *  the Java class of the notification and the notification types sent by
     *  the string monitor.
     */
    @stub
    def getNotificationInfo(): Array[MBeanNotificationInfo] = ???

    /** Gets the differing notification's on/off switch value common to
     *  all observed MBeans.
     */
    @stub
    def getNotifyDiffer(): Boolean = ???

    /** Gets the matching notification's on/off switch value common to
     *  all observed MBeans.
     */
    @stub
    def getNotifyMatch(): Boolean = ???

    /** Gets the string to compare with the observed attribute common
     *  to all observed MBeans.
     */
    @stub
    def getStringToCompare(): String = ???

    /** Sets the differing notification's on/off switch value common to
     *  all observed MBeans.
     */
    @stub
    def setNotifyDiffer(value: Boolean): Unit = ???

    /** Sets the matching notification's on/off switch value common to
     *  all observed MBeans.
     */
    @stub
    def setNotifyMatch(value: Boolean): Unit = ???

    /** Sets the string to compare with the observed attribute common
     *  to all observed MBeans.
     */
    @stub
    def setStringToCompare(value: String): Unit = ???

    /** Starts the string monitor. */
    @stub
    def start(): Unit = ???
}
