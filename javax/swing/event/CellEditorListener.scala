package javax.swing.event

import java.util.EventListener

/** CellEditorListener defines the interface for an object that listens
 *  to changes in a CellEditor
 */
trait CellEditorListener extends EventListener {

    /** This tells the listeners the editor has canceled editing */
    @stub
    def editingCanceled(e: ChangeEvent): Unit = ???
}
