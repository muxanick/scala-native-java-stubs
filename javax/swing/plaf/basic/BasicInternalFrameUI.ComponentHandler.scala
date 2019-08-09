package javax.swing.plaf.basic

import java.awt.event.{ComponentEvent, ComponentListener}
import java.lang.Object

// 
protected class BasicInternalFrameUI.ComponentHandler extends Object with ComponentListener {

    @stub
    // Invoked when the component has been made invisible.
    def componentHidden(e: ComponentEvent): Unit = ???

    @stub
    // Invoked when the component's position changes.
    def componentMoved(e: ComponentEvent): Unit = ???

    @stub
    // Invoked when a JInternalFrame's parent's size changes.
    def componentResized(e: ComponentEvent): Unit = ???
}
