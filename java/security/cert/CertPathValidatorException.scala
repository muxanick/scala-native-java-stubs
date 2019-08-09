package java.security.cert

import java.lang.{Exception, Object, String, Throwable}
import java.security.GeneralSecurityException

// An exception indicating one of a variety of problems encountered when
// validating a certification path.
// 
// A CertPathValidatorException provides support for wrapping
// exceptions. The getCause method returns the throwable,
// if any, that caused this exception to be thrown.
// 
// A CertPathValidatorException may also include the
// certification path that was being validated when the exception was thrown,
// the index of the certificate in the certification path that caused the
// exception to be thrown, and the reason that caused the failure. Use the
// getCertPath, getIndex, and
// getReason methods to retrieve this information.
//
// 
// Concurrent Access
// 
// Unless otherwise specified, the methods defined in this class are not
// thread-safe. Multiple threads that need to access a single
// object concurrently should synchronize amongst themselves and
// provide the necessary locking. Multiple threads each manipulating
// separate objects need not synchronize.
class CertPathValidatorException extends GeneralSecurityException {

    @stub
    // Creates a CertPathValidatorException with
    // no detail message.
    def this() = ???

    @stub
    // Creates a CertPathValidatorException with the given
    // detail message.
    def this(msg: String) = ???

    @stub
    // Creates a CertPathValidatorException with the specified
    // detail message and cause.
    def this(msg: String, cause: Throwable) = ???

    @stub
    // Creates a CertPathValidatorException with the specified
    // detail message, cause, certification path, and index.
    def this(msg: String, cause: Throwable, certPath: CertPath, index: Int) = ???

    @stub
    // Creates a CertPathValidatorException with the specified
    // detail message, cause, certification path, index, and reason.
    def this(msg: String, cause: Throwable, certPath: CertPath, index: Int, reason: CertPathValidatorException.Reason) = ???

    @stub
    // Returns the certification path that was being validated when
    // the exception was thrown.
    def getCertPath(): CertPath = ???

    @stub
    // Returns the index of the certificate in the certification path
    // that caused the exception to be thrown.
    def getIndex(): Int = ???
}

object CertPathValidatorException {
    @stub
    // The BasicReason enumerates the potential reasons that a certification
    // path of any type may be invalid.
    def CertPathValidatorException.BasicReason: class = ???
}
