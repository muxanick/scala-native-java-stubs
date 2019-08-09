package java.awt

import java.lang.Object
import javax.accessibility.{Accessible, AccessibleContext}

/** The MenuBar class encapsulates the platform's
 *  concept of a menu bar bound to a frame. In order to associate
 *  the menu bar with a Frame object, call the
 *  frame's setMenuBar method.
 *  
 *  <!--  target for cross references  -->
 *  This is what a menu bar might look like:
 *  
 *  
 *  
 *  A menu bar handles keyboard shortcuts for menu items, passing them
 *  along to its child menus.
 *  (Keyboard shortcuts, which are optional, provide the user with
 *  an alternative to the mouse for invoking a menu item and the
 *  action that is associated with it.)
 *  Each menu item can maintain an instance of MenuShortcut.
 *  The MenuBar class defines several methods,
 *  shortcuts() and
 *  getShortcutMenuItem(java.awt.MenuShortcut)
 *  that retrieve information about the shortcuts a given
 *  menu bar is managing.
 */
class MenuBar extends MenuComponent with MenuContainer with Accessible {

    /** Adds the specified menu to the menu bar. */
    @stub
    def add(m: Menu): Menu = ???

    /** Creates the menu bar's peer. */
    @stub
    def addNotify(): Unit = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by getMenuCount().
     * 
     */
    @stub
    def countMenus(): Int = ???

    /** Deletes the specified menu shortcut. */
    @stub
    def deleteShortcut(s: MenuShortcut): Unit = ???

    /** Gets the AccessibleContext associated with this MenuBar. */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Gets the help menu on the menu bar. */
    @stub
    def getHelpMenu(): Menu = ???

    /** Gets the specified menu. */
    @stub
    def getMenu(i: Int): Menu = ???

    /** Gets the number of menus on the menu bar. */
    @stub
    def getMenuCount(): Int = ???

    /** Gets the instance of MenuItem associated
     *  with the specified MenuShortcut object,
     *  or null if none of the menu items being managed
     *  by this menu bar is associated with the specified menu
     *  shortcut.
     */
    @stub
    def getShortcutMenuItem(s: MenuShortcut): MenuItem = ???

    /** Removes the menu located at the specified
     *  index from this menu bar.
     */
    @stub
    def remove(index: Int): Unit = ???

    /** Removes the specified menu component from this menu bar. */
    @stub
    def remove(m: MenuComponent): Unit = ???

    /** Removes the menu bar's peer. */
    @stub
    def removeNotify(): Unit = ???

    /** Sets the specified menu to be this menu bar's help menu. */
    @stub
    def setHelpMenu(m: Menu): Unit = ???
}
