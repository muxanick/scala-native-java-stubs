package javax.crypto

import java.lang.{Cloneable, Object, String}
import java.nio.ByteBuffer
import java.security.{Key, Provider}
import java.security.spec.AlgorithmParameterSpec
import scala.scalanative.annotation.stub

/** This class provides the functionality of a "Message Authentication Code"
 *  (MAC) algorithm.
 * 
 *   A MAC provides a way to check
 *  the integrity of information transmitted over or stored in an unreliable
 *  medium, based on a secret key. Typically, message
 *  authentication codes are used between two parties that share a secret
 *  key in order to validate information transmitted between these
 *  parties.
 * 
 *   A MAC mechanism that is based on cryptographic hash functions is
 *  referred to as HMAC. HMAC can be used with any cryptographic hash function,
 *  e.g., SHA256 or SHA384, in combination with a secret shared key. HMAC is
 *  specified in RFC 2104.
 * 
 *   Every implementation of the Java platform is required to support
 *  the following standard Mac algorithms:
 *  
 *  HmacMD5
 *  HmacSHA1
 *  HmacSHA256
 *  
 *  These algorithms are described in the
 *  
 *  Mac section of the
 *  Java Cryptography Architecture Standard Algorithm Name Documentation.
 *  Consult the release documentation for your implementation to see if any
 *  other algorithms are supported.
 */
class Mac extends Object with Cloneable {

    /** Creates a MAC object. */
    @stub
    protected def this(macSpi: MacSpi, provider: Provider, algorithm: String) = ???

    /** Returns a clone if the provider implementation is cloneable. */
    @stub
    def clone(): Object = ???

    /** Finishes the MAC operation. */
    @stub
    def doFinal(): Array[Byte] = ???

    /** Processes the given array of bytes and finishes the MAC operation. */
    @stub
    def doFinal(input: Array[Byte]): Array[Byte] = ???

    /** Finishes the MAC operation. */
    @stub
    def doFinal(output: Array[Byte], outOffset: Int): Unit = ???

    /** Returns the algorithm name of this Mac object. */
    @stub
    def getAlgorithm(): String = ???

    /** Returns the length of the MAC in bytes. */
    @stub
    def getMacLength(): Int = ???

    /** Returns the provider of this Mac object. */
    @stub
    def getProvider(): Provider = ???

    /** Initializes this Mac object with the given key. */
    @stub
    def init(key: Key): Unit = ???

    /** Initializes this Mac object with the given key and
     *  algorithm parameters.
     */
    @stub
    def init(key: Key, params: AlgorithmParameterSpec): Unit = ???

    /** Resets this Mac object. */
    @stub
    def reset(): Unit = ???

    /** Processes the given byte. */
    @stub
    def update(input: Byte): Unit = ???

    /** Processes the given array of bytes. */
    @stub
    def update(input: Array[Byte]): Unit = ???

    /** Processes the first len bytes in input,
     *  starting at offset inclusive.
     */
    @stub
    def update(input: Array[Byte], offset: Int, len: Int): Unit = ???

    /** Processes input.remaining() bytes in the ByteBuffer
     *  input, starting at input.position().
     */
    @stub
    def update(input: ByteBuffer): Unit = ???
}

object Mac {
    /** Returns a Mac object that implements the
     *  specified MAC algorithm.
     */
    @stub
    def getInstance(algorithm: String): Mac = ???

    /** Returns a Mac object that implements the
     *  specified MAC algorithm.
     */
    @stub
    def getInstance(algorithm: String, provider: Provider): Mac = ???

    /** Returns a Mac object that implements the
     *  specified MAC algorithm.
     */
    @stub
    def getInstance(algorithm: String, provider: String): Mac = ???
}
