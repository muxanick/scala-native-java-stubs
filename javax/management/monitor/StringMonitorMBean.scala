package javax.management.monitor

import java.lang.String
import javax.management.ObjectName

// Exposes the remote management interface of the string monitor MBean.
trait StringMonitorMBean extends MonitorMBean {

    @stub
    // Deprecated. 
    //As of JMX 1.2, replaced by getDerivedGauge(ObjectName)
    //
    def getDerivedGauge(): String = ???

    @stub
    // Gets the derived gauge for the specified MBean.
    def getDerivedGauge(object: ObjectName): String = ???

    @stub
    // Deprecated. 
    //As of JMX 1.2, replaced by getDerivedGaugeTimeStamp(ObjectName)
    //
    def getDerivedGaugeTimeStamp(): Long = ???

    @stub
    // Gets the derived gauge timestamp for the specified MBean.
    def getDerivedGaugeTimeStamp(object: ObjectName): Long = ???

    @stub
    // Gets the differing notification's on/off switch value.
    def getNotifyDiffer(): Boolean = ???

    @stub
    // Gets the matching notification's on/off switch value.
    def getNotifyMatch(): Boolean = ???

    @stub
    // Gets the string to compare with the observed attribute.
    def getStringToCompare(): String = ???

    @stub
    // Sets the differing notification's on/off switch value.
    def setNotifyDiffer(value: Boolean): Unit = ???

    @stub
    // Sets the matching notification's on/off switch value.
    def setNotifyMatch(value: Boolean): Unit = ???
}
