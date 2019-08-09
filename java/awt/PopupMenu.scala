package java.awt

import java.lang.{Object, String}
import javax.accessibility.AccessibleContext
import scala.scalanative.annotation.stub

/** A class that implements a menu which can be dynamically popped up
 *  at a specified position within a component.
 *  
 *  As the inheritance hierarchy implies, a PopupMenu
 *   can be used anywhere a Menu can be used.
 *  However, if you use a PopupMenu like a Menu
 *  (e.g., you add it to a MenuBar), then you cannot
 *  call show on that PopupMenu.
 */
class PopupMenu extends Menu {

    /** Creates a new popup menu with an empty name. */
    @stub
    def this() = ???

    /** Creates a new popup menu with the specified name. */
    @stub
    def this(label: String) = ???

    /** Inner class of PopupMenu used to provide default support for
     *  accessibility.
     */
    @stub
    protected object AccessibleAWTPopupMenu extends PopupMenu.AccessibleAWTPopupMenu

    /** Creates the popup menu's peer. */
    @stub
    def addNotify(): Unit = ???

    /** Gets the AccessibleContext associated with this
     *  PopupMenu.
     */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Returns the parent container for this menu component. */
    @stub
    def getParent(): MenuContainer = ???

    /** Shows the popup menu at the x, y position relative to an origin
     *  component.
     */
    @stub
    def show(origin: Component, x: Int, y: Int): Unit = ???
}
