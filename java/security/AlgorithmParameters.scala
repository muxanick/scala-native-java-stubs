package java.security

import java.lang.{Class, Object, String}
import java.security.spec.AlgorithmParameterSpec

// This class is used as an opaque representation of cryptographic parameters.
//
// An AlgorithmParameters object for managing the parameters
// for a particular algorithm can be obtained by
// calling one of the getInstance factory methods
// (static methods that return instances of a given class).
//
// Once an AlgorithmParameters object is obtained, it must be
// initialized via a call to init, using an appropriate parameter
// specification or parameter encoding.
//
// A transparent parameter specification is obtained from an
// AlgorithmParameters object via a call to
// getParameterSpec, and a byte encoding of the parameters is
// obtained via a call to getEncoded.
//
//  Every implementation of the Java platform is required to support the
// following standard AlgorithmParameters algorithms:
// 
// AES
// DES
// DESede
// DiffieHellman
// DSA
// 
// These algorithms are described in the 
// AlgorithmParameters section of the
// Java Cryptography Architecture Standard Algorithm Name Documentation.
// Consult the release documentation for your implementation to see if any
// other algorithms are supported.
class AlgorithmParameters extends Object {

    @stub
    // Returns the name of the algorithm associated with this parameter object.
    def getAlgorithm(): String = ???

    @stub
    // Returns the parameters in their primary encoding format.
    def getEncoded(): Array[Byte] = ???

    @stub
    // Returns the parameters encoded in the specified scheme.
    def getEncoded(format: String): Array[Byte] = ???

    @stub
    // Returns a (transparent) specification of this parameter object.
    def T: [T <: AlgorithmParameterSpec] = ???

    @stub
    // Returns the provider of this parameter object.
    def getProvider(): Provider = ???

    @stub
    // Initializes this parameter object using the parameters
    // specified in paramSpec.
    def init(paramSpec: AlgorithmParameterSpec): Unit = ???

    @stub
    // Imports the specified parameters and decodes them according to the
    // primary decoding format for parameters.
    def init(params: Array[Byte]): Unit = ???

    @stub
    // Imports the parameters from params and decodes them
    // according to the specified decoding scheme.
    def init(params: Array[Byte], format: String): Unit = ???
}

object AlgorithmParameters {
    @stub
    // Returns a parameter object for the specified algorithm.
    def getInstance(algorithm: String): AlgorithmParameters = ???

    @stub
    // Returns a parameter object for the specified algorithm.
    def getInstance(algorithm: String, provider: Provider): AlgorithmParameters = ???

    @stub
    // Returns a parameter object for the specified algorithm.
    def getInstance(algorithm: String, provider: String): AlgorithmParameters = ???
}
