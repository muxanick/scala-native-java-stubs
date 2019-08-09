package java.awt

import java.awt.event.AdjustmentListener

// The interface for objects which have an adjustable numeric value
// contained within a bounded range of values.
trait Adjustable {

    @stub
    // Adds a listener to receive adjustment events when the value of
    // the adjustable object changes.
    def addAdjustmentListener(l: AdjustmentListener): Unit = ???

    @stub
    // Gets the block value increment for the adjustable object.
    def getBlockIncrement(): Int = ???

    @stub
    // Gets the maximum value of the adjustable object.
    def getMaximum(): Int = ???

    @stub
    // Gets the minimum value of the adjustable object.
    def getMinimum(): Int = ???

    @stub
    // Gets the orientation of the adjustable object.
    def getOrientation(): Int = ???

    @stub
    // Gets the unit value increment for the adjustable object.
    def getUnitIncrement(): Int = ???

    @stub
    // Gets the current value of the adjustable object.
    def getValue(): Int = ???

    @stub
    // Gets the length of the proportional indicator.
    def getVisibleAmount(): Int = ???

    @stub
    // Removes an adjustment listener.
    def removeAdjustmentListener(l: AdjustmentListener): Unit = ???

    @stub
    // Sets the block value increment for the adjustable object.
    def setBlockIncrement(b: Int): Unit = ???

    @stub
    // Sets the maximum value of the adjustable object.
    def setMaximum(max: Int): Unit = ???

    @stub
    // Sets the minimum value of the adjustable object.
    def setMinimum(min: Int): Unit = ???

    @stub
    // Sets the unit value increment for the adjustable object.
    def setUnitIncrement(u: Int): Unit = ???

    @stub
    // Sets the current value of the adjustable object.
    def setValue(v: Int): Unit = ???
}

object Adjustable {
    @stub
    // Indicates that the Adjustable has horizontal orientation.
    def HORIZONTAL: Int = ???

    @stub
    // Indicates that the Adjustable has no orientation.
    def NO_ORIENTATION: Int = ???
}
