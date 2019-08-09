package java.security.cert

import java.lang.Object

/** This class represents the successful result of the PKIX certification
 *  path builder algorithm. All certification paths that are built and
 *  returned using this algorithm are also validated according to the PKIX
 *  certification path validation algorithm.
 * 
 *  Instances of PKIXCertPathBuilderResult are returned by
 *  the build method of CertPathBuilder
 *  objects implementing the PKIX algorithm.
 * 
 *  All PKIXCertPathBuilderResult objects contain the
 *  certification path constructed by the build algorithm, the
 *  valid policy tree and subject public key resulting from the build
 *  algorithm, and a TrustAnchor describing the certification
 *  authority (CA) that served as a trust anchor for the certification path.
 *  
 *  Concurrent Access
 *  
 *  Unless otherwise specified, the methods defined in this class are not
 *  thread-safe. Multiple threads that need to access a single
 *  object concurrently should synchronize amongst themselves and
 *  provide the necessary locking. Multiple threads each manipulating
 *  separate objects need not synchronize.
 */
class PKIXCertPathBuilderResult extends PKIXCertPathValidatorResult with CertPathBuilderResult {

    /** Returns the built and validated certification path. */
    @stub
    def getCertPath(): CertPath = ???
}
