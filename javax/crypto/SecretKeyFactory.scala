package javax.crypto

import java.lang.{Class, Object, String}
import java.security.Provider
import java.security.spec.KeySpec

// This class represents a factory for secret keys.
//
//  Key factories are used to convert keys (opaque
// cryptographic keys of type Key) into key specifications
// (transparent representations of the underlying key material), and vice
// versa.
// Secret key factories operate only on secret (symmetric) keys.
//
//  Key factories are bi-directional, i.e., they allow to build an opaque
// key object from a given key specification (key material), or to retrieve
// the underlying key material of a key object in a suitable format.
//
//  Application developers should refer to their provider's documentation
// to find out which key specifications are supported by the
// generateSecret and
// getKeySpec
// methods.
// For example, the DES secret-key factory supplied by the "SunJCE" provider
// supports DESKeySpec as a transparent representation of DES
// keys, and that provider's secret-key factory for Triple DES keys supports
// DESedeKeySpec as a transparent representation of Triple DES
// keys.
//
//  Every implementation of the Java platform is required to support the
// following standard SecretKeyFactory algorithms:
// 
// DES
// DESede
// 
// These algorithms are described in the 
// SecretKeyFactory section of the
// Java Cryptography Architecture Standard Algorithm Name Documentation.
// Consult the release documentation for your implementation to see if any
// other algorithms are supported.
class SecretKeyFactory extends Object {

    @stub
    // Generates a SecretKey object from the provided key
    // specification (key material).
    def generateSecret(keySpec: KeySpec): SecretKey = ???

    @stub
    // Returns the algorithm name of this SecretKeyFactory object.
    def getAlgorithm(): String = ???

    @stub
    // Returns a specification (key material) of the given key object
    // in the requested format.
    def getKeySpec(key: SecretKey, keySpec: Class[_]): KeySpec = ???

    @stub
    // Returns the provider of this SecretKeyFactory object.
    def getProvider(): Provider = ???
}

object SecretKeyFactory {
    @stub
    // Returns a SecretKeyFactory object that converts
    // secret keys of the specified algorithm.
    def getInstance(algorithm: String): SecretKeyFactory = ???

    @stub
    // Returns a SecretKeyFactory object that converts
    // secret keys of the specified algorithm.
    def getInstance(algorithm: String, provider: Provider): SecretKeyFactory = ???

    @stub
    // Returns a SecretKeyFactory object that converts
    // secret keys of the specified algorithm.
    def getInstance(algorithm: String, provider: String): SecretKeyFactory = ???
}
