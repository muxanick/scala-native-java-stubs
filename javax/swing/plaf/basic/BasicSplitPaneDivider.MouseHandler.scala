package javax.swing.plaf.basic

import java.awt.event.{MouseAdapter, MouseEvent, MouseMotionListener}
import java.lang.Object

// MouseHandler is responsible for converting mouse events
// (released, dragged...) into the appropriate DragController
// methods.
protected class BasicSplitPaneDivider.MouseHandler extends MouseAdapter with MouseMotionListener {

    @stub
    // If dragger is not null it is messaged with continueDrag.
    def mouseDragged(e: MouseEvent): Unit = ???

    @stub
    // Invoked when the mouse enters a component.
    def mouseEntered(e: MouseEvent): Unit = ???

    @stub
    // Invoked when the mouse exits a component.
    def mouseExited(e: MouseEvent): Unit = ???

    @stub
    // Resets the cursor based on the orientation.
    def mouseMoved(e: MouseEvent): Unit = ???

    @stub
    // Starts the dragging session by creating the appropriate instance
    // of DragController.
    def mousePressed(e: MouseEvent): Unit = ???
}
