package javax.swing.table

import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.io.Serializable
import java.lang.{Class, Object}
import java.util.{Enumeration, EventListener, Vector}
import javax.swing.ListSelectionModel
import javax.swing.event.{ChangeEvent, EventListenerList, ListSelectionEvent, ListSelectionListener, TableColumnModelEvent, TableColumnModelListener}

// The standard column-handler for a JTable.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class DefaultTableColumnModel extends Object with TableColumnModel, with PropertyChangeListener, with ListSelectionListener, with Serializable {

    @stub
    // Change event (only one needed)
    protected def changeEvent: ChangeEvent = ???

    @stub
    // Width margin between each column
    protected def columnMargin: Int = ???

    @stub
    // Column selection allowed in this column model
    protected def columnSelectionAllowed: Boolean = ???

    @stub
    // List of TableColumnModelListener
    protected def listenerList: EventListenerList = ???

    @stub
    // Model for keeping track of column selections
    protected def selectionModel: ListSelectionModel = ???

    @stub
    // Array of TableColumn objects in this model
    protected def tableColumns: Vector[TableColumn] = ???

    @stub
    // Appends aColumn to the end of the
    //  tableColumns array.
    def addColumn(aColumn: TableColumn): Unit = ???

    @stub
    // Adds a listener for table column model events.
    def addColumnModelListener(x: TableColumnModelListener): Unit = ???

    @stub
    // Creates a new default list selection model.
    protected def createSelectionModel(): ListSelectionModel = ???

    @stub
    // Notifies all listeners that have registered interest for
    // notification on this event type.
    protected def fireColumnAdded(e: TableColumnModelEvent): Unit = ???

    @stub
    // Notifies all listeners that have registered interest for
    // notification on this event type.
    protected def fireColumnMarginChanged(): Unit = ???

    @stub
    // Notifies all listeners that have registered interest for
    // notification on this event type.
    protected def fireColumnMoved(e: TableColumnModelEvent): Unit = ???

    @stub
    // Notifies all listeners that have registered interest for
    // notification on this event type.
    protected def fireColumnRemoved(e: TableColumnModelEvent): Unit = ???

    @stub
    // Notifies all listeners that have registered interest for
    // notification on this event type.
    protected def fireColumnSelectionChanged(e: ListSelectionEvent): Unit = ???

    @stub
    // Returns the TableColumn object for the column
    // at columnIndex.
    def getColumn(columnIndex: Int): TableColumn = ???

    @stub
    // Returns the number of columns in the tableColumns array.
    def getColumnCount(): Int = ???

    @stub
    // Returns the index of the first column in the tableColumns
    // array whose identifier is equal to identifier,
    // when compared using equals.
    def getColumnIndex(identifier: Object): Int = ???

    @stub
    // Returns the index of the column that lies at position x,
    // or -1 if no column covers this point.
    def getColumnIndexAtX(x: Int): Int = ???

    @stub
    // Returns the width margin for TableColumn.
    def getColumnMargin(): Int = ???

    @stub
    // Returns an array of all the column model listeners
    // registered on this model.
    def getColumnModelListeners(): Array[TableColumnModelListener] = ???

    @stub
    // Returns an Enumeration of all the columns in the model.
    def getColumns(): Enumeration[TableColumn] = ???

    @stub
    // Returns true if column selection is allowed, otherwise false.
    def getColumnSelectionAllowed(): Boolean = ???

    @stub
    // Returns an array of all the objects currently registered
    // as FooListeners
    // upon this model.
    def Array[T]: [T <: EventListener] = ???

    @stub
    // Returns the number of columns selected.
    def getSelectedColumnCount(): Int = ???

    @stub
    // Returns an array of selected columns.
    def getSelectedColumns(): Array[Int] = ???

    @stub
    // Returns the ListSelectionModel that is used to
    // maintain column selection state.
    def getSelectionModel(): ListSelectionModel = ???

    @stub
    // Returns the total combined width of all columns.
    def getTotalColumnWidth(): Int = ???

    @stub
    // Moves the column and heading at columnIndex to
    // newIndex.
    def moveColumn(columnIndex: Int, newIndex: Int): Unit = ???

    @stub
    // Property Change Listener change method.
    def propertyChange(evt: PropertyChangeEvent): Unit = ???

    @stub
    // Recalculates the total combined width of all columns.
    protected def recalcWidthCache(): Unit = ???

    @stub
    // Deletes the column from the
    //  tableColumns array.
    def removeColumn(column: TableColumn): Unit = ???

    @stub
    // Removes a listener for table column model events.
    def removeColumnModelListener(x: TableColumnModelListener): Unit = ???

    @stub
    // Sets the column margin to newMargin.
    def setColumnMargin(newMargin: Int): Unit = ???

    @stub
    // Sets whether column selection is allowed.
    def setColumnSelectionAllowed(flag: Boolean): Unit = ???

    @stub
    // Sets the selection model for this TableColumnModel
    //  to newModel
    //  and registers for listener notifications from the new selection
    //  model.
    def setSelectionModel(newModel: ListSelectionModel): Unit = ???
}
