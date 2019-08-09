package javax.management

import java.lang.{Object, String}
import java.util.Vector
import scala.scalanative.annotation.stub

/** This class implements of the NotificationFilter
 *  interface for the attribute change notification.
 *  The filtering is performed on the name of the observed attribute.
 *  
 *  It manages a list of enabled attribute names.
 *  A method allows users to enable/disable as many attribute names as required.
 */
class AttributeChangeNotificationFilter extends Object with NotificationFilter {

    /**  */
    @stub
    def this() = ???

    /** Disables all the attribute names. */
    @stub
    def disableAllAttributes(): Unit = ???

    /** Disables all the attribute change notifications the attribute name of which equals
     *  the specified attribute name to be sent to the listener.
     */
    @stub
    def disableAttribute(name: String): Unit = ???

    /** Enables all the attribute change notifications the attribute name of which equals
     *  the specified name to be sent to the listener.
     */
    @stub
    def enableAttribute(name: String): Unit = ???

    /** Gets all the enabled attribute names for this filter. */
    @stub
    def getEnabledAttributes(): Vector[String] = ???

    /** Invoked before sending the specified notification to the listener. */
    @stub
    def isNotificationEnabled(notification: Notification): Boolean = ???
}
