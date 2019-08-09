package javax.xml.crypto

import java.lang.String
import java.security.spec.AlgorithmParameterSpec
import scala.scalanative.annotation.stub

/** An abstract representation of an algorithm defined in the XML Security
 *  specifications. Subclasses represent specific types of XML security
 *  algorithms, such as a Transform.
 */
trait AlgorithmMethod {

    /** Returns the algorithm URI of this AlgorithmMethod. */
    @stub
    def getAlgorithm(): String = ???

    /** Returns the algorithm parameters of this AlgorithmMethod. */
    @stub
    def getParameterSpec(): AlgorithmParameterSpec = ???
}
