package java.security.cert

import java.lang.{Exception, Object, String, Throwable}
import java.security.GeneralSecurityException

// An exception indicating one of a variety of problems retrieving
// certificates and CRLs from a CertStore.
// 
// A CertStoreException provides support for wrapping
// exceptions. The getCause method returns the throwable,
// if any, that caused this exception to be thrown.
// 
// Concurrent Access
// 
// Unless otherwise specified, the methods defined in this class are not
// thread-safe. Multiple threads that need to access a single
// object concurrently should synchronize amongst themselves and
// provide the necessary locking. Multiple threads each manipulating
// separate objects need not synchronize.
class CertStoreException extends GeneralSecurityException {

    @stub
    // Creates a CertStoreException with null as
    // its detail message.
    def this() = ???

    @stub
    // Creates a CertStoreException with the given detail
    // message.
    def this(msg: String) = ???

    @stub
    // Creates a CertStoreException with the specified detail
    // message and cause.
    def this(msg: String, cause: Throwable) = ???
}
