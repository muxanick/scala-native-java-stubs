package javax.swing.text

import java.awt.{Graphics, Rectangle, Shape}
import java.lang.Object
import javax.swing.SizeRequirements
import javax.swing.event.{DocumentEvent, DocumentEvent.ElementChange}
import scala.scalanative.annotation.stub

/** A view that arranges its children into a box shape by tiling
 *  its children along an axis.  The box is somewhat like that
 *  found in TeX where there is alignment of the
 *  children, flexibility of the children is considered, etc.
 *  This is a building block that might be useful to represent
 *  things like a collection of lines, paragraphs,
 *  lists, columns, pages, etc.  The axis along which the children are tiled is
 *  considered the major axis.  The orthogonal axis is the minor axis.
 *  
 *  Layout for each axis is handled separately by the methods
 *  layoutMajorAxis and layoutMinorAxis.
 *  Subclasses can change the layout algorithm by
 *  reimplementing these methods.    These methods will be called
 *  as necessary depending upon whether or not there is cached
 *  layout information and the cache is considered
 *  valid.  These methods are typically called if the given size
 *  along the axis changes, or if layoutChanged is
 *  called to force an updated layout.  The layoutChanged
 *  method invalidates cached layout information, if there is any.
 *  The requirements published to the parent view are calculated by
 *  the methods calculateMajorAxisRequirements
 *  and  calculateMinorAxisRequirements.
 *  If the layout algorithm is changed, these methods will
 *  likely need to be reimplemented.
 */
class BoxView extends CompositeView {

    /** Constructs a BoxView. */
    @stub
    def this(elem: Element, axis: Int) = ???

    /** Computes the location and extent of each child view
     *  in this BoxView given the targetSpan,
     *  which is the width (or height) of the region we have to
     *  work with.
     */
    @stub
    protected def baselineLayout(targetSpan: Int, axis: Int, offsets: Array[Int], spans: Array[Int]): Unit = ???

    /** Calculates the size requirements for this BoxView
     *  by examining the size of each child view.
     */
    @stub
    protected def baselineRequirements(axis: Int, r: SizeRequirements): SizeRequirements = ???

    /** Calculates the size requirements for the major axis
     *  axis.
     */
    @stub
    protected def calculateMajorAxisRequirements(axis: Int, r: SizeRequirements): SizeRequirements = ???

    /** Calculates the size requirements for the minor axis
     *  axis.
     */
    @stub
    protected def calculateMinorAxisRequirements(axis: Int, r: SizeRequirements): SizeRequirements = ???

    /** Allocates a region for a child view. */
    @stub
    protected def childAllocation(index: Int, alloc: Rectangle): Unit = ???

    /** Determines in which direction the next view lays. */
    @stub
    protected def flipEastAndWestAtEnds(position: Int, bias: Position.Bias): Boolean = ???

    /** Forwards the given DocumentEvent to the child views
     *  that need to be notified of the change to the model.
     */
    @stub
    protected def forwardUpdate(ec: DocumentEvent.ElementChange, e: DocumentEvent, a: Shape, f: ViewFactory): Unit = ???

    /** Determines the desired alignment for this view along an
     *  axis.
     */
    @stub
    def getAlignment(axis: Int): Float = ???

    /** Fetches the tile axis property. */
    @stub
    def getAxis(): Int = ???

    /** Fetches the allocation for the given child view. */
    @stub
    def getChildAllocation(index: Int, a: Shape): Shape = ???

    /** Returns the current height of the box. */
    @stub
    def getHeight(): Int = ???

    /** Determines the maximum span for this view along an
     *  axis.
     */
    @stub
    def getMaximumSpan(axis: Int): Float = ???

    /** Determines the minimum span for this view along an
     *  axis.
     */
    @stub
    def getMinimumSpan(axis: Int): Float = ???

    /** Fetches the offset of a particular child's current layout. */
    @stub
    protected def getOffset(axis: Int, childIndex: Int): Int = ???

    /** Determines the preferred span for this view along an
     *  axis.
     */
    @stub
    def getPreferredSpan(axis: Int): Float = ???

    /** Gets the resize weight. */
    @stub
    def getResizeWeight(axis: Int): Int = ???

    /** Fetches the span of a particular child's current layout. */
    @stub
    protected def getSpan(axis: Int, childIndex: Int): Int = ???

    /** Fetches the child view at the given coordinates. */
    @stub
    protected def getViewAtPoint(x: Int, y: Int, alloc: Rectangle): View = ???

    /** Returns the current width of the box. */
    @stub
    def getWidth(): Int = ???

    /** Determines if a point falls after an allocated region. */
    @stub
    protected def isAfter(x: Int, y: Int, innerAlloc: Rectangle): Boolean = ???

    /** Are the allocations for the children still
     *  valid?
     */
    @stub
    protected def isAllocationValid(): Boolean = ???

    /** Determines if a point falls before an allocated region. */
    @stub
    protected def isBefore(x: Int, y: Int, innerAlloc: Rectangle): Boolean = ???

    /** Determines if the layout is valid along the given axis. */
    @stub
    protected def isLayoutValid(axis: Int): Boolean = ???

    /** Perform layout on the box */
    @stub
    protected def layout(width: Int, height: Int): Unit = ???

    /** Invalidates the layout along an axis. */
    @stub
    def layoutChanged(axis: Int): Unit = ???

    /** Performs layout for the major axis of the box (i.e. */
    @stub
    protected def layoutMajorAxis(targetSpan: Int, axis: Int, offsets: Array[Int], spans: Array[Int]): Unit = ???

    /** Performs layout for the minor axis of the box (i.e. */
    @stub
    protected def layoutMinorAxis(targetSpan: Int, axis: Int, offsets: Array[Int], spans: Array[Int]): Unit = ???

    /** Provides a mapping from the document model coordinate space
     *  to the coordinate space of the view mapped to it.
     */
    @stub
    def modelToView(pos: Int, a: Shape, b: Position.Bias): Shape = ???

    /** Renders the BoxView using the given
     *  rendering surface and area
     *  on that surface.
     */
    @stub
    def paint(g: Graphics, allocation: Shape): Unit = ???

    /** Paints a child. */
    @stub
    protected def paintChild(g: Graphics, alloc: Rectangle, index: Int): Unit = ???

    /** This is called by a child to indicate its
     *  preferred span has changed.
     */
    @stub
    def preferenceChanged(child: View, width: Boolean, height: Boolean): Unit = ???

    /** Invalidates the layout and resizes the cache of
     *  requests/allocations.
     */
    @stub
    def replace(index: Int, length: Int, elems: Array[View]): Unit = ???

    /** Sets the tile axis property. */
    @stub
    def setAxis(axis: Int): Unit = ???

    /** Sets the size of the view. */
    @stub
    def setSize(width: Float, height: Float): Unit = ???

    /** Provides a mapping from the view coordinate space to the logical
     *  coordinate space of the model.
     */
    @stub
    def viewToModel(x: Float, y: Float, a: Shape, bias: Array[Position.Bias]): Int = ???
}
