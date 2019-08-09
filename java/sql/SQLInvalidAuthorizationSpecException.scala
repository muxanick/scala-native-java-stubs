package java.sql

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** The subclass of SQLException thrown when the SQLState class value
 *  is '28', or under vendor-specified conditions. This indicates that
 *  the authorization credentials presented during connection establishment
 *  are not valid.
 *  
 *  Please consult your driver vendor documentation for the vendor-specified
 *  conditions for which this Exception may be thrown.
 */
class SQLInvalidAuthorizationSpecException extends SQLNonTransientException {

    /** Constructs a SQLInvalidAuthorizationSpecException object. */
    @stub
    def this() = ???

    /** Constructs a SQLInvalidAuthorizationSpecException object
     *   with a given reason.
     */
    @stub
    def this(reason: String) = ???

    /** Constructs a SQLInvalidAuthorizationSpecException object
     *  with a given reason and SQLState.
     */
    @stub
    def this(reason: String, SQLState: String) = ???

    /** Constructs a SQLInvalidAuthorizationSpecException object
     *  with a given reason, SQLState  and
     *  vendorCode.
     */
    @stub
    def this(reason: String, SQLState: String, vendorCode: Int) = ???

    /** Constructs a SQLInvalidAuthorizationSpecException object
     *  with a given
     *  reason, SQLState, vendorCode
     *  and  cause.
     */
    @stub
    def this(reason: String, SQLState: String, vendorCode: Int, cause: Throwable) = ???

    /** Constructs a SQLInvalidAuthorizationSpecException object
     *   with a given
     *  reason, SQLState and  cause.
     */
    @stub
    def this(reason: String, SQLState: String, cause: Throwable) = ???

    /** Constructs a SQLInvalidAuthorizationSpecException object
     *   with a given
     *  reason and  cause.
     */
    @stub
    def this(reason: String, cause: Throwable) = ???

    /** Constructs a SQLInvalidAuthorizationSpecException object
     *  with a given  cause.
     */
    @stub
    def this(cause: Throwable) = ???
}
