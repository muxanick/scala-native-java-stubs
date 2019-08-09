package javax.swing.event

import java.util.EventListener
import scala.scalanative.annotation.stub

/** Listener for changes in the caret position of a text
 *  component.
 */
trait CaretListener extends EventListener {

    /** Called when the caret position is updated. */
    @stub
    def caretUpdate(e: CaretEvent): Unit = ???
}
