package java.security.cert

import java.lang.{Object, String}
import java.math.BigInteger
import java.util.{Collection, Date}
import javax.security.auth.x500.X500Principal

// A CRLSelector that selects X509CRLs that
// match all specified criteria. This class is particularly useful when
// selecting CRLs from a CertStore to check revocation status
// of a particular certificate.
// 
// When first constructed, an X509CRLSelector has no criteria
// enabled and each of the get methods return a default
// value (null). Therefore, the match method
// would return true for any X509CRL. Typically,
// several criteria are enabled (by calling setIssuers
// or setDateAndTime, for instance) and then the
// X509CRLSelector is passed to
// CertStore.getCRLs or some similar
// method.
// 
// Please refer to RFC 3280:
// Internet X.509 Public Key Infrastructure Certificate and CRL Profile
// for definitions of the X.509 CRL fields and extensions mentioned below.
// 
// Concurrent Access
// 
// Unless otherwise specified, the methods defined in this class are not
// thread-safe. Multiple threads that need to access a single
// object concurrently should synchronize amongst themselves and
// provide the necessary locking. Multiple threads each manipulating
// separate objects need not synchronize.
class X509CRLSelector extends Object with CRLSelector {

    @stub
    // Adds a name to the issuerNames criterion.
    def addIssuer(issuer: X500Principal): Unit = ???

    @stub
    // Adds a name to the issuerNames criterion.
    def addIssuerName(name: Array[Byte]): Unit = ???

    @stub
    // Denigrated, use
    // addIssuer(X500Principal) or
    // addIssuerName(byte[]) instead.
    def addIssuerName(name: String): Unit = ???

    @stub
    // Returns a copy of this object.
    def clone(): Object = ???

    @stub
    // Returns the certificate being checked.
    def getCertificateChecking(): X509Certificate = ???

    @stub
    // Returns the dateAndTime criterion.
    def getDateAndTime(): Date = ???

    @stub
    // Returns a copy of the issuerNames criterion.
    def getIssuerNames(): Collection[Object] = ???

    @stub
    // Returns the issuerNames criterion.
    def getIssuers(): Collection[X500Principal] = ???

    @stub
    // Returns the maxCRLNumber criterion.
    def getMaxCRL(): BigInteger = ???

    @stub
    // Returns the minCRLNumber criterion.
    def getMinCRL(): BigInteger = ???

    @stub
    // Decides whether a CRL should be selected.
    def match(crl: CRL): Boolean = ???

    @stub
    // Sets the certificate being checked.
    def setCertificateChecking(cert: X509Certificate): Unit = ???

    @stub
    // Sets the dateAndTime criterion.
    def setDateAndTime(dateAndTime: Date): Unit = ???

    @stub
    // Note: use setIssuers(Collection) instead
    // or only specify the byte array form of distinguished names when using
    // this method.
    def setIssuerNames(names: Collection[_]): Unit = ???

    @stub
    // Sets the issuerNames criterion.
    def setIssuers(issuers: Collection[X500Principal]): Unit = ???

    @stub
    // Sets the maxCRLNumber criterion.
    def setMaxCRLNumber(maxCRL: BigInteger): Unit = ???

    @stub
    // Sets the minCRLNumber criterion.
    def setMinCRLNumber(minCRL: BigInteger): Unit = ???
}
