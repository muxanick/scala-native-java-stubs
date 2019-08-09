package java.security

import java.lang.{Object, String}
import java.security.spec.AlgorithmParameterSpec
import scala.scalanative.annotation.stub

/** The AlgorithmParameterGenerator class is used to generate a
 *  set of
 *  parameters to be used with a certain algorithm. Parameter generators
 *  are constructed using the getInstance factory methods
 *  (static methods that return instances of a given class).
 * 
 *  The object that will generate the parameters can be initialized
 *  in two different ways: in an algorithm-independent manner, or in an
 *  algorithm-specific manner:
 * 
 *  
 *  The algorithm-independent approach uses the fact that all parameter
 *  generators share the concept of a "size" and a
 *  source of randomness. The measure of size is universally shared
 *  by all algorithm parameters, though it is interpreted differently
 *  for different algorithms. For example, in the case of parameters for
 *  the DSA algorithm, "size" corresponds to the size
 *  of the prime modulus (in bits).
 *  When using this approach, algorithm-specific parameter generation
 *  values - if any - default to some standard values, unless they can be
 *  derived from the specified size.
 * 
 *  The other approach initializes a parameter generator object
 *  using algorithm-specific semantics, which are represented by a set of
 *  algorithm-specific parameter generation values. To generate
 *  Diffie-Hellman system parameters, for example, the parameter generation
 *  values usually
 *  consist of the size of the prime modulus and the size of the
 *  random exponent, both specified in number of bits.
 *  
 * 
 *  In case the client does not explicitly initialize the
 *  AlgorithmParameterGenerator
 *  (via a call to an init method), each provider must supply (and
 *  document) a default initialization. For example, the Sun provider uses a
 *  default modulus prime size of 1024 bits for the generation of DSA
 *  parameters.
 * 
 *   Every implementation of the Java platform is required to support the
 *  following standard AlgorithmParameterGenerator algorithms and
 *  keysizes in parentheses:
 *  
 *  DiffieHellman (1024)
 *  DSA (1024)
 *  
 *  These algorithms are described in the 
 *  AlgorithmParameterGenerator section of the
 *  Java Cryptography Architecture Standard Algorithm Name Documentation.
 *  Consult the release documentation for your implementation to see if any
 *  other algorithms are supported.
 */
class AlgorithmParameterGenerator extends Object {

    /** Creates an AlgorithmParameterGenerator object. */
    @stub
    protected def this(paramGenSpi: AlgorithmParameterGeneratorSpi, provider: Provider, algorithm: String) = ???

    /** Generates the parameters. */
    @stub
    def generateParameters(): AlgorithmParameters = ???

    /** Returns the standard name of the algorithm this parameter
     *  generator is associated with.
     */
    @stub
    def getAlgorithm(): String = ???

    /** Returns the provider of this algorithm parameter generator object. */
    @stub
    def getProvider(): Provider = ???

    /** Initializes this parameter generator with a set of algorithm-specific
     *  parameter generation values.
     */
    @stub
    def init(genParamSpec: AlgorithmParameterSpec): Unit = ???

    /** Initializes this parameter generator with a set of algorithm-specific
     *  parameter generation values.
     */
    @stub
    def init(genParamSpec: AlgorithmParameterSpec, random: SecureRandom): Unit = ???

    /** Initializes this parameter generator for a certain size. */
    @stub
    def init(size: Int): Unit = ???

    /** Initializes this parameter generator for a certain size and source
     *  of randomness.
     */
    @stub
    def init(size: Int, random: SecureRandom): Unit = ???
}

object AlgorithmParameterGenerator {
    /** Returns an AlgorithmParameterGenerator object for generating
     *  a set of parameters to be used with the specified algorithm.
     */
    @stub
    def getInstance(algorithm: String): AlgorithmParameterGenerator = ???

    /** Returns an AlgorithmParameterGenerator object for generating
     *  a set of parameters to be used with the specified algorithm.
     */
    @stub
    def getInstance(algorithm: String, provider: Provider): AlgorithmParameterGenerator = ???

    /** Returns an AlgorithmParameterGenerator object for generating
     *  a set of parameters to be used with the specified algorithm.
     */
    @stub
    def getInstance(algorithm: String, provider: String): AlgorithmParameterGenerator = ???
}
