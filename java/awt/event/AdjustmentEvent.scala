package java.awt.event

import java.awt.{AWTEvent, Adjustable}
import java.lang.Object
import java.util.EventObject

// The adjustment event emitted by Adjustable objects like
// Scrollbar and ScrollPane.
// When the user changes the value of the scrolling component,
// it receives an instance of AdjustmentEvent.
// 
// An unspecified behavior will be caused if the id parameter
// of any particular AdjustmentEvent instance is not
// in the range from ADJUSTMENT_FIRST to ADJUSTMENT_LAST.
// 
// The type of any AdjustmentEvent instance takes one of the following
// values:
//                     
//                      UNIT_INCREMENT
//                      UNIT_DECREMENT
//                      BLOCK_INCREMENT
//                      BLOCK_DECREMENT
//                      TRACK
//                     
// Assigning the value different from listed above will cause an unspecified behavior.
class AdjustmentEvent extends AWTEvent {

    @stub
    // Constructs an AdjustmentEvent object with the
    // specified Adjustable source, event type,
    // adjustment type, and value.
    def this(source: Adjustable, id: Int, type: Int, value: Int) = ???

    @stub
    // Returns the Adjustable object where this event originated.
    def getAdjustable(): Adjustable = ???

    @stub
    // Returns the type of adjustment which caused the value changed
    // event.
    def getAdjustmentType(): Int = ???

    @stub
    // Returns the current value in the adjustment event.
    def getValue(): Int = ???

    @stub
    // Returns true if this is one of multiple
    // adjustment events.
    def getValueIsAdjusting(): Boolean = ???
}

object AdjustmentEvent {
    @stub
    // Marks the first integer id for the range of adjustment event ids.
    def ADJUSTMENT_FIRST: Int = ???

    @stub
    // Marks the last integer id for the range of adjustment event ids.
    def ADJUSTMENT_LAST: Int = ???

    @stub
    // The adjustment value changed event.
    def ADJUSTMENT_VALUE_CHANGED: Int = ???

    @stub
    // The block decrement adjustment type.
    def BLOCK_DECREMENT: Int = ???

    @stub
    // The block increment adjustment type.
    def BLOCK_INCREMENT: Int = ???

    @stub
    // The absolute tracking adjustment type.
    def TRACK: Int = ???

    @stub
    // The unit decrement adjustment type.
    def UNIT_DECREMENT: Int = ???
}
