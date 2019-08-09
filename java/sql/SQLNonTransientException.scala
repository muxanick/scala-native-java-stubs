package java.sql

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** The subclass of SQLException thrown when an instance where a retry
 *  of the same operation would fail unless the cause of the SQLException
 *  is corrected.
 * 
 */
class SQLNonTransientException extends SQLException {

    /** Constructs a SQLNonTransientException object. */
    @stub
    def this() = ???

    /** Constructs a SQLNonTransientException object
     *  with a given reason.
     */
    @stub
    def this(reason: String) = ???

    /** Constructs a SQLNonTransientException object
     *  with a given reason and SQLState.
     */
    @stub
    def this(reason: String, SQLState: String) = ???

    /** Constructs a SQLNonTransientException object
     *  with a given reason, SQLState  and
     *  vendorCode.
     */
    @stub
    def this(reason: String, SQLState: String, vendorCode: Int) = ???

    /** Constructs a SQLNonTransientException object
     *  with a given
     *  reason, SQLState, vendorCode
     *  and  cause.
     */
    @stub
    def this(reason: String, SQLState: String, vendorCode: Int, cause: Throwable) = ???

    /** Constructs a SQLNonTransientException object
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

    /** Constructs a SQLNonTransientException object
     *   with a given  cause.
     */
    @stub
    def this(cause: Throwable) = ???
}
