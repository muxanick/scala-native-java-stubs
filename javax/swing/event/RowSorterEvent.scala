package javax.swing.event

import java.lang.Object
import java.util.EventObject
import javax.swing.RowSorter

// RowSorterEvent provides notification of changes to
// a RowSorter.  Two types of notification are possible:
// 
// Type.SORT_ORDER_CHANGED: indicates the sort order has
//     changed.  This is typically followed by a notification of:
// Type.SORTED: indicates the contents of the model have
//     been transformed in some way.  For example, the contents may have
//     been sorted or filtered.
// 
class RowSorterEvent extends EventObject {

    @stub
    // Creates a RowSorterEvent of type
    // SORT_ORDER_CHANGED.
    def this(source: RowSorter) = ???

    @stub
    // Returns the location of index in terms of the
    // model prior to the sort.
    def convertPreviousRowIndexToModel(index: Int): Int = ???

    @stub
    // Returns the number of rows before the sort.
    def getPreviousRowCount(): Int = ???

    @stub
    // Returns the source of the event as a RowSorter.
    def getSource(): RowSorter = ???
}
