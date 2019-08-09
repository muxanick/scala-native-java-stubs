package java.security

import java.lang.{Exception, Object, String, Throwable}

// This is the general key management exception for all operations
// dealing with key management. Examples of subclasses of
// KeyManagementException that developers might create for
// giving more detailed information could include:
//
// 
// KeyIDConflictException
// KeyAuthorizationFailureException
// ExpiredKeyException
// 
class KeyManagementException extends KeyException {

    @stub
    // Constructs a KeyManagementException with no detail message.
    def this() = ???

    @stub
    // Constructs a KeyManagementException with the specified detail
    // message.
    def this(msg: String) = ???

    @stub
    // Creates a KeyManagementException with the specified
    // detail message and cause.
    def this(message: String, cause: Throwable) = ???
}
