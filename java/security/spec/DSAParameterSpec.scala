package java.security.spec

import java.lang.Object
import java.math.BigInteger
import java.security.interfaces.DSAParams

/** This class specifies the set of parameters used with the DSA algorithm. */
class DSAParameterSpec extends Object with AlgorithmParameterSpec with DSAParams {

    /** Returns the base g. */
    @stub
    def getG(): BigInteger = ???

    /** Returns the prime p. */
    @stub
    def getP(): BigInteger = ???
}
