package java.time

import java.lang.{Enum, Object, String}
import java.time.format.TextStyle
import java.time.temporal.{Temporal, TemporalAccessor, TemporalAdjuster, TemporalField, TemporalQuery, ValueRange}
import java.util.Locale
import scala.scalanative.annotation.stub

/** A month-of-year, such as 'July'.
 *  
 *  Month is an enum representing the 12 months of the year -
 *  January, February, March, April, May, June, July, August, September, October,
 *  November and December.
 *  
 *  In addition to the textual enum name, each month-of-year has an int value.
 *  The int value follows normal usage and the ISO-8601 standard,
 *  from 1 (January) to 12 (December). It is recommended that applications use the enum
 *  rather than the int value to ensure code clarity.
 *  
 *  Do not use ordinal() to obtain the numeric representation of Month.
 *  Use getValue() instead.
 *  
 *  This enum represents a common concept that is found in many calendar systems.
 *  As such, this enum may be used by any calendar system that has the month-of-year
 *  concept defined exactly equivalent to the ISO-8601 calendar system.
 */
class Month private (name: String, ordinal: Int) extends Enum[Month](name, ordinal) with TemporalAccessor with TemporalAdjuster {

    /** Adjusts the specified temporal object to have this month-of-year. */
    @stub
    def adjustInto(temporal: Temporal): Temporal = ???

    /** Gets the day-of-year corresponding to the first day of this month. */
    @stub
    def firstDayOfYear(leapYear: Boolean): Int = ???

    /** Gets the month corresponding to the first month of this quarter. */
    @stub
    def firstMonthOfQuarter(): Month = ???

    /** Gets the value of the specified field from this month-of-year as an int. */
    @stub
    def get(field: TemporalField): Int = ???

    /** Gets the textual representation, such as 'Jan' or 'December'. */
    @stub
    def getDisplayName(style: TextStyle, locale: Locale): String = ???

    /** Gets the value of the specified field from this month-of-year as a long. */
    @stub
    def getLong(field: TemporalField): Long = ???

    /** Gets the month-of-year int value. */
    @stub
    def getValue(): Int = ???

    /** Checks if the specified field is supported. */
    @stub
    def isSupported(field: TemporalField): Boolean = ???

    /** Gets the length of this month in days. */
    @stub
    def length(leapYear: Boolean): Int = ???

    /** Gets the maximum length of this month in days. */
    @stub
    def maxLength(): Int = ???

    /** Gets the minimum length of this month in days. */
    @stub
    def minLength(): Int = ???

    /** Returns the month-of-year that is the specified number of months before this one. */
    @stub
    def minus(months: Long): Month = ???

    /** Returns the month-of-year that is the specified number of quarters after this one. */
    @stub
    def plus(months: Long): Month = ???

    /** Queries this month-of-year using the specified query. */
    @stub
    def query[R](query: TemporalQuery[R]): R = ???

    /** Gets the range of valid values for the specified field. */
    @stub
    def range(field: TemporalField): ValueRange = ???
}

object Month {
    /** The singleton instance for the month of April with 30 days. */
    final val APRIL: Month = new Month("APRIL", 0)

    /** The singleton instance for the month of August with 31 days. */
    final val AUGUST: Month = new Month("AUGUST", 1)

    /** The singleton instance for the month of December with 31 days. */
    final val DECEMBER: Month = new Month("DECEMBER", 2)

    /** The singleton instance for the month of February with 28 days, or 29 in a leap year. */
    final val FEBRUARY: Month = new Month("FEBRUARY", 3)

    /** The singleton instance for the month of January with 31 days. */
    final val JANUARY: Month = new Month("JANUARY", 4)

    /** The singleton instance for the month of July with 31 days. */
    final val JULY: Month = new Month("JULY", 5)

    /** The singleton instance for the month of June with 30 days. */
    final val JUNE: Month = new Month("JUNE", 6)

    /** The singleton instance for the month of March with 31 days. */
    final val MARCH: Month = new Month("MARCH", 7)

    /** The singleton instance for the month of May with 31 days. */
    final val MAY: Month = new Month("MAY", 8)

    /** The singleton instance for the month of November with 30 days. */
    final val NOVEMBER: Month = new Month("NOVEMBER", 9)

    /** The singleton instance for the month of October with 31 days. */
    final val OCTOBER: Month = new Month("OCTOBER", 10)

    /** The singleton instance for the month of September with 30 days. */
    final val SEPTEMBER: Month = new Month("SEPTEMBER", 11)

    /** Obtains an instance of Month from a temporal object. */
    @stub
    def from(temporal: TemporalAccessor): Month = ???

    /** Obtains an instance of Month from an int value. */
    @stub
    def of(month: Int): Month = ???

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): Month = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[Month] = ???
}
