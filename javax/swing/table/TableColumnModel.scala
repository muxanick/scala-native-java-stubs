package javax.swing.table

import java.lang.Object
import java.util.Enumeration
import javax.swing.ListSelectionModel
import javax.swing.event.TableColumnModelListener
import scala.scalanative.annotation.stub

/** Defines the requirements for a table column model object suitable for
 *  use with JTable.
 */
trait TableColumnModel {

    /** Appends aColumn to the end of the
     *   tableColumns array.
     */
    @stub
    def addColumn(aColumn: TableColumn): Unit = ???

    /** Adds a listener for table column model events. */
    @stub
    def addColumnModelListener(x: TableColumnModelListener): Unit = ???

    /** Returns the TableColumn object for the column at
     *  columnIndex.
     */
    @stub
    def getColumn(columnIndex: Int): TableColumn = ???

    /** Returns the number of columns in the model. */
    @stub
    def getColumnCount(): Int = ???

    /** Returns the index of the first column in the table
     *  whose identifier is equal to identifier,
     *  when compared using equals.
     */
    @stub
    def getColumnIndex(columnIdentifier: Any): Int = ???

    /** Returns the index of the column that lies on the
     *  horizontal point, xPosition;
     *  or -1 if it lies outside the any of the column's bounds.
     */
    @stub
    def getColumnIndexAtX(xPosition: Int): Int = ???

    /** Returns the width between the cells in each column. */
    @stub
    def getColumnMargin(): Int = ???

    /** Returns an Enumeration of all the columns in the model. */
    @stub
    def getColumns(): Enumeration[TableColumn] = ???

    /** Returns true if columns may be selected. */
    @stub
    def getColumnSelectionAllowed(): Boolean = ???

    /** Returns the number of selected columns. */
    @stub
    def getSelectedColumnCount(): Int = ???

    /** Returns an array of indicies of all selected columns. */
    @stub
    def getSelectedColumns(): Array[Int] = ???

    /** Returns the current selection model. */
    @stub
    def getSelectionModel(): ListSelectionModel = ???

    /** Returns the total width of all the columns. */
    @stub
    def getTotalColumnWidth(): Int = ???

    /** Moves the column and its header at columnIndex to
     *  newIndex.
     */
    @stub
    def moveColumn(columnIndex: Int, newIndex: Int): Unit = ???

    /** Deletes the TableColumn column from the
     *   tableColumns array.
     */
    @stub
    def removeColumn(column: TableColumn): Unit = ???

    /** Removes a listener for table column model events. */
    @stub
    def removeColumnModelListener(x: TableColumnModelListener): Unit = ???

    /** Sets the TableColumn's column margin to
     *  newMargin.
     */
    @stub
    def setColumnMargin(newMargin: Int): Unit = ???

    /** Sets whether the columns in this model may be selected. */
    @stub
    def setColumnSelectionAllowed(flag: Boolean): Unit = ???

    /** Sets the selection model. */
    @stub
    def setSelectionModel(newModel: ListSelectionModel): Unit = ???
}
