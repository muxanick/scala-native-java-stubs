package java.time

import java.io.Serializable
import java.lang.{CharSequence, Object, String}
import java.time.chrono.ChronoLocalDateTime
import java.time.format.DateTimeFormatter
import java.time.temporal.{Temporal, TemporalAccessor, TemporalAdjuster, TemporalAmount, TemporalField, TemporalQuery, TemporalUnit, ValueRange}

// A date-time without a time-zone in the ISO-8601 calendar system,
// such as 2007-12-03T10:15:30.
// 
// LocalDateTime is an immutable date-time object that represents a date-time,
// often viewed as year-month-day-hour-minute-second. Other date and time fields,
// such as day-of-year, day-of-week and week-of-year, can also be accessed.
// Time is represented to nanosecond precision.
// For example, the value "2nd October 2007 at 13:45.30.123456789" can be
// stored in a LocalDateTime.
// 
// This class does not store or represent a time-zone.
// Instead, it is a description of the date, as used for birthdays, combined with
// the local time as seen on a wall clock.
// It cannot represent an instant on the time-line without additional information
// such as an offset or time-zone.
// 
// The ISO-8601 calendar system is the modern civil calendar system used today
// in most of the world. It is equivalent to the proleptic Gregorian calendar
// system, in which today's rules for leap years are applied for all time.
// For most applications written today, the ISO-8601 rules are entirely suitable.
// However, any application that makes use of historical dates, and requires them
// to be accurate will find the ISO-8601 approach unsuitable.
//
// 
// This is a value-based
// class; use of identity-sensitive operations (including reference equality
// (==), identity hash code, or synchronization) on instances of
// LocalDateTime may have unpredictable results and should be avoided.
// The equals method should be used for comparisons.
final class LocalDateTime extends Object with Temporal, with TemporalAdjuster, with ChronoLocalDateTime[LocalDate], with Serializable {

    @stub
    // Adjusts the specified temporal object to have the same date and time as this object.
    def adjustInto(temporal: Temporal): Temporal = ???

    @stub
    // Combines this date-time with an offset to create an OffsetDateTime.
    def atOffset(offset: ZoneOffset): OffsetDateTime = ???

    @stub
    // Combines this date-time with a time-zone to create a ZonedDateTime.
    def atZone(zone: ZoneId): ZonedDateTime = ???

    @stub
    // Compares this date-time to another date-time.
    def compareTo(other: ChronoLocalDateTime[_]): Int = ???

    @stub
    // Checks if this date-time is equal to another date-time.
    def equals(obj: Object): Boolean = ???

    @stub
    // Formats this date-time using the specified formatter.
    def format(formatter: DateTimeFormatter): String = ???

    @stub
    // Gets the value of the specified field from this date-time as an int.
    def get(field: TemporalField): Int = ???

    @stub
    // Gets the day-of-month field.
    def getDayOfMonth(): Int = ???

    @stub
    // Gets the day-of-week field, which is an enum DayOfWeek.
    def getDayOfWeek(): DayOfWeek = ???

    @stub
    // Gets the day-of-year field.
    def getDayOfYear(): Int = ???

    @stub
    // Gets the hour-of-day field.
    def getHour(): Int = ???

    @stub
    // Gets the value of the specified field from this date-time as a long.
    def getLong(field: TemporalField): Long = ???

    @stub
    // Gets the minute-of-hour field.
    def getMinute(): Int = ???

    @stub
    // Gets the month-of-year field using the Month enum.
    def getMonth(): Month = ???

    @stub
    // Gets the month-of-year field from 1 to 12.
    def getMonthValue(): Int = ???

    @stub
    // Gets the nano-of-second field.
    def getNano(): Int = ???

    @stub
    // Gets the second-of-minute field.
    def getSecond(): Int = ???

    @stub
    // Gets the year field.
    def getYear(): Int = ???

    @stub
    // A hash code for this date-time.
    def hashCode(): Int = ???

    @stub
    // Checks if this date-time is after the specified date-time.
    def isAfter(other: ChronoLocalDateTime[_]): Boolean = ???

    @stub
    // Checks if this date-time is before the specified date-time.
    def isBefore(other: ChronoLocalDateTime[_]): Boolean = ???

    @stub
    // Checks if this date-time is equal to the specified date-time.
    def isEqual(other: ChronoLocalDateTime[_]): Boolean = ???

    @stub
    // Checks if the specified field is supported.
    def isSupported(field: TemporalField): Boolean = ???

    @stub
    // Checks if the specified unit is supported.
    def isSupported(unit: TemporalUnit): Boolean = ???

    @stub
    // Returns a copy of this date-time with the specified amount subtracted.
    def minus(amountToSubtract: Long, unit: TemporalUnit): LocalDateTime = ???

    @stub
    // Returns a copy of this date-time with the specified amount subtracted.
    def minus(amountToSubtract: TemporalAmount): LocalDateTime = ???

    @stub
    // Returns a copy of this LocalDateTime with the specified number of days subtracted.
    def minusDays(days: Long): LocalDateTime = ???

    @stub
    // Returns a copy of this LocalDateTime with the specified number of hours subtracted.
    def minusHours(hours: Long): LocalDateTime = ???

    @stub
    // Returns a copy of this LocalDateTime with the specified number of minutes subtracted.
    def minusMinutes(minutes: Long): LocalDateTime = ???

    @stub
    // Returns a copy of this LocalDateTime with the specified number of months subtracted.
    def minusMonths(months: Long): LocalDateTime = ???

    @stub
    // Returns a copy of this LocalDateTime with the specified number of nanoseconds subtracted.
    def minusNanos(nanos: Long): LocalDateTime = ???

    @stub
    // Returns a copy of this LocalDateTime with the specified number of seconds subtracted.
    def minusSeconds(seconds: Long): LocalDateTime = ???

    @stub
    // Returns a copy of this LocalDateTime with the specified number of weeks subtracted.
    def minusWeeks(weeks: Long): LocalDateTime = ???

    @stub
    // Returns a copy of this LocalDateTime with the specified number of years subtracted.
    def minusYears(years: Long): LocalDateTime = ???

    @stub
    // Returns a copy of this date-time with the specified amount added.
    def plus(amountToAdd: Long, unit: TemporalUnit): LocalDateTime = ???

    @stub
    // Returns a copy of this date-time with the specified amount added.
    def plus(amountToAdd: TemporalAmount): LocalDateTime = ???

    @stub
    // Returns a copy of this LocalDateTime with the specified number of days added.
    def plusDays(days: Long): LocalDateTime = ???

    @stub
    // Returns a copy of this LocalDateTime with the specified number of hours added.
    def plusHours(hours: Long): LocalDateTime = ???

    @stub
    // Returns a copy of this LocalDateTime with the specified number of minutes added.
    def plusMinutes(minutes: Long): LocalDateTime = ???

    @stub
    // Returns a copy of this LocalDateTime with the specified number of months added.
    def plusMonths(months: Long): LocalDateTime = ???

    @stub
    // Returns a copy of this LocalDateTime with the specified number of nanoseconds added.
    def plusNanos(nanos: Long): LocalDateTime = ???

    @stub
    // Returns a copy of this LocalDateTime with the specified number of seconds added.
    def plusSeconds(seconds: Long): LocalDateTime = ???

    @stub
    // Returns a copy of this LocalDateTime with the specified number of weeks added.
    def plusWeeks(weeks: Long): LocalDateTime = ???

    @stub
    // Returns a copy of this LocalDateTime with the specified number of years added.
    def plusYears(years: Long): LocalDateTime = ???

    @stub
    // Queries this date-time using the specified query.
    def R: [R] = ???

    @stub
    // Gets the range of valid values for the specified field.
    def range(field: TemporalField): ValueRange = ???

    @stub
    // Gets the LocalDate part of this date-time.
    def toLocalDate(): LocalDate = ???

    @stub
    // Gets the LocalTime part of this date-time.
    def toLocalTime(): LocalTime = ???

    @stub
    // Outputs this date-time as a String, such as 2007-12-03T10:15:30.
    def toString(): String = ???

    @stub
    // Returns a copy of this LocalDateTime with the time truncated.
    def truncatedTo(unit: TemporalUnit): LocalDateTime = ???

    @stub
    // Calculates the amount of time until another date-time in terms of the specified unit.
    def until(endExclusive: Temporal, unit: TemporalUnit): Long = ???

    @stub
    // Returns an adjusted copy of this date-time.
    def with(adjuster: TemporalAdjuster): LocalDateTime = ???

    @stub
    // Returns a copy of this date-time with the specified field set to a new value.
    def with(field: TemporalField, newValue: Long): LocalDateTime = ???

    @stub
    // Returns a copy of this LocalDateTime with the day-of-month altered.
    def withDayOfMonth(dayOfMonth: Int): LocalDateTime = ???

    @stub
    // Returns a copy of this LocalDateTime with the day-of-year altered.
    def withDayOfYear(dayOfYear: Int): LocalDateTime = ???

    @stub
    // Returns a copy of this LocalDateTime with the hour-of-day altered.
    def withHour(hour: Int): LocalDateTime = ???

    @stub
    // Returns a copy of this LocalDateTime with the minute-of-hour altered.
    def withMinute(minute: Int): LocalDateTime = ???

    @stub
    // Returns a copy of this LocalDateTime with the month-of-year altered.
    def withMonth(month: Int): LocalDateTime = ???

    @stub
    // Returns a copy of this LocalDateTime with the nano-of-second altered.
    def withNano(nanoOfSecond: Int): LocalDateTime = ???

    @stub
    // Returns a copy of this LocalDateTime with the second-of-minute altered.
    def withSecond(second: Int): LocalDateTime = ???
}

object LocalDateTime {
    @stub
    // The maximum supported LocalDateTime, '+999999999-12-31T23:59:59.999999999'.
    def MAX: LocalDateTime = ???

    @stub
    // Obtains an instance of LocalDateTime from a temporal object.
    def from(temporal: TemporalAccessor): LocalDateTime = ???

    @stub
    // Obtains the current date-time from the system clock in the default time-zone.
    def now(): LocalDateTime = ???

    @stub
    // Obtains the current date-time from the specified clock.
    def now(clock: Clock): LocalDateTime = ???

    @stub
    // Obtains the current date-time from the system clock in the specified time-zone.
    def now(zone: ZoneId): LocalDateTime = ???

    @stub
    // Obtains an instance of LocalDateTime from year, month,
    // day, hour and minute, setting the second and nanosecond to zero.
    def of(year: Int, month: Int, dayOfMonth: Int, hour: Int, minute: Int): LocalDateTime = ???

    @stub
    // Obtains an instance of LocalDateTime from year, month,
    // day, hour, minute and second, setting the nanosecond to zero.
    def of(year: Int, month: Int, dayOfMonth: Int, hour: Int, minute: Int, second: Int): LocalDateTime = ???

    @stub
    // Obtains an instance of LocalDateTime from year, month,
    // day, hour, minute, second and nanosecond.
    def of(year: Int, month: Int, dayOfMonth: Int, hour: Int, minute: Int, second: Int, nanoOfSecond: Int): LocalDateTime = ???

    @stub
    // Obtains an instance of LocalDateTime from year, month,
    // day, hour and minute, setting the second and nanosecond to zero.
    def of(year: Int, month: Month, dayOfMonth: Int, hour: Int, minute: Int): LocalDateTime = ???

    @stub
    // Obtains an instance of LocalDateTime from year, month,
    // day, hour, minute and second, setting the nanosecond to zero.
    def of(year: Int, month: Month, dayOfMonth: Int, hour: Int, minute: Int, second: Int): LocalDateTime = ???

    @stub
    // Obtains an instance of LocalDateTime from year, month,
    // day, hour, minute, second and nanosecond.
    def of(year: Int, month: Month, dayOfMonth: Int, hour: Int, minute: Int, second: Int, nanoOfSecond: Int): LocalDateTime = ???

    @stub
    // Obtains an instance of LocalDateTime from a date and time.
    def of(date: LocalDate, time: LocalTime): LocalDateTime = ???

    @stub
    // Obtains an instance of LocalDateTime using seconds from the
    // epoch of 1970-01-01T00:00:00Z.
    def ofEpochSecond(epochSecond: Long, nanoOfSecond: Int, offset: ZoneOffset): LocalDateTime = ???

    @stub
    // Obtains an instance of LocalDateTime from an Instant and zone ID.
    def ofInstant(instant: Instant, zone: ZoneId): LocalDateTime = ???

    @stub
    // Obtains an instance of LocalDateTime from a text string such as 2007-12-03T10:15:30.
    def parse(text: CharSequence): LocalDateTime = ???

    @stub
    // Obtains an instance of LocalDateTime from a text string using a specific formatter.
    def parse(text: CharSequence, formatter: DateTimeFormatter): LocalDateTime = ???
}
