package javax.management.monitor

import java.lang.{Number, Object}
import javax.management.{MBeanNotificationInfo, NotificationBroadcasterSupport, ObjectName}
import scala.scalanative.annotation.stub

/** Defines a monitor MBean designed to observe the values of a counter
 *  attribute.
 * 
 *   A counter monitor sends a threshold
 *  notification when the value of the counter reaches or exceeds a
 *  threshold known as the comparison level.  The notify flag must be
 *  set to true.
 * 
 *   In addition, an offset mechanism enables particular counting
 *  intervals to be detected.  If the offset value is not zero,
 *  whenever the threshold is triggered by the counter value reaching a
 *  comparison level, that comparison level is incremented by the
 *  offset value.  This is regarded as taking place instantaneously,
 *  that is, before the count is incremented.  Thus, for each level,
 *  the threshold triggers an event notification every time the count
 *  increases by an interval equal to the offset value.
 * 
 *   If the counter can wrap around its maximum value, the modulus
 *  needs to be specified.  The modulus is the value at which the
 *  counter is reset to zero.
 * 
 *   If the counter difference mode is used, the value of the
 *  derived gauge is calculated as the difference between the observed
 *  counter values for two successive observations.  If this difference
 *  is negative, the value of the derived gauge is incremented by the
 *  value of the modulus.  The derived gauge value (V[t]) is calculated
 *  using the following method:
 * 
 *  
 *  if (counter[t] - counter[t-GP]) is positive then
 *  V[t] = counter[t] - counter[t-GP]
 *  if (counter[t] - counter[t-GP]) is negative then
 *  V[t] = counter[t] - counter[t-GP] + MODULUS
 *  
 * 
 *  This implementation of the counter monitor requires the observed
 *  attribute to be of the type integer (Byte,
 *  Integer, Short, Long).
 */
class CounterMonitor extends Monitor with CounterMonitorMBean {

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

    /** Gets the initial threshold value common to all observed objects. */
    @stub
    def getInitThreshold(): Number = ???

    /** Gets the modulus value common to all observed MBeans. */
    @stub
    def getModulus(): Number = ???

    /** Returns a NotificationInfo object containing the
     *  name of the Java class of the notification and the notification
     *  types sent by the counter monitor.
     */
    @stub
    def getNotificationInfo(): Array[MBeanNotificationInfo] = ???

    /** Gets the notification's on/off switch value common to all
     *  observed MBeans.
     */
    @stub
    def getNotify(): Boolean = ???

    /** Gets the offset value common to all observed MBeans. */
    @stub
    def getOffset(): Number = ???

    /** Deprecated. 
     * As of JMX 1.2, replaced by getThreshold(ObjectName)
     * 
     */
    @stub
    def getThreshold(): Number = ???

    /** Gets the current threshold value of the specified object, if
     *  this object is contained in the set of observed MBeans, or
     *  null otherwise.
     */
    @stub
    def getThreshold(object: ObjectName): Number = ???

    /** Sets the difference mode flag value common to all observed MBeans. */
    @stub
    def setDifferenceMode(value: Boolean): Unit = ???

    /** Sets the initial threshold value common to all observed objects. */
    @stub
    def setInitThreshold(value: Number): Unit = ???

    /** Sets the modulus value common to all observed MBeans. */
    @stub
    def setModulus(value: Number): Unit = ???

    /** Sets the notification's on/off switch value common to all
     *  observed MBeans.
     */
    @stub
    def setNotify(value: Boolean): Unit = ???

    /** Sets the offset value common to all observed MBeans. */
    @stub
    def setOffset(value: Number): Unit = ???

    /** Deprecated. 
     * As of JMX 1.2, replaced by setInitThreshold(java.lang.Number)
     * 
     */
    @stub
    def setThreshold(value: Number): Unit = ???

    /** Starts the counter monitor. */
    @stub
    def start(): Unit = ???

    /** Stops the counter monitor. */
    @stub
    def stop(): Unit = ???
}
