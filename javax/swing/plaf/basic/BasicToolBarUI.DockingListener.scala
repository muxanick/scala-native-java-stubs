package javax.swing.plaf.basic

import java.awt.Point
import java.awt.event.MouseEvent
import java.lang.Object
import javax.swing.event.MouseInputListener

/** This class should be treated as a "protected" inner class.
 *  Instantiate it only within subclasses of BasicToolBarUI.
 */
class BasicToolBarUI.DockingListener extends Object with MouseInputListener {

    /**  */
    @stub
    protected val isDragging: Boolean = ???

    /**  */
    @stub
    protected val origin: Point = ???

    /** Invoked when the mouse button has been clicked (pressed
     *  and released) on a component.
     */
    @stub
    def mouseClicked(e: MouseEvent): Unit = ???

    /** Invoked when a mouse button is pressed on a component and then
     *  dragged.
     */
    @stub
    def mouseDragged(e: MouseEvent): Unit = ???

    /** Invoked when the mouse enters a component. */
    @stub
    def mouseEntered(e: MouseEvent): Unit = ???

    /** Invoked when the mouse exits a component. */
    @stub
    def mouseExited(e: MouseEvent): Unit = ???

    /** Invoked when the mouse cursor has been moved onto a component
     *  but no buttons have been pushed.
     */
    @stub
    def mouseMoved(e: MouseEvent): Unit = ???

    /** Invoked when a mouse button has been pressed on a component. */
    @stub
    def mousePressed(e: MouseEvent): Unit = ???
}
