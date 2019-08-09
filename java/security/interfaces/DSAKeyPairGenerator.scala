package java.security.interfaces

import java.security.SecureRandom

// An interface to an object capable of generating DSA key pairs.
//
// The initialize methods may each be called any number
// of times. If no initialize method is called on a
// DSAKeyPairGenerator, the default is to generate 1024-bit keys, using
// precomputed p, q and g parameters and an instance of SecureRandom as
// the random bit source.
//
// Users wishing to indicate DSA-specific parameters, and to generate a key
// pair suitable for use with the DSA algorithm typically
//
// 
//
// Get a key pair generator for the DSA algorithm by calling the
// KeyPairGenerator getInstance method with "DSA"
// as its argument.
//
// Initialize the generator by casting the result to a DSAKeyPairGenerator
// and calling one of the
// initialize methods from this DSAKeyPairGenerator interface.
//
// Generate a key pair by calling the generateKeyPair
// method from the KeyPairGenerator class.
//
// 
//
// Note: it is not always necessary to do do algorithm-specific
// initialization for a DSA key pair generator. That is, it is not always
// necessary to call an initialize method in this interface.
// Algorithm-independent initialization using the initialize method
// in the KeyPairGenerator
// interface is all that is needed when you accept defaults for algorithm-specific
// parameters.
//
// Note: Some earlier implementations of this interface may not support
// larger sizes of DSA parameters such as 2048 and 3072-bit.
trait DSAKeyPairGenerator {

    @stub
    // Initializes the key pair generator using the DSA family parameters
    // (p,q and g) and an optional SecureRandom bit source.
    def initialize(params: DSAParams, random: SecureRandom): Unit = ???
}
