package javax.swing.plaf.basic

import java.awt.{Component.BaselineResizeBehavior, Dimension, Graphics, Point, Rectangle}
import java.awt.event.FocusListener
import java.beans.PropertyChangeListener
import java.lang.Object
import javax.swing.{CellRendererPane, JComponent, JList, ListCellRenderer, ListModel, ListSelectionModel}
import javax.swing.event.{ListDataListener, ListSelectionListener, MouseInputListener}
import javax.swing.plaf.{ComponentUI, ListUI}

// An extensible implementation of ListUI.
// 
// BasicListUI instances cannot be shared between multiple
// lists.
class BasicListUI extends ListUI {

    @stub
    // This class should be treated as a "protected" inner class.
    def BasicListUI.FocusHandler: class = ???

    @stub
    // The ListDataListener that's added to the JLists model at
    // installUI time, and whenever the JList.model property changes.
    def BasicListUI.ListDataHandler: class = ???

    @stub
    // The ListSelectionListener that's added to the JLists selection
    // model at installUI time, and whenever the JList.selectionModel property
    // changes.
    def BasicListUI.ListSelectionHandler: class = ???

    @stub
    // Mouse input, and focus handling for JList.
    def BasicListUI.MouseInputHandler: class = ???

    @stub
    // 
    protected def cellHeight: Int = ???

    @stub
    // 
    protected def cellHeights: Array[Int] = ???

    @stub
    // 
    protected def cellWidth: Int = ???

    @stub
    // 
    protected def focusListener: FocusListener = ???

    @stub
    // 
    protected def list: JList = ???

    @stub
    // 
    protected def listDataListener: ListDataListener = ???

    @stub
    // 
    protected def listSelectionListener: ListSelectionListener = ???

    @stub
    // 
    protected def mouseInputListener: MouseInputListener = ???

    @stub
    // 
    protected def propertyChangeListener: PropertyChangeListener = ???

    @stub
    // 
    protected def rendererPane: CellRendererPane = ???

    @stub
    // Return the JList relative Y coordinate of the origin of the specified
    // row or -1 if row isn't valid.
    protected def convertRowToY(row: Int): Int = ???

    @stub
    // Convert the JList relative coordinate to the row that contains it,
    // based on the current layout.
    protected def convertYToRow(y0: Int): Int = ???

    @stub
    // 
    protected def createFocusListener(): FocusListener = ???

    @stub
    // Creates an instance of ListDataListener that's added to
    // the JLists by model as needed.
    protected def createListDataListener(): ListDataListener = ???

    @stub
    // Creates an instance of ListSelectionHandler that's added to
    // the JLists by selectionModel as needed.
    protected def createListSelectionListener(): ListSelectionListener = ???

    @stub
    // Creates a delegate that implements MouseInputListener.
    protected def createMouseInputListener(): MouseInputListener = ???

    @stub
    // Creates an instance of PropertyChangeHandler that's added to
    // the JList by installUI().
    protected def createPropertyChangeListener(): PropertyChangeListener = ???

    @stub
    // Returns the baseline.
    def getBaseline(c: JComponent, width: Int, height: Int): Int = ???

    @stub
    // Returns an enum indicating how the baseline of the component
    // changes as the size changes.
    def getBaselineResizeBehavior(c: JComponent): Component.BaselineResizeBehavior = ???

    @stub
    // Returns the bounding rectangle, in the given list's coordinate system,
    // for the range of cells specified by the two indices.
    def getCellBounds(list: JList, index1: Int, index2: Int): Rectangle = ???

    @stub
    // The preferredSize of the list depends upon the layout orientation.
    def getPreferredSize(c: JComponent): Dimension = ???

    @stub
    // Returns the height of the specified row based on the current layout.
    protected def getRowHeight(row: Int): Int = ???

    @stub
    // Returns the origin in the given JList, of the specified item,
    // in the list's coordinate system.
    def indexToLocation(list: JList, index: Int): Point = ???

    @stub
    // Initializes list properties such as font, foreground, and background,
    // and adds the CellRendererPane.
    protected def installDefaults(): Unit = ???

    @stub
    // Registers the keyboard bindings on the JList that the
    // BasicListUI is associated with.
    protected def installKeyboardActions(): Unit = ???

    @stub
    // Creates and installs the listeners for the JList, its model, and its
    // selectionModel.
    protected def installListeners(): Unit = ???

    @stub
    // Initializes this.list by calling installDefaults(),
    // installListeners(), and installKeyboardActions()
    // in order.
    def installUI(c: JComponent): Unit = ???

    @stub
    // Returns the cell index in the specified JList closest to the
    // given location in the list's coordinate system.
    def locationToIndex(list: JList, location: Point): Int = ???

    @stub
    // If updateLayoutStateNeeded is non zero, call updateLayoutState() and reset
    // updateLayoutStateNeeded.
    protected def maybeUpdateLayoutState(): Unit = ???

    @stub
    // Paint the rows that intersect the Graphics objects clipRect.
    def paint(g: Graphics, c: JComponent): Unit = ???

    @stub
    // Paint one List cell: compute the relevant state, get the "rubber stamp"
    // cell renderer component, and then use the CellRendererPane to paint it.
    protected def paintCell(g: Graphics, row: Int, rowBounds: Rectangle, cellRenderer: ListCellRenderer, dataModel: ListModel, selModel: ListSelectionModel, leadIndex: Int): Unit = ???

    @stub
    // Selected the previous row and force it to be visible.
    protected def selectNextIndex(): Unit = ???

    @stub
    // Selected the previous row and force it to be visible.
    protected def selectPreviousIndex(): Unit = ???

    @stub
    // Sets the list properties that have not been explicitly overridden to
    // null.
    protected def uninstallDefaults(): Unit = ???

    @stub
    // Unregisters keyboard actions installed from
    // installKeyboardActions.
    protected def uninstallKeyboardActions(): Unit = ???

    @stub
    // Removes the listeners from the JList, its model, and its
    // selectionModel.
    protected def uninstallListeners(): Unit = ???

    @stub
    // Uninitializes this.list by calling uninstallListeners(),
    // uninstallKeyboardActions(), and uninstallDefaults()
    // in order.
    def uninstallUI(c: JComponent): Unit = ???
}

object BasicListUI {
    @stub
    // 
    protected def cellRendererChanged: Int = ???

    @stub
    // 
    protected def fixedCellHeightChanged: Int = ???

    @stub
    // 
    protected def fixedCellWidthChanged: Int = ???

    @stub
    // 
    protected def fontChanged: Int = ???

    @stub
    // 
    protected def modelChanged: Int = ???

    @stub
    // 
    protected def prototypeCellValueChanged: Int = ???

    @stub
    // 
    protected def selectionModelChanged: Int = ???

    @stub
    // Returns a new instance of BasicListUI.
    def createUI(list: JComponent): ComponentUI = ???
}
