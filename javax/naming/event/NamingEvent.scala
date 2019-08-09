package javax.naming.event

import java.lang.Object
import java.util.EventObject
import javax.naming.Binding

// This class represents an event fired by a naming/directory service.
//
// The NamingEvent's state consists of
// 
// The event source: the EventContext which fired this event.
// The event type.
// The new binding: information about the object after the change.
// The old binding: information about the object before the change.
// Change information: information about the change
// that triggered this event; usually service provider-specific or server-specific
// information.
// 
// 
// Note that the event source is always the same EventContext
// instance  that the listener has registered with.
// Furthermore, the names of the bindings in
// the NamingEvent are always relative to that instance.
// For example, suppose a listener makes the following registration:
//
//     NamespaceChangeListener listener = ...;
//     src.addNamingListener("x", SUBTREE_SCOPE, listener);
//
// When an object named "x/y" is subsequently deleted, the corresponding
// NamingEvent (evt) must contain:
//
//     evt.getEventContext() == src
//     evt.getOldBinding().getName().equals("x/y")
//
//
// Care must be taken when multiple threads are accessing the same
// EventContext concurrently.
// See the
// package description
// for more information on threading issues.
class NamingEvent extends EventObject {

    @stub
    // Contains information about the change that generated this event.
    protected def changeInfo: Object = ???

    @stub
    // Contains information about the object after the change.
    protected def newBinding: Binding = ???

    @stub
    // Contains information about the object before the change.
    protected def oldBinding: Binding = ???

    @stub
    // Invokes the appropriate listener method on this event.
    def dispatch(listener: NamingListener): Unit = ???

    @stub
    // Retrieves the change information for this event.
    def getChangeInfo(): Object = ???

    @stub
    // Retrieves the event source that fired this event.
    def getEventContext(): EventContext = ???

    @stub
    // Retrieves the binding of the object after the change.
    def getNewBinding(): Binding = ???

    @stub
    // Retrieves the binding of the object before the change.
    def getOldBinding(): Binding = ???
}

object NamingEvent {
    @stub
    // Naming event type for indicating that a new object has been added.
    def OBJECT_ADDED: Int = ???

    @stub
    // Naming event type for indicating that an object has been changed.
    def OBJECT_CHANGED: Int = ???

    @stub
    // Naming event type for indicating that an object has been removed.
    def OBJECT_REMOVED: Int = ???

    @stub
    // Naming event type for indicating that an object has been renamed.
    def OBJECT_RENAMED: Int = ???
}
