package java.security.cert

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/** The PKIXReason enumerates the potential PKIX-specific reasons
 *  that an X.509 certification path may be invalid according to the PKIX
 *  (RFC 3280) standard. These reasons are in addition to those of the
 *  CertPathValidatorException.BasicReason enumeration.
 */
class PKIXReason private (name: String, ordinal: Int) extends Enum[PKIXReason](name, ordinal) with CertPathValidatorException.Reason {
}

object PKIXReason {
    /** The certificate's key usage is invalid. */
    final val INVALID_KEY_USAGE: PKIXReason = new PKIXReason("INVALID_KEY_USAGE", 0)

    /** The name constraints have been violated. */
    final val INVALID_NAME: PKIXReason = new PKIXReason("INVALID_NAME", 1)

    /** The policy constraints have been violated. */
    final val INVALID_POLICY: PKIXReason = new PKIXReason("INVALID_POLICY", 2)

    /** The certificate does not chain correctly. */
    final val NAME_CHAINING: PKIXReason = new PKIXReason("NAME_CHAINING", 3)

    /** No acceptable trust anchor found. */
    final val NO_TRUST_ANCHOR: PKIXReason = new PKIXReason("NO_TRUST_ANCHOR", 4)

    /** The certificate is not a CA certificate. */
    final val NOT_CA_CERT: PKIXReason = new PKIXReason("NOT_CA_CERT", 5)

    /** The path length constraint has been violated. */
    final val PATH_TOO_LONG: PKIXReason = new PKIXReason("PATH_TOO_LONG", 6)

    /** The certificate contains one or more unrecognized critical
     *  extensions.
     */
    final val UNRECOGNIZED_CRIT_EXT: PKIXReason = new PKIXReason("UNRECOGNIZED_CRIT_EXT", 7)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): PKIXReason = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[PKIXReason] = ???
}
