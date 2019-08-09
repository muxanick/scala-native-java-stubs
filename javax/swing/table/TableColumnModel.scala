package javax.swing.table

import java.lang.Object
import java.util.Enumeration
import javax.swing.ListSelectionModel
import javax.swing.event.TableColumnModelListener

// Defines the requirements for a table column model object suitable for
// use with JTable.
trait TableColumnModel {

    @stub
    // Appends aColumn to the end of the
    //  tableColumns array.
    def addColumn(aColumn: TableColumn): Unit = ???

    @stub
    // Adds a listener for table column model events.
    def addColumnModelListener(x: TableColumnModelListener): Unit = ???

    @stub
    // Returns the TableColumn object for the column at
    // columnIndex.
    def getColumn(columnIndex: Int): TableColumn = ???

    @stub
    // Returns the number of columns in the model.
    def getColumnCount(): Int = ???

    @stub
    // Returns the index of the first column in the table
    // whose identifier is equal to identifier,
    // when compared using equals.
    def getColumnIndex(columnIdentifier: Object): Int = ???

    @stub
    // Returns the index of the column that lies on the
    // horizontal point, xPosition;
    // or -1 if it lies outside the any of the column's bounds.
    def getColumnIndexAtX(xPosition: Int): Int = ???

    @stub
    // Returns the width between the cells in each column.
    def getColumnMargin(): Int = ???

    @stub
    // Returns an Enumeration of all the columns in the model.
    def getColumns(): Enumeration[TableColumn] = ???

    @stub
    // Returns true if columns may be selected.
    def getColumnSelectionAllowed(): Boolean = ???

    @stub
    // Returns the number of selected columns.
    def getSelectedColumnCount(): Int = ???

    @stub
    // Returns an array of indicies of all selected columns.
    def getSelectedColumns(): Array[Int] = ???

    @stub
    // Returns the current selection model.
    def getSelectionModel(): ListSelectionModel = ???

    @stub
    // Returns the total width of all the columns.
    def getTotalColumnWidth(): Int = ???

    @stub
    // Moves the column and its header at columnIndex to
    // newIndex.
    def moveColumn(columnIndex: Int, newIndex: Int): Unit = ???

    @stub
    // Deletes the TableColumn column from the
    //  tableColumns array.
    def removeColumn(column: TableColumn): Unit = ???

    @stub
    // Removes a listener for table column model events.
    def removeColumnModelListener(x: TableColumnModelListener): Unit = ???

    @stub
    // Sets the TableColumn's column margin to
    // newMargin.
    def setColumnMargin(newMargin: Int): Unit = ???

    @stub
    // Sets whether the columns in this model may be selected.
    def setColumnSelectionAllowed(flag: Boolean): Unit = ???
}
