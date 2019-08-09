package javax.swing.event

import java.util.EventListener

/** Defines a listener for menu events. */
trait MenuListener extends EventListener {

    /** Invoked when the menu is canceled. */
    @stub
    def menuCanceled(e: MenuEvent): Unit = ???

    /** Invoked when the menu is deselected. */
    @stub
    def menuDeselected(e: MenuEvent): Unit = ???
}
