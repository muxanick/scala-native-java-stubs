package java.security.spec

import java.lang.Object
import java.math.BigInteger

/** This class specifies the set of parameters used to generate an RSA
 *  key pair.
 */
class RSAKeyGenParameterSpec extends Object with AlgorithmParameterSpec {

    /** Returns the keysize. */
    @stub
    def getKeysize(): Int = ???
}

object RSAKeyGenParameterSpec {
    /** The public-exponent value F0 = 3. */
    @stub
    val F0: BigInteger = ???
}
