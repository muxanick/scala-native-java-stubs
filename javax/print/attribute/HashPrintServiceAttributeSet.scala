package javax.print.attribute

import java.io.Serializable
import java.lang.Object

/** Class HashPrintServiceAttributeSet provides an attribute set
 *  which inherits its implementation from class HashAttributeSet and enforces the semantic restrictions of interface
 *  PrintServiceAttributeSet.
 *  
 */
class HashPrintServiceAttributeSet extends HashAttributeSet with PrintServiceAttributeSet with Serializable {

    /** Construct a new, empty hash print service attribute set. */
    @stub
    def this() = ???

    /** Construct a new hash print service attribute set,
     *   initially populated with the given value.
     */
    @stub
    def this(attribute: PrintServiceAttribute) = ???

    /** Construct a new print service attribute set, initially populated with
     *  the values from the given array.
     */
    @stub
    def this(attributes: Array[PrintServiceAttribute]) = ???
}
