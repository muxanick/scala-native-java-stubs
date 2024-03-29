package javax.swing.plaf.basic

import java.awt.{Component, Container, Rectangle}
import java.awt.event.{ItemEvent, ItemListener, KeyAdapter, KeyEvent, KeyListener, MouseAdapter, MouseEvent, MouseListener, MouseMotionAdapter, MouseMotionListener}
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import javax.accessibility.AccessibleContext
import javax.swing.{ComboBoxModel, JComboBox, JComponent, JList, JPopupMenu, JScrollPane, Timer}
import javax.swing.event.{ListDataEvent, ListDataListener, ListSelectionEvent, ListSelectionListener}
import scala.scalanative.annotation.stub

/** This is a basic implementation of the ComboPopup interface.
 * 
 *  This class represents the ui for the popup portion of the combo box.
 *  
 *  All event handling is handled by listener classes created with the
 *  createxxxListener() methods and internal classes.
 *  You can change the behavior of this class by overriding the
 *  createxxxListener() methods and supplying your own
 *  event listeners or subclassing from the ones supplied in this class.
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
class BasicComboPopup extends JPopupMenu with ComboPopup {

    /**  */
    @stub
    def this(combo: JComboBox) = ???

    /** As of Java 2 platform v 1.4, this class is now obsolete and is only included for
     *  backwards API compatibility. Do not instantiate or subclass.
     *  
     *  All the functionality of this class has been included in
     *  BasicComboBoxUI ActionMap/InputMap methods.
     */
    class InvocationKeyHandler extends KeyAdapter {

        /**  */
        @stub
        def this() = ???

        /** Invoked when a key has been released. */
        @stub
        def keyReleased(e: KeyEvent): Unit = ???
    }


    /** A listener to be registered upon the combo box
     *  (not its popup menu)
     *  to handle mouse events
     *  that affect the state of the popup menu.
     *  The main purpose of this listener is to make the popup menu
     *  appear and disappear.
     *  This listener also helps
     *  with click-and-drag scenarios by setting the selection if the mouse was
     *  released over the list during a drag.
     * 
     *  
     *  Warning:
     *  We recommend that you not
     *  create subclasses of this class.
     *  If you absolutely must create a subclass,
     *  be sure to invoke the superclass
     *  version of each method.
     */
    protected class InvocationMouseHandler extends MouseAdapter {

        /**  */
        @stub
        protected def this() = ???

        /** Responds to mouse-pressed events on the combo box. */
        @stub
        def mousePressed(e: MouseEvent): Unit = ???

        /** Responds to the user terminating
         *  a click or drag that began on the combo box.
         */
        @stub
        def mouseReleased(e: MouseEvent): Unit = ???
    }


    /** This listener watches for dragging and updates the current selection in the
     *  list if it is dragging over the list.
     */
    protected class InvocationMouseMotionHandler extends MouseMotionAdapter {

        /**  */
        @stub
        protected def this() = ???

        /** Invoked when a mouse button is pressed on a component and then
         *  dragged.
         */
        @stub
        def mouseDragged(e: MouseEvent): Unit = ???
    }


    /** This listener watches for changes to the selection in the
     *  combo box.
     */
    protected class ItemHandler extends Object with ItemListener {

        /**  */
        @stub
        protected def this() = ???

        /** Invoked when an item has been selected or deselected by the user. */
        @stub
        def itemStateChanged(e: ItemEvent): Unit = ???
    }


    /** As of 1.4, this class is now obsolete, doesn't do anything, and
     *  is only included for backwards API compatibility. Do not call or
     *  override.
     *  
     *  The functionality has been migrated into ItemHandler.
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


    /** This listener hides the popup when the mouse is released in the list. */
    protected class ListMouseHandler extends MouseAdapter {

        /**  */
        @stub
        protected def this() = ???

        /** Invoked when a mouse button has been pressed on a component. */
        @stub
        def mousePressed(e: MouseEvent): Unit = ???

        /** Invoked when a mouse button has been released on a component. */
        @stub
        def mouseReleased(anEvent: MouseEvent): Unit = ???
    }


    /** This listener changes the selected item as you move the mouse over the list.
     *  The selection change is not committed to the model, this is for user feedback only.
     */
    protected class ListMouseMotionHandler extends MouseMotionAdapter {

        /**  */
        @stub
        protected def this() = ???

        /** Invoked when the mouse button has been moved on a component
         *  (with no buttons no down).
         */
        @stub
        def mouseMoved(anEvent: MouseEvent): Unit = ???
    }


    /** As of Java 2 platform v 1.4, this class is now obsolete, doesn't do anything, and
     *  is only included for backwards API compatibility. Do not call or
     *  override.
     */
    protected class ListSelectionHandler extends Object with ListSelectionListener {

        /**  */
        @stub
        protected def this() = ???

        /** Called whenever the value of the selection changes. */
        @stub
        def valueChanged(e: ListSelectionEvent): Unit = ???
    }


    /** This listener watches for bound properties that have changed in the
     *  combo box.
     *  
     *  Subclasses which wish to listen to combo box property changes should
     *  call the superclass methods to ensure that the combo popup correctly
     *  handles property changes.
     */
    protected class PropertyChangeHandler extends Object with PropertyChangeListener {

        /**  */
        @stub
        protected def this() = ???

        /** This method gets called when a bound property is changed. */
        @stub
        def propertyChange(e: PropertyChangeEvent): Unit = ???
    }


    /** This protected field is implementation specific. */
    @stub
    protected val autoscrollTimer: Timer = ???

    /**  */
    @stub
    protected val comboBox: JComboBox = ???

    /**  */
    @stub
    protected val hasEntered: Boolean = ???

    /**  */
    @stub
    protected val isAutoScrolling: Boolean = ???

    /** This protected field is implementation specific. */
    @stub
    protected val itemListener: ItemListener = ???

    /** This protected field is implementation specific. */
    @stub
    protected val keyListener: KeyListener = ???

    /** This protected field is implementation specific. */
    @stub
    protected val list: JList = ???

    /** This protected field is implementation specific. */
    @stub
    protected val listDataListener: ListDataListener = ???

    /** This protected field is implementation specific. */
    @stub
    protected val listMouseListener: MouseListener = ???

    /** This protected field is implementation specific. */
    @stub
    protected val listMouseMotionListener: MouseMotionListener = ???

    /** This protected field is implementation specific. */
    @stub
    protected val listSelectionListener: ListSelectionListener = ???

    /** This protected field is implementation specific. */
    @stub
    protected val mouseListener: MouseListener = ???

    /** This protected field is implementation specific. */
    @stub
    protected val mouseMotionListener: MouseMotionListener = ???

    /** This protected field is implementation specific. */
    @stub
    protected val propertyChangeListener: PropertyChangeListener = ???

    /**  */
    @stub
    protected val scrollDirection: Int = ???

    /** This protected field is implementation specific. */
    @stub
    protected val scroller: JScrollPane = ???

    /** As of Java 2 platform v1.4 this previously undocumented field is no
     *  longer used.
     */
    @stub
    protected val valueIsAdjusting: Boolean = ???

    /** This protected method is implementation specific and should be private. */
    @stub
    protected def autoScrollDown(): Unit = ???

    /** This protected method is implementation specific and should be private. */
    @stub
    protected def autoScrollUp(): Unit = ???

    /** Calculate the placement and size of the popup portion of the combo box based
     *  on the combo box location and the enclosing screen bounds.
     */
    @stub
    protected def computePopupBounds(px: Int, py: Int, pw: Int, ph: Int): Rectangle = ???

    /** Configures the list which is used to hold the combo box items in the
     *  popup.
     */
    @stub
    protected def configureList(): Unit = ???

    /** Configures the popup portion of the combo box. */
    @stub
    protected def configurePopup(): Unit = ???

    /** Configures the scrollable portion which holds the list within
     *  the combo box popup.
     */
    @stub
    protected def configureScroller(): Unit = ???

    /**  */
    @stub
    protected def convertMouseEvent(e: MouseEvent): MouseEvent = ???

    /** Creates an ItemListener which will be added to the
     *  combo box.
     */
    @stub
    protected def createItemListener(): ItemListener = ???

    /** Creates the key listener that will be added to the combo box. */
    @stub
    protected def createKeyListener(): KeyListener = ???

    /** Creates the JList used in the popup to display
     *  the items in the combo box model.
     */
    @stub
    protected def createList(): JList = ???

    /** Creates a list data listener which will be added to the
     *  ComboBoxModel.
     */
    @stub
    protected def createListDataListener(): ListDataListener = ???

    /** Creates a mouse listener that watches for mouse events in
     *  the popup's list.
     */
    @stub
    protected def createListMouseListener(): MouseListener = ???

    /** Creates a mouse motion listener that watches for mouse motion
     *  events in the popup's list.
     */
    @stub
    protected def createListMouseMotionListener(): MouseMotionListener = ???

    /** Creates a list selection listener that watches for selection changes in
     *  the popup's list.
     */
    @stub
    protected def createListSelectionListener(): ListSelectionListener = ???

    /** Creates a listener
     *  that will watch for mouse-press and release events on the combo box.
     */
    @stub
    protected def createMouseListener(): MouseListener = ???

    /** Creates the mouse motion listener which will be added to the combo
     *  box.
     */
    @stub
    protected def createMouseMotionListener(): MouseMotionListener = ???

    /** Creates a PropertyChangeListener which will be added to
     *  the combo box.
     */
    @stub
    protected def createPropertyChangeListener(): PropertyChangeListener = ???

    /** Creates the scroll pane which houses the scrollable list. */
    @stub
    protected def createScroller(): JScrollPane = ???

    /** This is is a utility method that helps event handlers figure out where to
     *  send the focus when the popup is brought up.
     */
    @stub
    protected def delegateFocus(e: MouseEvent): Unit = ???

    /** Notifies PopupMenuListeners that this popup menu is
     *  cancelled.
     */
    @stub
    protected def firePopupMenuCanceled(): Unit = ???

    /** Notifies PopupMenuListeners that this popup menu will
     *  become invisible.
     */
    @stub
    protected def firePopupMenuWillBecomeInvisible(): Unit = ???

    /** Notifies PopupMenuListeners that this popup menu will
     *  become visible.
     */
    @stub
    protected def firePopupMenuWillBecomeVisible(): Unit = ???

    /** Gets the AccessibleContext associated with this BasicComboPopup. */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Implementation of ComboPopup.getKeyListener(). */
    @stub
    def getKeyListener(): KeyListener = ???

    /** Implementation of ComboPopup.getList(). */
    @stub
    def getList(): JList = ???

    /** Implementation of ComboPopup.getMouseListener(). */
    @stub
    def getMouseListener(): MouseListener = ???

    /** Implementation of ComboPopup.getMouseMotionListener(). */
    @stub
    def getMouseMotionListener(): MouseMotionListener = ???

    /** Retrieves the height of the popup based on the current
     *  ListCellRenderer and the maximum row count.
     */
    @stub
    protected def getPopupHeightForRowCount(maxRowCount: Int): Int = ???

    /** Implementation of ComboPopup.hide(). */
    @stub
    def hide(): Unit = ???

    /** This method adds the necessary listeners to the JComboBox. */
    @stub
    protected def installComboBoxListeners(): Unit = ???

    /** Installs the listeners on the combo box model. */
    @stub
    protected def installComboBoxModelListeners(model: ComboBoxModel): Unit = ???

    /**  */
    @stub
    protected def installKeyboardActions(): Unit = ???

    /** Adds the listeners to the list control. */
    @stub
    protected def installListListeners(): Unit = ???

    /** Overridden to unconditionally return false. */
    @stub
    def isFocusTraversable(): Boolean = ???

    /** Implementation of ComboPopup.show(). */
    @stub
    def show(): Unit = ???

    /** This protected method is implementation specific and should be private. */
    @stub
    protected def startAutoScrolling(direction: Int): Unit = ???

    /** This protected method is implementation specific and should be private. */
    @stub
    protected def stopAutoScrolling(): Unit = ???

    /** Makes the popup visible if it is hidden and makes it hidden if it is
     *  visible.
     */
    @stub
    protected def togglePopup(): Unit = ???

    /** Removes the listeners from the combo box model */
    @stub
    protected def uninstallComboBoxModelListeners(model: ComboBoxModel): Unit = ???

    /** Called when the UI is uninstalling. */
    @stub
    def uninstallingUI(): Unit = ???

    /**  */
    @stub
    protected def uninstallKeyboardActions(): Unit = ???

    /** A utility method used by the event listeners. */
    @stub
    protected def updateListBoxSelectionForEvent(anEvent: MouseEvent, shouldScroll: Boolean): Unit = ???
}

object BasicComboPopup {
    /**  */
    @stub
    protected val SCROLL_DOWN: Int = ???

    /**  */
    @stub
    protected val SCROLL_UP: Int = ???
}
