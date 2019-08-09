package java.security.spec

import java.lang.{Exception, Object, String, Throwable}
import java.security.GeneralSecurityException

// This is the exception for invalid key specifications.
class InvalidKeySpecException extends GeneralSecurityException {

    @stub
    // Constructs an InvalidKeySpecException with no detail message.
    def this() = ???

    @stub
    // Constructs an InvalidKeySpecException with the specified detail
    // message.
    def this(msg: String) = ???

    @stub
    // Creates a InvalidKeySpecException with the specified
    // detail message and cause.
    def this(message: String, cause: Throwable) = ???
}
