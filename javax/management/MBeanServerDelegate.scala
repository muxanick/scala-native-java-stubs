package javax.management

import java.lang.{Object, String}

// Represents  the MBean server from the management point of view.
// The MBeanServerDelegate MBean emits the MBeanServerNotifications when
// an MBean is registered/unregistered in the MBean server.
class MBeanServerDelegate extends Object with MBeanServerDelegateMBean, with NotificationEmitter {

    @stub
    // Adds a listener to this MBean.
    def addNotificationListener(listener: NotificationListener, filter: NotificationFilter, handback: Object): Unit = ???

    @stub
    // Returns the JMX implementation name (the name of this product).
    def getImplementationName(): String = ???

    @stub
    // Returns the JMX implementation vendor (the vendor of this product).
    def getImplementationVendor(): String = ???

    @stub
    // Returns the JMX implementation version (the version of this product).
    def getImplementationVersion(): String = ???

    @stub
    // Returns the MBean server agent identity.
    def getMBeanServerId(): String = ???

    @stub
    // Returns an array indicating, for each notification this
    // MBean may send, the name of the Java class of the notification
    // and the notification type.
    def getNotificationInfo(): Array[MBeanNotificationInfo] = ???

    @stub
    // Returns the full name of the JMX specification implemented
    // by this product.
    def getSpecificationName(): String = ???

    @stub
    // Returns the vendor of the JMX specification implemented
    // by this product.
    def getSpecificationVendor(): String = ???

    @stub
    // Returns the version of the JMX specification implemented
    // by this product.
    def getSpecificationVersion(): String = ???

    @stub
    // Removes a listener from this MBean.
    def removeNotificationListener(listener: NotificationListener): Unit = ???

    @stub
    // Removes a listener from this MBean.
    def removeNotificationListener(listener: NotificationListener, filter: NotificationFilter, handback: Object): Unit = ???
}
