package java.time

import java.io.Serializable
import java.lang.{CharSequence, Comparable, Object, String}
import java.time.format.DateTimeFormatter
import java.time.temporal.{Temporal, TemporalAccessor, TemporalAdjuster, TemporalAmount, TemporalField, TemporalQuery, TemporalUnit, ValueRange}
import scala.scalanative.annotation.stub

/** A time with an offset from UTC/Greenwich in the ISO-8601 calendar system,
 *  such as 10:15:30+01:00.
 *  
 *  OffsetTime is an immutable date-time object that represents a time, often
 *  viewed as hour-minute-second-offset.
 *  This class stores all time fields, to a precision of nanoseconds,
 *  as well as a zone offset.
 *  For example, the value "13:45.30.123456789+02:00" can be stored
 *  in an OffsetTime.
 * 
 *  
 *  This is a value-based
 *  class; use of identity-sensitive operations (including reference equality
 *  (==), identity hash code, or synchronization) on instances of
 *  OffsetTime may have unpredictable results and should be avoided.
 *  The equals method should be used for comparisons.
 */
final class OffsetTime extends Object with Temporal with TemporalAdjuster with Comparable[OffsetTime] with Serializable {

    /** Adjusts the specified temporal object to have the same offset and time
     *  as this object.
     */
    @stub
    def adjustInto(temporal: Temporal): Temporal = ???

    /** Combines this time with a date to create an OffsetDateTime. */
    @stub
    def atDate(date: LocalDate): OffsetDateTime = ???

    /** Compares this OffsetTime to another time. */
    @stub
    def compareTo(other: OffsetTime): Int = ???

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

    /** Gets the zone offset, such as '+01:00'. */
    @stub
    def getOffset(): ZoneOffset = ???

    /** Gets the second-of-minute field. */
    @stub
    def getSecond(): Int = ???

    /** A hash code for this time. */
    @stub
    def hashCode(): Int = ???

    /** Checks if the instant of this OffsetTime is after that of the
     *  specified time applying both times to a common date.
     */
    @stub
    def isAfter(other: OffsetTime): Boolean = ???

    /** Checks if the instant of this OffsetTime is before that of the
     *  specified time applying both times to a common date.
     */
    @stub
    def isBefore(other: OffsetTime): Boolean = ???

    /** Checks if the instant of this OffsetTime is equal to that of the
     *  specified time applying both times to a common date.
     */
    @stub
    def isEqual(other: OffsetTime): Boolean = ???

    /** Checks if the specified field is supported. */
    @stub
    def isSupported(field: TemporalField): Boolean = ???

    /** Checks if the specified unit is supported. */
    @stub
    def isSupported(unit: TemporalUnit): Boolean = ???

    /** Returns a copy of this time with the specified amount subtracted. */
    @stub
    def minus(amountToSubtract: Long, unit: TemporalUnit): OffsetTime = ???

    /** Returns a copy of this time with the specified amount subtracted. */
    @stub
    def minus(amountToSubtract: TemporalAmount): OffsetTime = ???

    /** Returns a copy of this OffsetTime with the specified number of hours subtracted. */
    @stub
    def minusHours(hours: Long): OffsetTime = ???

    /** Returns a copy of this OffsetTime with the specified number of minutes subtracted. */
    @stub
    def minusMinutes(minutes: Long): OffsetTime = ???

    /** Returns a copy of this OffsetTime with the specified number of nanoseconds subtracted. */
    @stub
    def minusNanos(nanos: Long): OffsetTime = ???

    /** Returns a copy of this OffsetTime with the specified number of seconds subtracted. */
    @stub
    def minusSeconds(seconds: Long): OffsetTime = ???

    /** Returns a copy of this time with the specified amount added. */
    @stub
    def plus(amountToAdd: Long, unit: TemporalUnit): OffsetTime = ???

    /** Returns a copy of this time with the specified amount added. */
    @stub
    def plus(amountToAdd: TemporalAmount): OffsetTime = ???

    /** Returns a copy of this OffsetTime with the specified number of hours added. */
    @stub
    def plusHours(hours: Long): OffsetTime = ???

    /** Returns a copy of this OffsetTime with the specified number of minutes added. */
    @stub
    def plusMinutes(minutes: Long): OffsetTime = ???

    /** Returns a copy of this OffsetTime with the specified number of nanoseconds added. */
    @stub
    def plusNanos(nanos: Long): OffsetTime = ???

    /** Returns a copy of this OffsetTime with the specified number of seconds added. */
    @stub
    def plusSeconds(seconds: Long): OffsetTime = ???

    /** Queries this time using the specified query. */
    @stub
    def query[R](query: TemporalQuery[R]): R = ???

    /** Gets the range of valid values for the specified field. */
    @stub
    def range(field: TemporalField): ValueRange = ???

    /** Gets the LocalTime part of this date-time. */
    @stub
    def toLocalTime(): LocalTime = ???

    /** Outputs this time as a String, such as 10:15:30+01:00. */
    @stub
    def toString(): String = ???

    /** Returns a copy of this OffsetTime with the time truncated. */
    @stub
    def truncatedTo(unit: TemporalUnit): OffsetTime = ???

    /** Calculates the amount of time until another time in terms of the specified unit. */
    @stub
    def until(endExclusive: Temporal, unit: TemporalUnit): Long = ???

    /** Returns an adjusted copy of this time. */
    @stub
    def with(adjuster: TemporalAdjuster): OffsetTime = ???

    /** Returns a copy of this time with the specified field set to a new value. */
    @stub
    def with(field: TemporalField, newValue: Long): OffsetTime = ???

    /** Returns a copy of this OffsetTime with the hour-of-day altered. */
    @stub
    def withHour(hour: Int): OffsetTime = ???

    /** Returns a copy of this OffsetTime with the minute-of-hour altered. */
    @stub
    def withMinute(minute: Int): OffsetTime = ???

    /** Returns a copy of this OffsetTime with the nano-of-second altered. */
    @stub
    def withNano(nanoOfSecond: Int): OffsetTime = ???

    /** Returns a copy of this OffsetTime with the specified offset ensuring
     *  that the result is at the same instant on an implied day.
     */
    @stub
    def withOffsetSameInstant(offset: ZoneOffset): OffsetTime = ???

    /** Returns a copy of this OffsetTime with the specified offset ensuring
     *  that the result has the same local time.
     */
    @stub
    def withOffsetSameLocal(offset: ZoneOffset): OffsetTime = ???

    /** Returns a copy of this OffsetTime with the second-of-minute altered. */
    @stub
    def withSecond(second: Int): OffsetTime = ???
}

object OffsetTime {
    /** The maximum supported OffsetTime, '23:59:59.999999999-18:00'. */
    @stub
    val MAX: OffsetTime = ???

    /** The minimum supported OffsetTime, '00:00:00+18:00'. */
    @stub
    val MIN: OffsetTime = ???

    /** Obtains an instance of OffsetTime from a temporal object. */
    @stub
    def from(temporal: TemporalAccessor): OffsetTime = ???

    /** Obtains the current time from the system clock in the default time-zone. */
    @stub
    def now(): OffsetTime = ???

    /** Obtains the current time from the specified clock. */
    @stub
    def now(clock: Clock): OffsetTime = ???

    /** Obtains the current time from the system clock in the specified time-zone. */
    @stub
    def now(zone: ZoneId): OffsetTime = ???

    /** Obtains an instance of OffsetTime from an hour, minute, second and nanosecond. */
    @stub
    def of(hour: Int, minute: Int, second: Int, nanoOfSecond: Int, offset: ZoneOffset): OffsetTime = ???

    /** Obtains an instance of OffsetTime from a local time and an offset. */
    @stub
    def of(time: LocalTime, offset: ZoneOffset): OffsetTime = ???

    /** Obtains an instance of OffsetTime from an Instant and zone ID. */
    @stub
    def ofInstant(instant: Instant, zone: ZoneId): OffsetTime = ???

    /** Obtains an instance of OffsetTime from a text string such as 10:15:30+01:00. */
    @stub
    def parse(text: CharSequence): OffsetTime = ???

    /** Obtains an instance of OffsetTime from a text string using a specific formatter. */
    @stub
    def parse(text: CharSequence, formatter: DateTimeFormatter): OffsetTime = ???
}
