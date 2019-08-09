package java.security.cert

import java.lang.Object
import java.security.PublicKey

// This class represents the successful result of the PKIX certification
// path validation algorithm.
//
// Instances of PKIXCertPathValidatorResult are returned by the
// validate method of
// CertPathValidator objects implementing the PKIX algorithm.
//
//  All PKIXCertPathValidatorResult objects contain the
// valid policy tree and subject public key resulting from the
// validation algorithm, as well as a TrustAnchor describing
// the certification authority (CA) that served as a trust anchor for the
// certification path.
// 
// Concurrent Access
// 
// Unless otherwise specified, the methods defined in this class are not
// thread-safe. Multiple threads that need to access a single
// object concurrently should synchronize amongst themselves and
// provide the necessary locking. Multiple threads each manipulating
// separate objects need not synchronize.
class PKIXCertPathValidatorResult extends Object with CertPathValidatorResult {

    @stub
    // Returns a copy of this object.
    def clone(): Object = ???

    @stub
    // Returns the root node of the valid policy tree resulting from the
    // PKIX certification path validation algorithm.
    def getPolicyTree(): PolicyNode = ???

    @stub
    // Returns the public key of the subject (target) of the certification
    // path, including any inherited public key parameters if applicable.
    def getPublicKey(): PublicKey = ???

    @stub
    // Returns the TrustAnchor describing the CA that served
    // as a trust anchor for the certification path.
    def getTrustAnchor(): TrustAnchor = ???
}
