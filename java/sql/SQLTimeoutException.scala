package java.sql

import java.lang.{Exception, Object, String, Throwable}

// The subclass of SQLException thrown when the timeout specified by
// Statement.setQueryTimeout, DriverManager.setLoginTimeout,
// DataSource.setLoginTimeout,XADataSource.setLoginTimeout
// has expired.
//  This exception does not correspond to a standard SQLState.
class SQLTimeoutException extends SQLTransientException {

    @stub
    // Constructs a SQLTimeoutException object.
    def this() = ???

    @stub
    // Constructs a SQLTimeoutException object
    // with a given reason.
    def this(reason: String) = ???

    @stub
    // Constructs a SQLTimeoutException object
    // with a given reason and SQLState.
    def this(reason: String, SQLState: String) = ???

    @stub
    // Constructs a SQLTimeoutException object
    // with a given reason, SQLState  and
    // vendorCode.
    def this(reason: String, SQLState: String, vendorCode: Int) = ???

    @stub
    // Constructs a SQLTimeoutException object
    // with a given
    // reason, SQLState, vendorCode
    // and  cause.
    def this(reason: String, SQLState: String, vendorCode: Int, cause: Throwable) = ???

    @stub
    // Constructs a SQLTimeoutException object
    //  with a given
    // reason, SQLState and  cause.
    def this(reason: String, SQLState: String, cause: Throwable) = ???

    @stub
    // Constructs a SQLTimeoutException object
    // with a given
    // reason and  cause.
    def this(reason: String, cause: Throwable) = ???
}
