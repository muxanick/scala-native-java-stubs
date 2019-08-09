package javax.swing.plaf.basic

import java.awt.event.{ComponentEvent, ComponentListener}
import java.lang.Object

/**  */
protected class BasicInternalFrameUI.ComponentHandler extends Object with ComponentListener {

    /** Invoked when the component has been made invisible. */
    @stub
    def componentHidden(e: ComponentEvent): Unit = ???

    /** Invoked when the component's position changes. */
    @stub
    def componentMoved(e: ComponentEvent): Unit = ???

    /** Invoked when a JInternalFrame's parent's size changes. */
    @stub
    def componentResized(e: ComponentEvent): Unit = ???
}
