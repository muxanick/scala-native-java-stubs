package java.sql

import java.lang.{Exception, Object, String, Throwable}

// An exception that provides information on  database access
// warnings. Warnings are silently chained to the object whose method
// caused it to be reported.
// 
// Warnings may be retrieved from Connection, Statement,
// and ResultSet objects.  Trying to retrieve a warning on a
// connection after it has been closed will cause an exception to be thrown.
// Similarly, trying to retrieve a warning on a statement after it has been
// closed or on a result set after it has been closed will cause
// an exception to be thrown. Note that closing a statement also
// closes a result set that it might have produced.
class SQLWarning extends SQLException {

    @stub
    // Constructs a  SQLWarning object.
    def this() = ???

    @stub
    // Constructs a SQLWarning object
    // with a given reason.
    def this(reason: String) = ???

    @stub
    // Constructs a SQLWarning object
    // with a given reason and SQLState.
    def this(reason: String, SQLState: String) = ???

    @stub
    // Constructs a  SQLWarning object
    //  with a given reason, SQLState  and
    // vendorCode.
    def this(reason: String, SQLState: String, vendorCode: Int) = ???

    @stub
    // Constructs aSQLWarning object
    // with a given
    // reason, SQLState, vendorCode
    // and  cause.
    def this(reason: String, SQLState: String, vendorCode: Int, cause: Throwable) = ???

    @stub
    // Constructs a SQLWarning object
    // with a given
    // reason, SQLState and  cause.
    def this(reason: String, SQLState: String, cause: Throwable) = ???

    @stub
    // Constructs a SQLWarning object
    // with a given
    // reason and  cause.
    def this(reason: String, cause: Throwable) = ???

    @stub
    // Retrieves the warning chained to this SQLWarning object by
    // setNextWarning.
    def getNextWarning(): SQLWarning = ???
}
