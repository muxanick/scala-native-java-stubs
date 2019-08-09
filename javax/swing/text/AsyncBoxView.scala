package javax.swing.text

import java.awt.{Graphics, Shape}
import java.lang.Object
import javax.swing.event.{DocumentEvent, DocumentEvent.ElementChange}

// A box that does layout asynchronously.  This
// is useful to keep the GUI event thread moving by
// not doing any layout on it.  The layout is done
// on a granularity of operations on the child views.
// After each child view is accessed for some part
// of layout (a potentially time consuming operation)
// the remaining tasks can be abandoned or a new higher
// priority task (i.e. to service a synchronous request
// or a visible area) can be taken on.
// 
// While the child view is being accessed
// a read lock is acquired on the associated document
// so that the model is stable while being accessed.
class AsyncBoxView extends View {

    @stub
    // A class to manage the effective position of the
    // child views in a localized area while changes are
    // being made around the localized area.
    def AsyncBoxView.ChildLocator: class = ???

    @stub
    // New ChildState records are created through
    // this method to allow subclasses the extend
    // the ChildState records to do/hold more
    protected def createChildState(v: View): AsyncBoxView.ChildState = ???

    @stub
    // Publish the changes in preferences upward to the parent
    // view.
    protected def flushRequirementChanges(): Unit = ???

    @stub
    // Get the bottom part of the margin around the view.
    def getBottomInset(): float = ???

    @stub
    // Fetches the allocation for the given child view.
    def getChildAllocation(index: Int, a: Shape): Shape = ???

    @stub
    // Fetch the object representing the layout state of
    // of the child at the given index.
    protected def getChildState(index: Int): AsyncBoxView.ChildState = ???

    @stub
    // Is the major span currently estimated?
    protected def getEstimatedMajorSpan(): Boolean = ???

    @stub
    // Fetch the span along an axis that is taken up by the insets.
    protected def getInsetSpan(axis: Int): float = ???

    @stub
    // Fetch the queue to use for layout.
    protected def getLayoutQueue(): LayoutQueue = ???

    @stub
    // Get the left part of the margin around the view.
    def getLeftInset(): float = ???

    @stub
    // Fetch the major axis (the axis the children
    // are tiled along).
    def getMajorAxis(): Int = ???

    @stub
    // Determines the maximum span for this view along an
    // axis.
    def getMaximumSpan(axis: Int): float = ???

    @stub
    // Determines the minimum span for this view along an
    // axis.
    def getMinimumSpan(axis: Int): float = ???

    @stub
    // Fetch the minor axis (the axis orthogonal
    // to the tiled axis).
    def getMinorAxis(): Int = ???

    @stub
    // Provides a way to determine the next visually represented model
    // location that one might place a caret.
    def getNextVisualPositionFrom(pos: Int, b: Position.Bias, a: Shape, direction: Int, biasRet: Array[Position.Bias]): Int = ???

    @stub
    // Determines the preferred span for this view along an
    // axis.
    def getPreferredSpan(axis: Int): float = ???

    @stub
    // Get the right part of the margin around the view.
    def getRightInset(): float = ???

    @stub
    // Get the top part of the margin around the view.
    def getTopInset(): float = ???

    @stub
    // Gets the nth child view.
    def getView(n: Int): View = ???

    @stub
    // Returns the number of views in this view.
    def getViewCount(): Int = ???

    @stub
    // Returns the child view index representing the given position in
    // the model.
    def getViewIndex(pos: Int, b: Position.Bias): Int = ???

    @stub
    // Fetches the child view index representing the given position in
    // the model.
    protected def getViewIndexAtPosition(pos: Int, b: Position.Bias): Int = ???

    @stub
    // Loads all of the children to initialize the view.
    protected def loadChildren(f: ViewFactory): Unit = ???

    @stub
    // Requirements changed along the major axis.
    protected def majorRequirementChange(cs: AsyncBoxView.ChildState, delta: float): Unit = ???

    @stub
    // Requirements changed along the minor axis.
    protected def minorRequirementChange(cs: AsyncBoxView.ChildState): Unit = ???

    @stub
    // Provides a mapping from the document model coordinate space
    // to the coordinate space of the view mapped to it.
    def modelToView(pos: Int, a: Shape, b: Position.Bias): Shape = ???

    @stub
    // Render the view using the given allocation and
    // rendering surface.
    def paint(g: Graphics, alloc: Shape): Unit = ???

    @stub
    // Child views can call this on the parent to indicate that
    // the preference has changed and should be reconsidered
    // for layout.
    def preferenceChanged(child: View, width: Boolean, height: Boolean): Unit = ???

    @stub
    // Calls the superclass to update the child views, and
    // updates the status records for the children.
    def replace(offset: Int, length: Int, views: Array[View]): Unit = ???

    @stub
    // Set the bottom part of the margin around the view.
    def setBottomInset(i: float): Unit = ???

    @stub
    // Set the estimatedMajorSpan property that determines if the
    // major span should be treated as being estimated.
    protected def setEstimatedMajorSpan(isEstimated: Boolean): Unit = ???

    @stub
    // Set the left part of the margin around the view.
    def setLeftInset(i: float): Unit = ???

    @stub
    // Sets the parent of the view.
    def setParent(parent: View): Unit = ???

    @stub
    // Set the right part of the margin around the view.
    def setRightInset(i: float): Unit = ???

    @stub
    // Sets the size of the view.
    def setSize(width: float, height: float): Unit = ???

    @stub
    // Set the top part of the margin around the view.
    def setTopInset(i: float): Unit = ???

    @stub
    // Update the layout in response to receiving notification of
    // change from the model.
    protected def updateLayout(ec: DocumentEvent.ElementChange, e: DocumentEvent, a: Shape): Unit = ???
}
