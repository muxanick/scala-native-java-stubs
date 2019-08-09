package java.security.interfaces

import java.math.BigInteger
import java.security.spec.RSAOtherPrimeInfo

// The interface to an RSA multi-prime private key, as defined in the
// PKCS#1 v2.1, using the Chinese Remainder Theorem
// (CRT) information values.
trait RSAMultiPrimePrivateCrtKey extends RSAPrivateKey {

    @stub
    // Returns the crtCoefficient.
    def getCrtCoefficient(): BigInteger = ???

    @stub
    // Returns the otherPrimeInfo or null if there are only
    // two prime factors (p and q).
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
