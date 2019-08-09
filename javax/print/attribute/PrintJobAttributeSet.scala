package javax.print.attribute

/** Interface PrintJobAttributeSet specifies the interface for a set of print
 *  job attributes, i.e. printing attributes that implement interface PrintJobAttribute. In the Print Service API, a
 *  service uses a PrintJobAttributeSet to report the status of a print job.
 *  
 *  A PrintJobAttributeSet is just an AttributeSet whose
 *  constructors and mutating operations guarantee an additional invariant,
 *  namely that all attribute values in the PrintJobAttributeSet must be
 *  instances of interface PrintJobAttribute.
 *  The add(Attribute), and
 *  >addAll(AttributeSet) operations
 *  are respecified below to guarantee this additional invariant.
 *  
 */
trait PrintJobAttributeSet extends AttributeSet {

    /** Adds the specified attribute value to this attribute set if it is not
     *  already present, first removing any existing value in the same
     *  attribute category as the specified attribute value (optional
     *  operation).
     */
    @stub
    def add(attribute: Attribute): Boolean = ???
}
