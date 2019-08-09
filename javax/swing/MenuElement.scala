package javax.swing

import java.awt.Component
import java.awt.event.KeyEvent

/** Any component that can be placed into a menu should implement this interface.
 *  This interface is used by MenuSelectionManager
 *  to handle selection and navigation in menu hierarchies.
 */
trait MenuElement {

    /** This method should return the java.awt.Component used to paint the receiving element. */
    @stub
    def getComponent(): Component = ???

    /** This method should return an array containing the sub-elements for the receiving menu element */
    @stub
    def getSubElements(): Array[MenuElement] = ???

    /** Call by the MenuSelectionManager when the
     *  MenuElement is added or remove from
     *  the menu selection.
     */
    @stub
    def menuSelectionChanged(isIncluded: Boolean): Unit = ???

    /** Process a key event. */
    @stub
    def processKeyEvent(event: KeyEvent, path: Array[MenuElement], manager: MenuSelectionManager): Unit = ???
}
