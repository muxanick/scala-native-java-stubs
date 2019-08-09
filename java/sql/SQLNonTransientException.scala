package java.sql

import java.lang.{Exception, Object, String, Throwable}

// The subclass of SQLException thrown when an instance where a retry
// of the same operation would fail unless the cause of the SQLException
// is corrected.
//
class SQLNonTransientException extends SQLException {

    @stub
    // Constructs a SQLNonTransientException object.
    def this() = ???

    @stub
    // Constructs a SQLNonTransientException object
    // with a given reason.
    def this(reason: String) = ???

    @stub
    // Constructs a SQLNonTransientException object
    // with a given reason and SQLState.
    def this(reason: String, SQLState: String) = ???

    @stub
    // Constructs a SQLNonTransientException object
    // with a given reason, SQLState  and
    // vendorCode.
    def this(reason: String, SQLState: String, vendorCode: Int) = ???

    @stub
    // Constructs a SQLNonTransientException object
    // with a given
    // reason, SQLState, vendorCode
    // and  cause.
    def this(reason: String, SQLState: String, vendorCode: Int, cause: Throwable) = ???

    @stub
    // Constructs a SQLNonTransientException object
    // with a given
    // reason, SQLState and  cause.
    def this(reason: String, SQLState: String, cause: Throwable) = ???

    @stub
    // Constructs a SQLTransientException object
    // with a given
    // reason and  cause.
    def this(reason: String, cause: Throwable) = ???
}
