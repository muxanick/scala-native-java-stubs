package java.security

import java.lang.{Exception, Object, String, Throwable}

// This is the generic Signature exception.
class SignatureException extends GeneralSecurityException {

    @stub
    // Constructs a SignatureException with no detail message.
    def this() = ???

    @stub
    // Constructs a SignatureException with the specified detail
    // message.
    def this(msg: String) = ???

    @stub
    // Creates a SignatureException with the specified
    // detail message and cause.
    def this(message: String, cause: Throwable) = ???
}
