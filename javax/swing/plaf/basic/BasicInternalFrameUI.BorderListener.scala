package javax.swing.plaf.basic

import java.awt.event.{MouseAdapter, MouseEvent}
import java.lang.Object
import javax.swing.SwingConstants
import javax.swing.event.MouseInputAdapter
import scala.scalanative.annotation.stub

/** Listens for border adjustments. */
protected class BasicInternalFrameUI_BorderListener extends MouseInputAdapter with SwingConstants {

    /**  */
    @stub
    protected def BorderListener() = ???

    /**  */
    @stub
    protected val RESIZE_NONE: Int = ???

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

    /** Invoked when a mouse button has been released on a component. */
    @stub
    def mouseReleased(e: MouseEvent): Unit = ???
}
