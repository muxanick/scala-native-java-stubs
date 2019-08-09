package java.awt

import java.awt.event.AdjustmentListener
import scala.scalanative.annotation.stub

/** The interface for objects which have an adjustable numeric value
 *  contained within a bounded range of values.
 */
trait Adjustable {

    /** Adds a listener to receive adjustment events when the value of
     *  the adjustable object changes.
     */
    @stub
    def addAdjustmentListener(l: AdjustmentListener): Unit = ???

    /** Gets the block value increment for the adjustable object. */
    @stub
    def getBlockIncrement(): Int = ???

    /** Gets the maximum value of the adjustable object. */
    @stub
    def getMaximum(): Int = ???

    /** Gets the minimum value of the adjustable object. */
    @stub
    def getMinimum(): Int = ???

    /** Gets the orientation of the adjustable object. */
    @stub
    def getOrientation(): Int = ???

    /** Gets the unit value increment for the adjustable object. */
    @stub
    def getUnitIncrement(): Int = ???

    /** Gets the current value of the adjustable object. */
    @stub
    def getValue(): Int = ???

    /** Gets the length of the proportional indicator. */
    @stub
    def getVisibleAmount(): Int = ???

    /** Removes an adjustment listener. */
    @stub
    def removeAdjustmentListener(l: AdjustmentListener): Unit = ???

    /** Sets the block value increment for the adjustable object. */
    @stub
    def setBlockIncrement(b: Int): Unit = ???

    /** Sets the maximum value of the adjustable object. */
    @stub
    def setMaximum(max: Int): Unit = ???

    /** Sets the minimum value of the adjustable object. */
    @stub
    def setMinimum(min: Int): Unit = ???

    /** Sets the unit value increment for the adjustable object. */
    @stub
    def setUnitIncrement(u: Int): Unit = ???

    /** Sets the current value of the adjustable object. */
    @stub
    def setValue(v: Int): Unit = ???

    /** Sets the length of the proportional indicator of the
     *  adjustable object.
     */
    @stub
    def setVisibleAmount(v: Int): Unit = ???
}

object Adjustable {
    /** Indicates that the Adjustable has horizontal orientation. */
    @stub
    val HORIZONTAL: Int = ???

    /** Indicates that the Adjustable has no orientation. */
    @stub
    val NO_ORIENTATION: Int = ???

    /** Indicates that the Adjustable has vertical orientation. */
    @stub
    val VERTICAL: Int = ???
}
