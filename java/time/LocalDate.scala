package java.time

import java.io.Serializable
import java.lang.{CharSequence, Object, String}
import java.time.chrono.{ChronoLocalDate, Era, IsoChronology}
import java.time.format.DateTimeFormatter
import java.time.temporal.{Temporal, TemporalAccessor, TemporalAdjuster, TemporalAmount, TemporalField, TemporalQuery, TemporalUnit, ValueRange}

// A date without a time-zone in the ISO-8601 calendar system,
// such as 2007-12-03.
// 
// LocalDate is an immutable date-time object that represents a date,
// often viewed as year-month-day. Other date fields, such as day-of-year,
// day-of-week and week-of-year, can also be accessed.
// For example, the value "2nd October 2007" can be stored in a LocalDate.
// 
// This class does not store or represent a time or time-zone.
// Instead, it is a description of the date, as used for birthdays.
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
// LocalDate may have unpredictable results and should be avoided.
// The equals method should be used for comparisons.
final class LocalDate extends Object with Temporal, with TemporalAdjuster, with ChronoLocalDate, with Serializable {

    @stub
    // Adjusts the specified temporal object to have the same date as this object.
    def adjustInto(temporal: Temporal): Temporal = ???

    @stub
    // Combines this date with the time of midnight to create a LocalDateTime
    // at the start of this date.
    def atStartOfDay(): LocalDateTime = ???

    @stub
    // Returns a zoned date-time from this date at the earliest valid time according
    // to the rules in the time-zone.
    def atStartOfDay(zone: ZoneId): ZonedDateTime = ???

    @stub
    // Combines this date with a time to create a LocalDateTime.
    def atTime(hour: Int, minute: Int): LocalDateTime = ???

    @stub
    // Combines this date with a time to create a LocalDateTime.
    def atTime(hour: Int, minute: Int, second: Int): LocalDateTime = ???

    @stub
    // Combines this date with a time to create a LocalDateTime.
    def atTime(hour: Int, minute: Int, second: Int, nanoOfSecond: Int): LocalDateTime = ???

    @stub
    // Combines this date with a time to create a LocalDateTime.
    def atTime(time: LocalTime): LocalDateTime = ???

    @stub
    // Combines this date with an offset time to create an OffsetDateTime.
    def atTime(time: OffsetTime): OffsetDateTime = ???

    @stub
    // Compares this date to another date.
    def compareTo(other: ChronoLocalDate): Int = ???

    @stub
    // Checks if this date is equal to another date.
    def equals(obj: Object): Boolean = ???

    @stub
    // Formats this date using the specified formatter.
    def format(formatter: DateTimeFormatter): String = ???

    @stub
    // Gets the value of the specified field from this date as an int.
    def get(field: TemporalField): Int = ???

    @stub
    // Gets the chronology of this date, which is the ISO calendar system.
    def getChronology(): IsoChronology = ???

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
    // Gets the era applicable at this date.
    def getEra(): Era = ???

    @stub
    // Gets the value of the specified field from this date as a long.
    def getLong(field: TemporalField): Long = ???

    @stub
    // Gets the month-of-year field using the Month enum.
    def getMonth(): Month = ???

    @stub
    // Gets the month-of-year field from 1 to 12.
    def getMonthValue(): Int = ???

    @stub
    // Gets the year field.
    def getYear(): Int = ???

    @stub
    // A hash code for this date.
    def hashCode(): Int = ???

    @stub
    // Checks if this date is after the specified date.
    def isAfter(other: ChronoLocalDate): Boolean = ???

    @stub
    // Checks if this date is before the specified date.
    def isBefore(other: ChronoLocalDate): Boolean = ???

    @stub
    // Checks if this date is equal to the specified date.
    def isEqual(other: ChronoLocalDate): Boolean = ???

    @stub
    // Checks if the year is a leap year, according to the ISO proleptic
    // calendar system rules.
    def isLeapYear(): Boolean = ???

    @stub
    // Checks if the specified field is supported.
    def isSupported(field: TemporalField): Boolean = ???

    @stub
    // Checks if the specified unit is supported.
    def isSupported(unit: TemporalUnit): Boolean = ???

    @stub
    // Returns the length of the month represented by this date.
    def lengthOfMonth(): Int = ???

    @stub
    // Returns the length of the year represented by this date.
    def lengthOfYear(): Int = ???

    @stub
    // Returns a copy of this date with the specified amount subtracted.
    def minus(amountToSubtract: Long, unit: TemporalUnit): LocalDate = ???

    @stub
    // Returns a copy of this date with the specified amount subtracted.
    def minus(amountToSubtract: TemporalAmount): LocalDate = ???

    @stub
    // Returns a copy of this LocalDate with the specified number of days subtracted.
    def minusDays(daysToSubtract: Long): LocalDate = ???

    @stub
    // Returns a copy of this LocalDate with the specified number of months subtracted.
    def minusMonths(monthsToSubtract: Long): LocalDate = ???

    @stub
    // Returns a copy of this LocalDate with the specified number of weeks subtracted.
    def minusWeeks(weeksToSubtract: Long): LocalDate = ???

    @stub
    // Returns a copy of this LocalDate with the specified number of years subtracted.
    def minusYears(yearsToSubtract: Long): LocalDate = ???

    @stub
    // Returns a copy of this date with the specified amount added.
    def plus(amountToAdd: Long, unit: TemporalUnit): LocalDate = ???

    @stub
    // Returns a copy of this date with the specified amount added.
    def plus(amountToAdd: TemporalAmount): LocalDate = ???

    @stub
    // Returns a copy of this LocalDate with the specified number of days added.
    def plusDays(daysToAdd: Long): LocalDate = ???

    @stub
    // Returns a copy of this LocalDate with the specified number of months added.
    def plusMonths(monthsToAdd: Long): LocalDate = ???

    @stub
    // Returns a copy of this LocalDate with the specified number of weeks added.
    def plusWeeks(weeksToAdd: Long): LocalDate = ???

    @stub
    // Returns a copy of this LocalDate with the specified number of years added.
    def plusYears(yearsToAdd: Long): LocalDate = ???

    @stub
    // Queries this date using the specified query.
    def R: [R] = ???

    @stub
    // Gets the range of valid values for the specified field.
    def range(field: TemporalField): ValueRange = ???

    @stub
    // Converts this date to the Epoch Day.
    def toEpochDay(): Long = ???

    @stub
    // Outputs this date as a String, such as 2007-12-03.
    def toString(): String = ???

    @stub
    // Calculates the period between this date and another date as a Period.
    def until(endDateExclusive: ChronoLocalDate): Period = ???

    @stub
    // Calculates the amount of time until another date in terms of the specified unit.
    def until(endExclusive: Temporal, unit: TemporalUnit): Long = ???

    @stub
    // Returns an adjusted copy of this date.
    def with(adjuster: TemporalAdjuster): LocalDate = ???

    @stub
    // Returns a copy of this date with the specified field set to a new value.
    def with(field: TemporalField, newValue: Long): LocalDate = ???

    @stub
    // Returns a copy of this LocalDate with the day-of-month altered.
    def withDayOfMonth(dayOfMonth: Int): LocalDate = ???

    @stub
    // Returns a copy of this LocalDate with the day-of-year altered.
    def withDayOfYear(dayOfYear: Int): LocalDate = ???

    @stub
    // Returns a copy of this LocalDate with the month-of-year altered.
    def withMonth(month: Int): LocalDate = ???
}

object LocalDate {
    @stub
    // The maximum supported LocalDate, '+999999999-12-31'.
    def MAX: LocalDate = ???

    @stub
    // Obtains an instance of LocalDate from a temporal object.
    def from(temporal: TemporalAccessor): LocalDate = ???

    @stub
    // Obtains the current date from the system clock in the default time-zone.
    def now(): LocalDate = ???

    @stub
    // Obtains the current date from the specified clock.
    def now(clock: Clock): LocalDate = ???

    @stub
    // Obtains the current date from the system clock in the specified time-zone.
    def now(zone: ZoneId): LocalDate = ???

    @stub
    // Obtains an instance of LocalDate from a year, month and day.
    def of(year: Int, month: Int, dayOfMonth: Int): LocalDate = ???

    @stub
    // Obtains an instance of LocalDate from a year, month and day.
    def of(year: Int, month: Month, dayOfMonth: Int): LocalDate = ???

    @stub
    // Obtains an instance of LocalDate from the epoch day count.
    def ofEpochDay(epochDay: Long): LocalDate = ???

    @stub
    // Obtains an instance of LocalDate from a year and day-of-year.
    def ofYearDay(year: Int, dayOfYear: Int): LocalDate = ???

    @stub
    // Obtains an instance of LocalDate from a text string such as 2007-12-03.
    def parse(text: CharSequence): LocalDate = ???

    @stub
    // Obtains an instance of LocalDate from a text string using a specific formatter.
    def parse(text: CharSequence, formatter: DateTimeFormatter): LocalDate = ???
}
