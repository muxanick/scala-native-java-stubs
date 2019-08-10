package java.time

import java.io.Serializable
import java.lang.{CharSequence, Comparable, Object, String}
import java.time.format.DateTimeFormatter
import java.time.temporal.{Temporal, TemporalAccessor, TemporalAdjuster, TemporalAmount, TemporalField, TemporalQuery, TemporalUnit, ValueRange}
import java.util.Comparator
import scala.scalanative.annotation.stub

/** A date-time with an offset from UTC/Greenwich in the ISO-8601 calendar system,
 *  such as 2007-12-03T10:15:30+01:00.
 *  
 *  OffsetDateTime is an immutable representation of a date-time with an offset.
 *  This class stores all date and time fields, to a precision of nanoseconds,
 *  as well as the offset from UTC/Greenwich. For example, the value
 *  "2nd October 2007 at 13:45.30.123456789 +02:00" can be stored in an OffsetDateTime.
 *  
 *  OffsetDateTime, ZonedDateTime and Instant all store an instant
 *  on the time-line to nanosecond precision.
 *  Instant is the simplest, simply representing the instant.
 *  OffsetDateTime adds to the instant the offset from UTC/Greenwich, which allows
 *  the local date-time to be obtained.
 *  ZonedDateTime adds full time-zone rules.
 *  
 *  It is intended that ZonedDateTime or Instant is used to model data
 *  in simpler applications. This class may be used when modeling date-time concepts in
 *  more detail, or when communicating to a database or in a network protocol.
 * 
 *  
 *  This is a value-based
 *  class; use of identity-sensitive operations (including reference equality
 *  (==), identity hash code, or synchronization) on instances of
 *  OffsetDateTime may have unpredictable results and should be avoided.
 *  The equals method should be used for comparisons.
 */
final class OffsetDateTime extends Object with Temporal with TemporalAdjuster with Comparable[OffsetDateTime] with Serializable {

    /** Adjusts the specified temporal object to have the same offset, date
     *  and time as this object.
     */
    @stub
    def adjustInto(temporal: Temporal): Temporal = ???

    /** Combines this date-time with a time-zone to create a ZonedDateTime
     *  ensuring that the result has the same instant.
     */
    @stub
    def atZoneSameInstant(zone: ZoneId): ZonedDateTime = ???

    /** Combines this date-time with a time-zone to create a ZonedDateTime
     *  trying to keep the same local date and time.
     */
    @stub
    def atZoneSimilarLocal(zone: ZoneId): ZonedDateTime = ???

    /** Compares this date-time to another date-time. */
    @stub
    def compareTo(other: OffsetDateTime): Int = ???

    /** Checks if this date-time is equal to another date-time. */
    @stub
    def equals(obj: Any): Boolean = ???

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

    /** Gets the zone offset, such as '+01:00'. */
    @stub
    def getOffset(): ZoneOffset = ???

    /** Gets the second-of-minute field. */
    @stub
    def getSecond(): Int = ???

    /** Gets the year field. */
    @stub
    def getYear(): Int = ???

    /** A hash code for this date-time. */
    @stub
    def hashCode(): Int = ???

    /** Checks if the instant of this date-time is after that of the specified date-time. */
    @stub
    def isAfter(other: OffsetDateTime): Boolean = ???

    /** Checks if the instant of this date-time is before that of the specified date-time. */
    @stub
    def isBefore(other: OffsetDateTime): Boolean = ???

    /** Checks if the instant of this date-time is equal to that of the specified date-time. */
    @stub
    def isEqual(other: OffsetDateTime): Boolean = ???

    /** Checks if the specified field is supported. */
    @stub
    def isSupported(field: TemporalField): Boolean = ???

    /** Checks if the specified unit is supported. */
    @stub
    def isSupported(unit: TemporalUnit): Boolean = ???

    /** Returns a copy of this date-time with the specified amount subtracted. */
    @stub
    def minus(amountToSubtract: Long, unit: TemporalUnit): OffsetDateTime = ???

    /** Returns a copy of this date-time with the specified amount subtracted. */
    @stub
    def minus(amountToSubtract: TemporalAmount): OffsetDateTime = ???

    /** Returns a copy of this OffsetDateTime with the specified number of days subtracted. */
    @stub
    def minusDays(days: Long): OffsetDateTime = ???

    /** Returns a copy of this OffsetDateTime with the specified number of hours subtracted. */
    @stub
    def minusHours(hours: Long): OffsetDateTime = ???

    /** Returns a copy of this OffsetDateTime with the specified number of minutes subtracted. */
    @stub
    def minusMinutes(minutes: Long): OffsetDateTime = ???

    /** Returns a copy of this OffsetDateTime with the specified number of months subtracted. */
    @stub
    def minusMonths(months: Long): OffsetDateTime = ???

    /** Returns a copy of this OffsetDateTime with the specified number of nanoseconds subtracted. */
    @stub
    def minusNanos(nanos: Long): OffsetDateTime = ???

    /** Returns a copy of this OffsetDateTime with the specified number of seconds subtracted. */
    @stub
    def minusSeconds(seconds: Long): OffsetDateTime = ???

    /** Returns a copy of this OffsetDateTime with the specified number of weeks subtracted. */
    @stub
    def minusWeeks(weeks: Long): OffsetDateTime = ???

    /** Returns a copy of this OffsetDateTime with the specified number of years subtracted. */
    @stub
    def minusYears(years: Long): OffsetDateTime = ???

    /** Returns a copy of this date-time with the specified amount added. */
    @stub
    def plus(amountToAdd: Long, unit: TemporalUnit): OffsetDateTime = ???

    /** Returns a copy of this date-time with the specified amount added. */
    @stub
    def plus(amountToAdd: TemporalAmount): OffsetDateTime = ???

    /** Returns a copy of this OffsetDateTime with the specified number of days added. */
    @stub
    def plusDays(days: Long): OffsetDateTime = ???

    /** Returns a copy of this OffsetDateTime with the specified number of hours added. */
    @stub
    def plusHours(hours: Long): OffsetDateTime = ???

    /** Returns a copy of this OffsetDateTime with the specified number of minutes added. */
    @stub
    def plusMinutes(minutes: Long): OffsetDateTime = ???

    /** Returns a copy of this OffsetDateTime with the specified number of months added. */
    @stub
    def plusMonths(months: Long): OffsetDateTime = ???

    /** Returns a copy of this OffsetDateTime with the specified number of nanoseconds added. */
    @stub
    def plusNanos(nanos: Long): OffsetDateTime = ???

    /** Returns a copy of this OffsetDateTime with the specified number of seconds added. */
    @stub
    def plusSeconds(seconds: Long): OffsetDateTime = ???

    /** Returns a copy of this OffsetDateTime with the specified number of weeks added. */
    @stub
    def plusWeeks(weeks: Long): OffsetDateTime = ???

    /** Returns a copy of this OffsetDateTime with the specified number of years added. */
    @stub
    def plusYears(years: Long): OffsetDateTime = ???

    /** Queries this date-time using the specified query. */
    @stub
    def query[R](query: TemporalQuery[R]): R = ???

    /** Gets the range of valid values for the specified field. */
    @stub
    def range(field: TemporalField): ValueRange = ???

    /** Converts this date-time to the number of seconds from the epoch of 1970-01-01T00:00:00Z. */
    @stub
    def toEpochSecond(): Long = ???

    /** Converts this date-time to an Instant. */
    @stub
    def toInstant(): Instant = ???

    /** Gets the LocalDate part of this date-time. */
    @stub
    def toLocalDate(): LocalDate = ???

    /** Gets the LocalDateTime part of this date-time. */
    @stub
    def toLocalDateTime(): LocalDateTime = ???

    /** Gets the LocalTime part of this date-time. */
    @stub
    def toLocalTime(): LocalTime = ???

    /** Converts this date-time to an OffsetTime. */
    @stub
    def toOffsetTime(): OffsetTime = ???

    /** Outputs this date-time as a String, such as 2007-12-03T10:15:30+01:00. */
    @stub
    def toString(): String = ???

    /** Converts this date-time to a ZonedDateTime using the offset as the zone ID. */
    @stub
    def toZonedDateTime(): ZonedDateTime = ???

    /** Returns a copy of this OffsetDateTime with the time truncated. */
    @stub
    def truncatedTo(unit: TemporalUnit): OffsetDateTime = ???

    /** Calculates the amount of time until another date-time in terms of the specified unit. */
    @stub
    def until(endExclusive: Temporal, unit: TemporalUnit): Long = ???

    /** Returns an adjusted copy of this date-time. */
    @stub
    def with(adjuster: TemporalAdjuster): OffsetDateTime = ???

    /** Returns a copy of this date-time with the specified field set to a new value. */
    @stub
    def with(field: TemporalField, newValue: Long): OffsetDateTime = ???

    /** Returns a copy of this OffsetDateTime with the day-of-month altered. */
    @stub
    def withDayOfMonth(dayOfMonth: Int): OffsetDateTime = ???

    /** Returns a copy of this OffsetDateTime with the day-of-year altered. */
    @stub
    def withDayOfYear(dayOfYear: Int): OffsetDateTime = ???

    /** Returns a copy of this OffsetDateTime with the hour-of-day altered. */
    @stub
    def withHour(hour: Int): OffsetDateTime = ???

    /** Returns a copy of this OffsetDateTime with the minute-of-hour altered. */
    @stub
    def withMinute(minute: Int): OffsetDateTime = ???

    /** Returns a copy of this OffsetDateTime with the month-of-year altered. */
    @stub
    def withMonth(month: Int): OffsetDateTime = ???

    /** Returns a copy of this OffsetDateTime with the nano-of-second altered. */
    @stub
    def withNano(nanoOfSecond: Int): OffsetDateTime = ???

    /** Returns a copy of this OffsetDateTime with the specified offset ensuring
     *  that the result is at the same instant.
     */
    @stub
    def withOffsetSameInstant(offset: ZoneOffset): OffsetDateTime = ???

    /** Returns a copy of this OffsetDateTime with the specified offset ensuring
     *  that the result has the same local date-time.
     */
    @stub
    def withOffsetSameLocal(offset: ZoneOffset): OffsetDateTime = ???

    /** Returns a copy of this OffsetDateTime with the second-of-minute altered. */
    @stub
    def withSecond(second: Int): OffsetDateTime = ???

    /** Returns a copy of this OffsetDateTime with the year altered. */
    @stub
    def withYear(year: Int): OffsetDateTime = ???
}

object OffsetDateTime {
    /** The maximum supported OffsetDateTime, '+999999999-12-31T23:59:59.999999999-18:00'. */
    @stub
    val MAX: OffsetDateTime = ???

    /** The minimum supported OffsetDateTime, '-999999999-01-01T00:00:00+18:00'. */
    @stub
    val MIN: OffsetDateTime = ???

    /** Obtains an instance of OffsetDateTime from a temporal object. */
    @stub
    def from(temporal: TemporalAccessor): OffsetDateTime = ???

    /** Obtains the current date-time from the system clock in the default time-zone. */
    @stub
    def now(): OffsetDateTime = ???

    /** Obtains the current date-time from the specified clock. */
    @stub
    def now(clock: Clock): OffsetDateTime = ???

    /** Obtains the current date-time from the system clock in the specified time-zone. */
    @stub
    def now(zone: ZoneId): OffsetDateTime = ???

    /** Obtains an instance of OffsetDateTime from a year, month, day,
     *  hour, minute, second, nanosecond and offset.
     */
    @stub
    def of(year: Int, month: Int, dayOfMonth: Int, hour: Int, minute: Int, second: Int, nanoOfSecond: Int, offset: ZoneOffset): OffsetDateTime = ???

    /** Obtains an instance of OffsetDateTime from a date, time and offset. */
    @stub
    def of(date: LocalDate, time: LocalTime, offset: ZoneOffset): OffsetDateTime = ???

    /** Obtains an instance of OffsetDateTime from a date-time and offset. */
    @stub
    def of(dateTime: LocalDateTime, offset: ZoneOffset): OffsetDateTime = ???

    /** Obtains an instance of OffsetDateTime from an Instant and zone ID. */
    @stub
    def ofInstant(instant: Instant, zone: ZoneId): OffsetDateTime = ???

    /** Obtains an instance of OffsetDateTime from a text string
     *  such as 2007-12-03T10:15:30+01:00.
     */
    @stub
    def parse(text: CharSequence): OffsetDateTime = ???

    /** Obtains an instance of OffsetDateTime from a text string using a specific formatter. */
    @stub
    def parse(text: CharSequence, formatter: DateTimeFormatter): OffsetDateTime = ???

    /** Gets a comparator that compares two OffsetDateTime instances
     *  based solely on the instant.
     */
    @stub
    def timeLineOrder(): Comparator[OffsetDateTime] = ???
}
