package javax.swing.table

import java.io.Serializable
import java.lang.{Class, Object, String}
import java.util.EventListener
import javax.swing.event.{EventListenerList, TableModelEvent, TableModelListener}
import scala.scalanative.annotation.stub

/** This abstract class provides default implementations for most of
 *   the methods in the TableModel interface. It takes care of
 *   the management of listeners and provides some conveniences for generating
 *   TableModelEvents and dispatching them to the listeners.
 *   To create a concrete TableModel as a subclass of
 *   AbstractTableModel you need only provide implementations
 *   for the following three methods:
 * 
 *   
 *   public int getRowCount();
 *   public int getColumnCount();
 *   public Object getValueAt(int row, int column);
 *   
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
abstract class AbstractTableModel extends Object with TableModel with Serializable {

    /**  */
    @stub
    def this() = ???

    /** List of listeners */
    protected val listenerList: EventListenerList

    /** Adds a listener to the list that's notified each time a change
     *  to the data model occurs.
     */
    def addTableModelListener(l: TableModelListener): Unit

    /** Returns a column given its name. */
    def findColumn(columnName: String): Int

    /** Notifies all listeners that the value of the cell at
     *  [row, column] has been updated.
     */
    def fireTableCellUpdated(row: Int, column: Int): Unit

    /** Forwards the given notification event to all
     *  TableModelListeners that registered
     *  themselves as listeners for this table model.
     */
    def fireTableChanged(e: TableModelEvent): Unit

    /** Notifies all listeners that all cell values in the table's
     *  rows may have changed.
     */
    def fireTableDataChanged(): Unit

    /** Notifies all listeners that rows in the range
     *  [firstRow, lastRow], inclusive, have been deleted.
     */
    def fireTableRowsDeleted(firstRow: Int, lastRow: Int): Unit

    /** Notifies all listeners that rows in the range
     *  [firstRow, lastRow], inclusive, have been inserted.
     */
    def fireTableRowsInserted(firstRow: Int, lastRow: Int): Unit

    /** Notifies all listeners that rows in the range
     *  [firstRow, lastRow], inclusive, have been updated.
     */
    def fireTableRowsUpdated(firstRow: Int, lastRow: Int): Unit

    /** Notifies all listeners that the table's structure has changed. */
    def fireTableStructureChanged(): Unit

    /** Returns Object.class regardless of columnIndex. */
    def getColumnClass(columnIndex: Int): Class[_]

    /** Returns a default name for the column using spreadsheet conventions:
     *   A, B, C, ...
     */
    def getColumnName(column: Int): String

    /** Returns an array of all the objects currently registered
     *  as FooListeners
     *  upon this AbstractTableModel.
     */
    def getListeners[T <: EventListener](listenerType: Class[T]): Array[T]

    /** Returns an array of all the table model listeners
     *  registered on this model.
     */
    def getTableModelListeners(): Array[TableModelListener]

    /** Returns false. */
    def isCellEditable(rowIndex: Int, columnIndex: Int): Boolean

    /** Removes a listener from the list that's notified each time a
     *  change to the data model occurs.
     */
    def removeTableModelListener(l: TableModelListener): Unit

    /** This empty implementation is provided so users don't have to implement
     *   this method if their data model is not editable.
     */
    def setValueAt(aValue: Object, rowIndex: Int, columnIndex: Int): Unit
}
