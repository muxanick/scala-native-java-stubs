package java.sql

import java.lang.{Exception, Object, String, Throwable}

/** The subclass of SQLException thrown when the timeout specified by
 *  Statement.setQueryTimeout, DriverManager.setLoginTimeout,
 *  DataSource.setLoginTimeout,XADataSource.setLoginTimeout
 *  has expired.
 *   This exception does not correspond to a standard SQLState.
 */
class SQLTimeoutException extends SQLTransientException {

    /** Constructs a SQLTimeoutException object. */
    @stub
    def this() = ???

    /** Constructs a SQLTimeoutException object
     *  with a given reason.
     */
    @stub
    def this(reason: String) = ???

    /** Constructs a SQLTimeoutException object
     *  with a given reason and SQLState.
     */
    @stub
    def this(reason: String, SQLState: String) = ???

    /** Constructs a SQLTimeoutException object
     *  with a given reason, SQLState  and
     *  vendorCode.
     */
    @stub
    def this(reason: String, SQLState: String, vendorCode: Int) = ???

    /** Constructs a SQLTimeoutException object
     *  with a given
     *  reason, SQLState, vendorCode
     *  and  cause.
     */
    @stub
    def this(reason: String, SQLState: String, vendorCode: Int, cause: Throwable) = ???

    /** Constructs a SQLTimeoutException object
     *   with a given
     *  reason, SQLState and  cause.
     */
    @stub
    def this(reason: String, SQLState: String, cause: Throwable) = ???

    /** Constructs a SQLTimeoutException object
     *  with a given
     *  reason and  cause.
     */
    @stub
    def this(reason: String, cause: Throwable) = ???
}
