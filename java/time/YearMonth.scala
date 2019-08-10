package java.time

import java.io.Serializable
import java.lang.{CharSequence, Comparable, Object, String}
import java.time.format.DateTimeFormatter
import java.time.temporal.{Temporal, TemporalAccessor, TemporalAdjuster, TemporalAmount, TemporalField, TemporalQuery, TemporalUnit, ValueRange}
import scala.scalanative.annotation.stub

/** A year-month in the ISO-8601 calendar system, such as 2007-12.
 *  
 *  YearMonth is an immutable date-time object that represents the combination
 *  of a year and month. Any field that can be derived from a year and month, such as
 *  quarter-of-year, can be obtained.
 *  
 *  This class does not store or represent a day, time or time-zone.
 *  For example, the value "October 2007" can be stored in a YearMonth.
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
 *  YearMonth may have unpredictable results and should be avoided.
 *  The equals method should be used for comparisons.
 */
final class YearMonth extends Object with Temporal with TemporalAdjuster with Comparable[YearMonth] with Serializable {

    /** Adjusts the specified temporal object to have this year-month. */
    @stub
    def adjustInto(temporal: Temporal): Temporal = ???

    /** Combines this year-month with a day-of-month to create a LocalDate. */
    @stub
    def atDay(dayOfMonth: Int): LocalDate = ???

    /** Returns a LocalDate at the end of the month. */
    @stub
    def atEndOfMonth(): LocalDate = ???

    /** Compares this year-month to another year-month. */
    @stub
    def compareTo(other: YearMonth): Int = ???

    /** Checks if this year-month is equal to another year-month. */
    @stub
    def equals(obj: Any): Boolean = ???

    /** Formats this year-month using the specified formatter. */
    @stub
    def format(formatter: DateTimeFormatter): String = ???

    /** Gets the value of the specified field from this year-month as an int. */
    @stub
    def get(field: TemporalField): Int = ???

    /** Gets the value of the specified field from this year-month as a long. */
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

    /** A hash code for this year-month. */
    @stub
    def hashCode(): Int = ???

    /** Checks if this year-month is after the specified year-month. */
    @stub
    def isAfter(other: YearMonth): Boolean = ???

    /** Checks if this year-month is before the specified year-month. */
    @stub
    def isBefore(other: YearMonth): Boolean = ???

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

    /** Checks if the day-of-month is valid for this year-month. */
    @stub
    def isValidDay(dayOfMonth: Int): Boolean = ???

    /** Returns the length of the month, taking account of the year. */
    @stub
    def lengthOfMonth(): Int = ???

    /** Returns the length of the year. */
    @stub
    def lengthOfYear(): Int = ???

    /** Returns a copy of this year-month with the specified amount subtracted. */
    @stub
    def minus(amountToSubtract: Long, unit: TemporalUnit): YearMonth = ???

    /** Returns a copy of this year-month with the specified amount subtracted. */
    @stub
    def minus(amountToSubtract: TemporalAmount): YearMonth = ???

    /** Returns a copy of this YearMonth with the specified number of months subtracted. */
    @stub
    def minusMonths(monthsToSubtract: Long): YearMonth = ???

    /** Returns a copy of this YearMonth with the specified number of years subtracted. */
    @stub
    def minusYears(yearsToSubtract: Long): YearMonth = ???

    /** Returns a copy of this year-month with the specified amount added. */
    @stub
    def plus(amountToAdd: Long, unit: TemporalUnit): YearMonth = ???

    /** Returns a copy of this year-month with the specified amount added. */
    @stub
    def plus(amountToAdd: TemporalAmount): YearMonth = ???

    /** Returns a copy of this YearMonth with the specified number of months added. */
    @stub
    def plusMonths(monthsToAdd: Long): YearMonth = ???

    /** Returns a copy of this YearMonth with the specified number of years added. */
    @stub
    def plusYears(yearsToAdd: Long): YearMonth = ???

    /** Queries this year-month using the specified query. */
    @stub
    def query[R](query: TemporalQuery[R]): R = ???

    /** Gets the range of valid values for the specified field. */
    @stub
    def range(field: TemporalField): ValueRange = ???

    /** Outputs this year-month as a String, such as 2007-12. */
    @stub
    def toString(): String = ???

    /** Calculates the amount of time until another year-month in terms of the specified unit. */
    @stub
    def until(endExclusive: Temporal, unit: TemporalUnit): Long = ???

    /** Returns an adjusted copy of this year-month. */
    @stub
    def with(adjuster: TemporalAdjuster): YearMonth = ???

    /** Returns a copy of this year-month with the specified field set to a new value. */
    @stub
    def with(field: TemporalField, newValue: Long): YearMonth = ???

    /** Returns a copy of this YearMonth with the month-of-year altered. */
    @stub
    def withMonth(month: Int): YearMonth = ???

    /** Returns a copy of this YearMonth with the year altered. */
    @stub
    def withYear(year: Int): YearMonth = ???
}

object YearMonth {
    /** Obtains an instance of YearMonth from a temporal object. */
    @stub
    def from(temporal: TemporalAccessor): YearMonth = ???

    /** Obtains the current year-month from the system clock in the default time-zone. */
    @stub
    def now(): YearMonth = ???

    /** Obtains the current year-month from the specified clock. */
    @stub
    def now(clock: Clock): YearMonth = ???

    /** Obtains the current year-month from the system clock in the specified time-zone. */
    @stub
    def now(zone: ZoneId): YearMonth = ???

    /** Obtains an instance of YearMonth from a year and month. */
    @stub
    def of(year: Int, month: Int): YearMonth = ???

    /** Obtains an instance of YearMonth from a year and month. */
    @stub
    def of(year: Int, month: Month): YearMonth = ???

    /** Obtains an instance of YearMonth from a text string such as 2007-12. */
    @stub
    def parse(text: CharSequence): YearMonth = ???

    /** Obtains an instance of YearMonth from a text string using a specific formatter. */
    @stub
    def parse(text: CharSequence, formatter: DateTimeFormatter): YearMonth = ???
}
