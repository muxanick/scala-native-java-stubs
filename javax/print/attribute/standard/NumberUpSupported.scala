package javax.print.attribute.standard

import java.lang.{Class, Object, String}
import javax.print.attribute.{Attribute, SetOfIntegerSyntax, SupportedValuesAttribute}
import scala.scalanative.annotation.stub

/** Class NumberUpSupported is a printing attribute class, a set of integers,
 *  that gives the supported values for a NumberUp attribute.
 *  
 *  IPP Compatibility: The NumberUpSupported attribute's canonical array
 *  form gives the lower and upper bound for each range of number-up to be
 *  included in an IPP "number-up-supported" attribute. See class SetOfIntegerSyntax for an
 *  explanation of canonical array form. The category name returned by
 *  getName() gives the IPP attribute name.
 *  
 */
final class NumberUpSupported extends SetOfIntegerSyntax with SupportedValuesAttribute {

    /** Construct a new number up supported attribute containing a single
     *  integer.
     */
    @stub
    def this(member: Int) = ???

    /** Construct a new number up supported attribute with the given members. */
    @stub
    def this(members: Array[Array[Int]]) = ???

    /** Construct a new number up supported attribute containing a single range
     *  of integers.
     */
    @stub
    def this(lowerBound: Int, upperBound: Int) = ???

    /** Returns whether this number up supported attribute is equivalent to the
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
