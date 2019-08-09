package java.sql

import java.lang.{Object, String}
import java.time.{Instant, LocalDateTime}
import java.util.Date

// A thin wrapper around java.util.Date that allows
// the JDBC API to identify this as an SQL TIMESTAMP value.
// It adds the ability
// to hold the SQL TIMESTAMP fractional seconds value, by allowing
// the specification of fractional seconds to a precision of nanoseconds.
// A Timestamp also provides formatting and
// parsing operations to support the JDBC escape syntax for timestamp values.
//
// The precision of a Timestamp object is calculated to be either:
// 
// 19 , which is the number of characters in yyyy-mm-dd hh:mm:ss
//   20 + s , which is the number
// of characters in the yyyy-mm-dd hh:mm:ss.[fff...] and s represents  the scale of the given Timestamp,
// its fractional seconds precision.
//
//
// Note: This type is a composite of a java.util.Date and a
// separate nanoseconds value. Only integral seconds are stored in the
// java.util.Date component. The fractional seconds - the nanos - are
// separate.  The Timestamp.equals(Object) method never returns
// true when passed an object
// that isn't an instance of java.sql.Timestamp,
// because the nanos component of a date is unknown.
// As a result, the Timestamp.equals(Object)
// method is not symmetric with respect to the
// java.util.Date.equals(Object)
// method.  Also, the hashCode method uses the underlying
// java.util.Date
// implementation and therefore does not include nanos in its computation.
// 
// Due to the differences between the Timestamp class
// and the java.util.Date
// class mentioned above, it is recommended that code not view
// Timestamp values generically as an instance of
// java.util.Date.  The
// inheritance relationship between Timestamp
// and java.util.Date really
// denotes implementation inheritance, and not type inheritance.
class Timestamp extends Date {

    @stub
    // Deprecated. 
    //instead use the constructor Timestamp(long millis)
    //
    def this(year: Int, month: Int, date: Int, hour: Int, minute: Int, second: Int, nano: Int) = ???

    @stub
    // Indicates whether this Timestamp object is
    // later than the given Timestamp object.
    def after(ts: Timestamp): Boolean = ???

    @stub
    // Indicates whether this Timestamp object is
    // earlier than the given Timestamp object.
    def before(ts: Timestamp): Boolean = ???

    @stub
    // Compares this Timestamp object to the given
    // Date object.
    def compareTo(o: Date): Int = ???

    @stub
    // Compares this Timestamp object to the given
    // Timestamp object.
    def compareTo(ts: Timestamp): Int = ???

    @stub
    // Tests to see if this Timestamp object is
    // equal to the given object.
    def equals(ts: Object): Boolean = ???

    @stub
    // Tests to see if this Timestamp object is
    // equal to the given Timestamp object.
    def equals(ts: Timestamp): Boolean = ???

    @stub
    // Gets this Timestamp object's nanos value.
    def getNanos(): Int = ???

    @stub
    // Returns the number of milliseconds since January 1, 1970, 00:00:00 GMT
    // represented by this Timestamp object.
    def getTime(): Long = ???

    @stub
    // Returns a hash code value for this object.
    def hashCode(): Int = ???

    @stub
    // Sets this Timestamp object's nanos field
    // to the given value.
    def setNanos(n: Int): Unit = ???

    @stub
    // Sets this Timestamp object to represent a point in time that is
    // time milliseconds after January 1, 1970 00:00:00 GMT.
    def setTime(time: Long): Unit = ???

    @stub
    // Converts this Timestamp object to an Instant.
    def toInstant(): Instant = ???

    @stub
    // Converts this Timestamp object to a LocalDateTime.
    def toLocalDateTime(): LocalDateTime = ???

    @stub
    // Formats a timestamp in JDBC timestamp escape format.
    def toString(): String = ???
}

object Timestamp {
    @stub
    // Obtains an instance of Timestamp from an Instant object.
    def from(instant: Instant): Timestamp = ???

    @stub
    // Obtains an instance of Timestamp from a LocalDateTime
    // object, with the same year, month, day of month, hours, minutes,
    // seconds and nanos date-time value as the provided LocalDateTime.
    def valueOf(dateTime: LocalDateTime): Timestamp = ???
}
