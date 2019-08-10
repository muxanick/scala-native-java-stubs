package java.security

import java.lang.{Object, String}
import java.nio.ByteBuffer
import java.security.cert.Certificate
import java.security.spec.AlgorithmParameterSpec
import scala.scalanative.annotation.stub

/** The Signature class is used to provide applications the functionality
 *  of a digital signature algorithm. Digital signatures are used for
 *  authentication and integrity assurance of digital data.
 * 
 *   The signature algorithm can be, among others, the NIST standard
 *  DSA, using DSA and SHA-256. The DSA algorithm using the
 *  SHA-256 message digest algorithm can be specified as SHA256withDSA.
 *  In the case of RSA the signing algorithm could be specified as, for example,
 *  SHA256withRSA.
 *  The algorithm name must be specified, as there is no default.
 * 
 *   A Signature object can be used to generate and verify digital
 *  signatures.
 * 
 *   There are three phases to the use of a Signature object for
 *  either signing data or verifying a signature:
 * 
 *  Initialization, with either
 * 
 *      
 * 
 *      a public key, which initializes the signature for
 *      verification (see initVerify), or
 * 
 *      a private key (and optionally a Secure Random Number Generator),
 *      which initializes the signature for signing
 *      (see initSign(PrivateKey)
 *      and initSign(PrivateKey, SecureRandom)).
 * 
 *      
 * 
 *  Updating
 * 
 *  Depending on the type of initialization, this will update the
 *  bytes to be signed or verified. See the
 *  update methods.
 * 
 *  Signing or Verifying a signature on all updated bytes. See the
 *  sign methods and the verify
 *  method.
 * 
 *  
 * 
 *  Note that this class is abstract and extends from
 *  SignatureSpi for historical reasons.
 *  Application developers should only take notice of the methods defined in
 *  this Signature class; all the methods in
 *  the superclass are intended for cryptographic service providers who wish to
 *  supply their own implementations of digital signature algorithms.
 * 
 *   Every implementation of the Java platform is required to support the
 *  following standard Signature algorithms:
 *  
 *  SHA1withDSA
 *  SHA1withRSA
 *  SHA256withRSA
 *  
 *  These algorithms are described in the 
 *  Signature section of the
 *  Java Cryptography Architecture Standard Algorithm Name Documentation.
 *  Consult the release documentation for your implementation to see if any
 *  other algorithms are supported.
 */
abstract class Signature extends SignatureSpi {

    /** Creates a Signature object for the specified algorithm. */
    @stub
    protected def this(algorithm: String) = ???

    /** Current state of this signature object. */
    protected val state: Int

    /** Returns a clone if the implementation is cloneable. */
    def clone(): Any

    /** Returns the name of the algorithm for this signature object. */
    def getAlgorithm(): String

    /** Deprecated.   */
    def getParameter(param: String): Any

    /** Returns the parameters used with this signature object. */
    def getParameters(): AlgorithmParameters

    /** Returns the provider of this signature object. */
    def getProvider(): Provider

    /** Initialize this object for signing. */
    def initSign(privateKey: PrivateKey): Unit

    /** Initialize this object for signing. */
    def initSign(privateKey: PrivateKey, random: SecureRandom): Unit

    /** Initializes this object for verification, using the public key from
     *  the given certificate.
     */
    def initVerify(certificate: Certificate): Unit

    /** Initializes this object for verification. */
    def initVerify(publicKey: PublicKey): Unit

    /** Initializes this signature engine with the specified parameter set. */
    def setParameter(params: AlgorithmParameterSpec): Unit

    /** Deprecated. 
     * Use
     *  setParameter.
     * 
     */
    def setParameter(param: String, value: Any): Unit

    /** Returns the signature bytes of all the data updated. */
    def sign(): Array[Byte]

    /** Finishes the signature operation and stores the resulting signature
     *  bytes in the provided buffer outbuf, starting at
     *  offset.
     */
    def sign(outbuf: Array[Byte], offset: Int, len: Int): Int

    /** Returns a string representation of this signature object,
     *  providing information that includes the state of the object
     *  and the name of the algorithm used.
     */
    def toString(): String

    /** Updates the data to be signed or verified by a byte. */
    def update(b: Byte): Unit

    /** Updates the data to be signed or verified, using the specified
     *  array of bytes.
     */
    def update(data: Array[Byte]): Unit

    /** Updates the data to be signed or verified, using the specified
     *  array of bytes, starting at the specified offset.
     */
    def update(data: Array[Byte], off: Int, len: Int): Unit

    /** Updates the data to be signed or verified using the specified
     *  ByteBuffer.
     */
    def update(data: ByteBuffer): Unit

    /** Verifies the passed-in signature. */
    def verify(signature: Array[Byte]): Boolean

    /** Verifies the passed-in signature in the specified array
     *  of bytes, starting at the specified offset.
     */
    def verify(signature: Array[Byte], offset: Int, length: Int): Boolean
}

object Signature {
    /** Possible state value, signifying that
     *  this signature object has been initialized for signing.
     */
    @stub
    protected val SIGN: Int = ???

    /** Possible state value, signifying that
     *  this signature object has not yet been initialized.
     */
    @stub
    protected val UNINITIALIZED: Int = ???

    /** Possible state value, signifying that
     *  this signature object has been initialized for verification.
     */
    @stub
    protected val VERIFY: Int = ???

    /** Returns a Signature object that implements the specified signature
     *  algorithm.
     */
    @stub
    def getInstance(algorithm: String): Signature = ???

    /** Returns a Signature object that implements the specified
     *  signature algorithm.
     */
    @stub
    def getInstance(algorithm: String, provider: Provider): Signature = ???

    /** Returns a Signature object that implements the specified signature
     *  algorithm.
     */
    @stub
    def getInstance(algorithm: String, provider: String): Signature = ???
}
