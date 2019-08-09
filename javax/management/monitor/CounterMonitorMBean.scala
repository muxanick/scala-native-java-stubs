package javax.management.monitor

import java.lang.Number
import javax.management.ObjectName

// Exposes the remote management interface of the counter monitor MBean.
trait CounterMonitorMBean extends MonitorMBean {

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
    // Gets the initial threshold value common to all observed objects.
    def getInitThreshold(): Number = ???

    @stub
    // Gets the modulus value.
    def getModulus(): Number = ???

    @stub
    // Gets the notification's on/off switch value.
    def getNotify(): Boolean = ???

    @stub
    // Gets the offset value.
    def getOffset(): Number = ???

    @stub
    // Deprecated. 
    //As of JMX 1.2, replaced by getThreshold(ObjectName)
    //
    def getThreshold(): Number = ???

    @stub
    // Gets the threshold value for the specified MBean.
    def getThreshold(object: ObjectName): Number = ???

    @stub
    // Sets the difference mode flag value.
    def setDifferenceMode(value: Boolean): Unit = ???

    @stub
    // Sets the initial threshold value common to all observed MBeans.
    def setInitThreshold(value: Number): Unit = ???

    @stub
    // Sets the modulus value.
    def setModulus(value: Number): Unit = ???

    @stub
    // Sets the notification's on/off switch value.
    def setNotify(value: Boolean): Unit = ???

    @stub
    // Sets the offset value.
    def setOffset(value: Number): Unit = ???
}
