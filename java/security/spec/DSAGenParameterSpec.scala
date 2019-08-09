package java.security.spec

import java.lang.Object

// This immutable class specifies the set of parameters used for
// generating DSA parameters as specified in
// FIPS 186-3 Digital Signature Standard (DSS).
final class DSAGenParameterSpec extends Object with AlgorithmParameterSpec {

    @stub
    // Creates a domain parameter specification for DSA parameter
    // generation using primePLen and subprimeQLen.
    def this(primePLen: Int, subprimeQLen: Int) = ???

    @stub
    // Returns the desired length of the prime P of the
    // to-be-generated DSA domain parameters in bits.
    def getPrimePLength(): Int = ???

    @stub
    // Returns the desired length of the domain parameter seed in bits.
    def getSeedLength(): Int = ???
}
