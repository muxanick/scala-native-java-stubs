package java.security

import java.lang.{Exception, Object, RuntimeException, String, Throwable}
import scala.scalanative.annotation.stub

/** A runtime exception for Provider exceptions (such as
 *  misconfiguration errors or unrecoverable internal errors),
 *  which may be subclassed by Providers to
 *  throw specialized, provider-specific runtime errors.
 */
class ProviderException extends RuntimeException {

    /** Constructs a ProviderException with no detail message. */
    @stub
    def this() = ???

    /** Constructs a ProviderException with the specified detail
     *  message.
     */
    @stub
    def this(s: String) = ???

    /** Creates a ProviderException with the specified
     *  detail message and cause.
     */
    @stub
    def this(message: String, cause: Throwable) = ???

    /** Creates a ProviderException with the specified cause
     *  and a detail message of (cause==null ? null : cause.toString())
     *  (which typically contains the class and detail message of
     *  cause).
     */
    @stub
    def this(cause: Throwable) = ???
}
