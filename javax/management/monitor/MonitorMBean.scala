package javax.management.monitor

import java.lang.String
import javax.management.ObjectName

/** Exposes the remote management interface of monitor MBeans. */
trait MonitorMBean {

    /** Adds the specified object in the set of observed MBeans. */
    @stub
    def addObservedObject(object: ObjectName): Unit = ???

    /** Tests whether the specified object is in the set of observed MBeans. */
    @stub
    def containsObservedObject(object: ObjectName): Boolean = ???

    /** Gets the granularity period (in milliseconds). */
    @stub
    def getGranularityPeriod(): Long = ???

    /** Gets the attribute being observed. */
    @stub
    def getObservedAttribute(): String = ???

    /** Deprecated. 
     * As of JMX 1.2, replaced by getObservedObjects()
     * 
     */
    @stub
    def getObservedObject(): ObjectName = ???

    /** Returns an array containing the objects being observed. */
    @stub
    def getObservedObjects(): Array[ObjectName] = ???

    /** Tests if the monitor MBean is active. */
    @stub
    def isActive(): Boolean = ???

    /** Removes the specified object from the set of observed MBeans. */
    @stub
    def removeObservedObject(object: ObjectName): Unit = ???

    /** Sets the granularity period (in milliseconds). */
    @stub
    def setGranularityPeriod(period: Long): Unit = ???

    /** Sets the attribute to observe. */
    @stub
    def setObservedAttribute(attribute: String): Unit = ???

    /** Deprecated. 
     * As of JMX 1.2, replaced by addObservedObject(javax.management.ObjectName)
     * 
     */
    @stub
    def setObservedObject(object: ObjectName): Unit = ???

    /** Starts the monitor. */
    @stub
    def start(): Unit = ???
}
