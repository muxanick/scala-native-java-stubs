package javax.crypto

import java.lang.{Exception, Object, String, Throwable}
import java.security.GeneralSecurityException
import scala.scalanative.annotation.stub

/** This exception is thrown when an output buffer provided by the user
 *  is too short to hold the operation result.
 */
class ShortBufferException extends GeneralSecurityException {

    /** Constructs a ShortBufferException with no detail
     *  message.
     */
    @stub
    def this() = ???

    /** Constructs a ShortBufferException with the specified
     *  detail message.
     */
    @stub
    def this(msg: String) = ???
}
