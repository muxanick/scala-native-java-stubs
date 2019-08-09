package java.time

import java.io.Serializable
import java.lang.{CharSequence, Object, String}
import java.time.chrono.{ChronoLocalDate, Era, IsoChronology}
import java.time.format.DateTimeFormatter
import java.time.temporal.{Temporal, TemporalAccessor, TemporalAdjuster, TemporalAmount, TemporalField, TemporalQuery, TemporalUnit, ValueRange}

/** A date without a time-zone in the ISO-8601 calendar system,
 *  such as 2007-12-03.
 *  
 *  LocalDate is an immutable date-time object that represents a date,
 *  often viewed as year-month-day. Other date fields, such as day-of-year,
 *  day-of-week and week-of-year, can also be accessed.
 *  For example, the value "2nd October 2007" can be stored in a LocalDate.
 *  
 *  This class does not store or represent a time or time-zone.
 *  Instead, it is a description of the date, as used for birthdays.
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
 *  LocalDate may have unpredictable results and should be avoided.
 *  The equals method should be used for comparisons.
 */
final class LocalDate extends Object with Temporal with TemporalAdjuster with ChronoLocalDate with Serializable {

    /** Adjusts the specified temporal object to have the same date as this object. */
    @stub
    def adjustInto(temporal: Temporal): Temporal = ???

    /** Combines this date with the time of midnight to create a LocalDateTime
     *  at the start of this date.
     */
    @stub
    def atStartOfDay(): LocalDateTime = ???

    /** Returns a zoned date-time from this date at the earliest valid time according
     *  to the rules in the time-zone.
     */
    @stub
    def atStartOfDay(zone: ZoneId): ZonedDateTime = ???

    /** Combines this date with a time to create a LocalDateTime. */
    @stub
    def atTime(hour: Int, minute: Int): LocalDateTime = ???

    /** Combines this date with a time to create a LocalDateTime. */
    @stub
    def atTime(hour: Int, minute: Int, second: Int): LocalDateTime = ???

    /** Combines this date with a time to create a LocalDateTime. */
    @stub
    def atTime(hour: Int, minute: Int, second: Int, nanoOfSecond: Int): LocalDateTime = ???

    /** Combines this date with a time to create a LocalDateTime. */
    @stub
    def atTime(time: LocalTime): LocalDateTime = ???

    /** Combines this date with an offset time to create an OffsetDateTime. */
    @stub
    def atTime(time: OffsetTime): OffsetDateTime = ???

    /** Compares this date to another date. */
    @stub
    def compareTo(other: ChronoLocalDate): Int = ???

    /** Checks if this date is equal to another date. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Formats this date using the specified formatter. */
    @stub
    def format(formatter: DateTimeFormatter): String = ???

    /** Gets the value of the specified field from this date as an int. */
    @stub
    def get(field: TemporalField): Int = ???

    /** Gets the chronology of this date, which is the ISO calendar system. */
    @stub
    def getChronology(): IsoChronology = ???

    /** Gets the day-of-month field. */
    @stub
    def getDayOfMonth(): Int = ???

    /** Gets the day-of-week field, which is an enum DayOfWeek. */
    @stub
    def getDayOfWeek(): DayOfWeek = ???

    /** Gets the day-of-year field. */
    @stub
    def getDayOfYear(): Int = ???

    /** Gets the era applicable at this date. */
    @stub
    def getEra(): Era = ???

    /** Gets the value of the specified field from this date as a long. */
    @stub
    def getLong(field: TemporalField): Long = ???

    /** Gets the month-of-year field using the Month enum. */
    @stub
    def getMonth(): Month = ???

    /** Gets the month-of-year field from 1 to 12. */
    @stub
    def getMonthValue(): Int = ???

    /** Gets the year field. */
    @stub
    def getYear(): Int = ???

    /** A hash code for this date. */
    @stub
    def hashCode(): Int = ???

    /** Checks if this date is after the specified date. */
    @stub
    def isAfter(other: ChronoLocalDate): Boolean = ???

    /** Checks if this date is before the specified date. */
    @stub
    def isBefore(other: ChronoLocalDate): Boolean = ???

    /** Checks if this date is equal to the specified date. */
    @stub
    def isEqual(other: ChronoLocalDate): Boolean = ???

    /** Checks if the year is a leap year, according to the ISO proleptic
     *  calendar system rules.
     */
    @stub
    def isLeapYear(): Boolean = ???

    /** Checks if the specified field is supported. */
    @stub
    def isSupported(field: TemporalField): Boolean = ???

    /** Checks if the specified unit is supported. */
    @stub
    def isSupported(unit: TemporalUnit): Boolean = ???

    /** Returns the length of the month represented by this date. */
    @stub
    def lengthOfMonth(): Int = ???

    /** Returns the length of the year represented by this date. */
    @stub
    def lengthOfYear(): Int = ???

    /** Returns a copy of this date with the specified amount subtracted. */
    @stub
    def minus(amountToSubtract: Long, unit: TemporalUnit): LocalDate = ???

    /** Returns a copy of this date with the specified amount subtracted. */
    @stub
    def minus(amountToSubtract: TemporalAmount): LocalDate = ???

    /** Returns a copy of this LocalDate with the specified number of days subtracted. */
    @stub
    def minusDays(daysToSubtract: Long): LocalDate = ???

    /** Returns a copy of this LocalDate with the specified number of months subtracted. */
    @stub
    def minusMonths(monthsToSubtract: Long): LocalDate = ???

    /** Returns a copy of this LocalDate with the specified number of weeks subtracted. */
    @stub
    def minusWeeks(weeksToSubtract: Long): LocalDate = ???

    /** Returns a copy of this LocalDate with the specified number of years subtracted. */
    @stub
    def minusYears(yearsToSubtract: Long): LocalDate = ???

    /** Returns a copy of this date with the specified amount added. */
    @stub
    def plus(amountToAdd: Long, unit: TemporalUnit): LocalDate = ???

    /** Returns a copy of this date with the specified amount added. */
    @stub
    def plus(amountToAdd: TemporalAmount): LocalDate = ???

    /** Returns a copy of this LocalDate with the specified number of days added. */
    @stub
    def plusDays(daysToAdd: Long): LocalDate = ???

    /** Returns a copy of this LocalDate with the specified number of months added. */
    @stub
    def plusMonths(monthsToAdd: Long): LocalDate = ???

    /** Returns a copy of this LocalDate with the specified number of weeks added. */
    @stub
    def plusWeeks(weeksToAdd: Long): LocalDate = ???

    /** Returns a copy of this LocalDate with the specified number of years added. */
    @stub
    def plusYears(yearsToAdd: Long): LocalDate = ???

    /** Queries this date using the specified query. */
    @stub
    def query[R](query: TemporalQuery[R]): R = ???

    /** Gets the range of valid values for the specified field. */
    @stub
    def range(field: TemporalField): ValueRange = ???

    /** Converts this date to the Epoch Day. */
    @stub
    def toEpochDay(): Long = ???

    /** Outputs this date as a String, such as 2007-12-03. */
    @stub
    def toString(): String = ???

    /** Calculates the period between this date and another date as a Period. */
    @stub
    def until(endDateExclusive: ChronoLocalDate): Period = ???

    /** Calculates the amount of time until another date in terms of the specified unit. */
    @stub
    def until(endExclusive: Temporal, unit: TemporalUnit): Long = ???

    /** Returns an adjusted copy of this date. */
    @stub
    def with(adjuster: TemporalAdjuster): LocalDate = ???

    /** Returns a copy of this date with the specified field set to a new value. */
    @stub
    def with(field: TemporalField, newValue: Long): LocalDate = ???

    /** Returns a copy of this LocalDate with the day-of-month altered. */
    @stub
    def withDayOfMonth(dayOfMonth: Int): LocalDate = ???

    /** Returns a copy of this LocalDate with the day-of-year altered. */
    @stub
    def withDayOfYear(dayOfYear: Int): LocalDate = ???

    /** Returns a copy of this LocalDate with the month-of-year altered. */
    @stub
    def withMonth(month: Int): LocalDate = ???
}

object LocalDate {
    /** The maximum supported LocalDate, '+999999999-12-31'. */
    @stub
    val MAX: LocalDate = ???

    /** Obtains an instance of LocalDate from a temporal object. */
    @stub
    def from(temporal: TemporalAccessor): LocalDate = ???

    /** Obtains the current date from the system clock in the default time-zone. */
    @stub
    def now(): LocalDate = ???

    /** Obtains the current date from the specified clock. */
    @stub
    def now(clock: Clock): LocalDate = ???

    /** Obtains the current date from the system clock in the specified time-zone. */
    @stub
    def now(zone: ZoneId): LocalDate = ???

    /** Obtains an instance of LocalDate from a year, month and day. */
    @stub
    def of(year: Int, month: Int, dayOfMonth: Int): LocalDate = ???

    /** Obtains an instance of LocalDate from a year, month and day. */
    @stub
    def of(year: Int, month: Month, dayOfMonth: Int): LocalDate = ???

    /** Obtains an instance of LocalDate from the epoch day count. */
    @stub
    def ofEpochDay(epochDay: Long): LocalDate = ???

    /** Obtains an instance of LocalDate from a year and day-of-year. */
    @stub
    def ofYearDay(year: Int, dayOfYear: Int): LocalDate = ???

    /** Obtains an instance of LocalDate from a text string such as 2007-12-03. */
    @stub
    def parse(text: CharSequence): LocalDate = ???

    /** Obtains an instance of LocalDate from a text string using a specific formatter. */
    @stub
    def parse(text: CharSequence, formatter: DateTimeFormatter): LocalDate = ???
}
