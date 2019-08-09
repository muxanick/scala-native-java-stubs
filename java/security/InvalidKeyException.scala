package java.security

import java.lang.{Exception, Object, String, Throwable}

/** This is the exception for invalid Keys (invalid encoding, wrong
 *  length, uninitialized, etc).
 */
class InvalidKeyException extends KeyException {

    /** Constructs an InvalidKeyException with no detail message. */
    @stub
    def this() = ???

    /** Constructs an InvalidKeyException with the specified detail
     *  message.
     */
    @stub
    def this(msg: String) = ???

    /** Creates a InvalidKeyException with the specified
     *  detail message and cause.
     */
    @stub
    def this(message: String, cause: Throwable) = ???
}
