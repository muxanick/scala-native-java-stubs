package javax.swing.plaf.basic

import java.awt.event.{MouseAdapter, MouseEvent, MouseMotionListener}
import java.lang.Object

/** TreeMouseListener is responsible for updating the selection
 *  based on mouse events.
 */
class BasicTreeUI.MouseHandler extends MouseAdapter with MouseMotionListener {

    /** Invoked when a mouse button is pressed on a component and then
     *  dragged.
     */
    @stub
    def mouseDragged(e: MouseEvent): Unit = ???

    /** Invoked when the mouse button has been moved on a component
     *  (with no buttons no down).
     */
    @stub
    def mouseMoved(e: MouseEvent): Unit = ???

    /** Invoked when a mouse button has been pressed on a component. */
    @stub
    def mousePressed(e: MouseEvent): Unit = ???
}
