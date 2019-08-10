package javax.print.attribute.standard

import java.lang.{Class, Object, String}
import java.util.Date
import javax.print.attribute.{Attribute, DateTimeSyntax, PrintJobAttribute}
import scala.scalanative.annotation.stub

/** Class DateTimeAtProcessing is a printing attribute class, a date-time
 *  attribute, that indicates the date and time at which the Print Job first
 *  began processing.
 *  
 *  To construct a DateTimeAtProcessing attribute from separate values of the
 *  year, month, day, hour, minute, and so on, use a Calendar object to construct a Date object, then use
 *  the Date object to construct the DateTimeAtProcessing
 *  attribute. To convert a DateTimeAtProcessing attribute to separate values of
 *  the year, month, day, hour, minute, and so on, create a Calendar object and set it to the Date from the DateTimeAtProcessing attribute.
 *  
 *  IPP Compatibility: The information needed to construct an IPP
 *  "date-time-at-processing" attribute can be obtained as described above. The
 *  category name returned by getName() gives the IPP attribute
 *  name.
 *  
 */
final class DateTimeAtProcessing extends DateTimeSyntax with PrintJobAttribute {

    /** Construct a new date-time at processing attribute with the given Date value. */
    @stub
    def this(dateTime: Date) = ???

    /** Returns whether this date-time at processing attribute is equivalent to
     *  the passed in object.
     */
    @stub
    def equals(object: Any): Boolean = ???

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
