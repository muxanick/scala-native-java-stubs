package java.sql

import java.lang.{Exception, Object, String, Throwable}

// The subclass of SQLException thrown when the SQLState class value
// is '23', or under vendor-specified conditions.
// This indicates that an integrity
// constraint (foreign key, primary key or unique key) has been violated.
// 
// Please consult your driver vendor documentation for the vendor-specified
// conditions for which this Exception may be thrown.
class SQLIntegrityConstraintViolationException extends SQLNonTransientException {

    @stub
    // Constructs a SQLIntegrityConstraintViolationException object.
    def this() = ???

    @stub
    // Constructs a SQLIntegrityConstraintViolationException
    //  with a given reason.
    def this(reason: String) = ???

    @stub
    // Constructs a SQLIntegrityConstraintViolationException
    // object with a given reason and SQLState.
    def this(reason: String, SQLState: String) = ???

    @stub
    // Constructs a SQLIntegrityConstraintViolationException object
    // with a given reason, SQLState  and
    // vendorCode.
    def this(reason: String, SQLState: String, vendorCode: Int) = ???

    @stub
    // Constructs a SQLIntegrityConstraintViolationException object
    // with a given
    // reason, SQLState, vendorCode
    // and  cause.
    def this(reason: String, SQLState: String, vendorCode: Int, cause: Throwable) = ???

    @stub
    // Constructs a SQLIntegrityConstraintViolationException object
    //  with a given
    // reason, SQLState and  cause.
    def this(reason: String, SQLState: String, cause: Throwable) = ???

    @stub
    // Constructs a SQLIntegrityConstraintViolationException object
    // with a given
    // reason and  cause.
    def this(reason: String, cause: Throwable) = ???
}
