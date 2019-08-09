package java.security

import java.lang.{Class, Object, String}
import java.security.spec.AlgorithmParameterSpec

// This class defines the Service Provider Interface (SPI)
// for the AlgorithmParameters class, which is used to manage
// algorithm parameters.
//
//  All the abstract methods in this class must be implemented by each
// cryptographic service provider who wishes to supply parameter management
// for a particular algorithm.
abstract class AlgorithmParametersSpi extends Object {

    // Returns the parameters in their primary encoding format.
    protected def engineGetEncoded(): Array[Byte]

    // Returns the parameters encoded in the specified format.
    protected def engineGetEncoded(format: String): Array[Byte]

    // Returns a (transparent) specification of this parameters
    // object.
    protected def T: abstract[T <: AlgorithmParameterSpec]

    // Initializes this parameters object using the parameters
    // specified in paramSpec.
    protected def engineInit(paramSpec: AlgorithmParameterSpec): Unit

    // Imports the specified parameters and decodes them
    // according to the primary decoding format for parameters.
    protected def engineInit(params: Array[Byte]): Unit

    // Imports the parameters from params and
    // decodes them according to the specified decoding format.
    protected def engineInit(params: Array[Byte], format: String): Unit
}
