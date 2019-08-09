package javax.management.monitor

import java.lang.{Number, Object}
import javax.management.{MBeanNotificationInfo, NotificationBroadcasterSupport, ObjectName}
import scala.scalanative.annotation.stub

/** Defines a monitor MBean designed to observe the values of a gauge attribute.
 * 
 *   A gauge monitor observes an attribute that is continuously
 *  variable with time. A gauge monitor sends notifications as
 *  follows:
 * 
 *  
 * 
 *   if the attribute value is increasing and becomes equal to or
 *  greater than the high threshold value, a threshold high
 *  notification is sent. The notify high flag must be set to
 *  true.
 * 
 *  Subsequent crossings of the high threshold value do not cause
 *  further notifications unless the attribute value becomes equal to
 *  or less than the low threshold value.
 * 
 *   if the attribute value is decreasing and becomes equal to or
 *  less than the low threshold value, a threshold low
 *  notification is sent. The notify low flag must be set to
 *  true.
 * 
 *  Subsequent crossings of the low threshold value do not cause
 *  further notifications unless the attribute value becomes equal to
 *  or greater than the high threshold value.
 * 
 *  
 * 
 *  This provides a hysteresis mechanism to avoid repeated triggering
 *  of notifications when the attribute value makes small oscillations
 *  around the high or low threshold value.
 * 
 *   If the gauge difference mode is used, the value of the derived
 *  gauge is calculated as the difference between the observed gauge
 *  values for two successive observations.
 * 
 *  The derived gauge value (V[t]) is calculated using the following method:
 *  
 *  V[t] = gauge[t] - gauge[t-GP]
 *  
 * 
 *  This implementation of the gauge monitor requires the observed
 *  attribute to be of the type integer or floating-point
 *  (Byte, Integer, Short,
 *  Long, Float, Double).
 */
class GaugeMonitor extends Monitor with GaugeMonitorMBean {

    /** Default constructor. */
    @stub
    def this() = ???

    /** Deprecated. 
     * As of JMX 1.2, replaced by
     *  getDerivedGauge(ObjectName)
     * 
     */
    @stub
    def getDerivedGauge(): Number = ???

    /** Gets the derived gauge of the specified object, if this object is
     *  contained in the set of observed MBeans, or null otherwise.
     */
    @stub
    def getDerivedGauge(object: ObjectName): Number = ???

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

    /** Gets the difference mode flag value common to all observed MBeans. */
    @stub
    def getDifferenceMode(): Boolean = ???

    /** Gets the high threshold value common to all observed MBeans. */
    @stub
    def getHighThreshold(): Number = ???

    /** Gets the low threshold value common to all observed MBeans. */
    @stub
    def getLowThreshold(): Number = ???

    /** Returns a NotificationInfo object containing the
     *  name of the Java class of the notification and the notification
     *  types sent by the gauge monitor.
     */
    @stub
    def getNotificationInfo(): Array[MBeanNotificationInfo] = ???

    /** Gets the high notification's on/off switch value common to all
     *  observed MBeans.
     */
    @stub
    def getNotifyHigh(): Boolean = ???

    /** Gets the low notification's on/off switch value common to all
     *  observed MBeans.
     */
    @stub
    def getNotifyLow(): Boolean = ???

    /** Sets the difference mode flag value common to all observed MBeans. */
    @stub
    def setDifferenceMode(value: Boolean): Unit = ???

    /** Sets the high notification's on/off switch value common to all
     *  observed MBeans.
     */
    @stub
    def setNotifyHigh(value: Boolean): Unit = ???

    /** Sets the low notification's on/off switch value common to all
     *  observed MBeans.
     */
    @stub
    def setNotifyLow(value: Boolean): Unit = ???

    /** Sets the high and the low threshold values common to all
     *  observed MBeans.
     */
    @stub
    def setThresholds(highValue: Number, lowValue: Number): Unit = ???

    /** Starts the gauge monitor. */
    @stub
    def start(): Unit = ???

    /** Stops the gauge monitor. */
    @stub
    def stop(): Unit = ???
}
