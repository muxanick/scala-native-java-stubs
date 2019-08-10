package javax.swing

import java.lang.Object
import scala.scalanative.annotation.stub

/** SortKey describes the sort order for a particular column.  The
 *  column index is in terms of the underlying model, which may differ
 *  from that of the view.
 */
object RowSorter_SortKey extends Object {

    /** Creates a SortKey for the specified column with
     *  the specified sort order.
     */
    @stub
    def SortKey(column: Int, sortOrder: SortOrder) = ???

    /** Returns true if this object equals the specified object. */
    @stub
    def equals(o: Any): Boolean = ???

    /** Returns the index of the column. */
    @stub
    def getColumn(): Int = ???

    /** Returns the sort order of the column. */
    @stub
    def getSortOrder(): SortOrder = ???

    /** Returns the hash code for this SortKey. */
    @stub
    def hashCode(): Int = ???
}
