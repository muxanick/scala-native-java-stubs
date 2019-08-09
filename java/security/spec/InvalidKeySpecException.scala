package java.security.spec

import java.lang.{Exception, Object, String, Throwable}
import java.security.GeneralSecurityException

/** This is the exception for invalid key specifications. */
class InvalidKeySpecException extends GeneralSecurityException {

    /** Constructs an InvalidKeySpecException with no detail message. */
    @stub
    def this() = ???

    /** Constructs an InvalidKeySpecException with the specified detail
     *  message.
     */
    @stub
    def this(msg: String) = ???

    /** Creates a InvalidKeySpecException with the specified
     *  detail message and cause.
     */
    @stub
    def this(message: String, cause: Throwable) = ???
}
