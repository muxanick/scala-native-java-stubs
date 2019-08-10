package java.security.cert

import java.lang.{Object, String}
import java.math.BigInteger
import java.util.{Collection, Date}
import javax.security.auth.x500.X500Principal
import scala.scalanative.annotation.stub

/** A CRLSelector that selects X509CRLs that
 *  match all specified criteria. This class is particularly useful when
 *  selecting CRLs from a CertStore to check revocation status
 *  of a particular certificate.
 *  
 *  When first constructed, an X509CRLSelector has no criteria
 *  enabled and each of the get methods return a default
 *  value (null). Therefore, the match method
 *  would return true for any X509CRL. Typically,
 *  several criteria are enabled (by calling setIssuers
 *  or setDateAndTime, for instance) and then the
 *  X509CRLSelector is passed to
 *  CertStore.getCRLs or some similar
 *  method.
 *  
 *  Please refer to RFC 3280:
 *  Internet X.509 Public Key Infrastructure Certificate and CRL Profile
 *  for definitions of the X.509 CRL fields and extensions mentioned below.
 *  
 *  Concurrent Access
 *  
 *  Unless otherwise specified, the methods defined in this class are not
 *  thread-safe. Multiple threads that need to access a single
 *  object concurrently should synchronize amongst themselves and
 *  provide the necessary locking. Multiple threads each manipulating
 *  separate objects need not synchronize.
 */
class X509CRLSelector extends Object with CRLSelector {

    /** Creates an X509CRLSelector. */
    @stub
    def this() = ???

    /** Adds a name to the issuerNames criterion. */
    @stub
    def addIssuer(issuer: X500Principal): Unit = ???

    /** Adds a name to the issuerNames criterion. */
    @stub
    def addIssuerName(name: Array[Byte]): Unit = ???

    /** Denigrated, use
     *  addIssuer(X500Principal) or
     *  addIssuerName(byte[]) instead.
     */
    @stub
    def addIssuerName(name: String): Unit = ???

    /** Returns a copy of this object. */
    @stub
    def clone(): Any = ???

    /** Returns the certificate being checked. */
    @stub
    def getCertificateChecking(): X509Certificate = ???

    /** Returns the dateAndTime criterion. */
    @stub
    def getDateAndTime(): Date = ???

    /** Returns a copy of the issuerNames criterion. */
    @stub
    def getIssuerNames(): Collection[Object] = ???

    /** Returns the issuerNames criterion. */
    @stub
    def getIssuers(): Collection[X500Principal] = ???

    /** Returns the maxCRLNumber criterion. */
    @stub
    def getMaxCRL(): BigInteger = ???

    /** Returns the minCRLNumber criterion. */
    @stub
    def getMinCRL(): BigInteger = ???

    /** Decides whether a CRL should be selected. */
    @stub
    def match(crl: CRL): Boolean = ???

    /** Sets the certificate being checked. */
    @stub
    def setCertificateChecking(cert: X509Certificate): Unit = ???

    /** Sets the dateAndTime criterion. */
    @stub
    def setDateAndTime(dateAndTime: Date): Unit = ???

    /** Note: use setIssuers(Collection) instead
     *  or only specify the byte array form of distinguished names when using
     *  this method.
     */
    @stub
    def setIssuerNames(names: Collection[_]): Unit = ???

    /** Sets the issuerNames criterion. */
    @stub
    def setIssuers(issuers: Collection[X500Principal]): Unit = ???

    /** Sets the maxCRLNumber criterion. */
    @stub
    def setMaxCRLNumber(maxCRL: BigInteger): Unit = ???

    /** Sets the minCRLNumber criterion. */
    @stub
    def setMinCRLNumber(minCRL: BigInteger): Unit = ???

    /** Returns a printable representation of the X509CRLSelector. */
    @stub
    def toString(): String = ???
}
