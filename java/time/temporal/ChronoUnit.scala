package java.time.temporal

import java.lang.{Enum, Object, String}
import java.time.Duration

// A standard set of date periods units.
// 
// This set of units provide unit-based access to manipulate a date, time or date-time.
// The standard set of units can be extended by implementing TemporalUnit.
// 
// These units are intended to be applicable in multiple calendar systems.
// For example, most non-ISO calendar systems define units of years, months and days,
// just with slightly different rules.
// The documentation of each unit explains how it operates.
class ChronoUnit private (name: String, ordinal: Int) extends Enum[ChronoUnit](name, ordinal) with TemporalUnit {
}

object ChronoUnit {
    // Unit that represents the concept of a century.
    final val CENTURIES = new ChronoUnit(CENTURIES, 0)

    // Unit that represents the concept of a day.
    final val DAYS = new ChronoUnit(DAYS, 1)

    // Unit that represents the concept of a decade.
    final val DECADES = new ChronoUnit(DECADES, 2)

    // Unit that represents the concept of an era.
    final val ERAS = new ChronoUnit(ERAS, 3)

    // Artificial unit that represents the concept of forever.
    final val FOREVER = new ChronoUnit(FOREVER, 4)

    // Unit that represents the concept of half a day, as used in AM/PM.
    final val HALF_DAYS = new ChronoUnit(HALF_DAYS, 5)

    // Unit that represents the concept of an hour.
    final val HOURS = new ChronoUnit(HOURS, 6)

    // Unit that represents the concept of a microsecond.
    final val MICROS = new ChronoUnit(MICROS, 7)

    // Unit that represents the concept of a millennium.
    final val MILLENNIA = new ChronoUnit(MILLENNIA, 8)

    // Unit that represents the concept of a millisecond.
    final val MILLIS = new ChronoUnit(MILLIS, 9)

    // Unit that represents the concept of a minute.
    final val MINUTES = new ChronoUnit(MINUTES, 10)

    // Unit that represents the concept of a month.
    final val MONTHS = new ChronoUnit(MONTHS, 11)

    // Unit that represents the concept of a nanosecond, the smallest supported unit of time.
    final val NANOS = new ChronoUnit(NANOS, 12)

    // Unit that represents the concept of a second.
    final val SECONDS = new ChronoUnit(SECONDS, 13)

    // Unit that represents the concept of a week.
    final val WEEKS = new ChronoUnit(WEEKS, 14)

    @stub
    // Returns a copy of the specified temporal object with the specified period added.
    def R: [R <: Temporal] = ???

    @stub
    // Calculates the amount of time between two temporal objects.
    def between(temporal1Inclusive: Temporal, temporal2Exclusive: Temporal): Long = ???

    @stub
    // Gets the estimated duration of this unit in the ISO calendar system.
    def getDuration(): Duration = ???

    @stub
    // Checks if this unit is a date unit.
    def isDateBased(): Boolean = ???

    @stub
    // Checks if the duration of the unit is an estimate.
    def isDurationEstimated(): Boolean = ???

    @stub
    // Checks if this unit is supported by the specified temporal object.
    def isSupportedBy(temporal: Temporal): Boolean = ???

    @stub
    // Checks if this unit is a time unit.
    def isTimeBased(): Boolean = ???

    @stub
    // Returns the name of this enum constant, as contained in the
    // declaration.
    def toString(): String = ???

    @stub
    // Returns the enum constant of this type with the specified name.
    def valueOf(name: String): ChronoUnit = ???
}
