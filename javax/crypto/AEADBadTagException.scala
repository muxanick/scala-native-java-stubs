package javax.crypto

import java.lang.{Exception, Object, Throwable}
import java.security.GeneralSecurityException

// This exception is thrown when a Cipher operating in
// an AEAD mode (such as GCM/CCM) is unable to verify the supplied
// authentication tag.
class AEADBadTagException extends BadPaddingException {

    @stub
    // Constructs a AEADBadTagException with no detail message.
    def this() = ???
}
