package javax.swing.plaf.basic

import java.awt.event.{MouseAdapter, MouseEvent, MouseMotionListener}
import java.lang.Object
import scala.scalanative.annotation.stub

/** Track mouse drags. */
protected class BasicScrollBarUI_TrackListener extends MouseAdapter with MouseMotionListener {

    /**  */
    @stub
    protected def TrackListener() = ???

    /**  */
    @stub
    protected val currentMouseX: Int = ???

    /**  */
    @stub
    protected val currentMouseY: Int = ???

    /**  */
    @stub
    protected val offset: Int = ???

    /** Set the models value to the position of the thumb's top of Vertical
     *  scrollbar, or the left/right of Horizontal scrollbar in
     *  left-to-right/right-to-left scrollbar relative to the origin of the
     *  track.
     */
    @stub
    def mouseDragged(e: MouseEvent): Unit = ???

    /** Invoked when the mouse exits the scrollbar. */
    @stub
    def mouseExited(e: MouseEvent): Unit = ???

    /** Invoked when the mouse cursor has been moved onto a component
     *  but no buttons have been pushed.
     */
    @stub
    def mouseMoved(e: MouseEvent): Unit = ???

    /** If the mouse is pressed above the "thumb" component
     *  then reduce the scrollbars value by one page ("page up"),
     *  otherwise increase it by one page.
     */
    @stub
    def mousePressed(e: MouseEvent): Unit = ???

    /** Invoked when a mouse button has been released on a component. */
    @stub
    def mouseReleased(e: MouseEvent): Unit = ???
}
