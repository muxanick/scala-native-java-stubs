package javax.swing.event

import java.util.EventListener

/** TableColumnModelListener defines the interface for an object that listens
 *  to changes in a TableColumnModel.
 */
trait TableColumnModelListener extends EventListener {

    /** Tells listeners that a column was added to the model. */
    @stub
    def columnAdded(e: TableColumnModelEvent): Unit = ???

    /** Tells listeners that a column was moved due to a margin change. */
    @stub
    def columnMarginChanged(e: ChangeEvent): Unit = ???

    /** Tells listeners that a column was repositioned. */
    @stub
    def columnMoved(e: TableColumnModelEvent): Unit = ???

    /** Tells listeners that a column was removed from the model. */
    @stub
    def columnRemoved(e: TableColumnModelEvent): Unit = ???
}
