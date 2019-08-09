package javax.print.attribute

/** Interface PrintRequestAttributeSet specifies the interface for a set of
 *  print request attributes, i.e. printing attributes that implement interface
 *  PrintRequestAttribute.
 *  The client uses a PrintRequestAttributeSet to specify the settings to be
 *  applied to a whole print job and to all the docs in the print job.
 *  
 *  PrintRequestAttributeSet is just an AttributeSet whose
 *  constructors and mutating operations guarantee an additional invariant,
 *  namely that all attribute values in the PrintRequestAttributeSet must be
 *  instances of interface PrintRequestAttribute.
 *  The add(Attribute), and
 *  addAll(AttributeSet) operations
 *  are respecified below to guarantee this additional invariant.
 *  
 */
trait PrintRequestAttributeSet extends AttributeSet {

    /** Adds the specified attribute value to this attribute set if it is not
     *  already present, first removing any existing value in the same
     *  attribute category as the specified attribute value (optional
     *  operation).
     */
    @stub
    def add(attribute: Attribute): Boolean = ???
}
