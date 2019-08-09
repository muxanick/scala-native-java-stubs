package java.sql

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** The subclass of SQLException thrown for the SQLState
 *  class value '08', or under vendor-specified conditions.  This
 *  indicates that the connection operation that failed will not succeed if
 *  the operation is retried without the cause of the failure being corrected.
 *  
 *  Please consult your driver vendor documentation for the vendor-specified
 *  conditions for which this Exception may be thrown.
 */
class SQLNonTransientConnectionException extends SQLNonTransientException {

    /** Constructs a SQLNonTransientConnectionException object. */
    @stub
    def this() = ???

    /** Constructs a SQLNonTransientConnectionException object
     *   with a given reason.
     */
    @stub
    def this(reason: String) = ???

    /** Constructs a SQLNonTransientConnectionException object
     *  with a given reason and SQLState.
     */
    @stub
    def this(reason: String, SQLState: String) = ???

    /** Constructs a SQLNonTransientConnectionException object
     *  with a given reason, SQLState  and
     *  vendorCode.
     */
    @stub
    def this(reason: String, SQLState: String, vendorCode: Int) = ???

    /** Constructs a SQLNonTransientConnectionException object
     *  with a given
     *  reason, SQLState, vendorCode
     *  and  cause.
     */
    @stub
    def this(reason: String, SQLState: String, vendorCode: Int, cause: Throwable) = ???

    /** Constructs a SQLNonTransientConnectionException object
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

    /** Constructs a SQLNonTransientConnectionException object
     *  with a given  cause.
     */
    @stub
    def this(cause: Throwable) = ???
}
