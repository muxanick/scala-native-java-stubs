package javax.print.attribute.standard

import java.lang.{Class, Object, String}
import javax.print.attribute.{Attribute, IntegerSyntax, PrintServiceAttribute}
import scala.scalanative.annotation.stub

/** Class PagesPerMinute is an integer valued printing attribute that indicates
 *  the nominal number of pages per minute to the nearest whole number which may
 *  be generated by this printer (e.g., simplex, black-and-white). This attribute
 *  is informative, not a service guarantee. Generally, it is the value used in
 *  the marketing literature to describe the device. A value of 0 indicates a
 *  device that takes more than two minutes to process a page.
 *  
 *  IPP Compatibility: The integer value gives the IPP integer value. The
 *  category name returned by getName() gives the IPP attribute
 *  name.
 *  
 */
final class PagesPerMinute extends IntegerSyntax with PrintServiceAttribute {

    /** Construct a new pages per minute attribute with the given integer
     *  value.
     */
    @stub
    def this(value: Int) = ???

    /** Returns whether this pages per minute attribute is equivalent to the
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
