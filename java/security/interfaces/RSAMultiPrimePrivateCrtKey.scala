package java.security.interfaces

import java.math.BigInteger
import java.security.spec.RSAOtherPrimeInfo

/** The interface to an RSA multi-prime private key, as defined in the
 *  PKCS#1 v2.1, using the Chinese Remainder Theorem
 *  (CRT) information values.
 */
trait RSAMultiPrimePrivateCrtKey extends RSAPrivateKey {

    /** Returns the crtCoefficient. */
    @stub
    def getCrtCoefficient(): BigInteger = ???

    /** Returns the otherPrimeInfo or null if there are only
     *  two prime factors (p and q).
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
