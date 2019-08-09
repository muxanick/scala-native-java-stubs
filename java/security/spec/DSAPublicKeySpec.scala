package java.security.spec

import java.lang.Object
import java.math.BigInteger

/** This class specifies a DSA public key with its associated parameters. */
class DSAPublicKeySpec extends Object with KeySpec {

    /** Returns the base g. */
    @stub
    def getG(): BigInteger = ???

    /** Returns the prime p. */
    @stub
    def getP(): BigInteger = ???

    /** Returns the sub-prime q. */
    @stub
    def getQ(): BigInteger = ???
}
