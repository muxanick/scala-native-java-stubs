package javax.swing.plaf.basic

import java.lang.Object
import javax.swing.event.{CellEditorListener, ChangeEvent}

/** Listener responsible for getting cell editing events and updating
 *  the tree accordingly.
 */
class BasicTreeUI.CellEditorHandler extends Object with CellEditorListener {

    /** Messaged when editing has been canceled in the tree. */
    @stub
    def editingCanceled(e: ChangeEvent): Unit = ???
}
