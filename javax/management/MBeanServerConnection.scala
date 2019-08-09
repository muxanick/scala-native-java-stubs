package javax.management

import java.lang.{Integer, Object, String}
import java.util.Set

// This interface represents a way to talk to an MBean server, whether
// local or remote.  The MBeanServer interface, representing a
// local MBean server, extends this interface.
trait MBeanServerConnection {

    @stub
    // Adds a listener to a registered MBean.
    def addNotificationListener(name: ObjectName, listener: NotificationListener, filter: NotificationFilter, handback: Object): Unit = ???

    @stub
    // Adds a listener to a registered MBean.
    def addNotificationListener(name: ObjectName, listener: ObjectName, filter: NotificationFilter, handback: Object): Unit = ???

    @stub
    // Instantiates and registers an MBean in the MBean server.
    def createMBean(className: String, name: ObjectName): ObjectInstance = ???

    @stub
    // Instantiates and registers an MBean in the MBean server.
    def createMBean(className: String, name: ObjectName, params: Array[Object], signature: Array[String]): ObjectInstance = ???

    @stub
    // Instantiates and registers an MBean in the MBean server.
    def createMBean(className: String, name: ObjectName, loaderName: ObjectName): ObjectInstance = ???

    @stub
    // Instantiates and registers an MBean in the MBean server.
    def createMBean(className: String, name: ObjectName, loaderName: ObjectName, params: Array[Object], signature: Array[String]): ObjectInstance = ???

    @stub
    // Gets the value of a specific attribute of a named MBean.
    def getAttribute(name: ObjectName, attribute: String): Object = ???

    @stub
    // Retrieves the values of several attributes of a named MBean.
    def getAttributes(name: ObjectName, attributes: Array[String]): AttributeList = ???

    @stub
    // Returns the default domain used for naming the MBean.
    def getDefaultDomain(): String = ???

    @stub
    // Returns the list of domains in which any MBean is currently
    // registered.
    def getDomains(): Array[String] = ???

    @stub
    // Returns the number of MBeans registered in the MBean server.
    def getMBeanCount(): Integer = ???

    @stub
    // This method discovers the attributes and operations that an
    // MBean exposes for management.
    def getMBeanInfo(name: ObjectName): MBeanInfo = ???

    @stub
    // Gets the ObjectInstance for a given MBean
    // registered with the MBean server.
    def getObjectInstance(name: ObjectName): ObjectInstance = ???

    @stub
    // Invokes an operation on an MBean.
    def invoke(name: ObjectName, operationName: String, params: Array[Object], signature: Array[String]): Object = ???

    @stub
    // Returns true if the MBean specified is an instance of the
    // specified class, false otherwise.
    def isInstanceOf(name: ObjectName, className: String): Boolean = ???

    @stub
    // Checks whether an MBean, identified by its object name, is
    // already registered with the MBean server.
    def isRegistered(name: ObjectName): Boolean = ???

    @stub
    // Gets MBeans controlled by the MBean server.
    def queryMBeans(name: ObjectName, query: QueryExp): Set[ObjectInstance] = ???

    @stub
    // Gets the names of MBeans controlled by the MBean server.
    def queryNames(name: ObjectName, query: QueryExp): Set[ObjectName] = ???

    @stub
    // Removes a listener from a registered MBean.
    def removeNotificationListener(name: ObjectName, listener: NotificationListener): Unit = ???

    @stub
    // Removes a listener from a registered MBean.
    def removeNotificationListener(name: ObjectName, listener: NotificationListener, filter: NotificationFilter, handback: Object): Unit = ???

    @stub
    // Removes a listener from a registered MBean.
    def removeNotificationListener(name: ObjectName, listener: ObjectName): Unit = ???

    @stub
    // Removes a listener from a registered MBean.
    def removeNotificationListener(name: ObjectName, listener: ObjectName, filter: NotificationFilter, handback: Object): Unit = ???

    @stub
    // Sets the value of a specific attribute of a named MBean.
    def setAttribute(name: ObjectName, attribute: Attribute): Unit = ???

    @stub
    // Sets the values of several attributes of a named MBean.
    def setAttributes(name: ObjectName, attributes: AttributeList): AttributeList = ???
}
