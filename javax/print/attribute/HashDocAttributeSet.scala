package javax.print.attribute

import java.io.Serializable
import java.lang.Object
import scala.scalanative.annotation.stub

/** Class HashDocAttributeSet provides an attribute set which
 *  inherits its implementation from class HashAttributeSet and enforces the semantic restrictions of interface DocAttributeSet.
 *  
 */
class HashDocAttributeSet extends HashAttributeSet with DocAttributeSet with Serializable {

    /** Construct a new, empty hash doc attribute set. */
    @stub
    def this() = ???

    /** Construct a new hash doc attribute set,
     *  initially populated with the given value.
     */
    @stub
    def this(attribute: DocAttribute) = ???

    /** Construct a new hash doc attribute set,
     *  initially populated with the values from the given array.
     */
    @stub
    def this(attributes: Array[DocAttribute]) = ???

    /** Construct a new attribute set, initially populated with the
     *  values from the  given set where the members of the attribute set
     *  are restricted to the DocAttribute interface.
     */
    @stub
    def this(attributes: DocAttributeSet) = ???
}
