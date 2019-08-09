package java.awt

import java.awt.event.AdjustmentListener
import java.io.Serializable
import java.lang.{Object, String}

/** This class represents the state of a horizontal or vertical
 *  scrollbar of a ScrollPane.  Objects of this class are
 *  returned by ScrollPane methods.
 */
class ScrollPaneAdjustable extends Object with Adjustable with Serializable {

    /** Adds the specified adjustment listener to receive adjustment
     *  events from this ScrollPaneAdjustable.
     */
    @stub
    def addAdjustmentListener(l: AdjustmentListener): Unit = ???

    /** Returns an array of all the adjustment listeners
     *  registered on this ScrollPaneAdjustable.
     */
    @stub
    def getAdjustmentListeners(): Array[AdjustmentListener] = ???

    /** Gets the block value increment for the adjustable object. */
    @stub
    def getBlockIncrement(): Int = ???

    /** Gets the maximum value of the adjustable object. */
    @stub
    def getMaximum(): Int = ???

    /** Gets the minimum value of the adjustable object. */
    @stub
    def getMinimum(): Int = ???

    /** Returns the orientation of this scrollbar. */
    @stub
    def getOrientation(): Int = ???

    /** Gets the unit value increment for the adjustable object. */
    @stub
    def getUnitIncrement(): Int = ???

    /** Gets the current value of the adjustable object. */
    @stub
    def getValue(): Int = ???

    /** Returns true if the value is in the process of changing as a
     *  result of actions being taken by the user.
     */
    @stub
    def getValueIsAdjusting(): Boolean = ???

    /** Gets the length of the proportional indicator. */
    @stub
    def getVisibleAmount(): Int = ???

    /** Returns a string representing the state of this scrollbar. */
    @stub
    def paramString(): String = ???

    /** Removes the specified adjustment listener so that it no longer
     *  receives adjustment events from this ScrollPaneAdjustable.
     */
    @stub
    def removeAdjustmentListener(l: AdjustmentListener): Unit = ???

    /** Sets the block value increment for the adjustable object. */
    @stub
    def setBlockIncrement(b: Int): Unit = ???

    /** This method should NOT be called by user code. */
    @stub
    def setMaximum(max: Int): Unit = ???

    /** This method should NOT be called by user code. */
    @stub
    def setMinimum(min: Int): Unit = ???

    /** Sets the unit value increment for the adjustable object. */
    @stub
    def setUnitIncrement(u: Int): Unit = ???

    /** Sets the value of this scrollbar to the specified value. */
    @stub
    def setValue(v: Int): Unit = ???

    /** Sets the valueIsAdjusting property. */
    @stub
    def setValueIsAdjusting(b: Boolean): Unit = ???

    /** This method should NOT be called by user code. */
    @stub
    def setVisibleAmount(v: Int): Unit = ???
}
