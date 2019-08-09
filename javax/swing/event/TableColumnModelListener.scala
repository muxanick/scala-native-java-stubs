package javax.swing.event

import java.util.EventListener

// TableColumnModelListener defines the interface for an object that listens
// to changes in a TableColumnModel.
trait TableColumnModelListener extends EventListener {

    @stub
    // Tells listeners that a column was added to the model.
    def columnAdded(e: TableColumnModelEvent): Unit = ???

    @stub
    // Tells listeners that a column was moved due to a margin change.
    def columnMarginChanged(e: ChangeEvent): Unit = ???

    @stub
    // Tells listeners that a column was repositioned.
    def columnMoved(e: TableColumnModelEvent): Unit = ???

    @stub
    // Tells listeners that a column was removed from the model.
    def columnRemoved(e: TableColumnModelEvent): Unit = ???
}
