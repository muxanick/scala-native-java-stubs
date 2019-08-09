package javax.crypto.spec

import java.lang.Object
import java.security.spec.AlgorithmParameterSpec

// This class specifies the parameters used with the
// RC2
// algorithm.
//
//  The parameters consist of an effective key size and optionally
// an 8-byte initialization vector (IV) (only in feedback mode).
//
//  This class can be used to initialize a Cipher object that
// implements the RC2 algorithm.
class RC2ParameterSpec extends Object with AlgorithmParameterSpec {

    @stub
    // Constructs a parameter set for RC2 from the given effective key size
    // (in bits).
    def this(effectiveKeyBits: Int) = ???

    @stub
    // Constructs a parameter set for RC2 from the given effective key size
    // (in bits) and an 8-byte IV.
    def this(effectiveKeyBits: Int, iv: Array[Byte]) = ???

    @stub
    // Tests for equality between the specified object and this
    // object.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns the effective key size in bits.
    def getEffectiveKeyBits(): Int = ???

    @stub
    // Returns the IV or null if this parameter set does not contain an IV.
    def getIV(): Array[Byte] = ???
}
