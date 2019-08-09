package java.security.interfaces

import java.math.BigInteger

// The interface to an RSA private key, as defined in the PKCS#1 standard,
// using the Chinese Remainder Theorem (CRT) information values.
trait RSAPrivateCrtKey extends RSAPrivateKey {

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
