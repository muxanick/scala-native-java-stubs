package javax.crypto

import java.lang.{Object, String}
import java.security.{Key, Provider, SecureRandom}
import java.security.spec.AlgorithmParameterSpec
import scala.scalanative.annotation.stub

/** This class provides the functionality of a key agreement (or key
 *  exchange) protocol.
 *  
 *  The keys involved in establishing a shared secret are created by one of the
 *  key generators (KeyPairGenerator or
 *  KeyGenerator), a KeyFactory, or as a result from
 *  an intermediate phase of the key agreement protocol.
 * 
 *   For each of the correspondents in the key exchange, doPhase
 *  needs to be called. For example, if this key exchange is with one other
 *  party, doPhase needs to be called once, with the
 *  lastPhase flag set to true.
 *  If this key exchange is
 *  with two other parties, doPhase needs to be called twice,
 *  the first time setting the lastPhase flag to
 *  false, and the second time setting it to true.
 *  There may be any number of parties involved in a key exchange.
 * 
 *   Every implementation of the Java platform is required to support the
 *  following standard KeyAgreement algorithm:
 *  
 *  DiffieHellman
 *  
 *  This algorithm is described in the 
 *  KeyAgreement section of the
 *  Java Cryptography Architecture Standard Algorithm Name Documentation.
 *  Consult the release documentation for your implementation to see if any
 *  other algorithms are supported.
 */
class KeyAgreement extends Object {

    /** Creates a KeyAgreement object. */
    @stub
    protected def this(keyAgreeSpi: KeyAgreementSpi, provider: Provider, algorithm: String) = ???

    /** Executes the next phase of this key agreement with the given
     *  key that was received from one of the other parties involved in this key
     *  agreement.
     */
    @stub
    def doPhase(key: Key, lastPhase: Boolean): Key = ???

    /** Generates the shared secret and returns it in a new buffer. */
    @stub
    def generateSecret(): Array[Byte] = ???

    /** Generates the shared secret, and places it into the buffer
     *  sharedSecret, beginning at offset inclusive.
     */
    @stub
    def generateSecret(sharedSecret: Array[Byte], offset: Int): Int = ???

    /** Creates the shared secret and returns it as a SecretKey
     *  object of the specified algorithm.
     */
    @stub
    def generateSecret(algorithm: String): SecretKey = ???

    /** Returns the algorithm name of this KeyAgreement object. */
    @stub
    def getAlgorithm(): String = ???

    /** Returns the provider of this KeyAgreement object. */
    @stub
    def getProvider(): Provider = ???

    /** Initializes this key agreement with the given key, which is required to
     *  contain all the algorithm parameters required for this key agreement.
     */
    @stub
    def init(key: Key): Unit = ???

    /** Initializes this key agreement with the given key and set of
     *  algorithm parameters.
     */
    @stub
    def init(key: Key, params: AlgorithmParameterSpec): Unit = ???

    /** Initializes this key agreement with the given key, set of
     *  algorithm parameters, and source of randomness.
     */
    @stub
    def init(key: Key, params: AlgorithmParameterSpec, random: SecureRandom): Unit = ???

    /** Initializes this key agreement with the given key and source of
     *  randomness.
     */
    @stub
    def init(key: Key, random: SecureRandom): Unit = ???
}

object KeyAgreement {
    /** Returns a KeyAgreement object that implements the
     *  specified key agreement algorithm.
     */
    @stub
    def getInstance(algorithm: String): KeyAgreement = ???

    /** Returns a KeyAgreement object that implements the
     *  specified key agreement algorithm.
     */
    @stub
    def getInstance(algorithm: String, provider: Provider): KeyAgreement = ???

    /** Returns a KeyAgreement object that implements the
     *  specified key agreement algorithm.
     */
    @stub
    def getInstance(algorithm: String, provider: String): KeyAgreement = ???
}
