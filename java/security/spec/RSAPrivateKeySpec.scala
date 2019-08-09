package java.security.spec

import java.lang.Object
import java.math.BigInteger

// This class specifies an RSA private key.
class RSAPrivateKeySpec extends Object with KeySpec {

    @stub
    // Returns the modulus.
    def getModulus(): BigInteger = ???
}
