package java.security.spec

import java.lang.Object
import java.math.BigInteger
import scala.scalanative.annotation.stub

/** This class specifies a DSA private key with its associated parameters. */
class DSAPrivateKeySpec extends Object with KeySpec {

    /** Creates a new DSAPrivateKeySpec with the specified parameter values. */
    @stub
    def this(x: BigInteger, p: BigInteger, q: BigInteger, g: BigInteger) = ???

    /** Returns the base g. */
    @stub
    def getG(): BigInteger = ???

    /** Returns the prime p. */
    @stub
    def getP(): BigInteger = ???

    /** Returns the sub-prime q. */
    @stub
    def getQ(): BigInteger = ???

    /** Returns the private key x. */
    @stub
    def getX(): BigInteger = ???
}
