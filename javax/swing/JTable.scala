package javax.swing

import java.awt.{Color, Component, Component.AccessibleAWTComponent, Container, Container.AccessibleAWTContainer, Cursor, Dimension, Font, FontMetrics, Point, Rectangle}
import java.awt.event.{FocusListener, KeyEvent, MouseEvent}
import java.awt.print.Printable
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.{Class, Enum, Object, String}
import java.text.MessageFormat
import java.util.{EventObject, Hashtable, Locale, Vector}
import javax.accessibility.{Accessible, AccessibleAction, AccessibleComponent, AccessibleContext, AccessibleExtendedTable, AccessibleRole, AccessibleSelection, AccessibleStateSet, AccessibleTable, AccessibleTableModelChange, AccessibleText, AccessibleValue}
import javax.print.PrintService
import javax.print.attribute.PrintRequestAttributeSet
import javax.swing.event.{CellEditorListener, ChangeEvent, ListSelectionEvent, ListSelectionListener, RowSorterEvent, RowSorterListener, TableColumnModelEvent, TableColumnModelListener, TableModelEvent, TableModelListener}
import javax.swing.plaf.TableUI
import javax.swing.table.{JTableHeader, TableCellEditor, TableCellRenderer, TableColumn, TableColumnModel, TableModel}
import scala.scalanative.annotation.stub

/** The JTable is used to display and edit regular two-dimensional tables
 *  of cells.
 *  See How to Use Tables
 *  in The Java Tutorial
 *  for task-oriented documentation and examples of using JTable.
 * 
 *  
 *  The JTable has many
 *  facilities that make it possible to customize its rendering and editing
 *  but provides defaults for these features so that simple tables can be
 *  set up easily.  For example, to set up a table with 10 rows and 10
 *  columns of numbers:
 * 
 *  
 *       TableModel dataModel = new AbstractTableModel() {
 *           public int getColumnCount() { return 10; }
 *           public int getRowCount() { return 10;}
 *           public Object getValueAt(int row, int col) { return new Integer(row*col); }
 *       };
 *       JTable table = new JTable(dataModel);
 *       JScrollPane scrollpane = new JScrollPane(table);
 *  
 *  
 *  JTables are typically placed inside of a JScrollPane.  By
 *  default, a JTable will adjust its width such that
 *  a horizontal scrollbar is unnecessary.  To allow for a horizontal scrollbar,
 *  invoke setAutoResizeMode(int) with AUTO_RESIZE_OFF.
 *  Note that if you wish to use a JTable in a standalone
 *  view (outside of a JScrollPane) and want the header
 *  displayed, you can get it using getTableHeader() and
 *  display it separately.
 *  
 *  To enable sorting and filtering of rows, use a
 *  RowSorter.
 *  You can set up a row sorter in either of two ways:
 *  
 *    Directly set the RowSorter. For example:
 *         table.setRowSorter(new TableRowSorter(model)).
 *    Set the autoCreateRowSorter
 *        property to true, so that the JTable
 *        creates a RowSorter for
 *        you. For example: setAutoCreateRowSorter(true).
 *  
 *  
 *  When designing applications that use the JTable it is worth paying
 *  close attention to the data structures that will represent the table's data.
 *  The DefaultTableModel is a model implementation that
 *  uses a Vector of Vectors of Objects to
 *  store the cell values. As well as copying the data from an
 *  application into the DefaultTableModel,
 *  it is also possible to wrap the data in the methods of the
 *  TableModel interface so that the data can be passed to the
 *  JTable directly, as in the example above. This often results
 *  in more efficient applications because the model is free to choose the
 *  internal representation that best suits the data.
 *  A good rule of thumb for deciding whether to use the AbstractTableModel
 *  or the DefaultTableModel is to use the AbstractTableModel
 *  as the base class for creating subclasses and the DefaultTableModel
 *  when subclassing is not required.
 *  
 *  The "TableExample" directory in the demo area of the source distribution
 *  gives a number of complete examples of JTable usage,
 *  covering how the JTable can be used to provide an
 *  editable view of data taken from a database and how to modify
 *  the columns in the display to use specialized renderers and editors.
 *  
 *  The JTable uses integers exclusively to refer to both the rows and the columns
 *  of the model that it displays. The JTable simply takes a tabular range of cells
 *  and uses getValueAt(int, int) to retrieve the
 *  values from the model during painting.  It is important to remember that
 *  the column and row indexes returned by various JTable methods
 *  are in terms of the JTable (the view) and are not
 *  necessarily the same indexes used by the model.
 *  
 *  By default, columns may be rearranged in the JTable so that the
 *  view's columns appear in a different order to the columns in the model.
 *  This does not affect the implementation of the model at all: when the
 *  columns are reordered, the JTable maintains the new order of the columns
 *  internally and converts its column indices before querying the model.
 *  
 *  So, when writing a TableModel, it is not necessary to listen for column
 *  reordering events as the model will be queried in its own coordinate
 *  system regardless of what is happening in the view.
 *  In the examples area there is a demonstration of a sorting algorithm making
 *  use of exactly this technique to interpose yet another coordinate system
 *  where the order of the rows is changed, rather than the order of the columns.
 *  
 *  Similarly when using the sorting and filtering functionality
 *  provided by RowSorter the underlying
 *  TableModel does not need to know how to do sorting,
 *  rather RowSorter will handle it.  Coordinate
 *  conversions will be necessary when using the row based methods of
 *  JTable with the underlying TableModel.
 *  All of JTables row based methods are in terms of the
 *  RowSorter, which is not necessarily the same as that
 *  of the underlying TableModel.  For example, the
 *  selection is always in terms of JTable so that when
 *  using RowSorter you will need to convert using
 *  convertRowIndexToView or
 *  convertRowIndexToModel.  The following shows how to
 *  convert coordinates from JTable to that of the
 *  underlying model:
 *  
 *    int[] selection = table.getSelectedRows();
 *    for (int i = 0; i < selection.length; i++) {
 *      selection[i] = table.convertRowIndexToModel(selection[i]);
 *    }
 *    // selection is now in terms of the underlying TableModel
 *  
 *  
 *  By default if sorting is enabled JTable will persist the
 *  selection and variable row heights in terms of the model on
 *  sorting.  For example if row 0, in terms of the underlying model,
 *  is currently selected, after the sort row 0, in terms of the
 *  underlying model will be selected.  Visually the selection may
 *  change, but in terms of the underlying model it will remain the
 *  same.  The one exception to that is if the model index is no longer
 *  visible or was removed.  For example, if row 0 in terms of model
 *  was filtered out the selection will be empty after the sort.
 *  
 *  J2SE 5 adds methods to JTable to provide convenient access to some
 *  common printing needs. Simple new print() methods allow for quick
 *  and easy addition of printing support to your application. In addition, a new
 *  getPrintable(javax.swing.JTable.PrintMode, java.text.MessageFormat, java.text.MessageFormat) method is available for more advanced printing needs.
 *  
 *  As for all JComponent classes, you can use
 *  InputMap and ActionMap to associate an
 *  Action object with a KeyStroke and execute the
 *  action under specified conditions.
 *  
 *  Warning: Swing is not thread safe. For more
 *  information see Swing's Threading
 *  Policy.
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
class JTable extends JComponent with TableModelListener with Scrollable with TableColumnModelListener with ListSelectionListener with CellEditorListener with Accessible with RowSorterListener {

    /** Constructs a default JTable that is initialized with a default
     *  data model, a default column model, and a default selection
     *  model.
     */
    @stub
    def this() = ???

    /** Constructs a JTable with numRows
     *  and numColumns of empty cells using
     *  DefaultTableModel.
     */
    @stub
    def this(numRows: Int, numColumns: Int) = ???

    /** Constructs a JTable to display the values in the two dimensional array,
     *  rowData, with column names, columnNames.
     */
    @stub
    def this(rowData: Array[Array[Object]], columnNames: Array[Object]) = ???

    /** Constructs a JTable that is initialized with
     *  dm as the data model, a default column model,
     *  and a default selection model.
     */
    @stub
    def this(dm: TableModel) = ???

    /** Constructs a JTable that is initialized with
     *  dm as the data model, cm
     *  as the column model, and a default selection model.
     */
    @stub
    def this(dm: TableModel, cm: TableColumnModel) = ???

    /** Constructs a JTable that is initialized with
     *  dm as the data model, cm as the
     *  column model, and sm as the selection model.
     */
    @stub
    def this(dm: TableModel, cm: TableColumnModel, sm: ListSelectionModel) = ???

    /** Constructs a JTable to display the values in the
     *  Vector of Vectors, rowData,
     *  with column names, columnNames.
     */
    @stub
    def this(rowData: Vector, columnNames: Vector) = ???

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
    protected class AccessibleJTable extends JComponent.AccessibleJComponent with AccessibleSelection with ListSelectionListener with TableModelListener with TableColumnModelListener with CellEditorListener with PropertyChangeListener with AccessibleExtendedTable {

        /** AccessibleJTable constructor */
        @stub
        protected def this() = ???

        /** The class provides an implementation of the Java Accessibility
         *  API appropriate to table cells.
         */
        protected class AccessibleJTableCell extends AccessibleContext with Accessible with AccessibleComponent {

            /** Constructs an AccessibleJTableHeaderEntry. */
            @stub
            def this(t: JTable, r: Int, c: Int, i: Int) = ???

            /** Adds the specified focus listener to receive focus events from this
             *  component.
             */
            @stub
            def addFocusListener(l: FocusListener): Unit = ???

            /** Adds a PropertyChangeListener to the listener list. */
            @stub
            def addPropertyChangeListener(l: PropertyChangeListener): Unit = ???

            /** Checks whether the specified point is within this
             *  object's bounds, where the point's x and y coordinates
             *  are defined to be relative to the coordinate system of
             *  the object.
             */
            @stub
            def contains(p: Point): Boolean = ???

            /** Gets the AccessibleAction associated with this
             *  object if one exists.
             */
            @stub
            def getAccessibleAction(): AccessibleAction = ???

            /** Returns the Accessible child, if one exists, contained at the local
             *  coordinate Point.
             */
            @stub
            def getAccessibleAt(p: Point): Accessible = ???

            /** Returns the specified Accessible child of the
             *  object.
             */
            @stub
            def getAccessibleChild(i: Int): Accessible = ???

            /** Returns the number of accessible children in the object. */
            @stub
            def getAccessibleChildrenCount(): Int = ???

            /** Gets the AccessibleComponent associated with
             *  this object if one exists.
             */
            @stub
            def getAccessibleComponent(): AccessibleComponent = ???

            /** Gets the AccessibleContext associated with this
             *  component.
             */
            @stub
            def getAccessibleContext(): AccessibleContext = ???

            /** Gets the accessible description of this object. */
            @stub
            def getAccessibleDescription(): String = ???

            /** Gets the index of this object in its accessible parent. */
            @stub
            def getAccessibleIndexInParent(): Int = ???

            /** Gets the accessible name of this object. */
            @stub
            def getAccessibleName(): String = ???

            /** Gets the Accessible parent of this object. */
            @stub
            def getAccessibleParent(): Accessible = ???

            /** Gets the role of this object. */
            @stub
            def getAccessibleRole(): AccessibleRole = ???

            /** Gets the AccessibleSelection associated with
             *  this object if one exists.
             */
            @stub
            def getAccessibleSelection(): AccessibleSelection = ???

            /** Gets the state set of this object. */
            @stub
            def getAccessibleStateSet(): AccessibleStateSet = ???

            /** Gets the AccessibleText associated with this
             *  object if one exists.
             */
            @stub
            def getAccessibleText(): AccessibleText = ???

            /** Gets the AccessibleValue associated with
             *  this object if one exists.
             */
            @stub
            def getAccessibleValue(): AccessibleValue = ???

            /** Gets the background color of this object. */
            @stub
            def getBackground(): Color = ???

            /** Gets the bounds of this object in the form of a Rectangle object. */
            @stub
            def getBounds(): Rectangle = ???

            /** Gets the AccessibleContext for the table cell renderer. */
            @stub
            protected def getCurrentAccessibleContext(): AccessibleContext = ???

            /** Gets the table cell renderer component. */
            @stub
            protected def getCurrentComponent(): Component = ???

            /** Gets the Cursor of this object. */
            @stub
            def getCursor(): Cursor = ???

            /** Gets the Font of this object. */
            @stub
            def getFont(): Font = ???

            /** Gets the FontMetrics of this object. */
            @stub
            def getFontMetrics(f: Font): FontMetrics = ???

            /** Gets the foreground color of this object. */
            @stub
            def getForeground(): Color = ???

            /** Gets the locale of the component. */
            @stub
            def getLocale(): Locale = ???

            /** Gets the location of the object relative to the parent
             *  in the form of a point specifying the object's
             *  top-left corner in the screen's coordinate space.
             */
            @stub
            def getLocation(): Point = ???

            /** Returns the location of the object on the screen. */
            @stub
            def getLocationOnScreen(): Point = ???

            /** Returns the size of this object in the form of a Dimension object. */
            @stub
            def getSize(): Dimension = ???

            /** Determines if the object is enabled. */
            @stub
            def isEnabled(): Boolean = ???

            /** Returns whether this object can accept focus or not. */
            @stub
            def isFocusTraversable(): Boolean = ???

            /** Determines if the object is showing. */
            @stub
            def isShowing(): Boolean = ???

            /** Determines if this object is visible. */
            @stub
            def isVisible(): Boolean = ???

            /** Removes the specified focus listener so it no longer receives focus
             *  events from this component.
             */
            @stub
            def removeFocusListener(l: FocusListener): Unit = ???

            /** Removes a PropertyChangeListener from the
             *  listener list.
             */
            @stub
            def removePropertyChangeListener(l: PropertyChangeListener): Unit = ???

            /** Requests focus for this object. */
            @stub
            def requestFocus(): Unit = ???

            /** Sets the accessible description of this object. */
            @stub
            def setAccessibleDescription(s: String): Unit = ???

            /** Sets the localized accessible name of this object. */
            @stub
            def setAccessibleName(s: String): Unit = ???

            /** Sets the background color of this object. */
            @stub
            def setBackground(c: Color): Unit = ???

            /** Sets the bounds of this object in the form of a Rectangle object. */
            @stub
            def setBounds(r: Rectangle): Unit = ???

            /** Sets the Cursor of this object. */
            @stub
            def setCursor(c: Cursor): Unit = ???

            /** Sets the enabled state of the object. */
            @stub
            def setEnabled(b: Boolean): Unit = ???

            /** Sets the Font of this object. */
            @stub
            def setFont(f: Font): Unit = ???

            /** Sets the foreground color of this object. */
            @stub
            def setForeground(c: Color): Unit = ???

            /** Sets the location of the object relative to the parent. */
            @stub
            def setLocation(p: Point): Unit = ???

            /** Resizes this object so that it has width and height. */
            @stub
            def setSize(d: Dimension): Unit = ???

            /** Sets the visible state of the object. */
            @stub
            def setVisible(b: Boolean): Unit = ???
        }


        /**  */
        protected class AccessibleJTableModelChange extends Object with AccessibleTableModelChange {

            /**  */
            @stub
            protected def this(type: Int, firstRow: Int, lastRow: Int, firstColumn: Int, lastColumn: Int) = ???

            /**  */
            @stub
            protected val firstColumn: Int = ???

            /**  */
            @stub
            protected val firstRow: Int = ???

            /**  */
            @stub
            protected val lastColumn: Int = ???

            /**  */
            @stub
            protected val lastRow: Int = ???

            /**  */
            @stub
            protected val type: Int = ???

            /** Returns the first column that changed. */
            @stub
            def getFirstColumn(): Int = ???

            /** Returns the first row that changed. */
            @stub
            def getFirstRow(): Int = ???

            /** Returns the last column that changed. */
            @stub
            def getLastColumn(): Int = ???

            /** Returns the last row that changed. */
            @stub
            def getLastRow(): Int = ???

            /** Returns the type of event. */
            @stub
            def getType(): Int = ???
        }


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


    /** The table will query the TableModel to build the default
     *   set of columns if this is true.
     */
    @stub
    protected val autoCreateColumnsFromModel: Boolean = ???

    /** Determines if the table automatically resizes the
     *   width of the table's columns to take up the entire width of the
     *   table, and how it does the resizing.
     */
    @stub
    protected val autoResizeMode: Int = ???

    /** The active cell editor object, that overwrites the screen real estate
     *  occupied by the current cell and allows the user to change its contents.
     */
    @stub
    protected val cellEditor: TableCellEditor = ???

    /** Obsolete as of Java 2 platform v1.3. */
    @stub
    protected val cellSelectionEnabled: Boolean = ???

    /** The TableColumnModel of the table. */
    @stub
    protected val columnModel: TableColumnModel = ???

    /** The TableModel of the table. */
    @stub
    protected val dataModel: TableModel = ???

    /** A table of objects that display and edit the contents of a cell,
     *  indexed by class as declared in getColumnClass
     *  in the TableModel interface.
     */
    @stub
    protected val defaultEditorsByColumnClass: Hashtable = ???

    /** A table of objects that display the contents of a cell,
     *  indexed by class as declared in getColumnClass
     *  in the TableModel interface.
     */
    @stub
    protected val defaultRenderersByColumnClass: Hashtable = ???

    /** Identifies the column of the cell being edited. */
    @stub
    protected val editingColumn: Int = ???

    /** Identifies the row of the cell being edited. */
    @stub
    protected val editingRow: Int = ???

    /** If editing, the Component that is handling the editing. */
    @stub
    protected val editorComp: Component = ???

    /** The color of the grid. */
    @stub
    protected val gridColor: Color = ???

    /** Used by the Scrollable interface to determine the initial visible area. */
    @stub
    protected val preferredViewportSize: Dimension = ???

    /** The height in pixels of each row in the table. */
    @stub
    protected val rowHeight: Int = ???

    /** The height in pixels of the margin between the cells in each row. */
    @stub
    protected val rowMargin: Int = ???

    /** True if row selection is allowed in this table. */
    @stub
    protected val rowSelectionAllowed: Boolean = ???

    /** The background color of selected cells. */
    @stub
    protected val selectionBackground: Color = ???

    /** The foreground color of selected cells. */
    @stub
    protected val selectionForeground: Color = ???

    /** The ListSelectionModel of the table, used to keep track of row selections. */
    @stub
    protected val selectionModel: ListSelectionModel = ???

    /** The table draws horizontal lines between cells if showHorizontalLines is true. */
    @stub
    protected val showHorizontalLines: Boolean = ???

    /** The table draws vertical lines between cells if showVerticalLines is true. */
    @stub
    protected val showVerticalLines: Boolean = ???

    /** The TableHeader working with the table. */
    @stub
    protected val tableHeader: JTableHeader = ???

    /** Appends aColumn to the end of the array of columns held by
     *   this JTable's column model.
     */
    @stub
    def addColumn(aColumn: TableColumn): Unit = ???

    /** Adds the columns from index0 to index1,
     *  inclusive, to the current selection.
     */
    @stub
    def addColumnSelectionInterval(index0: Int, index1: Int): Unit = ???

    /** Calls the configureEnclosingScrollPane method. */
    @stub
    def addNotify(): Unit = ???

    /** Adds the rows from index0 to index1, inclusive, to
     *  the current selection.
     */
    @stub
    def addRowSelectionInterval(index0: Int, index1: Int): Unit = ???

    /** Updates the selection models of the table, depending on the state of the
     *  two flags: toggle and extend.
     */
    @stub
    def changeSelection(rowIndex: Int, columnIndex: Int, toggle: Boolean, extend: Boolean): Unit = ???

    /** Deselects all selected columns and rows. */
    @stub
    def clearSelection(): Unit = ???

    /** Invoked when a column is added to the table column model. */
    @stub
    def columnAdded(e: TableColumnModelEvent): Unit = ???

    /** Returns the index of the column that point lies in,
     *  or -1 if the result is not in the range
     *  [0, getColumnCount()-1].
     */
    @stub
    def columnAtPoint(point: Point): Int = ???

    /** Invoked when a column is moved due to a margin change. */
    @stub
    def columnMarginChanged(e: ChangeEvent): Unit = ???

    /** Invoked when a column is repositioned. */
    @stub
    def columnMoved(e: TableColumnModelEvent): Unit = ???

    /** Invoked when a column is removed from the table column model. */
    @stub
    def columnRemoved(e: TableColumnModelEvent): Unit = ???

    /** Invoked when the selection model of the TableColumnModel
     *  is changed.
     */
    @stub
    def columnSelectionChanged(e: ListSelectionEvent): Unit = ???

    /** If this JTable is the viewportView of an enclosing JScrollPane
     *  (the usual situation), configure this ScrollPane by, amongst other things,
     *  installing the table's tableHeader as the columnHeaderView of the scroll pane.
     */
    @stub
    protected def configureEnclosingScrollPane(): Unit = ???

    /** Maps the index of the column in the view at
     *  viewColumnIndex to the index of the column
     *  in the table model.
     */
    @stub
    def convertColumnIndexToModel(viewColumnIndex: Int): Int = ???

    /** Maps the index of the column in the table model at
     *  modelColumnIndex to the index of the column
     *  in the view.
     */
    @stub
    def convertColumnIndexToView(modelColumnIndex: Int): Int = ???

    /** Maps the index of the row in terms of the view to the
     *  underlying TableModel.
     */
    @stub
    def convertRowIndexToModel(viewRowIndex: Int): Int = ???

    /** Maps the index of the row in terms of the
     *  TableModel to the view.
     */
    @stub
    def convertRowIndexToView(modelRowIndex: Int): Int = ???

    /** Returns the default column model object, which is
     *  a DefaultTableColumnModel.
     */
    @stub
    protected def createDefaultColumnModel(): TableColumnModel = ???

    /** Creates default columns for the table from
     *  the data model using the getColumnCount method
     *  defined in the TableModel interface.
     */
    @stub
    def createDefaultColumnsFromModel(): Unit = ???

    /** Returns the default table model object, which is
     *  a DefaultTableModel.
     */
    @stub
    protected def createDefaultDataModel(): TableModel = ???

    /** Creates default cell editors for objects, numbers, and boolean values. */
    @stub
    protected def createDefaultEditors(): Unit = ???

    /** Creates default cell renderers for objects, numbers, doubles, dates,
     *  booleans, and icons.
     */
    @stub
    protected def createDefaultRenderers(): Unit = ???

    /** Returns the default selection model object, which is
     *  a DefaultListSelectionModel.
     */
    @stub
    protected def createDefaultSelectionModel(): ListSelectionModel = ???

    /** Returns the default table header object, which is
     *  a JTableHeader.
     */
    @stub
    protected def createDefaultTableHeader(): JTableHeader = ???

    /** Causes this table to lay out its rows and columns. */
    @stub
    def doLayout(): Unit = ???

    /** Programmatically starts editing the cell at row and
     *  column, if those indices are in the valid range, and
     *  the cell at those indices is editable.
     */
    @stub
    def editCellAt(row: Int, column: Int): Boolean = ???

    /** Programmatically starts editing the cell at row and
     *  column, if those indices are in the valid range, and
     *  the cell at those indices is editable.
     */
    @stub
    def editCellAt(row: Int, column: Int, e: EventObject): Boolean = ???

    /** Invoked when editing is canceled. */
    @stub
    def editingCanceled(e: ChangeEvent): Unit = ???

    /** Invoked when editing is finished. */
    @stub
    def editingStopped(e: ChangeEvent): Unit = ???

    /** Gets the AccessibleContext associated with this JTable. */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Determines whether the table will create default columns from the model. */
    @stub
    def getAutoCreateColumnsFromModel(): Boolean = ???

    /** Returns true if whenever the model changes, a new
     *  RowSorter should be created and installed
     *  as the table's sorter; otherwise, returns false.
     */
    @stub
    def getAutoCreateRowSorter(): Boolean = ???

    /** Returns the auto resize mode of the table. */
    @stub
    def getAutoResizeMode(): Int = ???

    /** Returns the active cell editor, which is null if the table
     *  is not currently editing.
     */
    @stub
    def getCellEditor(): TableCellEditor = ???

    /** Returns an appropriate editor for the cell specified by
     *  row and column.
     */
    @stub
    def getCellEditor(row: Int, column: Int): TableCellEditor = ???

    /** Returns a rectangle for the cell that lies at the intersection of
     *  row and column.
     */
    @stub
    def getCellRect(row: Int, column: Int, includeSpacing: Boolean): Rectangle = ???

    /** Returns an appropriate renderer for the cell specified by this row and
     *  column.
     */
    @stub
    def getCellRenderer(row: Int, column: Int): TableCellRenderer = ???

    /** Returns true if both row and column selection models are enabled. */
    @stub
    def getCellSelectionEnabled(): Boolean = ???

    /** Returns the TableColumn object for the column in the table
     *  whose identifier is equal to identifier, when compared using
     *  equals.
     */
    @stub
    def getColumn(identifier: Any): TableColumn = ???

    /** Returns the type of the column appearing in the view at
     *  column position column.
     */
    @stub
    def getColumnClass(column: Int): Class[_] = ???

    /** Returns the number of columns in the column model. */
    @stub
    def getColumnCount(): Int = ???

    /** Returns the TableColumnModel that contains all column information
     *  of this table.
     */
    @stub
    def getColumnModel(): TableColumnModel = ???

    /** Returns the name of the column appearing in the view at
     *  column position column.
     */
    @stub
    def getColumnName(column: Int): String = ???

    /** Returns true if columns can be selected. */
    @stub
    def getColumnSelectionAllowed(): Boolean = ???

    /** Returns the editor to be used when no editor has been set in
     *  a TableColumn.
     */
    @stub
    def getDefaultEditor(columnClass: Class[_]): TableCellEditor = ???

    /** Returns the cell renderer to be used when no renderer has been set in
     *  a TableColumn.
     */
    @stub
    def getDefaultRenderer(columnClass: Class[_]): TableCellRenderer = ???

    /** Returns whether or not automatic drag handling is enabled. */
    @stub
    def getDragEnabled(): Boolean = ???

    /** Returns the location that this component should visually indicate
     *  as the drop location during a DnD operation over the component,
     *  or null if no location is to currently be shown.
     */
    @stub
    def getDropLocation(): JTable.DropLocation = ???

    /** Returns the drop mode for this component. */
    @stub
    def getDropMode(): DropMode = ???

    /** Returns the index of the column that contains the cell currently
     *  being edited.
     */
    @stub
    def getEditingColumn(): Int = ???

    /** Returns the index of the row that contains the cell currently
     *  being edited.
     */
    @stub
    def getEditingRow(): Int = ???

    /** Returns the component that is handling the editing session. */
    @stub
    def getEditorComponent(): Component = ???

    /** Returns whether or not this table is always made large enough
     *  to fill the height of an enclosing viewport.
     */
    @stub
    def getFillsViewportHeight(): Boolean = ???

    /** Returns the color used to draw grid lines. */
    @stub
    def getGridColor(): Color = ???

    /** Returns the horizontal and vertical space between cells. */
    @stub
    def getIntercellSpacing(): Dimension = ???

    /** Returns the TableModel that provides the data displayed by this
     *  JTable.
     */
    @stub
    def getModel(): TableModel = ???

    /** Returns the preferred size of the viewport for this table. */
    @stub
    def getPreferredScrollableViewportSize(): Dimension = ???

    /** Return a Printable for use in printing this JTable. */
    @stub
    def getPrintable(printMode: JTable.PrintMode, headerFormat: MessageFormat, footerFormat: MessageFormat): Printable = ???

    /** Returns the number of rows that can be shown in the
     *  JTable, given unlimited space.
     */
    @stub
    def getRowCount(): Int = ???

    /** Returns the height of a table row, in pixels. */
    @stub
    def getRowHeight(): Int = ???

    /** Returns the height, in pixels, of the cells in row. */
    @stub
    def getRowHeight(row: Int): Int = ???

    /** Gets the amount of empty space, in pixels, between cells. */
    @stub
    def getRowMargin(): Int = ???

    /** Returns true if rows can be selected. */
    @stub
    def getRowSelectionAllowed(): Boolean = ???

    /** Returns the object responsible for sorting. */
    @stub
    def getRowSorter(): RowSorter[_ <: TableModel] = ???

    /** Returns visibleRect.height or
     *  visibleRect.width,
     *  depending on this table's orientation.
     */
    @stub
    def getScrollableBlockIncrement(visibleRect: Rectangle, orientation: Int, direction: Int): Int = ???

    /** Returns false to indicate that the height of the viewport does
     *  not determine the height of the table, unless
     *  getFillsViewportHeight is true and the preferred height
     *  of the table is smaller than the viewport's height.
     */
    @stub
    def getScrollableTracksViewportHeight(): Boolean = ???

    /** Returns false if autoResizeMode is set to
     *  AUTO_RESIZE_OFF, which indicates that the
     *  width of the viewport does not determine the width
     *  of the table.
     */
    @stub
    def getScrollableTracksViewportWidth(): Boolean = ???

    /** Returns the scroll increment (in pixels) that completely exposes one new
     *  row or column (depending on the orientation).
     */
    @stub
    def getScrollableUnitIncrement(visibleRect: Rectangle, orientation: Int, direction: Int): Int = ???

    /** Returns the index of the first selected column,
     *  -1 if no column is selected.
     */
    @stub
    def getSelectedColumn(): Int = ???

    /** Returns the number of selected columns. */
    @stub
    def getSelectedColumnCount(): Int = ???

    /** Returns the indices of all selected columns. */
    @stub
    def getSelectedColumns(): Array[Int] = ???

    /** Returns the index of the first selected row, -1 if no row is selected. */
    @stub
    def getSelectedRow(): Int = ???

    /** Returns the number of selected rows. */
    @stub
    def getSelectedRowCount(): Int = ???

    /** Returns the indices of all selected rows. */
    @stub
    def getSelectedRows(): Array[Int] = ???

    /** Returns the background color for selected cells. */
    @stub
    def getSelectionBackground(): Color = ???

    /** Returns the foreground color for selected cells. */
    @stub
    def getSelectionForeground(): Color = ???

    /** Returns the ListSelectionModel that is used to maintain row
     *  selection state.
     */
    @stub
    def getSelectionModel(): ListSelectionModel = ???

    /** Returns true if the table draws horizontal lines between cells, false if it
     *  doesn't.
     */
    @stub
    def getShowHorizontalLines(): Boolean = ???

    /** Returns true if the table draws vertical lines between cells, false if it
     *  doesn't.
     */
    @stub
    def getShowVerticalLines(): Boolean = ???

    /** Returns true if the editor should get the focus
     *  when keystrokes cause the editor to be activated
     */
    @stub
    def getSurrendersFocusOnKeystroke(): Boolean = ???

    /** Returns the tableHeader used by this JTable. */
    @stub
    def getTableHeader(): JTableHeader = ???

    /** Overrides JComponent's getToolTipText
     *  method in order to allow the renderer's tips to be used
     *  if it has text set.
     */
    @stub
    def getToolTipText(event: MouseEvent): String = ???

    /** Returns the L&F object that renders this component. */
    @stub
    def getUI(): TableUI = ???

    /** Returns the suffix used to construct the name of the L&F class used to
     *  render this component.
     */
    @stub
    def getUIClassID(): String = ???

    /** Returns true if the selection should be updated after sorting. */
    @stub
    def getUpdateSelectionOnSort(): Boolean = ???

    /** Returns the cell value at row and column. */
    @stub
    def getValueAt(row: Int, column: Int): Any = ???

    /** Initializes table properties to their default values. */
    @stub
    protected def initializeLocalVars(): Unit = ???

    /** Returns true if the cell at row and column
     *  is editable.
     */
    @stub
    def isCellEditable(row: Int, column: Int): Boolean = ???

    /** Returns true if the specified indices are in the valid range of rows
     *  and columns and the cell at the specified position is selected.
     */
    @stub
    def isCellSelected(row: Int, column: Int): Boolean = ???

    /** Returns true if the specified index is in the valid range of columns,
     *  and the column at that index is selected.
     */
    @stub
    def isColumnSelected(column: Int): Boolean = ???

    /** Returns true if a cell is being edited. */
    @stub
    def isEditing(): Boolean = ???

    /** Returns true if the specified index is in the valid range of rows,
     *  and the row at that index is selected.
     */
    @stub
    def isRowSelected(row: Int): Boolean = ???

    /** Moves the column column to the position currently
     *  occupied by the column targetColumn in the view.
     */
    @stub
    def moveColumn(column: Int, targetColumn: Int): Unit = ???

    /** Returns a string representation of this table. */
    @stub
    protected def paramString(): String = ???

    /** Prepares the editor by querying the data model for the value and
     *  selection state of the cell at row, column.
     */
    @stub
    def prepareEditor(editor: TableCellEditor, row: Int, column: Int): Component = ???

    /** Prepares the renderer by querying the data model for the
     *  value and selection state
     *  of the cell at row, column.
     */
    @stub
    def prepareRenderer(renderer: TableCellRenderer, row: Int, column: Int): Component = ???

    /** A convenience method that displays a printing dialog, and then prints
     *  this JTable in mode PrintMode.FIT_WIDTH,
     *  with no header or footer text.
     */
    @stub
    def print(): Boolean = ???

    /** A convenience method that displays a printing dialog, and then prints
     *  this JTable in the given printing mode,
     *  with no header or footer text.
     */
    @stub
    def print(printMode: JTable.PrintMode): Boolean = ???

    /** A convenience method that displays a printing dialog, and then prints
     *  this JTable in the given printing mode,
     *  with the specified header and footer text.
     */
    @stub
    def print(printMode: JTable.PrintMode, headerFormat: MessageFormat, footerFormat: MessageFormat): Boolean = ???

    /** Prints this table, as specified by the fully featured
     *  print
     *  method, with the default printer specified as the print service.
     */
    @stub
    def print(printMode: JTable.PrintMode, headerFormat: MessageFormat, footerFormat: MessageFormat, showPrintDialog: Boolean, attr: PrintRequestAttributeSet, interactive: Boolean): Boolean = ???

    /** Prints this JTable. */
    @stub
    def print(printMode: JTable.PrintMode, headerFormat: MessageFormat, footerFormat: MessageFormat, showPrintDialog: Boolean, attr: PrintRequestAttributeSet, interactive: Boolean, service: PrintService): Boolean = ???

    /** Invoked to process the key bindings for ks as the result
     *  of the KeyEvent e.
     */
    @stub
    protected def processKeyBinding(ks: KeyStroke, e: KeyEvent, condition: Int, pressed: Boolean): Boolean = ???

    /** Removes aColumn from this JTable's
     *   array of columns.
     */
    @stub
    def removeColumn(aColumn: TableColumn): Unit = ???

    /** Deselects the columns from index0 to index1, inclusive. */
    @stub
    def removeColumnSelectionInterval(index0: Int, index1: Int): Unit = ???

    /** Discards the editor object and frees the real estate it used for
     *  cell rendering.
     */
    @stub
    def removeEditor(): Unit = ???

    /** Calls the unconfigureEnclosingScrollPane method. */
    @stub
    def removeNotify(): Unit = ???

    /** Deselects the rows from index0 to index1, inclusive. */
    @stub
    def removeRowSelectionInterval(index0: Int, index1: Int): Unit = ???

    /** Equivalent to revalidate followed by repaint. */
    @stub
    protected def resizeAndRepaint(): Unit = ???

    /** Returns the index of the row that point lies in,
     *  or -1 if the result is not in the range
     *  [0, getRowCount()-1].
     */
    @stub
    def rowAtPoint(point: Point): Int = ???

    /** Selects all rows, columns, and cells in the table. */
    @stub
    def selectAll(): Unit = ???

    /** Sets this table's autoCreateColumnsFromModel flag. */
    @stub
    def setAutoCreateColumnsFromModel(autoCreateColumnsFromModel: Boolean): Unit = ???

    /** Specifies whether a RowSorter should be created for the
     *  table whenever its model changes.
     */
    @stub
    def setAutoCreateRowSorter(autoCreateRowSorter: Boolean): Unit = ???

    /** Sets the table's auto resize mode when the table is resized. */
    @stub
    def setAutoResizeMode(mode: Int): Unit = ???

    /** Sets the active cell editor. */
    @stub
    def setCellEditor(anEditor: TableCellEditor): Unit = ???

    /** Sets whether this table allows both a column selection and a
     *  row selection to exist simultaneously.
     */
    @stub
    def setCellSelectionEnabled(cellSelectionEnabled: Boolean): Unit = ???

    /** Sets the column model for this table to newModel and registers
     *  for listener notifications from the new column model.
     */
    @stub
    def setColumnModel(columnModel: TableColumnModel): Unit = ???

    /** Sets whether the columns in this model can be selected. */
    @stub
    def setColumnSelectionAllowed(columnSelectionAllowed: Boolean): Unit = ???

    /** Selects the columns from index0 to index1,
     *  inclusive.
     */
    @stub
    def setColumnSelectionInterval(index0: Int, index1: Int): Unit = ???

    /** Sets a default cell editor to be used if no editor has been set in
     *  a TableColumn.
     */
    @stub
    def setDefaultEditor(columnClass: Class[_], editor: TableCellEditor): Unit = ???

    /** Sets a default cell renderer to be used if no renderer has been set in
     *  a TableColumn.
     */
    @stub
    def setDefaultRenderer(columnClass: Class[_], renderer: TableCellRenderer): Unit = ???

    /** Turns on or off automatic drag handling. */
    @stub
    def setDragEnabled(b: Boolean): Unit = ???

    /** Sets the drop mode for this component. */
    @stub
    def setDropMode(dropMode: DropMode): Unit = ???

    /** Sets the editingColumn variable. */
    @stub
    def setEditingColumn(aColumn: Int): Unit = ???

    /** Sets the editingRow variable. */
    @stub
    def setEditingRow(aRow: Int): Unit = ???

    /** Sets whether or not this table is always made large enough
     *  to fill the height of an enclosing viewport.
     */
    @stub
    def setFillsViewportHeight(fillsViewportHeight: Boolean): Unit = ???

    /** Sets the color used to draw grid lines to gridColor and redisplays. */
    @stub
    def setGridColor(gridColor: Color): Unit = ???

    /** Sets the rowMargin and the columnMargin --
     *  the height and width of the space between cells -- to
     *  intercellSpacing.
     */
    @stub
    def setIntercellSpacing(intercellSpacing: Dimension): Unit = ???

    /** Sets the data model for this table to newModel and registers
     *  with it for listener notifications from the new data model.
     */
    @stub
    def setModel(dataModel: TableModel): Unit = ???

    /** Sets the preferred size of the viewport for this table. */
    @stub
    def setPreferredScrollableViewportSize(size: Dimension): Unit = ???

    /** Sets the height, in pixels, of all cells to rowHeight,
     *  revalidates, and repaints.
     */
    @stub
    def setRowHeight(rowHeight: Int): Unit = ???

    /** Sets the height for row to rowHeight,
     *  revalidates, and repaints.
     */
    @stub
    def setRowHeight(row: Int, rowHeight: Int): Unit = ???

    /** Sets the amount of empty space between cells in adjacent rows. */
    @stub
    def setRowMargin(rowMargin: Int): Unit = ???

    /** Sets whether the rows in this model can be selected. */
    @stub
    def setRowSelectionAllowed(rowSelectionAllowed: Boolean): Unit = ???

    /** Selects the rows from index0 to index1,
     *  inclusive.
     */
    @stub
    def setRowSelectionInterval(index0: Int, index1: Int): Unit = ???

    /** Sets the RowSorter. */
    @stub
    def setRowSorter(sorter: RowSorter[_ <: TableModel]): Unit = ???

    /** Sets the background color for selected cells. */
    @stub
    def setSelectionBackground(selectionBackground: Color): Unit = ???

    /** Sets the foreground color for selected cells. */
    @stub
    def setSelectionForeground(selectionForeground: Color): Unit = ???

    /** Sets the table's selection mode to allow only single selections, a single
     *  contiguous interval, or multiple intervals.
     */
    @stub
    def setSelectionMode(selectionMode: Int): Unit = ???

    /** Sets the row selection model for this table to newModel
     *  and registers for listener notifications from the new selection model.
     */
    @stub
    def setSelectionModel(newModel: ListSelectionModel): Unit = ???

    /** Sets whether the table draws grid lines around cells. */
    @stub
    def setShowGrid(showGrid: Boolean): Unit = ???

    /** Sets whether the table draws horizontal lines between cells. */
    @stub
    def setShowHorizontalLines(showHorizontalLines: Boolean): Unit = ???

    /** Sets whether the table draws vertical lines between cells. */
    @stub
    def setShowVerticalLines(showVerticalLines: Boolean): Unit = ???

    /** Sets whether editors in this JTable get the keyboard focus
     *  when an editor is activated as a result of the JTable
     *  forwarding keyboard events for a cell.
     */
    @stub
    def setSurrendersFocusOnKeystroke(surrendersFocusOnKeystroke: Boolean): Unit = ???

    /** Sets the tableHeader working with this JTable to newHeader. */
    @stub
    def setTableHeader(tableHeader: JTableHeader): Unit = ???

    /** Sets the L&F object that renders this component and repaints. */
    @stub
    def setUI(ui: TableUI): Unit = ???

    /** Specifies whether the selection should be updated after sorting. */
    @stub
    def setUpdateSelectionOnSort(update: Boolean): Unit = ???

    /** Sets the value for the cell in the table model at row
     *  and column.
     */
    @stub
    def setValueAt(aValue: Any, row: Int, column: Int): Unit = ???

    /** Deprecated. 
     * As of Swing version 1.0.3,
     *  replaced by doLayout().
     * 
     */
    @stub
    def sizeColumnsToFit(lastColumnOnly: Boolean): Unit = ???

    /** Obsolete as of Java 2 platform v1.4. */
    @stub
    def sizeColumnsToFit(resizingColumn: Int): Unit = ???

    /** RowSorterListener notification that the
     *  RowSorter has changed in some way.
     */
    @stub
    def sorterChanged(e: RowSorterEvent): Unit = ???

    /** Invoked when this table's TableModel generates
     *  a TableModelEvent.
     */
    @stub
    def tableChanged(e: TableModelEvent): Unit = ???

    /** Reverses the effect of configureEnclosingScrollPane
     *  by replacing the columnHeaderView of the enclosing
     *  scroll pane with null.
     */
    @stub
    protected def unconfigureEnclosingScrollPane(): Unit = ???

    /** Notification from the UIManager that the L&F has changed. */
    @stub
    def updateUI(): Unit = ???

    /** Invoked when the row selection changes -- repaints to show the new
     *  selection.
     */
    @stub
    def valueChanged(e: ListSelectionEvent): Unit = ???
}

object JTable {
    /** A subclass of TransferHandler.DropLocation representing
     *  a drop location for a JTable.
     */
    final object DropLocation extends TransferHandler.DropLocation {

        /** Returns the column index where a dropped item should be placed in the
         *  table.
         */
        @stub
        def getColumn(): Int = ???

        /** Returns the row index where a dropped item should be placed in the
         *  table.
         */
        @stub
        def getRow(): Int = ???

        /** Returns whether or not this location represents an insert
         *  of a column.
         */
        @stub
        def isInsertColumn(): Boolean = ???

        /** Returns whether or not this location represents an insert
         *  of a row.
         */
        @stub
        def isInsertRow(): Boolean = ???

        /** Returns a string representation of this drop location. */
        @stub
        def toString(): String = ???
    }


    /** Printing modes, used in printing JTables. */
    class PrintMode private (name: String, ordinal: Int) extends Enum[PrintMode](name, ordinal) {
    }

    object PrintMode {
        /** Printing mode that scales the output smaller, if necessary,
         *  to fit the table's entire width (and thereby all columns) on each page;
         *  Rows are spread across multiple pages as necessary.
         */
        final val FIT_WIDTH: PrintMode = new PrintMode("FIT_WIDTH", 0)

        /** Printing mode that prints the table at its current size,
         *  spreading both columns and rows across multiple pages if necessary.
         */
        final val NORMAL: PrintMode = new PrintMode("NORMAL", 1)

        /** Returns the enum constant of this type with the specified name. */
        @stub
        def valueOf(name: String): PrintMode = ???

        /** Returns an array containing the constants of this enum type, in
         * the order they are declared.
         */
        @stub
        def values(): Array[PrintMode] = ???
    }


    /** During all resize operations, proportionately resize all columns. */
    @stub
    val AUTO_RESIZE_ALL_COLUMNS: Int = ???

    /** During all resize operations, apply adjustments to the last column only. */
    @stub
    val AUTO_RESIZE_LAST_COLUMN: Int = ???

    /** When a column is adjusted in the UI, adjust the next column the opposite way. */
    @stub
    val AUTO_RESIZE_NEXT_COLUMN: Int = ???

    /** Do not adjust column widths automatically; use a horizontal scrollbar instead. */
    @stub
    val AUTO_RESIZE_OFF: Int = ???

    /** During UI adjustment, change subsequent columns to preserve the total width;
     *  this is the default behavior.
     */
    @stub
    val AUTO_RESIZE_SUBSEQUENT_COLUMNS: Int = ???

    /** Deprecated. 
     * As of Swing version 1.0.2,
     *  replaced by new JScrollPane(aTable).
     * 
     */
    @stub
    def createScrollPaneForTable(aTable: JTable): JScrollPane = ???
}
