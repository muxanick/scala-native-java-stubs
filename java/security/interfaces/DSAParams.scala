package java.security.interfaces

import java.math.BigInteger

// Interface to a DSA-specific set of key parameters, which defines a
// DSA key family. DSA (Digital Signature Algorithm) is defined
// in NIST's FIPS-186.
trait DSAParams {

    @stub
    // Returns the base, g.
    def getG(): BigInteger = ???

    @stub
    // Returns the prime, p.
    def getP(): BigInteger = ???
}
