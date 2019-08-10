package javax.swing.plaf.basic

import java.lang.Object
import javax.swing.event.{CellEditorListener, ChangeEvent}
import scala.scalanative.annotation.stub

/** Listener responsible for getting cell editing events and updating
 *  the tree accordingly.
 */
class BasicTreeUI_CellEditorHandler extends Object with CellEditorListener {

    /**  */
    @stub
    def CellEditorHandler() = ???

    /** Messaged when editing has been canceled in the tree. */
    @stub
    def editingCanceled(e: ChangeEvent): Unit = ???

    /** Messaged when editing has stopped in the tree. */
    @stub
    def editingStopped(e: ChangeEvent): Unit = ???
}
