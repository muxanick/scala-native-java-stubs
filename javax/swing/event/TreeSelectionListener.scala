package javax.swing.event

import java.util.EventListener
import scala.scalanative.annotation.stub

/** The listener that's notified when the selection in a TreeSelectionModel
 *  changes.
 *  For more information and examples see
 *  How to Write a Tree Selection Listener,
 *  a section in The Java Tutorial.
 */
trait TreeSelectionListener extends EventListener {

    /** Called whenever the value of the selection changes. */
    @stub
    def valueChanged(e: TreeSelectionEvent): Unit = ???
}
