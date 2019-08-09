package javax.swing.event

import java.util.EventListener

// Defines a menu mouse-drag listener.
trait MenuDragMouseListener extends EventListener {

    @stub
    // Invoked when the mouse is being dragged in a menu component's
    // display area.
    def menuDragMouseDragged(e: MenuDragMouseEvent): Unit = ???

    @stub
    // Invoked when the dragged mouse has entered a menu component's
    // display area.
    def menuDragMouseEntered(e: MenuDragMouseEvent): Unit = ???

    @stub
    // Invoked when the dragged mouse has left a menu component's
    // display area.
    def menuDragMouseExited(e: MenuDragMouseEvent): Unit = ???
}
