package javax.print.attribute.standard

import java.lang.{Class, Object, String}
import javax.print.attribute.{Attribute, SetOfIntegerSyntax, SupportedValuesAttribute}
import scala.scalanative.annotation.stub

/** Class CopiesSupported is a printing attribute class, a set of integers, that
 *  gives the supported values for a Copies attribute. It is
 *  restricted to a single contiguous range of integers; multiple non-overlapping
 *  ranges are not allowed.
 *  
 *  IPP Compatibility: The CopiesSupported attribute's canonical array
 *  form gives the lower and upper bound for the range of copies to be included
 *  in an IPP "copies-supported" attribute. See class SetOfIntegerSyntax for an
 *  explanation of canonical array form. The category name returned by
 *  getName() gives the IPP attribute name.
 *  
 */
final class CopiesSupported extends SetOfIntegerSyntax with SupportedValuesAttribute {

    /** Construct a new copies supported attribute containing a single integer. */
    @stub
    def this(member: Int) = ???

    /** Construct a new copies supported attribute containing a single range of
     *  integers.
     */
    @stub
    def this(lowerBound: Int, upperBound: Int) = ???

    /** Returns whether this copies supported attribute is equivalent to the
     *  passed in object.
     */
    @stub
    def equals(object: Object): Boolean = ???

    /** Get the printing attribute class which is to be used as the "category"
     *  for this printing attribute value.
     */
    @stub
    def getCategory(): Class[_ <: Attribute] = ???

    /** Get the name of the category of which this attribute value is an
     *  instance.
     */
    @stub
    def getName(): String = ???
}
