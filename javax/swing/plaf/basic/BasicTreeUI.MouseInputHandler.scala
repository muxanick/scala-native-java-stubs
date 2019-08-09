package javax.swing.plaf.basic

import java.awt.Component
import java.awt.event.MouseEvent
import java.lang.Object
import javax.swing.event.MouseInputListener

// MouseInputHandler handles passing all mouse events,
// including mouse motion events, until the mouse is released to
// the destination it is constructed with. It is assumed all the
// events are currently target at source.
class BasicTreeUI.MouseInputHandler extends Object with MouseInputListener {

    @stub
    // Destination that receives all events.
    protected def destination: Component = ???

    @stub
    // Invoked when the mouse button has been clicked (pressed
    // and released) on a component.
    def mouseClicked(e: MouseEvent): Unit = ???

    @stub
    // Invoked when a mouse button is pressed on a component and then
    // dragged.
    def mouseDragged(e: MouseEvent): Unit = ???

    @stub
    // Invoked when the mouse enters a component.
    def mouseEntered(e: MouseEvent): Unit = ???

    @stub
    // Invoked when the mouse exits a component.
    def mouseExited(e: MouseEvent): Unit = ???

    @stub
    // Invoked when the mouse cursor has been moved onto a component
    // but no buttons have been pushed.
    def mouseMoved(e: MouseEvent): Unit = ???

    @stub
    // Invoked when a mouse button has been pressed on a component.
    def mousePressed(e: MouseEvent): Unit = ???

    @stub
    // Invoked when a mouse button has been released on a component.
    def mouseReleased(e: MouseEvent): Unit = ???
}
