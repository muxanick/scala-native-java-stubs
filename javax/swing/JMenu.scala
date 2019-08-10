package javax.swing

import java.awt.{Component, Component.AccessibleAWTComponent, ComponentOrientation, Container, Container.AccessibleAWTContainer, Point}
import java.awt.event.{KeyEvent, WindowAdapter, WindowEvent}
import java.beans.PropertyChangeListener
import java.io.Serializable
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext, AccessibleRole, AccessibleSelection}
import javax.swing.event.MenuListener
import scala.scalanative.annotation.stub

/** An implementation of a menu -- a popup window containing
 *  JMenuItems that
 *  is displayed when the user selects an item on the JMenuBar.
 *  In addition to JMenuItems, a JMenu can
 *  also contain JSeparators.
 *  
 *  In essence, a menu is a button with an associated JPopupMenu.
 *  When the "button" is pressed, the JPopupMenu appears. If the
 *  "button" is on the JMenuBar, the menu is a top-level window.
 *  If the "button" is another menu item, then the JPopupMenu is
 *  "pull-right" menu.
 *  
 *  Menus can be configured, and to some degree controlled, by
 *  Actions.  Using an
 *  Action with a menu has many benefits beyond directly
 *  configuring a menu.  Refer to 
 *  Swing Components Supporting Action for more
 *  details, and you can find more information in How
 *  to Use Actions, a section in The Java Tutorial.
 *  
 *  For information and examples of using menus see
 *  How to Use Menus,
 *  a section in The Java Tutorial.
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
class JMenu extends JMenuItem with Accessible with MenuElement {

    /** Constructs a new JMenu with no text. */
    @stub
    def this() = ???

    /** Constructs a menu whose properties are taken from the
     *  Action supplied.
     */
    @stub
    def this(a: Action) = ???

    /** Constructs a new JMenu with the supplied string
     *  as its text.
     */
    @stub
    def this(s: String) = ???

    /** Constructs a new JMenu with the supplied string as
     *  its text and specified as a tear-off menu or not.
     */
    @stub
    def this(s: String, b: Boolean) = ???

    /** This class implements accessibility support for the
     *  JMenu class.  It provides an implementation of the
     *  Java Accessibility API appropriate to menu user-interface elements.
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
    protected class AccessibleJMenu extends JMenuItem.AccessibleJMenuItem with AccessibleSelection {

        /**  */
        @stub
        protected def this() = ???

        /** Selects the ith menu in the menu. */
        @stub
        def addAccessibleSelection(i: Int): Unit = ???

        /** Clears the selection in the object, so that nothing in the
         *  object is selected.
         */
        @stub
        def clearAccessibleSelection(): Unit = ???

        /** Returns the nth Accessible child of the object. */
        @stub
        def getAccessibleChild(i: Int): Accessible = ???

        /** Returns the number of accessible children in the object. */
        @stub
        def getAccessibleChildrenCount(): Int = ???

        /** Get the role of this object. */
        @stub
        def getAccessibleRole(): AccessibleRole = ???

        /** Get the AccessibleSelection associated with this object. */
        @stub
        def getAccessibleSelection(): AccessibleSelection = ???

        /** Returns the currently selected sub-menu if one is selected,
         *  otherwise null (there can only be one selection, and it can
         *  only be a sub-menu, as otherwise menu items don't remain
         *  selected).
         */
        @stub
        def getAccessibleSelection(i: Int): Accessible = ???

        /** Returns 1 if a sub-menu is currently selected in this menu. */
        @stub
        def getAccessibleSelectionCount(): Int = ???

        /** Returns true if the current child of this object is selected
         *  (that is, if this child is a popped-up submenu).
         */
        @stub
        def isAccessibleChildSelected(i: Int): Boolean = ???

        /** Removes the nth item from the selection. */
        @stub
        def removeAccessibleSelection(i: Int): Unit = ???

        /** Normally causes every selected item in the object to be selected
         *  if the object supports multiple selections.
         */
        @stub
        def selectAllAccessibleSelection(): Unit = ???
    }


    /** A listener class that watches for a popup window closing.
     *  When the popup is closing, the listener deselects the menu.
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
    protected class WinListener extends WindowAdapter with Serializable {

        /** Create the window listener for the specified popup. */
        @stub
        def this(p: JPopupMenu) = ???

        /** Deselect the menu when the popup is closed from outside. */
        @stub
        def windowClosing(e: WindowEvent): Unit = ???
    }


    /** The window-closing listener for the popup. */
    @stub
    protected val popupListener: JMenu.WinListener = ???

    /** Creates a new menu item attached to the specified
     *  Action object and appends it to the end of this menu.
     */
    @stub
    def add(a: Action): JMenuItem = ???

    /** Appends a component to the end of this menu. */
    @stub
    def add(c: Component): Component = ???

    /** Adds the specified component to this container at the given
     *  position.
     */
    @stub
    def add(c: Component, index: Int): Component = ???

    /** Appends a menu item to the end of this menu. */
    @stub
    def add(menuItem: JMenuItem): JMenuItem = ???

    /** Creates a new menu item with the specified text and appends
     *  it to the end of this menu.
     */
    @stub
    def add(s: String): JMenuItem = ???

    /** Adds a listener for menu events. */
    @stub
    def addMenuListener(l: MenuListener): Unit = ???

    /** Appends a new separator to the end of the menu. */
    @stub
    def addSeparator(): Unit = ???

    /** Sets the ComponentOrientation property of this menu
     *  and all components contained within it.
     */
    @stub
    def applyComponentOrientation(o: ComponentOrientation): Unit = ???

    /** Returns a properly configured PropertyChangeListener
     *  which updates the control as changes to the Action occur.
     */
    @stub
    protected def createActionChangeListener(b: JMenuItem): PropertyChangeListener = ???

    /** Factory method which creates the JMenuItem for
     *  Actions added to the JMenu.
     */
    @stub
    protected def createActionComponent(a: Action): JMenuItem = ???

    /** Creates a window-closing listener for the popup. */
    @stub
    protected def createWinListener(p: JPopupMenu): JMenu.WinListener = ???

    /** Programmatically performs a "click". */
    @stub
    def doClick(pressTime: Int): Unit = ???

    /** Notifies all listeners that have registered interest for
     *  notification on this event type.
     */
    @stub
    protected def fireMenuCanceled(): Unit = ???

    /** Notifies all listeners that have registered interest for
     *  notification on this event type.
     */
    @stub
    protected def fireMenuDeselected(): Unit = ???

    /** Notifies all listeners that have registered interest for
     *  notification on this event type.
     */
    @stub
    protected def fireMenuSelected(): Unit = ???

    /** Gets the AccessibleContext associated with this JMenu. */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Returns the java.awt.Component used to
     *  paint this MenuElement.
     */
    @stub
    def getComponent(): Component = ???

    /** Returns the suggested delay, in milliseconds, before submenus
     *  are popped up or down.
     */
    @stub
    def getDelay(): Int = ???

    /** Returns the JMenuItem at the specified position. */
    @stub
    def getItem(pos: Int): JMenuItem = ???

    /** Returns the number of items on the menu, including separators. */
    @stub
    def getItemCount(): Int = ???

    /** Returns the component at position n. */
    @stub
    def getMenuComponent(n: Int): Component = ???

    /** Returns the number of components on the menu. */
    @stub
    def getMenuComponentCount(): Int = ???

    /** Returns an array of Components of the menu's
     *  subcomponents.
     */
    @stub
    def getMenuComponents(): Array[Component] = ???

    /** Returns an array of all the MenuListeners added
     *  to this JMenu with addMenuListener().
     */
    @stub
    def getMenuListeners(): Array[MenuListener] = ???

    /** Returns the popupmenu associated with this menu. */
    @stub
    def getPopupMenu(): JPopupMenu = ???

    /** Computes the origin for the JMenu's popup menu. */
    @stub
    protected def getPopupMenuOrigin(): Point = ???

    /** Returns an array of MenuElements containing the submenu
     *  for this menu component.
     */
    @stub
    def getSubElements(): Array[MenuElement] = ???

    /** Returns the name of the L&F class that renders this component. */
    @stub
    def getUIClassID(): String = ???

    /** Inserts a new menu item attached to the specified Action
     *  object at a given position.
     */
    @stub
    def insert(a: Action, pos: Int): JMenuItem = ???

    /** Inserts the specified JMenuitem at a given position. */
    @stub
    def insert(mi: JMenuItem, pos: Int): JMenuItem = ???

    /** Inserts a new menu item with the specified text at a
     *  given position.
     */
    @stub
    def insert(s: String, pos: Int): Unit = ???

    /** Inserts a separator at the specified position. */
    @stub
    def insertSeparator(index: Int): Unit = ???

    /** Returns true if the specified component exists in the
     *  submenu hierarchy.
     */
    @stub
    def isMenuComponent(c: Component): Boolean = ???

    /** Returns true if the menu's popup window is visible. */
    @stub
    def isPopupMenuVisible(): Boolean = ???

    /** Returns true if the menu is currently selected (highlighted). */
    @stub
    def isSelected(): Boolean = ???

    /** Returns true if the menu can be torn off. */
    @stub
    def isTearOff(): Boolean = ???

    /** Returns true if the menu is a 'top-level menu', that is, if it is
     *  the direct child of a menubar.
     */
    @stub
    def isTopLevelMenu(): Boolean = ???

    /** Messaged when the menubar selection changes to activate or
     *  deactivate this menu.
     */
    @stub
    def menuSelectionChanged(isIncluded: Boolean): Unit = ???

    /** Returns a string representation of this JMenu. */
    @stub
    protected def paramString(): String = ???

    /** Processes key stroke events such as mnemonics and accelerators. */
    @stub
    protected def processKeyEvent(evt: KeyEvent): Unit = ???

    /** Removes the component c from this menu. */
    @stub
    def remove(c: Component): Unit = ???

    /** Removes the menu item at the specified index from this menu. */
    @stub
    def remove(pos: Int): Unit = ???

    /** Removes the specified menu item from this menu. */
    @stub
    def remove(item: JMenuItem): Unit = ???

    /** Removes all menu items from this menu. */
    @stub
    def removeAll(): Unit = ???

    /** Removes a listener for menu events. */
    @stub
    def removeMenuListener(l: MenuListener): Unit = ???

    /** setAccelerator is not defined for JMenu. */
    @stub
    def setAccelerator(keyStroke: KeyStroke): Unit = ???

    /** Sets the language-sensitive orientation that is to be used to order
     *  the elements or text within this component.
     */
    @stub
    def setComponentOrientation(o: ComponentOrientation): Unit = ???

    /** Sets the suggested delay before the menu's PopupMenu
     *  is popped up or down.
     */
    @stub
    def setDelay(d: Int): Unit = ???

    /** Sets the location of the popup component. */
    @stub
    def setMenuLocation(x: Int, y: Int): Unit = ???

    /** Sets the data model for the "menu button" -- the label
     *  that the user clicks to open or close the menu.
     */
    @stub
    def setModel(newModel: ButtonModel): Unit = ???

    /** Sets the visibility of the menu's popup. */
    @stub
    def setPopupMenuVisible(b: Boolean): Unit = ???

    /** Sets the selection status of the menu. */
    @stub
    def setSelected(b: Boolean): Unit = ???

    /** Resets the UI property with a value from the current look and feel. */
    @stub
    def updateUI(): Unit = ???
}
