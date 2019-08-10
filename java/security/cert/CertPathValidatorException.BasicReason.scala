package java.security.cert

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/** The BasicReason enumerates the potential reasons that a certification
 *  path of any type may be invalid.
 */
class CertPathValidatorException_BasicReason private (name: String, ordinal: Int) extends Enum[CertPathValidatorException.BasicReason](name, ordinal) with CertPathValidatorException.Reason {
}

object CertPathValidatorException_BasicReason {
    /** The public key or the signature algorithm has been constrained. */
    final val ALGORITHM_CONSTRAINED = new CertPathValidatorException.BasicReason(ALGORITHM_CONSTRAINED, 0)

    /** The certificate is expired. */
    final val EXPIRED = new CertPathValidatorException.BasicReason(EXPIRED, 1)

    /** The signature is invalid. */
    final val INVALID_SIGNATURE = new CertPathValidatorException.BasicReason(INVALID_SIGNATURE, 2)

    /** The certificate is not yet valid. */
    final val NOT_YET_VALID = new CertPathValidatorException.BasicReason(NOT_YET_VALID, 3)

    /** The certificate is revoked. */
    final val REVOKED = new CertPathValidatorException.BasicReason(REVOKED, 4)

    /** The revocation status of the certificate could not be determined. */
    final val UNDETERMINED_REVOCATION_STATUS = new CertPathValidatorException.BasicReason(UNDETERMINED_REVOCATION_STATUS, 5)

    /** Unspecified reason. */
    final val UNSPECIFIED = new CertPathValidatorException.BasicReason(UNSPECIFIED, 6)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): CertPathValidatorException.BasicReason = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[CertPathValidatorException.BasicReason] = ???
}
