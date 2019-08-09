package javax.crypto

import java.lang.Object
import java.security.SecureRandom
import java.security.spec.AlgorithmParameterSpec
import scala.scalanative.annotation.stub

/** This class defines the Service Provider Interface (SPI)
 *  for the KeyGenerator class.
 *  All the abstract methods in this class must be implemented by each
 *  cryptographic service provider who wishes to supply the implementation
 *  of a key generator for a particular algorithm.
 */
abstract class KeyGeneratorSpi extends Object {

    /**  */
    @stub
    def this() = ???

    /** Generates a secret key. */
    protected def engineGenerateKey(): SecretKey

    /** Initializes the key generator with the specified parameter
     *  set and a user-provided source of randomness.
     */
    protected def engineInit(params: AlgorithmParameterSpec, random: SecureRandom): Unit

    /** Initializes this key generator for a certain keysize, using the given
     *  source of randomness.
     */
    protected def engineInit(keysize: Int, random: SecureRandom): Unit

    /** Initializes the key generator. */
    protected def engineInit(random: SecureRandom): Unit
}
