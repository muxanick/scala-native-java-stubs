package java.time.temporal

import java.lang.{Enum, Object, String}
import java.util.Locale

// A standard set of fields.
// 
// This set of fields provide field-based access to manipulate a date, time or date-time.
// The standard set of fields can be extended by implementing TemporalField.
// 
// These fields are intended to be applicable in multiple calendar systems.
// For example, most non-ISO calendar systems define dates as a year, month and day,
// just with slightly different rules.
// The documentation of each field explains how it operates.
class ChronoField private (name: String, ordinal: Int) extends Enum[ChronoField](name, ordinal) with TemporalField {
}

object ChronoField {
    // The aligned day-of-week within a month.
    final val ALIGNED_DAY_OF_WEEK_IN_MONTH = new ChronoField(ALIGNED_DAY_OF_WEEK_IN_MONTH, 0)

    // The aligned day-of-week within a year.
    final val ALIGNED_DAY_OF_WEEK_IN_YEAR = new ChronoField(ALIGNED_DAY_OF_WEEK_IN_YEAR, 1)

    // The aligned week within a month.
    final val ALIGNED_WEEK_OF_MONTH = new ChronoField(ALIGNED_WEEK_OF_MONTH, 2)

    // The aligned week within a year.
    final val ALIGNED_WEEK_OF_YEAR = new ChronoField(ALIGNED_WEEK_OF_YEAR, 3)

    // The am-pm-of-day.
    final val AMPM_OF_DAY = new ChronoField(AMPM_OF_DAY, 4)

    // The clock-hour-of-am-pm.
    final val CLOCK_HOUR_OF_AMPM = new ChronoField(CLOCK_HOUR_OF_AMPM, 5)

    // The clock-hour-of-day.
    final val CLOCK_HOUR_OF_DAY = new ChronoField(CLOCK_HOUR_OF_DAY, 6)

    // The day-of-month.
    final val DAY_OF_MONTH = new ChronoField(DAY_OF_MONTH, 7)

    // The day-of-week, such as Tuesday.
    final val DAY_OF_WEEK = new ChronoField(DAY_OF_WEEK, 8)

    // The day-of-year.
    final val DAY_OF_YEAR = new ChronoField(DAY_OF_YEAR, 9)

    // The epoch-day, based on the Java epoch of 1970-01-01 (ISO).
    final val EPOCH_DAY = new ChronoField(EPOCH_DAY, 10)

    // The era.
    final val ERA = new ChronoField(ERA, 11)

    // The hour-of-am-pm.
    final val HOUR_OF_AMPM = new ChronoField(HOUR_OF_AMPM, 12)

    // The hour-of-day.
    final val HOUR_OF_DAY = new ChronoField(HOUR_OF_DAY, 13)

    // The instant epoch-seconds.
    final val INSTANT_SECONDS = new ChronoField(INSTANT_SECONDS, 14)

    // The micro-of-day.
    final val MICRO_OF_DAY = new ChronoField(MICRO_OF_DAY, 15)

    // The micro-of-second.
    final val MICRO_OF_SECOND = new ChronoField(MICRO_OF_SECOND, 16)

    // The milli-of-day.
    final val MILLI_OF_DAY = new ChronoField(MILLI_OF_DAY, 17)

    // The milli-of-second.
    final val MILLI_OF_SECOND = new ChronoField(MILLI_OF_SECOND, 18)

    // The minute-of-day.
    final val MINUTE_OF_DAY = new ChronoField(MINUTE_OF_DAY, 19)

    // The minute-of-hour.
    final val MINUTE_OF_HOUR = new ChronoField(MINUTE_OF_HOUR, 20)

    // The month-of-year, such as March.
    final val MONTH_OF_YEAR = new ChronoField(MONTH_OF_YEAR, 21)

    // The nano-of-day.
    final val NANO_OF_DAY = new ChronoField(NANO_OF_DAY, 22)

    // The nano-of-second.
    final val NANO_OF_SECOND = new ChronoField(NANO_OF_SECOND, 23)

    // The offset from UTC/Greenwich.
    final val OFFSET_SECONDS = new ChronoField(OFFSET_SECONDS, 24)

    // The proleptic-month based, counting months sequentially from year 0.
    final val PROLEPTIC_MONTH = new ChronoField(PROLEPTIC_MONTH, 25)

    // The second-of-day.
    final val SECOND_OF_DAY = new ChronoField(SECOND_OF_DAY, 26)

    // The second-of-minute.
    final val SECOND_OF_MINUTE = new ChronoField(SECOND_OF_MINUTE, 27)

    // The proleptic year, such as 2012.
    final val YEAR = new ChronoField(YEAR, 28)

    @stub
    // Returns a copy of the specified temporal object with the value of this field set.
    def R: [R <: Temporal] = ???

    @stub
    // Checks that the specified value is valid and fits in an int.
    def checkValidIntValue(value: Long): Int = ???

    @stub
    // Checks that the specified value is valid for this field.
    def checkValidValue(value: Long): Long = ???

    @stub
    // Gets the unit that the field is measured in.
    def getBaseUnit(): TemporalUnit = ???

    @stub
    // Gets the display name for the field in the requested locale.
    def getDisplayName(locale: Locale): String = ???

    @stub
    // Gets the value of this field from the specified temporal object.
    def getFrom(temporal: TemporalAccessor): Long = ???

    @stub
    // Gets the range that the field is bound by.
    def getRangeUnit(): TemporalUnit = ???

    @stub
    // Checks if this field represents a component of a date.
    def isDateBased(): Boolean = ???

    @stub
    // Checks if this field is supported by the temporal object.
    def isSupportedBy(temporal: TemporalAccessor): Boolean = ???

    @stub
    // Checks if this field represents a component of a time.
    def isTimeBased(): Boolean = ???

    @stub
    // Gets the range of valid values for the field.
    def range(): ValueRange = ???

    @stub
    // Get the range of valid values for this field using the temporal object to
    // refine the result.
    def rangeRefinedBy(temporal: TemporalAccessor): ValueRange = ???

    @stub
    // Returns the name of this enum constant, as contained in the
    // declaration.
    def toString(): String = ???

    @stub
    // Returns the enum constant of this type with the specified name.
    def valueOf(name: String): ChronoField = ???
}