package java.awt.event

import java.awt.{AWTEvent, Window}
import java.lang.{Object, String}
import java.util.EventObject
import scala.scalanative.annotation.stub

/** A low-level event that indicates that a window has changed its status. This
 *  low-level event is generated by a Window object when it is opened, closed,
 *  activated, deactivated, iconified, or deiconified, or when focus is
 *  transfered into or out of the Window.
 *  
 *  The event is passed to every WindowListener
 *  or WindowAdapter object which registered to receive such
 *  events using the window's addWindowListener method.
 *  (WindowAdapter objects implement the
 *  WindowListener interface.) Each such listener object
 *  gets this WindowEvent when the event occurs.
 *  
 *  An unspecified behavior will be caused if the id parameter
 *  of any particular WindowEvent instance is not
 *  in the range from WINDOW_FIRST to WINDOW_LAST.
 */
class WindowEvent extends ComponentEvent {

    /** Constructs a WindowEvent object. */
    @stub
    def this(source: Window, id: Int) = ???

    /** Constructs a WindowEvent object with the specified
     *  previous and new window states.
     */
    @stub
    def this(source: Window, id: Int, oldState: Int, newState: Int) = ???

    /** Constructs a WindowEvent object with the
     *  specified opposite Window.
     */
    @stub
    def this(source: Window, id: Int, opposite: Window) = ???

    /** Constructs a WindowEvent object. */
    @stub
    def this(source: Window, id: Int, opposite: Window, oldState: Int, newState: Int) = ???

    /** For WINDOW_STATE_CHANGED events returns the
     *  new state of the window.
     */
    @stub
    def getNewState(): Int = ???

    /** For WINDOW_STATE_CHANGED events returns the
     *  previous state of the window.
     */
    @stub
    def getOldState(): Int = ???

    /** Returns the other Window involved in this focus or activation change. */
    @stub
    def getOppositeWindow(): Window = ???

    /** Returns the originator of the event. */
    @stub
    def getWindow(): Window = ???

    /** Returns a parameter string identifying this event. */
    @stub
    def paramString(): String = ???
}

object WindowEvent {
    /** The window-activated event type. */
    @stub
    val WINDOW_ACTIVATED: Int = ???

    /** The window closed event. */
    @stub
    val WINDOW_CLOSED: Int = ???

    /** The "window is closing" event. */
    @stub
    val WINDOW_CLOSING: Int = ???

    /** The window-deactivated event type. */
    @stub
    val WINDOW_DEACTIVATED: Int = ???

    /** The window deiconified event type. */
    @stub
    val WINDOW_DEICONIFIED: Int = ???

    /** The first number in the range of ids used for window events. */
    @stub
    val WINDOW_FIRST: Int = ???

    /** The window-gained-focus event type. */
    @stub
    val WINDOW_GAINED_FOCUS: Int = ???

    /** The window iconified event. */
    @stub
    val WINDOW_ICONIFIED: Int = ???

    /** The last number in the range of ids used for window events. */
    @stub
    val WINDOW_LAST: Int = ???

    /** The window-lost-focus event type. */
    @stub
    val WINDOW_LOST_FOCUS: Int = ???

    /** The window opened event. */
    @stub
    val WINDOW_OPENED: Int = ???

    /** The window-state-changed event type. */
    @stub
    val WINDOW_STATE_CHANGED: Int = ???
}
