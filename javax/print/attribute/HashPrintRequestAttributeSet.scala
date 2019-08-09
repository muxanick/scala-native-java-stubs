package javax.print.attribute

import java.io.Serializable
import java.lang.Object

// Class HashPrintRequestAttributeSet inherits its implementation from
// class HashAttributeSet and enforces the
// semantic restrictions of interface
// PrintRequestAttributeSet.
// 
class HashPrintRequestAttributeSet extends HashAttributeSet with PrintRequestAttributeSet, with Serializable {

    @stub
    // Construct a new, empty print request attribute set.
    def this() = ???

    @stub
    // Construct a new print request attribute set,
    // initially populated with the given value.
    def this(attribute: PrintRequestAttribute) = ???

    @stub
    // Construct a new print request attribute set, initially populated with
    // the values from the given array.
    def this(attributes: Array[PrintRequestAttribute]) = ???
}
