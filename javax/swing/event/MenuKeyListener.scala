package javax.swing.event

import java.util.EventListener

/** MenuKeyListener */
trait MenuKeyListener extends EventListener {

    /** Invoked when a key has been pressed. */
    @stub
    def menuKeyPressed(e: MenuKeyEvent): Unit = ???

    /** Invoked when a key has been released. */
    @stub
    def menuKeyReleased(e: MenuKeyEvent): Unit = ???
}
