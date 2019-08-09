package javax.naming

import java.lang.{Exception, Object, Throwable}

// This exception is thrown when an authentication error occurs while
// accessing the naming or directory service.
// An authentication error can happen, for example, when the credentials
// supplied by the user program is invalid or otherwise fails to
// authenticate the user to the naming/directory service.
//
// If the program wants to handle this exception in particular, it
// should catch AuthenticationException explicitly before attempting to
// catch NamingException. After catching AuthenticationException, the
// program could reattempt the authentication by updating
// the resolved context's environment properties with the appropriate
// appropriate credentials.
// 
// Synchronization and serialization issues that apply to NamingException
// apply directly here.
class AuthenticationException extends NamingSecurityException {

    @stub
    // Constructs a new instance of AuthenticationException.
    def this() = ???
}
