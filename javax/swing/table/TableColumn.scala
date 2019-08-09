package javax.swing.table

import java.beans.PropertyChangeListener
import java.io.Serializable
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** A TableColumn represents all the attributes of a column in a
 *   JTable, such as width, resizability, minimum and maximum width.
 *   In addition, the TableColumn provides slots for a renderer and
 *   an editor that can be used to display and edit the values in this column.
 *   
 *   It is also possible to specify renderers and editors on a per type basis
 *   rather than a per column basis - see the
 *   setDefaultRenderer method in the JTable class.
 *   This default mechanism is only used when the renderer (or
 *   editor) in the TableColumn is null.
 *  
 *   The TableColumn stores the link between the columns in the
 *   JTable and the columns in the TableModel.
 *   The modelIndex is the column in the
 *   TableModel, which will be queried for the data values for the
 *   cells in this column. As the column moves around in the view this
 *   modelIndex does not change.
 *   
 *  Note: Some implementations may assume that all
 *     TableColumnModels are unique, therefore we would
 *     recommend that the same TableColumn instance
 *     not be added more than once to a TableColumnModel.
 *     To show TableColumns with the same column of
 *     data from the model, create a new instance with the same
 *     modelIndex.
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
class TableColumn extends Object with Serializable {

    /** Cover method, using a default model index of 0,
     *   default width of 75, a null renderer and a
     *   null editor.
     */
    @stub
    def this() = ???

    /** Cover method, using a default width of 75, a null
     *   renderer and a null editor.
     */
    @stub
    def this(modelIndex: Int) = ???

    /** Cover method, using a null renderer and a
     *   null editor.
     */
    @stub
    def this(modelIndex: Int, width: Int) = ???

    /** Creates and initializes an instance of
     *   TableColumn with the specified model index,
     *   width, cell renderer, and cell editor;
     *   all TableColumn constructors delegate to this one.
     */
    @stub
    def this(modelIndex: Int, width: Int, cellRenderer: TableCellRenderer, cellEditor: TableCellEditor) = ???

    /** The editor used to edit the data cells of the column. */
    @stub
    protected val cellEditor: TableCellEditor = ???

    /** The renderer used to draw the data cells of the column. */
    @stub
    protected val cellRenderer: TableCellRenderer = ???

    /** The renderer used to draw the header of the column. */
    @stub
    protected val headerRenderer: TableCellRenderer = ???

    /** The header value of the column. */
    @stub
    protected val headerValue: Object = ???

    /** This object is not used internally by the drawing machinery of
     *   the JTable; identifiers may be set in the
     *   TableColumn as as an
     *   optional way to tag and locate table columns.
     */
    @stub
    protected val identifier: Object = ???

    /** If true, the user is allowed to resize the column; the default is true. */
    @stub
    protected val isResizable: Boolean = ???

    /** The maximum width of the column. */
    @stub
    protected val maxWidth: Int = ???

    /** The minimum width of the column. */
    @stub
    protected val minWidth: Int = ???

    /** The index of the column in the model which is to be displayed by
     *  this TableColumn.
     */
    @stub
    protected val modelIndex: Int = ???

    /** Deprecated. 
     * as of Java 2 platform v1.3
     * 
     */
    @stub
    protected val resizedPostingDisableCount: Int = ???

    /** The width of the column. */
    @stub
    protected val width: Int = ???

    /** Adds a PropertyChangeListener to the listener list. */
    @stub
    def addPropertyChangeListener(listener: PropertyChangeListener): Unit = ???

    /** As of Java 2 platform v1.3, this method is not called by the TableColumn
     *  constructor.
     */
    @stub
    protected def createDefaultHeaderRenderer(): TableCellRenderer = ???

    /** Deprecated. 
     * as of Java 2 platform v1.3
     * 
     */
    @stub
    def disableResizedPosting(): Unit = ???

    /** Deprecated. 
     * as of Java 2 platform v1.3
     * 
     */
    @stub
    def enableResizedPosting(): Unit = ???

    /** Returns the TableCellEditor used by the
     *  JTable to edit values for this column.
     */
    @stub
    def getCellEditor(): TableCellEditor = ???

    /** Returns the TableCellRenderer used by the
     *  JTable to draw
     *  values for this column.
     */
    @stub
    def getCellRenderer(): TableCellRenderer = ???

    /** Returns the TableCellRenderer used to draw the header of the
     *  TableColumn.
     */
    @stub
    def getHeaderRenderer(): TableCellRenderer = ???

    /** Returns the Object used as the value for the header
     *  renderer.
     */
    @stub
    def getHeaderValue(): Object = ???

    /** Returns the identifier object for this column. */
    @stub
    def getIdentifier(): Object = ???

    /** Returns the maximum width for the TableColumn. */
    @stub
    def getMaxWidth(): Int = ???

    /** Returns the minimum width for the TableColumn. */
    @stub
    def getMinWidth(): Int = ???

    /** Returns the model index for this column. */
    @stub
    def getModelIndex(): Int = ???

    /** Returns the preferred width of the TableColumn. */
    @stub
    def getPreferredWidth(): Int = ???

    /** Returns an array of all the PropertyChangeListeners added
     *  to this TableColumn with addPropertyChangeListener().
     */
    @stub
    def getPropertyChangeListeners(): Array[PropertyChangeListener] = ???

    /** Returns true if the user is allowed to resize the
     *  TableColumn's
     *  width, false otherwise.
     */
    @stub
    def getResizable(): Boolean = ???

    /** Returns the width of the TableColumn. */
    @stub
    def getWidth(): Int = ???

    /** Removes a PropertyChangeListener from the listener list. */
    @stub
    def removePropertyChangeListener(listener: PropertyChangeListener): Unit = ???

    /** Sets the editor to used by when a cell in this column is edited. */
    @stub
    def setCellEditor(cellEditor: TableCellEditor): Unit = ???

    /** Sets the TableCellRenderer used by JTable
     *  to draw individual values for this column.
     */
    @stub
    def setCellRenderer(cellRenderer: TableCellRenderer): Unit = ???

    /** Sets the TableCellRenderer used to draw the
     *  TableColumn's header to headerRenderer.
     */
    @stub
    def setHeaderRenderer(headerRenderer: TableCellRenderer): Unit = ???

    /** Sets the Object whose string representation will be
     *  used as the value for the headerRenderer.
     */
    @stub
    def setHeaderValue(headerValue: Object): Unit = ???

    /** Sets the TableColumn's identifier to
     *  anIdentifier.
     */
    @stub
    def setIdentifier(identifier: Object): Unit = ???

    /** Sets the TableColumn's maximum width to
     *  maxWidth or,
     *  if maxWidth is less than the minimum width,
     *  to the minimum width.
     */
    @stub
    def setMaxWidth(maxWidth: Int): Unit = ???

    /** Sets the TableColumn's minimum width to
     *  minWidth,
     *  adjusting the new minimum width if necessary to ensure that
     *  0 <= minWidth <= maxWidth.
     */
    @stub
    def setMinWidth(minWidth: Int): Unit = ???

    /** Sets the model index for this column. */
    @stub
    def setModelIndex(modelIndex: Int): Unit = ???

    /** Sets this column's preferred width to preferredWidth. */
    @stub
    def setPreferredWidth(preferredWidth: Int): Unit = ???

    /** Sets whether this column can be resized. */
    @stub
    def setResizable(isResizable: Boolean): Unit = ???

    /** This method should not be used to set the widths of columns in the
     *  JTable, use setPreferredWidth instead.
     */
    @stub
    def setWidth(width: Int): Unit = ???

    /** Resizes the TableColumn to fit the width of its header cell. */
    @stub
    def sizeWidthToFit(): Unit = ???
}

object TableColumn {
    /** Obsolete as of Java 2 platform v1.3. */
    @stub
    val CELL_RENDERER_PROPERTY: String = ???

    /** Obsolete as of Java 2 platform v1.3. */
    @stub
    val COLUMN_WIDTH_PROPERTY: String = ???

    /** Obsolete as of Java 2 platform v1.3. */
    @stub
    val HEADER_RENDERER_PROPERTY: String = ???

    /** Obsolete as of Java 2 platform v1.3. */
    @stub
    val HEADER_VALUE_PROPERTY: String = ???
}
