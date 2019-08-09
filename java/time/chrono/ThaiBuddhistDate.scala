package java.time.chrono

import java.io.Serializable
import java.lang.{Object, String}
import java.time.{Clock, LocalTime, ZoneId}
import java.time.temporal.{Temporal, TemporalAccessor, TemporalAdjuster, TemporalAmount, TemporalField, TemporalUnit, ValueRange}

/** A date in the Thai Buddhist calendar system.
 *  
 *  This date operates using the Thai Buddhist calendar.
 *  This calendar system is primarily used in Thailand.
 *  Dates are aligned such that 2484-01-01 (Buddhist) is 1941-01-01 (ISO).
 * 
 *  
 *  This is a value-based
 *  class; use of identity-sensitive operations (including reference equality
 *  (==), identity hash code, or synchronization) on instances of
 *  ThaiBuddhistDate may have unpredictable results and should be avoided.
 *  The equals method should be used for comparisons.
 */
final class ThaiBuddhistDate extends Object with ChronoLocalDate with Serializable {

    /** Combines this date with a time to create a ChronoLocalDateTime. */
    @stub
    def atTime(localTime: LocalTime): ChronoLocalDateTime[ThaiBuddhistDate] = ???

    /** Compares this date to another date, including the chronology. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Gets the chronology of this date, which is the Thai Buddhist calendar system. */
    @stub
    def getChronology(): ThaiBuddhistChronology = ???

    /** Gets the era applicable at this date. */
    @stub
    def getEra(): ThaiBuddhistEra = ???

    /** Gets the value of the specified field as a long. */
    @stub
    def getLong(field: TemporalField): Long = ???

    /** A hash code for this date. */
    @stub
    def hashCode(): Int = ???

    /** Returns the length of the month represented by this date. */
    @stub
    def lengthOfMonth(): Int = ???

    /** Returns an object of the same type as this object with the specified period subtracted. */
    @stub
    def minus(amountToAdd: Long, unit: TemporalUnit): ThaiBuddhistDate = ???

    /** Returns an object of the same type as this object with an amount subtracted. */
    @stub
    def minus(amount: TemporalAmount): ThaiBuddhistDate = ???

    /** Returns an object of the same type as this object with the specified period added. */
    @stub
    def plus(amountToAdd: Long, unit: TemporalUnit): ThaiBuddhistDate = ???

    /** Returns an object of the same type as this object with an amount added. */
    @stub
    def plus(amount: TemporalAmount): ThaiBuddhistDate = ???

    /** Gets the range of valid values for the specified field. */
    @stub
    def range(field: TemporalField): ValueRange = ???

    /** Converts this date to the Epoch Day. */
    @stub
    def toEpochDay(): Long = ???

    /** Returns a string representation of the object. */
    @stub
    def toString(): String = ???

    /** Calculates the period between this date and another date as a ChronoPeriod. */
    @stub
    def until(endDate: ChronoLocalDate): ChronoPeriod = ???

    /** Calculates the amount of time until another date in terms of the specified unit. */
    @stub
    def until(endExclusive: Temporal, unit: TemporalUnit): Long = ???

    /** Returns an adjusted object of the same type as this object with the adjustment made. */
    @stub
    def with(adjuster: TemporalAdjuster): ThaiBuddhistDate = ???
}

object ThaiBuddhistDate {
    /** Obtains a ThaiBuddhistDate from a temporal object. */
    @stub
    def from(temporal: TemporalAccessor): ThaiBuddhistDate = ???

    /** Obtains the current ThaiBuddhistDate from the system clock in the default time-zone. */
    @stub
    def now(): ThaiBuddhistDate = ???

    /** Obtains the current ThaiBuddhistDate from the specified clock. */
    @stub
    def now(clock: Clock): ThaiBuddhistDate = ???

    /** Obtains the current ThaiBuddhistDate from the system clock in the specified time-zone. */
    @stub
    def now(zone: ZoneId): ThaiBuddhistDate = ???

    /** Obtains a ThaiBuddhistDate representing a date in the Thai Buddhist calendar
     *  system from the proleptic-year, month-of-year and day-of-month fields.
     */
    @stub
    def of(prolepticYear: Int, month: Int, dayOfMonth: Int): ThaiBuddhistDate = ???
}
