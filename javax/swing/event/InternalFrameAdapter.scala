package javax.swing.event

import java.lang.Object
import scala.scalanative.annotation.stub

/** An abstract adapter class for receiving internal frame events.
 *  The methods in this class are empty. This class exists as
 *  convenience for creating listener objects, and is functionally
 *  equivalent to the WindowAdapter class in the AWT.
 *  
 *  See How to Write an Internal Frame Listener
 *  in The Java Tutorial
 */
abstract class InternalFrameAdapter extends Object with InternalFrameListener {

    /**  */
    @stub
    def this() = ???

    /** Invoked when an internal frame is activated. */
    def internalFrameActivated(e: InternalFrameEvent): Unit

    /** Invoked when an internal frame has been closed. */
    def internalFrameClosed(e: InternalFrameEvent): Unit

    /** Invoked when an internal frame is in the process of being closed. */
    def internalFrameClosing(e: InternalFrameEvent): Unit

    /** Invoked when an internal frame is de-activated. */
    def internalFrameDeactivated(e: InternalFrameEvent): Unit

    /** Invoked when an internal frame is de-iconified. */
    def internalFrameDeiconified(e: InternalFrameEvent): Unit

    /** Invoked when an internal frame is iconified. */
    def internalFrameIconified(e: InternalFrameEvent): Unit

    /** Invoked when an internal frame has been opened. */
    def internalFrameOpened(e: InternalFrameEvent): Unit
}
