package javax.management.relation

import java.lang.Object
import java.util.Vector
import javax.management.{NotificationFilterSupport, ObjectName}

/** Filter for MBeanServerNotification.
 *  This filter filters MBeanServerNotification notifications by
 *  selecting the ObjectNames of interest and the operations (registration,
 *  unregistration, both) of interest (corresponding to notification
 *  types).
 * 
 *  The serialVersionUID of this class is 2605900539589789736L.
 */
class MBeanServerNotificationFilter extends NotificationFilterSupport {

    /** Disables any MBeanServerNotification (all ObjectNames are
     *  deselected).
     */
    @stub
    def disableAllObjectNames(): Unit = ???

    /** Disables MBeanServerNotifications concerning given ObjectName. */
    @stub
    def disableObjectName(objectName: ObjectName): Unit = ???

    /** Enables all MBeanServerNotifications (all ObjectNames are selected). */
    @stub
    def enableAllObjectNames(): Unit = ???

    /** Enables MBeanServerNotifications concerning given ObjectName. */
    @stub
    def enableObjectName(objectName: ObjectName): Unit = ???

    /** Gets all the ObjectNames disabled. */
    @stub
    def getDisabledObjectNames(): Vector[ObjectName] = ???

    /** Gets all the ObjectNames enabled. */
    @stub
    def getEnabledObjectNames(): Vector[ObjectName] = ???
}
