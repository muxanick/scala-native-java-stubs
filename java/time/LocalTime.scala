package java.time

import java.io.Serializable
import java.lang.{CharSequence, Comparable, Object, String}
import java.time.format.DateTimeFormatter
import java.time.temporal.{Temporal, TemporalAccessor, TemporalAdjuster, TemporalAmount, TemporalField, TemporalQuery, TemporalUnit, ValueRange}

/** A time without a time-zone in the ISO-8601 calendar system,
 *  such as 10:15:30.
 *  
 *  LocalTime is an immutable date-time object that represents a time,
 *  often viewed as hour-minute-second.
 *  Time is represented to nanosecond precision.
 *  For example, the value "13:45.30.123456789" can be stored in a LocalTime.
 *  
 *  This class does not store or represent a date or time-zone.
 *  Instead, it is a description of the local time as seen on a wall clock.
 *  It cannot represent an instant on the time-line without additional information
 *  such as an offset or time-zone.
 *  
 *  The ISO-8601 calendar system is the modern civil calendar system used today
 *  in most of the world. This API assumes that all calendar systems use the same
 *  representation, this class, for time-of-day.
 * 
 *  
 *  This is a value-based
 *  class; use of identity-sensitive operations (including reference equality
 *  (==), identity hash code, or synchronization) on instances of
 *  LocalTime may have unpredictable results and should be avoided.
 *  The equals method should be used for comparisons.
 */
final class LocalTime extends Object with Temporal with TemporalAdjuster with Comparable[LocalTime] with Serializable {

    /** Adjusts the specified temporal object to have the same time as this object. */
    @stub
    def adjustInto(temporal: Temporal): Temporal = ???

    /** Combines this time with a date to create a LocalDateTime. */
    @stub
    def atDate(date: LocalDate): LocalDateTime = ???

    /** Combines this time with an offset to create an OffsetTime. */
    @stub
    def atOffset(offset: ZoneOffset): OffsetTime = ???

    /** Compares this time to another time. */
    @stub
    def compareTo(other: LocalTime): Int = ???

    /** Checks if this time is equal to another time. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Formats this time using the specified formatter. */
    @stub
    def format(formatter: DateTimeFormatter): String = ???

    /** Gets the value of the specified field from this time as an int. */
    @stub
    def get(field: TemporalField): Int = ???

    /** Gets the hour-of-day field. */
    @stub
    def getHour(): Int = ???

    /** Gets the value of the specified field from this time as a long. */
    @stub
    def getLong(field: TemporalField): Long = ???

    /** Gets the minute-of-hour field. */
    @stub
    def getMinute(): Int = ???

    /** Gets the nano-of-second field. */
    @stub
    def getNano(): Int = ???

    /** Gets the second-of-minute field. */
    @stub
    def getSecond(): Int = ???

    /** A hash code for this time. */
    @stub
    def hashCode(): Int = ???

    /** Checks if this time is after the specified time. */
    @stub
    def isAfter(other: LocalTime): Boolean = ???

    /** Checks if this time is before the specified time. */
    @stub
    def isBefore(other: LocalTime): Boolean = ???

    /** Checks if the specified field is supported. */
    @stub
    def isSupported(field: TemporalField): Boolean = ???

    /** Checks if the specified unit is supported. */
    @stub
    def isSupported(unit: TemporalUnit): Boolean = ???

    /** Returns a copy of this time with the specified amount subtracted. */
    @stub
    def minus(amountToSubtract: Long, unit: TemporalUnit): LocalTime = ???

    /** Returns a copy of this time with the specified amount subtracted. */
    @stub
    def minus(amountToSubtract: TemporalAmount): LocalTime = ???

    /** Returns a copy of this LocalTime with the specified number of hours subtracted. */
    @stub
    def minusHours(hoursToSubtract: Long): LocalTime = ???

    /** Returns a copy of this LocalTime with the specified number of minutes subtracted. */
    @stub
    def minusMinutes(minutesToSubtract: Long): LocalTime = ???

    /** Returns a copy of this LocalTime with the specified number of nanoseconds subtracted. */
    @stub
    def minusNanos(nanosToSubtract: Long): LocalTime = ???

    /** Returns a copy of this LocalTime with the specified number of seconds subtracted. */
    @stub
    def minusSeconds(secondsToSubtract: Long): LocalTime = ???

    /** Returns a copy of this time with the specified amount added. */
    @stub
    def plus(amountToAdd: Long, unit: TemporalUnit): LocalTime = ???

    /** Returns a copy of this time with the specified amount added. */
    @stub
    def plus(amountToAdd: TemporalAmount): LocalTime = ???

    /** Returns a copy of this LocalTime with the specified number of hours added. */
    @stub
    def plusHours(hoursToAdd: Long): LocalTime = ???

    /** Returns a copy of this LocalTime with the specified number of minutes added. */
    @stub
    def plusMinutes(minutesToAdd: Long): LocalTime = ???

    /** Returns a copy of this LocalTime with the specified number of nanoseconds added. */
    @stub
    def plusNanos(nanosToAdd: Long): LocalTime = ???

    /** Returns a copy of this LocalTime with the specified number of seconds added. */
    @stub
    def plusSeconds(secondstoAdd: Long): LocalTime = ???

    /** Queries this time using the specified query. */
    @stub
    def query[R](query: TemporalQuery[R]): R = ???

    /** Gets the range of valid values for the specified field. */
    @stub
    def range(field: TemporalField): ValueRange = ???

    /** Extracts the time as nanos of day,
     *  from 0 to 24 * 60 * 60 * 1,000,000,000 - 1.
     */
    @stub
    def toNanoOfDay(): Long = ???

    /** Extracts the time as seconds of day,
     *  from 0 to 24 * 60 * 60 - 1.
     */
    @stub
    def toSecondOfDay(): Int = ???

    /** Outputs this time as a String, such as 10:15. */
    @stub
    def toString(): String = ???

    /** Returns a copy of this LocalTime with the time truncated. */
    @stub
    def truncatedTo(unit: TemporalUnit): LocalTime = ???

    /** Calculates the amount of time until another time in terms of the specified unit. */
    @stub
    def until(endExclusive: Temporal, unit: TemporalUnit): Long = ???

    /** Returns an adjusted copy of this time. */
    @stub
    def with(adjuster: TemporalAdjuster): LocalTime = ???

    /** Returns a copy of this time with the specified field set to a new value. */
    @stub
    def with(field: TemporalField, newValue: Long): LocalTime = ???

    /** Returns a copy of this LocalTime with the hour-of-day altered. */
    @stub
    def withHour(hour: Int): LocalTime = ???

    /** Returns a copy of this LocalTime with the minute-of-hour altered. */
    @stub
    def withMinute(minute: Int): LocalTime = ???

    /** Returns a copy of this LocalTime with the nano-of-second altered. */
    @stub
    def withNano(nanoOfSecond: Int): LocalTime = ???
}

object LocalTime {
    /** The maximum supported LocalTime, '23:59:59.999999999'. */
    @stub
    val MAX: LocalTime = ???

    /** The time of midnight at the start of the day, '00:00'. */
    @stub
    val MIDNIGHT: LocalTime = ???

    /** The minimum supported LocalTime, '00:00'. */
    @stub
    val MIN: LocalTime = ???

    /** Obtains an instance of LocalTime from a temporal object. */
    @stub
    def from(temporal: TemporalAccessor): LocalTime = ???

    /** Obtains the current time from the system clock in the default time-zone. */
    @stub
    def now(): LocalTime = ???

    /** Obtains the current time from the specified clock. */
    @stub
    def now(clock: Clock): LocalTime = ???

    /** Obtains the current time from the system clock in the specified time-zone. */
    @stub
    def now(zone: ZoneId): LocalTime = ???

    /** Obtains an instance of LocalTime from an hour and minute. */
    @stub
    def of(hour: Int, minute: Int): LocalTime = ???

    /** Obtains an instance of LocalTime from an hour, minute and second. */
    @stub
    def of(hour: Int, minute: Int, second: Int): LocalTime = ???

    /** Obtains an instance of LocalTime from an hour, minute, second and nanosecond. */
    @stub
    def of(hour: Int, minute: Int, second: Int, nanoOfSecond: Int): LocalTime = ???

    /** Obtains an instance of LocalTime from a nanos-of-day value. */
    @stub
    def ofNanoOfDay(nanoOfDay: Long): LocalTime = ???

    /** Obtains an instance of LocalTime from a second-of-day value. */
    @stub
    def ofSecondOfDay(secondOfDay: Long): LocalTime = ???

    /** Obtains an instance of LocalTime from a text string such as 10:15. */
    @stub
    def parse(text: CharSequence): LocalTime = ???

    /** Obtains an instance of LocalTime from a text string using a specific formatter. */
    @stub
    def parse(text: CharSequence, formatter: DateTimeFormatter): LocalTime = ???
}
