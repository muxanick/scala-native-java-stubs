package java.security

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** This exception is thrown when a particular security provider is
 *  requested but is not available in the environment.
 */
class NoSuchProviderException extends GeneralSecurityException {

    /** Constructs a NoSuchProviderException with no detail message. */
    @stub
    def this() = ???

    /** Constructs a NoSuchProviderException with the specified detail
     *  message.
     */
    @stub
    def this(msg: String) = ???
}
