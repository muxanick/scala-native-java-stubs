package javax.swing.plaf.basic

import java.awt.event.{MouseAdapter, MouseEvent, MouseMotionListener}
import java.lang.Object

// TreeMouseListener is responsible for updating the selection
// based on mouse events.
class BasicTreeUI.MouseHandler extends MouseAdapter with MouseMotionListener {

    @stub
    // Invoked when a mouse button is pressed on a component and then
    // dragged.
    def mouseDragged(e: MouseEvent): Unit = ???

    @stub
    // Invoked when the mouse button has been moved on a component
    // (with no buttons no down).
    def mouseMoved(e: MouseEvent): Unit = ???

    @stub
    // Invoked when a mouse button has been pressed on a component.
    def mousePressed(e: MouseEvent): Unit = ???
}
