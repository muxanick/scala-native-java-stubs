package javax.swing.plaf.basic

import java.lang.Object
import javax.swing.event.{TreeSelectionEvent, TreeSelectionListener}
import scala.scalanative.annotation.stub

/** Listens for changes in the selection model and updates the display
 *  accordingly.
 */
class BasicTreeUI_TreeSelectionHandler extends Object with TreeSelectionListener {

    /**  */
    @stub
    def TreeSelectionHandler() = ???

    /** Messaged when the selection changes in the tree we're displaying
     *  for.
     */
    @stub
    def valueChanged(event: TreeSelectionEvent): Unit = ???
}
