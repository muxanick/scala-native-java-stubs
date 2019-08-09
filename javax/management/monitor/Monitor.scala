package javax.management.monitor

import java.lang.{Boolean, Object, String}
import javax.management.{MBeanRegistration, MBeanServer, NotificationBroadcasterSupport, ObjectName}

/** Defines the part common to all monitor MBeans.
 *  A monitor MBean monitors values of an attribute common to a set of observed
 *  MBeans. The observed attribute is monitored at intervals specified by the
 *  granularity period. A gauge value (derived gauge) is derived from the values
 *  of the observed attribute.
 */
abstract class Monitor extends NotificationBroadcasterSupport with MonitorMBean with MBeanRegistration {

    /** Deprecated. 
     * equivalent to alreadyNotifieds[0].
     * 
     */
    protected val alreadyNotified: Int

    /** Selected monitor errors that have already been notified. */
    protected val alreadyNotifieds: Array[Int]

    /** Deprecated. 
     * No replacement.
     * 
     */
    protected val dbgTag: String

    /** The number of valid components in the vector of observed objects. */
    protected val elementCount: Int

    /** Adds the specified object in the set of observed MBeans, if this object
     *  is not already present.
     */
    def addObservedObject(object: ObjectName): Unit

    /** Tests whether the specified object is in the set of observed MBeans. */
    def containsObservedObject(object: ObjectName): Boolean

    /** Gets the granularity period (in milliseconds). */
    def getGranularityPeriod(): Long

    /** Gets the attribute being observed. */
    def getObservedAttribute(): String

    /** Deprecated. 
     * As of JMX 1.2, replaced by getObservedObjects()
     * 
     */
    def getObservedObject(): ObjectName

    /** Returns an array containing the objects being observed. */
    def getObservedObjects(): Array[ObjectName]

    /** Tests whether the monitor MBean is active. */
    def isActive(): Boolean

    /** Allows the monitor MBean to perform any operations needed after
     *  having been unregistered by the MBean server.
     */
    def postDeregister(): Unit

    /** Allows the monitor MBean to perform any operations needed after
     *  having been registered in the MBean server or after the
     *  registration has failed.
     */
    def postRegister(registrationDone: Boolean): Unit

    /** Allows the monitor MBean to perform any operations it needs
     *  before being unregistered by the MBean server.
     */
    def preDeregister(): Unit

    /** Allows the monitor MBean to perform any operations it needs
     *  before being registered in the MBean server.
     */
    def preRegister(server: MBeanServer, name: ObjectName): ObjectName

    /** Removes the specified object from the set of observed MBeans. */
    def removeObservedObject(object: ObjectName): Unit

    /** Sets the granularity period (in milliseconds). */
    def setGranularityPeriod(period: Long): Unit

    /** Sets the attribute to observe. */
    def setObservedAttribute(attribute: String): Unit

    /** Deprecated. 
     * As of JMX 1.2, replaced by addObservedObject(javax.management.ObjectName)
     * 
     */
    def setObservedObject(object: ObjectName): Unit

    /** Starts the monitor. */
    def start(): Unit
}

object Monitor {
    /** The amount by which the capacity of the monitor arrays are
     *  automatically incremented when their size becomes greater than
     *  their capacity.
     */
    @stub
    protected val capacityIncrement: Int = ???

    /** Flag denoting that a notification has occurred after changing
     *  the observed attribute.
     */
    @stub
    protected val OBSERVED_ATTRIBUTE_ERROR_NOTIFIED: Int = ???

    /** Flag denoting that a notification has occurred after changing
     *  the observed object or the observed attribute.
     */
    @stub
    protected val OBSERVED_ATTRIBUTE_TYPE_ERROR_NOTIFIED: Int = ???

    /** Flag denoting that a notification has occurred after changing
     *  the observed object.
     */
    @stub
    protected val OBSERVED_OBJECT_ERROR_NOTIFIED: Int = ???

    /** This flag is used to reset the alreadyNotifieds monitor attribute. */
    @stub
    protected val RESET_FLAGS_ALREADY_NOTIFIED: Int = ???

    /** Flag denoting that a notification has occurred after changing
     *  the observed object or the observed attribute.
     */
    @stub
    protected val RUNTIME_ERROR_NOTIFIED: Int = ???
}
