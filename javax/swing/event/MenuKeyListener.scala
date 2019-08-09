package javax.swing.event

import java.util.EventListener
import scala.scalanative.annotation.stub

/** MenuKeyListener */
trait MenuKeyListener extends EventListener {

    /** Invoked when a key has been pressed. */
    @stub
    def menuKeyPressed(e: MenuKeyEvent): Unit = ???

    /** Invoked when a key has been released. */
    @stub
    def menuKeyReleased(e: MenuKeyEvent): Unit = ???

    /** Invoked when a key has been typed. */
    @stub
    def menuKeyTyped(e: MenuKeyEvent): Unit = ???
}
