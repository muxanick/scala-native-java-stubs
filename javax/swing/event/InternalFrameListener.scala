package javax.swing.event

import java.util.EventListener

// The listener interface for receiving internal frame events.
// This class is functionally equivalent to the WindowListener class
// in the AWT.
// 
// See How to Write an Internal Frame Listener
// in The Java Tutorial for further documentation.
trait InternalFrameListener extends EventListener {

    @stub
    // Invoked when an internal frame is activated.
    def internalFrameActivated(e: InternalFrameEvent): Unit = ???

    @stub
    // Invoked when an internal frame has been closed.
    def internalFrameClosed(e: InternalFrameEvent): Unit = ???

    @stub
    // Invoked when an internal frame is in the process of being closed.
    def internalFrameClosing(e: InternalFrameEvent): Unit = ???

    @stub
    // Invoked when an internal frame is de-activated.
    def internalFrameDeactivated(e: InternalFrameEvent): Unit = ???

    @stub
    // Invoked when an internal frame is de-iconified.
    def internalFrameDeiconified(e: InternalFrameEvent): Unit = ???

    @stub
    // Invoked when an internal frame is iconified.
    def internalFrameIconified(e: InternalFrameEvent): Unit = ???
}
