package javax.crypto

import java.lang.{Exception, Object, Throwable}
import java.security.GeneralSecurityException

/** This exception is thrown when an output buffer provided by the user
 *  is too short to hold the operation result.
 */
class ShortBufferException extends GeneralSecurityException {

    /** Constructs a ShortBufferException with no detail
     *  message.
     */
    @stub
    def this() = ???
}
