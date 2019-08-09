package javax.swing

import java.awt.{Component, Container}
import java.awt.event.{KeyEvent, MouseEvent}
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext}
import javax.swing.event.{MenuDragMouseEvent, MenuDragMouseListener, MenuKeyEvent, MenuKeyListener}
import javax.swing.plaf.MenuItemUI

// An implementation of an item in a menu. A menu item is essentially a button
// sitting in a list. When the user selects the "button", the action
// associated with the menu item is performed. A JMenuItem
// contained in a JPopupMenu performs exactly that function.
// 
// Menu items can be configured, and to some degree controlled, by
// Actions.  Using an
// Action with a menu item has many benefits beyond directly
// configuring a menu item.  Refer to 
// Swing Components Supporting Action for more
// details, and you can find more information in How
// to Use Actions, a section in The Java Tutorial.
// 
// For further documentation and for examples, see
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
class JMenuItem extends AbstractButton with Accessible, with MenuElement {

    @stub
    // Creates a JMenuItem with no set text or icon.
    def this() = ???

    @stub
    // Creates a menu item whose properties are taken from the
    // specified Action.
    def this(a: Action) = ???

    @stub
    // Creates a JMenuItem with the specified icon.
    def this(icon: Icon) = ???

    @stub
    // Creates a JMenuItem with the specified text.
    def this(text: String) = ???

    @stub
    // Creates a JMenuItem with the specified text and icon.
    def this(text: String, icon: Icon) = ???

    @stub
    // Updates the button's state in response to property changes in the
    // associated action.
    protected def actionPropertyChanged(action: Action, propertyName: String): Unit = ???

    @stub
    // Adds a MenuDragMouseListener to the menu item.
    def addMenuDragMouseListener(l: MenuDragMouseListener): Unit = ???

    @stub
    // Adds a MenuKeyListener to the menu item.
    def addMenuKeyListener(l: MenuKeyListener): Unit = ???

    @stub
    // Sets the properties on this button to match those in the specified
    // Action.
    protected def configurePropertiesFromAction(a: Action): Unit = ???

    @stub
    // Notifies all listeners that have registered interest for
    // notification on this event type.
    protected def fireMenuDragMouseDragged(event: MenuDragMouseEvent): Unit = ???

    @stub
    // Notifies all listeners that have registered interest for
    // notification on this event type.
    protected def fireMenuDragMouseEntered(event: MenuDragMouseEvent): Unit = ???

    @stub
    // Notifies all listeners that have registered interest for
    // notification on this event type.
    protected def fireMenuDragMouseExited(event: MenuDragMouseEvent): Unit = ???

    @stub
    // Notifies all listeners that have registered interest for
    // notification on this event type.
    protected def fireMenuDragMouseReleased(event: MenuDragMouseEvent): Unit = ???

    @stub
    // Notifies all listeners that have registered interest for
    // notification on this event type.
    protected def fireMenuKeyPressed(event: MenuKeyEvent): Unit = ???

    @stub
    // Notifies all listeners that have registered interest for
    // notification on this event type.
    protected def fireMenuKeyReleased(event: MenuKeyEvent): Unit = ???

    @stub
    // Notifies all listeners that have registered interest for
    // notification on this event type.
    protected def fireMenuKeyTyped(event: MenuKeyEvent): Unit = ???

    @stub
    // Returns the KeyStroke which serves as an accelerator
    // for the menu item.
    def getAccelerator(): KeyStroke = ???

    @stub
    // Returns the AccessibleContext associated with this
    // JMenuItem.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Returns the java.awt.Component used to paint
    // this object.
    def getComponent(): Component = ???

    @stub
    // Returns an array of all the MenuDragMouseListeners added
    // to this JMenuItem with addMenuDragMouseListener().
    def getMenuDragMouseListeners(): Array[MenuDragMouseListener] = ???

    @stub
    // Returns an array of all the MenuKeyListeners added
    // to this JMenuItem with addMenuKeyListener().
    def getMenuKeyListeners(): Array[MenuKeyListener] = ???

    @stub
    // This method returns an array containing the sub-menu
    // components for this menu component.
    def getSubElements(): Array[MenuElement] = ???

    @stub
    // Returns the suffix used to construct the name of the L&F class used to
    // render this component.
    def getUIClassID(): String = ???

    @stub
    // Initializes the menu item with the specified text and icon.
    protected def init(text: String, icon: Icon): Unit = ???

    @stub
    // Returns whether the menu item is "armed".
    def isArmed(): Boolean = ???

    @stub
    // Called by the MenuSelectionManager when the
    // MenuElement is selected or unselected.
    def menuSelectionChanged(isIncluded: Boolean): Unit = ???

    @stub
    // Returns a string representation of this JMenuItem.
    protected def paramString(): String = ???

    @stub
    // Processes a key event forwarded from the
    // MenuSelectionManager and changes the menu selection,
    // if necessary, by using MenuSelectionManager's API.
    def processKeyEvent(e: KeyEvent, path: Array[MenuElement], manager: MenuSelectionManager): Unit = ???

    @stub
    // Handles mouse drag in a menu.
    def processMenuDragMouseEvent(e: MenuDragMouseEvent): Unit = ???

    @stub
    // Handles a keystroke in a menu.
    def processMenuKeyEvent(e: MenuKeyEvent): Unit = ???

    @stub
    // Processes a mouse event forwarded from the
    // MenuSelectionManager and changes the menu
    // selection, if necessary, by using the
    // MenuSelectionManager's API.
    def processMouseEvent(e: MouseEvent, path: Array[MenuElement], manager: MenuSelectionManager): Unit = ???

    @stub
    // Removes a MenuDragMouseListener from the menu item.
    def removeMenuDragMouseListener(l: MenuDragMouseListener): Unit = ???

    @stub
    // Removes a MenuKeyListener from the menu item.
    def removeMenuKeyListener(l: MenuKeyListener): Unit = ???

    @stub
    // Sets the key combination which invokes the menu item's
    // action listeners without navigating the menu hierarchy.
    def setAccelerator(keyStroke: KeyStroke): Unit = ???

    @stub
    // Identifies the menu item as "armed".
    def setArmed(b: Boolean): Unit = ???

    @stub
    // Enables or disables the menu item.
    def setEnabled(b: Boolean): Unit = ???

    @stub
    // Sets the model that this button represents.
    def setModel(newModel: ButtonModel): Unit = ???

    @stub
    // Sets the look and feel object that renders this component.
    def setUI(ui: MenuItemUI): Unit = ???
}
