package java.awt.event

import java.util.EventListener

/** The listener interface for receiving mouse wheel events on a component.
 *  (For clicks and other mouse events, use the MouseListener.
 *  For mouse movement and drags, use the MouseMotionListener.)
 *  
 *  The class that is interested in processing a mouse wheel event
 *  implements this interface (and all the methods it contains).
 *  
 *  The listener object created from that class is then registered with a
 *  component using the component's addMouseWheelListener
 *  method. A mouse wheel event is generated when the mouse wheel is rotated.
 *  When a mouse wheel event occurs, that object's mouseWheelMoved
 *  method is invoked.
 *  
 *  For information on how mouse wheel events are dispatched, see
 *  the class description for MouseWheelEvent.
 */
trait MouseWheelListener extends EventListener {
}
