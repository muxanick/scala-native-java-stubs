package javax.security.auth.login

import java.lang.{Exception, Object, Throwable}
import java.security.GeneralSecurityException

// Signals that a credential was not found.
//
//  This exception may be thrown by a LoginModule if it is unable
// to locate a credential necessary to perform authentication.
class CredentialNotFoundException extends CredentialException {

    @stub
    // Constructs a CredentialNotFoundException with no detail message.
    def this() = ???
}
