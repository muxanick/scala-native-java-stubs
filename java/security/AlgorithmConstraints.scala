package java.security

import java.lang.String
import java.util.Set

/** This interface specifies constraints for cryptographic algorithms,
 *  keys (key sizes), and other algorithm parameters.
 *  
 *  AlgorithmConstraints objects are immutable.  An implementation
 *  of this interface should not provide methods that can change the state
 *  of an instance once it has been created.
 *  
 *  Note that AlgorithmConstraints can be used to represent the
 *  restrictions described by the security properties
 *  jdk.certpath.disabledAlgorithms and
 *  jdk.tls.disabledAlgorithms, or could be used by a
 *  concrete PKIXCertPathChecker to check whether a specified
 *  certificate in the certification path contains the required algorithm
 *  constraints.
 */
trait AlgorithmConstraints {

    /** Determines whether a key is granted permission for the specified
     *  cryptographic primitives.
     */
    @stub
    def permits(primitives: Set[CryptoPrimitive], key: Key): Boolean = ???

    /** Determines whether an algorithm is granted permission for the
     *  specified cryptographic primitives.
     */
    @stub
    def permits(primitives: Set[CryptoPrimitive], algorithm: String, parameters: AlgorithmParameters): Boolean = ???
}
