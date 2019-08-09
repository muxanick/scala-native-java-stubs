package javax.swing

import java.awt.{Color, Component, Container, Dimension, Point, Rectangle}
import java.awt.event.{KeyEvent, MouseEvent}
import java.awt.print.Printable
import java.lang.{Class, Object, String}
import java.text.MessageFormat
import java.util.{EventObject, Hashtable}
import javax.accessibility.{Accessible, AccessibleContext}
import javax.print.PrintService
import javax.print.attribute.PrintRequestAttributeSet
import javax.swing.event.{CellEditorListener, ChangeEvent, ListSelectionEvent, ListSelectionListener, RowSorterEvent, RowSorterListener, TableColumnModelEvent, TableColumnModelListener, TableModelEvent, TableModelListener}
import javax.swing.plaf.TableUI
import javax.swing.table.{JTableHeader, TableCellEditor, TableCellRenderer, TableColumn, TableColumnModel, TableModel}

// The JTable is used to display and edit regular two-dimensional tables
// of cells.
// See How to Use Tables
// in The Java Tutorial
// for task-oriented documentation and examples of using JTable.
//
// 
// The JTable has many
// facilities that make it possible to customize its rendering and editing
// but provides defaults for these features so that simple tables can be
// set up easily.  For example, to set up a table with 10 rows and 10
// columns of numbers:
//
// 
//      TableModel dataModel = new AbstractTableModel() {
//          public int getColumnCount() { return 10; }
//          public int getRowCount() { return 10;}
//          public Object getValueAt(int row, int col) { return new Integer(row*col); }
//      };
//      JTable table = new JTable(dataModel);
//      JScrollPane scrollpane = new JScrollPane(table);
// 
// 
// JTables are typically placed inside of a JScrollPane.  By
// default, a JTable will adjust its width such that
// a horizontal scrollbar is unnecessary.  To allow for a horizontal scrollbar,
// invoke setAutoResizeMode(int) with AUTO_RESIZE_OFF.
// Note that if you wish to use a JTable in a standalone
// view (outside of a JScrollPane) and want the header
// displayed, you can get it using getTableHeader() and
// display it separately.
// 
// To enable sorting and filtering of rows, use a
// RowSorter.
// You can set up a row sorter in either of two ways:
// 
//   Directly set the RowSorter. For example:
//        table.setRowSorter(new TableRowSorter(model)).
//   Set the autoCreateRowSorter
//       property to true, so that the JTable
//       creates a RowSorter for
//       you. For example: setAutoCreateRowSorter(true).
// 
// 
// When designing applications that use the JTable it is worth paying
// close attention to the data structures that will represent the table's data.
// The DefaultTableModel is a model implementation that
// uses a Vector of Vectors of Objects to
// store the cell values. As well as copying the data from an
// application into the DefaultTableModel,
// it is also possible to wrap the data in the methods of the
// TableModel interface so that the data can be passed to the
// JTable directly, as in the example above. This often results
// in more efficient applications because the model is free to choose the
// internal representation that best suits the data.
// A good rule of thumb for deciding whether to use the AbstractTableModel
// or the DefaultTableModel is to use the AbstractTableModel
// as the base class for creating subclasses and the DefaultTableModel
// when subclassing is not required.
// 
// The "TableExample" directory in the demo area of the source distribution
// gives a number of complete examples of JTable usage,
// covering how the JTable can be used to provide an
// editable view of data taken from a database and how to modify
// the columns in the display to use specialized renderers and editors.
// 
// The JTable uses integers exclusively to refer to both the rows and the columns
// of the model that it displays. The JTable simply takes a tabular range of cells
// and uses getValueAt(int, int) to retrieve the
// values from the model during painting.  It is important to remember that
// the column and row indexes returned by various JTable methods
// are in terms of the JTable (the view) and are not
// necessarily the same indexes used by the model.
// 
// By default, columns may be rearranged in the JTable so that the
// view's columns appear in a different order to the columns in the model.
// This does not affect the implementation of the model at all: when the
// columns are reordered, the JTable maintains the new order of the columns
// internally and converts its column indices before querying the model.
// 
// So, when writing a TableModel, it is not necessary to listen for column
// reordering events as the model will be queried in its own coordinate
// system regardless of what is happening in the view.
// In the examples area there is a demonstration of a sorting algorithm making
// use of exactly this technique to interpose yet another coordinate system
// where the order of the rows is changed, rather than the order of the columns.
// 
// Similarly when using the sorting and filtering functionality
// provided by RowSorter the underlying
// TableModel does not need to know how to do sorting,
// rather RowSorter will handle it.  Coordinate
// conversions will be necessary when using the row based methods of
// JTable with the underlying TableModel.
// All of JTables row based methods are in terms of the
// RowSorter, which is not necessarily the same as that
// of the underlying TableModel.  For example, the
// selection is always in terms of JTable so that when
// using RowSorter you will need to convert using
// convertRowIndexToView or
// convertRowIndexToModel.  The following shows how to
// convert coordinates from JTable to that of the
// underlying model:
// 
//   int[] selection = table.getSelectedRows();
//   for (int i = 0; i < selection.length; i++) {
//     selection[i] = table.convertRowIndexToModel(selection[i]);
//   }
//   // selection is now in terms of the underlying TableModel
// 
// 
// By default if sorting is enabled JTable will persist the
// selection and variable row heights in terms of the model on
// sorting.  For example if row 0, in terms of the underlying model,
// is currently selected, after the sort row 0, in terms of the
// underlying model will be selected.  Visually the selection may
// change, but in terms of the underlying model it will remain the
// same.  The one exception to that is if the model index is no longer
// visible or was removed.  For example, if row 0 in terms of model
// was filtered out the selection will be empty after the sort.
// 
// J2SE 5 adds methods to JTable to provide convenient access to some
// common printing needs. Simple new print() methods allow for quick
// and easy addition of printing support to your application. In addition, a new
// getPrintable(javax.swing.JTable.PrintMode, java.text.MessageFormat, java.text.MessageFormat) method is available for more advanced printing needs.
// 
// As for all JComponent classes, you can use
// InputMap and ActionMap to associate an
// Action object with a KeyStroke and execute the
// action under specified conditions.
// 
// Warning: Swing is not thread safe. For more
// information see Swing's Threading
// Policy.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class JTable extends JComponent with TableModelListener, with Scrollable, with TableColumnModelListener, with ListSelectionListener, with CellEditorListener, with Accessible, with RowSorterListener {

    @stub
    // Constructs a default JTable that is initialized with a default
    // data model, a default column model, and a default selection
    // model.
    def this() = ???

    @stub
    // Constructs a JTable with numRows
    // and numColumns of empty cells using
    // DefaultTableModel.
    def this(numRows: Int, numColumns: Int) = ???

    @stub
    // Constructs a JTable to display the values in the two dimensional array,
    // rowData, with column names, columnNames.
    def this(rowData: Array[Array[Object]], columnNames: Array[Object]) = ???

    @stub
    // Constructs a JTable that is initialized with
    // dm as the data model, a default column model,
    // and a default selection model.
    def this(dm: TableModel) = ???

    @stub
    // Constructs a JTable that is initialized with
    // dm as the data model, cm
    // as the column model, and a default selection model.
    def this(dm: TableModel, cm: TableColumnModel) = ???

    @stub
    // Constructs a JTable that is initialized with
    // dm as the data model, cm as the
    // column model, and sm as the selection model.
    def this(dm: TableModel, cm: TableColumnModel, sm: ListSelectionModel) = ???

    @stub
    // This class implements accessibility support for the
    // JTable class.
    protected def JTable.AccessibleJTable: class = ???

    @stub
    // The table will query the TableModel to build the default
    //  set of columns if this is true.
    protected def autoCreateColumnsFromModel: Boolean = ???

    @stub
    // Determines if the table automatically resizes the
    //  width of the table's columns to take up the entire width of the
    //  table, and how it does the resizing.
    protected def autoResizeMode: Int = ???

    @stub
    // The active cell editor object, that overwrites the screen real estate
    // occupied by the current cell and allows the user to change its contents.
    protected def cellEditor: TableCellEditor = ???

    @stub
    // Obsolete as of Java 2 platform v1.3.
    protected def cellSelectionEnabled: Boolean = ???

    @stub
    // The TableColumnModel of the table.
    protected def columnModel: TableColumnModel = ???

    @stub
    // The TableModel of the table.
    protected def dataModel: TableModel = ???

    @stub
    // A table of objects that display and edit the contents of a cell,
    // indexed by class as declared in getColumnClass
    // in the TableModel interface.
    protected def defaultEditorsByColumnClass: Hashtable = ???

    @stub
    // A table of objects that display the contents of a cell,
    // indexed by class as declared in getColumnClass
    // in the TableModel interface.
    protected def defaultRenderersByColumnClass: Hashtable = ???

    @stub
    // Identifies the column of the cell being edited.
    protected def editingColumn: Int = ???

    @stub
    // Identifies the row of the cell being edited.
    protected def editingRow: Int = ???

    @stub
    // If editing, the Component that is handling the editing.
    protected def editorComp: Component = ???

    @stub
    // The color of the grid.
    protected def gridColor: Color = ???

    @stub
    // Used by the Scrollable interface to determine the initial visible area.
    protected def preferredViewportSize: Dimension = ???

    @stub
    // The height in pixels of each row in the table.
    protected def rowHeight: Int = ???

    @stub
    // The height in pixels of the margin between the cells in each row.
    protected def rowMargin: Int = ???

    @stub
    // True if row selection is allowed in this table.
    protected def rowSelectionAllowed: Boolean = ???

    @stub
    // The background color of selected cells.
    protected def selectionBackground: Color = ???

    @stub
    // The foreground color of selected cells.
    protected def selectionForeground: Color = ???

    @stub
    // The ListSelectionModel of the table, used to keep track of row selections.
    protected def selectionModel: ListSelectionModel = ???

    @stub
    // The table draws horizontal lines between cells if showHorizontalLines is true.
    protected def showHorizontalLines: Boolean = ???

    @stub
    // The table draws vertical lines between cells if showVerticalLines is true.
    protected def showVerticalLines: Boolean = ???

    @stub
    // Appends aColumn to the end of the array of columns held by
    //  this JTable's column model.
    def addColumn(aColumn: TableColumn): Unit = ???

    @stub
    // Adds the columns from index0 to index1,
    // inclusive, to the current selection.
    def addColumnSelectionInterval(index0: Int, index1: Int): Unit = ???

    @stub
    // Calls the configureEnclosingScrollPane method.
    def addNotify(): Unit = ???

    @stub
    // Adds the rows from index0 to index1, inclusive, to
    // the current selection.
    def addRowSelectionInterval(index0: Int, index1: Int): Unit = ???

    @stub
    // Updates the selection models of the table, depending on the state of the
    // two flags: toggle and extend.
    def changeSelection(rowIndex: Int, columnIndex: Int, toggle: Boolean, extend: Boolean): Unit = ???

    @stub
    // Deselects all selected columns and rows.
    def clearSelection(): Unit = ???

    @stub
    // Invoked when a column is added to the table column model.
    def columnAdded(e: TableColumnModelEvent): Unit = ???

    @stub
    // Returns the index of the column that point lies in,
    // or -1 if the result is not in the range
    // [0, getColumnCount()-1].
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
    // If this JTable is the viewportView of an enclosing JScrollPane
    // (the usual situation), configure this ScrollPane by, amongst other things,
    // installing the table's tableHeader as the columnHeaderView of the scroll pane.
    protected def configureEnclosingScrollPane(): Unit = ???

    @stub
    // Maps the index of the column in the view at
    // viewColumnIndex to the index of the column
    // in the table model.
    def convertColumnIndexToModel(viewColumnIndex: Int): Int = ???

    @stub
    // Maps the index of the column in the table model at
    // modelColumnIndex to the index of the column
    // in the view.
    def convertColumnIndexToView(modelColumnIndex: Int): Int = ???

    @stub
    // Maps the index of the row in terms of the view to the
    // underlying TableModel.
    def convertRowIndexToModel(viewRowIndex: Int): Int = ???

    @stub
    // Maps the index of the row in terms of the
    // TableModel to the view.
    def convertRowIndexToView(modelRowIndex: Int): Int = ???

    @stub
    // Returns the default column model object, which is
    // a DefaultTableColumnModel.
    protected def createDefaultColumnModel(): TableColumnModel = ???

    @stub
    // Creates default columns for the table from
    // the data model using the getColumnCount method
    // defined in the TableModel interface.
    def createDefaultColumnsFromModel(): Unit = ???

    @stub
    // Returns the default table model object, which is
    // a DefaultTableModel.
    protected def createDefaultDataModel(): TableModel = ???

    @stub
    // Creates default cell editors for objects, numbers, and boolean values.
    protected def createDefaultEditors(): Unit = ???

    @stub
    // Creates default cell renderers for objects, numbers, doubles, dates,
    // booleans, and icons.
    protected def createDefaultRenderers(): Unit = ???

    @stub
    // Returns the default selection model object, which is
    // a DefaultListSelectionModel.
    protected def createDefaultSelectionModel(): ListSelectionModel = ???

    @stub
    // Returns the default table header object, which is
    // a JTableHeader.
    protected def createDefaultTableHeader(): JTableHeader = ???

    @stub
    // Causes this table to lay out its rows and columns.
    def doLayout(): Unit = ???

    @stub
    // Programmatically starts editing the cell at row and
    // column, if those indices are in the valid range, and
    // the cell at those indices is editable.
    def editCellAt(row: Int, column: Int): Boolean = ???

    @stub
    // Programmatically starts editing the cell at row and
    // column, if those indices are in the valid range, and
    // the cell at those indices is editable.
    def editCellAt(row: Int, column: Int, e: EventObject): Boolean = ???

    @stub
    // Invoked when editing is canceled.
    def editingCanceled(e: ChangeEvent): Unit = ???

    @stub
    // Invoked when editing is finished.
    def editingStopped(e: ChangeEvent): Unit = ???

    @stub
    // Gets the AccessibleContext associated with this JTable.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Determines whether the table will create default columns from the model.
    def getAutoCreateColumnsFromModel(): Boolean = ???

    @stub
    // Returns true if whenever the model changes, a new
    // RowSorter should be created and installed
    // as the table's sorter; otherwise, returns false.
    def getAutoCreateRowSorter(): Boolean = ???

    @stub
    // Returns the auto resize mode of the table.
    def getAutoResizeMode(): Int = ???

    @stub
    // Returns the active cell editor, which is null if the table
    // is not currently editing.
    def getCellEditor(): TableCellEditor = ???

    @stub
    // Returns an appropriate editor for the cell specified by
    // row and column.
    def getCellEditor(row: Int, column: Int): TableCellEditor = ???

    @stub
    // Returns a rectangle for the cell that lies at the intersection of
    // row and column.
    def getCellRect(row: Int, column: Int, includeSpacing: Boolean): Rectangle = ???

    @stub
    // Returns an appropriate renderer for the cell specified by this row and
    // column.
    def getCellRenderer(row: Int, column: Int): TableCellRenderer = ???

    @stub
    // Returns true if both row and column selection models are enabled.
    def getCellSelectionEnabled(): Boolean = ???

    @stub
    // Returns the TableColumn object for the column in the table
    // whose identifier is equal to identifier, when compared using
    // equals.
    def getColumn(identifier: Object): TableColumn = ???

    @stub
    // Returns the type of the column appearing in the view at
    // column position column.
    def getColumnClass(column: Int): Class[_] = ???

    @stub
    // Returns the number of columns in the column model.
    def getColumnCount(): Int = ???

    @stub
    // Returns the TableColumnModel that contains all column information
    // of this table.
    def getColumnModel(): TableColumnModel = ???

    @stub
    // Returns the name of the column appearing in the view at
    // column position column.
    def getColumnName(column: Int): String = ???

    @stub
    // Returns true if columns can be selected.
    def getColumnSelectionAllowed(): Boolean = ???

    @stub
    // Returns the editor to be used when no editor has been set in
    // a TableColumn.
    def getDefaultEditor(columnClass: Class[_]): TableCellEditor = ???

    @stub
    // Returns the cell renderer to be used when no renderer has been set in
    // a TableColumn.
    def getDefaultRenderer(columnClass: Class[_]): TableCellRenderer = ???

    @stub
    // Returns whether or not automatic drag handling is enabled.
    def getDragEnabled(): Boolean = ???

    @stub
    // Returns the location that this component should visually indicate
    // as the drop location during a DnD operation over the component,
    // or null if no location is to currently be shown.
    def getDropLocation(): JTable.DropLocation = ???

    @stub
    // Returns the drop mode for this component.
    def getDropMode(): DropMode = ???

    @stub
    // Returns the index of the column that contains the cell currently
    // being edited.
    def getEditingColumn(): Int = ???

    @stub
    // Returns the index of the row that contains the cell currently
    // being edited.
    def getEditingRow(): Int = ???

    @stub
    // Returns the component that is handling the editing session.
    def getEditorComponent(): Component = ???

    @stub
    // Returns whether or not this table is always made large enough
    // to fill the height of an enclosing viewport.
    def getFillsViewportHeight(): Boolean = ???

    @stub
    // Returns the color used to draw grid lines.
    def getGridColor(): Color = ???

    @stub
    // Returns the horizontal and vertical space between cells.
    def getIntercellSpacing(): Dimension = ???

    @stub
    // Returns the TableModel that provides the data displayed by this
    // JTable.
    def getModel(): TableModel = ???

    @stub
    // Returns the preferred size of the viewport for this table.
    def getPreferredScrollableViewportSize(): Dimension = ???

    @stub
    // Return a Printable for use in printing this JTable.
    def getPrintable(printMode: JTable.PrintMode, headerFormat: MessageFormat, footerFormat: MessageFormat): Printable = ???

    @stub
    // Returns the number of rows that can be shown in the
    // JTable, given unlimited space.
    def getRowCount(): Int = ???

    @stub
    // Returns the height of a table row, in pixels.
    def getRowHeight(): Int = ???

    @stub
    // Returns the height, in pixels, of the cells in row.
    def getRowHeight(row: Int): Int = ???

    @stub
    // Gets the amount of empty space, in pixels, between cells.
    def getRowMargin(): Int = ???

    @stub
    // Returns true if rows can be selected.
    def getRowSelectionAllowed(): Boolean = ???

    @stub
    // Returns the object responsible for sorting.
    def getRowSorter(): RowSorter[_ <: TableModel] = ???

    @stub
    // Returns visibleRect.height or
    // visibleRect.width,
    // depending on this table's orientation.
    def getScrollableBlockIncrement(visibleRect: Rectangle, orientation: Int, direction: Int): Int = ???

    @stub
    // Returns false to indicate that the height of the viewport does
    // not determine the height of the table, unless
    // getFillsViewportHeight is true and the preferred height
    // of the table is smaller than the viewport's height.
    def getScrollableTracksViewportHeight(): Boolean = ???

    @stub
    // Returns false if autoResizeMode is set to
    // AUTO_RESIZE_OFF, which indicates that the
    // width of the viewport does not determine the width
    // of the table.
    def getScrollableTracksViewportWidth(): Boolean = ???

    @stub
    // Returns the scroll increment (in pixels) that completely exposes one new
    // row or column (depending on the orientation).
    def getScrollableUnitIncrement(visibleRect: Rectangle, orientation: Int, direction: Int): Int = ???

    @stub
    // Returns the index of the first selected column,
    // -1 if no column is selected.
    def getSelectedColumn(): Int = ???

    @stub
    // Returns the number of selected columns.
    def getSelectedColumnCount(): Int = ???

    @stub
    // Returns the indices of all selected columns.
    def getSelectedColumns(): Array[Int] = ???

    @stub
    // Returns the index of the first selected row, -1 if no row is selected.
    def getSelectedRow(): Int = ???

    @stub
    // Returns the number of selected rows.
    def getSelectedRowCount(): Int = ???

    @stub
    // Returns the indices of all selected rows.
    def getSelectedRows(): Array[Int] = ???

    @stub
    // Returns the background color for selected cells.
    def getSelectionBackground(): Color = ???

    @stub
    // Returns the foreground color for selected cells.
    def getSelectionForeground(): Color = ???

    @stub
    // Returns the ListSelectionModel that is used to maintain row
    // selection state.
    def getSelectionModel(): ListSelectionModel = ???

    @stub
    // Returns true if the table draws horizontal lines between cells, false if it
    // doesn't.
    def getShowHorizontalLines(): Boolean = ???

    @stub
    // Returns true if the table draws vertical lines between cells, false if it
    // doesn't.
    def getShowVerticalLines(): Boolean = ???

    @stub
    // Returns true if the editor should get the focus
    // when keystrokes cause the editor to be activated
    def getSurrendersFocusOnKeystroke(): Boolean = ???

    @stub
    // Returns the tableHeader used by this JTable.
    def getTableHeader(): JTableHeader = ???

    @stub
    // Overrides JComponent's getToolTipText
    // method in order to allow the renderer's tips to be used
    // if it has text set.
    def getToolTipText(event: MouseEvent): String = ???

    @stub
    // Returns the L&F object that renders this component.
    def getUI(): TableUI = ???

    @stub
    // Returns the suffix used to construct the name of the L&F class used to
    // render this component.
    def getUIClassID(): String = ???

    @stub
    // Returns true if the selection should be updated after sorting.
    def getUpdateSelectionOnSort(): Boolean = ???

    @stub
    // Returns the cell value at row and column.
    def getValueAt(row: Int, column: Int): Object = ???

    @stub
    // Initializes table properties to their default values.
    protected def initializeLocalVars(): Unit = ???

    @stub
    // Returns true if the cell at row and column
    // is editable.
    def isCellEditable(row: Int, column: Int): Boolean = ???

    @stub
    // Returns true if the specified indices are in the valid range of rows
    // and columns and the cell at the specified position is selected.
    def isCellSelected(row: Int, column: Int): Boolean = ???

    @stub
    // Returns true if the specified index is in the valid range of columns,
    // and the column at that index is selected.
    def isColumnSelected(column: Int): Boolean = ???

    @stub
    // Returns true if a cell is being edited.
    def isEditing(): Boolean = ???

    @stub
    // Returns true if the specified index is in the valid range of rows,
    // and the row at that index is selected.
    def isRowSelected(row: Int): Boolean = ???

    @stub
    // Moves the column column to the position currently
    // occupied by the column targetColumn in the view.
    def moveColumn(column: Int, targetColumn: Int): Unit = ???

    @stub
    // Returns a string representation of this table.
    protected def paramString(): String = ???

    @stub
    // Prepares the editor by querying the data model for the value and
    // selection state of the cell at row, column.
    def prepareEditor(editor: TableCellEditor, row: Int, column: Int): Component = ???

    @stub
    // Prepares the renderer by querying the data model for the
    // value and selection state
    // of the cell at row, column.
    def prepareRenderer(renderer: TableCellRenderer, row: Int, column: Int): Component = ???

    @stub
    // A convenience method that displays a printing dialog, and then prints
    // this JTable in mode PrintMode.FIT_WIDTH,
    // with no header or footer text.
    def print(): Boolean = ???

    @stub
    // A convenience method that displays a printing dialog, and then prints
    // this JTable in the given printing mode,
    // with no header or footer text.
    def print(printMode: JTable.PrintMode): Boolean = ???

    @stub
    // A convenience method that displays a printing dialog, and then prints
    // this JTable in the given printing mode,
    // with the specified header and footer text.
    def print(printMode: JTable.PrintMode, headerFormat: MessageFormat, footerFormat: MessageFormat): Boolean = ???

    @stub
    // Prints this table, as specified by the fully featured
    // print
    // method, with the default printer specified as the print service.
    def print(printMode: JTable.PrintMode, headerFormat: MessageFormat, footerFormat: MessageFormat, showPrintDialog: Boolean, attr: PrintRequestAttributeSet, interactive: Boolean): Boolean = ???

    @stub
    // Prints this JTable.
    def print(printMode: JTable.PrintMode, headerFormat: MessageFormat, footerFormat: MessageFormat, showPrintDialog: Boolean, attr: PrintRequestAttributeSet, interactive: Boolean, service: PrintService): Boolean = ???

    @stub
    // Invoked to process the key bindings for ks as the result
    // of the KeyEvent e.
    protected def processKeyBinding(ks: KeyStroke, e: KeyEvent, condition: Int, pressed: Boolean): Boolean = ???

    @stub
    // Removes aColumn from this JTable's
    //  array of columns.
    def removeColumn(aColumn: TableColumn): Unit = ???

    @stub
    // Deselects the columns from index0 to index1, inclusive.
    def removeColumnSelectionInterval(index0: Int, index1: Int): Unit = ???

    @stub
    // Discards the editor object and frees the real estate it used for
    // cell rendering.
    def removeEditor(): Unit = ???

    @stub
    // Calls the unconfigureEnclosingScrollPane method.
    def removeNotify(): Unit = ???

    @stub
    // Deselects the rows from index0 to index1, inclusive.
    def removeRowSelectionInterval(index0: Int, index1: Int): Unit = ???

    @stub
    // Equivalent to revalidate followed by repaint.
    protected def resizeAndRepaint(): Unit = ???

    @stub
    // Returns the index of the row that point lies in,
    // or -1 if the result is not in the range
    // [0, getRowCount()-1].
    def rowAtPoint(point: Point): Int = ???

    @stub
    // Selects all rows, columns, and cells in the table.
    def selectAll(): Unit = ???

    @stub
    // Sets this table's autoCreateColumnsFromModel flag.
    def setAutoCreateColumnsFromModel(autoCreateColumnsFromModel: Boolean): Unit = ???

    @stub
    // Specifies whether a RowSorter should be created for the
    // table whenever its model changes.
    def setAutoCreateRowSorter(autoCreateRowSorter: Boolean): Unit = ???

    @stub
    // Sets the table's auto resize mode when the table is resized.
    def setAutoResizeMode(mode: Int): Unit = ???

    @stub
    // Sets the active cell editor.
    def setCellEditor(anEditor: TableCellEditor): Unit = ???

    @stub
    // Sets whether this table allows both a column selection and a
    // row selection to exist simultaneously.
    def setCellSelectionEnabled(cellSelectionEnabled: Boolean): Unit = ???

    @stub
    // Sets the column model for this table to newModel and registers
    // for listener notifications from the new column model.
    def setColumnModel(columnModel: TableColumnModel): Unit = ???

    @stub
    // Sets whether the columns in this model can be selected.
    def setColumnSelectionAllowed(columnSelectionAllowed: Boolean): Unit = ???

    @stub
    // Selects the columns from index0 to index1,
    // inclusive.
    def setColumnSelectionInterval(index0: Int, index1: Int): Unit = ???

    @stub
    // Sets a default cell editor to be used if no editor has been set in
    // a TableColumn.
    def setDefaultEditor(columnClass: Class[_], editor: TableCellEditor): Unit = ???

    @stub
    // Sets a default cell renderer to be used if no renderer has been set in
    // a TableColumn.
    def setDefaultRenderer(columnClass: Class[_], renderer: TableCellRenderer): Unit = ???

    @stub
    // Turns on or off automatic drag handling.
    def setDragEnabled(b: Boolean): Unit = ???

    @stub
    // Sets the drop mode for this component.
    def setDropMode(dropMode: DropMode): Unit = ???

    @stub
    // Sets the editingColumn variable.
    def setEditingColumn(aColumn: Int): Unit = ???

    @stub
    // Sets the editingRow variable.
    def setEditingRow(aRow: Int): Unit = ???

    @stub
    // Sets whether or not this table is always made large enough
    // to fill the height of an enclosing viewport.
    def setFillsViewportHeight(fillsViewportHeight: Boolean): Unit = ???

    @stub
    // Sets the color used to draw grid lines to gridColor and redisplays.
    def setGridColor(gridColor: Color): Unit = ???

    @stub
    // Sets the rowMargin and the columnMargin --
    // the height and width of the space between cells -- to
    // intercellSpacing.
    def setIntercellSpacing(intercellSpacing: Dimension): Unit = ???

    @stub
    // Sets the data model for this table to newModel and registers
    // with it for listener notifications from the new data model.
    def setModel(dataModel: TableModel): Unit = ???

    @stub
    // Sets the preferred size of the viewport for this table.
    def setPreferredScrollableViewportSize(size: Dimension): Unit = ???

    @stub
    // Sets the height, in pixels, of all cells to rowHeight,
    // revalidates, and repaints.
    def setRowHeight(rowHeight: Int): Unit = ???

    @stub
    // Sets the height for row to rowHeight,
    // revalidates, and repaints.
    def setRowHeight(row: Int, rowHeight: Int): Unit = ???

    @stub
    // Sets the amount of empty space between cells in adjacent rows.
    def setRowMargin(rowMargin: Int): Unit = ???

    @stub
    // Sets whether the rows in this model can be selected.
    def setRowSelectionAllowed(rowSelectionAllowed: Boolean): Unit = ???

    @stub
    // Selects the rows from index0 to index1,
    // inclusive.
    def setRowSelectionInterval(index0: Int, index1: Int): Unit = ???

    @stub
    // Sets the RowSorter.
    def setRowSorter(sorter: RowSorter[_ <: TableModel]): Unit = ???

    @stub
    // Sets the background color for selected cells.
    def setSelectionBackground(selectionBackground: Color): Unit = ???

    @stub
    // Sets the foreground color for selected cells.
    def setSelectionForeground(selectionForeground: Color): Unit = ???

    @stub
    // Sets the table's selection mode to allow only single selections, a single
    // contiguous interval, or multiple intervals.
    def setSelectionMode(selectionMode: Int): Unit = ???

    @stub
    // Sets the row selection model for this table to newModel
    // and registers for listener notifications from the new selection model.
    def setSelectionModel(newModel: ListSelectionModel): Unit = ???

    @stub
    // Sets whether the table draws grid lines around cells.
    def setShowGrid(showGrid: Boolean): Unit = ???

    @stub
    // Sets whether the table draws horizontal lines between cells.
    def setShowHorizontalLines(showHorizontalLines: Boolean): Unit = ???

    @stub
    // Sets whether the table draws vertical lines between cells.
    def setShowVerticalLines(showVerticalLines: Boolean): Unit = ???

    @stub
    // Sets whether editors in this JTable get the keyboard focus
    // when an editor is activated as a result of the JTable
    // forwarding keyboard events for a cell.
    def setSurrendersFocusOnKeystroke(surrendersFocusOnKeystroke: Boolean): Unit = ???

    @stub
    // Sets the tableHeader working with this JTable to newHeader.
    def setTableHeader(tableHeader: JTableHeader): Unit = ???

    @stub
    // Sets the L&F object that renders this component and repaints.
    def setUI(ui: TableUI): Unit = ???

    @stub
    // Specifies whether the selection should be updated after sorting.
    def setUpdateSelectionOnSort(update: Boolean): Unit = ???

    @stub
    // Sets the value for the cell in the table model at row
    // and column.
    def setValueAt(aValue: Object, row: Int, column: Int): Unit = ???

    @stub
    // Deprecated. 
    //As of Swing version 1.0.3,
    // replaced by doLayout().
    //
    def sizeColumnsToFit(lastColumnOnly: Boolean): Unit = ???

    @stub
    // Obsolete as of Java 2 platform v1.4.
    def sizeColumnsToFit(resizingColumn: Int): Unit = ???

    @stub
    // RowSorterListener notification that the
    // RowSorter has changed in some way.
    def sorterChanged(e: RowSorterEvent): Unit = ???

    @stub
    // Invoked when this table's TableModel generates
    // a TableModelEvent.
    def tableChanged(e: TableModelEvent): Unit = ???

    @stub
    // Reverses the effect of configureEnclosingScrollPane
    // by replacing the columnHeaderView of the enclosing
    // scroll pane with null.
    protected def unconfigureEnclosingScrollPane(): Unit = ???

    @stub
    // Notification from the UIManager that the L&F has changed.
    def updateUI(): Unit = ???
}

object JTable {
    @stub
    // A subclass of TransferHandler.DropLocation representing
    // a drop location for a JTable.
    def JTable.DropLocation: class = ???

    @stub
    // During all resize operations, proportionately resize all columns.
    def AUTO_RESIZE_ALL_COLUMNS: Int = ???

    @stub
    // During all resize operations, apply adjustments to the last column only.
    def AUTO_RESIZE_LAST_COLUMN: Int = ???

    @stub
    // When a column is adjusted in the UI, adjust the next column the opposite way.
    def AUTO_RESIZE_NEXT_COLUMN: Int = ???

    @stub
    // Do not adjust column widths automatically; use a horizontal scrollbar instead.
    def AUTO_RESIZE_OFF: Int = ???

    @stub
    // During UI adjustment, change subsequent columns to preserve the total width;
    // this is the default behavior.
    def AUTO_RESIZE_SUBSEQUENT_COLUMNS: Int = ???

    @stub
    // Deprecated. 
    //As of Swing version 1.0.2,
    // replaced by new JScrollPane(aTable).
    //
    def createScrollPaneForTable(aTable: JTable): JScrollPane = ???
}
