package javax.swing.plaf.basic

import java.awt.event.{MouseAdapter, MouseEvent}
import java.lang.Object
import javax.swing.event.MouseInputAdapter

// Track mouse movements.
//
// This class should be treated as a "protected" inner class.
// Instantiate it only within subclasses of Foo.
class BasicSliderUI.TrackListener extends MouseInputAdapter {

    @stub
    // 
    protected def currentMouseX: Int = ???

    @stub
    // 
    protected def currentMouseY: Int = ???

    @stub
    // Set the models value to the position of the top/left
    // of the thumb relative to the origin of the track.
    def mouseDragged(e: MouseEvent): Unit = ???

    @stub
    // Invoked when the mouse cursor has been moved onto a component
    // but no buttons have been pushed.
    def mouseMoved(e: MouseEvent): Unit = ???

    @stub
    // If the mouse is pressed above the "thumb" component
    // then reduce the scrollbars value by one page ("page up"),
    // otherwise increase it by one page.
    def mousePressed(e: MouseEvent): Unit = ???

    @stub
    // Invoked when a mouse button has been released on a component.
    def mouseReleased(e: MouseEvent): Unit = ???
}
