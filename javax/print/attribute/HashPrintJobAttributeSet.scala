package javax.print.attribute

import java.io.Serializable
import java.lang.Object

// Class HashPrintJobAttributeSet provides an attribute set
// which inherits its implementation from class HashAttributeSet and enforces the semantic restrictions of interface
// PrintJobAttributeSet.
// 
class HashPrintJobAttributeSet extends HashAttributeSet with PrintJobAttributeSet, with Serializable {

    @stub
    // Construct a new, empty hash print job attribute set.
    def this() = ???

    @stub
    // Construct a new hash print job attribute set,
    // initially populated with the given value.
    def this(attribute: PrintJobAttribute) = ???

    @stub
    // Construct a new hash print job attribute set,
    // initially populated with the values from the given array.
    def this(attributes: Array[PrintJobAttribute]) = ???
}
