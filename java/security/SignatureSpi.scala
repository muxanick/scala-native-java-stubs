package java.security

import java.lang.{Object, String}
import java.nio.ByteBuffer
import java.security.spec.AlgorithmParameterSpec

// This class defines the Service Provider Interface (SPI)
// for the Signature class, which is used to provide the
// functionality of a digital signature algorithm. Digital signatures are used
// for authentication and integrity assurance of digital data.
//.
//  All the abstract methods in this class must be implemented by each
// cryptographic service provider who wishes to supply the implementation
// of a particular signature algorithm.
abstract class SignatureSpi extends Object {

    // Returns a clone if the implementation is cloneable.
    def clone(): Object

    // Deprecated.  
    protected def engineGetParameter(param: String): Object

    // This method is overridden by providers to return the
    // parameters used with this signature engine, or null
    // if this signature engine does not use any parameters.
    protected def engineGetParameters(): AlgorithmParameters

    // Initializes this signature object with the specified
    // private key for signing operations.
    protected def engineInitSign(privateKey: PrivateKey): Unit

    // Initializes this signature object with the specified
    // private key and source of randomness for signing operations.
    protected def engineInitSign(privateKey: PrivateKey, random: SecureRandom): Unit

    // Initializes this signature object with the specified
    // public key for verification operations.
    protected def engineInitVerify(publicKey: PublicKey): Unit

    // This method is overridden by providers to initialize
    // this signature engine with the specified parameter set.
    protected def engineSetParameter(params: AlgorithmParameterSpec): Unit

    // Deprecated. 
    //Replaced by engineSetParameter.
    //
    protected def engineSetParameter(param: String, value: Object): Unit

    // Returns the signature bytes of all the data
    // updated so far.
    protected def engineSign(): Array[Byte]

    // Finishes this signature operation and stores the resulting signature
    // bytes in the provided buffer outbuf, starting at
    // offset.
    protected def engineSign(outbuf: Array[Byte], offset: Int, len: Int): Int

    // Updates the data to be signed or verified
    // using the specified byte.
    protected def engineUpdate(b: Byte): Unit

    // Updates the data to be signed or verified, using the
    // specified array of bytes, starting at the specified offset.
    protected def engineUpdate(b: Array[Byte], off: Int, len: Int): Unit

    // Updates the data to be signed or verified using the specified
    // ByteBuffer.
    protected def engineUpdate(input: ByteBuffer): Unit

    // Verifies the passed-in signature.
    protected def engineVerify(sigBytes: Array[Byte]): Boolean
}
