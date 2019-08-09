package javax.crypto.spec

import java.lang.Object
import java.security.spec.AlgorithmParameterSpec

// This class specifies the set of parameters used with password-based
// encryption (PBE), as defined in the
// PKCS #5
// standard.
class PBEParameterSpec extends Object with AlgorithmParameterSpec {

    @stub
    // Constructs a parameter set for password-based encryption as defined in
    // the PKCS #5 standard.
    def this(salt: Array[Byte], iterationCount: Int) = ???

    @stub
    // Returns the iteration count.
    def getIterationCount(): Int = ???

    @stub
    // Returns the cipher algorithm parameter specification.
    def getParameterSpec(): AlgorithmParameterSpec = ???
}
