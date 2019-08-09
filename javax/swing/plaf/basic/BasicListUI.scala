package javax.swing.plaf.basic

import java.awt.{Component.BaselineResizeBehavior, Dimension, Graphics, Point, Rectangle}
import java.awt.event.FocusListener
import java.beans.PropertyChangeListener
import java.lang.Object
import javax.swing.{CellRendererPane, JComponent, JList, ListCellRenderer, ListModel, ListSelectionModel}
import javax.swing.event.{ListDataListener, ListSelectionListener, MouseInputListener}
import javax.swing.plaf.{ComponentUI, ListUI}
import scala.scalanative.annotation.stub

/** An extensible implementation of ListUI.
 *  
 *  BasicListUI instances cannot be shared between multiple
 *  lists.
 */
class BasicListUI extends ListUI {

    /**  */
    @stub
    def this() = ???

    /** This class should be treated as a "protected" inner class. */
    @stub
    object FocusHandler extends BasicListUI.FocusHandler

    /** The ListDataListener that's added to the JLists model at
     *  installUI time, and whenever the JList.model property changes.
     */
    @stub
    object ListDataHandler extends BasicListUI.ListDataHandler

    /** The ListSelectionListener that's added to the JLists selection
     *  model at installUI time, and whenever the JList.selectionModel property
     *  changes.
     */
    @stub
    object ListSelectionHandler extends BasicListUI.ListSelectionHandler

    /** Mouse input, and focus handling for JList. */
    @stub
    object MouseInputHandler extends BasicListUI.MouseInputHandler

    /** The PropertyChangeListener that's added to the JList at
     *  installUI time.
     */
    @stub
    object PropertyChangeHandler extends BasicListUI.PropertyChangeHandler

    /**  */
    @stub
    protected val cellHeight: Int = ???

    /**  */
    @stub
    protected val cellHeights: Array[Int] = ???

    /**  */
    @stub
    protected val cellWidth: Int = ???

    /**  */
    @stub
    protected val focusListener: FocusListener = ???

    /**  */
    @stub
    protected val list: JList = ???

    /**  */
    @stub
    protected val listDataListener: ListDataListener = ???

    /**  */
    @stub
    protected val listSelectionListener: ListSelectionListener = ???

    /**  */
    @stub
    protected val mouseInputListener: MouseInputListener = ???

    /**  */
    @stub
    protected val propertyChangeListener: PropertyChangeListener = ???

    /**  */
    @stub
    protected val rendererPane: CellRendererPane = ???

    /**  */
    @stub
    protected val updateLayoutStateNeeded: Int = ???

    /** Return the JList relative Y coordinate of the origin of the specified
     *  row or -1 if row isn't valid.
     */
    @stub
    protected def convertRowToY(row: Int): Int = ???

    /** Convert the JList relative coordinate to the row that contains it,
     *  based on the current layout.
     */
    @stub
    protected def convertYToRow(y0: Int): Int = ???

    /**  */
    @stub
    protected def createFocusListener(): FocusListener = ???

    /** Creates an instance of ListDataListener that's added to
     *  the JLists by model as needed.
     */
    @stub
    protected def createListDataListener(): ListDataListener = ???

    /** Creates an instance of ListSelectionHandler that's added to
     *  the JLists by selectionModel as needed.
     */
    @stub
    protected def createListSelectionListener(): ListSelectionListener = ???

    /** Creates a delegate that implements MouseInputListener. */
    @stub
    protected def createMouseInputListener(): MouseInputListener = ???

    /** Creates an instance of PropertyChangeHandler that's added to
     *  the JList by installUI().
     */
    @stub
    protected def createPropertyChangeListener(): PropertyChangeListener = ???

    /** Returns the baseline. */
    @stub
    def getBaseline(c: JComponent, width: Int, height: Int): Int = ???

    /** Returns an enum indicating how the baseline of the component
     *  changes as the size changes.
     */
    @stub
    def getBaselineResizeBehavior(c: JComponent): Component.BaselineResizeBehavior = ???

    /** Returns the bounding rectangle, in the given list's coordinate system,
     *  for the range of cells specified by the two indices.
     */
    @stub
    def getCellBounds(list: JList, index1: Int, index2: Int): Rectangle = ???

    /** The preferredSize of the list depends upon the layout orientation. */
    @stub
    def getPreferredSize(c: JComponent): Dimension = ???

    /** Returns the height of the specified row based on the current layout. */
    @stub
    protected def getRowHeight(row: Int): Int = ???

    /** Returns the origin in the given JList, of the specified item,
     *  in the list's coordinate system.
     */
    @stub
    def indexToLocation(list: JList, index: Int): Point = ???

    /** Initializes list properties such as font, foreground, and background,
     *  and adds the CellRendererPane.
     */
    @stub
    protected def installDefaults(): Unit = ???

    /** Registers the keyboard bindings on the JList that the
     *  BasicListUI is associated with.
     */
    @stub
    protected def installKeyboardActions(): Unit = ???

    /** Creates and installs the listeners for the JList, its model, and its
     *  selectionModel.
     */
    @stub
    protected def installListeners(): Unit = ???

    /** Initializes this.list by calling installDefaults(),
     *  installListeners(), and installKeyboardActions()
     *  in order.
     */
    @stub
    def installUI(c: JComponent): Unit = ???

    /** Returns the cell index in the specified JList closest to the
     *  given location in the list's coordinate system.
     */
    @stub
    def locationToIndex(list: JList, location: Point): Int = ???

    /** If updateLayoutStateNeeded is non zero, call updateLayoutState() and reset
     *  updateLayoutStateNeeded.
     */
    @stub
    protected def maybeUpdateLayoutState(): Unit = ???

    /** Paint the rows that intersect the Graphics objects clipRect. */
    @stub
    def paint(g: Graphics, c: JComponent): Unit = ???

    /** Paint one List cell: compute the relevant state, get the "rubber stamp"
     *  cell renderer component, and then use the CellRendererPane to paint it.
     */
    @stub
    protected def paintCell(g: Graphics, row: Int, rowBounds: Rectangle, cellRenderer: ListCellRenderer, dataModel: ListModel, selModel: ListSelectionModel, leadIndex: Int): Unit = ???

    /** Selected the previous row and force it to be visible. */
    @stub
    protected def selectNextIndex(): Unit = ???

    /** Selected the previous row and force it to be visible. */
    @stub
    protected def selectPreviousIndex(): Unit = ???

    /** Sets the list properties that have not been explicitly overridden to
     *  null.
     */
    @stub
    protected def uninstallDefaults(): Unit = ???

    /** Unregisters keyboard actions installed from
     *  installKeyboardActions.
     */
    @stub
    protected def uninstallKeyboardActions(): Unit = ???

    /** Removes the listeners from the JList, its model, and its
     *  selectionModel.
     */
    @stub
    protected def uninstallListeners(): Unit = ???

    /** Uninitializes this.list by calling uninstallListeners(),
     *  uninstallKeyboardActions(), and uninstallDefaults()
     *  in order.
     */
    @stub
    def uninstallUI(c: JComponent): Unit = ???

    /** Recompute the value of cellHeight or cellHeights based
     *  and cellWidth, based on the current font and the current
     *  values of fixedCellWidth, fixedCellHeight, and prototypeCellValue.
     */
    @stub
    protected def updateLayoutState(): Unit = ???
}

object BasicListUI {
    /**  */
    @stub
    protected val cellRendererChanged: Int = ???

    /**  */
    @stub
    protected val fixedCellHeightChanged: Int = ???

    /**  */
    @stub
    protected val fixedCellWidthChanged: Int = ???

    /**  */
    @stub
    protected val fontChanged: Int = ???

    /**  */
    @stub
    protected val modelChanged: Int = ???

    /**  */
    @stub
    protected val prototypeCellValueChanged: Int = ???

    /**  */
    @stub
    protected val selectionModelChanged: Int = ???

    /** Returns a new instance of BasicListUI. */
    @stub
    def createUI(list: JComponent): ComponentUI = ???
}
