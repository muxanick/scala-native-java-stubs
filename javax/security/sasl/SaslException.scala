package javax.security.sasl

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}

/** This class represents an error that has occurred when using SASL. */
class SaslException extends IOException {

    /** Constructs a new instance of SaslException. */
    @stub
    def this() = ???

    /** Constructs a new instance of SaslException with a detailed message. */
    @stub
    def this(detail: String) = ???

    /** Returns the cause of this throwable or null if the
     *  cause is nonexistent or unknown.
     */
    @stub
    def getCause(): Throwable = ???

    /** Initializes the cause of this throwable to the specified value. */
    @stub
    def initCause(cause: Throwable): Throwable = ???
}
