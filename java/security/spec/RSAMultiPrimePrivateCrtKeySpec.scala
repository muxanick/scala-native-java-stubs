package java.security.spec

import java.lang.Object
import java.math.BigInteger

// This class specifies an RSA multi-prime private key, as defined in the
// PKCS#1 v2.1, using the Chinese Remainder Theorem (CRT) information
// values for efficiency.
class RSAMultiPrimePrivateCrtKeySpec extends RSAPrivateKeySpec {

    @stub
    // Returns the crtCoefficient.
    def getCrtCoefficient(): BigInteger = ???

    @stub
    // Returns a copy of the otherPrimeInfo or null if there are
    // only two prime factors (p and q).
    def getOtherPrimeInfo(): Array[RSAOtherPrimeInfo] = ???

    @stub
    // Returns the primeExponentP.
    def getPrimeExponentP(): BigInteger = ???

    @stub
    // Returns the primeExponentQ.
    def getPrimeExponentQ(): BigInteger = ???

    @stub
    // Returns the primeP.
    def getPrimeP(): BigInteger = ???

    @stub
    // Returns the primeQ.
    def getPrimeQ(): BigInteger = ???
}
