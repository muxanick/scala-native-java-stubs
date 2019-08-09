package javax.swing

import java.awt.{Component.AccessibleAWTComponent, Container.AccessibleAWTContainer, Point}
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import javax.accessibility.{Accessible, AccessibleContext, AccessibleExtendedTable, AccessibleRole, AccessibleSelection, AccessibleTable}
import javax.swing.event.{CellEditorListener, ChangeEvent, ListSelectionEvent, ListSelectionListener, TableColumnModelEvent, TableColumnModelListener, TableModelEvent, TableModelListener}

// This class implements accessibility support for the
// JTable class.  It provides an implementation of the
// Java Accessibility API appropriate to table user-interface elements.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
protected class JTable.AccessibleJTable extends JComponent.AccessibleJComponent with AccessibleSelection, with ListSelectionListener, with TableModelListener, with TableColumnModelListener, with CellEditorListener, with PropertyChangeListener, with AccessibleExtendedTable {

    @stub
    // The class provides an implementation of the Java Accessibility
    // API appropriate to table cells.
    protected def JTable.AccessibleJTable.AccessibleJTableCell: class = ???

    @stub
    // Adds the specified Accessible child of the
    // object to the object's selection.
    def addAccessibleSelection(i: Int): Unit = ???

    @stub
    // Clears the selection in the object, so that no children in the
    // object are selected.
    def clearAccessibleSelection(): Unit = ???

    @stub
    // Track changes to the table contents (column insertions)
    def columnAdded(e: TableColumnModelEvent): Unit = ???

    @stub
    // Track changes of a column moving due to margin changes.
    def columnMarginChanged(e: ChangeEvent): Unit = ???

    @stub
    // Track changes of a column repositioning.
    def columnMoved(e: TableColumnModelEvent): Unit = ???

    @stub
    // Track changes to the table contents (column deletions)
    def columnRemoved(e: TableColumnModelEvent): Unit = ???

    @stub
    // Track that the selection model of the TableColumnModel changed.
    def columnSelectionChanged(e: ListSelectionEvent): Unit = ???

    @stub
    // Invoked when editing is canceled.
    def editingCanceled(e: ChangeEvent): Unit = ???

    @stub
    // Track changes to a cell's contents.
    def editingStopped(e: ChangeEvent): Unit = ???

    @stub
    // Returns the Accessible at a specified row and column
    // in the table.
    def getAccessibleAt(r: Int, c: Int): Accessible = ???

    @stub
    // Returns the Accessible child, if one exists,
    // contained at the local coordinate Point.
    def getAccessibleAt(p: Point): Accessible = ???

    @stub
    // Returns the caption for the table.
    def getAccessibleCaption(): Accessible = ???

    @stub
    // Returns the nth Accessible child of the object.
    def getAccessibleChild(i: Int): Accessible = ???

    @stub
    // Returns the number of accessible children in the object.
    def getAccessibleChildrenCount(): Int = ???

    @stub
    // Returns the column number of an index in the table.
    def getAccessibleColumn(index: Int): Int = ???

    @stub
    // Returns the column at a given index into the table.
    def getAccessibleColumnAtIndex(i: Int): Int = ???

    @stub
    // Returns the number of columns in the table.
    def getAccessibleColumnCount(): Int = ???

    @stub
    // Returns the description of the specified column in the table.
    def getAccessibleColumnDescription(c: Int): Accessible = ???

    @stub
    // Returns the number of columns occupied by the
    // Accessible at a given (row, column).
    def getAccessibleColumnExtentAt(r: Int, c: Int): Int = ???

    @stub
    // Returns the column headers as an AccessibleTable.
    def getAccessibleColumnHeader(): AccessibleTable = ???

    @stub
    // Returns the index at a row and column in the table.
    def getAccessibleIndex(r: Int, c: Int): Int = ???

    @stub
    // Returns the index at a given (row, column) in the table.
    def getAccessibleIndexAt(r: Int, c: Int): Int = ???

    @stub
    // Gets the role of this object.
    def getAccessibleRole(): AccessibleRole = ???

    @stub
    // Returns the row number of an index in the table.
    def getAccessibleRow(index: Int): Int = ???

    @stub
    // Returns the row at a given index into the table.
    def getAccessibleRowAtIndex(i: Int): Int = ???

    @stub
    // Returns the number of rows in the table.
    def getAccessibleRowCount(): Int = ???

    @stub
    // Returns the description of the specified row in the table.
    def getAccessibleRowDescription(r: Int): Accessible = ???

    @stub
    // Returns the number of rows occupied by the Accessible
    // at a specified row and column in the table.
    def getAccessibleRowExtentAt(r: Int, c: Int): Int = ???

    @stub
    // Returns the row headers as an AccessibleTable.
    def getAccessibleRowHeader(): AccessibleTable = ???

    @stub
    // Get the AccessibleSelection associated with this object.
    def getAccessibleSelection(): AccessibleSelection = ???

    @stub
    // Returns an Accessible representing the
    // specified selected child in the object.
    def getAccessibleSelection(i: Int): Accessible = ???

    @stub
    // Returns the number of Accessible children
    // currently selected.
    def getAccessibleSelectionCount(): Int = ???

    @stub
    // Returns the summary description of the table.
    def getAccessibleSummary(): Accessible = ???

    @stub
    // Gets the AccessibleTable associated with this
    // object.
    def getAccessibleTable(): AccessibleTable = ???

    @stub
    // Returns the selected columns in a table.
    def getSelectedAccessibleColumns(): Array[Int] = ???

    @stub
    // Returns the selected rows in a table.
    def getSelectedAccessibleRows(): Array[Int] = ???

    @stub
    // Determines if the current child of this object is selected.
    def isAccessibleChildSelected(i: Int): Boolean = ???

    @stub
    // Returns a boolean value indicating whether the specified column
    // is selected.
    def isAccessibleColumnSelected(c: Int): Boolean = ???

    @stub
    // Returns a boolean value indicating whether the specified row
    // is selected.
    def isAccessibleRowSelected(r: Int): Boolean = ???

    @stub
    // Returns a boolean value indicating whether the accessible at a
    // given (row, column) is selected.
    def isAccessibleSelected(r: Int, c: Int): Boolean = ???

    @stub
    // Track changes to selection model, column model, etc.
    def propertyChange(e: PropertyChangeEvent): Unit = ???

    @stub
    // Removes the specified child of the object from the object's
    // selection.
    def removeAccessibleSelection(i: Int): Unit = ???

    @stub
    // Causes every child of the object to be selected, but only
    // if the JTable supports multiple selections,
    // and if individual cell selection is enabled.
    def selectAllAccessibleSelection(): Unit = ???

    @stub
    // Sets the caption for the table.
    def setAccessibleCaption(a: Accessible): Unit = ???

    @stub
    // Sets the description text of the specified column of the table.
    def setAccessibleColumnDescription(c: Int, a: Accessible): Unit = ???

    @stub
    // Sets the column headers as an AccessibleTable.
    def setAccessibleColumnHeader(a: AccessibleTable): Unit = ???

    @stub
    // Sets the description text of the specified row of the table.
    def setAccessibleRowDescription(r: Int, a: Accessible): Unit = ???

    @stub
    // Sets the row headers as an AccessibleTable.
    def setAccessibleRowHeader(a: AccessibleTable): Unit = ???

    @stub
    // Sets the summary description of the table.
    def setAccessibleSummary(a: Accessible): Unit = ???

    @stub
    // Track changes to the table contents
    def tableChanged(e: TableModelEvent): Unit = ???

    @stub
    // Track changes to the table contents (row deletions)
    def tableRowsDeleted(e: TableModelEvent): Unit = ???

    @stub
    // Track changes to the table contents (row insertions)
    def tableRowsInserted(e: TableModelEvent): Unit = ???
}
