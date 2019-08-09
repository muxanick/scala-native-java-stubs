package java.time.chrono

import java.io.Serializable
import java.lang.{Object, String}
import java.time.{Clock, LocalTime, ZoneId}
import java.time.temporal.{Temporal, TemporalAccessor, TemporalAdjuster, TemporalAmount, TemporalField, TemporalUnit, ValueRange}

// A date in the Thai Buddhist calendar system.
// 
// This date operates using the Thai Buddhist calendar.
// This calendar system is primarily used in Thailand.
// Dates are aligned such that 2484-01-01 (Buddhist) is 1941-01-01 (ISO).
//
// 
// This is a value-based
// class; use of identity-sensitive operations (including reference equality
// (==), identity hash code, or synchronization) on instances of
// ThaiBuddhistDate may have unpredictable results and should be avoided.
// The equals method should be used for comparisons.
final class ThaiBuddhistDate extends Object with ChronoLocalDate, with Serializable {

    @stub
    // Combines this date with a time to create a ChronoLocalDateTime.
    def atTime(localTime: LocalTime): ChronoLocalDateTime[ThaiBuddhistDate] = ???

    @stub
    // Compares this date to another date, including the chronology.
    def equals(obj: Object): Boolean = ???

    @stub
    // Gets the chronology of this date, which is the Thai Buddhist calendar system.
    def getChronology(): ThaiBuddhistChronology = ???

    @stub
    // Gets the era applicable at this date.
    def getEra(): ThaiBuddhistEra = ???

    @stub
    // Gets the value of the specified field as a long.
    def getLong(field: TemporalField): Long = ???

    @stub
    // A hash code for this date.
    def hashCode(): Int = ???

    @stub
    // Returns the length of the month represented by this date.
    def lengthOfMonth(): Int = ???

    @stub
    // Returns an object of the same type as this object with the specified period subtracted.
    def minus(amountToAdd: Long, unit: TemporalUnit): ThaiBuddhistDate = ???

    @stub
    // Returns an object of the same type as this object with an amount subtracted.
    def minus(amount: TemporalAmount): ThaiBuddhistDate = ???

    @stub
    // Returns an object of the same type as this object with the specified period added.
    def plus(amountToAdd: Long, unit: TemporalUnit): ThaiBuddhistDate = ???

    @stub
    // Returns an object of the same type as this object with an amount added.
    def plus(amount: TemporalAmount): ThaiBuddhistDate = ???

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
    def with(adjuster: TemporalAdjuster): ThaiBuddhistDate = ???
}

object ThaiBuddhistDate {
    @stub
    // Obtains a ThaiBuddhistDate from a temporal object.
    def from(temporal: TemporalAccessor): ThaiBuddhistDate = ???

    @stub
    // Obtains the current ThaiBuddhistDate from the system clock in the default time-zone.
    def now(): ThaiBuddhistDate = ???

    @stub
    // Obtains the current ThaiBuddhistDate from the specified clock.
    def now(clock: Clock): ThaiBuddhistDate = ???

    @stub
    // Obtains the current ThaiBuddhistDate from the system clock in the specified time-zone.
    def now(zone: ZoneId): ThaiBuddhistDate = ???

    @stub
    // Obtains a ThaiBuddhistDate representing a date in the Thai Buddhist calendar
    // system from the proleptic-year, month-of-year and day-of-month fields.
    def of(prolepticYear: Int, month: Int, dayOfMonth: Int): ThaiBuddhistDate = ???
}
