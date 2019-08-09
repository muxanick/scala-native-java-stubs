package java.awt

import java.awt.event.AdjustmentListener
import java.io.Serializable
import java.lang.{Object, String}

// This class represents the state of a horizontal or vertical
// scrollbar of a ScrollPane.  Objects of this class are
// returned by ScrollPane methods.
class ScrollPaneAdjustable extends Object with Adjustable, with Serializable {

    @stub
    // Adds the specified adjustment listener to receive adjustment
    // events from this ScrollPaneAdjustable.
    def addAdjustmentListener(l: AdjustmentListener): Unit = ???

    @stub
    // Returns an array of all the adjustment listeners
    // registered on this ScrollPaneAdjustable.
    def getAdjustmentListeners(): Array[AdjustmentListener] = ???

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
    // Returns the orientation of this scrollbar.
    def getOrientation(): Int = ???

    @stub
    // Gets the unit value increment for the adjustable object.
    def getUnitIncrement(): Int = ???

    @stub
    // Gets the current value of the adjustable object.
    def getValue(): Int = ???

    @stub
    // Returns true if the value is in the process of changing as a
    // result of actions being taken by the user.
    def getValueIsAdjusting(): Boolean = ???

    @stub
    // Gets the length of the proportional indicator.
    def getVisibleAmount(): Int = ???

    @stub
    // Returns a string representing the state of this scrollbar.
    def paramString(): String = ???

    @stub
    // Removes the specified adjustment listener so that it no longer
    // receives adjustment events from this ScrollPaneAdjustable.
    def removeAdjustmentListener(l: AdjustmentListener): Unit = ???

    @stub
    // Sets the block value increment for the adjustable object.
    def setBlockIncrement(b: Int): Unit = ???

    @stub
    // This method should NOT be called by user code.
    def setMaximum(max: Int): Unit = ???

    @stub
    // This method should NOT be called by user code.
    def setMinimum(min: Int): Unit = ???

    @stub
    // Sets the unit value increment for the adjustable object.
    def setUnitIncrement(u: Int): Unit = ???

    @stub
    // Sets the value of this scrollbar to the specified value.
    def setValue(v: Int): Unit = ???

    @stub
    // Sets the valueIsAdjusting property.
    def setValueIsAdjusting(b: Boolean): Unit = ???

    @stub
    // This method should NOT be called by user code.
    def setVisibleAmount(v: Int): Unit = ???
}
