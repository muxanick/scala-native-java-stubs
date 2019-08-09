package javax.swing.text

import java.awt.Rectangle
import java.lang.Object

/** View of a row in a row-centric table. */
class TableView.TableRow extends BoxView {

    /** Determines the resizability of the view along the
     *  given axis.
     */
    @stub
    def getResizeWeight(axis: Int): Int = ???

    /** Fetches the child view that represents the given position in
     *  the model.
     */
    @stub
    protected def getViewAtPosition(pos: Int, a: Rectangle): View = ???

    /** Perform layout for the major axis of the box (i.e. */
    @stub
    protected def layoutMajorAxis(targetSpan: Int, axis: Int, offsets: Array[Int], spans: Array[Int]): Unit = ???

    /** Perform layout for the minor axis of the box (i.e. */
    @stub
    protected def layoutMinorAxis(targetSpan: Int, axis: Int, offsets: Array[Int], spans: Array[Int]): Unit = ???
}
