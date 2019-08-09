package java.awt.event

import java.awt.{AWTEvent, Rectangle}
import java.lang.{Object, String}
import java.util.EventObject

// The component-level paint event.
// This event is a special type which is used to ensure that
// paint/update method calls are serialized along with the other
// events delivered from the event queue.  This event is not
// designed to be used with the Event Listener model; programs
// should continue to override paint/update methods in order
// render themselves properly.
// 
// An unspecified behavior will be caused if the id parameter
// of any particular PaintEvent instance is not
// in the range from PAINT_FIRST to PAINT_LAST.
class PaintEvent extends ComponentEvent {

    @stub
    // Returns the rectangle representing the area which needs to be
    // repainted in response to this event.
    def getUpdateRect(): Rectangle = ???

    @stub
    // Returns a parameter string identifying this event.
    def paramString(): String = ???
}

object PaintEvent {
    @stub
    // The paint event type.
    def PAINT: Int = ???

    @stub
    // Marks the first integer id for the range of paint event ids.
    def PAINT_FIRST: Int = ???

    @stub
    // Marks the last integer id for the range of paint event ids.
    def PAINT_LAST: Int = ???
}