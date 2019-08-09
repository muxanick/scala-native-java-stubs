package javax.crypto

import java.lang.{Exception, Object, Throwable}
import java.security.GeneralSecurityException

/** This exception is thrown when a particular padding mechanism is
 *  expected for the input data but the data is not padded properly.
 */
class BadPaddingException extends GeneralSecurityException {

    /** Constructs a BadPaddingException with no detail
     *  message.
     */
    @stub
    def this() = ???
}
