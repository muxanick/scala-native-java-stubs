package javax.management.monitor

import java.lang.Number
import javax.management.ObjectName

// Exposes the remote management interface of the gauge monitor MBean.
trait GaugeMonitorMBean extends MonitorMBean {

    @stub
    // Deprecated. 
    //As of JMX 1.2, replaced by getDerivedGauge(ObjectName)
    //
    def getDerivedGauge(): Number = ???

    @stub
    // Gets the derived gauge for the specified MBean.
    def getDerivedGauge(object: ObjectName): Number = ???

    @stub
    // Deprecated. 
    //As of JMX 1.2, replaced by getDerivedGaugeTimeStamp(ObjectName)
    //
    def getDerivedGaugeTimeStamp(): Long = ???

    @stub
    // Gets the derived gauge timestamp for the specified MBean.
    def getDerivedGaugeTimeStamp(object: ObjectName): Long = ???

    @stub
    // Gets the difference mode flag value.
    def getDifferenceMode(): Boolean = ???

    @stub
    // Gets the high threshold value.
    def getHighThreshold(): Number = ???

    @stub
    // Gets the low threshold value.
    def getLowThreshold(): Number = ???

    @stub
    // Gets the high notification's on/off switch value.
    def getNotifyHigh(): Boolean = ???

    @stub
    // Gets the low notification's on/off switch value.
    def getNotifyLow(): Boolean = ???

    @stub
    // Sets the difference mode flag value.
    def setDifferenceMode(value: Boolean): Unit = ???

    @stub
    // Sets the high notification's on/off switch value.
    def setNotifyHigh(value: Boolean): Unit = ???

    @stub
    // Sets the low notification's on/off switch value.
    def setNotifyLow(value: Boolean): Unit = ???
}
