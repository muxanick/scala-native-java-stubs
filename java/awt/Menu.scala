package java.awt

import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext}

// A Menu object is a pull-down menu component
// that is deployed from a menu bar.
// 
// A menu can optionally be a tear-off menu. A tear-off menu
// can be opened and dragged away from its parent menu bar or menu.
// It remains on the screen after the mouse button has been released.
// The mechanism for tearing off a menu is platform dependent, since
// the look and feel of the tear-off menu is determined by its peer.
// On platforms that do not support tear-off menus, the tear-off
// property is ignored.
// 
// Each item in a menu must belong to the MenuItem
// class. It can be an instance of MenuItem, a submenu
// (an instance of Menu), or a check box (an instance of
// CheckboxMenuItem).
class Menu extends MenuItem with MenuContainer, with Accessible {

    @stub
    // Constructs a new menu with an empty label.
    def this() = ???

    @stub
    // Constructs a new menu with the specified label.
    def this(label: String) = ???

    @stub
    // Adds the specified menu item to this menu.
    def add(mi: MenuItem): MenuItem = ???

    @stub
    // Adds an item with the specified label to this menu.
    def add(label: String): Unit = ???

    @stub
    // Creates the menu's peer.
    def addNotify(): Unit = ???

    @stub
    // Adds a separator line, or a hypen, to the menu at the current position.
    def addSeparator(): Unit = ???

    @stub
    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by getItemCount().
    //
    def countItems(): Int = ???

    @stub
    // Gets the AccessibleContext associated with this Menu.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Gets the item located at the specified index of this menu.
    def getItem(index: Int): MenuItem = ???

    @stub
    // Get the number of items in this menu.
    def getItemCount(): Int = ???

    @stub
    // Inserts a menu item into this menu
    // at the specified position.
    def insert(menuitem: MenuItem, index: Int): Unit = ???

    @stub
    // Inserts a menu item with the specified label into this menu
    // at the specified position.
    def insert(label: String, index: Int): Unit = ???

    @stub
    // Inserts a separator at the specified position.
    def insertSeparator(index: Int): Unit = ???

    @stub
    // Indicates whether this menu is a tear-off menu.
    def isTearOff(): Boolean = ???

    @stub
    // Returns a string representing the state of this Menu.
    def paramString(): String = ???

    @stub
    // Removes the menu item at the specified index from this menu.
    def remove(index: Int): Unit = ???

    @stub
    // Removes the specified menu item from this menu.
    def remove(item: MenuComponent): Unit = ???

    @stub
    // Removes all items from this menu.
    def removeAll(): Unit = ???
}
