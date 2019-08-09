package javax.print.attribute

/** Interface DocAttributeSet specifies the interface for a set of doc
 *  attributes, i.e. printing attributes that implement interface DocAttribute. In the Print Service API, the client uses a
 *  DocAttributeSet to specify the characteristics of an individual doc and
 *  the print job settings to be applied to an individual doc.
 *  
 *  A DocAttributeSet is just an AttributeSet whose
 *  constructors and mutating operations guarantee an additional invariant,
 *  namely that all attribute values in the DocAttributeSet must be instances
 *  of interface DocAttribute.
 *  The add(Attribute), and
 *  addAll(AttributeSet) operations
 *  are respecified below to guarantee this additional invariant.
 *  
 */
trait DocAttributeSet extends AttributeSet {

    /** Adds the specified attribute value to this attribute set if it is not
     *  already present, first removing any existing value in the same
     *  attribute category as the specified attribute value (optional
     *  operation).
     */
    @stub
    def add(attribute: Attribute): Boolean = ???
}
