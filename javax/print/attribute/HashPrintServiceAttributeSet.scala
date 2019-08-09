package javax.print.attribute

import java.io.Serializable
import java.lang.Object

// Class HashPrintServiceAttributeSet provides an attribute set
// which inherits its implementation from class HashAttributeSet and enforces the semantic restrictions of interface
// PrintServiceAttributeSet.
// 
class HashPrintServiceAttributeSet extends HashAttributeSet with PrintServiceAttributeSet, with Serializable {

    @stub
    // Construct a new, empty hash print service attribute set.
    def this() = ???

    @stub
    // Construct a new hash print service attribute set,
    //  initially populated with the given value.
    def this(attribute: PrintServiceAttribute) = ???

    @stub
    // Construct a new print service attribute set, initially populated with
    // the values from the given array.
    def this(attributes: Array[PrintServiceAttribute]) = ???
}
