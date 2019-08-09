package javax.management

import java.lang.{Object, String}
import java.util.Vector

/** Provides an implementation of the NotificationFilter interface.
 *  The filtering is performed on the notification type attribute.
 *  
 *  Manages a list of enabled notification types.
 *  A method allows users to enable/disable as many notification types as required.
 *  
 *  Then, before sending a notification to a listener registered with a filter,
 *  the notification broadcaster compares this notification type with all notification types
 *  enabled by the filter. The notification will be sent to the listener
 *  only if its filter enables this notification type.
 *  
 *  Example:
 *  
 *  
 *  NotificationFilterSupport myFilter = new NotificationFilterSupport();
 *  myFilter.enableType("my_example.my_type");
 *  myBroadcaster.addListener(myListener, myFilter, null);
 *  
 *  
 *  The listener myListener will only receive notifications the type of which equals/starts with "my_example.my_type".
 */
class NotificationFilterSupport extends Object with NotificationFilter {

    /** Disables all notification types. */
    @stub
    def disableAllTypes(): Unit = ???

    /** Removes the given prefix from the prefix list. */
    @stub
    def disableType(prefix: String): Unit = ???

    /** Enables all the notifications the type of which starts with the specified prefix
     *  to be sent to the listener.
     */
    @stub
    def enableType(prefix: String): Unit = ???

    /** Gets all the enabled notification types for this filter. */
    @stub
    def getEnabledTypes(): Vector[String] = ???
}
