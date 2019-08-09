package javax.swing.text

import java.awt.{Rectangle, Shape}
import java.lang.Object
import javax.swing.SizeRequirements
import javax.swing.event.{DocumentEvent, DocumentEvent.ElementChange}

// 
// Implements View interface for a table, that is composed of an
// element structure where the child elements of the element
// this view is responsible for represent rows and the child
// elements of the row elements are cells.  The cell elements can
// have an arbitrary element structure under them, which will
// be built with the ViewFactory returned by the getViewFactory
// method.
// 
//
//    TABLE
//      ROW
//        CELL
//        CELL
//      ROW
//        CELL
//        CELL
//
// 
// 
// This is implemented as a hierarchy of boxes, the table itself
// is a vertical box, the rows are horizontal boxes, and the cells
// are vertical boxes.  The cells are allowed to span multiple
// columns and rows.  By default, the table can be thought of as
// being formed over a grid (i.e. somewhat like one would find in
// gridbag layout), where table cells can request to span more
// than one grid cell.  The default horizontal span of table cells
// will be based upon this grid, but can be changed by reimplementing
// the requested span of the cell (i.e. table cells can have independant
// spans if desired).
abstract class TableView extends BoxView {

    // Deprecated. 
    //A table cell can now be any View implementation.
    //
    def TableView.TableCell: class

    // Calculate the requirements for the minor axis.
    protected def calculateMinorAxisRequirements(axis: Int, r: SizeRequirements): SizeRequirements

    // Deprecated. 
    //Table cells can now be any arbitrary
    // View implementation and should be produced by the
    // ViewFactory rather than the table.
    //
    protected def createTableCell(elem: Element): TableView.TableCell

    // Creates a new table row.
    protected def createTableRow(elem: Element): TableView.TableRow

    // Forwards the given DocumentEvent to the child views
    // that need to be notified of the change to the model.
    protected def forwardUpdate(ec: DocumentEvent.ElementChange, e: DocumentEvent, a: Shape, f: ViewFactory): Unit

    // Fetches the child view that represents the given position in
    // the model.
    protected def getViewAtPosition(pos: Int, a: Rectangle): View

    // Lays out the columns to fit within the given target span.
    protected def layoutColumns(targetSpan: Int, offsets: Array[Int], spans: Array[Int], reqs: Array[SizeRequirements]): Unit

    // Perform layout for the minor axis of the box (i.e.
    protected def layoutMinorAxis(targetSpan: Int, axis: Int, offsets: Array[Int], spans: Array[Int]): Unit
}
