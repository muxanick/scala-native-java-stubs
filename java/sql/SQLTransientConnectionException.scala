package java.sql

import java.lang.{Exception, Object, String, Throwable}

// The subclass of SQLException for the SQLState class
// value '08', or under vendor-specified conditions.  This indicates
// that the connection operation that failed might be able to succeed if
// the operation is retried without any application-level changes.
// 
// Please consult your driver vendor documentation for the vendor-specified
// conditions for which this Exception may be thrown.
class SQLTransientConnectionException extends SQLTransientException {

    @stub
    // Constructs a SQLTransientConnectionException object.
    def this() = ???

    @stub
    // Constructs a SQLTransientConnectionException object
    // with a given reason.
    def this(reason: String) = ???

    @stub
    // Constructs a SQLTransientConnectionException object
    // with a given reason and SQLState.
    def this(reason: String, SQLState: String) = ???

    @stub
    // Constructs a SQLTransientConnectionException object
    // with a given reason, SQLState  and
    // vendorCode.
    def this(reason: String, SQLState: String, vendorCode: Int) = ???

    @stub
    // Constructs a SQLTransientConnectionException object
    // with a given
    // reason, SQLState, vendorCode
    // and  cause.
    def this(reason: String, SQLState: String, vendorCode: Int, cause: Throwable) = ???

    @stub
    // Constructs a SQLTransientConnectionException object
    // with a given
    // reason, SQLState and  cause.
    def this(reason: String, SQLState: String, cause: Throwable) = ???

    @stub
    // Constructs a SQLTransientConnectionException object
    // with a given
    // reason and  cause.
    def this(reason: String, cause: Throwable) = ???
}
