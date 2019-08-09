package java.security.cert

import java.lang.Object
import java.security.KeyStore

// Parameters used as input for the PKIX CertPathBuilder
// algorithm.
// 
// A PKIX CertPathBuilder uses these parameters to build a CertPath which has been
// validated according to the PKIX certification path validation algorithm.
//
// To instantiate a PKIXBuilderParameters object, an
// application must specify one or more most-trusted CAs as defined by
// the PKIX certification path validation algorithm. The most-trusted CA
// can be specified using one of two constructors. An application
// can call PKIXBuilderParameters(Set, CertSelector), specifying a
// Set of TrustAnchor objects, each of which
// identifies a most-trusted CA. Alternatively, an application can call
// PKIXBuilderParameters(KeyStore, CertSelector), specifying a
// KeyStore instance containing trusted certificate entries, each
// of which will be considered as a most-trusted CA.
//
// In addition, an application must specify constraints on the target
// certificate that the CertPathBuilder will attempt
// to build a path to. The constraints are specified as a
// CertSelector object. These constraints should provide the
// CertPathBuilder with enough search criteria to find the target
// certificate. Minimal criteria for an X509Certificate usually
// include the subject name and/or one or more subject alternative names.
// If enough criteria is not specified, the CertPathBuilder
// may throw a CertPathBuilderException.
// 
// Concurrent Access
// 
// Unless otherwise specified, the methods defined in this class are not
// thread-safe. Multiple threads that need to access a single
// object concurrently should synchronize amongst themselves and
// provide the necessary locking. Multiple threads each manipulating
// separate objects need not synchronize.
class PKIXBuilderParameters extends PKIXParameters {

    @stub
    // Creates an instance of PKIXBuilderParameters that
    // populates the set of most-trusted CAs from the trusted
    // certificate entries contained in the specified KeyStore.
    def this(keystore: KeyStore, targetConstraints: CertSelector) = ???

    @stub
    // Returns the value of the maximum number of intermediate non-self-issued
    // certificates that may exist in a certification path.
    def getMaxPathLength(): Int = ???

    @stub
    // Sets the value of the maximum number of non-self-issued intermediate
    // certificates that may exist in a certification path.
    def setMaxPathLength(maxPathLength: Int): Unit = ???
}