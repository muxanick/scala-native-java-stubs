package java.security

import java.lang.{Exception, Object, String, Throwable}

// This is the basic key exception.
class KeyException extends GeneralSecurityException {

    @stub
    // Constructs a KeyException with no detail message.
    def this() = ???

    @stub
    // Constructs a KeyException with the specified detail message.
    def this(msg: String) = ???

    @stub
    // Creates a KeyException with the specified
    // detail message and cause.
    def this(message: String, cause: Throwable) = ???
}
