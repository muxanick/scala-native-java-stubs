package javax.management.monitor

import java.lang.{Number, Object}
import javax.management.{MBeanNotificationInfo, NotificationBroadcasterSupport, ObjectName}

// Defines a monitor MBean designed to observe the values of a gauge attribute.
//
//  A gauge monitor observes an attribute that is continuously
// variable with time. A gauge monitor sends notifications as
// follows:
//
// 
//
//  if the attribute value is increasing and becomes equal to or
// greater than the high threshold value, a threshold high
// notification is sent. The notify high flag must be set to
// true.
//
// Subsequent crossings of the high threshold value do not cause
// further notifications unless the attribute value becomes equal to
// or less than the low threshold value.
//
//  if the attribute value is decreasing and becomes equal to or
// less than the low threshold value, a threshold low
// notification is sent. The notify low flag must be set to
// true.
//
// Subsequent crossings of the low threshold value do not cause
// further notifications unless the attribute value becomes equal to
// or greater than the high threshold value.
//
// 
//
// This provides a hysteresis mechanism to avoid repeated triggering
// of notifications when the attribute value makes small oscillations
// around the high or low threshold value.
//
//  If the gauge difference mode is used, the value of the derived
// gauge is calculated as the difference between the observed gauge
// values for two successive observations.
//
// The derived gauge value (V[t]) is calculated using the following method:
// 
// V[t] = gauge[t] - gauge[t-GP]
// 
//
// This implementation of the gauge monitor requires the observed
// attribute to be of the type integer or floating-point
// (Byte, Integer, Short,
// Long, Float, Double).
class GaugeMonitor extends Monitor with GaugeMonitorMBean {

    @stub
    // Deprecated. 
    //As of JMX 1.2, replaced by
    // getDerivedGauge(ObjectName)
    //
    def getDerivedGauge(): Number = ???

    @stub
    // Gets the derived gauge of the specified object, if this object is
    // contained in the set of observed MBeans, or null otherwise.
    def getDerivedGauge(object: ObjectName): Number = ???

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
    // Gets the difference mode flag value common to all observed MBeans.
    def getDifferenceMode(): Boolean = ???

    @stub
    // Gets the high threshold value common to all observed MBeans.
    def getHighThreshold(): Number = ???

    @stub
    // Gets the low threshold value common to all observed MBeans.
    def getLowThreshold(): Number = ???

    @stub
    // Returns a NotificationInfo object containing the
    // name of the Java class of the notification and the notification
    // types sent by the gauge monitor.
    def getNotificationInfo(): Array[MBeanNotificationInfo] = ???

    @stub
    // Gets the high notification's on/off switch value common to all
    // observed MBeans.
    def getNotifyHigh(): Boolean = ???

    @stub
    // Gets the low notification's on/off switch value common to all
    // observed MBeans.
    def getNotifyLow(): Boolean = ???

    @stub
    // Sets the difference mode flag value common to all observed MBeans.
    def setDifferenceMode(value: Boolean): Unit = ???

    @stub
    // Sets the high notification's on/off switch value common to all
    // observed MBeans.
    def setNotifyHigh(value: Boolean): Unit = ???

    @stub
    // Sets the low notification's on/off switch value common to all
    // observed MBeans.
    def setNotifyLow(value: Boolean): Unit = ???

    @stub
    // Sets the high and the low threshold values common to all
    // observed MBeans.
    def setThresholds(highValue: Number, lowValue: Number): Unit = ???

    @stub
    // Starts the gauge monitor.
    def start(): Unit = ???
}
