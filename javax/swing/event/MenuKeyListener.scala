package javax.swing.event

import java.util.EventListener

// MenuKeyListener
trait MenuKeyListener extends EventListener {

    @stub
    // Invoked when a key has been pressed.
    def menuKeyPressed(e: MenuKeyEvent): Unit = ???

    @stub
    // Invoked when a key has been released.
    def menuKeyReleased(e: MenuKeyEvent): Unit = ???
}
