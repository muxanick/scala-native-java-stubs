package javax.management.monitor

import java.lang.String
import javax.management.ObjectName

// Exposes the remote management interface of monitor MBeans.
trait MonitorMBean {

    @stub
    // Adds the specified object in the set of observed MBeans.
    def addObservedObject(object: ObjectName): Unit = ???

    @stub
    // Tests whether the specified object is in the set of observed MBeans.
    def containsObservedObject(object: ObjectName): Boolean = ???

    @stub
    // Gets the granularity period (in milliseconds).
    def getGranularityPeriod(): Long = ???

    @stub
    // Gets the attribute being observed.
    def getObservedAttribute(): String = ???

    @stub
    // Deprecated. 
    //As of JMX 1.2, replaced by getObservedObjects()
    //
    def getObservedObject(): ObjectName = ???

    @stub
    // Returns an array containing the objects being observed.
    def getObservedObjects(): Array[ObjectName] = ???

    @stub
    // Tests if the monitor MBean is active.
    def isActive(): Boolean = ???

    @stub
    // Removes the specified object from the set of observed MBeans.
    def removeObservedObject(object: ObjectName): Unit = ???

    @stub
    // Sets the granularity period (in milliseconds).
    def setGranularityPeriod(period: Long): Unit = ???

    @stub
    // Sets the attribute to observe.
    def setObservedAttribute(attribute: String): Unit = ???

    @stub
    // Deprecated. 
    //As of JMX 1.2, replaced by addObservedObject(javax.management.ObjectName)
    //
    def setObservedObject(object: ObjectName): Unit = ???

    @stub
    // Starts the monitor.
    def start(): Unit = ???
}
