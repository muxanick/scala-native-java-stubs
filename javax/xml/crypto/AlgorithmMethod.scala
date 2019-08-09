package javax.xml.crypto

import java.lang.String

// An abstract representation of an algorithm defined in the XML Security
// specifications. Subclasses represent specific types of XML security
// algorithms, such as a Transform.
trait AlgorithmMethod {

    @stub
    // Returns the algorithm URI of this AlgorithmMethod.
    def getAlgorithm(): String = ???
}
