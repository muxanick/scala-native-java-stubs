package javax.swing.plaf.basic

import java.lang.Object
import javax.swing.event.{InternalFrameEvent, InternalFrameListener}

// 
protected class BasicInternalFrameUI.BasicInternalFrameListener extends Object with InternalFrameListener {

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
