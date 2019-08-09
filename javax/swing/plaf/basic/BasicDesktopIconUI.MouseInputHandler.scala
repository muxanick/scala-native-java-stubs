package javax.swing.plaf.basic

import java.awt.event.{MouseAdapter, MouseEvent}
import java.lang.Object
import javax.swing.JComponent
import javax.swing.event.MouseInputAdapter
import scala.scalanative.annotation.stub

/** Listens for mouse movements and acts on them.
 * 
 *  This class should be treated as a "protected" inner class.
 *  Instantiate it only within subclasses of BasicDesktopIconUI.
 */
class BasicDesktopIconUI.MouseInputHandler extends MouseInputAdapter {

    /**  */
    @stub
    def MouseInputHandler() = ???

    /** Invoked when a mouse button is pressed on a component and then
     *  dragged.
     */
    @stub
    def mouseDragged(e: MouseEvent): Unit = ???

    /** Invoked when the mouse cursor has been moved onto a component
     *  but no buttons have been pushed.
     */
    @stub
    def mouseMoved(e: MouseEvent): Unit = ???

    /** Invoked when a mouse button has been pressed on a component. */
    @stub
    def mousePressed(e: MouseEvent): Unit = ???

    /** Invoked when a mouse button has been released on a component. */
    @stub
    def mouseReleased(e: MouseEvent): Unit = ???

    /**  */
    @stub
    def moveAndRepaint(f: JComponent, newX: Int, newY: Int, newWidth: Int, newHeight: Int): Unit = ???
}
