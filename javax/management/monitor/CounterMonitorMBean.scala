package javax.management.monitor

import java.lang.Number
import javax.management.ObjectName
import scala.scalanative.annotation.stub

/** Exposes the remote management interface of the counter monitor MBean. */
trait CounterMonitorMBean extends MonitorMBean {

    /** Deprecated. 
     * As of JMX 1.2, replaced by getDerivedGauge(ObjectName)
     * 
     */
    @stub
    def getDerivedGauge(): Number = ???

    /** Gets the derived gauge for the specified MBean. */
    @stub
    def getDerivedGauge(object: ObjectName): Number = ???

    /** Deprecated. 
     * As of JMX 1.2, replaced by getDerivedGaugeTimeStamp(ObjectName)
     * 
     */
    @stub
    def getDerivedGaugeTimeStamp(): Long = ???

    /** Gets the derived gauge timestamp for the specified MBean. */
    @stub
    def getDerivedGaugeTimeStamp(object: ObjectName): Long = ???

    /** Gets the difference mode flag value. */
    @stub
    def getDifferenceMode(): Boolean = ???

    /** Gets the initial threshold value common to all observed objects. */
    @stub
    def getInitThreshold(): Number = ???

    /** Gets the modulus value. */
    @stub
    def getModulus(): Number = ???

    /** Gets the notification's on/off switch value. */
    @stub
    def getNotify(): Boolean = ???

    /** Gets the offset value. */
    @stub
    def getOffset(): Number = ???

    /** Deprecated. 
     * As of JMX 1.2, replaced by getThreshold(ObjectName)
     * 
     */
    @stub
    def getThreshold(): Number = ???

    /** Gets the threshold value for the specified MBean. */
    @stub
    def getThreshold(object: ObjectName): Number = ???

    /** Sets the difference mode flag value. */
    @stub
    def setDifferenceMode(value: Boolean): Unit = ???

    /** Sets the initial threshold value common to all observed MBeans. */
    @stub
    def setInitThreshold(value: Number): Unit = ???

    /** Sets the modulus value. */
    @stub
    def setModulus(value: Number): Unit = ???

    /** Sets the notification's on/off switch value. */
    @stub
    def setNotify(value: Boolean): Unit = ???

    /** Sets the offset value. */
    @stub
    def setOffset(value: Number): Unit = ???

    /** Deprecated. 
     * As of JMX 1.2, replaced by setInitThreshold(java.lang.Number)
     * 
     */
    @stub
    def setThreshold(value: Number): Unit = ???
}
