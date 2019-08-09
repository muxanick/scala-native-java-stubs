package javax.print.attribute.standard

import java.lang.{Class, Object, String}
import javax.print.attribute.{Attribute, IntegerSyntax, PrintJobAttribute}
import scala.scalanative.annotation.stub

/** Class NumberOfInterveningJobs is an integer valued printing attribute that
 *  indicates the number of jobs that are ahead of this job in the relative
 *  chronological order of expected time to complete (i.e., the current
 *  scheduled order).
 *  
 *  IPP Compatibility: The integer value gives the IPP integer value.
 *  The category name returned by getName() gives the IPP
 *  attribute name.
 *  
 */
final class NumberOfInterveningJobs extends IntegerSyntax with PrintJobAttribute {

    /** Construct a new number of intervening jobs attribute with the given
     *  integer value.
     */
    @stub
    def this(value: Int) = ???

    /** Returns whether this number of intervening jobs attribute is equivalent
     *  to the passed in object.
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
