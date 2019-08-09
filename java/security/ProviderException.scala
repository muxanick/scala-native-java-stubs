package java.security

import java.lang.{Exception, Object, RuntimeException, String, Throwable}

// A runtime exception for Provider exceptions (such as
// misconfiguration errors or unrecoverable internal errors),
// which may be subclassed by Providers to
// throw specialized, provider-specific runtime errors.
class ProviderException extends RuntimeException {

    @stub
    // Constructs a ProviderException with no detail message.
    def this() = ???

    @stub
    // Constructs a ProviderException with the specified detail
    // message.
    def this(s: String) = ???

    @stub
    // Creates a ProviderException with the specified
    // detail message and cause.
    def this(message: String, cause: Throwable) = ???
}
