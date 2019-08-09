package javax.management

import java.lang.{Object, String}
import java.util.Vector

// This class implements of the NotificationFilter
// interface for the attribute change notification.
// The filtering is performed on the name of the observed attribute.
// 
// It manages a list of enabled attribute names.
// A method allows users to enable/disable as many attribute names as required.
class AttributeChangeNotificationFilter extends Object with NotificationFilter {

    @stub
    // Disables all the attribute names.
    def disableAllAttributes(): Unit = ???

    @stub
    // Disables all the attribute change notifications the attribute name of which equals
    // the specified attribute name to be sent to the listener.
    def disableAttribute(name: String): Unit = ???

    @stub
    // Enables all the attribute change notifications the attribute name of which equals
    // the specified name to be sent to the listener.
    def enableAttribute(name: String): Unit = ???

    @stub
    // Gets all the enabled attribute names for this filter.
    def getEnabledAttributes(): Vector[String] = ???
}
