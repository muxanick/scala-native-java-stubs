package javax.swing.plaf.basic

import java.awt.event.MouseEvent
import java.lang.Object
import javax.swing.event.MouseInputListener
import scala.scalanative.annotation.stub

/** Instantiated and used by a menu item to handle the current menu selection
 *  from mouse events. A MouseInputHandler processes and forwards all mouse events
 *  to a shared instance of the MenuSelectionManager.
 *  
 *  This class is protected so that it can be subclassed by other look and
 *  feels to implement their own mouse handling behavior. All overridden
 *  methods should call the parent methods so that the menu selection
 *  is correct.
 */
protected class BasicMenuUI_MouseInputHandler extends Object with MouseInputListener {

    /**  */
    @stub
    protected def MouseInputHandler() = ???

    /** Invoked when the mouse button has been clicked (pressed
     *  and released) on a component.
     */
    @stub
    def mouseClicked(e: MouseEvent): Unit = ???

    /** Invoked when a mouse button is pressed on the menu and then dragged. */
    @stub
    def mouseDragged(e: MouseEvent): Unit = ???

    /** Invoked when the cursor enters the menu. */
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

    /** Invoked when the mouse has been clicked on the menu. */
    @stub
    def mousePressed(e: MouseEvent): Unit = ???

    /** Invoked when the mouse has been released on the menu. */
    @stub
    def mouseReleased(e: MouseEvent): Unit = ???
}
