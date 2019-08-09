package java.security

import java.lang.{Class, Object, String}
import java.security.spec.KeySpec

// Key factories are used to convert keys (opaque
// cryptographic keys of type Key) into key specifications
// (transparent representations of the underlying key material), and vice
// versa.
//
//  Key factories are bi-directional. That is, they allow you to build an
// opaque key object from a given key specification (key material), or to
// retrieve the underlying key material of a key object in a suitable format.
//
//  Multiple compatible key specifications may exist for the same key.
// For example, a DSA public key may be specified using
// DSAPublicKeySpec or
// X509EncodedKeySpec. A key factory can be used to translate
// between compatible key specifications.
//
//  The following is an example of how to use a key factory in order to
// instantiate a DSA public key from its encoding.
// Assume Alice has received a digital signature from Bob.
// Bob also sent her his public key (in encoded format) to verify
// his signature. Alice then performs the following actions:
//
// 
// X509EncodedKeySpec bobPubKeySpec = new X509EncodedKeySpec(bobEncodedPubKey);
// KeyFactory keyFactory = KeyFactory.getInstance("DSA");
// PublicKey bobPubKey = keyFactory.generatePublic(bobPubKeySpec);
// Signature sig = Signature.getInstance("DSA");
// sig.initVerify(bobPubKey);
// sig.update(data);
// sig.verify(signature);
// 
//
//  Every implementation of the Java platform is required to support the
// following standard KeyFactory algorithms:
// 
// DiffieHellman
// DSA
// RSA
// 
// These algorithms are described in the 
// KeyFactory section of the
// Java Cryptography Architecture Standard Algorithm Name Documentation.
// Consult the release documentation for your implementation to see if any
// other algorithms are supported.
class KeyFactory extends Object {

    @stub
    // Generates a private key object from the provided key specification
    // (key material).
    def generatePrivate(keySpec: KeySpec): PrivateKey = ???

    @stub
    // Generates a public key object from the provided key specification
    // (key material).
    def generatePublic(keySpec: KeySpec): PublicKey = ???

    @stub
    // Gets the name of the algorithm
    // associated with this KeyFactory.
    def getAlgorithm(): String = ???

    @stub
    // Returns a specification (key material) of the given key object.
    def T: [T <: KeySpec] = ???

    @stub
    // Returns the provider of this key factory object.
    def getProvider(): Provider = ???
}

object KeyFactory {
    @stub
    // Returns a KeyFactory object that converts
    // public/private keys of the specified algorithm.
    def getInstance(algorithm: String): KeyFactory = ???

    @stub
    // Returns a KeyFactory object that converts
    // public/private keys of the specified algorithm.
    def getInstance(algorithm: String, provider: Provider): KeyFactory = ???

    @stub
    // Returns a KeyFactory object that converts
    // public/private keys of the specified algorithm.
    def getInstance(algorithm: String, provider: String): KeyFactory = ???
}
