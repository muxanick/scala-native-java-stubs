package javax.xml.ws

import java.lang.{Exception, Object, RuntimeException, String, Throwable}
import scala.scalanative.annotation.stub

/** The WebServiceException class is the base
 *   exception class for all JAX-WS API runtime exceptions.
 */
class WebServiceException extends RuntimeException {

    /** Constructs a new exception with null as its
     *   detail message.
     */
    @stub
    def this() = ???

    /** Constructs a new exception with the specified detail
     *   message.
     */
    @stub
    def this(message: String) = ???

    /** Constructs a new exception with the specified detail
     *   message and cause.
     */
    @stub
    def this(message: String, cause: Throwable) = ???

    /** Constructs a new WebServiceException with the specified cause
     *   and a detail message of (cause==null ? null :
     *   cause.toString()) (which typically contains the
     *   class and detail message of cause).
     */
    @stub
    def this(cause: Throwable) = ???
}
