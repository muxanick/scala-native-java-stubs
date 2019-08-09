package javax.crypto.spec

import java.lang.Object
import java.math.BigInteger
import java.security.spec.AlgorithmParameterSpec
import scala.scalanative.annotation.stub

/** This class specifies the set of parameters used with the Diffie-Hellman
 *  algorithm, as specified in PKCS #3: Diffie-Hellman Key-Agreement
 *  Standard.
 * 
 *  A central authority generates parameters and gives them to the two
 *  entities seeking to generate a secret key. The parameters are a prime
 *  p, a base g, and optionally the length
 *  in bits of the private value, l.
 * 
 *  It is possible that more than one instance of parameters may be
 *  generated by a given central authority, and that there may be more than
 *  one central authority. Indeed, each individual may be its own central
 *  authority, with different entities having different parameters.
 * 
 *  Note that this class does not perform any validation on specified
 *  parameters. Thus, the specified values are returned directly even
 *  if they are null.
 */
class DHParameterSpec extends Object with AlgorithmParameterSpec {

    /** Constructs a parameter set for Diffie-Hellman, using a prime modulus
     *  p and a base generator g.
     */
    @stub
    def this(p: BigInteger, g: BigInteger) = ???

    /** Constructs a parameter set for Diffie-Hellman, using a prime modulus
     *  p, a base generator g,
     *  and the size in bits, l, of the random exponent
     *  (private value).
     */
    @stub
    def this(p: BigInteger, g: BigInteger, l: Int) = ???

    /** Returns the base generator g. */
    @stub
    def getG(): BigInteger = ???

    /** Returns the size in bits, l, of the random exponent
     *  (private value).
     */
    @stub
    def getL(): Int = ???

    /** Returns the prime modulus p. */
    @stub
    def getP(): BigInteger = ???
}
