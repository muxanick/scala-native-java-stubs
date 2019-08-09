package javax.swing.plaf.basic

import java.awt.event.{MouseAdapter, MouseEvent}
import java.lang.Object
import javax.swing.event.MouseInputAdapter

/** Track mouse movements.
 * 
 *  This class should be treated as a "protected" inner class.
 *  Instantiate it only within subclasses of Foo.
 */
class BasicSliderUI.TrackListener extends MouseInputAdapter {

    /**  */
    @stub
    protected val currentMouseX: Int = ???

    /**  */
    @stub
    protected val currentMouseY: Int = ???

    /** Set the models value to the position of the top/left
     *  of the thumb relative to the origin of the track.
     */
    @stub
    def mouseDragged(e: MouseEvent): Unit = ???

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
