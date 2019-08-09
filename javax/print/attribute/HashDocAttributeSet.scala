package javax.print.attribute

import java.io.Serializable
import java.lang.Object

// Class HashDocAttributeSet provides an attribute set which
// inherits its implementation from class HashAttributeSet and enforces the semantic restrictions of interface DocAttributeSet.
// 
class HashDocAttributeSet extends HashAttributeSet with DocAttributeSet, with Serializable {

    @stub
    // Construct a new, empty hash doc attribute set.
    def this() = ???

    @stub
    // Construct a new hash doc attribute set,
    // initially populated with the given value.
    def this(attribute: DocAttribute) = ???

    @stub
    // Construct a new hash doc attribute set,
    // initially populated with the values from the given array.
    def this(attributes: Array[DocAttribute]) = ???
}
