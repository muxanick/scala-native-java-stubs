package javax.swing.event

import java.util.EventListener
import scala.scalanative.annotation.stub

/** RowSorterListeners are notified of changes to a
 *  RowSorter.
 */
trait RowSorterListener extends EventListener {

    /** Notification that the RowSorter has changed. */
    @stub
    def sorterChanged(e: RowSorterEvent): Unit = ???
}
