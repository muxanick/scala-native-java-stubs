package javax.management.monitor

import java.lang.{Object, String}
import javax.management.{MBeanNotificationInfo, NotificationBroadcasterSupport, ObjectName}

// Defines a monitor MBean designed to observe the values of a string
// attribute.
// 
// A string monitor sends notifications as follows:
// 
//  if the attribute value matches the string to compare value,
//      a match notification is sent.
//      The notify match flag must be set to true.
//      Subsequent matchings of the string to compare values do not
//      cause further notifications unless
//      the attribute value differs from the string to compare value.
//  if the attribute value differs from the string to compare value,
//      a differ notification is sent.
//      The notify differ flag must be set to true.
//      Subsequent differences from the string to compare value do
//      not cause further notifications unless
//      the attribute value matches the string to compare value.
// 
class StringMonitor extends Monitor with StringMonitorMBean {

    @stub
    // Deprecated. 
    //As of JMX 1.2, replaced by
    // getDerivedGauge(ObjectName)
    //
    def getDerivedGauge(): String = ???

    @stub
    // Gets the derived gauge of the specified object, if this object is
    // contained in the set of observed MBeans, or null otherwise.
    def getDerivedGauge(object: ObjectName): String = ???

    @stub
    // Deprecated. 
    //As of JMX 1.2, replaced by
    // getDerivedGaugeTimeStamp(ObjectName)
    //
    def getDerivedGaugeTimeStamp(): Long = ???

    @stub
    // Gets the derived gauge timestamp of the specified object, if
    // this object is contained in the set of observed MBeans, or
    // 0 otherwise.
    def getDerivedGaugeTimeStamp(object: ObjectName): Long = ???

    @stub
    // Returns a NotificationInfo object containing the name of
    // the Java class of the notification and the notification types sent by
    // the string monitor.
    def getNotificationInfo(): Array[MBeanNotificationInfo] = ???

    @stub
    // Gets the differing notification's on/off switch value common to
    // all observed MBeans.
    def getNotifyDiffer(): Boolean = ???

    @stub
    // Gets the matching notification's on/off switch value common to
    // all observed MBeans.
    def getNotifyMatch(): Boolean = ???

    @stub
    // Gets the string to compare with the observed attribute common
    // to all observed MBeans.
    def getStringToCompare(): String = ???

    @stub
    // Sets the differing notification's on/off switch value common to
    // all observed MBeans.
    def setNotifyDiffer(value: Boolean): Unit = ???

    @stub
    // Sets the matching notification's on/off switch value common to
    // all observed MBeans.
    def setNotifyMatch(value: Boolean): Unit = ???

    @stub
    // Sets the string to compare with the observed attribute common
    // to all observed MBeans.
    def setStringToCompare(value: String): Unit = ???

    @stub
    // Starts the string monitor.
    def start(): Unit = ???
}
