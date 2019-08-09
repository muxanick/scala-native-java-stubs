package java.awt

import java.lang.Object
import javax.accessibility.AccessibleContext

// A class that implements a menu which can be dynamically popped up
// at a specified position within a component.
// 
// As the inheritance hierarchy implies, a PopupMenu
//  can be used anywhere a Menu can be used.
// However, if you use a PopupMenu like a Menu
// (e.g., you add it to a MenuBar), then you cannot
// call show on that PopupMenu.
class PopupMenu extends Menu {

    @stub
    // Creates a new popup menu with an empty name.
    def this() = ???

    @stub
    // Creates the popup menu's peer.
    def addNotify(): Unit = ???

    @stub
    // Gets the AccessibleContext associated with this
    // PopupMenu.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Returns the parent container for this menu component.
    def getParent(): MenuContainer = ???
}
