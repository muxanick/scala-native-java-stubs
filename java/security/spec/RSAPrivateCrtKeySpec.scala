package java.security.spec

import java.lang.Object
import java.math.BigInteger

/** This class specifies an RSA private key, as defined in the PKCS#1
 *  standard, using the Chinese Remainder Theorem (CRT) information values for
 *  efficiency.
 */
class RSAPrivateCrtKeySpec extends RSAPrivateKeySpec {

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
}
