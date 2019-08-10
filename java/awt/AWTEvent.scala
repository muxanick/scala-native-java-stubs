package java.awt

import java.lang.{Object, String}
import java.util.EventObject
import scala.scalanative.annotation.stub

/** The root event class for all AWT events.
 *  This class and its subclasses supercede the original
 *  java.awt.Event class.
 *  Subclasses of this root AWTEvent class defined outside of the
 *  java.awt.event package should define event ID values greater than
 *  the value defined by RESERVED_ID_MAX.
 *  
 *  The event masks defined in this class are needed by Component subclasses
 *  which are using Component.enableEvents() to select for event types not
 *  selected by registered listeners. If a listener is registered on a
 *  component, the appropriate event mask is already set internally by the
 *  component.
 *  
 *  The masks are also used to specify to which types of events an
 *  AWTEventListener should listen. The masks are bitwise-ORed together
 *  and passed to Toolkit.addAWTEventListener.
 */
abstract class AWTEvent extends EventObject {

    /** Constructs an AWTEvent object from the parameters of a 1.0-style event. */
    @stub
    def this(event: Event) = ???

    /** Constructs an AWTEvent object with the specified source object and type. */
    @stub
    def this(source: Any, id: Int) = ???

    /** Controls whether or not the event is sent back down to the peer once the
     *  source has processed it - false means it's sent to the peer; true means
     *  it's not.
     */
    protected val consumed: Boolean

    /** The event's id. */
    protected val id: Int

    /** Consumes this event, if this event can be consumed. */
    protected def consume(): Unit

    /** Returns the event type. */
    def getID(): Int

    /** Returns whether this event has been consumed. */
    protected def isConsumed(): Boolean

    /** Returns a string representing the state of this Event. */
    def paramString(): String

    /** Retargets an event to a new source. */
    def setSource(newSource: Any): Unit

    /** Returns a String representation of this object. */
    def toString(): String
}

object AWTEvent {
    /** The event mask for selecting action events. */
    @stub
    val ACTION_EVENT_MASK: Long = ???

    /** The event mask for selecting adjustment events. */
    @stub
    val ADJUSTMENT_EVENT_MASK: Long = ???

    /** The event mask for selecting component events. */
    @stub
    val COMPONENT_EVENT_MASK: Long = ???

    /** The event mask for selecting container events. */
    @stub
    val CONTAINER_EVENT_MASK: Long = ???

    /** The event mask for selecting focus events. */
    @stub
    val FOCUS_EVENT_MASK: Long = ???

    /** The event mask for selecting hierarchy bounds events. */
    @stub
    val HIERARCHY_BOUNDS_EVENT_MASK: Long = ???

    /** The event mask for selecting hierarchy events. */
    @stub
    val HIERARCHY_EVENT_MASK: Long = ???

    /** The event mask for selecting input method events. */
    @stub
    val INPUT_METHOD_EVENT_MASK: Long = ???

    /** The event mask for selecting invocation events. */
    @stub
    val INVOCATION_EVENT_MASK: Long = ???

    /** The event mask for selecting item events. */
    @stub
    val ITEM_EVENT_MASK: Long = ???

    /** The event mask for selecting key events. */
    @stub
    val KEY_EVENT_MASK: Long = ???

    /** The event mask for selecting mouse events. */
    @stub
    val MOUSE_EVENT_MASK: Long = ???

    /** The event mask for selecting mouse motion events. */
    @stub
    val MOUSE_MOTION_EVENT_MASK: Long = ???

    /** The event mask for selecting mouse wheel events. */
    @stub
    val MOUSE_WHEEL_EVENT_MASK: Long = ???

    /** The event mask for selecting paint events. */
    @stub
    val PAINT_EVENT_MASK: Long = ???

    /** The maximum value for reserved AWT event IDs. */
    @stub
    val RESERVED_ID_MAX: Int = ???

    /** The event mask for selecting text events. */
    @stub
    val TEXT_EVENT_MASK: Long = ???

    /** The event mask for selecting window events. */
    @stub
    val WINDOW_EVENT_MASK: Long = ???

    /** The event mask for selecting window focus events. */
    @stub
    val WINDOW_FOCUS_EVENT_MASK: Long = ???

    /** The event mask for selecting window state events. */
    @stub
    val WINDOW_STATE_EVENT_MASK: Long = ???
}
