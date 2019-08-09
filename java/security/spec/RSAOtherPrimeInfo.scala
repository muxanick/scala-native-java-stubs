package java.security.spec

import java.lang.Object
import java.math.BigInteger

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

    /** Returns the prime's crtCoefficient. */
    @stub
    def getCrtCoefficient(): BigInteger = ???

    /** Returns the prime's exponent. */
    @stub
    def getExponent(): BigInteger = ???
}
