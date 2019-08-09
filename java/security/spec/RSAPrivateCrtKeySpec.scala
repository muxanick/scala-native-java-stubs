package java.security.spec

import java.lang.Object
import java.math.BigInteger

// This class specifies an RSA private key, as defined in the PKCS#1
// standard, using the Chinese Remainder Theorem (CRT) information values for
// efficiency.
class RSAPrivateCrtKeySpec extends RSAPrivateKeySpec {

    @stub
    // Returns the crtCoefficient.
    def getCrtCoefficient(): BigInteger = ???

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
