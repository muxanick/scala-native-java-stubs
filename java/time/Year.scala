package java.time

import java.io.Serializable
import java.lang.{CharSequence, Comparable, Object, String}
import java.time.format.DateTimeFormatter
import java.time.temporal.{Temporal, TemporalAccessor, TemporalAdjuster, TemporalAmount, TemporalField, TemporalQuery, TemporalUnit, ValueRange}

/** A year in the ISO-8601 calendar system, such as 2007.
 *  
 *  Year is an immutable date-time object that represents a year.
 *  Any field that can be derived from a year can be obtained.
 *  
 *  Note that years in the ISO chronology only align with years in the
 *  Gregorian-Julian system for modern years. Parts of Russia did not switch to the
 *  modern Gregorian/ISO rules until 1920.
 *  As such, historical years must be treated with caution.
 *  
 *  This class does not store or represent a month, day, time or time-zone.
 *  For example, the value "2007" can be stored in a Year.
 *  
 *  Years represented by this class follow the ISO-8601 standard and use
 *  the proleptic numbering system. Year 1 is preceded by year 0, then by year -1.
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
 *  Year may have unpredictable results and should be avoided.
 *  The equals method should be used for comparisons.
 */
final class Year extends Object with Temporal with TemporalAdjuster with Comparable[Year] with Serializable {

    /** Adjusts the specified temporal object to have this year. */
    @stub
    def adjustInto(temporal: Temporal): Temporal = ???

    /** Combines this year with a day-of-year to create a LocalDate. */
    @stub
    def atDay(dayOfYear: Int): LocalDate = ???

    /** Combines this year with a month to create a YearMonth. */
    @stub
    def atMonth(month: Int): YearMonth = ???

    /** Combines this year with a month to create a YearMonth. */
    @stub
    def atMonth(month: Month): YearMonth = ???

    /** Combines this year with a month-day to create a LocalDate. */
    @stub
    def atMonthDay(monthDay: MonthDay): LocalDate = ???

    /** Compares this year to another year. */
    @stub
    def compareTo(other: Year): Int = ???

    /** Checks if this year is equal to another year. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Formats this year using the specified formatter. */
    @stub
    def format(formatter: DateTimeFormatter): String = ???

    /** Gets the value of the specified field from this year as an int. */
    @stub
    def get(field: TemporalField): Int = ???

    /** Gets the value of the specified field from this year as a long. */
    @stub
    def getLong(field: TemporalField): Long = ???

    /** Gets the year value. */
    @stub
    def getValue(): Int = ???

    /** A hash code for this year. */
    @stub
    def hashCode(): Int = ???

    /** Checks if this year is after the specified year. */
    @stub
    def isAfter(other: Year): Boolean = ???

    /** Checks if this year is before the specified year. */
    @stub
    def isBefore(other: Year): Boolean = ???

    /** Checks if the year is a leap year, according to the ISO proleptic
     *  calendar system rules.
     */
    @stub
    def isLeap(): Boolean = ???

    /** Checks if the specified field is supported. */
    @stub
    def isSupported(field: TemporalField): Boolean = ???

    /** Checks if the specified unit is supported. */
    @stub
    def isSupported(unit: TemporalUnit): Boolean = ???

    /** Checks if the month-day is valid for this year. */
    @stub
    def isValidMonthDay(monthDay: MonthDay): Boolean = ???

    /** Gets the length of this year in days. */
    @stub
    def length(): Int = ???

    /** Returns a copy of this year with the specified amount subtracted. */
    @stub
    def minus(amountToSubtract: Long, unit: TemporalUnit): Year = ???

    /** Returns a copy of this year with the specified amount subtracted. */
    @stub
    def minus(amountToSubtract: TemporalAmount): Year = ???

    /** Returns a copy of this Year with the specified number of years subtracted. */
    @stub
    def minusYears(yearsToSubtract: Long): Year = ???

    /** Returns a copy of this year with the specified amount added. */
    @stub
    def plus(amountToAdd: Long, unit: TemporalUnit): Year = ???

    /** Returns a copy of this year with the specified amount added. */
    @stub
    def plus(amountToAdd: TemporalAmount): Year = ???

    /** Returns a copy of this Year with the specified number of years added. */
    @stub
    def plusYears(yearsToAdd: Long): Year = ???

    /** Queries this year using the specified query. */
    @stub
    def query[R](query: TemporalQuery[R]): R = ???

    /** Gets the range of valid values for the specified field. */
    @stub
    def range(field: TemporalField): ValueRange = ???

    /** Outputs this year as a String. */
    @stub
    def toString(): String = ???

    /** Calculates the amount of time until another year in terms of the specified unit. */
    @stub
    def until(endExclusive: Temporal, unit: TemporalUnit): Long = ???

    /** Returns an adjusted copy of this year. */
    @stub
    def with(adjuster: TemporalAdjuster): Year = ???
}

object Year {
    /** The maximum supported year, '+999,999,999'. */
    @stub
    val MAX_VALUE: Int = ???

    /** Obtains an instance of Year from a temporal object. */
    @stub
    def from(temporal: TemporalAccessor): Year = ???

    /** Checks if the year is a leap year, according to the ISO proleptic
     *  calendar system rules.
     */
    @stub
    def isLeap(year: Long): Boolean = ???

    /** Obtains the current year from the system clock in the default time-zone. */
    @stub
    def now(): Year = ???

    /** Obtains the current year from the specified clock. */
    @stub
    def now(clock: Clock): Year = ???

    /** Obtains the current year from the system clock in the specified time-zone. */
    @stub
    def now(zone: ZoneId): Year = ???

    /** Obtains an instance of Year. */
    @stub
    def of(isoYear: Int): Year = ???

    /** Obtains an instance of Year from a text string such as 2007. */
    @stub
    def parse(text: CharSequence): Year = ???

    /** Obtains an instance of Year from a text string using a specific formatter. */
    @stub
    def parse(text: CharSequence, formatter: DateTimeFormatter): Year = ???
}
