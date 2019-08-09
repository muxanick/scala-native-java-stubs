package java.security

import java.lang.{Exception, Object, String, Throwable}

// This is the exception for invalid Keys (invalid encoding, wrong
// length, uninitialized, etc).
class InvalidKeyException extends KeyException {

    @stub
    // Constructs an InvalidKeyException with no detail message.
    def this() = ???

    @stub
    // Constructs an InvalidKeyException with the specified detail
    // message.
    def this(msg: String) = ???

    @stub
    // Creates a InvalidKeyException with the specified
    // detail message and cause.
    def this(message: String, cause: Throwable) = ???
}
