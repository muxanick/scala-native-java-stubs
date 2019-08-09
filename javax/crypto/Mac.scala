package javax.crypto

import java.lang.{Cloneable, Object, String}
import java.security.{Key, Provider}
import java.security.spec.AlgorithmParameterSpec

// This class provides the functionality of a "Message Authentication Code"
// (MAC) algorithm.
//
//  A MAC provides a way to check
// the integrity of information transmitted over or stored in an unreliable
// medium, based on a secret key. Typically, message
// authentication codes are used between two parties that share a secret
// key in order to validate information transmitted between these
// parties.
//
//  A MAC mechanism that is based on cryptographic hash functions is
// referred to as HMAC. HMAC can be used with any cryptographic hash function,
// e.g., SHA256 or SHA384, in combination with a secret shared key. HMAC is
// specified in RFC 2104.
//
//  Every implementation of the Java platform is required to support
// the following standard Mac algorithms:
// 
// HmacMD5
// HmacSHA1
// HmacSHA256
// 
// These algorithms are described in the
// 
// Mac section of the
// Java Cryptography Architecture Standard Algorithm Name Documentation.
// Consult the release documentation for your implementation to see if any
// other algorithms are supported.
class Mac extends Object with Cloneable {

    @stub
    // Returns a clone if the provider implementation is cloneable.
    def clone(): Object = ???

    @stub
    // Finishes the MAC operation.
    def doFinal(): Array[Byte] = ???

    @stub
    // Processes the given array of bytes and finishes the MAC operation.
    def doFinal(input: Array[Byte]): Array[Byte] = ???

    @stub
    // Finishes the MAC operation.
    def doFinal(output: Array[Byte], outOffset: Int): Unit = ???

    @stub
    // Returns the algorithm name of this Mac object.
    def getAlgorithm(): String = ???

    @stub
    // Returns the length of the MAC in bytes.
    def getMacLength(): Int = ???

    @stub
    // Returns the provider of this Mac object.
    def getProvider(): Provider = ???

    @stub
    // Initializes this Mac object with the given key.
    def init(key: Key): Unit = ???

    @stub
    // Initializes this Mac object with the given key and
    // algorithm parameters.
    def init(key: Key, params: AlgorithmParameterSpec): Unit = ???

    @stub
    // Resets this Mac object.
    def reset(): Unit = ???

    @stub
    // Processes the given byte.
    def update(input: Byte): Unit = ???

    @stub
    // Processes the given array of bytes.
    def update(input: Array[Byte]): Unit = ???

    @stub
    // Processes the first len bytes in input,
    // starting at offset inclusive.
    def update(input: Array[Byte], offset: Int, len: Int): Unit = ???
}

object Mac {
    @stub
    // Returns a Mac object that implements the
    // specified MAC algorithm.
    def getInstance(algorithm: String): Mac = ???

    @stub
    // Returns a Mac object that implements the
    // specified MAC algorithm.
    def getInstance(algorithm: String, provider: Provider): Mac = ???

    @stub
    // Returns a Mac object that implements the
    // specified MAC algorithm.
    def getInstance(algorithm: String, provider: String): Mac = ???
}
