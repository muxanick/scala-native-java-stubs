package javax.print.attribute.standard

import java.lang.{Class, Object}
import javax.print.attribute.{Attribute, SetOfIntegerSyntax, SupportedValuesAttribute}

/** Class JobMediaSheetsSupported is a printing attribute class, a set of
 *  integers, that gives the supported values for a JobMediaSheets attribute. It is restricted to a single contiguous range of
 *  integers; multiple non-overlapping ranges are not allowed. This gives the
 *  lower and upper bounds of the total sizes of print jobs in number of media
 *  sheets that the printer will accept.
 *  
 *  IPP Compatibility: The JobMediaSheetsSupported attribute's canonical
 *  array form gives the lower and upper bound for the range of values to be
 *  included in an IPP "job-media-sheets-supported" attribute. See class SetOfIntegerSyntax for an
 *  explanation of canonical array form. The category name returned by
 *  getName() gives the IPP attribute name.
 *  
 */
final class JobMediaSheetsSupported extends SetOfIntegerSyntax with SupportedValuesAttribute {

    /** Returns whether this job media sheets supported attribute is equivalent
     *  to the passed in object.
     */
    @stub
    def equals(object: Object): Boolean = ???

    /** Get the printing attribute class which is to be used as the "category"
     *  for this printing attribute value.
     */
    @stub
    def getCategory(): Class[_ <: Attribute] = ???
}
