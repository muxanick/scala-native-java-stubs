package javax.swing.text

import java.awt.Rectangle
import java.lang.Object

// View of a row in a row-centric table.
class TableView.TableRow extends BoxView {

    @stub
    // Determines the resizability of the view along the
    // given axis.
    def getResizeWeight(axis: Int): Int = ???

    @stub
    // Fetches the child view that represents the given position in
    // the model.
    protected def getViewAtPosition(pos: Int, a: Rectangle): View = ???

    @stub
    // Perform layout for the major axis of the box (i.e.
    protected def layoutMajorAxis(targetSpan: Int, axis: Int, offsets: Array[Int], spans: Array[Int]): Unit = ???

    @stub
    // Perform layout for the minor axis of the box (i.e.
    protected def layoutMinorAxis(targetSpan: Int, axis: Int, offsets: Array[Int], spans: Array[Int]): Unit = ???
}
