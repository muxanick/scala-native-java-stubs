package java.time.chrono

import java.io.Serializable
import java.lang.{Object, String}
import java.time.{Clock, LocalTime, ZoneId}
import java.time.temporal.{Temporal, TemporalAccessor, TemporalAdjuster, TemporalAmount, TemporalField, TemporalUnit, ValueRange}

// A date in the Hijrah calendar system.
// 
// This date operates using one of several variants of the
// Hijrah calendar.
// 
// The Hijrah calendar has a different total of days in a year than
// Gregorian calendar, and the length of each month is based on the period
// of a complete revolution of the moon around the earth
// (as between successive new moons).
// Refer to the HijrahChronology for details of supported variants.
// 
// Each HijrahDate is created bound to a particular HijrahChronology,
// The same chronology is propagated to each HijrahDate computed from the date.
// To use a different Hijrah variant, its HijrahChronology can be used
// to create new HijrahDate instances.
// Alternatively, the withVariant(java.time.chrono.HijrahChronology) method can be used to convert
// to a new HijrahChronology.
//
// 
// This is a value-based
// class; use of identity-sensitive operations (including reference equality
// (==), identity hash code, or synchronization) on instances of
// HijrahDate may have unpredictable results and should be avoided.
// The equals method should be used for comparisons.
final class HijrahDate extends Object with ChronoLocalDate, with Serializable {

    @stub
    // Combines this date with a time to create a ChronoLocalDateTime.
    def atTime(localTime: LocalTime): ChronoLocalDateTime[HijrahDate] = ???

    @stub
    // Compares this date to another date, including the chronology.
    def equals(obj: Object): Boolean = ???

    @stub
    // Gets the chronology of this date, which is the Hijrah calendar system.
    def getChronology(): HijrahChronology = ???

    @stub
    // Gets the era applicable at this date.
    def getEra(): HijrahEra = ???

    @stub
    // Gets the value of the specified field as a long.
    def getLong(field: TemporalField): Long = ???

    @stub
    // A hash code for this date.
    def hashCode(): Int = ???

    @stub
    // Checks if the year is a leap year, according to the Hijrah calendar system rules.
    def isLeapYear(): Boolean = ???

    @stub
    // Returns the length of the month represented by this date.
    def lengthOfMonth(): Int = ???

    @stub
    // Returns the length of the year represented by this date.
    def lengthOfYear(): Int = ???

    @stub
    // Returns an object of the same type as this object with the specified period subtracted.
    def minus(amountToSubtract: Long, unit: TemporalUnit): HijrahDate = ???

    @stub
    // Returns an object of the same type as this object with an amount subtracted.
    def minus(amount: TemporalAmount): HijrahDate = ???

    @stub
    // Returns an object of the same type as this object with the specified period added.
    def plus(amountToAdd: Long, unit: TemporalUnit): HijrahDate = ???

    @stub
    // Returns an object of the same type as this object with an amount added.
    def plus(amount: TemporalAmount): HijrahDate = ???

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
    def with(adjuster: TemporalAdjuster): HijrahDate = ???

    @stub
    // Returns an object of the same type as this object with the specified field altered.
    def with(field: TemporalField, newValue: Long): HijrahDate = ???
}

object HijrahDate {
    @stub
    // Obtains a HijrahDate of the Islamic Umm Al-Qura calendar from a temporal object.
    def from(temporal: TemporalAccessor): HijrahDate = ???

    @stub
    // Obtains the current HijrahDate of the Islamic Umm Al-Qura calendar
    // in the default time-zone.
    def now(): HijrahDate = ???

    @stub
    // Obtains the current HijrahDate of the Islamic Umm Al-Qura calendar
    // from the specified clock.
    def now(clock: Clock): HijrahDate = ???

    @stub
    // Obtains the current HijrahDate of the Islamic Umm Al-Qura calendar
    // in the specified time-zone.
    def now(zone: ZoneId): HijrahDate = ???

    @stub
    // Obtains a HijrahDate of the Islamic Umm Al-Qura calendar
    // from the proleptic-year, month-of-year and day-of-month fields.
    def of(prolepticYear: Int, month: Int, dayOfMonth: Int): HijrahDate = ???
}
