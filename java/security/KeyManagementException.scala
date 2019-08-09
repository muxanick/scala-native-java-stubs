package java.security

import java.lang.{Exception, Object, String, Throwable}

/** This is the general key management exception for all operations
 *  dealing with key management. Examples of subclasses of
 *  KeyManagementException that developers might create for
 *  giving more detailed information could include:
 * 
 *  
 *  KeyIDConflictException
 *  KeyAuthorizationFailureException
 *  ExpiredKeyException
 *  
 */
class KeyManagementException extends KeyException {

    /** Constructs a KeyManagementException with no detail message. */
    @stub
    def this() = ???

    /** Constructs a KeyManagementException with the specified detail
     *  message.
     */
    @stub
    def this(msg: String) = ???

    /** Creates a KeyManagementException with the specified
     *  detail message and cause.
     */
    @stub
    def this(message: String, cause: Throwable) = ???
}
