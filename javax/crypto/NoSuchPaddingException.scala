package javax.crypto

import java.lang.{Exception, Object, Throwable}
import java.security.GeneralSecurityException

/** This exception is thrown when a particular padding mechanism is
 *  requested but is not available in the environment.
 */
class NoSuchPaddingException extends GeneralSecurityException {

    /** Constructs a NoSuchPaddingException with no detail
     *  message.
     */
    @stub
    def this() = ???
}
