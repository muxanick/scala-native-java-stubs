package javax.management.relation

import java.lang.Object
import java.util.Vector
import javax.management.{NotificationFilterSupport, ObjectName}

// Filter for MBeanServerNotification.
// This filter filters MBeanServerNotification notifications by
// selecting the ObjectNames of interest and the operations (registration,
// unregistration, both) of interest (corresponding to notification
// types).
//
// The serialVersionUID of this class is 2605900539589789736L.
class MBeanServerNotificationFilter extends NotificationFilterSupport {

    @stub
    // Disables any MBeanServerNotification (all ObjectNames are
    // deselected).
    def disableAllObjectNames(): Unit = ???

    @stub
    // Disables MBeanServerNotifications concerning given ObjectName.
    def disableObjectName(objectName: ObjectName): Unit = ???

    @stub
    // Enables all MBeanServerNotifications (all ObjectNames are selected).
    def enableAllObjectNames(): Unit = ???

    @stub
    // Enables MBeanServerNotifications concerning given ObjectName.
    def enableObjectName(objectName: ObjectName): Unit = ???

    @stub
    // Gets all the ObjectNames disabled.
    def getDisabledObjectNames(): Vector[ObjectName] = ???

    @stub
    // Gets all the ObjectNames enabled.
    def getEnabledObjectNames(): Vector[ObjectName] = ???
}
