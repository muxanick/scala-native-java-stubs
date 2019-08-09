package javax.swing

import javax.swing.event.ChangeListener
import scala.scalanative.annotation.stub

/** Defines the data model used by components like Sliders
 *  and ProgressBars.
 *  Defines four interrelated integer properties: minimum, maximum, extent
 *  and value.  These four integers define two nested ranges like this:
 *  
 *  minimum <= value <= value+extent <= maximum
 *  
 *  The outer range is minimum,maximum and the inner
 *  range is value,value+extent.  The inner range
 *  must lie within the outer one, i.e. value must be
 *  less than or equal to maximum and value+extent
 *  must greater than or equal to minimum, and maximum
 *  must be greater than or equal to minimum.
 *  There are a few features of this model that one might find a little
 *  surprising.  These quirks exist for the convenience of the
 *  Swing BoundedRangeModel clients, such as Slider and
 *  ScrollBar.
 *  
 *  
 *    The minimum and maximum set methods "correct" the other
 *    three properties to accommodate their new value argument.  For
 *    example setting the model's minimum may change its maximum, value,
 *    and extent properties (in that order), to maintain the constraints
 *    specified above.
 * 
 *  
 *    The value and extent set methods "correct" their argument to
 *    fit within the limits defined by the other three properties.
 *    For example if value == maximum, setExtent(10)
 *    would change the extent (back) to zero.
 * 
 *  
 *    The four BoundedRangeModel values are defined as Java Beans properties
 *    however Swing ChangeEvents are used to notify clients of changes rather
 *    than PropertyChangeEvents. This was done to keep the overhead of monitoring
 *    a BoundedRangeModel low. Changes are often reported at MouseDragged rates.
 *  
 * 
 *  
 * 
 *  For an example of specifying custom bounded range models used by sliders,
 *  see Separable model architecture
 *  in A Swing Architecture Overview.
 */
trait BoundedRangeModel {

    /** Adds a ChangeListener to the model's listener list. */
    @stub
    def addChangeListener(x: ChangeListener): Unit = ???

    /** Returns the model's extent, the length of the inner range that
     *  begins at the model's value.
     */
    @stub
    def getExtent(): Int = ???

    /** Returns the model's maximum. */
    @stub
    def getMaximum(): Int = ???

    /** Returns the minimum acceptable value. */
    @stub
    def getMinimum(): Int = ???

    /** Returns the model's current value. */
    @stub
    def getValue(): Int = ???

    /** Returns true if the current changes to the value property are part
     *  of a series of changes.
     */
    @stub
    def getValueIsAdjusting(): Boolean = ???

    /** Removes a ChangeListener from the model's listener list. */
    @stub
    def removeChangeListener(x: ChangeListener): Unit = ???

    /** Sets the model's extent. */
    @stub
    def setExtent(newExtent: Int): Unit = ???

    /** Sets the model's maximum to newMaximum. */
    @stub
    def setMaximum(newMaximum: Int): Unit = ???

    /** Sets the model's minimum to newMinimum. */
    @stub
    def setMinimum(newMinimum: Int): Unit = ???

    /** This method sets all of the model's data with a single method call. */
    @stub
    def setRangeProperties(value: Int, extent: Int, min: Int, max: Int, adjusting: Boolean): Unit = ???

    /** Sets the model's current value to newValue if newValue
     *  satisfies the model's constraints.
     */
    @stub
    def setValue(newValue: Int): Unit = ???

    /** This attribute indicates that any upcoming changes to the value
     *  of the model should be considered a single event.
     */
    @stub
    def setValueIsAdjusting(b: Boolean): Unit = ???
}
