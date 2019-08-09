package java.security.cert

import java.lang.{Object, String}
import java.security.Provider

/** A class for building certification paths (also known as certificate chains).
 *  
 *  This class uses a provider-based architecture.
 *  To create a CertPathBuilder, call
 *  one of the static getInstance methods, passing in the
 *  algorithm name of the CertPathBuilder desired and optionally
 *  the name of the provider desired.
 * 
 *  Once a CertPathBuilder object has been created, certification
 *  paths can be constructed by calling the build method and
 *  passing it an algorithm-specific set of parameters. If successful, the
 *  result (including the CertPath that was built) is returned
 *  in an object that implements the CertPathBuilderResult
 *  interface.
 * 
 *  The getRevocationChecker() method allows an application to specify
 *  additional algorithm-specific parameters and options used by the
 *  CertPathBuilder when checking the revocation status of certificates.
 *  Here is an example demonstrating how it is used with the PKIX algorithm:
 * 
 *  
 *  CertPathBuilder cpb = CertPathBuilder.getInstance("PKIX");
 *  PKIXRevocationChecker rc = (PKIXRevocationChecker)cpb.getRevocationChecker();
 *  rc.setOptions(EnumSet.of(Option.PREFER_CRLS));
 *  params.addCertPathChecker(rc);
 *  CertPathBuilderResult cpbr = cpb.build(params);
 *  
 * 
 *  Every implementation of the Java platform is required to support the
 *  following standard CertPathBuilder algorithm:
 *  
 *  PKIX
 *  
 *  This algorithm is described in the 
 *  CertPathBuilder section of the
 *  Java Cryptography Architecture Standard Algorithm Name Documentation.
 *  Consult the release documentation for your implementation to see if any
 *  other algorithms are supported.
 * 
 *  
 *  Concurrent Access
 *  
 *  The static methods of this class are guaranteed to be thread-safe.
 *  Multiple threads may concurrently invoke the static methods defined in
 *  this class with no ill effects.
 *  
 *  However, this is not true for the non-static methods defined by this class.
 *  Unless otherwise documented by a specific provider, threads that need to
 *  access a single CertPathBuilder instance concurrently should
 *  synchronize amongst themselves and provide the necessary locking. Multiple
 *  threads each manipulating a different CertPathBuilder instance
 *  need not synchronize.
 */
class CertPathBuilder extends Object {

    /** Attempts to build a certification path using the specified algorithm
     *  parameter set.
     */
    @stub
    def build(params: CertPathParameters): CertPathBuilderResult = ???

    /** Returns the name of the algorithm of this CertPathBuilder. */
    @stub
    def getAlgorithm(): String = ???

    /** Returns the provider of this CertPathBuilder. */
    @stub
    def getProvider(): Provider = ???
}

object CertPathBuilder {
    /** Returns the default CertPathBuilder type as specified by
     *  the certpathbuilder.type security property, or the string
     *  "PKIX" if no such property exists.
     */
    @stub
    def getDefaultType(): String = ???

    /** Returns a CertPathBuilder object that implements the
     *  specified algorithm.
     */
    @stub
    def getInstance(algorithm: String): CertPathBuilder = ???

    /** Returns a CertPathBuilder object that implements the
     *  specified algorithm.
     */
    @stub
    def getInstance(algorithm: String, provider: Provider): CertPathBuilder = ???

    /** Returns a CertPathBuilder object that implements the
     *  specified algorithm.
     */
    @stub
    def getInstance(algorithm: String, provider: String): CertPathBuilder = ???
}
