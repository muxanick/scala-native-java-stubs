package java.time

import java.io.Serializable
import java.lang.{CharSequence, Comparable, Object, String}
import java.time.format.DateTimeFormatter
import java.time.temporal.{Temporal, TemporalAccessor, TemporalAdjuster, TemporalAmount, TemporalField, TemporalQuery, TemporalUnit, ValueRange}

// A time with an offset from UTC/Greenwich in the ISO-8601 calendar system,
// such as 10:15:30+01:00.
// 
// OffsetTime is an immutable date-time object that represents a time, often
// viewed as hour-minute-second-offset.
// This class stores all time fields, to a precision of nanoseconds,
// as well as a zone offset.
// For example, the value "13:45.30.123456789+02:00" can be stored
// in an OffsetTime.
//
// 
// This is a value-based
// class; use of identity-sensitive operations (including reference equality
// (==), identity hash code, or synchronization) on instances of
// OffsetTime may have unpredictable results and should be avoided.
// The equals method should be used for comparisons.
final class OffsetTime extends Object with Temporal, with TemporalAdjuster, with Comparable[OffsetTime], with Serializable {

    @stub
    // Adjusts the specified temporal object to have the same offset and time
    // as this object.
    def adjustInto(temporal: Temporal): Temporal = ???

    @stub
    // Combines this time with a date to create an OffsetDateTime.
    def atDate(date: LocalDate): OffsetDateTime = ???

    @stub
    // Compares this OffsetTime to another time.
    def compareTo(other: OffsetTime): Int = ???

    @stub
    // Checks if this time is equal to another time.
    def equals(obj: Object): Boolean = ???

    @stub
    // Formats this time using the specified formatter.
    def format(formatter: DateTimeFormatter): String = ???

    @stub
    // Gets the value of the specified field from this time as an int.
    def get(field: TemporalField): Int = ???

    @stub
    // Gets the hour-of-day field.
    def getHour(): Int = ???

    @stub
    // Gets the value of the specified field from this time as a long.
    def getLong(field: TemporalField): Long = ???

    @stub
    // Gets the minute-of-hour field.
    def getMinute(): Int = ???

    @stub
    // Gets the nano-of-second field.
    def getNano(): Int = ???

    @stub
    // Gets the zone offset, such as '+01:00'.
    def getOffset(): ZoneOffset = ???

    @stub
    // Gets the second-of-minute field.
    def getSecond(): Int = ???

    @stub
    // A hash code for this time.
    def hashCode(): Int = ???

    @stub
    // Checks if the instant of this OffsetTime is after that of the
    // specified time applying both times to a common date.
    def isAfter(other: OffsetTime): Boolean = ???

    @stub
    // Checks if the instant of this OffsetTime is before that of the
    // specified time applying both times to a common date.
    def isBefore(other: OffsetTime): Boolean = ???

    @stub
    // Checks if the instant of this OffsetTime is equal to that of the
    // specified time applying both times to a common date.
    def isEqual(other: OffsetTime): Boolean = ???

    @stub
    // Checks if the specified field is supported.
    def isSupported(field: TemporalField): Boolean = ???

    @stub
    // Checks if the specified unit is supported.
    def isSupported(unit: TemporalUnit): Boolean = ???

    @stub
    // Returns a copy of this time with the specified amount subtracted.
    def minus(amountToSubtract: Long, unit: TemporalUnit): OffsetTime = ???

    @stub
    // Returns a copy of this time with the specified amount subtracted.
    def minus(amountToSubtract: TemporalAmount): OffsetTime = ???

    @stub
    // Returns a copy of this OffsetTime with the specified number of hours subtracted.
    def minusHours(hours: Long): OffsetTime = ???

    @stub
    // Returns a copy of this OffsetTime with the specified number of minutes subtracted.
    def minusMinutes(minutes: Long): OffsetTime = ???

    @stub
    // Returns a copy of this OffsetTime with the specified number of nanoseconds subtracted.
    def minusNanos(nanos: Long): OffsetTime = ???

    @stub
    // Returns a copy of this OffsetTime with the specified number of seconds subtracted.
    def minusSeconds(seconds: Long): OffsetTime = ???

    @stub
    // Returns a copy of this time with the specified amount added.
    def plus(amountToAdd: Long, unit: TemporalUnit): OffsetTime = ???

    @stub
    // Returns a copy of this time with the specified amount added.
    def plus(amountToAdd: TemporalAmount): OffsetTime = ???

    @stub
    // Returns a copy of this OffsetTime with the specified number of hours added.
    def plusHours(hours: Long): OffsetTime = ???

    @stub
    // Returns a copy of this OffsetTime with the specified number of minutes added.
    def plusMinutes(minutes: Long): OffsetTime = ???

    @stub
    // Returns a copy of this OffsetTime with the specified number of nanoseconds added.
    def plusNanos(nanos: Long): OffsetTime = ???

    @stub
    // Returns a copy of this OffsetTime with the specified number of seconds added.
    def plusSeconds(seconds: Long): OffsetTime = ???

    @stub
    // Queries this time using the specified query.
    def R: [R] = ???

    @stub
    // Gets the range of valid values for the specified field.
    def range(field: TemporalField): ValueRange = ???

    @stub
    // Gets the LocalTime part of this date-time.
    def toLocalTime(): LocalTime = ???

    @stub
    // Outputs this time as a String, such as 10:15:30+01:00.
    def toString(): String = ???

    @stub
    // Returns a copy of this OffsetTime with the time truncated.
    def truncatedTo(unit: TemporalUnit): OffsetTime = ???

    @stub
    // Calculates the amount of time until another time in terms of the specified unit.
    def until(endExclusive: Temporal, unit: TemporalUnit): Long = ???

    @stub
    // Returns an adjusted copy of this time.
    def with(adjuster: TemporalAdjuster): OffsetTime = ???

    @stub
    // Returns a copy of this time with the specified field set to a new value.
    def with(field: TemporalField, newValue: Long): OffsetTime = ???

    @stub
    // Returns a copy of this OffsetTime with the hour-of-day altered.
    def withHour(hour: Int): OffsetTime = ???

    @stub
    // Returns a copy of this OffsetTime with the minute-of-hour altered.
    def withMinute(minute: Int): OffsetTime = ???

    @stub
    // Returns a copy of this OffsetTime with the nano-of-second altered.
    def withNano(nanoOfSecond: Int): OffsetTime = ???

    @stub
    // Returns a copy of this OffsetTime with the specified offset ensuring
    // that the result is at the same instant on an implied day.
    def withOffsetSameInstant(offset: ZoneOffset): OffsetTime = ???

    @stub
    // Returns a copy of this OffsetTime with the specified offset ensuring
    // that the result has the same local time.
    def withOffsetSameLocal(offset: ZoneOffset): OffsetTime = ???
}

object OffsetTime {
    @stub
    // The maximum supported OffsetTime, '23:59:59.999999999-18:00'.
    def MAX: OffsetTime = ???

    @stub
    // Obtains an instance of OffsetTime from a temporal object.
    def from(temporal: TemporalAccessor): OffsetTime = ???

    @stub
    // Obtains the current time from the system clock in the default time-zone.
    def now(): OffsetTime = ???

    @stub
    // Obtains the current time from the specified clock.
    def now(clock: Clock): OffsetTime = ???

    @stub
    // Obtains the current time from the system clock in the specified time-zone.
    def now(zone: ZoneId): OffsetTime = ???

    @stub
    // Obtains an instance of OffsetTime from an hour, minute, second and nanosecond.
    def of(hour: Int, minute: Int, second: Int, nanoOfSecond: Int, offset: ZoneOffset): OffsetTime = ???

    @stub
    // Obtains an instance of OffsetTime from a local time and an offset.
    def of(time: LocalTime, offset: ZoneOffset): OffsetTime = ???

    @stub
    // Obtains an instance of OffsetTime from an Instant and zone ID.
    def ofInstant(instant: Instant, zone: ZoneId): OffsetTime = ???

    @stub
    // Obtains an instance of OffsetTime from a text string such as 10:15:30+01:00.
    def parse(text: CharSequence): OffsetTime = ???

    @stub
    // Obtains an instance of OffsetTime from a text string using a specific formatter.
    def parse(text: CharSequence, formatter: DateTimeFormatter): OffsetTime = ???
}
