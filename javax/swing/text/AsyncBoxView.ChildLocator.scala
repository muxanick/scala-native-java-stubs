package javax.swing.text

import java.awt.{Graphics, Rectangle, Shape}
import java.lang.Object

// A class to manage the effective position of the
// child views in a localized area while changes are
// being made around the localized area.  The AsyncBoxView
// may be continuously changing, but the visible area
// needs to remain fairly stable until the layout thread
// decides to publish an update to the parent.
class AsyncBoxView.ChildLocator extends Object {

    @stub
    // A shape to use for the child allocation to avoid
    // creating a lot of garbage.
    protected def childAlloc: Rectangle = ???

    @stub
    // The last seen allocation (for repainting when changes
    // are flushed upward).
    protected def lastAlloc: Rectangle = ???

    @stub
    // Notification that a child changed.
    def childChanged(cs: AsyncBoxView.ChildState): Unit = ???

    @stub
    // Fetch the allocation to use for a child view.
    protected def getChildAllocation(index: Int): Shape = ???

    @stub
    // Fetch the allocation to use for a child view.
    def getChildAllocation(index: Int, a: Shape): Shape = ???

    @stub
    // Fetches the child view index at the given point.
    def getViewIndexAtPoint(x: float, y: float, a: Shape): Int = ???

    @stub
    // Locate the view responsible for an offset into the box
    // along the major axis.
    protected def getViewIndexAtVisualOffset(targetOffset: float): Int = ???

    @stub
    // Paint the children that intersect the clip area.
    def paintChildren(g: Graphics): Unit = ???
}
