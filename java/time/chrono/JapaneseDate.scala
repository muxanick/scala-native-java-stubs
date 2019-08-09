package java.time.chrono

import java.io.Serializable
import java.lang.{Object, String}
import java.time.{Clock, LocalTime, ZoneId}
import java.time.temporal.{Temporal, TemporalAccessor, TemporalAdjuster, TemporalAmount, TemporalField, TemporalUnit, ValueRange}

// A date in the Japanese Imperial calendar system.
// 
// This date operates using the Japanese Imperial calendar.
// This calendar system is primarily used in Japan.
// 
// The Japanese Imperial calendar system is the same as the ISO calendar system
// apart from the era-based year numbering. The proleptic-year is defined to be
// equal to the ISO proleptic-year.
// 
// Japan introduced the Gregorian calendar starting with Meiji 6.
// Only Meiji and later eras are supported;
// dates before Meiji 6, January 1 are not supported.
// 
// For example, the Japanese year "Heisei 24" corresponds to ISO year "2012".
// Calling japaneseDate.get(YEAR_OF_ERA) will return 24.
// Calling japaneseDate.get(YEAR) will return 2012.
// Calling japaneseDate.get(ERA) will return 2, corresponding to
// JapaneseChronology.ERA_HEISEI.
//
// 
// This is a value-based
// class; use of identity-sensitive operations (including reference equality
// (==), identity hash code, or synchronization) on instances of
// JapaneseDate may have unpredictable results and should be avoided.
// The equals method should be used for comparisons.
final class JapaneseDate extends Object with ChronoLocalDate, with Serializable {

    @stub
    // Combines this date with a time to create a ChronoLocalDateTime.
    def atTime(localTime: LocalTime): ChronoLocalDateTime[JapaneseDate] = ???

    @stub
    // Compares this date to another date, including the chronology.
    def equals(obj: Object): Boolean = ???

    @stub
    // Gets the chronology of this date, which is the Japanese calendar system.
    def getChronology(): JapaneseChronology = ???

    @stub
    // Gets the era applicable at this date.
    def getEra(): JapaneseEra = ???

    @stub
    // Gets the value of the specified field as a long.
    def getLong(field: TemporalField): Long = ???

    @stub
    // A hash code for this date.
    def hashCode(): Int = ???

    @stub
    // Checks if the specified field is supported.
    def isSupported(field: TemporalField): Boolean = ???

    @stub
    // Returns the length of the month represented by this date.
    def lengthOfMonth(): Int = ???

    @stub
    // Returns the length of the year represented by this date, as defined by the calendar system.
    def lengthOfYear(): Int = ???

    @stub
    // Returns an object of the same type as this object with the specified period subtracted.
    def minus(amountToAdd: Long, unit: TemporalUnit): JapaneseDate = ???

    @stub
    // Returns an object of the same type as this object with an amount subtracted.
    def minus(amount: TemporalAmount): JapaneseDate = ???

    @stub
    // Returns an object of the same type as this object with the specified period added.
    def plus(amountToAdd: Long, unit: TemporalUnit): JapaneseDate = ???

    @stub
    // Returns an object of the same type as this object with an amount added.
    def plus(amount: TemporalAmount): JapaneseDate = ???

    @stub
    // Gets the range of valid values for the specified field.
    def range(field: TemporalField): ValueRange = ???

    @stub
    // Converts this date to the Epoch Day.
    def toEpochDay(): Long = ???

    @stub
    // Returns a string representation of the object.
    def toString(): String = ???

    @stub
    // Calculates the period between this date and another date as a ChronoPeriod.
    def until(endDate: ChronoLocalDate): ChronoPeriod = ???

    @stub
    // Calculates the amount of time until another date in terms of the specified unit.
    def until(endExclusive: Temporal, unit: TemporalUnit): Long = ???

    @stub
    // Returns an adjusted object of the same type as this object with the adjustment made.
    def with(adjuster: TemporalAdjuster): JapaneseDate = ???
}

object JapaneseDate {
    @stub
    // Obtains a JapaneseDate from a temporal object.
    def from(temporal: TemporalAccessor): JapaneseDate = ???

    @stub
    // Obtains the current JapaneseDate from the system clock in the default time-zone.
    def now(): JapaneseDate = ???

    @stub
    // Obtains the current JapaneseDate from the specified clock.
    def now(clock: Clock): JapaneseDate = ???

    @stub
    // Obtains the current JapaneseDate from the system clock in the specified time-zone.
    def now(zone: ZoneId): JapaneseDate = ???

    @stub
    // Obtains a JapaneseDate representing a date in the Japanese calendar
    // system from the proleptic-year, month-of-year and day-of-month fields.
    def of(prolepticYear: Int, month: Int, dayOfMonth: Int): JapaneseDate = ???

    @stub
    // Obtains a JapaneseDate representing a date in the Japanese calendar
    // system from the era, year-of-era, month-of-year and day-of-month fields.
    def of(era: JapaneseEra, yearOfEra: Int, month: Int, dayOfMonth: Int): JapaneseDate = ???
}
