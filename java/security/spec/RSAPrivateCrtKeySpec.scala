package java.security.spec

import java.lang.Object
import java.math.BigInteger
import scala.scalanative.annotation.stub

/** This class specifies an RSA private key, as defined in the PKCS#1
 *  standard, using the Chinese Remainder Theorem (CRT) information values for
 *  efficiency.
 */
class RSAPrivateCrtKeySpec extends RSAPrivateKeySpec {

    /** Creates a new RSAPrivateCrtKeySpec
     *  given the modulus, publicExponent, privateExponent,
     *  primeP, primeQ, primeExponentP, primeExponentQ, and
     *  crtCoefficient as defined in PKCS#1.
     */
    @stub
    def this(modulus: BigInteger, publicExponent: BigInteger, privateExponent: BigInteger, primeP: BigInteger, primeQ: BigInteger, primeExponentP: BigInteger, primeExponentQ: BigInteger, crtCoefficient: BigInteger) = ???

    /** Returns the crtCoefficient. */
    @stub
    def getCrtCoefficient(): BigInteger = ???

    /** Returns the primeExponentP. */
    @stub
    def getPrimeExponentP(): BigInteger = ???

    /** Returns the primeExponentQ. */
    @stub
    def getPrimeExponentQ(): BigInteger = ???

    /** Returns the primeP. */
    @stub
    def getPrimeP(): BigInteger = ???

    /** Returns the primeQ. */
    @stub
    def getPrimeQ(): BigInteger = ???

    /** Returns the public exponent. */
    @stub
    def getPublicExponent(): BigInteger = ???
}
