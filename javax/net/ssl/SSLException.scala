package javax.net.ssl

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** Indicates some kind of error detected by an SSL subsystem.
 *  This class is the general class of exceptions produced
 *  by failed SSL-related operations.
 */
class SSLException extends IOException {

    /** Constructs an exception reporting an error found by
     *  an SSL subsystem.
     */
    @stub
    def this(reason: String) = ???

    /** Creates a SSLException with the specified
     *  detail message and cause.
     */
    @stub
    def this(message: String, cause: Throwable) = ???

    /** Creates a SSLException with the specified cause
     *  and a detail message of (cause==null ? null : cause.toString())
     *  (which typically contains the class and detail message of
     *  cause).
     */
    @stub
    def this(cause: Throwable) = ???
}
