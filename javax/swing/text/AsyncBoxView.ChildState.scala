package javax.swing.text

import java.lang.{Object, Runnable}

// A record representing the layout state of a
// child view.  It is runnable as a task on another
// thread.  All access to the child view that is
// based upon a read-lock on the model should synchronize
// on this object (i.e. The layout thread and the GUI
// thread can both have a read lock on the model at the
// same time and are not protected from each other).
// Access to a child view hierarchy is serialized via
// synchronization on the ChildState instance.
class AsyncBoxView.ChildState extends Object with Runnable {

    @stub
    // Fetch the child view this record represents
    def getChildView(): View = ???

    @stub
    // Get the offset along the major axis
    def getMajorOffset(): float = ???

    @stub
    // What is the span along the major axis.
    def getMajorSpan(): float = ???

    @stub
    // What is the offset along the minor axis
    def getMinorOffset(): float = ???

    @stub
    // What is the span along the minor axis.
    def getMinorSpan(): float = ???

    @stub
    // Has the child view been laid out.
    def isLayoutValid(): Boolean = ???

    @stub
    // Mark preferences changed for this child.
    def preferenceChanged(width: Boolean, height: Boolean): Unit = ???

    @stub
    // Update the child state.
    def run(): Unit = ???
}
