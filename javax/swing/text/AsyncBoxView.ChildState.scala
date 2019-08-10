package javax.swing.text

import java.lang.{Object, Runnable}
import scala.scalanative.annotation.stub

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
class AsyncBoxView_ChildState extends Object with Runnable {

    /** Construct a child status. */
    @stub
    def ChildState(v: View) = ???

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
