package java.security.spec

import java.lang.Object
import java.math.BigInteger
import scala.scalanative.annotation.stub

/** This class specifies the set of parameters used to generate an RSA
 *  key pair.
 */
class RSAKeyGenParameterSpec extends Object with AlgorithmParameterSpec {

    /** Constructs a new RSAParameterSpec object from the
     *  given keysize and public-exponent value.
     */
    @stub
    def this(keysize: Int, publicExponent: BigInteger) = ???

    /** Returns the keysize. */
    @stub
    def getKeysize(): Int = ???

    /** Returns the public-exponent value. */
    @stub
    def getPublicExponent(): BigInteger = ???
}

object RSAKeyGenParameterSpec {
    /** The public-exponent value F0 = 3. */
    @stub
    val F0: BigInteger = ???

    /** The public exponent-value F4 = 65537. */
    @stub
    val F4: BigInteger = ???
}
