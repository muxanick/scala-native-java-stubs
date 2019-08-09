package javax.swing.table

import java.beans.PropertyChangeListener
import java.io.Serializable
import java.lang.{Object, String}

// A TableColumn represents all the attributes of a column in a
//  JTable, such as width, resizability, minimum and maximum width.
//  In addition, the TableColumn provides slots for a renderer and
//  an editor that can be used to display and edit the values in this column.
//  
//  It is also possible to specify renderers and editors on a per type basis
//  rather than a per column basis - see the
//  setDefaultRenderer method in the JTable class.
//  This default mechanism is only used when the renderer (or
//  editor) in the TableColumn is null.
// 
//  The TableColumn stores the link between the columns in the
//  JTable and the columns in the TableModel.
//  The modelIndex is the column in the
//  TableModel, which will be queried for the data values for the
//  cells in this column. As the column moves around in the view this
//  modelIndex does not change.
//  
// Note: Some implementations may assume that all
//    TableColumnModels are unique, therefore we would
//    recommend that the same TableColumn instance
//    not be added more than once to a TableColumnModel.
//    To show TableColumns with the same column of
//    data from the model, create a new instance with the same
//    modelIndex.
//  
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class TableColumn extends Object with Serializable {

    @stub
    // Cover method, using a default model index of 0,
    //  default width of 75, a null renderer and a
    //  null editor.
    def this() = ???

    @stub
    // Cover method, using a default width of 75, a null
    //  renderer and a null editor.
    def this(modelIndex: Int) = ???

    @stub
    // Cover method, using a null renderer and a
    //  null editor.
    def this(modelIndex: Int, width: Int) = ???

    @stub
    // The editor used to edit the data cells of the column.
    protected def cellEditor: TableCellEditor = ???

    @stub
    // The renderer used to draw the data cells of the column.
    protected def cellRenderer: TableCellRenderer = ???

    @stub
    // The renderer used to draw the header of the column.
    protected def headerRenderer: TableCellRenderer = ???

    @stub
    // The header value of the column.
    protected def headerValue: Object = ???

    @stub
    // This object is not used internally by the drawing machinery of
    //  the JTable; identifiers may be set in the
    //  TableColumn as as an
    //  optional way to tag and locate table columns.
    protected def identifier: Object = ???

    @stub
    // If true, the user is allowed to resize the column; the default is true.
    protected def isResizable: Boolean = ???

    @stub
    // The maximum width of the column.
    protected def maxWidth: Int = ???

    @stub
    // The minimum width of the column.
    protected def minWidth: Int = ???

    @stub
    // The index of the column in the model which is to be displayed by
    // this TableColumn.
    protected def modelIndex: Int = ???

    @stub
    // Deprecated. 
    //as of Java 2 platform v1.3
    //
    protected def resizedPostingDisableCount: Int = ???

    @stub
    // Adds a PropertyChangeListener to the listener list.
    def addPropertyChangeListener(listener: PropertyChangeListener): Unit = ???

    @stub
    // As of Java 2 platform v1.3, this method is not called by the TableColumn
    // constructor.
    protected def createDefaultHeaderRenderer(): TableCellRenderer = ???

    @stub
    // Deprecated. 
    //as of Java 2 platform v1.3
    //
    def disableResizedPosting(): Unit = ???

    @stub
    // Deprecated. 
    //as of Java 2 platform v1.3
    //
    def enableResizedPosting(): Unit = ???

    @stub
    // Returns the TableCellEditor used by the
    // JTable to edit values for this column.
    def getCellEditor(): TableCellEditor = ???

    @stub
    // Returns the TableCellRenderer used by the
    // JTable to draw
    // values for this column.
    def getCellRenderer(): TableCellRenderer = ???

    @stub
    // Returns the TableCellRenderer used to draw the header of the
    // TableColumn.
    def getHeaderRenderer(): TableCellRenderer = ???

    @stub
    // Returns the Object used as the value for the header
    // renderer.
    def getHeaderValue(): Object = ???

    @stub
    // Returns the identifier object for this column.
    def getIdentifier(): Object = ???

    @stub
    // Returns the maximum width for the TableColumn.
    def getMaxWidth(): Int = ???

    @stub
    // Returns the minimum width for the TableColumn.
    def getMinWidth(): Int = ???

    @stub
    // Returns the model index for this column.
    def getModelIndex(): Int = ???

    @stub
    // Returns the preferred width of the TableColumn.
    def getPreferredWidth(): Int = ???

    @stub
    // Returns an array of all the PropertyChangeListeners added
    // to this TableColumn with addPropertyChangeListener().
    def getPropertyChangeListeners(): Array[PropertyChangeListener] = ???

    @stub
    // Returns true if the user is allowed to resize the
    // TableColumn's
    // width, false otherwise.
    def getResizable(): Boolean = ???

    @stub
    // Returns the width of the TableColumn.
    def getWidth(): Int = ???

    @stub
    // Removes a PropertyChangeListener from the listener list.
    def removePropertyChangeListener(listener: PropertyChangeListener): Unit = ???

    @stub
    // Sets the editor to used by when a cell in this column is edited.
    def setCellEditor(cellEditor: TableCellEditor): Unit = ???

    @stub
    // Sets the TableCellRenderer used by JTable
    // to draw individual values for this column.
    def setCellRenderer(cellRenderer: TableCellRenderer): Unit = ???

    @stub
    // Sets the TableCellRenderer used to draw the
    // TableColumn's header to headerRenderer.
    def setHeaderRenderer(headerRenderer: TableCellRenderer): Unit = ???

    @stub
    // Sets the Object whose string representation will be
    // used as the value for the headerRenderer.
    def setHeaderValue(headerValue: Object): Unit = ???

    @stub
    // Sets the TableColumn's identifier to
    // anIdentifier.
    def setIdentifier(identifier: Object): Unit = ???

    @stub
    // Sets the TableColumn's maximum width to
    // maxWidth or,
    // if maxWidth is less than the minimum width,
    // to the minimum width.
    def setMaxWidth(maxWidth: Int): Unit = ???

    @stub
    // Sets the TableColumn's minimum width to
    // minWidth,
    // adjusting the new minimum width if necessary to ensure that
    // 0 <= minWidth <= maxWidth.
    def setMinWidth(minWidth: Int): Unit = ???

    @stub
    // Sets the model index for this column.
    def setModelIndex(modelIndex: Int): Unit = ???

    @stub
    // Sets this column's preferred width to preferredWidth.
    def setPreferredWidth(preferredWidth: Int): Unit = ???

    @stub
    // Sets whether this column can be resized.
    def setResizable(isResizable: Boolean): Unit = ???

    @stub
    // This method should not be used to set the widths of columns in the
    // JTable, use setPreferredWidth instead.
    def setWidth(width: Int): Unit = ???
}

object TableColumn {
    @stub
    // Obsolete as of Java 2 platform v1.3.
    def CELL_RENDERER_PROPERTY: String = ???

    @stub
    // Obsolete as of Java 2 platform v1.3.
    def COLUMN_WIDTH_PROPERTY: String = ???

    @stub
    // Obsolete as of Java 2 platform v1.3.
    def HEADER_RENDERER_PROPERTY: String = ???

    @stub
    // Obsolete as of Java 2 platform v1.3.
    def HEADER_VALUE_PROPERTY: String = ???
}
