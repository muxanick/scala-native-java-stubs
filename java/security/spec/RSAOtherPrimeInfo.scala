package java.security.spec

import java.lang.Object
import java.math.BigInteger
import scala.scalanative.annotation.stub

/** This class represents the triplet (prime, exponent, and coefficient)
 *  inside RSA's OtherPrimeInfo structure, as defined in the PKCS#1 v2.1.
 *  The ASN.1 syntax of RSA's OtherPrimeInfo is as follows:
 * 
 *  
 *  OtherPrimeInfo ::= SEQUENCE {
 *    prime INTEGER,
 *    exponent INTEGER,
 *    coefficient INTEGER
 *    }
 * 
 *  
 */
class RSAOtherPrimeInfo extends Object {

    /** Creates a new RSAOtherPrimeInfo
     *  given the prime, primeExponent, and
     *  crtCoefficient as defined in PKCS#1.
     */
    @stub
    def this(prime: BigInteger, primeExponent: BigInteger, crtCoefficient: BigInteger) = ???

    /** Returns the prime's crtCoefficient. */
    @stub
    def getCrtCoefficient(): BigInteger = ???

    /** Returns the prime's exponent. */
    @stub
    def getExponent(): BigInteger = ???

    /** Returns the prime. */
    @stub
    def getPrime(): BigInteger = ???
}
