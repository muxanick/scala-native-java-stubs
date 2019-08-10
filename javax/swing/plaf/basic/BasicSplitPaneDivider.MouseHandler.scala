package javax.swing.plaf.basic

import java.awt.event.{MouseAdapter, MouseEvent, MouseMotionListener}
import java.lang.Object
import scala.scalanative.annotation.stub

/** MouseHandler is responsible for converting mouse events
 *  (released, dragged...) into the appropriate DragController
 *  methods.
 */
protected class BasicSplitPaneDivider_MouseHandler extends MouseAdapter with MouseMotionListener {

    /**  */
    @stub
    protected def MouseHandler() = ???

    /** If dragger is not null it is messaged with continueDrag. */
    @stub
    def mouseDragged(e: MouseEvent): Unit = ???

    /** Invoked when the mouse enters a component. */
    @stub
    def mouseEntered(e: MouseEvent): Unit = ???

    /** Invoked when the mouse exits a component. */
    @stub
    def mouseExited(e: MouseEvent): Unit = ???

    /** Resets the cursor based on the orientation. */
    @stub
    def mouseMoved(e: MouseEvent): Unit = ???

    /** Starts the dragging session by creating the appropriate instance
     *  of DragController.
     */
    @stub
    def mousePressed(e: MouseEvent): Unit = ???

    /** If dragger is not null it is messaged with completeDrag. */
    @stub
    def mouseReleased(e: MouseEvent): Unit = ???
}
