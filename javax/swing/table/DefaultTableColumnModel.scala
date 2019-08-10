package javax.swing.table

import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.io.Serializable
import java.lang.{Class, Object}
import java.util.{Enumeration, EventListener, Vector}
import javax.swing.ListSelectionModel
import javax.swing.event.{ChangeEvent, EventListenerList, ListSelectionEvent, ListSelectionListener, TableColumnModelEvent, TableColumnModelListener}
import scala.scalanative.annotation.stub

/** The standard column-handler for a JTable.
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
class DefaultTableColumnModel extends Object with TableColumnModel with PropertyChangeListener with ListSelectionListener with Serializable {

    /** Creates a default table column model. */
    @stub
    def this() = ???

    /** Change event (only one needed) */
    @stub
    protected val changeEvent: ChangeEvent = ???

    /** Width margin between each column */
    @stub
    protected val columnMargin: Int = ???

    /** Column selection allowed in this column model */
    @stub
    protected val columnSelectionAllowed: Boolean = ???

    /** List of TableColumnModelListener */
    @stub
    protected val listenerList: EventListenerList = ???

    /** Model for keeping track of column selections */
    @stub
    protected val selectionModel: ListSelectionModel = ???

    /** Array of TableColumn objects in this model */
    @stub
    protected val tableColumns: Vector[TableColumn] = ???

    /** A local cache of the combined width of all columns */
    @stub
    protected val totalColumnWidth: Int = ???

    /** Appends aColumn to the end of the
     *   tableColumns array.
     */
    @stub
    def addColumn(aColumn: TableColumn): Unit = ???

    /** Adds a listener for table column model events. */
    @stub
    def addColumnModelListener(x: TableColumnModelListener): Unit = ???

    /** Creates a new default list selection model. */
    @stub
    protected def createSelectionModel(): ListSelectionModel = ???

    /** Notifies all listeners that have registered interest for
     *  notification on this event type.
     */
    @stub
    protected def fireColumnAdded(e: TableColumnModelEvent): Unit = ???

    /** Notifies all listeners that have registered interest for
     *  notification on this event type.
     */
    @stub
    protected def fireColumnMarginChanged(): Unit = ???

    /** Notifies all listeners that have registered interest for
     *  notification on this event type.
     */
    @stub
    protected def fireColumnMoved(e: TableColumnModelEvent): Unit = ???

    /** Notifies all listeners that have registered interest for
     *  notification on this event type.
     */
    @stub
    protected def fireColumnRemoved(e: TableColumnModelEvent): Unit = ???

    /** Notifies all listeners that have registered interest for
     *  notification on this event type.
     */
    @stub
    protected def fireColumnSelectionChanged(e: ListSelectionEvent): Unit = ???

    /** Returns the TableColumn object for the column
     *  at columnIndex.
     */
    @stub
    def getColumn(columnIndex: Int): TableColumn = ???

    /** Returns the number of columns in the tableColumns array. */
    @stub
    def getColumnCount(): Int = ???

    /** Returns the index of the first column in the tableColumns
     *  array whose identifier is equal to identifier,
     *  when compared using equals.
     */
    @stub
    def getColumnIndex(identifier: Any): Int = ???

    /** Returns the index of the column that lies at position x,
     *  or -1 if no column covers this point.
     */
    @stub
    def getColumnIndexAtX(x: Int): Int = ???

    /** Returns the width margin for TableColumn. */
    @stub
    def getColumnMargin(): Int = ???

    /** Returns an array of all the column model listeners
     *  registered on this model.
     */
    @stub
    def getColumnModelListeners(): Array[TableColumnModelListener] = ???

    /** Returns an Enumeration of all the columns in the model. */
    @stub
    def getColumns(): Enumeration[TableColumn] = ???

    /** Returns true if column selection is allowed, otherwise false. */
    @stub
    def getColumnSelectionAllowed(): Boolean = ???

    /** Returns an array of all the objects currently registered
     *  as FooListeners
     *  upon this model.
     */
    @stub
    def getListeners[T <: EventListener](listenerType: Class[T]): Array[T] = ???

    /** Returns the number of columns selected. */
    @stub
    def getSelectedColumnCount(): Int = ???

    /** Returns an array of selected columns. */
    @stub
    def getSelectedColumns(): Array[Int] = ???

    /** Returns the ListSelectionModel that is used to
     *  maintain column selection state.
     */
    @stub
    def getSelectionModel(): ListSelectionModel = ???

    /** Returns the total combined width of all columns. */
    @stub
    def getTotalColumnWidth(): Int = ???

    /** Moves the column and heading at columnIndex to
     *  newIndex.
     */
    @stub
    def moveColumn(columnIndex: Int, newIndex: Int): Unit = ???

    /** Property Change Listener change method. */
    @stub
    def propertyChange(evt: PropertyChangeEvent): Unit = ???

    /** Recalculates the total combined width of all columns. */
    @stub
    protected def recalcWidthCache(): Unit = ???

    /** Deletes the column from the
     *   tableColumns array.
     */
    @stub
    def removeColumn(column: TableColumn): Unit = ???

    /** Removes a listener for table column model events. */
    @stub
    def removeColumnModelListener(x: TableColumnModelListener): Unit = ???

    /** Sets the column margin to newMargin. */
    @stub
    def setColumnMargin(newMargin: Int): Unit = ???

    /** Sets whether column selection is allowed. */
    @stub
    def setColumnSelectionAllowed(flag: Boolean): Unit = ???

    /** Sets the selection model for this TableColumnModel
     *   to newModel
     *   and registers for listener notifications from the new selection
     *   model.
     */
    @stub
    def setSelectionModel(newModel: ListSelectionModel): Unit = ???

    /** A ListSelectionListener that forwards
     *  ListSelectionEvents when there is a column
     *  selection change.
     */
    @stub
    def valueChanged(e: ListSelectionEvent): Unit = ???
}
