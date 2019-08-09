package java.awt.event

import java.lang.Object

// An abstract adapter class for receiving mouse events.
// The methods in this class are empty. This class exists as
// convenience for creating listener objects.
// 
// Mouse events let you track when a mouse is pressed, released, clicked,
// moved, dragged, when it enters a component, when it exits and
// when a mouse wheel is moved.
// 
// Extend this class to create a MouseEvent
// (including drag and motion events) or/and MouseWheelEvent
// listener and override the methods for the events of interest. (If you implement the
// MouseListener,
// MouseMotionListener
// interface, you have to define all of
// the methods in it. This abstract class defines null methods for them
// all, so you can only have to define methods for events you care about.)
// 
// Create a listener object using the extended class and then register it with
// a component using the component's addMouseListener
// addMouseMotionListener, addMouseWheelListener
// methods.
// The relevant method in the listener object is invoked  and the MouseEvent
// or MouseWheelEvent  is passed to it in following cases:
// 
// when a mouse button is pressed, released, or clicked (pressed and  released)
// when the mouse cursor enters or exits the component
// when the mouse wheel rotated, or mouse moved or dragged
// 
abstract class MouseAdapter extends Object with MouseListener, with MouseWheelListener, with MouseMotionListener {

    // Invoked when the mouse button has been clicked (pressed
    // and released) on a component.
    def mouseClicked(e: MouseEvent): Unit

    // Invoked when a mouse button is pressed on a component and then
    // dragged.
    def mouseDragged(e: MouseEvent): Unit

    // Invoked when the mouse enters a component.
    def mouseEntered(e: MouseEvent): Unit

    // Invoked when the mouse exits a component.
    def mouseExited(e: MouseEvent): Unit

    // Invoked when the mouse cursor has been moved onto a component
    // but no buttons have been pushed.
    def mouseMoved(e: MouseEvent): Unit

    // Invoked when a mouse button has been pressed on a component.
    def mousePressed(e: MouseEvent): Unit

    // Invoked when a mouse button has been released on a component.
    def mouseReleased(e: MouseEvent): Unit
}
