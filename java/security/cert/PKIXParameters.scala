package java.security.cert

import java.lang.{Object, String}
import java.security.KeyStore
import java.util.{Date, List, Set}

// Parameters used as input for the PKIX CertPathValidator
// algorithm.
// 
// A PKIX CertPathValidator uses these parameters to
// validate a CertPath according to the PKIX certification path
// validation algorithm.
//
// To instantiate a PKIXParameters object, an
// application must specify one or more most-trusted CAs as defined by
// the PKIX certification path validation algorithm. The most-trusted CAs
// can be specified using one of two constructors. An application
// can call PKIXParameters(Set),
// specifying a Set of TrustAnchor objects, each
// of which identify a most-trusted CA. Alternatively, an application can call
// PKIXParameters(KeyStore), specifying a
// KeyStore instance containing trusted certificate entries, each
// of which will be considered as a most-trusted CA.
// 
// Once a PKIXParameters object has been created, other parameters
// can be specified (by calling setInitialPolicies
// or setDate, for instance) and then the
// PKIXParameters is passed along with the CertPath
// to be validated to CertPathValidator.validate.
// 
// Any parameter that is not set (or is set to null) will
// be set to the default value for that parameter. The default value for the
// date parameter is null, which indicates
// the current time when the path is validated. The default for the
// remaining parameters is the least constrained.
// 
// Concurrent Access
// 
// Unless otherwise specified, the methods defined in this class are not
// thread-safe. Multiple threads that need to access a single
// object concurrently should synchronize amongst themselves and
// provide the necessary locking. Multiple threads each manipulating
// separate objects need not synchronize.
class PKIXParameters extends Object with CertPathParameters {

    @stub
    // Creates an instance of PKIXParameters that
    // populates the set of most-trusted CAs from the trusted
    // certificate entries contained in the specified KeyStore.
    def this(keystore: KeyStore) = ???

    @stub
    // Adds a PKIXCertPathChecker to the list of certification
    // path checkers.
    def addCertPathChecker(checker: PKIXCertPathChecker): Unit = ???

    @stub
    // Adds a CertStore to the end of the list of
    // CertStores used in finding certificates and CRLs.
    def addCertStore(store: CertStore): Unit = ???

    @stub
    // Makes a copy of this PKIXParameters object.
    def clone(): Object = ???

    @stub
    // Returns the List of certification path checkers.
    def getCertPathCheckers(): List[PKIXCertPathChecker] = ???

    @stub
    // Returns an immutable List of CertStores that
    // are used to find certificates and CRLs.
    def getCertStores(): List[CertStore] = ???

    @stub
    // Returns the time for which the validity of the certification path
    // should be determined.
    def getDate(): Date = ???

    @stub
    // Returns an immutable Set of initial
    // policy identifiers (OID strings), indicating that any one of these
    // policies would be acceptable to the certificate user for the purposes of
    // certification path processing.
    def getInitialPolicies(): Set[String] = ???

    @stub
    // Gets the PolicyQualifiersRejected flag.
    def getPolicyQualifiersRejected(): Boolean = ???

    @stub
    // Returns the signature provider's name, or null
    // if not set.
    def getSigProvider(): String = ???

    @stub
    // Returns the required constraints on the target certificate.
    def getTargetCertConstraints(): CertSelector = ???

    @stub
    // Returns an immutable Set of the most-trusted
    // CAs.
    def getTrustAnchors(): Set[TrustAnchor] = ???

    @stub
    // Checks whether the any policy OID should be processed if it
    // is included in a certificate.
    def isAnyPolicyInhibited(): Boolean = ???

    @stub
    // Checks if explicit policy is required.
    def isExplicitPolicyRequired(): Boolean = ???

    @stub
    // Checks if policy mapping is inhibited.
    def isPolicyMappingInhibited(): Boolean = ???

    @stub
    // Checks the RevocationEnabled flag.
    def isRevocationEnabled(): Boolean = ???

    @stub
    // Sets state to determine if the any policy OID should be processed
    // if it is included in a certificate.
    def setAnyPolicyInhibited(val: Boolean): Unit = ???

    @stub
    // Sets a List of additional certification path checkers.
    def setCertPathCheckers(checkers: List[PKIXCertPathChecker]): Unit = ???

    @stub
    // Sets the list of CertStores to be used in finding
    // certificates and CRLs.
    def setCertStores(stores: List[CertStore]): Unit = ???

    @stub
    // Sets the time for which the validity of the certification path
    // should be determined.
    def setDate(date: Date): Unit = ???

    @stub
    // Sets the ExplicitPolicyRequired flag.
    def setExplicitPolicyRequired(val: Boolean): Unit = ???

    @stub
    // Sets the Set of initial policy identifiers
    // (OID strings), indicating that any one of these
    // policies would be acceptable to the certificate user for the purposes of
    // certification path processing.
    def setInitialPolicies(initialPolicies: Set[String]): Unit = ???

    @stub
    // Sets the PolicyMappingInhibited flag.
    def setPolicyMappingInhibited(val: Boolean): Unit = ???

    @stub
    // Sets the PolicyQualifiersRejected flag.
    def setPolicyQualifiersRejected(qualifiersRejected: Boolean): Unit = ???

    @stub
    // Sets the RevocationEnabled flag.
    def setRevocationEnabled(val: Boolean): Unit = ???

    @stub
    // Sets the signature provider's name.
    def setSigProvider(sigProvider: String): Unit = ???

    @stub
    // Sets the required constraints on the target certificate.
    def setTargetCertConstraints(selector: CertSelector): Unit = ???

    @stub
    // Sets the Set of most-trusted CAs.
    def setTrustAnchors(trustAnchors: Set[TrustAnchor]): Unit = ???
}
