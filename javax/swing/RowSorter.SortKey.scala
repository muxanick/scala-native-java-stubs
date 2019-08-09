package javax.swing

import java.lang.Object

// SortKey describes the sort order for a particular column.  The
// column index is in terms of the underlying model, which may differ
// from that of the view.
object RowSorter.SortKey extends Object {

    @stub
    // Returns true if this object equals the specified object.
    def equals(o: Object): Boolean = ???

    @stub
    // Returns the index of the column.
    def getColumn(): Int = ???

    @stub
    // Returns the sort order of the column.
    def getSortOrder(): SortOrder = ???
}
