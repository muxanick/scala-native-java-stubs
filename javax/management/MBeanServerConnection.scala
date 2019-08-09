package javax.management

import java.lang.{Integer, Object, String}
import java.util.Set

/** This interface represents a way to talk to an MBean server, whether
 *  local or remote.  The MBeanServer interface, representing a
 *  local MBean server, extends this interface.
 */
trait MBeanServerConnection {

    /** Adds a listener to a registered MBean. */
    @stub
    def addNotificationListener(name: ObjectName, listener: NotificationListener, filter: NotificationFilter, handback: Object): Unit = ???

    /** Adds a listener to a registered MBean. */
    @stub
    def addNotificationListener(name: ObjectName, listener: ObjectName, filter: NotificationFilter, handback: Object): Unit = ???

    /** Instantiates and registers an MBean in the MBean server. */
    @stub
    def createMBean(className: String, name: ObjectName): ObjectInstance = ???

    /** Instantiates and registers an MBean in the MBean server. */
    @stub
    def createMBean(className: String, name: ObjectName, params: Array[Object], signature: Array[String]): ObjectInstance = ???

    /** Instantiates and registers an MBean in the MBean server. */
    @stub
    def createMBean(className: String, name: ObjectName, loaderName: ObjectName): ObjectInstance = ???

    /** Instantiates and registers an MBean in the MBean server. */
    @stub
    def createMBean(className: String, name: ObjectName, loaderName: ObjectName, params: Array[Object], signature: Array[String]): ObjectInstance = ???

    /** Gets the value of a specific attribute of a named MBean. */
    @stub
    def getAttribute(name: ObjectName, attribute: String): Object = ???

    /** Retrieves the values of several attributes of a named MBean. */
    @stub
    def getAttributes(name: ObjectName, attributes: Array[String]): AttributeList = ???

    /** Returns the default domain used for naming the MBean. */
    @stub
    def getDefaultDomain(): String = ???

    /** Returns the list of domains in which any MBean is currently
     *  registered.
     */
    @stub
    def getDomains(): Array[String] = ???

    /** Returns the number of MBeans registered in the MBean server. */
    @stub
    def getMBeanCount(): Integer = ???

    /** This method discovers the attributes and operations that an
     *  MBean exposes for management.
     */
    @stub
    def getMBeanInfo(name: ObjectName): MBeanInfo = ???

    /** Gets the ObjectInstance for a given MBean
     *  registered with the MBean server.
     */
    @stub
    def getObjectInstance(name: ObjectName): ObjectInstance = ???

    /** Invokes an operation on an MBean. */
    @stub
    def invoke(name: ObjectName, operationName: String, params: Array[Object], signature: Array[String]): Object = ???

    /** Returns true if the MBean specified is an instance of the
     *  specified class, false otherwise.
     */
    @stub
    def isInstanceOf(name: ObjectName, className: String): Boolean = ???

    /** Checks whether an MBean, identified by its object name, is
     *  already registered with the MBean server.
     */
    @stub
    def isRegistered(name: ObjectName): Boolean = ???

    /** Gets MBeans controlled by the MBean server. */
    @stub
    def queryMBeans(name: ObjectName, query: QueryExp): Set[ObjectInstance] = ???

    /** Gets the names of MBeans controlled by the MBean server. */
    @stub
    def queryNames(name: ObjectName, query: QueryExp): Set[ObjectName] = ???

    /** Removes a listener from a registered MBean. */
    @stub
    def removeNotificationListener(name: ObjectName, listener: NotificationListener): Unit = ???

    /** Removes a listener from a registered MBean. */
    @stub
    def removeNotificationListener(name: ObjectName, listener: NotificationListener, filter: NotificationFilter, handback: Object): Unit = ???

    /** Removes a listener from a registered MBean. */
    @stub
    def removeNotificationListener(name: ObjectName, listener: ObjectName): Unit = ???

    /** Removes a listener from a registered MBean. */
    @stub
    def removeNotificationListener(name: ObjectName, listener: ObjectName, filter: NotificationFilter, handback: Object): Unit = ???

    /** Sets the value of a specific attribute of a named MBean. */
    @stub
    def setAttribute(name: ObjectName, attribute: Attribute): Unit = ???

    /** Sets the values of several attributes of a named MBean. */
    @stub
    def setAttributes(name: ObjectName, attributes: AttributeList): AttributeList = ???
}
