package javax.swing.event

import java.util.EventListener
import scala.scalanative.annotation.stub

/** Defines a menu mouse-drag listener. */
trait MenuDragMouseListener extends EventListener {

    /** Invoked when the mouse is being dragged in a menu component's
     *  display area.
     */
    @stub
    def menuDragMouseDragged(e: MenuDragMouseEvent): Unit = ???

    /** Invoked when the dragged mouse has entered a menu component's
     *  display area.
     */
    @stub
    def menuDragMouseEntered(e: MenuDragMouseEvent): Unit = ???

    /** Invoked when the dragged mouse has left a menu component's
     *  display area.
     */
    @stub
    def menuDragMouseExited(e: MenuDragMouseEvent): Unit = ???

    /** Invoked when a dragged mouse is release in a menu component's
     *  display area.
     */
    @stub
    def menuDragMouseReleased(e: MenuDragMouseEvent): Unit = ???
}
