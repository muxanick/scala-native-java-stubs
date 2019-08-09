package javax.crypto

import java.lang.{Object, String}
import java.security.{Key, Provider, SecureRandom}
import java.security.spec.AlgorithmParameterSpec

// This class provides the functionality of a key agreement (or key
// exchange) protocol.
// 
// The keys involved in establishing a shared secret are created by one of the
// key generators (KeyPairGenerator or
// KeyGenerator), a KeyFactory, or as a result from
// an intermediate phase of the key agreement protocol.
//
//  For each of the correspondents in the key exchange, doPhase
// needs to be called. For example, if this key exchange is with one other
// party, doPhase needs to be called once, with the
// lastPhase flag set to true.
// If this key exchange is
// with two other parties, doPhase needs to be called twice,
// the first time setting the lastPhase flag to
// false, and the second time setting it to true.
// There may be any number of parties involved in a key exchange.
//
//  Every implementation of the Java platform is required to support the
// following standard KeyAgreement algorithm:
// 
// DiffieHellman
// 
// This algorithm is described in the 
// KeyAgreement section of the
// Java Cryptography Architecture Standard Algorithm Name Documentation.
// Consult the release documentation for your implementation to see if any
// other algorithms are supported.
class KeyAgreement extends Object {

    @stub
    // Executes the next phase of this key agreement with the given
    // key that was received from one of the other parties involved in this key
    // agreement.
    def doPhase(key: Key, lastPhase: Boolean): Key = ???

    @stub
    // Generates the shared secret and returns it in a new buffer.
    def generateSecret(): Array[Byte] = ???

    @stub
    // Generates the shared secret, and places it into the buffer
    // sharedSecret, beginning at offset inclusive.
    def generateSecret(sharedSecret: Array[Byte], offset: Int): Int = ???

    @stub
    // Creates the shared secret and returns it as a SecretKey
    // object of the specified algorithm.
    def generateSecret(algorithm: String): SecretKey = ???

    @stub
    // Returns the algorithm name of this KeyAgreement object.
    def getAlgorithm(): String = ???

    @stub
    // Returns the provider of this KeyAgreement object.
    def getProvider(): Provider = ???

    @stub
    // Initializes this key agreement with the given key, which is required to
    // contain all the algorithm parameters required for this key agreement.
    def init(key: Key): Unit = ???

    @stub
    // Initializes this key agreement with the given key and set of
    // algorithm parameters.
    def init(key: Key, params: AlgorithmParameterSpec): Unit = ???

    @stub
    // Initializes this key agreement with the given key, set of
    // algorithm parameters, and source of randomness.
    def init(key: Key, params: AlgorithmParameterSpec, random: SecureRandom): Unit = ???
}

object KeyAgreement {
    @stub
    // Returns a KeyAgreement object that implements the
    // specified key agreement algorithm.
    def getInstance(algorithm: String): KeyAgreement = ???

    @stub
    // Returns a KeyAgreement object that implements the
    // specified key agreement algorithm.
    def getInstance(algorithm: String, provider: Provider): KeyAgreement = ???

    @stub
    // Returns a KeyAgreement object that implements the
    // specified key agreement algorithm.
    def getInstance(algorithm: String, provider: String): KeyAgreement = ???
}
