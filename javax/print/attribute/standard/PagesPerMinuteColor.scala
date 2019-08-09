package javax.print.attribute.standard

import java.lang.{Class, Object, String}
import javax.print.attribute.{Attribute, IntegerSyntax, PrintServiceAttribute}
import scala.scalanative.annotation.stub

/** Class PagesPerMinuteColor is an integer valued printing attribute that
 *  indicates the nominal number of pages per minute to the nearest whole number
 *  which may be generated by this printer when printing color (e.g., simplex,
 *  color). For purposes of this attribute, "color" means the same as for the
 *  ColorSupported attribute, namely, the device is
 *  capable of any type of color printing at all, including highlight color as
 *  well as full process color. This attribute is informative, not a service
 *  guarantee. Generally, it is the value used in the marketing literature to
 *  describe the color capabilities of this device. A value of 0 indicates a
 *  device that takes more than two minutes to process a page. If a color device
 *  has several color modes, it may use the pages-per- minute value for this
 *  attribute that corresponds to the mode that produces the highest number.
 *  
 *  A black and white only printer must not include the PagesPerMinuteColor
 *  attribute in its attribute set or service registration. If this attribute is
 *  present, then the ColorSupported printer description
 *  attribute must also be present and have a value of SUPPORTED.
 *  
 *  IPP Compatibility: The integer value gives the IPP integer value. The
 *  category name returned by getName() gives the IPP attribute
 *  name.
 *  
 */
final class PagesPerMinuteColor extends IntegerSyntax with PrintServiceAttribute {

    /** Construct a new pages per minute color attribute with the given integer
     *  value.
     */
    @stub
    def this(value: Int) = ???

    /** Returns whether this pages per minute color attribute is equivalent to
     *  the passed in object.
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
