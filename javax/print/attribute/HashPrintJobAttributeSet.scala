package javax.print.attribute

import java.io.Serializable
import java.lang.Object
import scala.scalanative.annotation.stub

/** Class HashPrintJobAttributeSet provides an attribute set
 *  which inherits its implementation from class HashAttributeSet and enforces the semantic restrictions of interface
 *  PrintJobAttributeSet.
 *  
 */
class HashPrintJobAttributeSet extends HashAttributeSet with PrintJobAttributeSet with Serializable {

    /** Construct a new, empty hash print job attribute set. */
    @stub
    def this() = ???

    /** Construct a new hash print job attribute set,
     *  initially populated with the given value.
     */
    @stub
    def this(attribute: PrintJobAttribute) = ???

    /** Construct a new hash print job attribute set,
     *  initially populated with the values from the given array.
     */
    @stub
    def this(attributes: Array[PrintJobAttribute]) = ???

    /** Construct a new attribute set, initially populated with the
     *  values from the  given set where the members of the attribute set
     *  are restricted to the PrintJobAttribute interface.
     */
    @stub
    def this(attributes: PrintJobAttributeSet) = ???
}
