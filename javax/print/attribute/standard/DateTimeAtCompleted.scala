package javax.print.attribute.standard

import java.lang.{Class, Object}
import javax.print.attribute.{Attribute, DateTimeSyntax, PrintJobAttribute}

// Class DateTimeAtCompleted is a printing attribute class, a date-time
// attribute, that indicates the date and time at which the Print Job completed
// (or was canceled or aborted).
// 
// To construct a DateTimeAtCompleted attribute from separate values of the
// year, month, day, hour, minute, and so on, use a Calendar object to construct a Date object, then use
// the Date object to construct the DateTimeAtCompleted
// attribute. To convert a DateTimeAtCompleted attribute to separate values of
// the year, month, day, hour, minute, and so on, create a Calendar object and set it to the Date from the DateTimeAtCompleted attribute.
// 
// IPP Compatibility: The information needed to construct an IPP
// "date-time-at-completed" attribute can be obtained as described above. The
// category name returned by getName() gives the IPP attribute
// name.
// 
final class DateTimeAtCompleted extends DateTimeSyntax with PrintJobAttribute {

    @stub
    // Returns whether this date-time at completed attribute is equivalent to
    // the passed in object.
    def equals(object: Object): Boolean = ???

    @stub
    // Get the printing attribute class which is to be used as the "category"
    // for this printing attribute value.
    def getCategory(): Class[_ <: Attribute] = ???
}
