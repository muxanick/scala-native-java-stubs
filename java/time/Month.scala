package java.time

import java.lang.{Enum, Object, String}
import java.time.format.TextStyle
import java.time.temporal.{Temporal, TemporalAccessor, TemporalAdjuster, TemporalField, TemporalQuery, ValueRange}
import java.util.Locale

// A month-of-year, such as 'July'.
// 
// Month is an enum representing the 12 months of the year -
// January, February, March, April, May, June, July, August, September, October,
// November and December.
// 
// In addition to the textual enum name, each month-of-year has an int value.
// The int value follows normal usage and the ISO-8601 standard,
// from 1 (January) to 12 (December). It is recommended that applications use the enum
// rather than the int value to ensure code clarity.
// 
// Do not use ordinal() to obtain the numeric representation of Month.
// Use getValue() instead.
// 
// This enum represents a common concept that is found in many calendar systems.
// As such, this enum may be used by any calendar system that has the month-of-year
// concept defined exactly equivalent to the ISO-8601 calendar system.
class Month private (name: String, ordinal: Int) extends Enum[Month](name, ordinal) with TemporalAccessor, with TemporalAdjuster {
}

object Month {
    // The singleton instance for the month of April with 30 days.
    final val APRIL = new Month(APRIL, 0)

    // The singleton instance for the month of August with 31 days.
    final val AUGUST = new Month(AUGUST, 1)

    // The singleton instance for the month of December with 31 days.
    final val DECEMBER = new Month(DECEMBER, 2)

    // The singleton instance for the month of February with 28 days, or 29 in a leap year.
    final val FEBRUARY = new Month(FEBRUARY, 3)

    // The singleton instance for the month of January with 31 days.
    final val JANUARY = new Month(JANUARY, 4)

    // The singleton instance for the month of July with 31 days.
    final val JULY = new Month(JULY, 5)

    // The singleton instance for the month of June with 30 days.
    final val JUNE = new Month(JUNE, 6)

    // The singleton instance for the month of March with 31 days.
    final val MARCH = new Month(MARCH, 7)

    // The singleton instance for the month of May with 31 days.
    final val MAY = new Month(MAY, 8)

    // The singleton instance for the month of November with 30 days.
    final val NOVEMBER = new Month(NOVEMBER, 9)

    // The singleton instance for the month of October with 31 days.
    final val OCTOBER = new Month(OCTOBER, 10)

    @stub
    // Adjusts the specified temporal object to have this month-of-year.
    def adjustInto(temporal: Temporal): Temporal = ???

    @stub
    // Gets the day-of-year corresponding to the first day of this month.
    def firstDayOfYear(leapYear: Boolean): Int = ???

    @stub
    // Gets the month corresponding to the first month of this quarter.
    def firstMonthOfQuarter(): Month = ???

    @stub
    // Obtains an instance of Month from a temporal object.
    def from(temporal: TemporalAccessor): Month = ???

    @stub
    // Gets the value of the specified field from this month-of-year as an int.
    def get(field: TemporalField): Int = ???

    @stub
    // Gets the textual representation, such as 'Jan' or 'December'.
    def getDisplayName(style: TextStyle, locale: Locale): String = ???

    @stub
    // Gets the value of the specified field from this month-of-year as a long.
    def getLong(field: TemporalField): Long = ???

    @stub
    // Gets the month-of-year int value.
    def getValue(): Int = ???

    @stub
    // Checks if the specified field is supported.
    def isSupported(field: TemporalField): Boolean = ???

    @stub
    // Gets the length of this month in days.
    def length(leapYear: Boolean): Int = ???

    @stub
    // Gets the maximum length of this month in days.
    def maxLength(): Int = ???

    @stub
    // Gets the minimum length of this month in days.
    def minLength(): Int = ???

    @stub
    // Returns the month-of-year that is the specified number of months before this one.
    def minus(months: Long): Month = ???

    @stub
    // Obtains an instance of Month from an int value.
    def of(month: Int): Month = ???

    @stub
    // Returns the month-of-year that is the specified number of quarters after this one.
    def plus(months: Long): Month = ???

    @stub
    // Queries this month-of-year using the specified query.
    def R: [R] = ???

    @stub
    // Gets the range of valid values for the specified field.
    def range(field: TemporalField): ValueRange = ???

    @stub
    // Returns the enum constant of this type with the specified name.
    def valueOf(name: String): Month = ???
}
