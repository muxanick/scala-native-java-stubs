package java.sql

import java.lang.{Exception, Object, String, Throwable}

// The subclass of SQLException is thrown in situations where a
// previously failed operation might be able to succeed when the operation is
// retried without any intervention by application-level functionality.
//
class SQLTransientException extends SQLException {

    @stub
    // Constructs a SQLTransientException object.
    def this() = ???

    @stub
    // Constructs a SQLTransientException object
    //  with a given reason.
    def this(reason: String) = ???

    @stub
    // Constructs a SQLTransientException object
    // with a given reason and SQLState.
    def this(reason: String, SQLState: String) = ???

    @stub
    // Constructs a SQLTransientException object
    //  with a given reason, SQLState  and
    // vendorCode.
    def this(reason: String, SQLState: String, vendorCode: Int) = ???

    @stub
    // Constructs a SQLTransientException object
    // with a given
    // reason, SQLState, vendorCode
    // and  cause.
    def this(reason: String, SQLState: String, vendorCode: Int, cause: Throwable) = ???

    @stub
    // Constructs a SQLTransientException object
    // with a given
    // reason, SQLState and  cause.
    def this(reason: String, SQLState: String, cause: Throwable) = ???

    @stub
    // Constructs a SQLTransientException object
    // with a given
    // reason and  cause.
    def this(reason: String, cause: Throwable) = ???
}
