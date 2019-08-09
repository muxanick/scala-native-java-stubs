package java.sql

import java.lang.{Exception, Object, String, Throwable}

/** The subclass of SQLException for the SQLState class
 *  value '08', or under vendor-specified conditions.  This indicates
 *  that the connection operation that failed might be able to succeed if
 *  the operation is retried without any application-level changes.
 *  
 *  Please consult your driver vendor documentation for the vendor-specified
 *  conditions for which this Exception may be thrown.
 */
class SQLTransientConnectionException extends SQLTransientException {

    /** Constructs a SQLTransientConnectionException object. */
    @stub
    def this() = ???

    /** Constructs a SQLTransientConnectionException object
     *  with a given reason.
     */
    @stub
    def this(reason: String) = ???

    /** Constructs a SQLTransientConnectionException object
     *  with a given reason and SQLState.
     */
    @stub
    def this(reason: String, SQLState: String) = ???

    /** Constructs a SQLTransientConnectionException object
     *  with a given reason, SQLState  and
     *  vendorCode.
     */
    @stub
    def this(reason: String, SQLState: String, vendorCode: Int) = ???

    /** Constructs a SQLTransientConnectionException object
     *  with a given
     *  reason, SQLState, vendorCode
     *  and  cause.
     */
    @stub
    def this(reason: String, SQLState: String, vendorCode: Int, cause: Throwable) = ???

    /** Constructs a SQLTransientConnectionException object
     *  with a given
     *  reason, SQLState and  cause.
     */
    @stub
    def this(reason: String, SQLState: String, cause: Throwable) = ???

    /** Constructs a SQLTransientConnectionException object
     *  with a given
     *  reason and  cause.
     */
    @stub
    def this(reason: String, cause: Throwable) = ???
}
