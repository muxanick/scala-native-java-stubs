package java.awt.event

import java.util.EventListener

// The listener interface for receiving "interesting" mouse events
// (press, release, click, enter, and exit) on a component.
// (To track mouse moves and mouse drags, use the
// MouseMotionListener.)
// 
// The class that is interested in processing a mouse event
// either implements this interface (and all the methods it
// contains) or extends the abstract MouseAdapter class
// (overriding only the methods of interest).
// 
// The listener object created from that class is then registered with a
// component using the component's addMouseListener
// method. A mouse event is generated when the mouse is pressed, released
// clicked (pressed and released). A mouse event is also generated when
// the mouse cursor enters or leaves a component. When a mouse event
// occurs, the relevant method in the listener object is invoked, and
// the MouseEvent is passed to it.
trait MouseListener extends EventListener {

    @stub
    // Invoked when the mouse button has been clicked (pressed
    // and released) on a component.
    def mouseClicked(e: MouseEvent): Unit = ???

    @stub
    // Invoked when the mouse enters a component.
    def mouseEntered(e: MouseEvent): Unit = ???

    @stub
    // Invoked when the mouse exits a component.
    def mouseExited(e: MouseEvent): Unit = ???

    @stub
    // Invoked when a mouse button has been pressed on a component.
    def mousePressed(e: MouseEvent): Unit = ???
}
