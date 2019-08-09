package javax.management

import java.lang.{Object, String}

/** Defines the methods that should be implemented by
 *  a Dynamic MBean (MBean that exposes a dynamic management interface).
 */
trait DynamicMBean {

    /** Obtain the value of a specific attribute of the Dynamic MBean. */
    @stub
    def getAttribute(attribute: String): Object = ???

    /** Get the values of several attributes of the Dynamic MBean. */
    @stub
    def getAttributes(attributes: Array[String]): AttributeList = ???

    /** Provides the exposed attributes and actions of the Dynamic MBean using an MBeanInfo object. */
    @stub
    def getMBeanInfo(): MBeanInfo = ???

    /** Allows an action to be invoked on the Dynamic MBean. */
    @stub
    def invoke(actionName: String, params: Array[Object], signature: Array[String]): Object = ???

    /** Set the value of a specific attribute of the Dynamic MBean. */
    @stub
    def setAttribute(attribute: Attribute): Unit = ???
}
