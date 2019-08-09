package java.awt.event

import java.awt.AWTEvent
import java.lang.{Object, String}
import java.util.EventObject

/** The root event class for all component-level input events.
 * 
 *  Input events are delivered to listeners before they are
 *  processed normally by the source where they originated.
 *  This allows listeners and component subclasses to "consume"
 *  the event so that the source will not process them in their
 *  default manner.  For example, consuming mousePressed events
 *  on a Button component will prevent the Button from being
 *  activated.
 */
abstract class InputEvent extends ComponentEvent {

    /** Consumes this event so that it will not be processed
     *  in the default manner by the source which originated it.
     */
    def consume(): Unit

    /** Returns the modifier mask for this event. */
    def getModifiers(): Int

    /** Returns the extended modifier mask for this event. */
    def getModifiersEx(): Int

    /** Returns the difference in milliseconds between the timestamp of when this event occurred and
     *  midnight, January 1, 1970 UTC.
     */
    def getWhen(): Long

    /** Returns whether or not the Alt modifier is down on this event. */
    def isAltDown(): Boolean

    /** Returns whether or not the AltGraph modifier is down on this event. */
    def isAltGraphDown(): Boolean

    /** Returns whether or not this event has been consumed. */
    def isConsumed(): Boolean

    /** Returns whether or not the Control modifier is down on this event. */
    def isControlDown(): Boolean

    /** Returns whether or not the Meta modifier is down on this event. */
    def isMetaDown(): Boolean
}

object InputEvent {
    /** The Alt key extended modifier constant. */
    @stub
    val ALT_DOWN_MASK: Int = ???

    /** The AltGraph key extended modifier constant. */
    @stub
    val ALT_GRAPH_DOWN_MASK: Int = ???

    /** The AltGraph key modifier constant. */
    @stub
    val ALT_GRAPH_MASK: Int = ???

    /** The Alt key modifier constant. */
    @stub
    val ALT_MASK: Int = ???

    /** The Mouse Button1 extended modifier constant. */
    @stub
    val BUTTON1_DOWN_MASK: Int = ???

    /** The Mouse Button1 modifier constant. */
    @stub
    val BUTTON1_MASK: Int = ???

    /** The Mouse Button2 extended modifier constant. */
    @stub
    val BUTTON2_DOWN_MASK: Int = ???

    /** The Mouse Button2 modifier constant. */
    @stub
    val BUTTON2_MASK: Int = ???

    /** The Mouse Button3 extended modifier constant. */
    @stub
    val BUTTON3_DOWN_MASK: Int = ???

    /** The Mouse Button3 modifier constant. */
    @stub
    val BUTTON3_MASK: Int = ???

    /** The Control key extended modifier constant. */
    @stub
    val CTRL_DOWN_MASK: Int = ???

    /** The Control key modifier constant. */
    @stub
    val CTRL_MASK: Int = ???

    /** The Meta key extended modifier constant. */
    @stub
    val META_DOWN_MASK: Int = ???

    /** The Meta key modifier constant. */
    @stub
    val META_MASK: Int = ???

    /** The Shift key extended modifier constant. */
    @stub
    val SHIFT_DOWN_MASK: Int = ???

    /** A method to obtain a mask for any existing mouse button. */
    @stub
    def getMaskForButton(button: Int): Int = ???

    /** Returns a String describing the extended modifier keys and
     *  mouse buttons, such as "Shift", "Button1", or "Ctrl+Shift".
     */
    @stub
    def getModifiersExText(modifiers: Int): String = ???
}
