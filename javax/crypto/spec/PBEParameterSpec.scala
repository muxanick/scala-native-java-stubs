package javax.crypto.spec

import java.lang.Object
import java.security.spec.AlgorithmParameterSpec
import scala.scalanative.annotation.stub

/** This class specifies the set of parameters used with password-based
 *  encryption (PBE), as defined in the
 *  PKCS #5
 *  standard.
 */
class PBEParameterSpec extends Object with AlgorithmParameterSpec {

    /** Constructs a parameter set for password-based encryption as defined in
     *  the PKCS #5 standard.
     */
    @stub
    def this(salt: Array[Byte], iterationCount: Int) = ???

    /** Constructs a parameter set for password-based encryption as defined in
     *  the PKCS #5 standard.
     */
    @stub
    def this(salt: Array[Byte], iterationCount: Int, paramSpec: AlgorithmParameterSpec) = ???

    /** Returns the iteration count. */
    @stub
    def getIterationCount(): Int = ???

    /** Returns the cipher algorithm parameter specification. */
    @stub
    def getParameterSpec(): AlgorithmParameterSpec = ???

    /** Returns the salt. */
    @stub
    def getSalt(): Array[Byte] = ???
}
