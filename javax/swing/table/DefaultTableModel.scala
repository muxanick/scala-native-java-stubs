package javax.swing.table

import java.io.Serializable
import java.lang.{Object, String}
import java.util.Vector
import javax.swing.event.TableModelEvent

/** This is an implementation of TableModel that
 *  uses a Vector of Vectors to store the
 *  cell value objects.
 *  
 *  Warning: DefaultTableModel returns a
 *  column class of Object.  When
 *  DefaultTableModel is used with a
 *  TableRowSorter this will result in extensive use of
 *  toString, which for non-String data types
 *  is expensive.  If you use DefaultTableModel with a
 *  TableRowSorter you are strongly encouraged to override
 *  getColumnClass to return the appropriate type.
 *  
 *  Warning:
 *  Serialized objects of this class will not be compatible with
 *  future Swing releases. The current serialization support is
 *  appropriate for short term storage or RMI between applications running
 *  the same version of Swing.  As of 1.4, support for long term storage
 *  of all JavaBeans™
 *  has been added to the java.beans package.
 *  Please see XMLEncoder.
 */
class DefaultTableModel extends AbstractTableModel with Serializable {

    /** Constructs a default DefaultTableModel
     *   which is a table of zero columns and zero rows.
     */
    @stub
    def this() = ???

    /** Constructs a DefaultTableModel with
     *   rowCount and columnCount of
     *   null object values.
     */
    @stub
    def this(rowCount: Int, columnCount: Int) = ???

    /** Constructs a DefaultTableModel and initializes the table
     *   by passing data and columnNames
     *   to the setDataVector
     *   method.
     */
    @stub
    def this(data: Array[Array[Object]], columnNames: Array[Object]) = ???

    /** Constructs a DefaultTableModel with as many
     *   columns as there are elements in columnNames
     *   and rowCount of null
     *   object values.
     */
    @stub
    def this(columnNames: Array[Object], rowCount: Int) = ???

    /** Constructs a DefaultTableModel with as many columns
     *   as there are elements in columnNames
     *   and rowCount of null
     *   object values.
     */
    @stub
    def this(columnNames: Vector, rowCount: Int) = ???

    /** The Vector of column identifiers. */
    @stub
    protected val columnIdentifiers: Vector = ???

    /** Adds a column to the model. */
    @stub
    def addColumn(columnName: Object): Unit = ???

    /** Adds a column to the model. */
    @stub
    def addColumn(columnName: Object, columnData: Array[Object]): Unit = ???

    /** Adds a column to the model. */
    @stub
    def addColumn(columnName: Object, columnData: Vector): Unit = ???

    /** Adds a row to the end of the model. */
    @stub
    def addRow(rowData: Array[Object]): Unit = ???

    /** Adds a row to the end of the model. */
    @stub
    def addRow(rowData: Vector): Unit = ???

    /** Returns the number of columns in this data table. */
    @stub
    def getColumnCount(): Int = ???

    /** Returns the column name. */
    @stub
    def getColumnName(column: Int): String = ???

    /** Returns the Vector of Vectors
     *   that contains the table's
     *   data values.
     */
    @stub
    def getDataVector(): Vector = ???

    /** Returns the number of rows in this data table. */
    @stub
    def getRowCount(): Int = ???

    /** Returns an attribute value for the cell at row
     *  and column.
     */
    @stub
    def getValueAt(row: Int, column: Int): Object = ???

    /** Inserts a row at row in the model. */
    @stub
    def insertRow(row: Int, rowData: Array[Object]): Unit = ???

    /** Inserts a row at row in the model. */
    @stub
    def insertRow(row: Int, rowData: Vector): Unit = ???

    /** Returns true regardless of parameter values. */
    @stub
    def isCellEditable(row: Int, column: Int): Boolean = ???

    /** Moves one or more rows from the inclusive range start to
     *   end to the to position in the model.
     */
    @stub
    def moveRow(start: Int, end: Int, to: Int): Unit = ???

    /** Equivalent to fireTableChanged. */
    @stub
    def newDataAvailable(event: TableModelEvent): Unit = ???

    /** Ensures that the new rows have the correct number of columns. */
    @stub
    def newRowsAdded(e: TableModelEvent): Unit = ???

    /** Removes the row at row from the model. */
    @stub
    def removeRow(row: Int): Unit = ???

    /** Equivalent to fireTableChanged. */
    @stub
    def rowsRemoved(event: TableModelEvent): Unit = ???

    /** Sets the number of columns in the model. */
    @stub
    def setColumnCount(columnCount: Int): Unit = ???

    /** Replaces the column identifiers in the model. */
    @stub
    def setColumnIdentifiers(newIdentifiers: Array[Object]): Unit = ???

    /** Replaces the column identifiers in the model. */
    @stub
    def setColumnIdentifiers(columnIdentifiers: Vector): Unit = ???

    /** Replaces the value in the dataVector instance
     *   variable with the values in the array dataVector.
     */
    @stub
    def setDataVector(dataVector: Array[Array[Object]], columnIdentifiers: Array[Object]): Unit = ???

    /** Replaces the current dataVector instance variable
     *   with the new Vector of rows, dataVector.
     */
    @stub
    def setDataVector(dataVector: Vector, columnIdentifiers: Vector): Unit = ???

    /** Obsolete as of Java 2 platform v1.3. */
    @stub
    def setNumRows(rowCount: Int): Unit = ???

    /** Sets the number of rows in the model. */
    @stub
    def setRowCount(rowCount: Int): Unit = ???
}

object DefaultTableModel {
    /** Returns a vector that contains the same objects as the array. */
    @stub
    protected def convertToVector(anArray: Array[Object]): Vector = ???

    /** Returns a vector of vectors that contains the same objects as the array. */
    @stub
    protected def convertToVector(anArray: Array[Array[Object]]): Vector = ???
}
