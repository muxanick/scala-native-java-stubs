package javax.swing.plaf.basic

import java.awt.{Component.BaselineResizeBehavior, Dimension, Graphics, Point, Rectangle}
import java.awt.event.{FocusEvent, FocusListener, MouseEvent}
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import javax.swing.{CellRendererPane, JComponent, JList, ListCellRenderer, ListModel, ListSelectionModel}
import javax.swing.event.{ListDataEvent, ListDataListener, ListSelectionEvent, ListSelectionListener, MouseInputListener}
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

    /** This class should be treated as a "protected" inner class.
     *  Instantiate it only within subclasses of BasicListUI.
     */
    class FocusHandler extends Object with FocusListener {

        /**  */
        @stub
        def this() = ???

        /** Invoked when a component gains the keyboard focus. */
        @stub
        def focusGained(e: FocusEvent): Unit = ???

        /** Invoked when a component loses the keyboard focus. */
        @stub
        def focusLost(e: FocusEvent): Unit = ???

        /**  */
        @stub
        protected def repaintCellFocus(): Unit = ???
    }


    /** The ListDataListener that's added to the JLists model at
     *  installUI time, and whenever the JList.model property changes.
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
    class ListDataHandler extends Object with ListDataListener {

        /**  */
        @stub
        def this() = ???

        /** Sent when the contents of the list has changed in a way
         *  that's too complex to characterize with the previous
         *  methods.
         */
        @stub
        def contentsChanged(e: ListDataEvent): Unit = ???

        /** Sent after the indices in the index0,index1
         *  interval have been inserted in the data model.
         */
        @stub
        def intervalAdded(e: ListDataEvent): Unit = ???

        /** Sent after the indices in the index0,index1 interval
         *  have been removed from the data model.
         */
        @stub
        def intervalRemoved(e: ListDataEvent): Unit = ???
    }


    /** The ListSelectionListener that's added to the JLists selection
     *  model at installUI time, and whenever the JList.selectionModel property
     *  changes.  When the selection changes we repaint the affected rows.
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
    class ListSelectionHandler extends Object with ListSelectionListener {

        /**  */
        @stub
        def this() = ???

        /** Called whenever the value of the selection changes. */
        @stub
        def valueChanged(e: ListSelectionEvent): Unit = ???
    }


    /** Mouse input, and focus handling for JList.  An instance of this
     *  class is added to the appropriate java.awt.Component lists
     *  at installUI() time.  Note keyboard input is handled with JComponent
     *  KeyboardActions, see installKeyboardActions().
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
    class MouseInputHandler extends Object with MouseInputListener {

        /**  */
        @stub
        def this() = ???

        /** Invoked when the mouse button has been clicked (pressed
         *  and released) on a component.
         */
        @stub
        def mouseClicked(e: MouseEvent): Unit = ???

        /** Invoked when a mouse button is pressed on a component and then
         *  dragged.
         */
        @stub
        def mouseDragged(e: MouseEvent): Unit = ???

        /** Invoked when the mouse enters a component. */
        @stub
        def mouseEntered(e: MouseEvent): Unit = ???

        /** Invoked when the mouse exits a component. */
        @stub
        def mouseExited(e: MouseEvent): Unit = ???

        /** Invoked when the mouse cursor has been moved onto a component
         *  but no buttons have been pushed.
         */
        @stub
        def mouseMoved(e: MouseEvent): Unit = ???

        /** Invoked when a mouse button has been pressed on a component. */
        @stub
        def mousePressed(e: MouseEvent): Unit = ???

        /** Invoked when a mouse button has been released on a component. */
        @stub
        def mouseReleased(e: MouseEvent): Unit = ???
    }


    /** The PropertyChangeListener that's added to the JList at
     *  installUI time.  When the value of a JList property that
     *  affects layout changes, we set a bit in updateLayoutStateNeeded.
     *  If the JLists model changes we additionally remove our listeners
     *  from the old model.  Likewise for the JList selectionModel.
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
    class PropertyChangeHandler extends Object with PropertyChangeListener {

        /**  */
        @stub
        def this() = ???

        /** This method gets called when a bound property is changed. */
        @stub
        def propertyChange(e: PropertyChangeEvent): Unit = ???
    }


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
