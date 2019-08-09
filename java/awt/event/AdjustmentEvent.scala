package java.awt.event

import java.awt.{AWTEvent, Adjustable}
import java.lang.{Object, String}
import java.util.EventObject
import scala.scalanative.annotation.stub

/** The adjustment event emitted by Adjustable objects like
 *  Scrollbar and ScrollPane.
 *  When the user changes the value of the scrolling component,
 *  it receives an instance of AdjustmentEvent.
 *  
 *  An unspecified behavior will be caused if the id parameter
 *  of any particular AdjustmentEvent instance is not
 *  in the range from ADJUSTMENT_FIRST to ADJUSTMENT_LAST.
 *  
 *  The type of any AdjustmentEvent instance takes one of the following
 *  values:
 *                      
 *                       UNIT_INCREMENT
 *                       UNIT_DECREMENT
 *                       BLOCK_INCREMENT
 *                       BLOCK_DECREMENT
 *                       TRACK
 *                      
 *  Assigning the value different from listed above will cause an unspecified behavior.
 */
class AdjustmentEvent extends AWTEvent {

    /** Constructs an AdjustmentEvent object with the
     *  specified Adjustable source, event type,
     *  adjustment type, and value.
     */
    @stub
    def this(source: Adjustable, id: Int, type: Int, value: Int) = ???

    /** Constructs an AdjustmentEvent object with the
     *  specified Adjustable source, event type, adjustment type, and value.
     */
    @stub
    def this(source: Adjustable, id: Int, type: Int, value: Int, isAdjusting: Boolean) = ???

    /** Returns the Adjustable object where this event originated. */
    @stub
    def getAdjustable(): Adjustable = ???

    /** Returns the type of adjustment which caused the value changed
     *  event.
     */
    @stub
    def getAdjustmentType(): Int = ???

    /** Returns the current value in the adjustment event. */
    @stub
    def getValue(): Int = ???

    /** Returns true if this is one of multiple
     *  adjustment events.
     */
    @stub
    def getValueIsAdjusting(): Boolean = ???

    /** Returns a string representing the state of this Event. */
    @stub
    def paramString(): String = ???
}

object AdjustmentEvent {
    /** Marks the first integer id for the range of adjustment event ids. */
    @stub
    val ADJUSTMENT_FIRST: Int = ???

    /** Marks the last integer id for the range of adjustment event ids. */
    @stub
    val ADJUSTMENT_LAST: Int = ???

    /** The adjustment value changed event. */
    @stub
    val ADJUSTMENT_VALUE_CHANGED: Int = ???

    /** The block decrement adjustment type. */
    @stub
    val BLOCK_DECREMENT: Int = ???

    /** The block increment adjustment type. */
    @stub
    val BLOCK_INCREMENT: Int = ???

    /** The absolute tracking adjustment type. */
    @stub
    val TRACK: Int = ???

    /** The unit decrement adjustment type. */
    @stub
    val UNIT_DECREMENT: Int = ???

    /** The unit increment adjustment type. */
    @stub
    val UNIT_INCREMENT: Int = ???
}
