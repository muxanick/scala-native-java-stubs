package javax.crypto

import java.lang.{Exception, Object, String, Throwable}
import java.security.GeneralSecurityException
import scala.scalanative.annotation.stub

/** This exception is thrown when a particular padding mechanism is
 *  requested but is not available in the environment.
 */
class NoSuchPaddingException extends GeneralSecurityException {

    /** Constructs a NoSuchPaddingException with no detail
     *  message.
     */
    @stub
    def this() = ???

    /** Constructs a NoSuchPaddingException with the specified
     *  detail message.
     */
    @stub
    def this(msg: String) = ???
}
