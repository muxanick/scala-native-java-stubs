package javax.crypto

import java.lang.{Object, String}
import java.nio.ByteBuffer
import java.security.{AlgorithmParameters, Key, SecureRandom}
import java.security.spec.AlgorithmParameterSpec

// This class defines the Service Provider Interface (SPI)
// for the Cipher class.
// All the abstract methods in this class must be implemented by each
// cryptographic service provider who wishes to supply the implementation
// of a particular cipher algorithm.
//
// In order to create an instance of Cipher, which
// encapsulates an instance of this CipherSpi class, an
// application calls one of the
// getInstance
// factory methods of the
// Cipher engine class and specifies the requested
// transformation.
// Optionally, the application may also specify the name of a provider.
//
// A transformation is a string that describes the operation (or
// set of operations) to be performed on the given input, to produce some
// output. A transformation always includes the name of a cryptographic
// algorithm (e.g., AES), and may be followed by a feedback mode and
// padding scheme.
//
//  A transformation is of the form:
//
// 
// "algorithm/mode/padding" or
//
// "algorithm"
// 
//
//  (in the latter case,
// provider-specific default values for the mode and padding scheme are used).
// For example, the following is a valid transformation:
//
// 
//     Cipher c = Cipher.getInstance("AES/CBC/PKCS5Padding");
// 
//
// A provider may supply a separate class for each combination
// of algorithm/mode/padding, or may decide to provide more generic
// classes representing sub-transformations corresponding to
// algorithm or algorithm/mode or algorithm//padding
// (note the double slashes),
// in which case the requested mode and/or padding are set automatically by
// the getInstance methods of Cipher, which invoke
// the engineSetMode and
// engineSetPadding
// methods of the provider's subclass of CipherSpi.
//
// A Cipher property in a provider master class may have one of
// the following formats:
//
// 
//
// 
// 
//     // provider's subclass of "CipherSpi" implements "algName" with
//     // pluggable mode and padding
//     Cipher.algName
// 
//
// 
// 
//     // provider's subclass of "CipherSpi" implements "algName" in the
//     // specified "mode", with pluggable padding
//     Cipher.algName/mode
// 
//
// 
// 
//     // provider's subclass of "CipherSpi" implements "algName" with the
//     // specified "padding", with pluggable mode
//     Cipher.algName//padding
// 
//
// 
// 
//     // provider's subclass of "CipherSpi" implements "algName" with the
//     // specified "mode" and "padding"
//     Cipher.algName/mode/padding
// 
//
// 
//
// For example, a provider may supply a subclass of CipherSpi
// that implements AES/ECB/PKCS5Padding, one that implements
// AES/CBC/PKCS5Padding, one that implements
// AES/CFB/PKCS5Padding, and yet another one that implements
// AES/OFB/PKCS5Padding. That provider would have the following
// Cipher properties in its master class:
//
// 
//
// 
// 
//     Cipher.AES/ECB/PKCS5Padding
// 
//
// 
// 
//     Cipher.AES/CBC/PKCS5Padding
// 
//
// 
// 
//     Cipher.AES/CFB/PKCS5Padding
// 
//
// 
// 
//     Cipher.AES/OFB/PKCS5Padding
// 
//
// 
//
// Another provider may implement a class for each of the above modes
// (i.e., one class for ECB, one for CBC, one for CFB,
// and one for OFB), one class for PKCS5Padding,
// and a generic AES class that subclasses from CipherSpi.
// That provider would have the following
// Cipher properties in its master class:
//
// 
//
// 
// 
//     Cipher.AES
// 
//
// 
//
// The getInstance factory method of the Cipher
// engine class follows these rules in order to instantiate a provider's
// implementation of CipherSpi for a
// transformation of the form "algorithm":
//
// 
// 
// Check if the provider has registered a subclass of CipherSpi
// for the specified "algorithm".
// If the answer is YES, instantiate this
// class, for whose mode and padding scheme default values (as supplied by
// the provider) are used.
// If the answer is NO, throw a NoSuchAlgorithmException
// exception.
// 
//
// The getInstance factory method of the Cipher
// engine class follows these rules in order to instantiate a provider's
// implementation of CipherSpi for a
// transformation of the form "algorithm/mode/padding":
//
// 
// 
// Check if the provider has registered a subclass of CipherSpi
// for the specified "algorithm/mode/padding" transformation.
// If the answer is YES, instantiate it.
// If the answer is NO, go to the next step.
// 
// Check if the provider has registered a subclass of CipherSpi
// for the sub-transformation "algorithm/mode".
// If the answer is YES, instantiate it, and call
// engineSetPadding(padding) on the new instance.
// If the answer is NO, go to the next step.
// 
// Check if the provider has registered a subclass of CipherSpi
// for the sub-transformation "algorithm//padding" (note the double
// slashes).
// If the answer is YES, instantiate it, and call
// engineSetMode(mode) on the new instance.
// If the answer is NO, go to the next step.
// 
// Check if the provider has registered a subclass of CipherSpi
// for the sub-transformation "algorithm".
// If the answer is YES, instantiate it, and call
// engineSetMode(mode) and
// engineSetPadding(padding) on the new instance.
// If the answer is NO, throw a NoSuchAlgorithmException
// exception.
// 
abstract class CipherSpi extends Object {

    // Encrypts or decrypts data in a single-part operation,
    // or finishes a multiple-part operation.
    protected def engineDoFinal(input: Array[Byte], inputOffset: Int, inputLen: Int): Array[Byte]

    // Encrypts or decrypts data in a single-part operation,
    // or finishes a multiple-part operation.
    protected def engineDoFinal(input: Array[Byte], inputOffset: Int, inputLen: Int, output: Array[Byte], outputOffset: Int): Int

    // Encrypts or decrypts data in a single-part operation,
    // or finishes a multiple-part operation.
    protected def engineDoFinal(input: ByteBuffer, output: ByteBuffer): Int

    // Returns the block size (in bytes).
    protected def engineGetBlockSize(): Int

    // Returns the initialization vector (IV) in a new buffer.
    protected def engineGetIV(): Array[Byte]

    // Returns the key size of the given key object in bits.
    protected def engineGetKeySize(key: Key): Int

    // Returns the length in bytes that an output buffer would
    // need to be in order to hold the result of the next update
    // or doFinal operation, given the input length
    // inputLen (in bytes).
    protected def engineGetOutputSize(inputLen: Int): Int

    // Returns the parameters used with this cipher.
    protected def engineGetParameters(): AlgorithmParameters

    // Initializes this cipher with a key, a set of
    // algorithm parameters, and a source of randomness.
    protected def engineInit(opmode: Int, key: Key, params: AlgorithmParameterSpec, random: SecureRandom): Unit

    // Initializes this cipher with a key, a set of
    // algorithm parameters, and a source of randomness.
    protected def engineInit(opmode: Int, key: Key, params: AlgorithmParameters, random: SecureRandom): Unit

    // Initializes this cipher with a key and a source
    // of randomness.
    protected def engineInit(opmode: Int, key: Key, random: SecureRandom): Unit

    // Sets the mode of this cipher.
    protected def engineSetMode(mode: String): Unit

    // Sets the padding mechanism of this cipher.
    protected def engineSetPadding(padding: String): Unit

    // Unwrap a previously wrapped key.
    protected def engineUnwrap(wrappedKey: Array[Byte], wrappedKeyAlgorithm: String, wrappedKeyType: Int): Key

    // Continues a multiple-part encryption or decryption operation
    // (depending on how this cipher was initialized), processing another data
    // part.
    protected def engineUpdate(input: Array[Byte], inputOffset: Int, inputLen: Int): Array[Byte]

    // Continues a multiple-part encryption or decryption operation
    // (depending on how this cipher was initialized), processing another data
    // part.
    protected def engineUpdate(input: Array[Byte], inputOffset: Int, inputLen: Int, output: Array[Byte], outputOffset: Int): Int

    // Continues a multiple-part encryption or decryption operation
    // (depending on how this cipher was initialized), processing another data
    // part.
    protected def engineUpdate(input: ByteBuffer, output: ByteBuffer): Int

    // Continues a multi-part update of the Additional Authentication
    // Data (AAD), using a subset of the provided buffer.
    protected def engineUpdateAAD(src: Array[Byte], offset: Int, len: Int): Unit

    // Continues a multi-part update of the Additional Authentication
    // Data (AAD).
    protected def engineUpdateAAD(src: ByteBuffer): Unit
}
