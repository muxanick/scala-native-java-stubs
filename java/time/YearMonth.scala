package java.time

import java.io.Serializable
import java.lang.{CharSequence, Comparable, Object, String}
import java.time.format.DateTimeFormatter
import java.time.temporal.{Temporal, TemporalAccessor, TemporalAdjuster, TemporalAmount, TemporalField, TemporalQuery, TemporalUnit, ValueRange}

// A year-month in the ISO-8601 calendar system, such as 2007-12.
// 
// YearMonth is an immutable date-time object that represents the combination
// of a year and month. Any field that can be derived from a year and month, such as
// quarter-of-year, can be obtained.
// 
// This class does not store or represent a day, time or time-zone.
// For example, the value "October 2007" can be stored in a YearMonth.
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
// YearMonth may have unpredictable results and should be avoided.
// The equals method should be used for comparisons.
final class YearMonth extends Object with Temporal, with TemporalAdjuster, with Comparable[YearMonth], with Serializable {

    @stub
    // Adjusts the specified temporal object to have this year-month.
    def adjustInto(temporal: Temporal): Temporal = ???

    @stub
    // Combines this year-month with a day-of-month to create a LocalDate.
    def atDay(dayOfMonth: Int): LocalDate = ???

    @stub
    // Returns a LocalDate at the end of the month.
    def atEndOfMonth(): LocalDate = ???

    @stub
    // Compares this year-month to another year-month.
    def compareTo(other: YearMonth): Int = ???

    @stub
    // Checks if this year-month is equal to another year-month.
    def equals(obj: Object): Boolean = ???

    @stub
    // Formats this year-month using the specified formatter.
    def format(formatter: DateTimeFormatter): String = ???

    @stub
    // Gets the value of the specified field from this year-month as an int.
    def get(field: TemporalField): Int = ???

    @stub
    // Gets the value of the specified field from this year-month as a long.
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
    // A hash code for this year-month.
    def hashCode(): Int = ???

    @stub
    // Checks if this year-month is after the specified year-month.
    def isAfter(other: YearMonth): Boolean = ???

    @stub
    // Checks if this year-month is before the specified year-month.
    def isBefore(other: YearMonth): Boolean = ???

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
    // Checks if the day-of-month is valid for this year-month.
    def isValidDay(dayOfMonth: Int): Boolean = ???

    @stub
    // Returns the length of the month, taking account of the year.
    def lengthOfMonth(): Int = ???

    @stub
    // Returns the length of the year.
    def lengthOfYear(): Int = ???

    @stub
    // Returns a copy of this year-month with the specified amount subtracted.
    def minus(amountToSubtract: Long, unit: TemporalUnit): YearMonth = ???

    @stub
    // Returns a copy of this year-month with the specified amount subtracted.
    def minus(amountToSubtract: TemporalAmount): YearMonth = ???

    @stub
    // Returns a copy of this YearMonth with the specified number of months subtracted.
    def minusMonths(monthsToSubtract: Long): YearMonth = ???

    @stub
    // Returns a copy of this YearMonth with the specified number of years subtracted.
    def minusYears(yearsToSubtract: Long): YearMonth = ???

    @stub
    // Returns a copy of this year-month with the specified amount added.
    def plus(amountToAdd: Long, unit: TemporalUnit): YearMonth = ???

    @stub
    // Returns a copy of this year-month with the specified amount added.
    def plus(amountToAdd: TemporalAmount): YearMonth = ???

    @stub
    // Returns a copy of this YearMonth with the specified number of months added.
    def plusMonths(monthsToAdd: Long): YearMonth = ???

    @stub
    // Returns a copy of this YearMonth with the specified number of years added.
    def plusYears(yearsToAdd: Long): YearMonth = ???

    @stub
    // Queries this year-month using the specified query.
    def R: [R] = ???

    @stub
    // Gets the range of valid values for the specified field.
    def range(field: TemporalField): ValueRange = ???

    @stub
    // Outputs this year-month as a String, such as 2007-12.
    def toString(): String = ???

    @stub
    // Calculates the amount of time until another year-month in terms of the specified unit.
    def until(endExclusive: Temporal, unit: TemporalUnit): Long = ???

    @stub
    // Returns an adjusted copy of this year-month.
    def with(adjuster: TemporalAdjuster): YearMonth = ???

    @stub
    // Returns a copy of this year-month with the specified field set to a new value.
    def with(field: TemporalField, newValue: Long): YearMonth = ???

    @stub
    // Returns a copy of this YearMonth with the month-of-year altered.
    def withMonth(month: Int): YearMonth = ???
}

object YearMonth {
    @stub
    // Obtains an instance of YearMonth from a temporal object.
    def from(temporal: TemporalAccessor): YearMonth = ???

    @stub
    // Obtains the current year-month from the system clock in the default time-zone.
    def now(): YearMonth = ???

    @stub
    // Obtains the current year-month from the specified clock.
    def now(clock: Clock): YearMonth = ???

    @stub
    // Obtains the current year-month from the system clock in the specified time-zone.
    def now(zone: ZoneId): YearMonth = ???

    @stub
    // Obtains an instance of YearMonth from a year and month.
    def of(year: Int, month: Int): YearMonth = ???

    @stub
    // Obtains an instance of YearMonth from a year and month.
    def of(year: Int, month: Month): YearMonth = ???

    @stub
    // Obtains an instance of YearMonth from a text string such as 2007-12.
    def parse(text: CharSequence): YearMonth = ???

    @stub
    // Obtains an instance of YearMonth from a text string using a specific formatter.
    def parse(text: CharSequence, formatter: DateTimeFormatter): YearMonth = ???
}
