package java.security.cert

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/** The CRLReason enumeration specifies the reason that a certificate
 *  is revoked, as defined in 
 *  RFC 3280: Internet X.509 Public Key Infrastructure Certificate and CRL
 *  Profile.
 */
class CRLReason private (name: String, ordinal: Int) extends Enum[CRLReason](name, ordinal) {
}

object CRLReason {
    /** This reason indicates that it is known or suspected that the
     *  certificate subject's private key has been compromised.
     */
    final val AA_COMPROMISE = new CRLReason(AA_COMPROMISE, 0)

    /** This reason indicates that the subject's name or other information
     *  has changed.
     */
    final val AFFILIATION_CHANGED = new CRLReason(AFFILIATION_CHANGED, 1)

    /** This reason indicates that it is known or suspected that the
     *  certificate subject's private key has been compromised.
     */
    final val CA_COMPROMISE = new CRLReason(CA_COMPROMISE, 2)

    /** This reason indicates that the certificate has been put on hold. */
    final val CERTIFICATE_HOLD = new CRLReason(CERTIFICATE_HOLD, 3)

    /** This reason indicates that the certificate is no longer needed. */
    final val CESSATION_OF_OPERATION = new CRLReason(CESSATION_OF_OPERATION, 4)

    /** This reason indicates that it is known or suspected that the
     *  certificate subject's private key has been compromised.
     */
    final val KEY_COMPROMISE = new CRLReason(KEY_COMPROMISE, 5)

    /** This reason indicates that the privileges granted to the subject of
     *  the certificate have been withdrawn.
     */
    final val PRIVILEGE_WITHDRAWN = new CRLReason(PRIVILEGE_WITHDRAWN, 6)

    /** This reason indicates that the certificate was previously on hold
     *  and should be removed from the CRL.
     */
    final val REMOVE_FROM_CRL = new CRLReason(REMOVE_FROM_CRL, 7)

    /** This reason indicates that the certificate has been superseded. */
    final val SUPERSEDED = new CRLReason(SUPERSEDED, 8)

    /** This reason indicates that it is unspecified as to why the
     *  certificate has been revoked.
     */
    final val UNSPECIFIED = new CRLReason(UNSPECIFIED, 9)

    /** Unused reason. */
    final val UNUSED = new CRLReason(UNUSED, 10)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): CRLReason = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[CRLReason] = ???
}
