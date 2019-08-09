package javax.accessibility

/** Class AccessibleExtendedTable provides extended information about
 *  a user-interface component that presents data in a two-dimensional
 *  table format.
 *  Applications can determine if an object supports the
 *  AccessibleExtendedTable interface by first obtaining its
 *  AccessibleContext and then calling the
 *  AccessibleContext.getAccessibleTable() method.
 *  If the return value is not null and the type of the return value is
 *  AccessibleExtendedTable, the object supports this interface.
 */
trait AccessibleExtendedTable extends AccessibleTable {

    /** Returns the column number of an index in the table. */
    @stub
    def getAccessibleColumn(index: Int): Int = ???

    /** Returns the index at a row and column in the table. */
    @stub
    def getAccessibleIndex(r: Int, c: Int): Int = ???
}
