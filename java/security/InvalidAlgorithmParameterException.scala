package java.security

import java.lang.{Exception, Object, String, Throwable}

// This is the exception for invalid or inappropriate algorithm parameters.
class InvalidAlgorithmParameterException extends GeneralSecurityException {

    @stub
    // Constructs an InvalidAlgorithmParameterException with no detail
    // message.
    def this() = ???

    @stub
    // Constructs an InvalidAlgorithmParameterException with the specified
    // detail message.
    def this(msg: String) = ???

    @stub
    // Creates a InvalidAlgorithmParameterException with the
    // specified detail message and cause.
    def this(message: String, cause: Throwable) = ???
}
