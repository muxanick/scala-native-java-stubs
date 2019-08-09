package javax.security.auth.login

import java.lang.{Exception, Object, Throwable}
import java.security.GeneralSecurityException

// This is the basic login exception.
class LoginException extends GeneralSecurityException {

    @stub
    // Constructs a LoginException with no detail message.
    def this() = ???
}
