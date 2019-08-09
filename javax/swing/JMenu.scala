package javax.swing

import java.awt.{Component, ComponentOrientation, Container, Point}
import java.awt.event.KeyEvent
import java.beans.PropertyChangeListener
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext}
import javax.swing.event.MenuListener

// An implementation of a menu -- a popup window containing
// JMenuItems that
// is displayed when the user selects an item on the JMenuBar.
// In addition to JMenuItems, a JMenu can
// also contain JSeparators.
// 
// In essence, a menu is a button with an associated JPopupMenu.
// When the "button" is pressed, the JPopupMenu appears. If the
// "button" is on the JMenuBar, the menu is a top-level window.
// If the "button" is another menu item, then the JPopupMenu is
// "pull-right" menu.
// 
// Menus can be configured, and to some degree controlled, by
// Actions.  Using an
// Action with a menu has many benefits beyond directly
// configuring a menu.  Refer to 
// Swing Components Supporting Action for more
// details, and you can find more information in How
// to Use Actions, a section in The Java Tutorial.
// 
// For information and examples of using menus see
// How to Use Menus,
// a section in The Java Tutorial.
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
class JMenu extends JMenuItem with Accessible, with MenuElement {

    @stub
    // Constructs a new JMenu with no text.
    def this() = ???

    @stub
    // Constructs a menu whose properties are taken from the
    // Action supplied.
    def this(a: Action) = ???

    @stub
    // Constructs a new JMenu with the supplied string
    // as its text.
    def this(s: String) = ???

    @stub
    // This class implements accessibility support for the
    // JMenu class.
    protected def JMenu.AccessibleJMenu: class = ???

    @stub
    // Creates a new menu item attached to the specified
    // Action object and appends it to the end of this menu.
    def add(a: Action): JMenuItem = ???

    @stub
    // Appends a component to the end of this menu.
    def add(c: Component): Component = ???

    @stub
    // Adds the specified component to this container at the given
    // position.
    def add(c: Component, index: Int): Component = ???

    @stub
    // Appends a menu item to the end of this menu.
    def add(menuItem: JMenuItem): JMenuItem = ???

    @stub
    // Creates a new menu item with the specified text and appends
    // it to the end of this menu.
    def add(s: String): JMenuItem = ???

    @stub
    // Adds a listener for menu events.
    def addMenuListener(l: MenuListener): Unit = ???

    @stub
    // Appends a new separator to the end of the menu.
    def addSeparator(): Unit = ???

    @stub
    // Sets the ComponentOrientation property of this menu
    // and all components contained within it.
    def applyComponentOrientation(o: ComponentOrientation): Unit = ???

    @stub
    // Returns a properly configured PropertyChangeListener
    // which updates the control as changes to the Action occur.
    protected def createActionChangeListener(b: JMenuItem): PropertyChangeListener = ???

    @stub
    // Factory method which creates the JMenuItem for
    // Actions added to the JMenu.
    protected def createActionComponent(a: Action): JMenuItem = ???

    @stub
    // Creates a window-closing listener for the popup.
    protected def createWinListener(p: JPopupMenu): JMenu.WinListener = ???

    @stub
    // Programmatically performs a "click".
    def doClick(pressTime: Int): Unit = ???

    @stub
    // Notifies all listeners that have registered interest for
    // notification on this event type.
    protected def fireMenuCanceled(): Unit = ???

    @stub
    // Notifies all listeners that have registered interest for
    // notification on this event type.
    protected def fireMenuDeselected(): Unit = ???

    @stub
    // Notifies all listeners that have registered interest for
    // notification on this event type.
    protected def fireMenuSelected(): Unit = ???

    @stub
    // Gets the AccessibleContext associated with this JMenu.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Returns the java.awt.Component used to
    // paint this MenuElement.
    def getComponent(): Component = ???

    @stub
    // Returns the suggested delay, in milliseconds, before submenus
    // are popped up or down.
    def getDelay(): Int = ???

    @stub
    // Returns the JMenuItem at the specified position.
    def getItem(pos: Int): JMenuItem = ???

    @stub
    // Returns the number of items on the menu, including separators.
    def getItemCount(): Int = ???

    @stub
    // Returns the component at position n.
    def getMenuComponent(n: Int): Component = ???

    @stub
    // Returns the number of components on the menu.
    def getMenuComponentCount(): Int = ???

    @stub
    // Returns an array of Components of the menu's
    // subcomponents.
    def getMenuComponents(): Array[Component] = ???

    @stub
    // Returns an array of all the MenuListeners added
    // to this JMenu with addMenuListener().
    def getMenuListeners(): Array[MenuListener] = ???

    @stub
    // Returns the popupmenu associated with this menu.
    def getPopupMenu(): JPopupMenu = ???

    @stub
    // Computes the origin for the JMenu's popup menu.
    protected def getPopupMenuOrigin(): Point = ???

    @stub
    // Returns an array of MenuElements containing the submenu
    // for this menu component.
    def getSubElements(): Array[MenuElement] = ???

    @stub
    // Returns the name of the L&F class that renders this component.
    def getUIClassID(): String = ???

    @stub
    // Inserts a new menu item attached to the specified Action
    // object at a given position.
    def insert(a: Action, pos: Int): JMenuItem = ???

    @stub
    // Inserts the specified JMenuitem at a given position.
    def insert(mi: JMenuItem, pos: Int): JMenuItem = ???

    @stub
    // Inserts a new menu item with the specified text at a
    // given position.
    def insert(s: String, pos: Int): Unit = ???

    @stub
    // Inserts a separator at the specified position.
    def insertSeparator(index: Int): Unit = ???

    @stub
    // Returns true if the specified component exists in the
    // submenu hierarchy.
    def isMenuComponent(c: Component): Boolean = ???

    @stub
    // Returns true if the menu's popup window is visible.
    def isPopupMenuVisible(): Boolean = ???

    @stub
    // Returns true if the menu is currently selected (highlighted).
    def isSelected(): Boolean = ???

    @stub
    // Returns true if the menu can be torn off.
    def isTearOff(): Boolean = ???

    @stub
    // Returns true if the menu is a 'top-level menu', that is, if it is
    // the direct child of a menubar.
    def isTopLevelMenu(): Boolean = ???

    @stub
    // Messaged when the menubar selection changes to activate or
    // deactivate this menu.
    def menuSelectionChanged(isIncluded: Boolean): Unit = ???

    @stub
    // Returns a string representation of this JMenu.
    protected def paramString(): String = ???

    @stub
    // Processes key stroke events such as mnemonics and accelerators.
    protected def processKeyEvent(evt: KeyEvent): Unit = ???

    @stub
    // Removes the component c from this menu.
    def remove(c: Component): Unit = ???

    @stub
    // Removes the menu item at the specified index from this menu.
    def remove(pos: Int): Unit = ???

    @stub
    // Removes the specified menu item from this menu.
    def remove(item: JMenuItem): Unit = ???

    @stub
    // Removes all menu items from this menu.
    def removeAll(): Unit = ???

    @stub
    // Removes a listener for menu events.
    def removeMenuListener(l: MenuListener): Unit = ???

    @stub
    // setAccelerator is not defined for JMenu.
    def setAccelerator(keyStroke: KeyStroke): Unit = ???

    @stub
    // Sets the language-sensitive orientation that is to be used to order
    // the elements or text within this component.
    def setComponentOrientation(o: ComponentOrientation): Unit = ???

    @stub
    // Sets the suggested delay before the menu's PopupMenu
    // is popped up or down.
    def setDelay(d: Int): Unit = ???

    @stub
    // Sets the location of the popup component.
    def setMenuLocation(x: Int, y: Int): Unit = ???

    @stub
    // Sets the data model for the "menu button" -- the label
    // that the user clicks to open or close the menu.
    def setModel(newModel: ButtonModel): Unit = ???

    @stub
    // Sets the visibility of the menu's popup.
    def setPopupMenuVisible(b: Boolean): Unit = ???

    @stub
    // Sets the selection status of the menu.
    def setSelected(b: Boolean): Unit = ???
}
