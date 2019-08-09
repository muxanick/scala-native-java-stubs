package java.security

import java.lang.{Exception, Object, String, Throwable}

// This is the generic Message Digest exception.
class DigestException extends GeneralSecurityException {

    @stub
    // Constructs a DigestException with no detail message.
    def this() = ???

    @stub
    // Constructs a DigestException with the specified detail
    // message.
    def this(msg: String) = ???

    @stub
    // Creates a DigestException with the specified
    // detail message and cause.
    def this(message: String, cause: Throwable) = ???
}
