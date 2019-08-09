package java.security

import java.lang.{Exception, Object, String, Throwable}

// The GeneralSecurityException class is a generic
// security exception class that provides type safety for all the
// security-related exception classes that extend from it.
class GeneralSecurityException extends Exception {

    @stub
    // Constructs a GeneralSecurityException with no detail message.
    def this() = ???

    @stub
    // Constructs a GeneralSecurityException with the specified detail
    // message.
    def this(msg: String) = ???

    @stub
    // Creates a GeneralSecurityException with the specified
    // detail message and cause.
    def this(message: String, cause: Throwable) = ???
}
