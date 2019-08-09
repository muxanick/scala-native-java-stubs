package java.sql

import java.lang.{Exception, Object, String, Throwable}

// The subclass of SQLException thrown when the SQLState class value
// is '40', or under vendor-specified conditions. This indicates that the
// current statement was automatically rolled back by the database because
// of deadlock or other transaction serialization failures.
// 
// Please consult your driver vendor documentation for the vendor-specified
// conditions for which this Exception may be thrown.
class SQLTransactionRollbackException extends SQLTransientException {

    @stub
    // Constructs a SQLTransactionRollbackException object.
    def this() = ???

    @stub
    // Constructs a SQLTransactionRollbackException object
    // with a given reason.
    def this(reason: String) = ???

    @stub
    // Constructs a SQLTransactionRollbackException object
    // with a given reason and SQLState.
    def this(reason: String, SQLState: String) = ???

    @stub
    // Constructs a SQLTransactionRollbackException object
    // with a given reason, SQLState  and
    // vendorCode.
    def this(reason: String, SQLState: String, vendorCode: Int) = ???

    @stub
    // Constructs a SQLTransactionRollbackException object
    // with a given
    // reason, SQLState, vendorCode
    // and  cause.
    def this(reason: String, SQLState: String, vendorCode: Int, cause: Throwable) = ???

    @stub
    // Constructs a SQLTransactionRollbackException object
    // with a given
    // reason, SQLState and  cause.
    def this(reason: String, SQLState: String, cause: Throwable) = ???

    @stub
    // Constructs a SQLTransactionRollbackException object
    // with a given
    // reason and  cause.
    def this(reason: String, cause: Throwable) = ???
}