package java.util

import java.io.Serializable
import java.lang.{Cloneable, Comparable, Object, String}
import java.time.Instant
import scala.scalanative.annotation.stub

/** The class Date represents a specific instant
 *  in time, with millisecond precision.
 *  
 *  Prior to JDK 1.1, the class Date had two additional
 *  functions.  It allowed the interpretation of dates as year, month, day, hour,
 *  minute, and second values.  It also allowed the formatting and parsing
 *  of date strings.  Unfortunately, the API for these functions was not
 *  amenable to internationalization.  As of JDK 1.1, the
 *  Calendar class should be used to convert between dates and time
 *  fields and the DateFormat class should be used to format and
 *  parse date strings.
 *  The corresponding methods in Date are deprecated.
 *  
 *  Although the Date class is intended to reflect
 *  coordinated universal time (UTC), it may not do so exactly,
 *  depending on the host environment of the Java Virtual Machine.
 *  Nearly all modern operating systems assume that 1 day =
 *  24 × 60 × 60 = 86400 seconds
 *  in all cases. In UTC, however, about once every year or two there
 *  is an extra second, called a "leap second." The leap
 *  second is always added as the last second of the day, and always
 *  on December 31 or June 30. For example, the last minute of the
 *  year 1995 was 61 seconds long, thanks to an added leap second.
 *  Most computer clocks are not accurate enough to be able to reflect
 *  the leap-second distinction.
 *  
 *  Some computer standards are defined in terms of Greenwich mean
 *  time (GMT), which is equivalent to universal time (UT).  GMT is
 *  the "civil" name for the standard; UT is the
 *  "scientific" name for the same standard. The
 *  distinction between UTC and UT is that UTC is based on an atomic
 *  clock and UT is based on astronomical observations, which for all
 *  practical purposes is an invisibly fine hair to split. Because the
 *  earth's rotation is not uniform (it slows down and speeds up
 *  in complicated ways), UT does not always flow uniformly. Leap
 *  seconds are introduced as needed into UTC so as to keep UTC within
 *  0.9 seconds of UT1, which is a version of UT with certain
 *  corrections applied. There are other time and date systems as
 *  well; for example, the time scale used by the satellite-based
 *  global positioning system (GPS) is synchronized to UTC but is
 *  not adjusted for leap seconds. An interesting source of
 *  further information is the U.S. Naval Observatory, particularly
 *  the Directorate of Time at:
 *  
 *      http://tycho.usno.navy.mil
 *  
 *  
 *  and their definitions of "Systems of Time" at:
 *  
 *      http://tycho.usno.navy.mil/systime.html
 *  
 *  
 *  In all methods of class Date that accept or return
 *  year, month, date, hours, minutes, and seconds values, the
 *  following representations are used:
 *  
 *  A year y is represented by the integer
 *      y - 1900.
 *  A month is represented by an integer from 0 to 11; 0 is January,
 *      1 is February, and so forth; thus 11 is December.
 *  A date (day of month) is represented by an integer from 1 to 31
 *      in the usual manner.
 *  An hour is represented by an integer from 0 to 23. Thus, the hour
 *      from midnight to 1 a.m. is hour 0, and the hour from noon to 1
 *      p.m. is hour 12.
 *  A minute is represented by an integer from 0 to 59 in the usual manner.
 *  A second is represented by an integer from 0 to 61; the values 60 and
 *      61 occur only for leap seconds and even then only in Java
 *      implementations that actually track leap seconds correctly. Because
 *      of the manner in which leap seconds are currently introduced, it is
 *      extremely unlikely that two leap seconds will occur in the same
 *      minute, but this specification follows the date and time conventions
 *      for ISO C.
 *  
 *  
 *  In all cases, arguments given to methods for these purposes need
 *  not fall within the indicated ranges; for example, a date may be
 *  specified as January 32 and is interpreted as meaning February 1.
 */
class Date extends Object with Serializable with Cloneable with Comparable[Date] {

    /** Allocates a Date object and initializes it so that
     *  it represents the time at which it was allocated, measured to the
     *  nearest millisecond.
     */
    @stub
    def this() = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by Calendar.set(year + 1900, month, date)
     *  or GregorianCalendar(year + 1900, month, date).
     * 
     */
    @stub
    def this(year: Int, month: Int, date: Int) = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by Calendar.set(year + 1900, month, date,
     *  hrs, min) or GregorianCalendar(year + 1900,
     *  month, date, hrs, min).
     * 
     */
    @stub
    def this(year: Int, month: Int, date: Int, hrs: Int, min: Int) = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by Calendar.set(year + 1900, month, date,
     *  hrs, min, sec) or GregorianCalendar(year + 1900,
     *  month, date, hrs, min, sec).
     * 
     */
    @stub
    def this(year: Int, month: Int, date: Int, hrs: Int, min: Int, sec: Int) = ???

    /** Allocates a Date object and initializes it to
     *  represent the specified number of milliseconds since the
     *  standard base time known as "the epoch", namely January 1,
     *  1970, 00:00:00 GMT.
     */
    @stub
    def this(date: Long) = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by DateFormat.parse(String s).
     * 
     */
    @stub
    def this(s: String) = ???

    /** Tests if this date is after the specified date. */
    @stub
    def after(when: Date): Boolean = ???

    /** Tests if this date is before the specified date. */
    @stub
    def before(when: Date): Boolean = ???

    /** Return a copy of this object. */
    @stub
    def clone(): Any = ???

    /** Compares two Dates for ordering. */
    @stub
    def compareTo(anotherDate: Date): Int = ???

    /** Compares two dates for equality. */
    @stub
    def equals(obj: Any): Boolean = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by Calendar.get(Calendar.DAY_OF_MONTH).
     * 
     */
    @stub
    def getDate(): Int = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by Calendar.get(Calendar.DAY_OF_WEEK).
     * 
     */
    @stub
    def getDay(): Int = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by Calendar.get(Calendar.HOUR_OF_DAY).
     * 
     */
    @stub
    def getHours(): Int = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by Calendar.get(Calendar.MINUTE).
     * 
     */
    @stub
    def getMinutes(): Int = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by Calendar.get(Calendar.MONTH).
     * 
     */
    @stub
    def getMonth(): Int = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by Calendar.get(Calendar.SECOND).
     * 
     */
    @stub
    def getSeconds(): Int = ???

    /** Returns the number of milliseconds since January 1, 1970, 00:00:00 GMT
     *  represented by this Date object.
     */
    @stub
    def getTime(): Long = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by -(Calendar.get(Calendar.ZONE_OFFSET) +
     *  Calendar.get(Calendar.DST_OFFSET)) / (60 * 1000).
     * 
     */
    @stub
    def getTimezoneOffset(): Int = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by Calendar.get(Calendar.YEAR) - 1900.
     * 
     */
    @stub
    def getYear(): Int = ???

    /** Returns a hash code value for this object. */
    @stub
    def hashCode(): Int = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by Calendar.set(Calendar.DAY_OF_MONTH, int date).
     * 
     */
    @stub
    def setDate(date: Int): Unit = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by Calendar.set(Calendar.HOUR_OF_DAY, int hours).
     * 
     */
    @stub
    def setHours(hours: Int): Unit = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by Calendar.set(Calendar.MINUTE, int minutes).
     * 
     */
    @stub
    def setMinutes(minutes: Int): Unit = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by Calendar.set(Calendar.MONTH, int month).
     * 
     */
    @stub
    def setMonth(month: Int): Unit = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by Calendar.set(Calendar.SECOND, int seconds).
     * 
     */
    @stub
    def setSeconds(seconds: Int): Unit = ???

    /** Sets this Date object to represent a point in time that is
     *  time milliseconds after January 1, 1970 00:00:00 GMT.
     */
    @stub
    def setTime(time: Long): Unit = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by Calendar.set(Calendar.YEAR, year + 1900).
     * 
     */
    @stub
    def setYear(year: Int): Unit = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by DateFormat.format(Date date), using a
     *  GMT TimeZone.
     * 
     */
    @stub
    def toGMTString(): String = ???

    /** Converts this Date object to an Instant. */
    @stub
    def toInstant(): Instant = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by DateFormat.format(Date date).
     * 
     */
    @stub
    def toLocaleString(): String = ???

    /** Converts this Date object to a String
     *  of the form:
     *  
     */
    @stub
    def toString(): String = ???
}

object Date {
    /** Obtains an instance of Date from an Instant object. */
    @stub
    def from(instant: Instant): Date = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by DateFormat.parse(String s).
     * 
     */
    @stub
    def parse(s: String): Long = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by Calendar.set(year + 1900, month, date,
     *  hrs, min, sec) or GregorianCalendar(year + 1900,
     *  month, date, hrs, min, sec), using a UTC
     *  TimeZone, followed by Calendar.getTime().getTime().
     * 
     */
    @stub
    def UTC(year: Int, month: Int, date: Int, hrs: Int, min: Int, sec: Int): Long = ???
}
