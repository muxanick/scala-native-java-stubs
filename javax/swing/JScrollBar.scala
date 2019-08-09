package javax.swing

import java.awt.{Adjustable, Component, Container, Dimension}
import java.awt.event.AdjustmentListener
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext}
import javax.swing.plaf.ScrollBarUI

/** An implementation of a scrollbar. The user positions the knob in the
 *  scrollbar to determine the contents of the viewing area. The
 *  program typically adjusts the display so that the end of the
 *  scrollbar represents the end of the displayable contents, or 100%
 *  of the contents. The start of the scrollbar is the beginning of the
 *  displayable contents, or 0%. The position of the knob within
 *  those bounds then translates to the corresponding percentage of
 *  the displayable contents.
 *  
 *  Typically, as the position of the knob in the scrollbar changes
 *  a corresponding change is made to the position of the JViewport on
 *  the underlying view, changing the contents of the JViewport.
 *  
 *  Warning: Swing is not thread safe. For more
 *  information see Swing's Threading
 *  Policy.
 *  
 *  Warning:
 *  Serialized objects of this class will not be compatible with
 *  future Swing releases. The current serialization support is
 *  appropriate for short term storage or RMI between applications running
 *  the same version of Swing.  As of 1.4, support for long term storage
 *  of all JavaBeans™
 *  has been added to the java.beans package.
 *  Please see XMLEncoder.
 */
class JScrollBar extends JComponent with Adjustable with Accessible {

    /** Creates a vertical scrollbar with the following initial values: */
    @stub
    def this() = ???

    /** Creates a scrollbar with the specified orientation
     *  and the following initial values:
     */
    @stub
    def this(orientation: Int) = ???

    /**  */
    @stub
    protected val blockIncrement: Int = ???

    /** The model that represents the scrollbar's minimum, maximum, extent
     *  (aka "visibleAmount") and current value.
     */
    @stub
    protected val model: BoundedRangeModel = ???

    /**  */
    @stub
    protected val orientation: Int = ???

    /** Adds an AdjustmentListener. */
    @stub
    def addAdjustmentListener(l: AdjustmentListener): Unit = ???

    /** Notify listeners that the scrollbar's model has changed. */
    @stub
    protected def fireAdjustmentValueChanged(id: Int, type: Int, value: Int): Unit = ???

    /** Gets the AccessibleContext associated with this JScrollBar. */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Returns an array of all the AdjustmentListeners added
     *  to this JScrollBar with addAdjustmentListener().
     */
    @stub
    def getAdjustmentListeners(): Array[AdjustmentListener] = ???

    /** For backwards compatibility with java.awt.Scrollbar. */
    @stub
    def getBlockIncrement(): Int = ???

    /** Returns the amount to change the scrollbar's value by,
     *  given a block (usually "page") up/down request.
     */
    @stub
    def getBlockIncrement(direction: Int): Int = ???

    /** The maximum value of the scrollbar is maximum - extent. */
    @stub
    def getMaximum(): Int = ???

    /** The scrollbar is flexible along it's scrolling axis and
     *  rigid along the other axis.
     */
    @stub
    def getMaximumSize(): Dimension = ???

    /** Returns the minimum value supported by the scrollbar
     *  (usually zero).
     */
    @stub
    def getMinimum(): Int = ???

    /** The scrollbar is flexible along it's scrolling axis and
     *  rigid along the other axis.
     */
    @stub
    def getMinimumSize(): Dimension = ???

    /** Returns data model that handles the scrollbar's four
     *  fundamental properties: minimum, maximum, value, extent.
     */
    @stub
    def getModel(): BoundedRangeModel = ???

    /** Returns the component's orientation (horizontal or vertical). */
    @stub
    def getOrientation(): Int = ???

    /** Returns the delegate that implements the look and feel for
     *  this component.
     */
    @stub
    def getUI(): ScrollBarUI = ???

    /** Returns the name of the LookAndFeel class for this component. */
    @stub
    def getUIClassID(): String = ???

    /** For backwards compatibility with java.awt.Scrollbar. */
    @stub
    def getUnitIncrement(): Int = ???

    /** Returns the amount to change the scrollbar's value by,
     *  given a unit up/down request.
     */
    @stub
    def getUnitIncrement(direction: Int): Int = ???

    /** Returns the scrollbar's value. */
    @stub
    def getValue(): Int = ???

    /** True if the scrollbar knob is being dragged. */
    @stub
    def getValueIsAdjusting(): Boolean = ???

    /** Returns the scrollbar's extent, aka its "visibleAmount". */
    @stub
    def getVisibleAmount(): Int = ???

    /** Returns a string representation of this JScrollBar. */
    @stub
    protected def paramString(): String = ???

    /** Removes an AdjustmentEvent listener. */
    @stub
    def removeAdjustmentListener(l: AdjustmentListener): Unit = ???

    /** Sets the blockIncrement property. */
    @stub
    def setBlockIncrement(blockIncrement: Int): Unit = ???

    /** Enables the component so that the knob position can be changed. */
    @stub
    def setEnabled(x: Boolean): Unit = ???

    /** Sets the model's maximum property. */
    @stub
    def setMaximum(maximum: Int): Unit = ???

    /** Sets the model's minimum property. */
    @stub
    def setMinimum(minimum: Int): Unit = ???

    /** Sets the model that handles the scrollbar's four
     *  fundamental properties: minimum, maximum, value, extent.
     */
    @stub
    def setModel(newModel: BoundedRangeModel): Unit = ???

    /** Set the scrollbar's orientation to either VERTICAL or
     *  HORIZONTAL.
     */
    @stub
    def setOrientation(orientation: Int): Unit = ???

    /** Sets the L&F object that renders this component. */
    @stub
    def setUI(ui: ScrollBarUI): Unit = ???

    /** Sets the unitIncrement property. */
    @stub
    def setUnitIncrement(unitIncrement: Int): Unit = ???

    /** Sets the scrollbar's value. */
    @stub
    def setValue(value: Int): Unit = ???

    /** Sets the model's valueIsAdjusting property. */
    @stub
    def setValueIsAdjusting(b: Boolean): Unit = ???

    /** Sets the four BoundedRangeModel properties after forcing
     *  the arguments to obey the usual constraints:
     */
    @stub
    def setValues(newValue: Int, newExtent: Int, newMin: Int, newMax: Int): Unit = ???

    /** Set the model's extent property. */
    @stub
    def setVisibleAmount(extent: Int): Unit = ???
}
