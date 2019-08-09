package javax.crypto.spec

import java.lang.Object
import java.security.spec.AlgorithmParameterSpec

/** This class specifies the parameters used with the
 *  RC5
 *  algorithm.
 * 
 *   The parameters consist of a version number, a rounds count, a word
 *  size, and optionally an initialization vector (IV) (only in feedback mode).
 * 
 *   This class can be used to initialize a Cipher object that
 *  implements the RC5 algorithm as supplied by
 *  RSA Security Inc.,
 *  or any parties authorized by RSA Security.
 */
class RC5ParameterSpec extends Object with AlgorithmParameterSpec {

    /** Constructs a parameter set for RC5 from the given version, number of
     *  rounds and word size (in bits).
     */
    @stub
    def this(version: Int, rounds: Int, wordSize: Int) = ???

    /** Constructs a parameter set for RC5 from the given version, number of
     *  rounds, word size (in bits), and IV.
     */
    @stub
    def this(version: Int, rounds: Int, wordSize: Int, iv: Array[Byte]) = ???

    /** Tests for equality between the specified object and this
     *  object.
     */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Returns the IV or null if this parameter set does not contain an IV. */
    @stub
    def getIV(): Array[Byte] = ???

    /** Returns the number of rounds. */
    @stub
    def getRounds(): Int = ???

    /** Returns the version. */
    @stub
    def getVersion(): Int = ???

    /** Returns the word size in bits. */
    @stub
    def getWordSize(): Int = ???
}
