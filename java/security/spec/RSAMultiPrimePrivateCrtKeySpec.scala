package java.security.spec

import java.lang.Object
import java.math.BigInteger
import scala.scalanative.annotation.stub

/** This class specifies an RSA multi-prime private key, as defined in the
 *  PKCS#1 v2.1, using the Chinese Remainder Theorem (CRT) information
 *  values for efficiency.
 */
class RSAMultiPrimePrivateCrtKeySpec extends RSAPrivateKeySpec {

    /** Creates a new RSAMultiPrimePrivateCrtKeySpec
     *  given the modulus, publicExponent, privateExponent,
     *  primeP, primeQ, primeExponentP, primeExponentQ,
     *  crtCoefficient, and otherPrimeInfo as defined in PKCS#1 v2.1.
     */
    @stub
    def this(modulus: BigInteger, publicExponent: BigInteger, privateExponent: BigInteger, primeP: BigInteger, primeQ: BigInteger, primeExponentP: BigInteger, primeExponentQ: BigInteger, crtCoefficient: BigInteger, otherPrimeInfo: Array[RSAOtherPrimeInfo]) = ???

    /** Returns the crtCoefficient. */
    @stub
    def getCrtCoefficient(): BigInteger = ???

    /** Returns a copy of the otherPrimeInfo or null if there are
     *  only two prime factors (p and q).
     */
    @stub
    def getOtherPrimeInfo(): Array[RSAOtherPrimeInfo] = ???

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
