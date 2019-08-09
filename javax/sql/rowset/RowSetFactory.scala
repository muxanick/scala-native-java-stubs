package javax.sql.rowset

// An interface that defines the implementation of a factory that is used
// to obtain different types of RowSet implementations.
trait RowSetFactory {

    @stub
    // Creates a new instance of a CachedRowSet.
    def createCachedRowSet(): CachedRowSet = ???

    @stub
    // Creates a new instance of a FilteredRowSet.
    def createFilteredRowSet(): FilteredRowSet = ???

    @stub
    // Creates a new instance of a JdbcRowSet.
    def createJdbcRowSet(): JdbcRowSet = ???

    @stub
    // Creates a new instance of a JoinRowSet.
    def createJoinRowSet(): JoinRowSet = ???
}
