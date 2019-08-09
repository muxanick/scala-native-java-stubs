package javax.swing

import java.awt.{Component, Container, Dimension, Graphics, Insets}
import java.awt.event.{FocusEvent, KeyEvent, MouseEvent}
import java.beans.PropertyChangeListener
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext}
import javax.swing.event.{MenuKeyListener, PopupMenuListener}
import javax.swing.plaf.PopupMenuUI

// An implementation of a popup menu -- a small window that pops up
// and displays a series of choices. A JPopupMenu is used for the
// menu that appears when the user selects an item on the menu bar.
// It is also used for "pull-right" menu that appears when the
// selects a menu item that activates it. Finally, a JPopupMenu
// can also be used anywhere else you want a menu to appear.  For
// example, when the user right-clicks in a specified area.
// 
// For information and examples of using popup menus, see
// How to Use Menus
// in The Java Tutorial.
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
class JPopupMenu extends JComponent with Accessible, with MenuElement {

    @stub
    // Constructs a JPopupMenu without an "invoker".
    def this() = ???

    @stub
    // This class implements accessibility support for the
    // JPopupMenu class.
    protected def JPopupMenu.AccessibleJPopupMenu: class = ???

    @stub
    // Appends a new menu item to the end of the menu which
    // dispatches the specified Action object.
    def add(a: Action): JMenuItem = ???

    @stub
    // Appends the specified menu item to the end of this menu.
    def add(menuItem: JMenuItem): JMenuItem = ???

    @stub
    // Creates a new menu item with the specified text and appends
    // it to the end of this menu.
    def add(s: String): JMenuItem = ???

    @stub
    // Adds a MenuKeyListener to the popup menu.
    def addMenuKeyListener(l: MenuKeyListener): Unit = ???

    @stub
    // Adds a PopupMenu listener.
    def addPopupMenuListener(l: PopupMenuListener): Unit = ???

    @stub
    // Appends a new separator at the end of the menu.
    def addSeparator(): Unit = ???

    @stub
    // Returns a properly configured PropertyChangeListener
    // which updates the control as changes to the Action occur.
    protected def createActionChangeListener(b: JMenuItem): PropertyChangeListener = ???

    @stub
    // Factory method which creates the JMenuItem for
    // Actions added to the JPopupMenu.
    protected def createActionComponent(a: Action): JMenuItem = ???

    @stub
    // Notifies PopupMenuListeners that this popup menu is
    // cancelled.
    protected def firePopupMenuCanceled(): Unit = ???

    @stub
    // Notifies PopupMenuListeners that this popup menu will
    // become invisible.
    protected def firePopupMenuWillBecomeInvisible(): Unit = ???

    @stub
    // Notifies PopupMenuListeners that this popup menu will
    // become visible.
    protected def firePopupMenuWillBecomeVisible(): Unit = ???

    @stub
    // Gets the AccessibleContext associated with this JPopupMenu.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Returns this JPopupMenu component.
    def getComponent(): Component = ???

    @stub
    // Deprecated. 
    //replaced by Container.getComponent(int)
    //
    def getComponentAtIndex(i: Int): Component = ???

    @stub
    // Returns the index of the specified component.
    def getComponentIndex(c: Component): Int = ???

    @stub
    // Returns the component which is the 'invoker' of this
    // popup menu.
    def getInvoker(): Component = ???

    @stub
    // Returns the popup menu's label
    def getLabel(): String = ???

    @stub
    // Returns the margin, in pixels, between the popup menu's border and
    // its containers.
    def getMargin(): Insets = ???

    @stub
    // Returns an array of all the MenuKeyListeners added
    // to this JPopupMenu with addMenuKeyListener().
    def getMenuKeyListeners(): Array[MenuKeyListener] = ???

    @stub
    // Returns an array of all the PopupMenuListeners added
    // to this JMenuItem with addPopupMenuListener().
    def getPopupMenuListeners(): Array[PopupMenuListener] = ???

    @stub
    // Returns the model object that handles single selections.
    def getSelectionModel(): SingleSelectionModel = ???

    @stub
    // Returns an array of MenuElements containing the submenu
    // for this menu component.
    def getSubElements(): Array[MenuElement] = ???

    @stub
    // Returns the look and feel (L&F) object that renders this component.
    def getUI(): PopupMenuUI = ???

    @stub
    // Returns the name of the L&F class that renders this component.
    def getUIClassID(): String = ???

    @stub
    // Inserts a menu item for the specified Action object at
    // a given position.
    def insert(a: Action, index: Int): Unit = ???

    @stub
    // Inserts the specified component into the menu at a given
    // position.
    def insert(component: Component, index: Int): Unit = ???

    @stub
    // Checks whether the border should be painted.
    def isBorderPainted(): Boolean = ???

    @stub
    // Gets the lightWeightPopupEnabled property.
    def isLightWeightPopupEnabled(): Boolean = ???

    @stub
    // Returns true if the MouseEvent is considered a popup trigger
    // by the JPopupMenu's currently installed UI.
    def isPopupTrigger(e: MouseEvent): Boolean = ???

    @stub
    // Returns true if the popup menu is visible (currently
    // being displayed).
    def isVisible(): Boolean = ???

    @stub
    // Messaged when the menubar selection changes to activate or
    // deactivate this menu.
    def menuSelectionChanged(isIncluded: Boolean): Unit = ???

    @stub
    // Lays out the container so that it uses the minimum space
    // needed to display its contents.
    def pack(): Unit = ???

    @stub
    // Paints the popup menu's border if the borderPainted
    // property is true.
    protected def paintBorder(g: Graphics): Unit = ???

    @stub
    // Returns a string representation of this JPopupMenu.
    protected def paramString(): String = ???

    @stub
    // Processes focus events occurring on this component by
    // dispatching them to any registered
    // FocusListener objects.
    protected def processFocusEvent(evt: FocusEvent): Unit = ???

    @stub
    // Processes key stroke events such as mnemonics and accelerators.
    protected def processKeyEvent(evt: KeyEvent): Unit = ???

    @stub
    // Processes a key event forwarded from the
    // MenuSelectionManager and changes the menu selection,
    // if necessary, by using MenuSelectionManager's API.
    def processKeyEvent(e: KeyEvent, path: Array[MenuElement], manager: MenuSelectionManager): Unit = ???

    @stub
    // This method is required to conform to the
    // MenuElement interface, but it not implemented.
    def processMouseEvent(event: MouseEvent, path: Array[MenuElement], manager: MenuSelectionManager): Unit = ???

    @stub
    // Removes the component at the specified index from this popup menu.
    def remove(pos: Int): Unit = ???

    @stub
    // Removes a MenuKeyListener from the popup menu.
    def removeMenuKeyListener(l: MenuKeyListener): Unit = ???

    @stub
    // Removes a PopupMenu listener.
    def removePopupMenuListener(l: PopupMenuListener): Unit = ???

    @stub
    // Sets whether the border should be painted.
    def setBorderPainted(b: Boolean): Unit = ???

    @stub
    // Sets the invoker of this popup menu -- the component in which
    // the popup menu menu is to be displayed.
    def setInvoker(invoker: Component): Unit = ???

    @stub
    // Sets the popup menu's label.
    def setLabel(label: String): Unit = ???

    @stub
    // Sets the value of the lightWeightPopupEnabled property,
    // which by default is true.
    def setLightWeightPopupEnabled(aFlag: Boolean): Unit = ???

    @stub
    // Sets the location of the upper left corner of the
    // popup menu using x, y coordinates.
    def setLocation(x: Int, y: Int): Unit = ???

    @stub
    // Sets the size of the Popup window using a Dimension object.
    def setPopupSize(d: Dimension): Unit = ???

    @stub
    // Sets the size of the Popup window to the specified width and
    // height.
    def setPopupSize(width: Int, height: Int): Unit = ???

    @stub
    // Sets the currently selected component,  This will result
    // in a change to the selection model.
    def setSelected(sel: Component): Unit = ???

    @stub
    // Sets the model object to handle single selections.
    def setSelectionModel(model: SingleSelectionModel): Unit = ???

    @stub
    // Sets the L&F object that renders this component.
    def setUI(ui: PopupMenuUI): Unit = ???

    @stub
    // Sets the visibility of the popup menu.
    def setVisible(b: Boolean): Unit = ???

    @stub
    // Displays the popup menu at the position x,y in the coordinate
    // space of the component invoker.
    def show(invoker: Component, x: Int, y: Int): Unit = ???
}

object JPopupMenu {
    @stub
    // Gets the defaultLightWeightPopupEnabled property,
    //  which by default is true.
    def getDefaultLightWeightPopupEnabled(): Boolean = ???

    @stub
    // Sets the default value of the lightWeightPopupEnabled
    //  property.
    def setDefaultLightWeightPopupEnabled(aFlag: Boolean): Unit = ???
}
