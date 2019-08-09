package java.sql

import java.lang.{Exception, Object, String, Throwable}

// The subclass of SQLException thrown for the SQLState
// class value '08', or under vendor-specified conditions.  This
// indicates that the connection operation that failed will not succeed if
// the operation is retried without the cause of the failure being corrected.
// 
// Please consult your driver vendor documentation for the vendor-specified
// conditions for which this Exception may be thrown.
class SQLNonTransientConnectionException extends SQLNonTransientException {

    @stub
    // Constructs a SQLNonTransientConnectionException object.
    def this() = ???

    @stub
    // Constructs a SQLNonTransientConnectionException object
    //  with a given reason.
    def this(reason: String) = ???

    @stub
    // Constructs a SQLNonTransientConnectionException object
    // with a given reason and SQLState.
    def this(reason: String, SQLState: String) = ???

    @stub
    // Constructs a SQLNonTransientConnectionException object
    // with a given reason, SQLState  and
    // vendorCode.
    def this(reason: String, SQLState: String, vendorCode: Int) = ???

    @stub
    // Constructs a SQLNonTransientConnectionException object
    // with a given
    // reason, SQLState, vendorCode
    // and  cause.
    def this(reason: String, SQLState: String, vendorCode: Int, cause: Throwable) = ???

    @stub
    // Constructs a SQLNonTransientConnectionException object
    // with a given
    // reason, SQLState and  cause.
    def this(reason: String, SQLState: String, cause: Throwable) = ???

    @stub
    // Constructs a SQLTransientException object
    // with a given
    // reason and  cause.
    def this(reason: String, cause: Throwable) = ???
}
