package javax.swing.event

import java.util.EventListener
import scala.scalanative.annotation.stub

/** CellEditorListener defines the interface for an object that listens
 *  to changes in a CellEditor
 */
trait CellEditorListener extends EventListener {

    /** This tells the listeners the editor has canceled editing */
    @stub
    def editingCanceled(e: ChangeEvent): Unit = ???

    /** This tells the listeners the editor has ended editing */
    @stub
    def editingStopped(e: ChangeEvent): Unit = ???
}
