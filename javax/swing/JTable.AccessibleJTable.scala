package javax.swing

import java.awt.{Component.AccessibleAWTComponent, Container.AccessibleAWTContainer, Point}
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import javax.accessibility.{Accessible, AccessibleContext, AccessibleExtendedTable, AccessibleRole, AccessibleSelection, AccessibleTable}
import javax.swing.event.{CellEditorListener, ChangeEvent, ListSelectionEvent, ListSelectionListener, TableColumnModelEvent, TableColumnModelListener, TableModelEvent, TableModelListener}
import scala.scalanative.annotation.stub

/** This class implements accessibility support for the
 *  JTable class.  It provides an implementation of the
 *  Java Accessibility API appropriate to table user-interface elements.
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
protected class JTable_AccessibleJTable extends JComponent.AccessibleJComponent with AccessibleSelection with ListSelectionListener with TableModelListener with TableColumnModelListener with CellEditorListener with PropertyChangeListener with AccessibleExtendedTable {

    /** AccessibleJTable constructor */
    @stub
    protected def AccessibleJTable() = ???

    /** The class provides an implementation of the Java Accessibility
     *  API appropriate to table cells.
     */
    protected type AccessibleJTableCell = JTable_AccessibleJTable_AccessibleJTableCell

    /**  */
    protected type AccessibleJTableModelChange = JTable_AccessibleJTable_AccessibleJTableModelChange

    /** Adds the specified Accessible child of the
     *  object to the object's selection.
     */
    @stub
    def addAccessibleSelection(i: Int): Unit = ???

    /** Clears the selection in the object, so that no children in the
     *  object are selected.
     */
    @stub
    def clearAccessibleSelection(): Unit = ???

    /** Track changes to the table contents (column insertions) */
    @stub
    def columnAdded(e: TableColumnModelEvent): Unit = ???

    /** Track changes of a column moving due to margin changes. */
    @stub
    def columnMarginChanged(e: ChangeEvent): Unit = ???

    /** Track changes of a column repositioning. */
    @stub
    def columnMoved(e: TableColumnModelEvent): Unit = ???

    /** Track changes to the table contents (column deletions) */
    @stub
    def columnRemoved(e: TableColumnModelEvent): Unit = ???

    /** Track that the selection model of the TableColumnModel changed. */
    @stub
    def columnSelectionChanged(e: ListSelectionEvent): Unit = ???

    /** Invoked when editing is canceled. */
    @stub
    def editingCanceled(e: ChangeEvent): Unit = ???

    /** Track changes to a cell's contents. */
    @stub
    def editingStopped(e: ChangeEvent): Unit = ???

    /** Returns the Accessible at a specified row and column
     *  in the table.
     */
    @stub
    def getAccessibleAt(r: Int, c: Int): Accessible = ???

    /** Returns the Accessible child, if one exists,
     *  contained at the local coordinate Point.
     */
    @stub
    def getAccessibleAt(p: Point): Accessible = ???

    /** Returns the caption for the table. */
    @stub
    def getAccessibleCaption(): Accessible = ???

    /** Returns the nth Accessible child of the object. */
    @stub
    def getAccessibleChild(i: Int): Accessible = ???

    /** Returns the number of accessible children in the object. */
    @stub
    def getAccessibleChildrenCount(): Int = ???

    /** Returns the column number of an index in the table. */
    @stub
    def getAccessibleColumn(index: Int): Int = ???

    /** Returns the column at a given index into the table. */
    @stub
    def getAccessibleColumnAtIndex(i: Int): Int = ???

    /** Returns the number of columns in the table. */
    @stub
    def getAccessibleColumnCount(): Int = ???

    /** Returns the description of the specified column in the table. */
    @stub
    def getAccessibleColumnDescription(c: Int): Accessible = ???

    /** Returns the number of columns occupied by the
     *  Accessible at a given (row, column).
     */
    @stub
    def getAccessibleColumnExtentAt(r: Int, c: Int): Int = ???

    /** Returns the column headers as an AccessibleTable. */
    @stub
    def getAccessibleColumnHeader(): AccessibleTable = ???

    /** Returns the index at a row and column in the table. */
    @stub
    def getAccessibleIndex(r: Int, c: Int): Int = ???

    /** Returns the index at a given (row, column) in the table. */
    @stub
    def getAccessibleIndexAt(r: Int, c: Int): Int = ???

    /** Gets the role of this object. */
    @stub
    def getAccessibleRole(): AccessibleRole = ???

    /** Returns the row number of an index in the table. */
    @stub
    def getAccessibleRow(index: Int): Int = ???

    /** Returns the row at a given index into the table. */
    @stub
    def getAccessibleRowAtIndex(i: Int): Int = ???

    /** Returns the number of rows in the table. */
    @stub
    def getAccessibleRowCount(): Int = ???

    /** Returns the description of the specified row in the table. */
    @stub
    def getAccessibleRowDescription(r: Int): Accessible = ???

    /** Returns the number of rows occupied by the Accessible
     *  at a specified row and column in the table.
     */
    @stub
    def getAccessibleRowExtentAt(r: Int, c: Int): Int = ???

    /** Returns the row headers as an AccessibleTable. */
    @stub
    def getAccessibleRowHeader(): AccessibleTable = ???

    /** Get the AccessibleSelection associated with this object. */
    @stub
    def getAccessibleSelection(): AccessibleSelection = ???

    /** Returns an Accessible representing the
     *  specified selected child in the object.
     */
    @stub
    def getAccessibleSelection(i: Int): Accessible = ???

    /** Returns the number of Accessible children
     *  currently selected.
     */
    @stub
    def getAccessibleSelectionCount(): Int = ???

    /** Returns the summary description of the table. */
    @stub
    def getAccessibleSummary(): Accessible = ???

    /** Gets the AccessibleTable associated with this
     *  object.
     */
    @stub
    def getAccessibleTable(): AccessibleTable = ???

    /** Returns the selected columns in a table. */
    @stub
    def getSelectedAccessibleColumns(): Array[Int] = ???

    /** Returns the selected rows in a table. */
    @stub
    def getSelectedAccessibleRows(): Array[Int] = ???

    /** Determines if the current child of this object is selected. */
    @stub
    def isAccessibleChildSelected(i: Int): Boolean = ???

    /** Returns a boolean value indicating whether the specified column
     *  is selected.
     */
    @stub
    def isAccessibleColumnSelected(c: Int): Boolean = ???

    /** Returns a boolean value indicating whether the specified row
     *  is selected.
     */
    @stub
    def isAccessibleRowSelected(r: Int): Boolean = ???

    /** Returns a boolean value indicating whether the accessible at a
     *  given (row, column) is selected.
     */
    @stub
    def isAccessibleSelected(r: Int, c: Int): Boolean = ???

    /** Track changes to selection model, column model, etc. */
    @stub
    def propertyChange(e: PropertyChangeEvent): Unit = ???

    /** Removes the specified child of the object from the object's
     *  selection.
     */
    @stub
    def removeAccessibleSelection(i: Int): Unit = ???

    /** Causes every child of the object to be selected, but only
     *  if the JTable supports multiple selections,
     *  and if individual cell selection is enabled.
     */
    @stub
    def selectAllAccessibleSelection(): Unit = ???

    /** Sets the caption for the table. */
    @stub
    def setAccessibleCaption(a: Accessible): Unit = ???

    /** Sets the description text of the specified column of the table. */
    @stub
    def setAccessibleColumnDescription(c: Int, a: Accessible): Unit = ???

    /** Sets the column headers as an AccessibleTable. */
    @stub
    def setAccessibleColumnHeader(a: AccessibleTable): Unit = ???

    /** Sets the description text of the specified row of the table. */
    @stub
    def setAccessibleRowDescription(r: Int, a: Accessible): Unit = ???

    /** Sets the row headers as an AccessibleTable. */
    @stub
    def setAccessibleRowHeader(a: AccessibleTable): Unit = ???

    /** Sets the summary description of the table. */
    @stub
    def setAccessibleSummary(a: Accessible): Unit = ???

    /** Track changes to the table contents */
    @stub
    def tableChanged(e: TableModelEvent): Unit = ???

    /** Track changes to the table contents (row deletions) */
    @stub
    def tableRowsDeleted(e: TableModelEvent): Unit = ???

    /** Track changes to the table contents (row insertions) */
    @stub
    def tableRowsInserted(e: TableModelEvent): Unit = ???

    /** Track changes to table cell selections */
    @stub
    def valueChanged(e: ListSelectionEvent): Unit = ???
}
