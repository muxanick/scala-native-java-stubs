package java.security.spec

import java.lang.Object
import java.math.BigInteger

/** This class specifies a DSA private key with its associated parameters. */
class DSAPrivateKeySpec extends Object with KeySpec {

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
