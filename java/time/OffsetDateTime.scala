package java.time

import java.io.Serializable
import java.lang.{CharSequence, Comparable, Object, String}
import java.time.format.DateTimeFormatter
import java.time.temporal.{Temporal, TemporalAccessor, TemporalAdjuster, TemporalAmount, TemporalField, TemporalQuery, TemporalUnit, ValueRange}
import java.util.Comparator

// A date-time with an offset from UTC/Greenwich in the ISO-8601 calendar system,
// such as 2007-12-03T10:15:30+01:00.
// 
// OffsetDateTime is an immutable representation of a date-time with an offset.
// This class stores all date and time fields, to a precision of nanoseconds,
// as well as the offset from UTC/Greenwich. For example, the value
// "2nd October 2007 at 13:45.30.123456789 +02:00" can be stored in an OffsetDateTime.
// 
// OffsetDateTime, ZonedDateTime and Instant all store an instant
// on the time-line to nanosecond precision.
// Instant is the simplest, simply representing the instant.
// OffsetDateTime adds to the instant the offset from UTC/Greenwich, which allows
// the local date-time to be obtained.
// ZonedDateTime adds full time-zone rules.
// 
// It is intended that ZonedDateTime or Instant is used to model data
// in simpler applications. This class may be used when modeling date-time concepts in
// more detail, or when communicating to a database or in a network protocol.
//
// 
// This is a value-based
// class; use of identity-sensitive operations (including reference equality
// (==), identity hash code, or synchronization) on instances of
// OffsetDateTime may have unpredictable results and should be avoided.
// The equals method should be used for comparisons.
final class OffsetDateTime extends Object with Temporal, with TemporalAdjuster, with Comparable[OffsetDateTime], with Serializable {

    @stub
    // Adjusts the specified temporal object to have the same offset, date
    // and time as this object.
    def adjustInto(temporal: Temporal): Temporal = ???

    @stub
    // Combines this date-time with a time-zone to create a ZonedDateTime
    // ensuring that the result has the same instant.
    def atZoneSameInstant(zone: ZoneId): ZonedDateTime = ???

    @stub
    // Combines this date-time with a time-zone to create a ZonedDateTime
    // trying to keep the same local date and time.
    def atZoneSimilarLocal(zone: ZoneId): ZonedDateTime = ???

    @stub
    // Compares this date-time to another date-time.
    def compareTo(other: OffsetDateTime): Int = ???

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
    // Gets the zone offset, such as '+01:00'.
    def getOffset(): ZoneOffset = ???

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
    // Checks if the instant of this date-time is after that of the specified date-time.
    def isAfter(other: OffsetDateTime): Boolean = ???

    @stub
    // Checks if the instant of this date-time is before that of the specified date-time.
    def isBefore(other: OffsetDateTime): Boolean = ???

    @stub
    // Checks if the instant of this date-time is equal to that of the specified date-time.
    def isEqual(other: OffsetDateTime): Boolean = ???

    @stub
    // Checks if the specified field is supported.
    def isSupported(field: TemporalField): Boolean = ???

    @stub
    // Checks if the specified unit is supported.
    def isSupported(unit: TemporalUnit): Boolean = ???

    @stub
    // Returns a copy of this date-time with the specified amount subtracted.
    def minus(amountToSubtract: Long, unit: TemporalUnit): OffsetDateTime = ???

    @stub
    // Returns a copy of this date-time with the specified amount subtracted.
    def minus(amountToSubtract: TemporalAmount): OffsetDateTime = ???

    @stub
    // Returns a copy of this OffsetDateTime with the specified number of days subtracted.
    def minusDays(days: Long): OffsetDateTime = ???

    @stub
    // Returns a copy of this OffsetDateTime with the specified number of hours subtracted.
    def minusHours(hours: Long): OffsetDateTime = ???

    @stub
    // Returns a copy of this OffsetDateTime with the specified number of minutes subtracted.
    def minusMinutes(minutes: Long): OffsetDateTime = ???

    @stub
    // Returns a copy of this OffsetDateTime with the specified number of months subtracted.
    def minusMonths(months: Long): OffsetDateTime = ???

    @stub
    // Returns a copy of this OffsetDateTime with the specified number of nanoseconds subtracted.
    def minusNanos(nanos: Long): OffsetDateTime = ???

    @stub
    // Returns a copy of this OffsetDateTime with the specified number of seconds subtracted.
    def minusSeconds(seconds: Long): OffsetDateTime = ???

    @stub
    // Returns a copy of this OffsetDateTime with the specified number of weeks subtracted.
    def minusWeeks(weeks: Long): OffsetDateTime = ???

    @stub
    // Returns a copy of this OffsetDateTime with the specified number of years subtracted.
    def minusYears(years: Long): OffsetDateTime = ???

    @stub
    // Returns a copy of this date-time with the specified amount added.
    def plus(amountToAdd: Long, unit: TemporalUnit): OffsetDateTime = ???

    @stub
    // Returns a copy of this date-time with the specified amount added.
    def plus(amountToAdd: TemporalAmount): OffsetDateTime = ???

    @stub
    // Returns a copy of this OffsetDateTime with the specified number of days added.
    def plusDays(days: Long): OffsetDateTime = ???

    @stub
    // Returns a copy of this OffsetDateTime with the specified number of hours added.
    def plusHours(hours: Long): OffsetDateTime = ???

    @stub
    // Returns a copy of this OffsetDateTime with the specified number of minutes added.
    def plusMinutes(minutes: Long): OffsetDateTime = ???

    @stub
    // Returns a copy of this OffsetDateTime with the specified number of months added.
    def plusMonths(months: Long): OffsetDateTime = ???

    @stub
    // Returns a copy of this OffsetDateTime with the specified number of nanoseconds added.
    def plusNanos(nanos: Long): OffsetDateTime = ???

    @stub
    // Returns a copy of this OffsetDateTime with the specified number of seconds added.
    def plusSeconds(seconds: Long): OffsetDateTime = ???

    @stub
    // Returns a copy of this OffsetDateTime with the specified number of weeks added.
    def plusWeeks(weeks: Long): OffsetDateTime = ???

    @stub
    // Returns a copy of this OffsetDateTime with the specified number of years added.
    def plusYears(years: Long): OffsetDateTime = ???

    @stub
    // Queries this date-time using the specified query.
    def R: [R] = ???

    @stub
    // Gets the range of valid values for the specified field.
    def range(field: TemporalField): ValueRange = ???

    @stub
    // Converts this date-time to the number of seconds from the epoch of 1970-01-01T00:00:00Z.
    def toEpochSecond(): Long = ???

    @stub
    // Converts this date-time to an Instant.
    def toInstant(): Instant = ???

    @stub
    // Gets the LocalDate part of this date-time.
    def toLocalDate(): LocalDate = ???

    @stub
    // Gets the LocalDateTime part of this date-time.
    def toLocalDateTime(): LocalDateTime = ???

    @stub
    // Gets the LocalTime part of this date-time.
    def toLocalTime(): LocalTime = ???

    @stub
    // Converts this date-time to an OffsetTime.
    def toOffsetTime(): OffsetTime = ???

    @stub
    // Outputs this date-time as a String, such as 2007-12-03T10:15:30+01:00.
    def toString(): String = ???

    @stub
    // Converts this date-time to a ZonedDateTime using the offset as the zone ID.
    def toZonedDateTime(): ZonedDateTime = ???

    @stub
    // Returns a copy of this OffsetDateTime with the time truncated.
    def truncatedTo(unit: TemporalUnit): OffsetDateTime = ???

    @stub
    // Calculates the amount of time until another date-time in terms of the specified unit.
    def until(endExclusive: Temporal, unit: TemporalUnit): Long = ???

    @stub
    // Returns an adjusted copy of this date-time.
    def with(adjuster: TemporalAdjuster): OffsetDateTime = ???

    @stub
    // Returns a copy of this date-time with the specified field set to a new value.
    def with(field: TemporalField, newValue: Long): OffsetDateTime = ???

    @stub
    // Returns a copy of this OffsetDateTime with the day-of-month altered.
    def withDayOfMonth(dayOfMonth: Int): OffsetDateTime = ???

    @stub
    // Returns a copy of this OffsetDateTime with the day-of-year altered.
    def withDayOfYear(dayOfYear: Int): OffsetDateTime = ???

    @stub
    // Returns a copy of this OffsetDateTime with the hour-of-day altered.
    def withHour(hour: Int): OffsetDateTime = ???

    @stub
    // Returns a copy of this OffsetDateTime with the minute-of-hour altered.
    def withMinute(minute: Int): OffsetDateTime = ???

    @stub
    // Returns a copy of this OffsetDateTime with the month-of-year altered.
    def withMonth(month: Int): OffsetDateTime = ???

    @stub
    // Returns a copy of this OffsetDateTime with the nano-of-second altered.
    def withNano(nanoOfSecond: Int): OffsetDateTime = ???

    @stub
    // Returns a copy of this OffsetDateTime with the specified offset ensuring
    // that the result is at the same instant.
    def withOffsetSameInstant(offset: ZoneOffset): OffsetDateTime = ???

    @stub
    // Returns a copy of this OffsetDateTime with the specified offset ensuring
    // that the result has the same local date-time.
    def withOffsetSameLocal(offset: ZoneOffset): OffsetDateTime = ???

    @stub
    // Returns a copy of this OffsetDateTime with the second-of-minute altered.
    def withSecond(second: Int): OffsetDateTime = ???
}

object OffsetDateTime {
    @stub
    // The maximum supported OffsetDateTime, '+999999999-12-31T23:59:59.999999999-18:00'.
    def MAX: OffsetDateTime = ???

    @stub
    // Obtains an instance of OffsetDateTime from a temporal object.
    def from(temporal: TemporalAccessor): OffsetDateTime = ???

    @stub
    // Obtains the current date-time from the system clock in the default time-zone.
    def now(): OffsetDateTime = ???

    @stub
    // Obtains the current date-time from the specified clock.
    def now(clock: Clock): OffsetDateTime = ???

    @stub
    // Obtains the current date-time from the system clock in the specified time-zone.
    def now(zone: ZoneId): OffsetDateTime = ???

    @stub
    // Obtains an instance of OffsetDateTime from a year, month, day,
    // hour, minute, second, nanosecond and offset.
    def of(year: Int, month: Int, dayOfMonth: Int, hour: Int, minute: Int, second: Int, nanoOfSecond: Int, offset: ZoneOffset): OffsetDateTime = ???

    @stub
    // Obtains an instance of OffsetDateTime from a date, time and offset.
    def of(date: LocalDate, time: LocalTime, offset: ZoneOffset): OffsetDateTime = ???

    @stub
    // Obtains an instance of OffsetDateTime from a date-time and offset.
    def of(dateTime: LocalDateTime, offset: ZoneOffset): OffsetDateTime = ???

    @stub
    // Obtains an instance of OffsetDateTime from an Instant and zone ID.
    def ofInstant(instant: Instant, zone: ZoneId): OffsetDateTime = ???

    @stub
    // Obtains an instance of OffsetDateTime from a text string
    // such as 2007-12-03T10:15:30+01:00.
    def parse(text: CharSequence): OffsetDateTime = ???

    @stub
    // Obtains an instance of OffsetDateTime from a text string using a specific formatter.
    def parse(text: CharSequence, formatter: DateTimeFormatter): OffsetDateTime = ???

    @stub
    // Gets a comparator that compares two OffsetDateTime instances
    // based solely on the instant.
    def timeLineOrder(): Comparator[OffsetDateTime] = ???
}
