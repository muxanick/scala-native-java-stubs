package javax.crypto

import java.lang.{Exception, Object, String, Throwable}
import java.security.GeneralSecurityException
import scala.scalanative.annotation.stub

/** This exception is thrown when a Cipher operating in
 *  an AEAD mode (such as GCM/CCM) is unable to verify the supplied
 *  authentication tag.
 */
class AEADBadTagException extends BadPaddingException {

    /** Constructs a AEADBadTagException with no detail message. */
    @stub
    def this() = ???

    /** Constructs a AEADBadTagException with the specified
     *  detail message.
     */
    @stub
    def this(msg: String) = ???
}
