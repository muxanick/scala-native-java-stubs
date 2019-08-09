package java.time

import java.io.Serializable
import java.lang.{CharSequence, Object, String}
import java.time.chrono.ChronoZonedDateTime
import java.time.format.DateTimeFormatter
import java.time.temporal.{Temporal, TemporalAccessor, TemporalAdjuster, TemporalAmount, TemporalField, TemporalQuery, TemporalUnit, ValueRange}
import scala.scalanative.annotation.stub

/** A date-time with a time-zone in the ISO-8601 calendar system,
 *  such as 2007-12-03T10:15:30+01:00 Europe/Paris.
 *  
 *  ZonedDateTime is an immutable representation of a date-time with a time-zone.
 *  This class stores all date and time fields, to a precision of nanoseconds,
 *  and a time-zone, with a zone offset used to handle ambiguous local date-times.
 *  For example, the value
 *  "2nd October 2007 at 13:45.30.123456789 +02:00 in the Europe/Paris time-zone"
 *  can be stored in a ZonedDateTime.
 *  
 *  This class handles conversion from the local time-line of LocalDateTime
 *  to the instant time-line of Instant.
 *  The difference between the two time-lines is the offset from UTC/Greenwich,
 *  represented by a ZoneOffset.
 *  
 *  Converting between the two time-lines involves calculating the offset using the
 *  rules accessed from the ZoneId.
 *  Obtaining the offset for an instant is simple, as there is exactly one valid
 *  offset for each instant. By contrast, obtaining the offset for a local date-time
 *  is not straightforward. There are three cases:
 *  
 *  Normal, with one valid offset. For the vast majority of the year, the normal
 *   case applies, where there is a single valid offset for the local date-time.
 *  Gap, with zero valid offsets. This is when clocks jump forward typically
 *   due to the spring daylight savings change from "winter" to "summer".
 *   In a gap there are local date-time values with no valid offset.
 *  Overlap, with two valid offsets. This is when clocks are set back typically
 *   due to the autumn daylight savings change from "summer" to "winter".
 *   In an overlap there are local date-time values with two valid offsets.
 *  
 *  
 *  Any method that converts directly or implicitly from a local date-time to an
 *  instant by obtaining the offset has the potential to be complicated.
 *  
 *  For Gaps, the general strategy is that if the local date-time falls in the
 *  middle of a Gap, then the resulting zoned date-time will have a local date-time
 *  shifted forwards by the length of the Gap, resulting in a date-time in the later
 *  offset, typically "summer" time.
 *  
 *  For Overlaps, the general strategy is that if the local date-time falls in the
 *  middle of an Overlap, then the previous offset will be retained. If there is no
 *  previous offset, or the previous offset is invalid, then the earlier offset is
 *  used, typically "summer" time.. Two additional methods,
 *  withEarlierOffsetAtOverlap() and withLaterOffsetAtOverlap(),
 *  help manage the case of an overlap.
 *  
 *  In terms of design, this class should be viewed primarily as the combination
 *  of a LocalDateTime and a ZoneId. The ZoneOffset is
 *  a vital, but secondary, piece of information, used to ensure that the class
 *  represents an instant, especially during a daylight savings overlap.
 * 
 *  
 *  This is a value-based
 *  class; use of identity-sensitive operations (including reference equality
 *  (==), identity hash code, or synchronization) on instances of
 *  ZonedDateTime may have unpredictable results and should be avoided.
 *  The equals method should be used for comparisons.
 */
final class ZonedDateTime extends Object with Temporal with ChronoZonedDateTime[LocalDate] with Serializable {

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

    /** Gets the zone offset, such as '+01:00'. */
    @stub
    def getOffset(): ZoneOffset = ???

    /** Gets the second-of-minute field. */
    @stub
    def getSecond(): Int = ???

    /** Gets the year field. */
    @stub
    def getYear(): Int = ???

    /** Gets the time-zone, such as 'Europe/Paris'. */
    @stub
    def getZone(): ZoneId = ???

    /** A hash code for this date-time. */
    @stub
    def hashCode(): Int = ???

    /** Checks if the specified field is supported. */
    @stub
    def isSupported(field: TemporalField): Boolean = ???

    /** Checks if the specified unit is supported. */
    @stub
    def isSupported(unit: TemporalUnit): Boolean = ???

    /** Returns a copy of this date-time with the specified amount subtracted. */
    @stub
    def minus(amountToSubtract: Long, unit: TemporalUnit): ZonedDateTime = ???

    /** Returns a copy of this date-time with the specified amount subtracted. */
    @stub
    def minus(amountToSubtract: TemporalAmount): ZonedDateTime = ???

    /** Returns a copy of this ZonedDateTime with the specified number of days subtracted. */
    @stub
    def minusDays(days: Long): ZonedDateTime = ???

    /** Returns a copy of this ZonedDateTime with the specified number of hours subtracted. */
    @stub
    def minusHours(hours: Long): ZonedDateTime = ???

    /** Returns a copy of this ZonedDateTime with the specified number of minutes subtracted. */
    @stub
    def minusMinutes(minutes: Long): ZonedDateTime = ???

    /** Returns a copy of this ZonedDateTime with the specified number of months subtracted. */
    @stub
    def minusMonths(months: Long): ZonedDateTime = ???

    /** Returns a copy of this ZonedDateTime with the specified number of nanoseconds subtracted. */
    @stub
    def minusNanos(nanos: Long): ZonedDateTime = ???

    /** Returns a copy of this ZonedDateTime with the specified number of seconds subtracted. */
    @stub
    def minusSeconds(seconds: Long): ZonedDateTime = ???

    /** Returns a copy of this ZonedDateTime with the specified number of weeks subtracted. */
    @stub
    def minusWeeks(weeks: Long): ZonedDateTime = ???

    /** Returns a copy of this ZonedDateTime with the specified number of years subtracted. */
    @stub
    def minusYears(years: Long): ZonedDateTime = ???

    /** Returns a copy of this date-time with the specified amount added. */
    @stub
    def plus(amountToAdd: Long, unit: TemporalUnit): ZonedDateTime = ???

    /** Returns a copy of this date-time with the specified amount added. */
    @stub
    def plus(amountToAdd: TemporalAmount): ZonedDateTime = ???

    /** Returns a copy of this ZonedDateTime with the specified number of days added. */
    @stub
    def plusDays(days: Long): ZonedDateTime = ???

    /** Returns a copy of this ZonedDateTime with the specified number of hours added. */
    @stub
    def plusHours(hours: Long): ZonedDateTime = ???

    /** Returns a copy of this ZonedDateTime with the specified number of minutes added. */
    @stub
    def plusMinutes(minutes: Long): ZonedDateTime = ???

    /** Returns a copy of this ZonedDateTime with the specified number of months added. */
    @stub
    def plusMonths(months: Long): ZonedDateTime = ???

    /** Returns a copy of this ZonedDateTime with the specified number of nanoseconds added. */
    @stub
    def plusNanos(nanos: Long): ZonedDateTime = ???

    /** Returns a copy of this ZonedDateTime with the specified number of seconds added. */
    @stub
    def plusSeconds(seconds: Long): ZonedDateTime = ???

    /** Returns a copy of this ZonedDateTime with the specified number of weeks added. */
    @stub
    def plusWeeks(weeks: Long): ZonedDateTime = ???

    /** Returns a copy of this ZonedDateTime with the specified number of years added. */
    @stub
    def plusYears(years: Long): ZonedDateTime = ???

    /** Queries this date-time using the specified query. */
    @stub
    def query[R](query: TemporalQuery[R]): R = ???

    /** Gets the range of valid values for the specified field. */
    @stub
    def range(field: TemporalField): ValueRange = ???

    /** Gets the LocalDate part of this date-time. */
    @stub
    def toLocalDate(): LocalDate = ???

    /** Gets the LocalDateTime part of this date-time. */
    @stub
    def toLocalDateTime(): LocalDateTime = ???

    /** Gets the LocalTime part of this date-time. */
    @stub
    def toLocalTime(): LocalTime = ???

    /** Converts this date-time to an OffsetDateTime. */
    @stub
    def toOffsetDateTime(): OffsetDateTime = ???

    /** Outputs this date-time as a String, such as
     *  2007-12-03T10:15:30+01:00[Europe/Paris].
     */
    @stub
    def toString(): String = ???

    /** Returns a copy of this ZonedDateTime with the time truncated. */
    @stub
    def truncatedTo(unit: TemporalUnit): ZonedDateTime = ???

    /** Calculates the amount of time until another date-time in terms of the specified unit. */
    @stub
    def until(endExclusive: Temporal, unit: TemporalUnit): Long = ???

    /** Returns an adjusted copy of this date-time. */
    @stub
    def with(adjuster: TemporalAdjuster): ZonedDateTime = ???

    /** Returns a copy of this date-time with the specified field set to a new value. */
    @stub
    def with(field: TemporalField, newValue: Long): ZonedDateTime = ???

    /** Returns a copy of this ZonedDateTime with the day-of-month altered. */
    @stub
    def withDayOfMonth(dayOfMonth: Int): ZonedDateTime = ???

    /** Returns a copy of this ZonedDateTime with the day-of-year altered. */
    @stub
    def withDayOfYear(dayOfYear: Int): ZonedDateTime = ???

    /** Returns a copy of this date-time changing the zone offset to the
     *  earlier of the two valid offsets at a local time-line overlap.
     */
    @stub
    def withEarlierOffsetAtOverlap(): ZonedDateTime = ???

    /** Returns a copy of this date-time with the zone ID set to the offset. */
    @stub
    def withFixedOffsetZone(): ZonedDateTime = ???

    /** Returns a copy of this ZonedDateTime with the hour-of-day altered. */
    @stub
    def withHour(hour: Int): ZonedDateTime = ???

    /** Returns a copy of this date-time changing the zone offset to the
     *  later of the two valid offsets at a local time-line overlap.
     */
    @stub
    def withLaterOffsetAtOverlap(): ZonedDateTime = ???

    /** Returns a copy of this ZonedDateTime with the minute-of-hour altered. */
    @stub
    def withMinute(minute: Int): ZonedDateTime = ???

    /** Returns a copy of this ZonedDateTime with the month-of-year altered. */
    @stub
    def withMonth(month: Int): ZonedDateTime = ???

    /** Returns a copy of this ZonedDateTime with the nano-of-second altered. */
    @stub
    def withNano(nanoOfSecond: Int): ZonedDateTime = ???

    /** Returns a copy of this ZonedDateTime with the second-of-minute altered. */
    @stub
    def withSecond(second: Int): ZonedDateTime = ???

    /** Returns a copy of this ZonedDateTime with the year altered. */
    @stub
    def withYear(year: Int): ZonedDateTime = ???

    /** Returns a copy of this date-time with a different time-zone,
     *  retaining the instant.
     */
    @stub
    def withZoneSameInstant(zone: ZoneId): ZonedDateTime = ???

    /** Returns a copy of this date-time with a different time-zone,
     *  retaining the local date-time if possible.
     */
    @stub
    def withZoneSameLocal(zone: ZoneId): ZonedDateTime = ???
}

object ZonedDateTime {
    /** Obtains an instance of ZonedDateTime from a temporal object. */
    @stub
    def from(temporal: TemporalAccessor): ZonedDateTime = ???

    /** Obtains the current date-time from the system clock in the default time-zone. */
    @stub
    def now(): ZonedDateTime = ???

    /** Obtains the current date-time from the specified clock. */
    @stub
    def now(clock: Clock): ZonedDateTime = ???

    /** Obtains the current date-time from the system clock in the specified time-zone. */
    @stub
    def now(zone: ZoneId): ZonedDateTime = ???

    /** Obtains an instance of ZonedDateTime from a year, month, day,
     *  hour, minute, second, nanosecond and time-zone.
     */
    @stub
    def of(year: Int, month: Int, dayOfMonth: Int, hour: Int, minute: Int, second: Int, nanoOfSecond: Int, zone: ZoneId): ZonedDateTime = ???

    /** Obtains an instance of ZonedDateTime from a local date and time. */
    @stub
    def of(date: LocalDate, time: LocalTime, zone: ZoneId): ZonedDateTime = ???

    /** Obtains an instance of ZonedDateTime from a local date-time. */
    @stub
    def of(localDateTime: LocalDateTime, zone: ZoneId): ZonedDateTime = ???

    /** Obtains an instance of ZonedDateTime from an Instant. */
    @stub
    def ofInstant(instant: Instant, zone: ZoneId): ZonedDateTime = ???

    /** Obtains an instance of ZonedDateTime from the instant formed by combining
     *  the local date-time and offset.
     */
    @stub
    def ofInstant(localDateTime: LocalDateTime, offset: ZoneOffset, zone: ZoneId): ZonedDateTime = ???

    /** Obtains an instance of ZonedDateTime from a local date-time
     *  using the preferred offset if possible.
     */
    @stub
    def ofLocal(localDateTime: LocalDateTime, zone: ZoneId, preferredOffset: ZoneOffset): ZonedDateTime = ???

    /** Obtains an instance of ZonedDateTime strictly validating the
     *  combination of local date-time, offset and zone ID.
     */
    @stub
    def ofStrict(localDateTime: LocalDateTime, offset: ZoneOffset, zone: ZoneId): ZonedDateTime = ???

    /** Obtains an instance of ZonedDateTime from a text string such as
     *  2007-12-03T10:15:30+01:00[Europe/Paris].
     */
    @stub
    def parse(text: CharSequence): ZonedDateTime = ???

    /** Obtains an instance of ZonedDateTime from a text string using a specific formatter. */
    @stub
    def parse(text: CharSequence, formatter: DateTimeFormatter): ZonedDateTime = ???
}
