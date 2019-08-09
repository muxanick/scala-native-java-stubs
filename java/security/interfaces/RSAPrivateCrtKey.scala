package java.security.interfaces

import java.math.BigInteger
import scala.scalanative.annotation.stub

/** The interface to an RSA private key, as defined in the PKCS#1 standard,
 *  using the Chinese Remainder Theorem (CRT) information values.
 */
trait RSAPrivateCrtKey extends RSAPrivateKey {

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

object RSAPrivateCrtKey {
    /** The type fingerprint that is set to indicate
     *  serialization compatibility with a previous
     *  version of the type.
     */
    @stub
    val serialVersionUID: Long = ???
}
