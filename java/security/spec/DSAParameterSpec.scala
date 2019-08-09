package java.security.spec

import java.lang.Object
import java.math.BigInteger
import java.security.interfaces.DSAParams

// This class specifies the set of parameters used with the DSA algorithm.
class DSAParameterSpec extends Object with AlgorithmParameterSpec, with DSAParams {

    @stub
    // Returns the base g.
    def getG(): BigInteger = ???

    @stub
    // Returns the prime p.
    def getP(): BigInteger = ???
}
