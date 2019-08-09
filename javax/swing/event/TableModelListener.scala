package javax.swing.event

import java.util.EventListener
import scala.scalanative.annotation.stub

/** TableModelListener defines the interface for an object that listens
 *  to changes in a TableModel.
 */
trait TableModelListener extends EventListener {

    /** This fine grain notification tells listeners the exact range
     *  of cells, rows, or columns that changed.
     */
    @stub
    def tableChanged(e: TableModelEvent): Unit = ???
}
