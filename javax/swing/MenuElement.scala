package javax.swing

import java.awt.Component
import java.awt.event.KeyEvent

// Any component that can be placed into a menu should implement this interface.
// This interface is used by MenuSelectionManager
// to handle selection and navigation in menu hierarchies.
trait MenuElement {

    @stub
    // This method should return the java.awt.Component used to paint the receiving element.
    def getComponent(): Component = ???

    @stub
    // This method should return an array containing the sub-elements for the receiving menu element
    def getSubElements(): Array[MenuElement] = ???

    @stub
    // Call by the MenuSelectionManager when the
    // MenuElement is added or remove from
    // the menu selection.
    def menuSelectionChanged(isIncluded: Boolean): Unit = ???

    @stub
    // Process a key event.
    def processKeyEvent(event: KeyEvent, path: Array[MenuElement], manager: MenuSelectionManager): Unit = ???
}
