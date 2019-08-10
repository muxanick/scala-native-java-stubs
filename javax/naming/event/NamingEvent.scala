package javax.naming.event

import java.lang.Object
import java.util.EventObject
import javax.naming.Binding
import scala.scalanative.annotation.stub

/** This class represents an event fired by a naming/directory service.
 * 
 *  The NamingEvent's state consists of
 *  
 *  The event source: the EventContext which fired this event.
 *  The event type.
 *  The new binding: information about the object after the change.
 *  The old binding: information about the object before the change.
 *  Change information: information about the change
 *  that triggered this event; usually service provider-specific or server-specific
 *  information.
 *  
 *  
 *  Note that the event source is always the same EventContext
 *  instance  that the listener has registered with.
 *  Furthermore, the names of the bindings in
 *  the NamingEvent are always relative to that instance.
 *  For example, suppose a listener makes the following registration:
 * 
 *      NamespaceChangeListener listener = ...;
 *      src.addNamingListener("x", SUBTREE_SCOPE, listener);
 * 
 *  When an object named "x/y" is subsequently deleted, the corresponding
 *  NamingEvent (evt) must contain:
 * 
 *      evt.getEventContext() == src
 *      evt.getOldBinding().getName().equals("x/y")
 * 
 * 
 *  Care must be taken when multiple threads are accessing the same
 *  EventContext concurrently.
 *  See the
 *  package description
 *  for more information on threading issues.
 */
class NamingEvent extends EventObject {

    /** Constructs an instance of NamingEvent. */
    @stub
    def this(source: EventContext, type: Int, newBd: Binding, oldBd: Binding, changeInfo: Any) = ???

    /** Contains information about the change that generated this event. */
    @stub
    protected val changeInfo: Any = ???

    /** Contains information about the object after the change. */
    @stub
    protected val newBinding: Binding = ???

    /** Contains information about the object before the change. */
    @stub
    protected val oldBinding: Binding = ???

    /** Contains the type of this event. */
    @stub
    protected val type: Int = ???

    /** Invokes the appropriate listener method on this event. */
    @stub
    def dispatch(listener: NamingListener): Unit = ???

    /** Retrieves the change information for this event. */
    @stub
    def getChangeInfo(): Any = ???

    /** Retrieves the event source that fired this event. */
    @stub
    def getEventContext(): EventContext = ???

    /** Retrieves the binding of the object after the change. */
    @stub
    def getNewBinding(): Binding = ???

    /** Retrieves the binding of the object before the change. */
    @stub
    def getOldBinding(): Binding = ???

    /** Returns the type of this event. */
    @stub
    def getType(): Int = ???
}

object NamingEvent {
    /** Naming event type for indicating that a new object has been added. */
    @stub
    val OBJECT_ADDED: Int = ???

    /** Naming event type for indicating that an object has been changed. */
    @stub
    val OBJECT_CHANGED: Int = ???

    /** Naming event type for indicating that an object has been removed. */
    @stub
    val OBJECT_REMOVED: Int = ???

    /** Naming event type for indicating that an object has been renamed. */
    @stub
    val OBJECT_RENAMED: Int = ???
}
