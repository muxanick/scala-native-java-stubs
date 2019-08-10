package javax.swing.text

import java.awt.{Graphics, Rectangle, Shape}
import java.lang.{Object, Runnable}
import javax.swing.event.{DocumentEvent, DocumentEvent.ElementChange}
import scala.scalanative.annotation.stub

/** A box that does layout asynchronously.  This
 *  is useful to keep the GUI event thread moving by
 *  not doing any layout on it.  The layout is done
 *  on a granularity of operations on the child views.
 *  After each child view is accessed for some part
 *  of layout (a potentially time consuming operation)
 *  the remaining tasks can be abandoned or a new higher
 *  priority task (i.e. to service a synchronous request
 *  or a visible area) can be taken on.
 *  
 *  While the child view is being accessed
 *  a read lock is acquired on the associated document
 *  so that the model is stable while being accessed.
 */
class AsyncBoxView extends View {

    /** Construct a box view that does asynchronous layout. */
    @stub
    def this(elem: Element, axis: Int) = ???

    /** A class to manage the effective position of the
     *  child views in a localized area while changes are
     *  being made around the localized area.  The AsyncBoxView
     *  may be continuously changing, but the visible area
     *  needs to remain fairly stable until the layout thread
     *  decides to publish an update to the parent.
     */
    class ChildLocator extends Object {

        /** construct a child locator. */
        @stub
        def this() = ???

        /** A shape to use for the child allocation to avoid
         *  creating a lot of garbage.
         */
        @stub
        protected val childAlloc: Rectangle = ???

        /** The last seen allocation (for repainting when changes
         *  are flushed upward).
         */
        @stub
        protected val lastAlloc: Rectangle = ???

        /** The location of the last offset calculation
         *  that is valid.
         */
        @stub
        protected val lastValidOffset: AsyncBoxView.ChildState = ???

        /** Notification that a child changed. */
        @stub
        def childChanged(cs: AsyncBoxView.ChildState): Unit = ???

        /** Fetch the allocation to use for a child view. */
        @stub
        protected def getChildAllocation(index: Int): Shape = ???

        /** Fetch the allocation to use for a child view. */
        @stub
        def getChildAllocation(index: Int, a: Shape): Shape = ???

        /** Fetches the child view index at the given point. */
        @stub
        def getViewIndexAtPoint(x: Float, y: Float, a: Shape): Int = ???

        /** Locate the view responsible for an offset into the box
         *  along the major axis.
         */
        @stub
        protected def getViewIndexAtVisualOffset(targetOffset: Float): Int = ???

        /** Paint the children that intersect the clip area. */
        @stub
        def paintChildren(g: Graphics): Unit = ???

        /** Copy the currently allocated shape into the Rectangle
         *  used to store the current allocation.
         */
        @stub
        protected def setAllocation(a: Shape): Unit = ???
    }


    /** A record representing the layout state of a
     *  child view.  It is runnable as a task on another
     *  thread.  All access to the child view that is
     *  based upon a read-lock on the model should synchronize
     *  on this object (i.e. The layout thread and the GUI
     *  thread can both have a read lock on the model at the
     *  same time and are not protected from each other).
     *  Access to a child view hierarchy is serialized via
     *  synchronization on the ChildState instance.
     */
    class ChildState extends Object with Runnable {

        /** Construct a child status. */
        @stub
        def this(v: View) = ???

        /** Fetch the child view this record represents */
        @stub
        def getChildView(): View = ???

        /** Get the offset along the major axis */
        @stub
        def getMajorOffset(): Float = ???

        /** What is the span along the major axis. */
        @stub
        def getMajorSpan(): Float = ???

        /** What is the offset along the minor axis */
        @stub
        def getMinorOffset(): Float = ???

        /** What is the span along the minor axis. */
        @stub
        def getMinorSpan(): Float = ???

        /** Has the child view been laid out. */
        @stub
        def isLayoutValid(): Boolean = ???

        /** Mark preferences changed for this child. */
        @stub
        def preferenceChanged(width: Boolean, height: Boolean): Unit = ???

        /** Update the child state. */
        @stub
        def run(): Unit = ???

        /** This method should only be called by the ChildLocator,
         *  it is simply a convenient place to hold the cached
         *  location.
         */
        @stub
        def setMajorOffset(offs: Float): Unit = ???
    }


    /** Object that manages the offsets of the
     *  children.
     */
    @stub
    protected val locator: AsyncBoxView.ChildLocator = ???

    /** New ChildState records are created through
     *  this method to allow subclasses the extend
     *  the ChildState records to do/hold more
     */
    @stub
    protected def createChildState(v: View): AsyncBoxView.ChildState = ???

    /** Publish the changes in preferences upward to the parent
     *  view.
     */
    @stub
    protected def flushRequirementChanges(): Unit = ???

    /** Get the bottom part of the margin around the view. */
    @stub
    def getBottomInset(): Float = ???

    /** Fetches the allocation for the given child view. */
    @stub
    def getChildAllocation(index: Int, a: Shape): Shape = ???

    /** Fetch the object representing the layout state of
     *  of the child at the given index.
     */
    @stub
    protected def getChildState(index: Int): AsyncBoxView.ChildState = ???

    /** Is the major span currently estimated? */
    @stub
    protected def getEstimatedMajorSpan(): Boolean = ???

    /** Fetch the span along an axis that is taken up by the insets. */
    @stub
    protected def getInsetSpan(axis: Int): Float = ???

    /** Fetch the queue to use for layout. */
    @stub
    protected def getLayoutQueue(): LayoutQueue = ???

    /** Get the left part of the margin around the view. */
    @stub
    def getLeftInset(): Float = ???

    /** Fetch the major axis (the axis the children
     *  are tiled along).
     */
    @stub
    def getMajorAxis(): Int = ???

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

    /** Fetch the minor axis (the axis orthogonal
     *  to the tiled axis).
     */
    @stub
    def getMinorAxis(): Int = ???

    /** Provides a way to determine the next visually represented model
     *  location that one might place a caret.
     */
    @stub
    def getNextVisualPositionFrom(pos: Int, b: Position.Bias, a: Shape, direction: Int, biasRet: Array[Position.Bias]): Int = ???

    /** Determines the preferred span for this view along an
     *  axis.
     */
    @stub
    def getPreferredSpan(axis: Int): Float = ???

    /** Get the right part of the margin around the view. */
    @stub
    def getRightInset(): Float = ???

    /** Get the top part of the margin around the view. */
    @stub
    def getTopInset(): Float = ???

    /** Gets the nth child view. */
    @stub
    def getView(n: Int): View = ???

    /** Returns the number of views in this view. */
    @stub
    def getViewCount(): Int = ???

    /** Returns the child view index representing the given position in
     *  the model.
     */
    @stub
    def getViewIndex(pos: Int, b: Position.Bias): Int = ???

    /** Fetches the child view index representing the given position in
     *  the model.
     */
    @stub
    protected def getViewIndexAtPosition(pos: Int, b: Position.Bias): Int = ???

    /** Loads all of the children to initialize the view. */
    @stub
    protected def loadChildren(f: ViewFactory): Unit = ???

    /** Requirements changed along the major axis. */
    @stub
    protected def majorRequirementChange(cs: AsyncBoxView.ChildState, delta: Float): Unit = ???

    /** Requirements changed along the minor axis. */
    @stub
    protected def minorRequirementChange(cs: AsyncBoxView.ChildState): Unit = ???

    /** Provides a mapping from the document model coordinate space
     *  to the coordinate space of the view mapped to it.
     */
    @stub
    def modelToView(pos: Int, a: Shape, b: Position.Bias): Shape = ???

    /** Render the view using the given allocation and
     *  rendering surface.
     */
    @stub
    def paint(g: Graphics, alloc: Shape): Unit = ???

    /** Child views can call this on the parent to indicate that
     *  the preference has changed and should be reconsidered
     *  for layout.
     */
    @stub
    def preferenceChanged(child: View, width: Boolean, height: Boolean): Unit = ???

    /** Calls the superclass to update the child views, and
     *  updates the status records for the children.
     */
    @stub
    def replace(offset: Int, length: Int, views: Array[View]): Unit = ???

    /** Set the bottom part of the margin around the view. */
    @stub
    def setBottomInset(i: Float): Unit = ???

    /** Set the estimatedMajorSpan property that determines if the
     *  major span should be treated as being estimated.
     */
    @stub
    protected def setEstimatedMajorSpan(isEstimated: Boolean): Unit = ???

    /** Set the left part of the margin around the view. */
    @stub
    def setLeftInset(i: Float): Unit = ???

    /** Sets the parent of the view. */
    @stub
    def setParent(parent: View): Unit = ???

    /** Set the right part of the margin around the view. */
    @stub
    def setRightInset(i: Float): Unit = ???

    /** Sets the size of the view. */
    @stub
    def setSize(width: Float, height: Float): Unit = ???

    /** Set the top part of the margin around the view. */
    @stub
    def setTopInset(i: Float): Unit = ???

    /** Update the layout in response to receiving notification of
     *  change from the model.
     */
    @stub
    protected def updateLayout(ec: DocumentEvent.ElementChange, e: DocumentEvent, a: Shape): Unit = ???

    /** Provides a mapping from the view coordinate space to the logical
     *  coordinate space of the model.
     */
    @stub
    def viewToModel(x: Float, y: Float, a: Shape, biasReturn: Array[Position.Bias]): Int = ???
}
