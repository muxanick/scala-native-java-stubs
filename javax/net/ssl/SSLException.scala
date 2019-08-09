package javax.net.ssl

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}

// Indicates some kind of error detected by an SSL subsystem.
// This class is the general class of exceptions produced
// by failed SSL-related operations.
class SSLException extends IOException {

    @stub
    // Constructs an exception reporting an error found by
    // an SSL subsystem.
    def this(reason: String) = ???

    @stub
    // Creates a SSLException with the specified
    // detail message and cause.
    def this(message: String, cause: Throwable) = ???
}