package java.awt.event

import java.util.EventListener
import scala.scalanative.annotation.stub

/** The listener interface for receiving mouse motion events on a component.
 *  (For clicks and other mouse events, use the MouseListener.)
 *  
 *  The class that is interested in processing a mouse motion event
 *  either implements this interface (and all the methods it
 *  contains) or extends the abstract MouseMotionAdapter class
 *  (overriding only the methods of interest).
 *  
 *  The listener object created from that class is then registered with a
 *  component using the component's addMouseMotionListener
 *  method. A mouse motion event is generated when the mouse is moved
 *  or dragged. (Many such events will be generated). When a mouse motion event
 *  occurs, the relevant method in the listener object is invoked, and
 *  the MouseEvent is passed to it.
 */
trait MouseMotionListener extends EventListener {

    /** Invoked when a mouse button is pressed on a component and then
     *  dragged.
     */
    @stub
    def mouseDragged(e: MouseEvent): Unit = ???

    /** Invoked when the mouse cursor has been moved onto a component
     *  but no buttons have been pushed.
     */
    @stub
    def mouseMoved(e: MouseEvent): Unit = ???
}
