package javax.crypto

import java.lang.{Object, String}
import java.security.{Provider, SecureRandom}
import java.security.spec.AlgorithmParameterSpec

/** This class provides the functionality of a secret (symmetric) key generator.
 * 
 *  Key generators are constructed using one of the getInstance
 *  class methods of this class.
 * 
 *  KeyGenerator objects are reusable, i.e., after a key has been
 *  generated, the same KeyGenerator object can be re-used to generate further
 *  keys.
 * 
 *  There are two ways to generate a key: in an algorithm-independent
 *  manner, and in an algorithm-specific manner.
 *  The only difference between the two is the initialization of the object:
 * 
 *  
 *  Algorithm-Independent Initialization
 *  All key generators share the concepts of a keysize and a
 *  source of randomness.
 *  There is an
 *  init
 *  method in this KeyGenerator class that takes these two universally
 *  shared types of arguments. There is also one that takes just a
 *  keysize argument, and uses the SecureRandom implementation
 *  of the highest-priority installed provider as the source of randomness
 *  (or a system-provided source of randomness if none of the installed
 *  providers supply a SecureRandom implementation), and one that takes just a
 *  source of randomness.
 * 
 *  Since no other parameters are specified when you call the above
 *  algorithm-independent init methods, it is up to the
 *  provider what to do about the algorithm-specific parameters (if any) to be
 *  associated with each of the keys.
 * 
 *  Algorithm-Specific Initialization
 *  For situations where a set of algorithm-specific parameters already
 *  exists, there are two
 *  init
 *  methods that have an AlgorithmParameterSpec
 *  argument. One also has a SecureRandom argument, while the
 *  other uses the SecureRandom implementation
 *  of the highest-priority installed provider as the source of randomness
 *  (or a system-provided source of randomness if none of the installed
 *  providers supply a SecureRandom implementation).
 *  
 * 
 *  In case the client does not explicitly initialize the KeyGenerator
 *  (via a call to an init method), each provider must
 *  supply (and document) a default initialization.
 * 
 *   Every implementation of the Java platform is required to support the
 *  following standard KeyGenerator algorithms with the keysizes in
 *  parentheses:
 *  
 *  AES (128)
 *  DES (56)
 *  DESede (168)
 *  HmacSHA1
 *  HmacSHA256
 *  
 *  These algorithms are described in the 
 *  KeyGenerator section of the
 *  Java Cryptography Architecture Standard Algorithm Name Documentation.
 *  Consult the release documentation for your implementation to see if any
 *  other algorithms are supported.
 */
class KeyGenerator extends Object {

    /** Generates a secret key. */
    @stub
    def generateKey(): SecretKey = ???

    /** Returns the algorithm name of this KeyGenerator object. */
    @stub
    def getAlgorithm(): String = ???

    /** Returns the provider of this KeyGenerator object. */
    @stub
    def getProvider(): Provider = ???

    /** Initializes this key generator with the specified parameter set. */
    @stub
    def init(params: AlgorithmParameterSpec): Unit = ???

    /** Initializes this key generator with the specified parameter
     *  set and a user-provided source of randomness.
     */
    @stub
    def init(params: AlgorithmParameterSpec, random: SecureRandom): Unit = ???

    /** Initializes this key generator for a certain keysize. */
    @stub
    def init(keysize: Int): Unit = ???

    /** Initializes this key generator for a certain keysize, using a
     *  user-provided source of randomness.
     */
    @stub
    def init(keysize: Int, random: SecureRandom): Unit = ???
}

object KeyGenerator {
    /** Returns a KeyGenerator object that generates secret keys
     *  for the specified algorithm.
     */
    @stub
    def getInstance(algorithm: String): KeyGenerator = ???

    /** Returns a KeyGenerator object that generates secret keys
     *  for the specified algorithm.
     */
    @stub
    def getInstance(algorithm: String, provider: Provider): KeyGenerator = ???

    /** Returns a KeyGenerator object that generates secret keys
     *  for the specified algorithm.
     */
    @stub
    def getInstance(algorithm: String, provider: String): KeyGenerator = ???
}
