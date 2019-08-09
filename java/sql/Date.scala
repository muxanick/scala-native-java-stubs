package java.sql

import java.lang.{Object, String}
import java.time.{Instant, LocalDate}
import java.util.Date
import scala.scalanative.annotation.stub

/** A thin wrapper around a millisecond value that allows
 *  JDBC to identify this as an SQL DATE value.  A
 *  milliseconds value represents the number of milliseconds that
 *  have passed since January 1, 1970 00:00:00.000 GMT.
 *  
 *  To conform with the definition of SQL DATE, the
 *  millisecond values wrapped by a java.sql.Date instance
 *  must be 'normalized' by setting the
 *  hours, minutes, seconds, and milliseconds to zero in the particular
 *  time zone with which the instance is associated.
 */
class Date extends Date {

    /** Deprecated. 
     * instead use the constructor Date(long date)
     * 
     */
    @stub
    def this(year: Int, month: Int, day: Int) = ???

    /** Constructs a Date object using the given milliseconds
     *  time value.
     */
    @stub
    def this(date: Long) = ???

    /** Deprecated.   */
    @stub
    def getHours(): Int = ???

    /** Deprecated.   */
    @stub
    def getMinutes(): Int = ???

    /** Deprecated.   */
    @stub
    def getSeconds(): Int = ???

    /** Deprecated.   */
    @stub
    def setHours(i: Int): Unit = ???

    /** Deprecated.   */
    @stub
    def setMinutes(i: Int): Unit = ???

    /** Deprecated.   */
    @stub
    def setSeconds(i: Int): Unit = ???

    /** Sets an existing Date object
     *  using the given milliseconds time value.
     */
    @stub
    def setTime(date: Long): Unit = ???

    /** This method always throws an UnsupportedOperationException and should
     *  not be used because SQL Date values do not have a time
     *  component.
     */
    @stub
    def toInstant(): Instant = ???

    /** Converts this Date object to a LocalDate */
    @stub
    def toLocalDate(): LocalDate = ???

    /** Formats a date in the date escape format yyyy-mm-dd. */
    @stub
    def toString(): String = ???
}

object Date {
    /** Obtains an instance of Date from a LocalDate object
     *  with the same year, month and day of month value as the given
     *  LocalDate.
     */
    @stub
    def valueOf(date: LocalDate): Date = ???

    /** Converts a string in JDBC date escape format to
     *  a Date value.
     */
    @stub
    def valueOf(s: String): Date = ???
}
