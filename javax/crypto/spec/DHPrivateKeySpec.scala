package javax.crypto.spec

import java.lang.Object
import java.math.BigInteger
import java.security.spec.KeySpec

/** This class specifies a Diffie-Hellman private key with its associated
 *  parameters.
 * 
 *  Note that this class does not perform any validation on specified
 *  parameters. Thus, the specified values are returned directly even
 *  if they are null.
 */
class DHPrivateKeySpec extends Object with KeySpec {

    /** Returns the base generator g. */
    @stub
    def getG(): BigInteger = ???

    /** Returns the prime modulus p. */
    @stub
    def getP(): BigInteger = ???
}
