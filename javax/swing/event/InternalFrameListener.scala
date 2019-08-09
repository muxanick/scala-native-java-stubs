package javax.swing.event

import java.util.EventListener
import scala.scalanative.annotation.stub

/** The listener interface for receiving internal frame events.
 *  This class is functionally equivalent to the WindowListener class
 *  in the AWT.
 *  
 *  See How to Write an Internal Frame Listener
 *  in The Java Tutorial for further documentation.
 */
trait InternalFrameListener extends EventListener {

    /** Invoked when an internal frame is activated. */
    @stub
    def internalFrameActivated(e: InternalFrameEvent): Unit = ???

    /** Invoked when an internal frame has been closed. */
    @stub
    def internalFrameClosed(e: InternalFrameEvent): Unit = ???

    /** Invoked when an internal frame is in the process of being closed. */
    @stub
    def internalFrameClosing(e: InternalFrameEvent): Unit = ???

    /** Invoked when an internal frame is de-activated. */
    @stub
    def internalFrameDeactivated(e: InternalFrameEvent): Unit = ???

    /** Invoked when an internal frame is de-iconified. */
    @stub
    def internalFrameDeiconified(e: InternalFrameEvent): Unit = ???

    /** Invoked when an internal frame is iconified. */
    @stub
    def internalFrameIconified(e: InternalFrameEvent): Unit = ???

    /** Invoked when a internal frame has been opened. */
    @stub
    def internalFrameOpened(e: InternalFrameEvent): Unit = ???
}
