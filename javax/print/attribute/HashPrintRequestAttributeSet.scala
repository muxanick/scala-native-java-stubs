package javax.print.attribute

import java.io.Serializable
import java.lang.Object
import scala.scalanative.annotation.stub

/** Class HashPrintRequestAttributeSet inherits its implementation from
 *  class HashAttributeSet and enforces the
 *  semantic restrictions of interface
 *  PrintRequestAttributeSet.
 *  
 */
class HashPrintRequestAttributeSet extends HashAttributeSet with PrintRequestAttributeSet with Serializable {

    /** Construct a new, empty print request attribute set. */
    @stub
    def this() = ???

    /** Construct a new print request attribute set,
     *  initially populated with the given value.
     */
    @stub
    def this(attribute: PrintRequestAttribute) = ???

    /** Construct a new print request attribute set, initially populated with
     *  the values from the given array.
     */
    @stub
    def this(attributes: Array[PrintRequestAttribute]) = ???

    /** Construct a new attribute set, initially populated with the
     *  values from the  given set where the members of the attribute set
     *  are restricted to the (PrintRequestAttributeSe interface.
     */
    @stub
    def this(attributes: PrintRequestAttributeSet) = ???
}
