package java.sql

import java.lang.{Exception, Iterable, Object, String, Throwable}
import java.util.Iterator

// An exception that provides information on a database access
// error or other errors.
//
// Each SQLException provides several kinds of information:
// 
//    a string describing the error.  This is used as the Java Exception
//       message, available via the method getMesasge.
//    a "SQLstate" string, which follows either the XOPEN SQLstate conventions
//        or the SQL:2003 conventions.
//       The values of the SQLState string are described in the appropriate spec.
//       The DatabaseMetaData method getSQLStateType
//       can be used to discover whether the driver returns the XOPEN type or
//       the SQL:2003 type.
//    an integer error code that is specific to each vendor.  Normally this will
//       be the actual error code returned by the underlying database.
//    a chain to a next Exception.  This can be used to provide additional
//       error information.
//    the causal relationship, if any for this SQLException.
// 
class SQLException extends Exception with Iterable[Throwable] {

    @stub
    // Constructs a SQLException object.
    def this() = ???

    @stub
    // Constructs a SQLException object with a given
    // reason.
    def this(reason: String) = ???

    @stub
    // Constructs a SQLException object with a given
    // reason and SQLState.
    def this(reason: String, SQLState: String) = ???

    @stub
    // Constructs a SQLException object with a given
    // reason, SQLState  and
    // vendorCode.
    def this(reason: String, SQLState: String, vendorCode: Int) = ???

    @stub
    // Constructs a SQLException object with a given
    // reason, SQLState, vendorCode
    // and  cause.
    def this(reason: String, sqlState: String, vendorCode: Int, cause: Throwable) = ???

    @stub
    // Constructs a SQLException object with a given
    // reason, SQLState and  cause.
    def this(reason: String, sqlState: String, cause: Throwable) = ???

    @stub
    // Constructs a SQLException object with a given
    // reason and  cause.
    def this(reason: String, cause: Throwable) = ???

    @stub
    // Retrieves the vendor-specific exception code
    // for this SQLException object.
    def getErrorCode(): Int = ???

    @stub
    // Retrieves the exception chained to this
    // SQLException object by setNextException(SQLException ex).
    def getNextException(): SQLException = ???

    @stub
    // Retrieves the SQLState for this SQLException object.
    def getSQLState(): String = ???

    @stub
    // Returns an iterator over the chained SQLExceptions.
    def iterator(): Iterator[Throwable] = ???
}
