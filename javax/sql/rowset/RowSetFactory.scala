package javax.sql.rowset

import scala.scalanative.annotation.stub

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

    /** Creates a new instance of a WebRowSet. */
    @stub
    def createWebRowSet(): WebRowSet = ???
}
