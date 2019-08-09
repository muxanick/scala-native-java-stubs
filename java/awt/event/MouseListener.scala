package java.awt.event

import java.util.EventListener
import scala.scalanative.annotation.stub

/** The listener interface for receiving "interesting" mouse events
 *  (press, release, click, enter, and exit) on a component.
 *  (To track mouse moves and mouse drags, use the
 *  MouseMotionListener.)
 *  
 *  The class that is interested in processing a mouse event
 *  either implements this interface (and all the methods it
 *  contains) or extends the abstract MouseAdapter class
 *  (overriding only the methods of interest).
 *  
 *  The listener object created from that class is then registered with a
 *  component using the component's addMouseListener
 *  method. A mouse event is generated when the mouse is pressed, released
 *  clicked (pressed and released). A mouse event is also generated when
 *  the mouse cursor enters or leaves a component. When a mouse event
 *  occurs, the relevant method in the listener object is invoked, and
 *  the MouseEvent is passed to it.
 */
trait MouseListener extends EventListener {

    /** Invoked when the mouse button has been clicked (pressed
     *  and released) on a component.
     */
    @stub
    def mouseClicked(e: MouseEvent): Unit = ???

    /** Invoked when the mouse enters a component. */
    @stub
    def mouseEntered(e: MouseEvent): Unit = ???

    /** Invoked when the mouse exits a component. */
    @stub
    def mouseExited(e: MouseEvent): Unit = ???

    /** Invoked when a mouse button has been pressed on a component. */
    @stub
    def mousePressed(e: MouseEvent): Unit = ???

    /** Invoked when a mouse button has been released on a component. */
    @stub
    def mouseReleased(e: MouseEvent): Unit = ???
}
