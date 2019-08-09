package javax.sql.rowset

import java.lang.{Exception, Object, String, Throwable}
import java.sql.SQLException

// An extension of SQLException that provides information
// about database warnings set on RowSet objects.
// Warnings are silently chained to the object whose method call
// caused it to be reported.
// This class complements the SQLWarning class.
// 
// Rowset warnings may be retrieved from JdbcRowSet,
// CachedRowSet™,
// WebRowSet, FilteredRowSet, or JoinRowSet
// implementations. To retrieve the first warning reported on any
// RowSet
// implementation,  use the method getRowSetWarnings defined
// in the JdbcRowSet interface or the CachedRowSet
// interface. To retrieve a warning chained to the first warning, use the
// RowSetWarning method
// getNextWarning. To retrieve subsequent warnings, call
// getNextWarning on each RowSetWarning object that is
// returned.
// 
// The inherited methods getMessage, getSQLState,
// and getErrorCode retrieve information contained in a
// RowSetWarning object.
class RowSetWarning extends SQLException {

    @stub
    // Constructs a default RowSetWarning object.
    def this() = ???

    @stub
    // Constructs a RowSetWarning object
    // with the given value for the reason; SQLState defaults to null,
    // and vendorCode defaults to 0.
    def this(reason: String) = ???

    @stub
    // Constructs a RowSetWarning object initialized with the
    // given values for the reason and SQLState.
    def this(reason: String, SQLState: String) = ???

    @stub
    // Retrieves the warning chained to this RowSetWarning
    // object.
    def getNextWarning(): RowSetWarning = ???
}
