package javax.security.auth.login

import java.lang.{Exception, Object, Throwable}
import java.security.GeneralSecurityException

// Signals that an account was not found.
//
//  This exception may be thrown by a LoginModule if it is unable
// to locate an account necessary to perform authentication.
class AccountNotFoundException extends AccountException {

    @stub
    // Constructs a AccountNotFoundException with no detail message.
    def this() = ???
}
