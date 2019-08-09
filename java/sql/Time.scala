package java.sql

import java.lang.{Object, String}
import java.time.{Instant, LocalTime}
import java.util.Date

/** A thin wrapper around the java.util.Date class that allows the JDBC
 *  API to identify this as an SQL TIME value. The Time
 *  class adds formatting and
 *  parsing operations to support the JDBC escape syntax for time
 *  values.
 *  The date components should be set to the "zero epoch"
 *  value of January 1, 1970 and should not be accessed.
 */
class Time extends Date {

    /** Deprecated. 
     * Use the constructor that takes a milliseconds value
     *              in place of this constructor
     * 
     */
    @stub
    def this(hour: Int, minute: Int, second: Int) = ???

    /** Deprecated.   */
    @stub
    def getDate(): Int = ???

    /** Deprecated.   */
    @stub
    def getDay(): Int = ???

    /** Deprecated.   */
    @stub
    def getMonth(): Int = ???

    /** Deprecated.   */
    @stub
    def getYear(): Int = ???

    /** Deprecated.   */
    @stub
    def setDate(i: Int): Unit = ???

    /** Deprecated.   */
    @stub
    def setMonth(i: Int): Unit = ???

    /** Sets a Time object using a milliseconds time value. */
    @stub
    def setTime(time: Long): Unit = ???

    /** Deprecated.   */
    @stub
    def setYear(i: Int): Unit = ???

    /** This method always throws an UnsupportedOperationException and should
     *  not be used because SQL Time values do not have a date
     *  component.
     */
    @stub
    def toInstant(): Instant = ???

    /** Converts this Time object to a LocalTime. */
    @stub
    def toLocalTime(): LocalTime = ???

    /** Formats a time in JDBC time escape format. */
    @stub
    def toString(): String = ???
}

object Time {
    /** Obtains an instance of Time from a LocalTime object
     *  with the same hour, minute and second time value as the given
     *  LocalTime.
     */
    @stub
    def valueOf(time: LocalTime): Time = ???
}
