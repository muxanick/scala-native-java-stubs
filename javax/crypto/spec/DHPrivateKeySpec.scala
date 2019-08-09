package javax.crypto.spec

import java.lang.Object
import java.math.BigInteger
import java.security.spec.KeySpec
import scala.scalanative.annotation.stub

/** This class specifies a Diffie-Hellman private key with its associated
 *  parameters.
 * 
 *  Note that this class does not perform any validation on specified
 *  parameters. Thus, the specified values are returned directly even
 *  if they are null.
 */
class DHPrivateKeySpec extends Object with KeySpec {

    /** Constructor that takes a private value x, a prime
     *  modulus p, and a base generator g.
     */
    @stub
    def this(x: BigInteger, p: BigInteger, g: BigInteger) = ???

    /** Returns the base generator g. */
    @stub
    def getG(): BigInteger = ???

    /** Returns the prime modulus p. */
    @stub
    def getP(): BigInteger = ???

    /** Returns the private value x. */
    @stub
    def getX(): BigInteger = ???
}
