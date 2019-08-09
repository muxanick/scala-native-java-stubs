package java.security.spec

import java.lang.Object
import scala.scalanative.annotation.stub

/** This immutable class specifies the set of parameters used for
 *  generating DSA parameters as specified in
 *  FIPS 186-3 Digital Signature Standard (DSS).
 */
final class DSAGenParameterSpec extends Object with AlgorithmParameterSpec {

    /** Creates a domain parameter specification for DSA parameter
     *  generation using primePLen and subprimeQLen.
     */
    @stub
    def this(primePLen: Int, subprimeQLen: Int) = ???

    /** Creates a domain parameter specification for DSA parameter
     *  generation using primePLen, subprimeQLen,
     *  and seedLen.
     */
    @stub
    def this(primePLen: Int, subprimeQLen: Int, seedLen: Int) = ???

    /** Returns the desired length of the prime P of the
     *  to-be-generated DSA domain parameters in bits.
     */
    @stub
    def getPrimePLength(): Int = ???

    /** Returns the desired length of the domain parameter seed in bits. */
    @stub
    def getSeedLength(): Int = ???

    /** Returns the desired length of the sub-prime Q of the
     *  to-be-generated DSA domain parameters in bits.
     */
    @stub
    def getSubprimeQLength(): Int = ???
}
