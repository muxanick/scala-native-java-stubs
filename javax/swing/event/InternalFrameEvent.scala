package javax.swing.event

import java.awt.AWTEvent
import java.lang.Object
import java.util.EventObject
import javax.swing.JInternalFrame

/** An AWTEvent that adds support for
 *  JInternalFrame objects as the event source.  This class has the
 *  same event types as WindowEvent,
 *  although different IDs are used.
 *  Help on handling internal frame events
 *  is in
 *  How to Write an Internal Frame Listener,
 *  a section in The Java Tutorial.
 *  
 *  Warning:
 *  Serialized objects of this class will not be compatible with
 *  future Swing releases. The current serialization support is
 *  appropriate for short term storage or RMI between applications running
 *  the same version of Swing.  As of 1.4, support for long term storage
 *  of all JavaBeans™
 *  has been added to the java.beans package.
 *  Please see XMLEncoder.
 */
class InternalFrameEvent extends AWTEvent {

    /** Returns the originator of the event. */
    @stub
    def getInternalFrame(): JInternalFrame = ???
}

object InternalFrameEvent {
    /** The "window activated" event type. */
    @stub
    val INTERNAL_FRAME_ACTIVATED: Int = ???

    /** The "window closed" event. */
    @stub
    val INTERNAL_FRAME_CLOSED: Int = ???

    /** The "window is closing" event. */
    @stub
    val INTERNAL_FRAME_CLOSING: Int = ???

    /** The "window deactivated" event type. */
    @stub
    val INTERNAL_FRAME_DEACTIVATED: Int = ???

    /** The "window deiconified" event type. */
    @stub
    val INTERNAL_FRAME_DEICONIFIED: Int = ???

    /** The first number in the range of IDs used for internal frame events. */
    @stub
    val INTERNAL_FRAME_FIRST: Int = ???

    /** The "window iconified" event. */
    @stub
    val INTERNAL_FRAME_ICONIFIED: Int = ???

    /** The last number in the range of IDs used for internal frame events. */
    @stub
    val INTERNAL_FRAME_LAST: Int = ???
}
