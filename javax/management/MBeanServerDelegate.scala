package javax.management

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** Represents  the MBean server from the management point of view.
 *  The MBeanServerDelegate MBean emits the MBeanServerNotifications when
 *  an MBean is registered/unregistered in the MBean server.
 */
class MBeanServerDelegate extends Object with MBeanServerDelegateMBean with NotificationEmitter {

    /** Create a MBeanServerDelegate object. */
    @stub
    def this() = ???

    /** Adds a listener to this MBean. */
    @stub
    def addNotificationListener(listener: NotificationListener, filter: NotificationFilter, handback: Object): Unit = ???

    /** Returns the JMX implementation name (the name of this product). */
    @stub
    def getImplementationName(): String = ???

    /** Returns the JMX implementation vendor (the vendor of this product). */
    @stub
    def getImplementationVendor(): String = ???

    /** Returns the JMX implementation version (the version of this product). */
    @stub
    def getImplementationVersion(): String = ???

    /** Returns the MBean server agent identity. */
    @stub
    def getMBeanServerId(): String = ???

    /** Returns an array indicating, for each notification this
     *  MBean may send, the name of the Java class of the notification
     *  and the notification type.
     */
    @stub
    def getNotificationInfo(): Array[MBeanNotificationInfo] = ???

    /** Returns the full name of the JMX specification implemented
     *  by this product.
     */
    @stub
    def getSpecificationName(): String = ???

    /** Returns the vendor of the JMX specification implemented
     *  by this product.
     */
    @stub
    def getSpecificationVendor(): String = ???

    /** Returns the version of the JMX specification implemented
     *  by this product.
     */
    @stub
    def getSpecificationVersion(): String = ???

    /** Removes a listener from this MBean. */
    @stub
    def removeNotificationListener(listener: NotificationListener): Unit = ???

    /** Removes a listener from this MBean. */
    @stub
    def removeNotificationListener(listener: NotificationListener, filter: NotificationFilter, handback: Object): Unit = ???

    /** Enables the MBean server to send a notification. */
    @stub
    def sendNotification(notification: Notification): Unit = ???
}

object MBeanServerDelegate {
    /** Defines the default ObjectName of the MBeanServerDelegate. */
    @stub
    val DELEGATE_NAME: ObjectName = ???
}
