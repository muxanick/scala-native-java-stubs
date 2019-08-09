package javax.swing.plaf.basic

import java.lang.Object
import javax.swing.event.{CellEditorListener, ChangeEvent}

// Listener responsible for getting cell editing events and updating
// the tree accordingly.
class BasicTreeUI.CellEditorHandler extends Object with CellEditorListener {

    @stub
    // Messaged when editing has been canceled in the tree.
    def editingCanceled(e: ChangeEvent): Unit = ???
}
