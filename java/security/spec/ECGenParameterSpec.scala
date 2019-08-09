package java.security.spec

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** This immutable class specifies the set of parameters used for
 *  generating elliptic curve (EC) domain parameters.
 */
class ECGenParameterSpec extends Object with AlgorithmParameterSpec {

    /** Creates a parameter specification for EC parameter
     *  generation using a standard (or predefined) name
     *  stdName in order to generate the corresponding
     *  (precomputed) elliptic curve domain parameters.
     */
    @stub
    def this(stdName: String) = ???

    /** Returns the standard or predefined name of the
     *  to-be-generated EC domain parameters.
     */
    @stub
    def getName(): String = ???
}
