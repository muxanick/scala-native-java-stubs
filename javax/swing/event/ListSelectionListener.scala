package javax.swing.event

import java.util.EventListener
import scala.scalanative.annotation.stub

/** The listener that's notified when a lists selection value
 *  changes.
 */
trait ListSelectionListener extends EventListener {

    /** Called whenever the value of the selection changes. */
    @stub
    def valueChanged(e: ListSelectionEvent): Unit = ???
}
