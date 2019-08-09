package javax.crypto.spec

import java.lang.Object
import java.security.spec.AlgorithmParameterSpec
import scala.scalanative.annotation.stub

/** This class specifies the set of parameters used for generating
 *  Diffie-Hellman (system) parameters for use in Diffie-Hellman key
 *  agreement. This is typically done by a central
 *  authority.
 * 
 *   The central authority, after computing the parameters, must send this
 *  information to the parties looking to agree on a secret key.
 */
class DHGenParameterSpec extends Object with AlgorithmParameterSpec {

    /** Constructs a parameter set for the generation of Diffie-Hellman
     *  (system) parameters.
     */
    @stub
    def this(primeSize: Int, exponentSize: Int) = ???

    /** Returns the size in bits of the random exponent (private value). */
    @stub
    def getExponentSize(): Int = ???

    /** Returns the size in bits of the prime modulus. */
    @stub
    def getPrimeSize(): Int = ???
}
