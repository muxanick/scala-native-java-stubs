package java.security.interfaces

import java.math.BigInteger

/** Interface to a DSA-specific set of key parameters, which defines a
 *  DSA key family. DSA (Digital Signature Algorithm) is defined
 *  in NIST's FIPS-186.
 */
trait DSAParams {

    /** Returns the base, g. */
    @stub
    def getG(): BigInteger = ???

    /** Returns the prime, p. */
    @stub
    def getP(): BigInteger = ???
}
