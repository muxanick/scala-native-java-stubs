package javax.crypto

import java.lang.{Exception, Object, String, Throwable}
import java.security.GeneralSecurityException
import scala.scalanative.annotation.stub

/** This exception is thrown when a particular padding mechanism is
 *  expected for the input data but the data is not padded properly.
 */
class BadPaddingException extends GeneralSecurityException {

    /** Constructs a BadPaddingException with no detail
     *  message.
     */
    @stub
    def this() = ???

    /** Constructs a BadPaddingException with the specified
     *  detail message.
     */
    @stub
    def this(msg: String) = ???
}
