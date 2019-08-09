package java.security.spec

import java.lang.Object
import java.math.BigInteger
import scala.scalanative.annotation.stub

/** This class specifies an RSA public key. */
class RSAPublicKeySpec extends Object with KeySpec {

    /** Creates a new RSAPublicKeySpec. */
    @stub
    def this(modulus: BigInteger, publicExponent: BigInteger) = ???

    /** Returns the modulus. */
    @stub
    def getModulus(): BigInteger = ???

    /** Returns the public exponent. */
    @stub
    def getPublicExponent(): BigInteger = ???
}
