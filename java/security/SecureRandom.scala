package java.security

import java.lang.{Object, String}
import java.util.Random

// This class provides a cryptographically strong random number
// generator (RNG).
//
// A cryptographically strong random number
// minimally complies with the statistical random number generator tests
// specified in 
// FIPS 140-2, Security Requirements for Cryptographic Modules,
// section 4.9.1.
// Additionally, SecureRandom must produce non-deterministic output.
// Therefore any seed material passed to a SecureRandom object must be
// unpredictable, and all SecureRandom output sequences must be
// cryptographically strong, as described in
// 
// RFC 1750: Randomness Recommendations for Security.
//
// A caller obtains a SecureRandom instance via the
// no-argument constructor or one of the getInstance methods:
//
// 
//      SecureRandom random = new SecureRandom();
// 
//
//  Many SecureRandom implementations are in the form of a pseudo-random
// number generator (PRNG), which means they use a deterministic algorithm
// to produce a pseudo-random sequence from a true random seed.
// Other implementations may produce true random numbers,
// and yet others may use a combination of both techniques.
//
//  Typical callers of SecureRandom invoke the following methods
// to retrieve random bytes:
//
// 
//      SecureRandom random = new SecureRandom();
//      byte bytes[] = new byte[20];
//      random.nextBytes(bytes);
// 
//
//  Callers may also invoke the generateSeed method
// to generate a given number of seed bytes (to seed other random number
// generators, for example):
// 
//      byte seed[] = random.generateSeed(20);
// 
//
// Note: Depending on the implementation, the generateSeed and
// nextBytes methods may block as entropy is being gathered,
// for example, if they need to read from /dev/random on various Unix-like
// operating systems.
class SecureRandom extends Random {

    @stub
    // Constructs a secure random number generator (RNG) implementing the
    // default random number algorithm.
    def this() = ???

    @stub
    // Constructs a secure random number generator (RNG) implementing the
    // default random number algorithm.
    def this(seed: Array[Byte]) = ???

    @stub
    // Returns the given number of seed bytes, computed using the seed
    // generation algorithm that this class uses to seed itself.
    def generateSeed(numBytes: Int): Array[Byte] = ???

    @stub
    // Returns the name of the algorithm implemented by this SecureRandom
    // object.
    def getAlgorithm(): String = ???

    @stub
    // Returns the provider of this SecureRandom object.
    def getProvider(): Provider = ???

    @stub
    // Generates an integer containing the user-specified number of
    // pseudo-random bits (right justified, with leading zeros).
    protected def next(numBits: Int): Int = ???

    @stub
    // Generates a user-specified number of random bytes.
    def nextBytes(bytes: Array[Byte]): Unit = ???

    @stub
    // Reseeds this random object.
    def setSeed(seed: Array[Byte]): Unit = ???
}

object SecureRandom {
    @stub
    // Returns a SecureRandom object that implements the specified
    // Random Number Generator (RNG) algorithm.
    def getInstance(algorithm: String): SecureRandom = ???

    @stub
    // Returns a SecureRandom object that implements the specified
    // Random Number Generator (RNG) algorithm.
    def getInstance(algorithm: String, provider: Provider): SecureRandom = ???

    @stub
    // Returns a SecureRandom object that implements the specified
    // Random Number Generator (RNG) algorithm.
    def getInstance(algorithm: String, provider: String): SecureRandom = ???

    @stub
    // Returns a SecureRandom object that was selected by using
    // the algorithms/providers specified in the securerandom.strongAlgorithms Security property.
    def getInstanceStrong(): SecureRandom = ???

    @stub
    // Returns the given number of seed bytes, computed using the seed
    // generation algorithm that this class uses to seed itself.
    def getSeed(numBytes: Int): Array[Byte] = ???
}
