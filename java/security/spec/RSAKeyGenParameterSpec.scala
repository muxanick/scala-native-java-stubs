package java.security.spec

import java.lang.Object
import java.math.BigInteger

// This class specifies the set of parameters used to generate an RSA
// key pair.
class RSAKeyGenParameterSpec extends Object with AlgorithmParameterSpec {

    @stub
    // Returns the keysize.
    def getKeysize(): Int = ???
}

object RSAKeyGenParameterSpec {
    @stub
    // The public-exponent value F0 = 3.
    def F0: BigInteger = ???
}
