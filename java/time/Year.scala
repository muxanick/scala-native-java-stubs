package java.time

import java.io.Serializable
import java.lang.{CharSequence, Comparable, Object, String}
import java.time.format.DateTimeFormatter
import java.time.temporal.{Temporal, TemporalAccessor, TemporalAdjuster, TemporalAmount, TemporalField, TemporalQuery, TemporalUnit, ValueRange}

// A year in the ISO-8601 calendar system, such as 2007.
// 
// Year is an immutable date-time object that represents a year.
// Any field that can be derived from a year can be obtained.
// 
// Note that years in the ISO chronology only align with years in the
// Gregorian-Julian system for modern years. Parts of Russia did not switch to the
// modern Gregorian/ISO rules until 1920.
// As such, historical years must be treated with caution.
// 
// This class does not store or represent a month, day, time or time-zone.
// For example, the value "2007" can be stored in a Year.
// 
// Years represented by this class follow the ISO-8601 standard and use
// the proleptic numbering system. Year 1 is preceded by year 0, then by year -1.
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
// Year may have unpredictable results and should be avoided.
// The equals method should be used for comparisons.
final class Year extends Object with Temporal, with TemporalAdjuster, with Comparable[Year], with Serializable {

    @stub
    // Adjusts the specified temporal object to have this year.
    def adjustInto(temporal: Temporal): Temporal = ???

    @stub
    // Combines this year with a day-of-year to create a LocalDate.
    def atDay(dayOfYear: Int): LocalDate = ???

    @stub
    // Combines this year with a month to create a YearMonth.
    def atMonth(month: Int): YearMonth = ???

    @stub
    // Combines this year with a month to create a YearMonth.
    def atMonth(month: Month): YearMonth = ???

    @stub
    // Combines this year with a month-day to create a LocalDate.
    def atMonthDay(monthDay: MonthDay): LocalDate = ???

    @stub
    // Compares this year to another year.
    def compareTo(other: Year): Int = ???

    @stub
    // Checks if this year is equal to another year.
    def equals(obj: Object): Boolean = ???

    @stub
    // Formats this year using the specified formatter.
    def format(formatter: DateTimeFormatter): String = ???

    @stub
    // Gets the value of the specified field from this year as an int.
    def get(field: TemporalField): Int = ???

    @stub
    // Gets the value of the specified field from this year as a long.
    def getLong(field: TemporalField): Long = ???

    @stub
    // Gets the year value.
    def getValue(): Int = ???

    @stub
    // A hash code for this year.
    def hashCode(): Int = ???

    @stub
    // Checks if this year is after the specified year.
    def isAfter(other: Year): Boolean = ???

    @stub
    // Checks if this year is before the specified year.
    def isBefore(other: Year): Boolean = ???

    @stub
    // Checks if the year is a leap year, according to the ISO proleptic
    // calendar system rules.
    def isLeap(): Boolean = ???

    @stub
    // Checks if the specified field is supported.
    def isSupported(field: TemporalField): Boolean = ???

    @stub
    // Checks if the specified unit is supported.
    def isSupported(unit: TemporalUnit): Boolean = ???

    @stub
    // Checks if the month-day is valid for this year.
    def isValidMonthDay(monthDay: MonthDay): Boolean = ???

    @stub
    // Gets the length of this year in days.
    def length(): Int = ???

    @stub
    // Returns a copy of this year with the specified amount subtracted.
    def minus(amountToSubtract: Long, unit: TemporalUnit): Year = ???

    @stub
    // Returns a copy of this year with the specified amount subtracted.
    def minus(amountToSubtract: TemporalAmount): Year = ???

    @stub
    // Returns a copy of this Year with the specified number of years subtracted.
    def minusYears(yearsToSubtract: Long): Year = ???

    @stub
    // Returns a copy of this year with the specified amount added.
    def plus(amountToAdd: Long, unit: TemporalUnit): Year = ???

    @stub
    // Returns a copy of this year with the specified amount added.
    def plus(amountToAdd: TemporalAmount): Year = ???

    @stub
    // Returns a copy of this Year with the specified number of years added.
    def plusYears(yearsToAdd: Long): Year = ???

    @stub
    // Queries this year using the specified query.
    def R: [R] = ???

    @stub
    // Gets the range of valid values for the specified field.
    def range(field: TemporalField): ValueRange = ???

    @stub
    // Outputs this year as a String.
    def toString(): String = ???

    @stub
    // Calculates the amount of time until another year in terms of the specified unit.
    def until(endExclusive: Temporal, unit: TemporalUnit): Long = ???

    @stub
    // Returns an adjusted copy of this year.
    def with(adjuster: TemporalAdjuster): Year = ???
}

object Year {
    @stub
    // The maximum supported year, '+999,999,999'.
    def MAX_VALUE: Int = ???

    @stub
    // Obtains an instance of Year from a temporal object.
    def from(temporal: TemporalAccessor): Year = ???

    @stub
    // Checks if the year is a leap year, according to the ISO proleptic
    // calendar system rules.
    def isLeap(year: Long): Boolean = ???

    @stub
    // Obtains the current year from the system clock in the default time-zone.
    def now(): Year = ???

    @stub
    // Obtains the current year from the specified clock.
    def now(clock: Clock): Year = ???

    @stub
    // Obtains the current year from the system clock in the specified time-zone.
    def now(zone: ZoneId): Year = ???

    @stub
    // Obtains an instance of Year.
    def of(isoYear: Int): Year = ???

    @stub
    // Obtains an instance of Year from a text string such as 2007.
    def parse(text: CharSequence): Year = ???

    @stub
    // Obtains an instance of Year from a text string using a specific formatter.
    def parse(text: CharSequence, formatter: DateTimeFormatter): Year = ???
}
