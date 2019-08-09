package java.security

import java.lang.{Exception, Object, String, Throwable}

// This is the generic KeyStore exception.
class KeyStoreException extends GeneralSecurityException {

    @stub
    // Constructs a KeyStoreException with no detail message.
    def this() = ???

    @stub
    // Constructs a KeyStoreException with the specified detail
    // message.
    def this(msg: String) = ???

    @stub
    // Creates a KeyStoreException with the specified
    // detail message and cause.
    def this(message: String, cause: Throwable) = ???
}
