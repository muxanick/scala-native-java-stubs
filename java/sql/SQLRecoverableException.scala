package java.sql

import java.lang.{Exception, Object, String, Throwable}

// The subclass of SQLException thrown in situations where a
// previously failed operation might be able to succeed if the application performs
//  some recovery steps and retries the entire transaction or in the case of a
// distributed transaction, the transaction branch.  At a minimum,
// the recovery operation must include closing the current connection and getting
// a new connection.
//
class SQLRecoverableException extends SQLException {

    @stub
    // Constructs a SQLRecoverableException object.
    def this() = ???

    @stub
    // Constructs a SQLRecoverableException object
    //  with a given reason.
    def this(reason: String) = ???

    @stub
    // Constructs a SQLRecoverableException object
    // with a given reason and SQLState.
    def this(reason: String, SQLState: String) = ???

    @stub
    // Constructs a SQLRecoverableException object
    //  with a given reason, SQLState  and
    // vendorCode.
    def this(reason: String, SQLState: String, vendorCode: Int) = ???

    @stub
    // Constructs a SQLRecoverableException object
    // with a given
    // reason, SQLState, vendorCode
    // and  cause.
    def this(reason: String, SQLState: String, vendorCode: Int, cause: Throwable) = ???

    @stub
    // Constructs a SQLRecoverableException object
    // with a given
    // reason, SQLState and  cause.
    def this(reason: String, SQLState: String, cause: Throwable) = ???

    @stub
    // Constructs a SQLRecoverableException object
    // with a given
    // reason and  cause.
    def this(reason: String, cause: Throwable) = ???
}
