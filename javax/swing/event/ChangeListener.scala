package javax.swing.event

import java.util.EventListener
import scala.scalanative.annotation.stub

/** Defines an object which listens for ChangeEvents. */
trait ChangeListener extends EventListener {

    /** Invoked when the target of the listener has changed its state. */
    @stub
    def stateChanged(e: ChangeEvent): Unit = ???
}
