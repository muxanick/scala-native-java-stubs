package javax.swing.table

import java.awt.{Component, Container, Point, Rectangle}
import java.awt.event.MouseEvent
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext}
import javax.swing.{JComponent, JTable}
import javax.swing.event.{ChangeEvent, ListSelectionEvent, TableColumnModelEvent, TableColumnModelListener}
import javax.swing.plaf.TableHeaderUI

// This is the object which manages the header of the JTable.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class JTableHeader extends JComponent with TableColumnModelListener, with Accessible {

    @stub
    // Constructs a JTableHeader with a default
    //  TableColumnModel.
    def this() = ???

    @stub
    // The TableColumnModel of the table header.
    protected def columnModel: TableColumnModel = ???

    @stub
    // The index of the column being dragged.
    protected def draggedColumn: TableColumn = ???

    @stub
    // The distance from its original position the column has been dragged.
    protected def draggedDistance: Int = ???

    @stub
    // If true, reordering of columns are allowed by the user;
    // the default is true.
    protected def reorderingAllowed: Boolean = ???

    @stub
    // If true, resizing of columns are allowed by the user;
    // the default is true.
    protected def resizingAllowed: Boolean = ???

    @stub
    // The index of the column being resized.
    protected def resizingColumn: TableColumn = ???

    @stub
    // The table for which this object is the header;
    // the default is null.
    protected def table: JTable = ???

    @stub
    // Invoked when a column is added to the table column model.
    def columnAdded(e: TableColumnModelEvent): Unit = ???

    @stub
    // Returns the index of the column that point lies in, or -1 if it
    // lies out of bounds.
    def columnAtPoint(point: Point): Int = ???

    @stub
    // Invoked when a column is moved due to a margin change.
    def columnMarginChanged(e: ChangeEvent): Unit = ???

    @stub
    // Invoked when a column is repositioned.
    def columnMoved(e: TableColumnModelEvent): Unit = ???

    @stub
    // Invoked when a column is removed from the table column model.
    def columnRemoved(e: TableColumnModelEvent): Unit = ???

    @stub
    // Invoked when the selection model of the TableColumnModel
    // is changed.
    def columnSelectionChanged(e: ListSelectionEvent): Unit = ???

    @stub
    // Returns the default column model object which is
    //  a DefaultTableColumnModel.
    protected def createDefaultColumnModel(): TableColumnModel = ???

    @stub
    // Returns a default renderer to be used when no header renderer
    //  is defined by a TableColumn.
    protected def createDefaultRenderer(): TableCellRenderer = ???

    @stub
    // Gets the AccessibleContext associated with this JTableHeader.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Returns the TableColumnModel that contains all column information
    // of this table header.
    def getColumnModel(): TableColumnModel = ???

    @stub
    // Returns the default renderer used when no headerRenderer
    // is defined by a TableColumn.
    def getDefaultRenderer(): TableCellRenderer = ???

    @stub
    // Returns the the dragged column, if and only if, a drag is in
    // process, otherwise returns null.
    def getDraggedColumn(): TableColumn = ???

    @stub
    // Returns the column's horizontal distance from its original
    // position, if and only if, a drag is in process.
    def getDraggedDistance(): Int = ???

    @stub
    // Returns the rectangle containing the header tile at column.
    def getHeaderRect(column: Int): Rectangle = ???

    @stub
    // Returns true if the user is allowed to rearrange columns by
    // dragging their headers, false otherwise.
    def getReorderingAllowed(): Boolean = ???

    @stub
    // Returns true if the user is allowed to resize columns by dragging
    // between their headers, false otherwise.
    def getResizingAllowed(): Boolean = ???

    @stub
    // Returns the resizing column.
    def getResizingColumn(): TableColumn = ???

    @stub
    // Returns the table associated with this header.
    def getTable(): JTable = ???

    @stub
    // Allows the renderer's tips to be used if there is text set.
    def getToolTipText(event: MouseEvent): String = ???

    @stub
    // Returns the look and feel (L&F) object that renders this component.
    def getUI(): TableHeaderUI = ???

    @stub
    // Returns the suffix used to construct the name of the look and feel
    // (L&F) class used to render this component.
    def getUIClassID(): String = ???

    @stub
    // Obsolete as of Java 2 platform v1.3.
    def getUpdateTableInRealTime(): Boolean = ???

    @stub
    // Initializes the local variables and properties with default values.
    protected def initializeLocalVars(): Unit = ???

    @stub
    // Returns a string representation of this JTableHeader.
    protected def paramString(): String = ???

    @stub
    // Sizes the header and marks it as needing display.
    def resizeAndRepaint(): Unit = ???

    @stub
    // Sets the column model for this table to newModel and registers
    //  for listener notifications from the new column model.
    def setColumnModel(columnModel: TableColumnModel): Unit = ???

    @stub
    // Sets the default renderer to be used when no headerRenderer
    // is defined by a TableColumn.
    def setDefaultRenderer(defaultRenderer: TableCellRenderer): Unit = ???

    @stub
    // Sets the header's draggedColumn to aColumn.
    def setDraggedColumn(aColumn: TableColumn): Unit = ???

    @stub
    // Sets the header's draggedDistance to distance.
    def setDraggedDistance(distance: Int): Unit = ???

    @stub
    // Sets whether the user can drag column headers to reorder columns.
    def setReorderingAllowed(reorderingAllowed: Boolean): Unit = ???

    @stub
    // Sets whether the user can resize columns by dragging between headers.
    def setResizingAllowed(resizingAllowed: Boolean): Unit = ???

    @stub
    // Sets the header's resizingColumn to aColumn.
    def setResizingColumn(aColumn: TableColumn): Unit = ???

    @stub
    // Sets the table associated with this header.
    def setTable(table: JTable): Unit = ???

    @stub
    // Sets the look and feel (L&F) object that renders this component.
    def setUI(ui: TableHeaderUI): Unit = ???

    @stub
    // Obsolete as of Java 2 platform v1.3.
    def setUpdateTableInRealTime(flag: Boolean): Unit = ???
}
