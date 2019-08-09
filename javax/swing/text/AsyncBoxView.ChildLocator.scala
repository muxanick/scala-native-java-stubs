package javax.swing.text

import java.awt.{Graphics, Rectangle, Shape}
import java.lang.Object

/** A class to manage the effective position of the
 *  child views in a localized area while changes are
 *  being made around the localized area.  The AsyncBoxView
 *  may be continuously changing, but the visible area
 *  needs to remain fairly stable until the layout thread
 *  decides to publish an update to the parent.
 */
class AsyncBoxView.ChildLocator extends Object {

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
}
