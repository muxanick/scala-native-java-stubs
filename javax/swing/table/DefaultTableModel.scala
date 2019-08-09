package javax.swing.table

import java.io.Serializable
import java.lang.{Object, String}
import java.util.Vector
import javax.swing.event.TableModelEvent

// This is an implementation of TableModel that
// uses a Vector of Vectors to store the
// cell value objects.
// 
// Warning: DefaultTableModel returns a
// column class of Object.  When
// DefaultTableModel is used with a
// TableRowSorter this will result in extensive use of
// toString, which for non-String data types
// is expensive.  If you use DefaultTableModel with a
// TableRowSorter you are strongly encouraged to override
// getColumnClass to return the appropriate type.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class DefaultTableModel extends AbstractTableModel with Serializable {

    @stub
    // Constructs a default DefaultTableModel
    //  which is a table of zero columns and zero rows.
    def this() = ???

    @stub
    // Constructs a DefaultTableModel with
    //  rowCount and columnCount of
    //  null object values.
    def this(rowCount: Int, columnCount: Int) = ???

    @stub
    // Constructs a DefaultTableModel and initializes the table
    //  by passing data and columnNames
    //  to the setDataVector
    //  method.
    def this(data: Array[Array[Object]], columnNames: Array[Object]) = ???

    @stub
    // Constructs a DefaultTableModel with as many
    //  columns as there are elements in columnNames
    //  and rowCount of null
    //  object values.
    def this(columnNames: Array[Object], rowCount: Int) = ???

    @stub
    // Constructs a DefaultTableModel with as many columns
    //  as there are elements in columnNames
    //  and rowCount of null
    //  object values.
    def this(columnNames: Vector, rowCount: Int) = ???

    @stub
    // The Vector of column identifiers.
    protected def columnIdentifiers: Vector = ???

    @stub
    // Adds a column to the model.
    def addColumn(columnName: Object): Unit = ???

    @stub
    // Adds a column to the model.
    def addColumn(columnName: Object, columnData: Array[Object]): Unit = ???

    @stub
    // Adds a column to the model.
    def addColumn(columnName: Object, columnData: Vector): Unit = ???

    @stub
    // Adds a row to the end of the model.
    def addRow(rowData: Array[Object]): Unit = ???

    @stub
    // Adds a row to the end of the model.
    def addRow(rowData: Vector): Unit = ???

    @stub
    // Returns the number of columns in this data table.
    def getColumnCount(): Int = ???

    @stub
    // Returns the column name.
    def getColumnName(column: Int): String = ???

    @stub
    // Returns the Vector of Vectors
    //  that contains the table's
    //  data values.
    def getDataVector(): Vector = ???

    @stub
    // Returns the number of rows in this data table.
    def getRowCount(): Int = ???

    @stub
    // Returns an attribute value for the cell at row
    // and column.
    def getValueAt(row: Int, column: Int): Object = ???

    @stub
    // Inserts a row at row in the model.
    def insertRow(row: Int, rowData: Array[Object]): Unit = ???

    @stub
    // Inserts a row at row in the model.
    def insertRow(row: Int, rowData: Vector): Unit = ???

    @stub
    // Returns true regardless of parameter values.
    def isCellEditable(row: Int, column: Int): Boolean = ???

    @stub
    // Moves one or more rows from the inclusive range start to
    //  end to the to position in the model.
    def moveRow(start: Int, end: Int, to: Int): Unit = ???

    @stub
    // Equivalent to fireTableChanged.
    def newDataAvailable(event: TableModelEvent): Unit = ???

    @stub
    // Ensures that the new rows have the correct number of columns.
    def newRowsAdded(e: TableModelEvent): Unit = ???

    @stub
    // Removes the row at row from the model.
    def removeRow(row: Int): Unit = ???

    @stub
    // Equivalent to fireTableChanged.
    def rowsRemoved(event: TableModelEvent): Unit = ???

    @stub
    // Sets the number of columns in the model.
    def setColumnCount(columnCount: Int): Unit = ???

    @stub
    // Replaces the column identifiers in the model.
    def setColumnIdentifiers(newIdentifiers: Array[Object]): Unit = ???

    @stub
    // Replaces the column identifiers in the model.
    def setColumnIdentifiers(columnIdentifiers: Vector): Unit = ???

    @stub
    // Replaces the value in the dataVector instance
    //  variable with the values in the array dataVector.
    def setDataVector(dataVector: Array[Array[Object]], columnIdentifiers: Array[Object]): Unit = ???

    @stub
    // Replaces the current dataVector instance variable
    //  with the new Vector of rows, dataVector.
    def setDataVector(dataVector: Vector, columnIdentifiers: Vector): Unit = ???

    @stub
    // Obsolete as of Java 2 platform v1.3.
    def setNumRows(rowCount: Int): Unit = ???

    @stub
    // Sets the number of rows in the model.
    def setRowCount(rowCount: Int): Unit = ???
}

object DefaultTableModel {
    @stub
    // Returns a vector that contains the same objects as the array.
    protected def convertToVector(anArray: Array[Object]): Vector = ???

    @stub
    // Returns a vector of vectors that contains the same objects as the array.
    protected def convertToVector(anArray: Array[Array[Object]]): Vector = ???
}
