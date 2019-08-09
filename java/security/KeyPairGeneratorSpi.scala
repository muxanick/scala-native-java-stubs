package java.security

import java.lang.Object
import java.security.spec.AlgorithmParameterSpec

//  This class defines the Service Provider Interface (SPI)
// for the KeyPairGenerator class, which is used to generate
// pairs of public and private keys.
//
//  All the abstract methods in this class must be implemented by each
// cryptographic service provider who wishes to supply the implementation
// of a key pair generator for a particular algorithm.
//
//  In case the client does not explicitly initialize the KeyPairGenerator
// (via a call to an initialize method), each provider must
// supply (and document) a default initialization.
// For example, the Sun provider uses a default modulus size (keysize)
// of 1024 bits.
abstract class KeyPairGeneratorSpi extends Object {

    // Generates a key pair.
    def generateKeyPair(): KeyPair

    // Initializes the key pair generator using the specified parameter
    // set and user-provided source of randomness.
    def initialize(params: AlgorithmParameterSpec, random: SecureRandom): Unit
}
