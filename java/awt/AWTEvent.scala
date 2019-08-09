package java.awt

import java.lang.{Object, String}
import java.util.EventObject

// The root event class for all AWT events.
// This class and its subclasses supercede the original
// java.awt.Event class.
// Subclasses of this root AWTEvent class defined outside of the
// java.awt.event package should define event ID values greater than
// the value defined by RESERVED_ID_MAX.
// 
// The event masks defined in this class are needed by Component subclasses
// which are using Component.enableEvents() to select for event types not
// selected by registered listeners. If a listener is registered on a
// component, the appropriate event mask is already set internally by the
// component.
// 
// The masks are also used to specify to which types of events an
// AWTEventListener should listen. The masks are bitwise-ORed together
// and passed to Toolkit.addAWTEventListener.
abstract class AWTEvent extends EventObject {

    @stub
    // Constructs an AWTEvent object from the parameters of a 1.0-style event.
    def this(event: Event) = ???

    // Controls whether or not the event is sent back down to the peer once the
    // source has processed it - false means it's sent to the peer; true means
    // it's not.
    protected def consumed: Boolean

    // The event's id.
    protected def id: Int

    // Consumes this event, if this event can be consumed.
    protected def consume(): Unit

    // Returns the event type.
    def getID(): Int

    // Returns whether this event has been consumed.
    protected def isConsumed(): Boolean

    // Returns a string representing the state of this Event.
    def paramString(): String

    // Retargets an event to a new source.
    def setSource(newSource: Object): Unit
}

object AWTEvent {
    @stub
    // The event mask for selecting action events.
    def ACTION_EVENT_MASK: Long = ???

    @stub
    // The event mask for selecting adjustment events.
    def ADJUSTMENT_EVENT_MASK: Long = ???

    @stub
    // The event mask for selecting component events.
    def COMPONENT_EVENT_MASK: Long = ???

    @stub
    // The event mask for selecting container events.
    def CONTAINER_EVENT_MASK: Long = ???

    @stub
    // The event mask for selecting focus events.
    def FOCUS_EVENT_MASK: Long = ???

    @stub
    // The event mask for selecting hierarchy bounds events.
    def HIERARCHY_BOUNDS_EVENT_MASK: Long = ???

    @stub
    // The event mask for selecting hierarchy events.
    def HIERARCHY_EVENT_MASK: Long = ???

    @stub
    // The event mask for selecting input method events.
    def INPUT_METHOD_EVENT_MASK: Long = ???

    @stub
    // The event mask for selecting invocation events.
    def INVOCATION_EVENT_MASK: Long = ???

    @stub
    // The event mask for selecting item events.
    def ITEM_EVENT_MASK: Long = ???

    @stub
    // The event mask for selecting key events.
    def KEY_EVENT_MASK: Long = ???

    @stub
    // The event mask for selecting mouse events.
    def MOUSE_EVENT_MASK: Long = ???

    @stub
    // The event mask for selecting mouse motion events.
    def MOUSE_MOTION_EVENT_MASK: Long = ???

    @stub
    // The event mask for selecting mouse wheel events.
    def MOUSE_WHEEL_EVENT_MASK: Long = ???

    @stub
    // The event mask for selecting paint events.
    def PAINT_EVENT_MASK: Long = ???

    @stub
    // The maximum value for reserved AWT event IDs.
    def RESERVED_ID_MAX: Int = ???

    @stub
    // The event mask for selecting text events.
    def TEXT_EVENT_MASK: Long = ???

    @stub
    // The event mask for selecting window events.
    def WINDOW_EVENT_MASK: Long = ???

    @stub
    // The event mask for selecting window focus events.
    def WINDOW_FOCUS_EVENT_MASK: Long = ???
}
