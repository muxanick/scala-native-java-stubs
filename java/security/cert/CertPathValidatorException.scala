package java.security.cert

import java.io.Serializable
import java.lang.{Enum, Exception, Object, String, Throwable}
import java.security.GeneralSecurityException
import scala.scalanative.annotation.stub

/** An exception indicating one of a variety of problems encountered when
 *  validating a certification path.
 *  
 *  A CertPathValidatorException provides support for wrapping
 *  exceptions. The getCause method returns the throwable,
 *  if any, that caused this exception to be thrown.
 *  
 *  A CertPathValidatorException may also include the
 *  certification path that was being validated when the exception was thrown,
 *  the index of the certificate in the certification path that caused the
 *  exception to be thrown, and the reason that caused the failure. Use the
 *  getCertPath, getIndex, and
 *  getReason methods to retrieve this information.
 * 
 *  
 *  Concurrent Access
 *  
 *  Unless otherwise specified, the methods defined in this class are not
 *  thread-safe. Multiple threads that need to access a single
 *  object concurrently should synchronize amongst themselves and
 *  provide the necessary locking. Multiple threads each manipulating
 *  separate objects need not synchronize.
 */
class CertPathValidatorException extends GeneralSecurityException {

    /** Creates a CertPathValidatorException with
     *  no detail message.
     */
    @stub
    def this() = ???

    /** Creates a CertPathValidatorException with the given
     *  detail message.
     */
    @stub
    def this(msg: String) = ???

    /** Creates a CertPathValidatorException with the specified
     *  detail message and cause.
     */
    @stub
    def this(msg: String, cause: Throwable) = ???

    /** Creates a CertPathValidatorException with the specified
     *  detail message, cause, certification path, and index.
     */
    @stub
    def this(msg: String, cause: Throwable, certPath: CertPath, index: Int) = ???

    /** Creates a CertPathValidatorException with the specified
     *  detail message, cause, certification path, index, and reason.
     */
    @stub
    def this(msg: String, cause: Throwable, certPath: CertPath, index: Int, reason: CertPathValidatorException.Reason) = ???

    /** Creates a CertPathValidatorException that wraps the
     *  specified throwable.
     */
    @stub
    def this(cause: Throwable) = ???

    /** Returns the certification path that was being validated when
     *  the exception was thrown.
     */
    @stub
    def getCertPath(): CertPath = ???

    /** Returns the index of the certificate in the certification path
     *  that caused the exception to be thrown.
     */
    @stub
    def getIndex(): Int = ???

    /** Returns the reason that the validation failed. */
    @stub
    def getReason(): CertPathValidatorException.Reason = ???
}

object CertPathValidatorException {
    /** The BasicReason enumerates the potential reasons that a certification
     *  path of any type may be invalid.
     */
    class BasicReason private (name: String, ordinal: Int) extends Enum[BasicReason](name, ordinal) with CertPathValidatorException.Reason {
    }

    object BasicReason {
        /** The public key or the signature algorithm has been constrained. */
        final val ALGORITHM_CONSTRAINED: BasicReason = new BasicReason("ALGORITHM_CONSTRAINED", 0)

        /** The certificate is expired. */
        final val EXPIRED: BasicReason = new BasicReason("EXPIRED", 1)

        /** The signature is invalid. */
        final val INVALID_SIGNATURE: BasicReason = new BasicReason("INVALID_SIGNATURE", 2)

        /** The certificate is not yet valid. */
        final val NOT_YET_VALID: BasicReason = new BasicReason("NOT_YET_VALID", 3)

        /** The certificate is revoked. */
        final val REVOKED: BasicReason = new BasicReason("REVOKED", 4)

        /** The revocation status of the certificate could not be determined. */
        final val UNDETERMINED_REVOCATION_STATUS: BasicReason = new BasicReason("UNDETERMINED_REVOCATION_STATUS", 5)

        /** Unspecified reason. */
        final val UNSPECIFIED: BasicReason = new BasicReason("UNSPECIFIED", 6)

        /** Returns the enum constant of this type with the specified name. */
        @stub
        def valueOf(name: String): BasicReason = ???

        /** Returns an array containing the constants of this enum type, in
         * the order they are declared.
         */
        @stub
        def values(): Array[BasicReason] = ???
    }


    /** The reason the validation algorithm failed. */
    trait Reason extends Serializable {

}
