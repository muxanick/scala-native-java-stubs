package java.time

import java.io.Serializable
import java.lang.{CharSequence, Object, String}
import java.time.chrono.ChronoZonedDateTime
import java.time.format.DateTimeFormatter
import java.time.temporal.{Temporal, TemporalAccessor, TemporalAdjuster, TemporalAmount, TemporalField, TemporalQuery, TemporalUnit, ValueRange}

// A date-time with a time-zone in the ISO-8601 calendar system,
// such as 2007-12-03T10:15:30+01:00 Europe/Paris.
// 
// ZonedDateTime is an immutable representation of a date-time with a time-zone.
// This class stores all date and time fields, to a precision of nanoseconds,
// and a time-zone, with a zone offset used to handle ambiguous local date-times.
// For example, the value
// "2nd October 2007 at 13:45.30.123456789 +02:00 in the Europe/Paris time-zone"
// can be stored in a ZonedDateTime.
// 
// This class handles conversion from the local time-line of LocalDateTime
// to the instant time-line of Instant.
// The difference between the two time-lines is the offset from UTC/Greenwich,
// represented by a ZoneOffset.
// 
// Converting between the two time-lines involves calculating the offset using the
// rules accessed from the ZoneId.
// Obtaining the offset for an instant is simple, as there is exactly one valid
// offset for each instant. By contrast, obtaining the offset for a local date-time
// is not straightforward. There are three cases:
// 
// Normal, with one valid offset. For the vast majority of the year, the normal
//  case applies, where there is a single valid offset for the local date-time.
// Gap, with zero valid offsets. This is when clocks jump forward typically
//  due to the spring daylight savings change from "winter" to "summer".
//  In a gap there are local date-time values with no valid offset.
// Overlap, with two valid offsets. This is when clocks are set back typically
//  due to the autumn daylight savings change from "summer" to "winter".
//  In an overlap there are local date-time values with two valid offsets.
// 
// 
// Any method that converts directly or implicitly from a local date-time to an
// instant by obtaining the offset has the potential to be complicated.
// 
// For Gaps, the general strategy is that if the local date-time falls in the
// middle of a Gap, then the resulting zoned date-time will have a local date-time
// shifted forwards by the length of the Gap, resulting in a date-time in the later
// offset, typically "summer" time.
// 
// For Overlaps, the general strategy is that if the local date-time falls in the
// middle of an Overlap, then the previous offset will be retained. If there is no
// previous offset, or the previous offset is invalid, then the earlier offset is
// used, typically "summer" time.. Two additional methods,
// withEarlierOffsetAtOverlap() and withLaterOffsetAtOverlap(),
// help manage the case of an overlap.
// 
// In terms of design, this class should be viewed primarily as the combination
// of a LocalDateTime and a ZoneId. The ZoneOffset is
// a vital, but secondary, piece of information, used to ensure that the class
// represents an instant, especially during a daylight savings overlap.
//
// 
// This is a value-based
// class; use of identity-sensitive operations (including reference equality
// (==), identity hash code, or synchronization) on instances of
// ZonedDateTime may have unpredictable results and should be avoided.
// The equals method should be used for comparisons.
final class ZonedDateTime extends Object with Temporal, with ChronoZonedDateTime[LocalDate], with Serializable {

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
    // Gets the time-zone, such as 'Europe/Paris'.
    def getZone(): ZoneId = ???

    @stub
    // A hash code for this date-time.
    def hashCode(): Int = ???

    @stub
    // Checks if the specified field is supported.
    def isSupported(field: TemporalField): Boolean = ???

    @stub
    // Checks if the specified unit is supported.
    def isSupported(unit: TemporalUnit): Boolean = ???

    @stub
    // Returns a copy of this date-time with the specified amount subtracted.
    def minus(amountToSubtract: Long, unit: TemporalUnit): ZonedDateTime = ???

    @stub
    // Returns a copy of this date-time with the specified amount subtracted.
    def minus(amountToSubtract: TemporalAmount): ZonedDateTime = ???

    @stub
    // Returns a copy of this ZonedDateTime with the specified number of days subtracted.
    def minusDays(days: Long): ZonedDateTime = ???

    @stub
    // Returns a copy of this ZonedDateTime with the specified number of hours subtracted.
    def minusHours(hours: Long): ZonedDateTime = ???

    @stub
    // Returns a copy of this ZonedDateTime with the specified number of minutes subtracted.
    def minusMinutes(minutes: Long): ZonedDateTime = ???

    @stub
    // Returns a copy of this ZonedDateTime with the specified number of months subtracted.
    def minusMonths(months: Long): ZonedDateTime = ???

    @stub
    // Returns a copy of this ZonedDateTime with the specified number of nanoseconds subtracted.
    def minusNanos(nanos: Long): ZonedDateTime = ???

    @stub
    // Returns a copy of this ZonedDateTime with the specified number of seconds subtracted.
    def minusSeconds(seconds: Long): ZonedDateTime = ???

    @stub
    // Returns a copy of this ZonedDateTime with the specified number of weeks subtracted.
    def minusWeeks(weeks: Long): ZonedDateTime = ???

    @stub
    // Returns a copy of this ZonedDateTime with the specified number of years subtracted.
    def minusYears(years: Long): ZonedDateTime = ???

    @stub
    // Returns a copy of this date-time with the specified amount added.
    def plus(amountToAdd: Long, unit: TemporalUnit): ZonedDateTime = ???

    @stub
    // Returns a copy of this date-time with the specified amount added.
    def plus(amountToAdd: TemporalAmount): ZonedDateTime = ???

    @stub
    // Returns a copy of this ZonedDateTime with the specified number of days added.
    def plusDays(days: Long): ZonedDateTime = ???

    @stub
    // Returns a copy of this ZonedDateTime with the specified number of hours added.
    def plusHours(hours: Long): ZonedDateTime = ???

    @stub
    // Returns a copy of this ZonedDateTime with the specified number of minutes added.
    def plusMinutes(minutes: Long): ZonedDateTime = ???

    @stub
    // Returns a copy of this ZonedDateTime with the specified number of months added.
    def plusMonths(months: Long): ZonedDateTime = ???

    @stub
    // Returns a copy of this ZonedDateTime with the specified number of nanoseconds added.
    def plusNanos(nanos: Long): ZonedDateTime = ???

    @stub
    // Returns a copy of this ZonedDateTime with the specified number of seconds added.
    def plusSeconds(seconds: Long): ZonedDateTime = ???

    @stub
    // Returns a copy of this ZonedDateTime with the specified number of weeks added.
    def plusWeeks(weeks: Long): ZonedDateTime = ???

    @stub
    // Returns a copy of this ZonedDateTime with the specified number of years added.
    def plusYears(years: Long): ZonedDateTime = ???

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
    // Gets the LocalDateTime part of this date-time.
    def toLocalDateTime(): LocalDateTime = ???

    @stub
    // Gets the LocalTime part of this date-time.
    def toLocalTime(): LocalTime = ???

    @stub
    // Converts this date-time to an OffsetDateTime.
    def toOffsetDateTime(): OffsetDateTime = ???

    @stub
    // Outputs this date-time as a String, such as
    // 2007-12-03T10:15:30+01:00[Europe/Paris].
    def toString(): String = ???

    @stub
    // Returns a copy of this ZonedDateTime with the time truncated.
    def truncatedTo(unit: TemporalUnit): ZonedDateTime = ???

    @stub
    // Calculates the amount of time until another date-time in terms of the specified unit.
    def until(endExclusive: Temporal, unit: TemporalUnit): Long = ???

    @stub
    // Returns an adjusted copy of this date-time.
    def with(adjuster: TemporalAdjuster): ZonedDateTime = ???

    @stub
    // Returns a copy of this date-time with the specified field set to a new value.
    def with(field: TemporalField, newValue: Long): ZonedDateTime = ???

    @stub
    // Returns a copy of this ZonedDateTime with the day-of-month altered.
    def withDayOfMonth(dayOfMonth: Int): ZonedDateTime = ???

    @stub
    // Returns a copy of this ZonedDateTime with the day-of-year altered.
    def withDayOfYear(dayOfYear: Int): ZonedDateTime = ???

    @stub
    // Returns a copy of this date-time changing the zone offset to the
    // earlier of the two valid offsets at a local time-line overlap.
    def withEarlierOffsetAtOverlap(): ZonedDateTime = ???

    @stub
    // Returns a copy of this date-time with the zone ID set to the offset.
    def withFixedOffsetZone(): ZonedDateTime = ???

    @stub
    // Returns a copy of this ZonedDateTime with the hour-of-day altered.
    def withHour(hour: Int): ZonedDateTime = ???

    @stub
    // Returns a copy of this date-time changing the zone offset to the
    // later of the two valid offsets at a local time-line overlap.
    def withLaterOffsetAtOverlap(): ZonedDateTime = ???

    @stub
    // Returns a copy of this ZonedDateTime with the minute-of-hour altered.
    def withMinute(minute: Int): ZonedDateTime = ???

    @stub
    // Returns a copy of this ZonedDateTime with the month-of-year altered.
    def withMonth(month: Int): ZonedDateTime = ???

    @stub
    // Returns a copy of this ZonedDateTime with the nano-of-second altered.
    def withNano(nanoOfSecond: Int): ZonedDateTime = ???

    @stub
    // Returns a copy of this ZonedDateTime with the second-of-minute altered.
    def withSecond(second: Int): ZonedDateTime = ???

    @stub
    // Returns a copy of this ZonedDateTime with the year altered.
    def withYear(year: Int): ZonedDateTime = ???

    @stub
    // Returns a copy of this date-time with a different time-zone,
    // retaining the instant.
    def withZoneSameInstant(zone: ZoneId): ZonedDateTime = ???
}

object ZonedDateTime {
    @stub
    // Obtains an instance of ZonedDateTime from a temporal object.
    def from(temporal: TemporalAccessor): ZonedDateTime = ???

    @stub
    // Obtains the current date-time from the system clock in the default time-zone.
    def now(): ZonedDateTime = ???

    @stub
    // Obtains the current date-time from the specified clock.
    def now(clock: Clock): ZonedDateTime = ???

    @stub
    // Obtains the current date-time from the system clock in the specified time-zone.
    def now(zone: ZoneId): ZonedDateTime = ???

    @stub
    // Obtains an instance of ZonedDateTime from a year, month, day,
    // hour, minute, second, nanosecond and time-zone.
    def of(year: Int, month: Int, dayOfMonth: Int, hour: Int, minute: Int, second: Int, nanoOfSecond: Int, zone: ZoneId): ZonedDateTime = ???

    @stub
    // Obtains an instance of ZonedDateTime from a local date and time.
    def of(date: LocalDate, time: LocalTime, zone: ZoneId): ZonedDateTime = ???

    @stub
    // Obtains an instance of ZonedDateTime from a local date-time.
    def of(localDateTime: LocalDateTime, zone: ZoneId): ZonedDateTime = ???

    @stub
    // Obtains an instance of ZonedDateTime from an Instant.
    def ofInstant(instant: Instant, zone: ZoneId): ZonedDateTime = ???

    @stub
    // Obtains an instance of ZonedDateTime from the instant formed by combining
    // the local date-time and offset.
    def ofInstant(localDateTime: LocalDateTime, offset: ZoneOffset, zone: ZoneId): ZonedDateTime = ???

    @stub
    // Obtains an instance of ZonedDateTime from a local date-time
    // using the preferred offset if possible.
    def ofLocal(localDateTime: LocalDateTime, zone: ZoneId, preferredOffset: ZoneOffset): ZonedDateTime = ???

    @stub
    // Obtains an instance of ZonedDateTime strictly validating the
    // combination of local date-time, offset and zone ID.
    def ofStrict(localDateTime: LocalDateTime, offset: ZoneOffset, zone: ZoneId): ZonedDateTime = ???

    @stub
    // Obtains an instance of ZonedDateTime from a text string such as
    // 2007-12-03T10:15:30+01:00[Europe/Paris].
    def parse(text: CharSequence): ZonedDateTime = ???

    @stub
    // Obtains an instance of ZonedDateTime from a text string using a specific formatter.
    def parse(text: CharSequence, formatter: DateTimeFormatter): ZonedDateTime = ???
}
