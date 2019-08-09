package javax.crypto.spec

import java.lang.Object
import java.security.spec.AlgorithmParameterSpec

// This class specifies the parameters used with the
// RC5
// algorithm.
//
//  The parameters consist of a version number, a rounds count, a word
// size, and optionally an initialization vector (IV) (only in feedback mode).
//
//  This class can be used to initialize a Cipher object that
// implements the RC5 algorithm as supplied by
// RSA Security Inc.,
// or any parties authorized by RSA Security.
class RC5ParameterSpec extends Object with AlgorithmParameterSpec {

    @stub
    // Constructs a parameter set for RC5 from the given version, number of
    // rounds and word size (in bits).
    def this(version: Int, rounds: Int, wordSize: Int) = ???

    @stub
    // Constructs a parameter set for RC5 from the given version, number of
    // rounds, word size (in bits), and IV.
    def this(version: Int, rounds: Int, wordSize: Int, iv: Array[Byte]) = ???

    @stub
    // Tests for equality between the specified object and this
    // object.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns the IV or null if this parameter set does not contain an IV.
    def getIV(): Array[Byte] = ???

    @stub
    // Returns the number of rounds.
    def getRounds(): Int = ???

    @stub
    // Returns the version.
    def getVersion(): Int = ???

    @stub
    // Returns the word size in bits.
    def getWordSize(): Int = ???
}
