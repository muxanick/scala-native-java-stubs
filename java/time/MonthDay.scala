package java.time

import java.io.Serializable
import java.lang.{CharSequence, Comparable, Object, String}
import java.time.format.DateTimeFormatter
import java.time.temporal.{Temporal, TemporalAccessor, TemporalAdjuster, TemporalField, TemporalQuery, ValueRange}

/** A month-day in the ISO-8601 calendar system, such as --12-03.
 *  
 *  MonthDay is an immutable date-time object that represents the combination
 *  of a month and day-of-month. Any field that can be derived from a month and day,
 *  such as quarter-of-year, can be obtained.
 *  
 *  This class does not store or represent a year, time or time-zone.
 *  For example, the value "December 3rd" can be stored in a MonthDay.
 *  
 *  Since a MonthDay does not possess a year, the leap day of
 *  February 29th is considered valid.
 *  
 *  This class implements TemporalAccessor rather than Temporal.
 *  This is because it is not possible to define whether February 29th is valid or not
 *  without external information, preventing the implementation of plus/minus.
 *  Related to this, MonthDay only provides access to query and set the fields
 *  MONTH_OF_YEAR and DAY_OF_MONTH.
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
 *  MonthDay may have unpredictable results and should be avoided.
 *  The equals method should be used for comparisons.
 */
final class MonthDay extends Object with TemporalAccessor with TemporalAdjuster with Comparable[MonthDay] with Serializable {

    /** Adjusts the specified temporal object to have this month-day. */
    @stub
    def adjustInto(temporal: Temporal): Temporal = ???

    /** Combines this month-day with a year to create a LocalDate. */
    @stub
    def atYear(year: Int): LocalDate = ???

    /** Compares this month-day to another month-day. */
    @stub
    def compareTo(other: MonthDay): Int = ???

    /** Checks if this month-day is equal to another month-day. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Formats this month-day using the specified formatter. */
    @stub
    def format(formatter: DateTimeFormatter): String = ???

    /** Gets the value of the specified field from this month-day as an int. */
    @stub
    def get(field: TemporalField): Int = ???

    /** Gets the day-of-month field. */
    @stub
    def getDayOfMonth(): Int = ???

    /** Gets the value of the specified field from this month-day as a long. */
    @stub
    def getLong(field: TemporalField): Long = ???

    /** Gets the month-of-year field using the Month enum. */
    @stub
    def getMonth(): Month = ???

    /** Gets the month-of-year field from 1 to 12. */
    @stub
    def getMonthValue(): Int = ???

    /** A hash code for this month-day. */
    @stub
    def hashCode(): Int = ???

    /** Checks if this month-day is after the specified month-day. */
    @stub
    def isAfter(other: MonthDay): Boolean = ???

    /** Checks if this month-day is before the specified month-day. */
    @stub
    def isBefore(other: MonthDay): Boolean = ???

    /** Checks if the specified field is supported. */
    @stub
    def isSupported(field: TemporalField): Boolean = ???

    /** Checks if the year is valid for this month-day. */
    @stub
    def isValidYear(year: Int): Boolean = ???

    /** Queries this month-day using the specified query. */
    @stub
    def query[R](query: TemporalQuery[R]): R = ???

    /** Gets the range of valid values for the specified field. */
    @stub
    def range(field: TemporalField): ValueRange = ???

    /** Outputs this month-day as a String, such as --12-03. */
    @stub
    def toString(): String = ???

    /** Returns a copy of this MonthDay with the month-of-year altered. */
    @stub
    def with(month: Month): MonthDay = ???

    /** Returns a copy of this MonthDay with the day-of-month altered. */
    @stub
    def withDayOfMonth(dayOfMonth: Int): MonthDay = ???
}

object MonthDay {
    /** Obtains an instance of MonthDay from a temporal object. */
    @stub
    def from(temporal: TemporalAccessor): MonthDay = ???

    /** Obtains the current month-day from the system clock in the default time-zone. */
    @stub
    def now(): MonthDay = ???

    /** Obtains the current month-day from the specified clock. */
    @stub
    def now(clock: Clock): MonthDay = ???

    /** Obtains the current month-day from the system clock in the specified time-zone. */
    @stub
    def now(zone: ZoneId): MonthDay = ???

    /** Obtains an instance of MonthDay. */
    @stub
    def of(month: Int, dayOfMonth: Int): MonthDay = ???

    /** Obtains an instance of MonthDay. */
    @stub
    def of(month: Month, dayOfMonth: Int): MonthDay = ???

    /** Obtains an instance of MonthDay from a text string such as --12-03. */
    @stub
    def parse(text: CharSequence): MonthDay = ???

    /** Obtains an instance of MonthDay from a text string using a specific formatter. */
    @stub
    def parse(text: CharSequence, formatter: DateTimeFormatter): MonthDay = ???
}
