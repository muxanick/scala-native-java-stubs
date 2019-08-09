package java.security

import java.lang.Object
import java.security.spec.AlgorithmParameterSpec
import scala.scalanative.annotation.stub

/** This class defines the Service Provider Interface (SPI)
 *  for the AlgorithmParameterGenerator class, which
 *  is used to generate a set of parameters to be used with a certain algorithm.
 * 
 *   All the abstract methods in this class must be implemented by each
 *  cryptographic service provider who wishes to supply the implementation
 *  of a parameter generator for a particular algorithm.
 * 
 *   In case the client does not explicitly initialize the
 *  AlgorithmParameterGenerator (via a call to an engineInit
 *  method), each provider must supply (and document) a default initialization.
 *  For example, the Sun provider uses a default modulus prime size of 1024
 *  bits for the generation of DSA parameters.
 */
abstract class AlgorithmParameterGeneratorSpi extends Object {

    /**  */
    @stub
    def this() = ???

    /** Generates the parameters. */
    protected def engineGenerateParameters(): AlgorithmParameters

    /** Initializes this parameter generator with a set of
     *  algorithm-specific parameter generation values.
     */
    protected def engineInit(genParamSpec: AlgorithmParameterSpec, random: SecureRandom): Unit

    /** Initializes this parameter generator for a certain size
     *  and source of randomness.
     */
    protected def engineInit(size: Int, random: SecureRandom): Unit
}
