package javax.crypto.spec

import java.lang.Object
import java.math.BigInteger
import java.security.spec.KeySpec

// This class specifies a Diffie-Hellman public key with its associated
// parameters.
//
// Note that this class does not perform any validation on specified
// parameters. Thus, the specified values are returned directly even
// if they are null.
class DHPublicKeySpec extends Object with KeySpec {

    @stub
    // Returns the base generator g.
    def getG(): BigInteger = ???

    @stub
    // Returns the prime modulus p.
    def getP(): BigInteger = ???
}
