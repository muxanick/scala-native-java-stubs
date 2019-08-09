package javax.swing.event

import java.util.EventListener
import scala.scalanative.annotation.stub

/** Interface implemented by a class interested in hearing about
 *  undoable operations.
 */
trait UndoableEditListener extends EventListener {

    /** An undoable edit happened */
    @stub
    def undoableEditHappened(e: UndoableEditEvent): Unit = ???
}
