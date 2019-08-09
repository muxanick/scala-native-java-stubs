package javax.swing.plaf.basic

import java.awt.Component
import java.awt.event.MouseEvent
import java.lang.Object
import javax.swing.event.MouseInputListener
import scala.scalanative.annotation.stub

/** MouseInputHandler handles passing all mouse events,
 *  including mouse motion events, until the mouse is released to
 *  the destination it is constructed with. It is assumed all the
 *  events are currently target at source.
 */
class BasicTreeUI.MouseInputHandler extends Object with MouseInputListener {

    /**  */
    @stub
    def MouseInputHandler(source: Component, destination: Component, event: MouseEvent) = ???

    /** Destination that receives all events. */
    @stub
    protected val destination: Component = ???

    /** Source that events are coming from. */
    @stub
    protected val source: Component = ???

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

    /**  */
    @stub
    protected def removeFromSource(): Unit = ???
}
