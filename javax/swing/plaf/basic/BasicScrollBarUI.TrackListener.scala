package javax.swing.plaf.basic

import java.awt.event.{MouseAdapter, MouseEvent, MouseMotionListener}
import java.lang.Object

// Track mouse drags.
protected class BasicScrollBarUI.TrackListener extends MouseAdapter with MouseMotionListener {

    @stub
    // 
    protected def currentMouseX: Int = ???

    @stub
    // 
    protected def currentMouseY: Int = ???

    @stub
    // Set the models value to the position of the thumb's top of Vertical
    // scrollbar, or the left/right of Horizontal scrollbar in
    // left-to-right/right-to-left scrollbar relative to the origin of the
    // track.
    def mouseDragged(e: MouseEvent): Unit = ???

    @stub
    // Invoked when the mouse exits the scrollbar.
    def mouseExited(e: MouseEvent): Unit = ???

    @stub
    // Invoked when the mouse cursor has been moved onto a component
    // but no buttons have been pushed.
    def mouseMoved(e: MouseEvent): Unit = ???

    @stub
    // If the mouse is pressed above the "thumb" component
    // then reduce the scrollbars value by one page ("page up"),
    // otherwise increase it by one page.
    def mousePressed(e: MouseEvent): Unit = ???
}
