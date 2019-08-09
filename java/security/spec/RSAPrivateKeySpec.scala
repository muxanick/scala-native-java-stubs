package java.security.spec

import java.lang.Object
import java.math.BigInteger
import scala.scalanative.annotation.stub

/** This class specifies an RSA private key. */
class RSAPrivateKeySpec extends Object with KeySpec {

    /** Creates a new RSAPrivateKeySpec. */
    @stub
    def this(modulus: BigInteger, privateExponent: BigInteger) = ???

    /** Returns the modulus. */
    @stub
    def getModulus(): BigInteger = ???

    /** Returns the private exponent. */
    @stub
    def getPrivateExponent(): BigInteger = ???
}
