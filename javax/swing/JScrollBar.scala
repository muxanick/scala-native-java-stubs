package javax.swing

import java.awt.{Adjustable, Component, Container, Dimension}
import java.awt.event.AdjustmentListener
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext}
import javax.swing.plaf.ScrollBarUI

// An implementation of a scrollbar. The user positions the knob in the
// scrollbar to determine the contents of the viewing area. The
// program typically adjusts the display so that the end of the
// scrollbar represents the end of the displayable contents, or 100%
// of the contents. The start of the scrollbar is the beginning of the
// displayable contents, or 0%. The position of the knob within
// those bounds then translates to the corresponding percentage of
// the displayable contents.
// 
// Typically, as the position of the knob in the scrollbar changes
// a corresponding change is made to the position of the JViewport on
// the underlying view, changing the contents of the JViewport.
// 
// Warning: Swing is not thread safe. For more
// information see Swing's Threading
// Policy.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class JScrollBar extends JComponent with Adjustable, with Accessible {

    @stub
    // Creates a vertical scrollbar with the following initial values:
    def this() = ???

    @stub
    // Creates a scrollbar with the specified orientation
    // and the following initial values:
    def this(orientation: Int) = ???

    @stub
    // 
    protected def blockIncrement: Int = ???

    @stub
    // The model that represents the scrollbar's minimum, maximum, extent
    // (aka "visibleAmount") and current value.
    protected def model: BoundedRangeModel = ???

    @stub
    // 
    protected def orientation: Int = ???

    @stub
    // Adds an AdjustmentListener.
    def addAdjustmentListener(l: AdjustmentListener): Unit = ???

    @stub
    // Notify listeners that the scrollbar's model has changed.
    protected def fireAdjustmentValueChanged(id: Int, type: Int, value: Int): Unit = ???

    @stub
    // Gets the AccessibleContext associated with this JScrollBar.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Returns an array of all the AdjustmentListeners added
    // to this JScrollBar with addAdjustmentListener().
    def getAdjustmentListeners(): Array[AdjustmentListener] = ???

    @stub
    // For backwards compatibility with java.awt.Scrollbar.
    def getBlockIncrement(): Int = ???

    @stub
    // Returns the amount to change the scrollbar's value by,
    // given a block (usually "page") up/down request.
    def getBlockIncrement(direction: Int): Int = ???

    @stub
    // The maximum value of the scrollbar is maximum - extent.
    def getMaximum(): Int = ???

    @stub
    // The scrollbar is flexible along it's scrolling axis and
    // rigid along the other axis.
    def getMaximumSize(): Dimension = ???

    @stub
    // Returns the minimum value supported by the scrollbar
    // (usually zero).
    def getMinimum(): Int = ???

    @stub
    // The scrollbar is flexible along it's scrolling axis and
    // rigid along the other axis.
    def getMinimumSize(): Dimension = ???

    @stub
    // Returns data model that handles the scrollbar's four
    // fundamental properties: minimum, maximum, value, extent.
    def getModel(): BoundedRangeModel = ???

    @stub
    // Returns the component's orientation (horizontal or vertical).
    def getOrientation(): Int = ???

    @stub
    // Returns the delegate that implements the look and feel for
    // this component.
    def getUI(): ScrollBarUI = ???

    @stub
    // Returns the name of the LookAndFeel class for this component.
    def getUIClassID(): String = ???

    @stub
    // For backwards compatibility with java.awt.Scrollbar.
    def getUnitIncrement(): Int = ???

    @stub
    // Returns the amount to change the scrollbar's value by,
    // given a unit up/down request.
    def getUnitIncrement(direction: Int): Int = ???

    @stub
    // Returns the scrollbar's value.
    def getValue(): Int = ???

    @stub
    // True if the scrollbar knob is being dragged.
    def getValueIsAdjusting(): Boolean = ???

    @stub
    // Returns the scrollbar's extent, aka its "visibleAmount".
    def getVisibleAmount(): Int = ???

    @stub
    // Returns a string representation of this JScrollBar.
    protected def paramString(): String = ???

    @stub
    // Removes an AdjustmentEvent listener.
    def removeAdjustmentListener(l: AdjustmentListener): Unit = ???

    @stub
    // Sets the blockIncrement property.
    def setBlockIncrement(blockIncrement: Int): Unit = ???

    @stub
    // Enables the component so that the knob position can be changed.
    def setEnabled(x: Boolean): Unit = ???

    @stub
    // Sets the model's maximum property.
    def setMaximum(maximum: Int): Unit = ???

    @stub
    // Sets the model's minimum property.
    def setMinimum(minimum: Int): Unit = ???

    @stub
    // Sets the model that handles the scrollbar's four
    // fundamental properties: minimum, maximum, value, extent.
    def setModel(newModel: BoundedRangeModel): Unit = ???

    @stub
    // Set the scrollbar's orientation to either VERTICAL or
    // HORIZONTAL.
    def setOrientation(orientation: Int): Unit = ???

    @stub
    // Sets the L&F object that renders this component.
    def setUI(ui: ScrollBarUI): Unit = ???

    @stub
    // Sets the unitIncrement property.
    def setUnitIncrement(unitIncrement: Int): Unit = ???

    @stub
    // Sets the scrollbar's value.
    def setValue(value: Int): Unit = ???

    @stub
    // Sets the model's valueIsAdjusting property.
    def setValueIsAdjusting(b: Boolean): Unit = ???

    @stub
    // Sets the four BoundedRangeModel properties after forcing
    // the arguments to obey the usual constraints:
    def setValues(newValue: Int, newExtent: Int, newMin: Int, newMax: Int): Unit = ???

    @stub
    // Set the model's extent property.
    def setVisibleAmount(extent: Int): Unit = ???
}
