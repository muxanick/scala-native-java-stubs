package java.security

import java.lang.{Exception, Object, String, Throwable}

// This exception is thrown when a particular cryptographic algorithm is
// requested but is not available in the environment.
class NoSuchAlgorithmException extends GeneralSecurityException {

    @stub
    // Constructs a NoSuchAlgorithmException with no detail
    // message.
    def this() = ???

    @stub
    // Constructs a NoSuchAlgorithmException with the specified
    // detail message.
    def this(msg: String) = ???

    @stub
    // Creates a NoSuchAlgorithmException with the specified
    // detail message and cause.
    def this(message: String, cause: Throwable) = ???
}
