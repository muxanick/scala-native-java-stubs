package java.security.spec

import java.lang.Object
import java.math.BigInteger

// This class specifies a DSA private key with its associated parameters.
class DSAPrivateKeySpec extends Object with KeySpec {

    @stub
    // Returns the base g.
    def getG(): BigInteger = ???

    @stub
    // Returns the prime p.
    def getP(): BigInteger = ???

    @stub
    // Returns the sub-prime q.
    def getQ(): BigInteger = ???
}
