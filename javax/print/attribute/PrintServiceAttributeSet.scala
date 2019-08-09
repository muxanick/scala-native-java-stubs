package javax.print.attribute

import scala.scalanative.annotation.stub

/** Interface PrintServiceAttributeSet specifies the interface for a set of
 *  print job attributes, i.e. printing attributes that implement interface
 *  PrintServiceAttribute. In the Print Service API,
 *  the Print Service instance uses a PrintServiceAttributeSet to report the
 *  status of the print service.
 *  
 *  A PrintServiceAttributeSet is just an AttributeSet
 *  whose constructors and mutating operations guarantee an additional
 *  invariant,
 *  namely that all attribute values in the PrintServiceAttributeSet must be
 *  instances of interface PrintServiceAttribute.
 *  The add(Attribute), and
 *  addAll(AttributeSet) operations
 *  are respecified below to guarantee this additional invariant.
 *  
 */
trait PrintServiceAttributeSet extends AttributeSet {

    /** Adds the specified attribute value to this attribute set if it is not
     *  already present, first removing any existing value in the same
     *  attribute category as the specified attribute value (optional
     *  operation).
     */
    @stub
    def add(attribute: Attribute): Boolean = ???

    /** Adds all of the elements in the specified set to this attribute. */
    @stub
    def addAll(attributes: AttributeSet): Boolean = ???
}
