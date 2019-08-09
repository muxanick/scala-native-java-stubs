package java.security.cert

import java.lang.{Object, String}
import java.security.KeyStore
import java.util.{Date, List, Set}

/** Parameters used as input for the PKIX CertPathValidator
 *  algorithm.
 *  
 *  A PKIX CertPathValidator uses these parameters to
 *  validate a CertPath according to the PKIX certification path
 *  validation algorithm.
 * 
 *  To instantiate a PKIXParameters object, an
 *  application must specify one or more most-trusted CAs as defined by
 *  the PKIX certification path validation algorithm. The most-trusted CAs
 *  can be specified using one of two constructors. An application
 *  can call PKIXParameters(Set),
 *  specifying a Set of TrustAnchor objects, each
 *  of which identify a most-trusted CA. Alternatively, an application can call
 *  PKIXParameters(KeyStore), specifying a
 *  KeyStore instance containing trusted certificate entries, each
 *  of which will be considered as a most-trusted CA.
 *  
 *  Once a PKIXParameters object has been created, other parameters
 *  can be specified (by calling setInitialPolicies
 *  or setDate, for instance) and then the
 *  PKIXParameters is passed along with the CertPath
 *  to be validated to CertPathValidator.validate.
 *  
 *  Any parameter that is not set (or is set to null) will
 *  be set to the default value for that parameter. The default value for the
 *  date parameter is null, which indicates
 *  the current time when the path is validated. The default for the
 *  remaining parameters is the least constrained.
 *  
 *  Concurrent Access
 *  
 *  Unless otherwise specified, the methods defined in this class are not
 *  thread-safe. Multiple threads that need to access a single
 *  object concurrently should synchronize amongst themselves and
 *  provide the necessary locking. Multiple threads each manipulating
 *  separate objects need not synchronize.
 */
class PKIXParameters extends Object with CertPathParameters {

    /** Creates an instance of PKIXParameters that
     *  populates the set of most-trusted CAs from the trusted
     *  certificate entries contained in the specified KeyStore.
     */
    @stub
    def this(keystore: KeyStore) = ???

    /** Adds a PKIXCertPathChecker to the list of certification
     *  path checkers.
     */
    @stub
    def addCertPathChecker(checker: PKIXCertPathChecker): Unit = ???

    /** Adds a CertStore to the end of the list of
     *  CertStores used in finding certificates and CRLs.
     */
    @stub
    def addCertStore(store: CertStore): Unit = ???

    /** Makes a copy of this PKIXParameters object. */
    @stub
    def clone(): Object = ???

    /** Returns the List of certification path checkers. */
    @stub
    def getCertPathCheckers(): List[PKIXCertPathChecker] = ???

    /** Returns an immutable List of CertStores that
     *  are used to find certificates and CRLs.
     */
    @stub
    def getCertStores(): List[CertStore] = ???

    /** Returns the time for which the validity of the certification path
     *  should be determined.
     */
    @stub
    def getDate(): Date = ???

    /** Returns an immutable Set of initial
     *  policy identifiers (OID strings), indicating that any one of these
     *  policies would be acceptable to the certificate user for the purposes of
     *  certification path processing.
     */
    @stub
    def getInitialPolicies(): Set[String] = ???

    /** Gets the PolicyQualifiersRejected flag. */
    @stub
    def getPolicyQualifiersRejected(): Boolean = ???

    /** Returns the signature provider's name, or null
     *  if not set.
     */
    @stub
    def getSigProvider(): String = ???

    /** Returns the required constraints on the target certificate. */
    @stub
    def getTargetCertConstraints(): CertSelector = ???

    /** Returns an immutable Set of the most-trusted
     *  CAs.
     */
    @stub
    def getTrustAnchors(): Set[TrustAnchor] = ???

    /** Checks whether the any policy OID should be processed if it
     *  is included in a certificate.
     */
    @stub
    def isAnyPolicyInhibited(): Boolean = ???

    /** Checks if explicit policy is required. */
    @stub
    def isExplicitPolicyRequired(): Boolean = ???

    /** Checks if policy mapping is inhibited. */
    @stub
    def isPolicyMappingInhibited(): Boolean = ???

    /** Checks the RevocationEnabled flag. */
    @stub
    def isRevocationEnabled(): Boolean = ???

    /** Sets state to determine if the any policy OID should be processed
     *  if it is included in a certificate.
     */
    @stub
    def setAnyPolicyInhibited(val: Boolean): Unit = ???

    /** Sets a List of additional certification path checkers. */
    @stub
    def setCertPathCheckers(checkers: List[PKIXCertPathChecker]): Unit = ???

    /** Sets the list of CertStores to be used in finding
     *  certificates and CRLs.
     */
    @stub
    def setCertStores(stores: List[CertStore]): Unit = ???

    /** Sets the time for which the validity of the certification path
     *  should be determined.
     */
    @stub
    def setDate(date: Date): Unit = ???

    /** Sets the ExplicitPolicyRequired flag. */
    @stub
    def setExplicitPolicyRequired(val: Boolean): Unit = ???

    /** Sets the Set of initial policy identifiers
     *  (OID strings), indicating that any one of these
     *  policies would be acceptable to the certificate user for the purposes of
     *  certification path processing.
     */
    @stub
    def setInitialPolicies(initialPolicies: Set[String]): Unit = ???

    /** Sets the PolicyMappingInhibited flag. */
    @stub
    def setPolicyMappingInhibited(val: Boolean): Unit = ???

    /** Sets the PolicyQualifiersRejected flag. */
    @stub
    def setPolicyQualifiersRejected(qualifiersRejected: Boolean): Unit = ???

    /** Sets the RevocationEnabled flag. */
    @stub
    def setRevocationEnabled(val: Boolean): Unit = ???

    /** Sets the signature provider's name. */
    @stub
    def setSigProvider(sigProvider: String): Unit = ???

    /** Sets the required constraints on the target certificate. */
    @stub
    def setTargetCertConstraints(selector: CertSelector): Unit = ???

    /** Sets the Set of most-trusted CAs. */
    @stub
    def setTrustAnchors(trustAnchors: Set[TrustAnchor]): Unit = ???
}
