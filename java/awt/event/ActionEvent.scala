package java.awt.event

import java.awt.AWTEvent
import java.lang.{Object, String}
import java.util.EventObject
import scala.scalanative.annotation.stub

/** A semantic event which indicates that a component-defined action occurred.
 *  This high-level event is generated by a component (such as a
 *  Button) when
 *  the component-specific action occurs (such as being pressed).
 *  The event is passed to every ActionListener object
 *  that registered to receive such events using the component's
 *  addActionListener method.
 *  
 *  Note: To invoke an ActionEvent on a
 *  Button using the keyboard, use the Space bar.
 *  
 *  The object that implements the ActionListener interface
 *  gets this ActionEvent when the event occurs. The listener
 *  is therefore spared the details of processing individual mouse movements
 *  and mouse clicks, and can instead process a "meaningful" (semantic)
 *  event like "button pressed".
 *  
 *  An unspecified behavior will be caused if the id parameter
 *  of any particular ActionEvent instance is not
 *  in the range from ACTION_FIRST to ACTION_LAST.
 */
class ActionEvent extends AWTEvent {

    /** Constructs an ActionEvent object. */
    @stub
    def this(source: Object, id: Int, command: String) = ???

    /** Constructs an ActionEvent object with modifier keys. */
    @stub
    def this(source: Object, id: Int, command: String, modifiers: Int) = ???

    /** Constructs an ActionEvent object with the specified
     *  modifier keys and timestamp.
     */
    @stub
    def this(source: Object, id: Int, command: String, when: Long, modifiers: Int) = ???

    /** Returns the command string associated with this action. */
    @stub
    def getActionCommand(): String = ???

    /** Returns the modifier keys held down during this action event. */
    @stub
    def getModifiers(): Int = ???

    /** Returns the timestamp of when this event occurred. */
    @stub
    def getWhen(): Long = ???

    /** Returns a parameter string identifying this action event. */
    @stub
    def paramString(): String = ???
}

object ActionEvent {
    /** The first number in the range of ids used for action events. */
    @stub
    val ACTION_FIRST: Int = ???

    /** The last number in the range of ids used for action events. */
    @stub
    val ACTION_LAST: Int = ???

    /** This event id indicates that a meaningful action occurred. */
    @stub
    val ACTION_PERFORMED: Int = ???

    /** The alt modifier. */
    @stub
    val ALT_MASK: Int = ???

    /** The control modifier. */
    @stub
    val CTRL_MASK: Int = ???

    /** The meta modifier. */
    @stub
    val META_MASK: Int = ???

    /** The shift modifier. */
    @stub
    val SHIFT_MASK: Int = ???
}
