package javax.swing.text

import java.awt.{Graphics, Rectangle, Shape}
import java.lang.Object
import javax.swing.SizeRequirements
import javax.swing.event.{DocumentEvent, DocumentEvent.ElementChange}

// A view that arranges its children into a box shape by tiling
// its children along an axis.  The box is somewhat like that
// found in TeX where there is alignment of the
// children, flexibility of the children is considered, etc.
// This is a building block that might be useful to represent
// things like a collection of lines, paragraphs,
// lists, columns, pages, etc.  The axis along which the children are tiled is
// considered the major axis.  The orthogonal axis is the minor axis.
// 
// Layout for each axis is handled separately by the methods
// layoutMajorAxis and layoutMinorAxis.
// Subclasses can change the layout algorithm by
// reimplementing these methods.    These methods will be called
// as necessary depending upon whether or not there is cached
// layout information and the cache is considered
// valid.  These methods are typically called if the given size
// along the axis changes, or if layoutChanged is
// called to force an updated layout.  The layoutChanged
// method invalidates cached layout information, if there is any.
// The requirements published to the parent view are calculated by
// the methods calculateMajorAxisRequirements
// and  calculateMinorAxisRequirements.
// If the layout algorithm is changed, these methods will
// likely need to be reimplemented.
class BoxView extends CompositeView {

    @stub
    // Computes the location and extent of each child view
    // in this BoxView given the targetSpan,
    // which is the width (or height) of the region we have to
    // work with.
    protected def baselineLayout(targetSpan: Int, axis: Int, offsets: Array[Int], spans: Array[Int]): Unit = ???

    @stub
    // Calculates the size requirements for this BoxView
    // by examining the size of each child view.
    protected def baselineRequirements(axis: Int, r: SizeRequirements): SizeRequirements = ???

    @stub
    // Calculates the size requirements for the major axis
    // axis.
    protected def calculateMajorAxisRequirements(axis: Int, r: SizeRequirements): SizeRequirements = ???

    @stub
    // Calculates the size requirements for the minor axis
    // axis.
    protected def calculateMinorAxisRequirements(axis: Int, r: SizeRequirements): SizeRequirements = ???

    @stub
    // Allocates a region for a child view.
    protected def childAllocation(index: Int, alloc: Rectangle): Unit = ???

    @stub
    // Determines in which direction the next view lays.
    protected def flipEastAndWestAtEnds(position: Int, bias: Position.Bias): Boolean = ???

    @stub
    // Forwards the given DocumentEvent to the child views
    // that need to be notified of the change to the model.
    protected def forwardUpdate(ec: DocumentEvent.ElementChange, e: DocumentEvent, a: Shape, f: ViewFactory): Unit = ???

    @stub
    // Determines the desired alignment for this view along an
    // axis.
    def getAlignment(axis: Int): float = ???

    @stub
    // Fetches the tile axis property.
    def getAxis(): Int = ???

    @stub
    // Fetches the allocation for the given child view.
    def getChildAllocation(index: Int, a: Shape): Shape = ???

    @stub
    // Returns the current height of the box.
    def getHeight(): Int = ???

    @stub
    // Determines the maximum span for this view along an
    // axis.
    def getMaximumSpan(axis: Int): float = ???

    @stub
    // Determines the minimum span for this view along an
    // axis.
    def getMinimumSpan(axis: Int): float = ???

    @stub
    // Fetches the offset of a particular child's current layout.
    protected def getOffset(axis: Int, childIndex: Int): Int = ???

    @stub
    // Determines the preferred span for this view along an
    // axis.
    def getPreferredSpan(axis: Int): float = ???

    @stub
    // Gets the resize weight.
    def getResizeWeight(axis: Int): Int = ???

    @stub
    // Fetches the span of a particular child's current layout.
    protected def getSpan(axis: Int, childIndex: Int): Int = ???

    @stub
    // Fetches the child view at the given coordinates.
    protected def getViewAtPoint(x: Int, y: Int, alloc: Rectangle): View = ???

    @stub
    // Returns the current width of the box.
    def getWidth(): Int = ???

    @stub
    // Determines if a point falls after an allocated region.
    protected def isAfter(x: Int, y: Int, innerAlloc: Rectangle): Boolean = ???

    @stub
    // Are the allocations for the children still
    // valid?
    protected def isAllocationValid(): Boolean = ???

    @stub
    // Determines if a point falls before an allocated region.
    protected def isBefore(x: Int, y: Int, innerAlloc: Rectangle): Boolean = ???

    @stub
    // Determines if the layout is valid along the given axis.
    protected def isLayoutValid(axis: Int): Boolean = ???

    @stub
    // Perform layout on the box
    protected def layout(width: Int, height: Int): Unit = ???

    @stub
    // Invalidates the layout along an axis.
    def layoutChanged(axis: Int): Unit = ???

    @stub
    // Performs layout for the major axis of the box (i.e.
    protected def layoutMajorAxis(targetSpan: Int, axis: Int, offsets: Array[Int], spans: Array[Int]): Unit = ???

    @stub
    // Performs layout for the minor axis of the box (i.e.
    protected def layoutMinorAxis(targetSpan: Int, axis: Int, offsets: Array[Int], spans: Array[Int]): Unit = ???

    @stub
    // Provides a mapping from the document model coordinate space
    // to the coordinate space of the view mapped to it.
    def modelToView(pos: Int, a: Shape, b: Position.Bias): Shape = ???

    @stub
    // Renders the BoxView using the given
    // rendering surface and area
    // on that surface.
    def paint(g: Graphics, allocation: Shape): Unit = ???

    @stub
    // Paints a child.
    protected def paintChild(g: Graphics, alloc: Rectangle, index: Int): Unit = ???

    @stub
    // This is called by a child to indicate its
    // preferred span has changed.
    def preferenceChanged(child: View, width: Boolean, height: Boolean): Unit = ???

    @stub
    // Invalidates the layout and resizes the cache of
    // requests/allocations.
    def replace(index: Int, length: Int, elems: Array[View]): Unit = ???

    @stub
    // Sets the tile axis property.
    def setAxis(axis: Int): Unit = ???

    @stub
    // Sets the size of the view.
    def setSize(width: float, height: float): Unit = ???
}
