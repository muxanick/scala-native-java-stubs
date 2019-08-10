package javax.swing.plaf.basic

import java.awt.{Component, Component.BaselineResizeBehavior, Container, Dimension, Graphics, Insets, LayoutManager, Rectangle}
import java.awt.event.{FocusEvent, FocusListener, ItemEvent, ItemListener, KeyAdapter, KeyEvent, KeyListener, MouseListener, MouseMotionListener}
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.{Object, String}
import javax.accessibility.Accessible
import javax.swing.{CellRendererPane, ComboBoxEditor, JButton, JComboBox, JComponent, JList, ListCellRenderer}
import javax.swing.event.{ListDataEvent, ListDataListener}
import javax.swing.plaf.{ComboBoxUI, ComponentUI}
import scala.scalanative.annotation.stub

/** Basic UI implementation for JComboBox.
 *  
 *  The combo box is a compound component which means that it is an aggregate of
 *  many simpler components. This class creates and manages the listeners
 *  on the combo box and the combo box model. These listeners update the user
 *  interface in response to changes in the properties and state of the combo box.
 *  
 *  All event handling is handled by listener classes created with the
 *  createxxxListener() methods and internal classes.
 *  You can change the behavior of this class by overriding the
 *  createxxxListener() methods and supplying your own
 *  event listeners or subclassing from the ones supplied in this class.
 *  
 *  For adding specific actions,
 *  overide installKeyboardActions to add actions in response to
 *  KeyStroke bindings. See the article How to Use Key Bindings
 */
class BasicComboBoxUI extends ComboBoxUI {

    /**  */
    @stub
    def this() = ???

    /** This layout manager handles the 'standard' layout of combo boxes.  It puts
     *  the arrow button to the right and the editor to the left.  If there is no
     *  editor it still keeps the arrow button to the right.
     * 
     *  This public inner class should be treated as protected.
     *  Instantiate it only within subclasses of
     *  BasicComboBoxUI.
     */
    class ComboBoxLayoutManager extends Object with LayoutManager {

        /**  */
        @stub
        def this() = ???

        /** If the layout manager uses a per-component string,
         *  adds the component comp to the layout,
         *  associating it
         *  with the string specified by name.
         */
        @stub
        def addLayoutComponent(name: String, comp: Component): Unit = ???

        /** Lays out the specified container. */
        @stub
        def layoutContainer(parent: Container): Unit = ???

        /** Calculates the minimum size dimensions for the specified
         *  container, given the components it contains.
         */
        @stub
        def minimumLayoutSize(parent: Container): Dimension = ???

        /** Calculates the preferred size dimensions for the specified
         *  container, given the components it contains.
         */
        @stub
        def preferredLayoutSize(parent: Container): Dimension = ???

        /** Removes the specified component from the layout. */
        @stub
        def removeLayoutComponent(comp: Component): Unit = ???
    }


    /** This listener hides the popup when the focus is lost.  It also repaints
     *  when focus is gained or lost.
     * 
     *  This public inner class should be treated as protected.
     *  Instantiate it only within subclasses of
     *  BasicComboBoxUI.
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
    }


    /** This listener watches for changes to the selection in the
     *  combo box.
     *  
     *  This public inner class should be treated as protected.
     *  Instantiate it only within subclasses of
     *  BasicComboBoxUI.
     */
    class ItemHandler extends Object with ItemListener {

        /**  */
        @stub
        def this() = ???

        /** Invoked when an item has been selected or deselected by the user. */
        @stub
        def itemStateChanged(e: ItemEvent): Unit = ???
    }


    /** This listener checks to see if the key event isn't a navigation key.  If
     *  it finds a key event that wasn't a navigation key it dispatches it to
     *  JComboBox.selectWithKeyChar() so that it can do type-ahead.
     * 
     *  This public inner class should be treated as protected.
     *  Instantiate it only within subclasses of
     *  BasicComboBoxUI.
     */
    class KeyHandler extends KeyAdapter {

        /**  */
        @stub
        def this() = ???

        /** Invoked when a key has been pressed. */
        @stub
        def keyPressed(e: KeyEvent): Unit = ???
    }


    /** This listener watches for changes in the
     *  ComboBoxModel.
     *  
     *  This public inner class should be treated as protected.
     *  Instantiate it only within subclasses of
     *  BasicComboBoxUI.
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


    /** This listener watches for bound properties that have changed in the
     *  combo box.
     *  
     *  Subclasses which wish to listen to combo box property changes should
     *  call the superclass methods to ensure that the combo box ui correctly
     *  handles property changes.
     *  
     *  This public inner class should be treated as protected.
     *  Instantiate it only within subclasses of
     *  BasicComboBoxUI.
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
    protected val arrowButton: JButton = ???

    /**  */
    @stub
    protected val cachedMinimumSize: Dimension = ???

    /**  */
    @stub
    protected val comboBox: JComboBox = ???

    /**  */
    @stub
    protected val currentValuePane: CellRendererPane = ???

    /**  */
    @stub
    protected val editor: Component = ???

    /** This protected field is implementation specific. */
    @stub
    protected val focusListener: FocusListener = ???

    /** This protected field is implementation specific. */
    @stub
    protected val hasFocus: Boolean = ???

    /**  */
    @stub
    protected val isMinimumSizeDirty: Boolean = ???

    /** This protected field is implementation specific. */
    @stub
    protected val itemListener: ItemListener = ???

    /** This protected field is implementation specific. */
    @stub
    protected val keyListener: KeyListener = ???

    /**  */
    @stub
    protected val listBox: JList = ???

    /** This protected field is implementation specific. */
    @stub
    protected val listDataListener: ListDataListener = ???

    /** If specified, these insets act as padding around the cell renderer when
     *  laying out and painting the "selected" item in the combo box.
     */
    @stub
    protected val padding: Insets = ???

    /**  */
    @stub
    protected val popup: ComboPopup = ???

    /**  */
    @stub
    protected val popupKeyListener: KeyListener = ???

    /**  */
    @stub
    protected val popupMouseListener: MouseListener = ???

    /**  */
    @stub
    protected val popupMouseMotionListener: MouseMotionListener = ???

    /** This protected field is implementation specific. */
    @stub
    protected val propertyChangeListener: PropertyChangeListener = ???

    /** Indicates whether or not the combo box button should be square. */
    @stub
    protected val squareButton: Boolean = ???

    /** This public method is implementation specific and should be private. */
    @stub
    def addEditor(): Unit = ???

    /** This public method is implementation specific and should be private. */
    @stub
    def configureArrowButton(): Unit = ???

    /** This protected method is implementation specific and should be private. */
    @stub
    protected def configureEditor(): Unit = ???

    /** Creates a button which will be used as the control to show or hide
     *  the popup portion of the combo box.
     */
    @stub
    protected def createArrowButton(): JButton = ???

    /** Creates the default editor that will be used in editable combo boxes. */
    @stub
    protected def createEditor(): ComboBoxEditor = ???

    /** Creates a FocusListener which will be added to the combo box. */
    @stub
    protected def createFocusListener(): FocusListener = ???

    /** Creates an ItemListener which will be added to the
     *  combo box.
     */
    @stub
    protected def createItemListener(): ItemListener = ???

    /** Creates a KeyListener which will be added to the
     *  combo box.
     */
    @stub
    protected def createKeyListener(): KeyListener = ???

    /** Creates a layout manager for managing the components which make up the
     *  combo box.
     */
    @stub
    protected def createLayoutManager(): LayoutManager = ???

    /** Creates a list data listener which will be added to the
     *  ComboBoxModel.
     */
    @stub
    protected def createListDataListener(): ListDataListener = ???

    /** Creates the popup portion of the combo box. */
    @stub
    protected def createPopup(): ComboPopup = ???

    /** Creates a PropertyChangeListener which will be added to
     *  the combo box.
     */
    @stub
    protected def createPropertyChangeListener(): PropertyChangeListener = ???

    /** Creates the default renderer that will be used in a non-editiable combo
     *  box.
     */
    @stub
    protected def createRenderer(): ListCellRenderer = ???

    /** Returns the ith Accessible child of the object. */
    @stub
    def getAccessibleChild(c: JComponent, i: Int): Accessible = ???

    /** Returns the number of accessible children in the object. */
    @stub
    def getAccessibleChildrenCount(c: JComponent): Int = ???

    /** Returns the baseline. */
    @stub
    def getBaseline(c: JComponent, width: Int, height: Int): Int = ???

    /** Returns an enum indicating how the baseline of the component
     *  changes as the size changes.
     */
    @stub
    def getBaselineResizeBehavior(c: JComponent): Component.BaselineResizeBehavior = ???

    /** Return the default size of an empty display area of the combo box using
     *  the current renderer and font.
     */
    @stub
    protected def getDefaultSize(): Dimension = ???

    /** Returns the calculated size of the display area. */
    @stub
    protected def getDisplaySize(): Dimension = ???

    /** Gets the insets from the JComboBox. */
    @stub
    protected def getInsets(): Insets = ???

    /** Returns the specified component's maximum size appropriate for
     *  the look and feel.
     */
    @stub
    def getMaximumSize(c: JComponent): Dimension = ???

    /** The minimum size is the size of the display area plus insets plus the button. */
    @stub
    def getMinimumSize(c: JComponent): Dimension = ???

    /** Returns the specified component's preferred size appropriate for
     *  the look and feel.
     */
    @stub
    def getPreferredSize(c: JComponent): Dimension = ???

    /** Returns the size a component would have if used as a cell renderer. */
    @stub
    protected def getSizeForComponent(comp: Component): Dimension = ???

    /** Creates and initializes the components which make up the
     *  aggregate combo box.
     */
    @stub
    protected def installComponents(): Unit = ???

    /** Installs the default colors, default font, default renderer, and default
     *  editor into the JComboBox.
     */
    @stub
    protected def installDefaults(): Unit = ???

    /** Adds keyboard actions to the JComboBox. */
    @stub
    protected def installKeyboardActions(): Unit = ???

    /** Creates and installs listeners for the combo box and its model. */
    @stub
    protected def installListeners(): Unit = ???

    /** Configures the specified component appropriately for the look and feel. */
    @stub
    def installUI(c: JComponent): Unit = ???

    /** Determines if the JComboBox is focus traversable. */
    @stub
    def isFocusTraversable(c: JComboBox): Boolean = ???

    /** Returns whether or not the supplied keyCode maps to a key that is used for
     *  navigation.
     */
    @stub
    protected def isNavigationKey(keyCode: Int): Boolean = ???

    /** Tells if the popup is visible or not. */
    @stub
    def isPopupVisible(c: JComboBox): Boolean = ???

    /** Paints the specified component appropriately for the look and feel. */
    @stub
    def paint(g: Graphics, c: JComponent): Unit = ???

    /** Paints the currently selected item. */
    @stub
    def paintCurrentValue(g: Graphics, bounds: Rectangle, hasFocus: Boolean): Unit = ???

    /** Paints the background of the currently selected item. */
    @stub
    def paintCurrentValueBackground(g: Graphics, bounds: Rectangle, hasFocus: Boolean): Unit = ???

    /** Returns the area that is reserved for drawing the currently selected item. */
    @stub
    protected def rectangleForCurrentValue(): Rectangle = ???

    /** This public method is implementation specific and should be private. */
    @stub
    def removeEditor(): Unit = ???

    /** Selects the next item in the list. */
    @stub
    protected def selectNextPossibleValue(): Unit = ???

    /** Selects the previous item in the list. */
    @stub
    protected def selectPreviousPossibleValue(): Unit = ???

    /** Hides the popup. */
    @stub
    def setPopupVisible(c: JComboBox, v: Boolean): Unit = ???

    /** Hides the popup if it is showing and shows the popup if it is hidden. */
    @stub
    protected def toggleOpenClose(): Unit = ???

    /** This public method is implementation specific and should be private. */
    @stub
    def unconfigureArrowButton(): Unit = ???

    /** This protected method is implementation specific and should be private. */
    @stub
    protected def unconfigureEditor(): Unit = ???

    /** The aggregate components which comprise the combo box are
     *  unregistered and uninitialized.
     */
    @stub
    protected def uninstallComponents(): Unit = ???

    /** Uninstalls the default colors, default font, default renderer,
     *  and default editor from the combo box.
     */
    @stub
    protected def uninstallDefaults(): Unit = ???

    /** Removes the focus InputMap and ActionMap. */
    @stub
    protected def uninstallKeyboardActions(): Unit = ???

    /** Removes the installed listeners from the combo box and its model. */
    @stub
    protected def uninstallListeners(): Unit = ???

    /** Reverses configuration which was done on the specified component during
     *  installUI.
     */
    @stub
    def uninstallUI(c: JComponent): Unit = ???
}

object BasicComboBoxUI {
    /**  */
    @stub
    def createUI(c: JComponent): ComponentUI = ???
}
