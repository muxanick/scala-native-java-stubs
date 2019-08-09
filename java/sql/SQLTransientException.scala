package java.sql

import java.lang.{Exception, Object, String, Throwable}

/** The subclass of SQLException is thrown in situations where a
 *  previously failed operation might be able to succeed when the operation is
 *  retried without any intervention by application-level functionality.
 * 
 */
class SQLTransientException extends SQLException {

    /** Constructs a SQLTransientException object. */
    @stub
    def this() = ???

    /** Constructs a SQLTransientException object
     *   with a given reason.
     */
    @stub
    def this(reason: String) = ???

    /** Constructs a SQLTransientException object
     *  with a given reason and SQLState.
     */
    @stub
    def this(reason: String, SQLState: String) = ???

    /** Constructs a SQLTransientException object
     *   with a given reason, SQLState  and
     *  vendorCode.
     */
    @stub
    def this(reason: String, SQLState: String, vendorCode: Int) = ???

    /** Constructs a SQLTransientException object
     *  with a given
     *  reason, SQLState, vendorCode
     *  and  cause.
     */
    @stub
    def this(reason: String, SQLState: String, vendorCode: Int, cause: Throwable) = ???

    /** Constructs a SQLTransientException object
     *  with a given
     *  reason, SQLState and  cause.
     */
    @stub
    def this(reason: String, SQLState: String, cause: Throwable) = ???

    /** Constructs a SQLTransientException object
     *  with a given
     *  reason and  cause.
     */
    @stub
    def this(reason: String, cause: Throwable) = ???
}
