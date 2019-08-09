package javax.swing

import javax.swing.event.ChangeListener

// Defines the data model used by components like Sliders
// and ProgressBars.
// Defines four interrelated integer properties: minimum, maximum, extent
// and value.  These four integers define two nested ranges like this:
// 
// minimum <= value <= value+extent <= maximum
// 
// The outer range is minimum,maximum and the inner
// range is value,value+extent.  The inner range
// must lie within the outer one, i.e. value must be
// less than or equal to maximum and value+extent
// must greater than or equal to minimum, and maximum
// must be greater than or equal to minimum.
// There are a few features of this model that one might find a little
// surprising.  These quirks exist for the convenience of the
// Swing BoundedRangeModel clients, such as Slider and
// ScrollBar.
// 
// 
//   The minimum and maximum set methods "correct" the other
//   three properties to accommodate their new value argument.  For
//   example setting the model's minimum may change its maximum, value,
//   and extent properties (in that order), to maintain the constraints
//   specified above.
//
// 
//   The value and extent set methods "correct" their argument to
//   fit within the limits defined by the other three properties.
//   For example if value == maximum, setExtent(10)
//   would change the extent (back) to zero.
//
// 
//   The four BoundedRangeModel values are defined as Java Beans properties
//   however Swing ChangeEvents are used to notify clients of changes rather
//   than PropertyChangeEvents. This was done to keep the overhead of monitoring
//   a BoundedRangeModel low. Changes are often reported at MouseDragged rates.
// 
//
// 
//
// For an example of specifying custom bounded range models used by sliders,
// see Separable model architecture
// in A Swing Architecture Overview.
trait BoundedRangeModel {

    @stub
    // Adds a ChangeListener to the model's listener list.
    def addChangeListener(x: ChangeListener): Unit = ???

    @stub
    // Returns the model's extent, the length of the inner range that
    // begins at the model's value.
    def getExtent(): Int = ???

    @stub
    // Returns the model's maximum.
    def getMaximum(): Int = ???

    @stub
    // Returns the minimum acceptable value.
    def getMinimum(): Int = ???

    @stub
    // Returns the model's current value.
    def getValue(): Int = ???

    @stub
    // Returns true if the current changes to the value property are part
    // of a series of changes.
    def getValueIsAdjusting(): Boolean = ???

    @stub
    // Removes a ChangeListener from the model's listener list.
    def removeChangeListener(x: ChangeListener): Unit = ???

    @stub
    // Sets the model's extent.
    def setExtent(newExtent: Int): Unit = ???

    @stub
    // Sets the model's maximum to newMaximum.
    def setMaximum(newMaximum: Int): Unit = ???

    @stub
    // Sets the model's minimum to newMinimum.
    def setMinimum(newMinimum: Int): Unit = ???

    @stub
    // This method sets all of the model's data with a single method call.
    def setRangeProperties(value: Int, extent: Int, min: Int, max: Int, adjusting: Boolean): Unit = ???

    @stub
    // Sets the model's current value to newValue if newValue
    // satisfies the model's constraints.
    def setValue(newValue: Int): Unit = ???
}
