package java.security

import java.lang.{Class, Object, String}
import java.security.spec.AlgorithmParameterSpec
import scala.scalanative.annotation.stub

/** This class is used as an opaque representation of cryptographic parameters.
 * 
 *  An AlgorithmParameters object for managing the parameters
 *  for a particular algorithm can be obtained by
 *  calling one of the getInstance factory methods
 *  (static methods that return instances of a given class).
 * 
 *  Once an AlgorithmParameters object is obtained, it must be
 *  initialized via a call to init, using an appropriate parameter
 *  specification or parameter encoding.
 * 
 *  A transparent parameter specification is obtained from an
 *  AlgorithmParameters object via a call to
 *  getParameterSpec, and a byte encoding of the parameters is
 *  obtained via a call to getEncoded.
 * 
 *   Every implementation of the Java platform is required to support the
 *  following standard AlgorithmParameters algorithms:
 *  
 *  AES
 *  DES
 *  DESede
 *  DiffieHellman
 *  DSA
 *  
 *  These algorithms are described in the 
 *  AlgorithmParameters section of the
 *  Java Cryptography Architecture Standard Algorithm Name Documentation.
 *  Consult the release documentation for your implementation to see if any
 *  other algorithms are supported.
 */
class AlgorithmParameters extends Object {

    /** Creates an AlgorithmParameters object. */
    @stub
    protected def this(paramSpi: AlgorithmParametersSpi, provider: Provider, algorithm: String) = ???

    /** Returns the name of the algorithm associated with this parameter object. */
    @stub
    def getAlgorithm(): String = ???

    /** Returns the parameters in their primary encoding format. */
    @stub
    def getEncoded(): Array[Byte] = ???

    /** Returns the parameters encoded in the specified scheme. */
    @stub
    def getEncoded(format: String): Array[Byte] = ???

    /** Returns a (transparent) specification of this parameter object. */
    @stub
    def getParameterSpec[T <: AlgorithmParameterSpec](paramSpec: Class[T]): T = ???

    /** Returns the provider of this parameter object. */
    @stub
    def getProvider(): Provider = ???

    /** Initializes this parameter object using the parameters
     *  specified in paramSpec.
     */
    @stub
    def init(paramSpec: AlgorithmParameterSpec): Unit = ???

    /** Imports the specified parameters and decodes them according to the
     *  primary decoding format for parameters.
     */
    @stub
    def init(params: Array[Byte]): Unit = ???

    /** Imports the parameters from params and decodes them
     *  according to the specified decoding scheme.
     */
    @stub
    def init(params: Array[Byte], format: String): Unit = ???

    /** Returns a formatted string describing the parameters. */
    @stub
    def toString(): String = ???
}

object AlgorithmParameters {
    /** Returns a parameter object for the specified algorithm. */
    @stub
    def getInstance(algorithm: String): AlgorithmParameters = ???

    /** Returns a parameter object for the specified algorithm. */
    @stub
    def getInstance(algorithm: String, provider: Provider): AlgorithmParameters = ???

    /** Returns a parameter object for the specified algorithm. */
    @stub
    def getInstance(algorithm: String, provider: String): AlgorithmParameters = ???
}
