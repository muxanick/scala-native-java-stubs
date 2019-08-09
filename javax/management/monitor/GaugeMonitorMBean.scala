package javax.management.monitor

import java.lang.Number
import javax.management.ObjectName

/** Exposes the remote management interface of the gauge monitor MBean. */
trait GaugeMonitorMBean extends MonitorMBean {

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

    /** Gets the high threshold value. */
    @stub
    def getHighThreshold(): Number = ???

    /** Gets the low threshold value. */
    @stub
    def getLowThreshold(): Number = ???

    /** Gets the high notification's on/off switch value. */
    @stub
    def getNotifyHigh(): Boolean = ???

    /** Gets the low notification's on/off switch value. */
    @stub
    def getNotifyLow(): Boolean = ???

    /** Sets the difference mode flag value. */
    @stub
    def setDifferenceMode(value: Boolean): Unit = ???

    /** Sets the high notification's on/off switch value. */
    @stub
    def setNotifyHigh(value: Boolean): Unit = ???

    /** Sets the low notification's on/off switch value. */
    @stub
    def setNotifyLow(value: Boolean): Unit = ???
}
