package javax.print.attribute.standard

import java.lang.{Class, Object}
import javax.print.attribute.{Attribute, SetOfIntegerSyntax, SupportedValuesAttribute}

/** Class JobKOctetsSupported is a printing attribute class, a set of integers,
 *  that gives the supported values for a JobKOctets
 *  attribute. It is restricted to a single contiguous range of integers;
 *  multiple non-overlapping ranges are not allowed. This gives the lower and
 *  upper bounds of the total sizes of print jobs in units of K octets (1024
 *  octets) that the printer will accept.
 *  
 *  IPP Compatibility: The JobKOctetsSupported attribute's canonical array
 *  form gives the lower and upper bound for the range of values to be included
 *  in an IPP "job-k-octets-supported" attribute. See class SetOfIntegerSyntax for an
 *  explanation of canonical array form. The category name returned by
 *  getName() gives the IPP attribute name.
 *  
 */
final class JobKOctetsSupported extends SetOfIntegerSyntax with SupportedValuesAttribute {

    /** Returns whether this job K octets supported attribute is equivalent to
     *  the passed in object.
     */
    @stub
    def equals(object: Object): Boolean = ???

    /** Get the printing attribute class which is to be used as the "category"
     *  for this printing attribute value.
     */
    @stub
    def getCategory(): Class[_ <: Attribute] = ???
}
