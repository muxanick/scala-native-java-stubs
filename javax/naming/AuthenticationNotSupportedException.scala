package javax.naming

import java.lang.{Exception, Object, Throwable}

// This exception is thrown when
// the particular flavor of authentication requested is not supported.
// For example, if the program
// is attempting to use strong authentication but the directory/naming
// supports only simple authentication, this exception would be thrown.
// Identification of a particular flavor of authentication is
// provider- and server-specific. It may be specified using
// specific authentication schemes such
// those identified using SASL, or a generic authentication specifier
// (such as "simple" and "strong").
//
// If the program wants to handle this exception in particular, it
// should catch AuthenticationNotSupportedException explicitly before
// attempting to catch NamingException. After catching
// AuthenticationNotSupportedException, the program could
// reattempt the authentication using a different authentication flavor
// by updating the resolved context's environment properties accordingly.
// 
// Synchronization and serialization issues that apply to NamingException
// apply directly here.
class AuthenticationNotSupportedException extends NamingSecurityException {

    @stub
    // Constructs a new instance of AuthenticationNotSupportedException
    // all name resolution fields and explanation initialized to null.
    def this() = ???
}
