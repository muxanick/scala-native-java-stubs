package javax.management.monitor

import java.lang.String
import javax.management.ObjectName
import scala.scalanative.annotation.stub

/** Exposes the remote management interface of the string monitor MBean. */
trait StringMonitorMBean extends MonitorMBean {

    /** Deprecated. 
     * As of JMX 1.2, replaced by getDerivedGauge(ObjectName)
     * 
     */
    @stub
    def getDerivedGauge(): String = ???

    /** Gets the derived gauge for the specified MBean. */
    @stub
    def getDerivedGauge(object: ObjectName): String = ???

    /** Deprecated. 
     * As of JMX 1.2, replaced by getDerivedGaugeTimeStamp(ObjectName)
     * 
     */
    @stub
    def getDerivedGaugeTimeStamp(): Long = ???

    /** Gets the derived gauge timestamp for the specified MBean. */
    @stub
    def getDerivedGaugeTimeStamp(object: ObjectName): Long = ???

    /** Gets the differing notification's on/off switch value. */
    @stub
    def getNotifyDiffer(): Boolean = ???

    /** Gets the matching notification's on/off switch value. */
    @stub
    def getNotifyMatch(): Boolean = ???

    /** Gets the string to compare with the observed attribute. */
    @stub
    def getStringToCompare(): String = ???

    /** Sets the differing notification's on/off switch value. */
    @stub
    def setNotifyDiffer(value: Boolean): Unit = ???

    /** Sets the matching notification's on/off switch value. */
    @stub
    def setNotifyMatch(value: Boolean): Unit = ???

    /** Sets the string to compare with the observed attribute. */
    @stub
    def setStringToCompare(value: String): Unit = ???
}
