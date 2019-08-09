package java.time

import java.lang.{Enum, Object, String}
import java.time.format.TextStyle
import java.time.temporal.{Temporal, TemporalAccessor, TemporalAdjuster, TemporalField, TemporalQuery, ValueRange}
import java.util.Locale

// A day-of-week, such as 'Tuesday'.
// 
// DayOfWeek is an enum representing the 7 days of the week -
// Monday, Tuesday, Wednesday, Thursday, Friday, Saturday and Sunday.
// 
// In addition to the textual enum name, each day-of-week has an int value.
// The int value follows the ISO-8601 standard, from 1 (Monday) to 7 (Sunday).
// It is recommended that applications use the enum rather than the int value
// to ensure code clarity.
// 
// This enum provides access to the localized textual form of the day-of-week.
// Some locales also assign different numeric values to the days, declaring
// Sunday to have the value 1, however this class provides no support for this.
// See WeekFields for localized week-numbering.
// 
// Do not use ordinal() to obtain the numeric representation of DayOfWeek.
// Use getValue() instead.
// 
// This enum represents a common concept that is found in many calendar systems.
// As such, this enum may be used by any calendar system that has the day-of-week
// concept defined exactly equivalent to the ISO calendar system.
class DayOfWeek private (name: String, ordinal: Int) extends Enum[DayOfWeek](name, ordinal) with TemporalAccessor, with TemporalAdjuster {
}

object DayOfWeek {
    // The singleton instance for the day-of-week of Friday.
    final val FRIDAY = new DayOfWeek(FRIDAY, 0)

    // The singleton instance for the day-of-week of Monday.
    final val MONDAY = new DayOfWeek(MONDAY, 1)

    // The singleton instance for the day-of-week of Saturday.
    final val SATURDAY = new DayOfWeek(SATURDAY, 2)

    // The singleton instance for the day-of-week of Sunday.
    final val SUNDAY = new DayOfWeek(SUNDAY, 3)

    // The singleton instance for the day-of-week of Thursday.
    final val THURSDAY = new DayOfWeek(THURSDAY, 4)

    // The singleton instance for the day-of-week of Tuesday.
    final val TUESDAY = new DayOfWeek(TUESDAY, 5)

    @stub
    // Adjusts the specified temporal object to have this day-of-week.
    def adjustInto(temporal: Temporal): Temporal = ???

    @stub
    // Obtains an instance of DayOfWeek from a temporal object.
    def from(temporal: TemporalAccessor): DayOfWeek = ???

    @stub
    // Gets the value of the specified field from this day-of-week as an int.
    def get(field: TemporalField): Int = ???

    @stub
    // Gets the textual representation, such as 'Mon' or 'Friday'.
    def getDisplayName(style: TextStyle, locale: Locale): String = ???

    @stub
    // Gets the value of the specified field from this day-of-week as a long.
    def getLong(field: TemporalField): Long = ???

    @stub
    // Gets the day-of-week int value.
    def getValue(): Int = ???

    @stub
    // Checks if the specified field is supported.
    def isSupported(field: TemporalField): Boolean = ???

    @stub
    // Returns the day-of-week that is the specified number of days before this one.
    def minus(days: Long): DayOfWeek = ???

    @stub
    // Obtains an instance of DayOfWeek from an int value.
    def of(dayOfWeek: Int): DayOfWeek = ???

    @stub
    // Returns the day-of-week that is the specified number of days after this one.
    def plus(days: Long): DayOfWeek = ???

    @stub
    // Queries this day-of-week using the specified query.
    def R: [R] = ???

    @stub
    // Gets the range of valid values for the specified field.
    def range(field: TemporalField): ValueRange = ???

    @stub
    // Returns the enum constant of this type with the specified name.
    def valueOf(name: String): DayOfWeek = ???
}
