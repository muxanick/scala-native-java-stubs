package javax.crypto.spec

import java.lang.Object
import java.math.BigInteger
import java.security.spec.KeySpec
import scala.scalanative.annotation.stub

/** This class specifies a Diffie-Hellman public key with its associated
 *  parameters.
 * 
 *  Note that this class does not perform any validation on specified
 *  parameters. Thus, the specified values are returned directly even
 *  if they are null.
 */
class DHPublicKeySpec extends Object with KeySpec {

    /** Constructor that takes a public value y, a prime
     *  modulus p, and a base generator g.
     */
    @stub
    def this(y: BigInteger, p: BigInteger, g: BigInteger) = ???

    /** Returns the base generator g. */
    @stub
    def getG(): BigInteger = ???

    /** Returns the prime modulus p. */
    @stub
    def getP(): BigInteger = ???

    /** Returns the public value y. */
    @stub
    def getY(): BigInteger = ???
}
