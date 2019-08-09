package java.time

import java.io.Serializable
import java.lang.{CharSequence, Comparable, Object, String}
import java.time.format.DateTimeFormatter
import java.time.temporal.{Temporal, TemporalAccessor, TemporalAdjuster, TemporalField, TemporalQuery, ValueRange}

// A month-day in the ISO-8601 calendar system, such as --12-03.
// 
// MonthDay is an immutable date-time object that represents the combination
// of a month and day-of-month. Any field that can be derived from a month and day,
// such as quarter-of-year, can be obtained.
// 
// This class does not store or represent a year, time or time-zone.
// For example, the value "December 3rd" can be stored in a MonthDay.
// 
// Since a MonthDay does not possess a year, the leap day of
// February 29th is considered valid.
// 
// This class implements TemporalAccessor rather than Temporal.
// This is because it is not possible to define whether February 29th is valid or not
// without external information, preventing the implementation of plus/minus.
// Related to this, MonthDay only provides access to query and set the fields
// MONTH_OF_YEAR and DAY_OF_MONTH.
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
// MonthDay may have unpredictable results and should be avoided.
// The equals method should be used for comparisons.
final class MonthDay extends Object with TemporalAccessor, with TemporalAdjuster, with Comparable[MonthDay], with Serializable {

    @stub
    // Adjusts the specified temporal object to have this month-day.
    def adjustInto(temporal: Temporal): Temporal = ???

    @stub
    // Combines this month-day with a year to create a LocalDate.
    def atYear(year: Int): LocalDate = ???

    @stub
    // Compares this month-day to another month-day.
    def compareTo(other: MonthDay): Int = ???

    @stub
    // Checks if this month-day is equal to another month-day.
    def equals(obj: Object): Boolean = ???

    @stub
    // Formats this month-day using the specified formatter.
    def format(formatter: DateTimeFormatter): String = ???

    @stub
    // Gets the value of the specified field from this month-day as an int.
    def get(field: TemporalField): Int = ???

    @stub
    // Gets the day-of-month field.
    def getDayOfMonth(): Int = ???

    @stub
    // Gets the value of the specified field from this month-day as a long.
    def getLong(field: TemporalField): Long = ???

    @stub
    // Gets the month-of-year field using the Month enum.
    def getMonth(): Month = ???

    @stub
    // Gets the month-of-year field from 1 to 12.
    def getMonthValue(): Int = ???

    @stub
    // A hash code for this month-day.
    def hashCode(): Int = ???

    @stub
    // Checks if this month-day is after the specified month-day.
    def isAfter(other: MonthDay): Boolean = ???

    @stub
    // Checks if this month-day is before the specified month-day.
    def isBefore(other: MonthDay): Boolean = ???

    @stub
    // Checks if the specified field is supported.
    def isSupported(field: TemporalField): Boolean = ???

    @stub
    // Checks if the year is valid for this month-day.
    def isValidYear(year: Int): Boolean = ???

    @stub
    // Queries this month-day using the specified query.
    def R: [R] = ???

    @stub
    // Gets the range of valid values for the specified field.
    def range(field: TemporalField): ValueRange = ???

    @stub
    // Outputs this month-day as a String, such as --12-03.
    def toString(): String = ???

    @stub
    // Returns a copy of this MonthDay with the month-of-year altered.
    def with(month: Month): MonthDay = ???

    @stub
    // Returns a copy of this MonthDay with the day-of-month altered.
    def withDayOfMonth(dayOfMonth: Int): MonthDay = ???
}

object MonthDay {
    @stub
    // Obtains an instance of MonthDay from a temporal object.
    def from(temporal: TemporalAccessor): MonthDay = ???

    @stub
    // Obtains the current month-day from the system clock in the default time-zone.
    def now(): MonthDay = ???

    @stub
    // Obtains the current month-day from the specified clock.
    def now(clock: Clock): MonthDay = ???

    @stub
    // Obtains the current month-day from the system clock in the specified time-zone.
    def now(zone: ZoneId): MonthDay = ???

    @stub
    // Obtains an instance of MonthDay.
    def of(month: Int, dayOfMonth: Int): MonthDay = ???

    @stub
    // Obtains an instance of MonthDay.
    def of(month: Month, dayOfMonth: Int): MonthDay = ???

    @stub
    // Obtains an instance of MonthDay from a text string such as --12-03.
    def parse(text: CharSequence): MonthDay = ???

    @stub
    // Obtains an instance of MonthDay from a text string using a specific formatter.
    def parse(text: CharSequence, formatter: DateTimeFormatter): MonthDay = ???
}
