package java.security.cert

import java.lang.{Enum, Object, String}
import java.net.URI
import java.util.{List, Map, Set}
import scala.scalanative.annotation.stub

/** A PKIXCertPathChecker for checking the revocation status of
 *  certificates with the PKIX algorithm.
 * 
 *  A PKIXRevocationChecker checks the revocation status of
 *  certificates with the Online Certificate Status Protocol (OCSP) or
 *  Certificate Revocation Lists (CRLs). OCSP is described in RFC 2560 and
 *  is a network protocol for determining the status of a certificate. A CRL
 *  is a time-stamped list identifying revoked certificates, and RFC 5280
 *  describes an algorithm for determining the revocation status of certificates
 *  using CRLs.
 * 
 *  Each PKIXRevocationChecker must be able to check the revocation
 *  status of certificates with OCSP and CRLs. By default, OCSP is the
 *  preferred mechanism for checking revocation status, with CRLs as the
 *  fallback mechanism. However, this preference can be switched to CRLs with
 *  the PREFER_CRLS option. In addition, the fallback
 *  mechanism can be disabled with the NO_FALLBACK
 *  option.
 * 
 *  A PKIXRevocationChecker is obtained by calling the
 *  getRevocationChecker method
 *  of a PKIX CertPathValidator. Additional parameters and options
 *  specific to revocation can be set (by calling the
 *  setOcspResponder method for instance). The
 *  PKIXRevocationChecker is added to a PKIXParameters object
 *  using the addCertPathChecker
 *  or setCertPathCheckers method,
 *  and then the PKIXParameters is passed along with the CertPath
 *  to be validated to the validate method
 *  of a PKIX CertPathValidator. When supplying a revocation checker in
 *  this manner, it will be used to check revocation irrespective of the setting
 *  of the RevocationEnabled flag.
 *  Similarly, a PKIXRevocationChecker may be added to a
 *  PKIXBuilderParameters object for use with a PKIX
 *  CertPathBuilder.
 * 
 *  Note that when a PKIXRevocationChecker is added to
 *  PKIXParameters, it clones the PKIXRevocationChecker;
 *  thus any subsequent modifications to the PKIXRevocationChecker
 *  have no effect.
 * 
 *  Any parameter that is not set (or is set to null) will be set to
 *  the default value for that parameter.
 * 
 *  Concurrent Access
 * 
 *  Unless otherwise specified, the methods defined in this class are not
 *  thread-safe. Multiple threads that need to access a single object
 *  concurrently should synchronize amongst themselves and provide the
 *  necessary locking. Multiple threads each manipulating separate objects
 *  need not synchronize.
 */
abstract class PKIXRevocationChecker extends PKIXCertPathChecker {

    /** Default constructor. */
    @stub
    protected def this() = ???

    /** Returns a clone of this object. */
    def clone(): PKIXRevocationChecker

    /** Gets the optional OCSP request extensions. */
    def getOcspExtensions(): List[Extension]

    /** Gets the URI that identifies the location of the OCSP responder. */
    def getOcspResponder(): URI

    /** Gets the OCSP responder's certificate. */
    def getOcspResponderCert(): X509Certificate

    /** Gets the OCSP responses. */
    def getOcspResponses(): Map[X509Certificate, Array[Byte]]

    /** Gets the revocation options. */
    def getOptions(): Set[PKIXRevocationChecker.Option]

    /** Returns a list containing the exceptions that are ignored by the
     *  revocation checker when the SOFT_FAIL option
     *  is set.
     */
    def getSoftFailExceptions(): List[CertPathValidatorException]

    /** Sets the optional OCSP request extensions. */
    def setOcspExtensions(extensions: List[Extension]): Unit

    /** Sets the URI that identifies the location of the OCSP responder. */
    def setOcspResponder(uri: URI): Unit

    /** Sets the OCSP responder's certificate. */
    def setOcspResponderCert(cert: X509Certificate): Unit

    /** Sets the OCSP responses. */
    def setOcspResponses(responses: Map[X509Certificate, Array[Byte]]): Unit

    /** Sets the revocation options. */
    def setOptions(options: Set[PKIXRevocationChecker.Option]): Unit
}

object PKIXRevocationChecker {
    /** Various revocation options that can be specified for the revocation
     *  checking mechanism.
     */
    class Option private (name: String, ordinal: Int) extends Enum[Option](name, ordinal) {
    }

    object Option {
        /** Disable the fallback mechanism. */
        final val NO_FALLBACK: Option = new Option("NO_FALLBACK", 0)

        /** Only check the revocation status of end-entity certificates. */
        final val ONLY_END_ENTITY: Option = new Option("ONLY_END_ENTITY", 1)

        /** Prefer CRLs to OSCP. */
        final val PREFER_CRLS: Option = new Option("PREFER_CRLS", 2)

        /** Allow revocation check to succeed if the revocation status cannot be
         *  determined for one of the following reasons:
         *  
         *   The CRL or OCSP response cannot be obtained because of a
         *       network error.
         */
        final val SOFT_FAIL: Option = new Option("SOFT_FAIL", 3)

        /** Returns the enum constant of this type with the specified name. */
        @stub
        def valueOf(name: String): Option = ???

        /** Returns an array containing the constants of this enum type, in
         * the order they are declared.
         */
        @stub
        def values(): Array[Option] = ???
    }

}
