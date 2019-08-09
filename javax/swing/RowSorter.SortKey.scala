package javax.swing

import java.lang.Object

/** SortKey describes the sort order for a particular column.  The
 *  column index is in terms of the underlying model, which may differ
 *  from that of the view.
 */
object RowSorter.SortKey extends Object {

    /** Returns true if this object equals the specified object. */
    @stub
    def equals(o: Object): Boolean = ???

    /** Returns the index of the column. */
    @stub
    def getColumn(): Int = ???

    /** Returns the sort order of the column. */
    @stub
    def getSortOrder(): SortOrder = ???
}
