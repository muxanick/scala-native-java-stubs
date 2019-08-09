package javax.swing.plaf.basic

import java.awt.event.MouseEvent
import java.lang.Object
import javax.swing.event.MouseInputListener

// 
protected class BasicInternalFrameUI.GlassPaneDispatcher extends Object with MouseInputListener {

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
}
