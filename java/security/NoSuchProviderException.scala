package java.security

import java.lang.{Exception, Object, Throwable}

/** This exception is thrown when a particular security provider is
 *  requested but is not available in the environment.
 */
class NoSuchProviderException extends GeneralSecurityException {

    /** Constructs a NoSuchProviderException with no detail message. */
    @stub
    def this() = ???
}
