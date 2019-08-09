package java.security.interfaces

import java.math.BigInteger
import java.security.spec.RSAOtherPrimeInfo
import scala.scalanative.annotation.stub

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

    /** Returns the public exponent. */
    @stub
    def getPublicExponent(): BigInteger = ???
}

object RSAMultiPrimePrivateCrtKey {
    /** The type fingerprint that is set to indicate
     *  serialization compatibility with a previous
     *  version of the type.
     */
    @stub
    val serialVersionUID: Long = ???
}
