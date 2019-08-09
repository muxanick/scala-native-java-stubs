package java.security.spec

import java.lang.Object
import java.math.BigInteger
import java.security.interfaces.DSAParams
import scala.scalanative.annotation.stub

/** This class specifies the set of parameters used with the DSA algorithm. */
class DSAParameterSpec extends Object with AlgorithmParameterSpec with DSAParams {

    /** Creates a new DSAParameterSpec with the specified parameter values. */
    @stub
    def this(p: BigInteger, q: BigInteger, g: BigInteger) = ???

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
