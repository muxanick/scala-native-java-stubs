package javax.swing.event

import java.util.EventListener

// Defines a listener for menu events.
trait MenuListener extends EventListener {

    @stub
    // Invoked when the menu is canceled.
    def menuCanceled(e: MenuEvent): Unit = ???

    @stub
    // Invoked when the menu is deselected.
    def menuDeselected(e: MenuEvent): Unit = ???
}
