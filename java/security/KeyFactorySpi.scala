package java.security

import java.lang.{Class, Object}
import java.security.spec.KeySpec

/** This class defines the Service Provider Interface (SPI)
 *  for the KeyFactory class.
 *  All the abstract methods in this class must be implemented by each
 *  cryptographic service provider who wishes to supply the implementation
 *  of a key factory for a particular algorithm.
 * 
 *   Key factories are used to convert keys (opaque
 *  cryptographic keys of type Key) into key specifications
 *  (transparent representations of the underlying key material), and vice
 *  versa.
 * 
 *   Key factories are bi-directional. That is, they allow you to build an
 *  opaque key object from a given key specification (key material), or to
 *  retrieve the underlying key material of a key object in a suitable format.
 * 
 *   Multiple compatible key specifications may exist for the same key.
 *  For example, a DSA public key may be specified using
 *  DSAPublicKeySpec or
 *  X509EncodedKeySpec. A key factory can be used to translate
 *  between compatible key specifications.
 * 
 *   A provider should document all the key specifications supported by its
 *  key factory.
 */
abstract class KeyFactorySpi extends Object {

    /** Generates a private key object from the provided key
     *  specification (key material).
     */
    protected def engineGeneratePrivate(keySpec: KeySpec): PrivateKey

    /** Generates a public key object from the provided key
     *  specification (key material).
     */
    protected def engineGeneratePublic(keySpec: KeySpec): PublicKey

    /** Returns a specification (key material) of the given key
     *  object.
     */
    protected val T: abstract[T <: KeySpec]
}
