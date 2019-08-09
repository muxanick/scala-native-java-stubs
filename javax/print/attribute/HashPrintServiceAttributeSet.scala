package javax.print.attribute

import java.io.Serializable
import java.lang.Object
import scala.scalanative.annotation.stub

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

    /** Construct a new attribute set, initially populated with the
     *  values from the  given set where the members of the attribute set
     *  are restricted to the PrintServiceAttribute interface.
     */
    @stub
    def this(attributes: PrintServiceAttributeSet) = ???
}
