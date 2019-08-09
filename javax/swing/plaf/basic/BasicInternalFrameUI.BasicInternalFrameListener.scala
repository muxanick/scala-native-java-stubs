package javax.swing.plaf.basic

import java.lang.Object
import javax.swing.event.{InternalFrameEvent, InternalFrameListener}

/**  */
protected class BasicInternalFrameUI.BasicInternalFrameListener extends Object with InternalFrameListener {

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
}
