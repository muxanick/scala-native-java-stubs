package java.time

import java.io.Serializable
import java.lang.{CharSequence, Comparable, Object, String}
import java.time.format.DateTimeFormatter
import java.time.temporal.{Temporal, TemporalAccessor, TemporalAdjuster, TemporalAmount, TemporalField, TemporalQuery, TemporalUnit, ValueRange}

// A time without a time-zone in the ISO-8601 calendar system,
// such as 10:15:30.
// 
// LocalTime is an immutable date-time object that represents a time,
// often viewed as hour-minute-second.
// Time is represented to nanosecond precision.
// For example, the value "13:45.30.123456789" can be stored in a LocalTime.
// 
// This class does not store or represent a date or time-zone.
// Instead, it is a description of the local time as seen on a wall clock.
// It cannot represent an instant on the time-line without additional information
// such as an offset or time-zone.
// 
// The ISO-8601 calendar system is the modern civil calendar system used today
// in most of the world. This API assumes that all calendar systems use the same
// representation, this class, for time-of-day.
//
// 
// This is a value-based
// class; use of identity-sensitive operations (including reference equality
// (==), identity hash code, or synchronization) on instances of
// LocalTime may have unpredictable results and should be avoided.
// The equals method should be used for comparisons.
final class LocalTime extends Object with Temporal, with TemporalAdjuster, with Comparable[LocalTime], with Serializable {

    @stub
    // Adjusts the specified temporal object to have the same time as this object.
    def adjustInto(temporal: Temporal): Temporal = ???

    @stub
    // Combines this time with a date to create a LocalDateTime.
    def atDate(date: LocalDate): LocalDateTime = ???

    @stub
    // Combines this time with an offset to create an OffsetTime.
    def atOffset(offset: ZoneOffset): OffsetTime = ???

    @stub
    // Compares this time to another time.
    def compareTo(other: LocalTime): Int = ???

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
    // Gets the second-of-minute field.
    def getSecond(): Int = ???

    @stub
    // A hash code for this time.
    def hashCode(): Int = ???

    @stub
    // Checks if this time is after the specified time.
    def isAfter(other: LocalTime): Boolean = ???

    @stub
    // Checks if this time is before the specified time.
    def isBefore(other: LocalTime): Boolean = ???

    @stub
    // Checks if the specified field is supported.
    def isSupported(field: TemporalField): Boolean = ???

    @stub
    // Checks if the specified unit is supported.
    def isSupported(unit: TemporalUnit): Boolean = ???

    @stub
    // Returns a copy of this time with the specified amount subtracted.
    def minus(amountToSubtract: Long, unit: TemporalUnit): LocalTime = ???

    @stub
    // Returns a copy of this time with the specified amount subtracted.
    def minus(amountToSubtract: TemporalAmount): LocalTime = ???

    @stub
    // Returns a copy of this LocalTime with the specified number of hours subtracted.
    def minusHours(hoursToSubtract: Long): LocalTime = ???

    @stub
    // Returns a copy of this LocalTime with the specified number of minutes subtracted.
    def minusMinutes(minutesToSubtract: Long): LocalTime = ???

    @stub
    // Returns a copy of this LocalTime with the specified number of nanoseconds subtracted.
    def minusNanos(nanosToSubtract: Long): LocalTime = ???

    @stub
    // Returns a copy of this LocalTime with the specified number of seconds subtracted.
    def minusSeconds(secondsToSubtract: Long): LocalTime = ???

    @stub
    // Returns a copy of this time with the specified amount added.
    def plus(amountToAdd: Long, unit: TemporalUnit): LocalTime = ???

    @stub
    // Returns a copy of this time with the specified amount added.
    def plus(amountToAdd: TemporalAmount): LocalTime = ???

    @stub
    // Returns a copy of this LocalTime with the specified number of hours added.
    def plusHours(hoursToAdd: Long): LocalTime = ???

    @stub
    // Returns a copy of this LocalTime with the specified number of minutes added.
    def plusMinutes(minutesToAdd: Long): LocalTime = ???

    @stub
    // Returns a copy of this LocalTime with the specified number of nanoseconds added.
    def plusNanos(nanosToAdd: Long): LocalTime = ???

    @stub
    // Returns a copy of this LocalTime with the specified number of seconds added.
    def plusSeconds(secondstoAdd: Long): LocalTime = ???

    @stub
    // Queries this time using the specified query.
    def R: [R] = ???

    @stub
    // Gets the range of valid values for the specified field.
    def range(field: TemporalField): ValueRange = ???

    @stub
    // Extracts the time as nanos of day,
    // from 0 to 24 * 60 * 60 * 1,000,000,000 - 1.
    def toNanoOfDay(): Long = ???

    @stub
    // Extracts the time as seconds of day,
    // from 0 to 24 * 60 * 60 - 1.
    def toSecondOfDay(): Int = ???

    @stub
    // Outputs this time as a String, such as 10:15.
    def toString(): String = ???

    @stub
    // Returns a copy of this LocalTime with the time truncated.
    def truncatedTo(unit: TemporalUnit): LocalTime = ???

    @stub
    // Calculates the amount of time until another time in terms of the specified unit.
    def until(endExclusive: Temporal, unit: TemporalUnit): Long = ???

    @stub
    // Returns an adjusted copy of this time.
    def with(adjuster: TemporalAdjuster): LocalTime = ???

    @stub
    // Returns a copy of this time with the specified field set to a new value.
    def with(field: TemporalField, newValue: Long): LocalTime = ???

    @stub
    // Returns a copy of this LocalTime with the hour-of-day altered.
    def withHour(hour: Int): LocalTime = ???

    @stub
    // Returns a copy of this LocalTime with the minute-of-hour altered.
    def withMinute(minute: Int): LocalTime = ???

    @stub
    // Returns a copy of this LocalTime with the nano-of-second altered.
    def withNano(nanoOfSecond: Int): LocalTime = ???
}

object LocalTime {
    @stub
    // The maximum supported LocalTime, '23:59:59.999999999'.
    def MAX: LocalTime = ???

    @stub
    // The time of midnight at the start of the day, '00:00'.
    def MIDNIGHT: LocalTime = ???

    @stub
    // The minimum supported LocalTime, '00:00'.
    def MIN: LocalTime = ???

    @stub
    // Obtains an instance of LocalTime from a temporal object.
    def from(temporal: TemporalAccessor): LocalTime = ???

    @stub
    // Obtains the current time from the system clock in the default time-zone.
    def now(): LocalTime = ???

    @stub
    // Obtains the current time from the specified clock.
    def now(clock: Clock): LocalTime = ???

    @stub
    // Obtains the current time from the system clock in the specified time-zone.
    def now(zone: ZoneId): LocalTime = ???

    @stub
    // Obtains an instance of LocalTime from an hour and minute.
    def of(hour: Int, minute: Int): LocalTime = ???

    @stub
    // Obtains an instance of LocalTime from an hour, minute and second.
    def of(hour: Int, minute: Int, second: Int): LocalTime = ???

    @stub
    // Obtains an instance of LocalTime from an hour, minute, second and nanosecond.
    def of(hour: Int, minute: Int, second: Int, nanoOfSecond: Int): LocalTime = ???

    @stub
    // Obtains an instance of LocalTime from a nanos-of-day value.
    def ofNanoOfDay(nanoOfDay: Long): LocalTime = ???

    @stub
    // Obtains an instance of LocalTime from a second-of-day value.
    def ofSecondOfDay(secondOfDay: Long): LocalTime = ???

    @stub
    // Obtains an instance of LocalTime from a text string such as 10:15.
    def parse(text: CharSequence): LocalTime = ???

    @stub
    // Obtains an instance of LocalTime from a text string using a specific formatter.
    def parse(text: CharSequence, formatter: DateTimeFormatter): LocalTime = ???
}
