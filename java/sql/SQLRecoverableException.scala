package java.sql

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** The subclass of SQLException thrown in situations where a
 *  previously failed operation might be able to succeed if the application performs
 *   some recovery steps and retries the entire transaction or in the case of a
 *  distributed transaction, the transaction branch.  At a minimum,
 *  the recovery operation must include closing the current connection and getting
 *  a new connection.
 * 
 */
class SQLRecoverableException extends SQLException {

    /** Constructs a SQLRecoverableException object. */
    @stub
    def this() = ???

    /** Constructs a SQLRecoverableException object
     *   with a given reason.
     */
    @stub
    def this(reason: String) = ???

    /** Constructs a SQLRecoverableException object
     *  with a given reason and SQLState.
     */
    @stub
    def this(reason: String, SQLState: String) = ???

    /** Constructs a SQLRecoverableException object
     *   with a given reason, SQLState  and
     *  vendorCode.
     */
    @stub
    def this(reason: String, SQLState: String, vendorCode: Int) = ???

    /** Constructs a SQLRecoverableException object
     *  with a given
     *  reason, SQLState, vendorCode
     *  and  cause.
     */
    @stub
    def this(reason: String, SQLState: String, vendorCode: Int, cause: Throwable) = ???

    /** Constructs a SQLRecoverableException object
     *  with a given
     *  reason, SQLState and  cause.
     */
    @stub
    def this(reason: String, SQLState: String, cause: Throwable) = ???

    /** Constructs a SQLRecoverableException object
     *  with a given
     *  reason and  cause.
     */
    @stub
    def this(reason: String, cause: Throwable) = ???

    /** Constructs a SQLRecoverableException object
     *  with a given  cause.
     */
    @stub
    def this(cause: Throwable) = ???
}
