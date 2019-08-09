package java.time

import java.io.Serializable
import java.lang.{CharSequence, Object, String}
import java.time.chrono.ChronoLocalDateTime
import java.time.format.DateTimeFormatter
import java.time.temporal.{Temporal, TemporalAccessor, TemporalAdjuster, TemporalAmount, TemporalField, TemporalQuery, TemporalUnit, ValueRange}
import scala.scalanative.annotation.stub

/** A date-time without a time-zone in the ISO-8601 calendar system,
 *  such as 2007-12-03T10:15:30.
 *  
 *  LocalDateTime is an immutable date-time object that represents a date-time,
 *  often viewed as year-month-day-hour-minute-second. Other date and time fields,
 *  such as day-of-year, day-of-week and week-of-year, can also be accessed.
 *  Time is represented to nanosecond precision.
 *  For example, the value "2nd October 2007 at 13:45.30.123456789" can be
 *  stored in a LocalDateTime.
 *  
 *  This class does not store or represent a time-zone.
 *  Instead, it is a description of the date, as used for birthdays, combined with
 *  the local time as seen on a wall clock.
 *  It cannot represent an instant on the time-line without additional information
 *  such as an offset or time-zone.
 *  
 *  The ISO-8601 calendar system is the modern civil calendar system used today
 *  in most of the world. It is equivalent to the proleptic Gregorian calendar
 *  system, in which today's rules for leap years are applied for all time.
 *  For most applications written today, the ISO-8601 rules are entirely suitable.
 *  However, any application that makes use of historical dates, and requires them
 *  to be accurate will find the ISO-8601 approach unsuitable.
 * 
 *  
 *  This is a value-based
 *  class; use of identity-sensitive operations (including reference equality
 *  (==), identity hash code, or synchronization) on instances of
 *  LocalDateTime may have unpredictable results and should be avoided.
 *  The equals method should be used for comparisons.
 */
final class LocalDateTime extends Object with Temporal with TemporalAdjuster with ChronoLocalDateTime[LocalDate] with Serializable {

    /** Adjusts the specified temporal object to have the same date and time as this object. */
    @stub
    def adjustInto(temporal: Temporal): Temporal = ???

    /** Combines this date-time with an offset to create an OffsetDateTime. */
    @stub
    def atOffset(offset: ZoneOffset): OffsetDateTime = ???

    /** Combines this date-time with a time-zone to create a ZonedDateTime. */
    @stub
    def atZone(zone: ZoneId): ZonedDateTime = ???

    /** Compares this date-time to another date-time. */
    @stub
    def compareTo(other: ChronoLocalDateTime[_]): Int = ???

    /** Checks if this date-time is equal to another date-time. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Formats this date-time using the specified formatter. */
    @stub
    def format(formatter: DateTimeFormatter): String = ???

    /** Gets the value of the specified field from this date-time as an int. */
    @stub
    def get(field: TemporalField): Int = ???

    /** Gets the day-of-month field. */
    @stub
    def getDayOfMonth(): Int = ???

    /** Gets the day-of-week field, which is an enum DayOfWeek. */
    @stub
    def getDayOfWeek(): DayOfWeek = ???

    /** Gets the day-of-year field. */
    @stub
    def getDayOfYear(): Int = ???

    /** Gets the hour-of-day field. */
    @stub
    def getHour(): Int = ???

    /** Gets the value of the specified field from this date-time as a long. */
    @stub
    def getLong(field: TemporalField): Long = ???

    /** Gets the minute-of-hour field. */
    @stub
    def getMinute(): Int = ???

    /** Gets the month-of-year field using the Month enum. */
    @stub
    def getMonth(): Month = ???

    /** Gets the month-of-year field from 1 to 12. */
    @stub
    def getMonthValue(): Int = ???

    /** Gets the nano-of-second field. */
    @stub
    def getNano(): Int = ???

    /** Gets the second-of-minute field. */
    @stub
    def getSecond(): Int = ???

    /** Gets the year field. */
    @stub
    def getYear(): Int = ???

    /** A hash code for this date-time. */
    @stub
    def hashCode(): Int = ???

    /** Checks if this date-time is after the specified date-time. */
    @stub
    def isAfter(other: ChronoLocalDateTime[_]): Boolean = ???

    /** Checks if this date-time is before the specified date-time. */
    @stub
    def isBefore(other: ChronoLocalDateTime[_]): Boolean = ???

    /** Checks if this date-time is equal to the specified date-time. */
    @stub
    def isEqual(other: ChronoLocalDateTime[_]): Boolean = ???

    /** Checks if the specified field is supported. */
    @stub
    def isSupported(field: TemporalField): Boolean = ???

    /** Checks if the specified unit is supported. */
    @stub
    def isSupported(unit: TemporalUnit): Boolean = ???

    /** Returns a copy of this date-time with the specified amount subtracted. */
    @stub
    def minus(amountToSubtract: Long, unit: TemporalUnit): LocalDateTime = ???

    /** Returns a copy of this date-time with the specified amount subtracted. */
    @stub
    def minus(amountToSubtract: TemporalAmount): LocalDateTime = ???

    /** Returns a copy of this LocalDateTime with the specified number of days subtracted. */
    @stub
    def minusDays(days: Long): LocalDateTime = ???

    /** Returns a copy of this LocalDateTime with the specified number of hours subtracted. */
    @stub
    def minusHours(hours: Long): LocalDateTime = ???

    /** Returns a copy of this LocalDateTime with the specified number of minutes subtracted. */
    @stub
    def minusMinutes(minutes: Long): LocalDateTime = ???

    /** Returns a copy of this LocalDateTime with the specified number of months subtracted. */
    @stub
    def minusMonths(months: Long): LocalDateTime = ???

    /** Returns a copy of this LocalDateTime with the specified number of nanoseconds subtracted. */
    @stub
    def minusNanos(nanos: Long): LocalDateTime = ???

    /** Returns a copy of this LocalDateTime with the specified number of seconds subtracted. */
    @stub
    def minusSeconds(seconds: Long): LocalDateTime = ???

    /** Returns a copy of this LocalDateTime with the specified number of weeks subtracted. */
    @stub
    def minusWeeks(weeks: Long): LocalDateTime = ???

    /** Returns a copy of this LocalDateTime with the specified number of years subtracted. */
    @stub
    def minusYears(years: Long): LocalDateTime = ???

    /** Returns a copy of this date-time with the specified amount added. */
    @stub
    def plus(amountToAdd: Long, unit: TemporalUnit): LocalDateTime = ???

    /** Returns a copy of this date-time with the specified amount added. */
    @stub
    def plus(amountToAdd: TemporalAmount): LocalDateTime = ???

    /** Returns a copy of this LocalDateTime with the specified number of days added. */
    @stub
    def plusDays(days: Long): LocalDateTime = ???

    /** Returns a copy of this LocalDateTime with the specified number of hours added. */
    @stub
    def plusHours(hours: Long): LocalDateTime = ???

    /** Returns a copy of this LocalDateTime with the specified number of minutes added. */
    @stub
    def plusMinutes(minutes: Long): LocalDateTime = ???

    /** Returns a copy of this LocalDateTime with the specified number of months added. */
    @stub
    def plusMonths(months: Long): LocalDateTime = ???

    /** Returns a copy of this LocalDateTime with the specified number of nanoseconds added. */
    @stub
    def plusNanos(nanos: Long): LocalDateTime = ???

    /** Returns a copy of this LocalDateTime with the specified number of seconds added. */
    @stub
    def plusSeconds(seconds: Long): LocalDateTime = ???

    /** Returns a copy of this LocalDateTime with the specified number of weeks added. */
    @stub
    def plusWeeks(weeks: Long): LocalDateTime = ???

    /** Returns a copy of this LocalDateTime with the specified number of years added. */
    @stub
    def plusYears(years: Long): LocalDateTime = ???

    /** Queries this date-time using the specified query. */
    @stub
    def query[R](query: TemporalQuery[R]): R = ???

    /** Gets the range of valid values for the specified field. */
    @stub
    def range(field: TemporalField): ValueRange = ???

    /** Gets the LocalDate part of this date-time. */
    @stub
    def toLocalDate(): LocalDate = ???

    /** Gets the LocalTime part of this date-time. */
    @stub
    def toLocalTime(): LocalTime = ???

    /** Outputs this date-time as a String, such as 2007-12-03T10:15:30. */
    @stub
    def toString(): String = ???

    /** Returns a copy of this LocalDateTime with the time truncated. */
    @stub
    def truncatedTo(unit: TemporalUnit): LocalDateTime = ???

    /** Calculates the amount of time until another date-time in terms of the specified unit. */
    @stub
    def until(endExclusive: Temporal, unit: TemporalUnit): Long = ???

    /** Returns an adjusted copy of this date-time. */
    @stub
    def with(adjuster: TemporalAdjuster): LocalDateTime = ???

    /** Returns a copy of this date-time with the specified field set to a new value. */
    @stub
    def with(field: TemporalField, newValue: Long): LocalDateTime = ???

    /** Returns a copy of this LocalDateTime with the day-of-month altered. */
    @stub
    def withDayOfMonth(dayOfMonth: Int): LocalDateTime = ???

    /** Returns a copy of this LocalDateTime with the day-of-year altered. */
    @stub
    def withDayOfYear(dayOfYear: Int): LocalDateTime = ???

    /** Returns a copy of this LocalDateTime with the hour-of-day altered. */
    @stub
    def withHour(hour: Int): LocalDateTime = ???

    /** Returns a copy of this LocalDateTime with the minute-of-hour altered. */
    @stub
    def withMinute(minute: Int): LocalDateTime = ???

    /** Returns a copy of this LocalDateTime with the month-of-year altered. */
    @stub
    def withMonth(month: Int): LocalDateTime = ???

    /** Returns a copy of this LocalDateTime with the nano-of-second altered. */
    @stub
    def withNano(nanoOfSecond: Int): LocalDateTime = ???

    /** Returns a copy of this LocalDateTime with the second-of-minute altered. */
    @stub
    def withSecond(second: Int): LocalDateTime = ???

    /** Returns a copy of this LocalDateTime with the year altered. */
    @stub
    def withYear(year: Int): LocalDateTime = ???
}

object LocalDateTime {
    /** The maximum supported LocalDateTime, '+999999999-12-31T23:59:59.999999999'. */
    @stub
    val MAX: LocalDateTime = ???

    /** The minimum supported LocalDateTime, '-999999999-01-01T00:00:00'. */
    @stub
    val MIN: LocalDateTime = ???

    /** Obtains an instance of LocalDateTime from a temporal object. */
    @stub
    def from(temporal: TemporalAccessor): LocalDateTime = ???

    /** Obtains the current date-time from the system clock in the default time-zone. */
    @stub
    def now(): LocalDateTime = ???

    /** Obtains the current date-time from the specified clock. */
    @stub
    def now(clock: Clock): LocalDateTime = ???

    /** Obtains the current date-time from the system clock in the specified time-zone. */
    @stub
    def now(zone: ZoneId): LocalDateTime = ???

    /** Obtains an instance of LocalDateTime from year, month,
     *  day, hour and minute, setting the second and nanosecond to zero.
     */
    @stub
    def of(year: Int, month: Int, dayOfMonth: Int, hour: Int, minute: Int): LocalDateTime = ???

    /** Obtains an instance of LocalDateTime from year, month,
     *  day, hour, minute and second, setting the nanosecond to zero.
     */
    @stub
    def of(year: Int, month: Int, dayOfMonth: Int, hour: Int, minute: Int, second: Int): LocalDateTime = ???

    /** Obtains an instance of LocalDateTime from year, month,
     *  day, hour, minute, second and nanosecond.
     */
    @stub
    def of(year: Int, month: Int, dayOfMonth: Int, hour: Int, minute: Int, second: Int, nanoOfSecond: Int): LocalDateTime = ???

    /** Obtains an instance of LocalDateTime from year, month,
     *  day, hour and minute, setting the second and nanosecond to zero.
     */
    @stub
    def of(year: Int, month: Month, dayOfMonth: Int, hour: Int, minute: Int): LocalDateTime = ???

    /** Obtains an instance of LocalDateTime from year, month,
     *  day, hour, minute and second, setting the nanosecond to zero.
     */
    @stub
    def of(year: Int, month: Month, dayOfMonth: Int, hour: Int, minute: Int, second: Int): LocalDateTime = ???

    /** Obtains an instance of LocalDateTime from year, month,
     *  day, hour, minute, second and nanosecond.
     */
    @stub
    def of(year: Int, month: Month, dayOfMonth: Int, hour: Int, minute: Int, second: Int, nanoOfSecond: Int): LocalDateTime = ???

    /** Obtains an instance of LocalDateTime from a date and time. */
    @stub
    def of(date: LocalDate, time: LocalTime): LocalDateTime = ???

    /** Obtains an instance of LocalDateTime using seconds from the
     *  epoch of 1970-01-01T00:00:00Z.
     */
    @stub
    def ofEpochSecond(epochSecond: Long, nanoOfSecond: Int, offset: ZoneOffset): LocalDateTime = ???

    /** Obtains an instance of LocalDateTime from an Instant and zone ID. */
    @stub
    def ofInstant(instant: Instant, zone: ZoneId): LocalDateTime = ???

    /** Obtains an instance of LocalDateTime from a text string such as 2007-12-03T10:15:30. */
    @stub
    def parse(text: CharSequence): LocalDateTime = ???

    /** Obtains an instance of LocalDateTime from a text string using a specific formatter. */
    @stub
    def parse(text: CharSequence, formatter: DateTimeFormatter): LocalDateTime = ???
}
