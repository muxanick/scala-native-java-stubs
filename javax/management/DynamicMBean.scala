package javax.management

import java.lang.{Object, String}

// Defines the methods that should be implemented by
// a Dynamic MBean (MBean that exposes a dynamic management interface).
trait DynamicMBean {

    @stub
    // Obtain the value of a specific attribute of the Dynamic MBean.
    def getAttribute(attribute: String): Object = ???

    @stub
    // Get the values of several attributes of the Dynamic MBean.
    def getAttributes(attributes: Array[String]): AttributeList = ???

    @stub
    // Provides the exposed attributes and actions of the Dynamic MBean using an MBeanInfo object.
    def getMBeanInfo(): MBeanInfo = ???

    @stub
    // Allows an action to be invoked on the Dynamic MBean.
    def invoke(actionName: String, params: Array[Object], signature: Array[String]): Object = ???

    @stub
    // Set the value of a specific attribute of the Dynamic MBean.
    def setAttribute(attribute: Attribute): Unit = ???
}
