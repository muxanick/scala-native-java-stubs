package java.security.spec

import java.lang.Object
import java.math.BigInteger

/** This class specifies an RSA multi-prime private key, as defined in the
 *  PKCS#1 v2.1, using the Chinese Remainder Theorem (CRT) information
 *  values for efficiency.
 */
class RSAMultiPrimePrivateCrtKeySpec extends RSAPrivateKeySpec {

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
}
