package java.awt

import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext}
import scala.scalanative.annotation.stub

/** A Menu object is a pull-down menu component
 *  that is deployed from a menu bar.
 *  
 *  A menu can optionally be a tear-off menu. A tear-off menu
 *  can be opened and dragged away from its parent menu bar or menu.
 *  It remains on the screen after the mouse button has been released.
 *  The mechanism for tearing off a menu is platform dependent, since
 *  the look and feel of the tear-off menu is determined by its peer.
 *  On platforms that do not support tear-off menus, the tear-off
 *  property is ignored.
 *  
 *  Each item in a menu must belong to the MenuItem
 *  class. It can be an instance of MenuItem, a submenu
 *  (an instance of Menu), or a check box (an instance of
 *  CheckboxMenuItem).
 */
class Menu extends MenuItem with MenuContainer with Accessible {

    /** Constructs a new menu with an empty label. */
    @stub
    def this() = ???

    /** Constructs a new menu with the specified label. */
    @stub
    def this(label: String) = ???

    /** Constructs a new menu with the specified label,
     *  indicating whether the menu can be torn off.
     */
    @stub
    def this(label: String, tearOff: Boolean) = ???

    /** Inner class of Menu used to provide default support for
     *  accessibility.
     */
    protected type AccessibleAWTMenu = Menu_AccessibleAWTMenu

    /** Adds the specified menu item to this menu. */
    @stub
    def add(mi: MenuItem): MenuItem = ???

    /** Adds an item with the specified label to this menu. */
    @stub
    def add(label: String): Unit = ???

    /** Creates the menu's peer. */
    @stub
    def addNotify(): Unit = ???

    /** Adds a separator line, or a hypen, to the menu at the current position. */
    @stub
    def addSeparator(): Unit = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by getItemCount().
     * 
     */
    @stub
    def countItems(): Int = ???

    /** Gets the AccessibleContext associated with this Menu. */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Gets the item located at the specified index of this menu. */
    @stub
    def getItem(index: Int): MenuItem = ???

    /** Get the number of items in this menu. */
    @stub
    def getItemCount(): Int = ???

    /** Inserts a menu item into this menu
     *  at the specified position.
     */
    @stub
    def insert(menuitem: MenuItem, index: Int): Unit = ???

    /** Inserts a menu item with the specified label into this menu
     *  at the specified position.
     */
    @stub
    def insert(label: String, index: Int): Unit = ???

    /** Inserts a separator at the specified position. */
    @stub
    def insertSeparator(index: Int): Unit = ???

    /** Indicates whether this menu is a tear-off menu. */
    @stub
    def isTearOff(): Boolean = ???

    /** Returns a string representing the state of this Menu. */
    @stub
    def paramString(): String = ???

    /** Removes the menu item at the specified index from this menu. */
    @stub
    def remove(index: Int): Unit = ???

    /** Removes the specified menu item from this menu. */
    @stub
    def remove(item: MenuComponent): Unit = ???

    /** Removes all items from this menu. */
    @stub
    def removeAll(): Unit = ???

    /** Removes the menu's peer. */
    @stub
    def removeNotify(): Unit = ???
}
