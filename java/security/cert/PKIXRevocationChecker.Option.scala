package java.security.cert

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/** Various revocation options that can be specified for the revocation
 *  checking mechanism.
 */
class PKIXRevocationChecker.Option private (name: String, ordinal: Int) extends Enum[PKIXRevocationChecker.Option](name, ordinal) {
}

object PKIXRevocationChecker.Option {
    /** Disable the fallback mechanism. */
    final val NO_FALLBACK = new PKIXRevocationChecker.Option(NO_FALLBACK, 0)

    /** Only check the revocation status of end-entity certificates. */
    final val ONLY_END_ENTITY = new PKIXRevocationChecker.Option(ONLY_END_ENTITY, 1)

    /** Prefer CRLs to OSCP. */
    final val PREFER_CRLS = new PKIXRevocationChecker.Option(PREFER_CRLS, 2)

    /** Allow revocation check to succeed if the revocation status cannot be
     *  determined for one of the following reasons:
     *  
     *   The CRL or OCSP response cannot be obtained because of a
     *       network error.
     */
    final val SOFT_FAIL = new PKIXRevocationChecker.Option(SOFT_FAIL, 3)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): PKIXRevocationChecker.Option = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[PKIXRevocationChecker.Option] = ???
}
