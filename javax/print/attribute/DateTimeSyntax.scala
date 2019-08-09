package javax.print.attribute

import java.io.Serializable
import java.lang.{Cloneable, Object}
import java.util.Date

// Class DateTimeSyntax is an abstract base class providing the common
// implementation of all attributes whose value is a date and time.
// 
// Under the hood, a date-time attribute is stored as a value of class 
// java.util.Date. You can get a date-time attribute's Date value by
// calling getValue(). A date-time attribute's
// Date value is established when it is constructed (see DateTimeSyntax(Date)). Once
// constructed, a date-time attribute's value is immutable.
// 
// To construct a date-time attribute from separate values of the year, month,
// day, hour, minute, and so on, use a java.util.Calendar
// object to construct a java.util.Date object, then use the
// java.util.Date object to construct the date-time attribute.
// To convert
// a date-time attribute to separate values of the year, month, day, hour,
// minute, and so on, create a java.util.Calendar object and
// set it to the java.util.Date from the date-time attribute. Class
// DateTimeSyntax stores its value in the form of a java.util.Date
// 
// rather than a java.util.Calendar because it typically takes
// less memory to store and less time to compare a java.util.Date
// than a java.util.Calendar.
// 
abstract class DateTimeSyntax extends Object with Serializable, with Cloneable {

    // Returns whether this date-time attribute is equivalent to the passed in
    // object.
    def equals(object: Object): Boolean

    // Returns this date-time attribute's java.util.Date
    // value.
    def getValue(): Date

    // Returns a hash code value for this date-time attribute.
    def hashCode(): Int
}
