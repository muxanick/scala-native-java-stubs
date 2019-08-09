package javax.crypto

import java.lang.{Object, String}
import java.security.{Key, SecureRandom}
import java.security.spec.AlgorithmParameterSpec

/** This class defines the Service Provider Interface (SPI)
 *  for the KeyAgreement class.
 *  All the abstract methods in this class must be implemented by each
 *  cryptographic service provider who wishes to supply the implementation
 *  of a particular key agreement algorithm.
 * 
 *   The keys involved in establishing a shared secret are created by one
 *  of the
 *  key generators (KeyPairGenerator or
 *  KeyGenerator), a KeyFactory, or as a result from
 *  an intermediate phase of the key agreement protocol
 *  (engineDoPhase).
 * 
 *   For each of the correspondents in the key exchange,
 *  engineDoPhase
 *  needs to be called. For example, if the key exchange is with one other
 *  party, engineDoPhase needs to be called once, with the
 *  lastPhase flag set to true.
 *  If the key exchange is
 *  with two other parties, engineDoPhase needs to be called twice,
 *  the first time setting the lastPhase flag to
 *  false, and the second time setting it to true.
 *  There may be any number of parties involved in a key exchange.
 */
abstract class KeyAgreementSpi extends Object {

    /** Executes the next phase of this key agreement with the given
     *  key that was received from one of the other parties involved in this key
     *  agreement.
     */
    protected def engineDoPhase(key: Key, lastPhase: Boolean): Key

    /** Generates the shared secret and returns it in a new buffer. */
    protected def engineGenerateSecret(): Array[Byte]

    /** Generates the shared secret, and places it into the buffer
     *  sharedSecret, beginning at offset inclusive.
     */
    protected def engineGenerateSecret(sharedSecret: Array[Byte], offset: Int): Int

    /** Creates the shared secret and returns it as a secret key object
     *  of the requested algorithm type.
     */
    protected def engineGenerateSecret(algorithm: String): SecretKey

    /** Initializes this key agreement with the given key, set of
     *  algorithm parameters, and source of randomness.
     */
    protected def engineInit(key: Key, params: AlgorithmParameterSpec, random: SecureRandom): Unit
}
