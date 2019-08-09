package javax.sql.rowset

/** An interface that defines the implementation of a factory that is used
 *  to obtain different types of RowSet implementations.
 */
trait RowSetFactory {

    /** Creates a new instance of a CachedRowSet. */
    @stub
    def createCachedRowSet(): CachedRowSet = ???

    /** Creates a new instance of a FilteredRowSet. */
    @stub
    def createFilteredRowSet(): FilteredRowSet = ???

    /** Creates a new instance of a JdbcRowSet. */
    @stub
    def createJdbcRowSet(): JdbcRowSet = ???

    /** Creates a new instance of a JoinRowSet. */
    @stub
    def createJoinRowSet(): JoinRowSet = ???
}
