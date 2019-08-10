package java.sql

import java.lang.{Object, String}
import java.time.{Instant, LocalDateTime}
import java.util.Date
import scala.scalanative.annotation.stub

/** A thin wrapper around java.util.Date that allows
 *  the JDBC API to identify this as an SQL TIMESTAMP value.
 *  It adds the ability
 *  to hold the SQL TIMESTAMP fractional seconds value, by allowing
 *  the specification of fractional seconds to a precision of nanoseconds.
 *  A Timestamp also provides formatting and
 *  parsing operations to support the JDBC escape syntax for timestamp values.
 * 
 *  The precision of a Timestamp object is calculated to be either:
 *  
 *  19 , which is the number of characters in yyyy-mm-dd hh:mm:ss
 *    20 + s , which is the number
 *  of characters in the yyyy-mm-dd hh:mm:ss.[fff...] and s represents  the scale of the given Timestamp,
 *  its fractional seconds precision.
 * 
 * 
 *  Note: This type is a composite of a java.util.Date and a
 *  separate nanoseconds value. Only integral seconds are stored in the
 *  java.util.Date component. The fractional seconds - the nanos - are
 *  separate.  The Timestamp.equals(Object) method never returns
 *  true when passed an object
 *  that isn't an instance of java.sql.Timestamp,
 *  because the nanos component of a date is unknown.
 *  As a result, the Timestamp.equals(Object)
 *  method is not symmetric with respect to the
 *  java.util.Date.equals(Object)
 *  method.  Also, the hashCode method uses the underlying
 *  java.util.Date
 *  implementation and therefore does not include nanos in its computation.
 *  
 *  Due to the differences between the Timestamp class
 *  and the java.util.Date
 *  class mentioned above, it is recommended that code not view
 *  Timestamp values generically as an instance of
 *  java.util.Date.  The
 *  inheritance relationship between Timestamp
 *  and java.util.Date really
 *  denotes implementation inheritance, and not type inheritance.
 */
class Timestamp extends Date {

    /** Deprecated. 
     * instead use the constructor Timestamp(long millis)
     * 
     */
    @stub
    def this(year: Int, month: Int, date: Int, hour: Int, minute: Int, second: Int, nano: Int) = ???

    /** Constructs a Timestamp object
     *  using a milliseconds time value.
     */
    @stub
    def this(time: Long) = ???

    /** Indicates whether this Timestamp object is
     *  later than the given Timestamp object.
     */
    @stub
    def after(ts: Timestamp): Boolean = ???

    /** Indicates whether this Timestamp object is
     *  earlier than the given Timestamp object.
     */
    @stub
    def before(ts: Timestamp): Boolean = ???

    /** Compares this Timestamp object to the given
     *  Date object.
     */
    @stub
    def compareTo(o: Date): Int = ???

    /** Compares this Timestamp object to the given
     *  Timestamp object.
     */
    @stub
    def compareTo(ts: Timestamp): Int = ???

    /** Tests to see if this Timestamp object is
     *  equal to the given object.
     */
    @stub
    def equals(ts: Any): Boolean = ???

    /** Tests to see if this Timestamp object is
     *  equal to the given Timestamp object.
     */
    @stub
    def equals(ts: Timestamp): Boolean = ???

    /** Gets this Timestamp object's nanos value. */
    @stub
    def getNanos(): Int = ???

    /** Returns the number of milliseconds since January 1, 1970, 00:00:00 GMT
     *  represented by this Timestamp object.
     */
    @stub
    def getTime(): Long = ???

    /** Returns a hash code value for this object. */
    @stub
    def hashCode(): Int = ???

    /** Sets this Timestamp object's nanos field
     *  to the given value.
     */
    @stub
    def setNanos(n: Int): Unit = ???

    /** Sets this Timestamp object to represent a point in time that is
     *  time milliseconds after January 1, 1970 00:00:00 GMT.
     */
    @stub
    def setTime(time: Long): Unit = ???

    /** Converts this Timestamp object to an Instant. */
    @stub
    def toInstant(): Instant = ???

    /** Converts this Timestamp object to a LocalDateTime. */
    @stub
    def toLocalDateTime(): LocalDateTime = ???

    /** Formats a timestamp in JDBC timestamp escape format. */
    @stub
    def toString(): String = ???
}

object Timestamp {
    /** Obtains an instance of Timestamp from an Instant object. */
    @stub
    def from(instant: Instant): Timestamp = ???

    /** Obtains an instance of Timestamp from a LocalDateTime
     *  object, with the same year, month, day of month, hours, minutes,
     *  seconds and nanos date-time value as the provided LocalDateTime.
     */
    @stub
    def valueOf(dateTime: LocalDateTime): Timestamp = ???

    /** Converts a String object in JDBC timestamp escape format to a
     *  Timestamp value.
     */
    @stub
    def valueOf(s: String): Timestamp = ???
}
