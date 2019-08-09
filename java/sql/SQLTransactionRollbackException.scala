package java.sql

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** The subclass of SQLException thrown when the SQLState class value
 *  is '40', or under vendor-specified conditions. This indicates that the
 *  current statement was automatically rolled back by the database because
 *  of deadlock or other transaction serialization failures.
 *  
 *  Please consult your driver vendor documentation for the vendor-specified
 *  conditions for which this Exception may be thrown.
 */
class SQLTransactionRollbackException extends SQLTransientException {

    /** Constructs a SQLTransactionRollbackException object. */
    @stub
    def this() = ???

    /** Constructs a SQLTransactionRollbackException object
     *  with a given reason.
     */
    @stub
    def this(reason: String) = ???

    /** Constructs a SQLTransactionRollbackException object
     *  with a given reason and SQLState.
     */
    @stub
    def this(reason: String, SQLState: String) = ???

    /** Constructs a SQLTransactionRollbackException object
     *  with a given reason, SQLState  and
     *  vendorCode.
     */
    @stub
    def this(reason: String, SQLState: String, vendorCode: Int) = ???

    /** Constructs a SQLTransactionRollbackException object
     *  with a given
     *  reason, SQLState, vendorCode
     *  and  cause.
     */
    @stub
    def this(reason: String, SQLState: String, vendorCode: Int, cause: Throwable) = ???

    /** Constructs a SQLTransactionRollbackException object
     *  with a given
     *  reason, SQLState and  cause.
     */
    @stub
    def this(reason: String, SQLState: String, cause: Throwable) = ???

    /** Constructs a SQLTransactionRollbackException object
     *  with a given
     *  reason and  cause.
     */
    @stub
    def this(reason: String, cause: Throwable) = ???

    /** Constructs a SQLTransactionRollbackException object
     *  with a given  cause.
     */
    @stub
    def this(cause: Throwable) = ???
}
