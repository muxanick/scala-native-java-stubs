package java.security

import java.lang.{Object, String}
import java.security.spec.AlgorithmParameterSpec

// The KeyPairGenerator class is used to generate pairs of
// public and private keys. Key pair generators are constructed using the
// getInstance factory methods (static methods that
// return instances of a given class).
//
// A Key pair generator for a particular algorithm creates a public/private
// key pair that can be used with this algorithm. It also associates
// algorithm-specific parameters with each of the generated keys.
//
// There are two ways to generate a key pair: in an algorithm-independent
// manner, and in an algorithm-specific manner.
// The only difference between the two is the initialization of the object:
//
// 
// Algorithm-Independent Initialization
// All key pair generators share the concepts of a keysize and a
// source of randomness. The keysize is interpreted differently for different
// algorithms (e.g., in the case of the DSA algorithm, the keysize
// corresponds to the length of the modulus).
// There is an
// initialize
// method in this KeyPairGenerator class that takes these two universally
// shared types of arguments. There is also one that takes just a
// keysize argument, and uses the SecureRandom
// implementation of the highest-priority installed provider as the source
// of randomness. (If none of the installed providers supply an implementation
// of SecureRandom, a system-provided source of randomness is
// used.)
//
// Since no other parameters are specified when you call the above
// algorithm-independent initialize methods, it is up to the
// provider what to do about the algorithm-specific parameters (if any) to be
// associated with each of the keys.
//
// If the algorithm is the DSA algorithm, and the keysize (modulus
// size) is 512, 768, or 1024, then the Sun provider uses a set of
// precomputed values for the p, q, and
// g parameters. If the modulus size is not one of the above
// values, the Sun provider creates a new set of parameters. Other
// providers might have precomputed parameter sets for more than just the
// three modulus sizes mentioned above. Still others might not have a list of
// precomputed parameters at all and instead always create new parameter sets.
//
// Algorithm-Specific Initialization
// For situations where a set of algorithm-specific parameters already
// exists (e.g., so-called community parameters in DSA), there are two
// initialize methods that have an AlgorithmParameterSpec
// argument. One also has a SecureRandom argument, while the
// the other uses the SecureRandom
// implementation of the highest-priority installed provider as the source
// of randomness. (If none of the installed providers supply an implementation
// of SecureRandom, a system-provided source of randomness is
// used.)
// 
//
// In case the client does not explicitly initialize the KeyPairGenerator
// (via a call to an initialize method), each provider must
// supply (and document) a default initialization.
// For example, the Sun provider uses a default modulus size (keysize)
// of 1024 bits.
//
// Note that this class is abstract and extends from
// KeyPairGeneratorSpi for historical reasons.
// Application developers should only take notice of the methods defined in
// this KeyPairGenerator class; all the methods in
// the superclass are intended for cryptographic service providers who wish to
// supply their own implementations of key pair generators.
//
//  Every implementation of the Java platform is required to support the
// following standard KeyPairGenerator algorithms and keysizes in
// parentheses:
// 
// DiffieHellman (1024)
// DSA (1024)
// RSA (1024, 2048)
// 
// These algorithms are described in the 
// KeyPairGenerator section of the
// Java Cryptography Architecture Standard Algorithm Name Documentation.
// Consult the release documentation for your implementation to see if any
// other algorithms are supported.
abstract class KeyPairGenerator extends KeyPairGeneratorSpi {

    // Generates a key pair.
    def generateKeyPair(): KeyPair

    // Generates a key pair.
    def genKeyPair(): KeyPair

    // Returns the standard name of the algorithm for this key pair generator.
    def getAlgorithm(): String

    // Returns the provider of this key pair generator object.
    def getProvider(): Provider

    // Initializes the key pair generator using the specified parameter
    // set and the SecureRandom
    // implementation of the highest-priority installed provider as the source
    // of randomness.
    def initialize(params: AlgorithmParameterSpec): Unit

    // Initializes the key pair generator with the given parameter
    // set and source of randomness.
    def initialize(params: AlgorithmParameterSpec, random: SecureRandom): Unit

    // Initializes the key pair generator for a certain keysize using
    // a default parameter set and the SecureRandom
    // implementation of the highest-priority installed provider as the source
    // of randomness.
    def initialize(keysize: Int): Unit
}

object KeyPairGenerator {
    @stub
    // Returns a KeyPairGenerator object that generates public/private
    // key pairs for the specified algorithm.
    def getInstance(algorithm: String): KeyPairGenerator = ???

    @stub
    // Returns a KeyPairGenerator object that generates public/private
    // key pairs for the specified algorithm.
    def getInstance(algorithm: String, provider: Provider): KeyPairGenerator = ???

    @stub
    // Returns a KeyPairGenerator object that generates public/private
    // key pairs for the specified algorithm.
    def getInstance(algorithm: String, provider: String): KeyPairGenerator = ???
}
