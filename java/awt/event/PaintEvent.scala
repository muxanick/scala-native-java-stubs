package java.awt.event

import java.awt.{AWTEvent, Component, Rectangle}
import java.lang.{Object, String}
import java.util.EventObject
import scala.scalanative.annotation.stub

/** The component-level paint event.
 *  This event is a special type which is used to ensure that
 *  paint/update method calls are serialized along with the other
 *  events delivered from the event queue.  This event is not
 *  designed to be used with the Event Listener model; programs
 *  should continue to override paint/update methods in order
 *  render themselves properly.
 *  
 *  An unspecified behavior will be caused if the id parameter
 *  of any particular PaintEvent instance is not
 *  in the range from PAINT_FIRST to PAINT_LAST.
 */
class PaintEvent extends ComponentEvent {

    /** Constructs a PaintEvent object with the specified
     *  source component and type.
     */
    @stub
    def this(source: Component, id: Int, updateRect: Rectangle) = ???

    /** Returns the rectangle representing the area which needs to be
     *  repainted in response to this event.
     */
    @stub
    def getUpdateRect(): Rectangle = ???

    /** Returns a parameter string identifying this event. */
    @stub
    def paramString(): String = ???

    /** Sets the rectangle representing the area which needs to be
     *  repainted in response to this event.
     */
    @stub
    def setUpdateRect(updateRect: Rectangle): Unit = ???
}

object PaintEvent {
    /** The paint event type. */
    @stub
    val PAINT: Int = ???

    /** Marks the first integer id for the range of paint event ids. */
    @stub
    val PAINT_FIRST: Int = ???

    /** Marks the last integer id for the range of paint event ids. */
    @stub
    val PAINT_LAST: Int = ???

    /** The update event type. */
    @stub
    val UPDATE: Int = ???
}
