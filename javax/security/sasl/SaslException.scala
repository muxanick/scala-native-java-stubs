package javax.security.sasl

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}

// This class represents an error that has occurred when using SASL.
class SaslException extends IOException {

    @stub
    // Constructs a new instance of SaslException.
    def this() = ???

    @stub
    // Constructs a new instance of SaslException with a detailed message.
    def this(detail: String) = ???

    @stub
    // Returns the cause of this throwable or null if the
    // cause is nonexistent or unknown.
    def getCause(): Throwable = ???

    @stub
    // Initializes the cause of this throwable to the specified value.
    def initCause(cause: Throwable): Throwable = ???
}
