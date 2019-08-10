package java.time.chrono

import java.io.Serializable
import java.lang.{Object, String}
import java.time.{Clock, LocalTime, ZoneId}
import java.time.temporal.{Temporal, TemporalAccessor, TemporalAdjuster, TemporalAmount, TemporalField, TemporalUnit, ValueRange}
import scala.scalanative.annotation.stub

/** A date in the Minguo calendar system.
 *  
 *  This date operates using the Minguo calendar.
 *  This calendar system is primarily used in the Republic of China, often known as Taiwan.
 *  Dates are aligned such that 0001-01-01 (Minguo) is 1912-01-01 (ISO).
 * 
 *  
 *  This is a value-based
 *  class; use of identity-sensitive operations (including reference equality
 *  (==), identity hash code, or synchronization) on instances of
 *  MinguoDate may have unpredictable results and should be avoided.
 *  The equals method should be used for comparisons.
 */
final class MinguoDate extends Object with ChronoLocalDate with Serializable {

    /** Combines this date with a time to create a ChronoLocalDateTime. */
    @stub
    def atTime(localTime: LocalTime): ChronoLocalDateTime[MinguoDate] = ???

    /** Compares this date to another date, including the chronology. */
    @stub
    def equals(obj: Any): Boolean = ???

    /** Gets the chronology of this date, which is the Minguo calendar system. */
    @stub
    def getChronology(): MinguoChronology = ???

    /** Gets the era applicable at this date. */
    @stub
    def getEra(): MinguoEra = ???

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
    def minus(amountToAdd: Long, unit: TemporalUnit): MinguoDate = ???

    /** Returns an object of the same type as this object with an amount subtracted. */
    @stub
    def minus(amount: TemporalAmount): MinguoDate = ???

    /** Returns an object of the same type as this object with the specified period added. */
    @stub
    def plus(amountToAdd: Long, unit: TemporalUnit): MinguoDate = ???

    /** Returns an object of the same type as this object with an amount added. */
    @stub
    def plus(amount: TemporalAmount): MinguoDate = ???

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
    def with(adjuster: TemporalAdjuster): MinguoDate = ???

    /** Returns an object of the same type as this object with the specified field altered. */
    @stub
    def with(field: TemporalField, newValue: Long): MinguoDate = ???
}

object MinguoDate {
    /** Obtains a MinguoDate from a temporal object. */
    @stub
    def from(temporal: TemporalAccessor): MinguoDate = ???

    /** Obtains the current MinguoDate from the system clock in the default time-zone. */
    @stub
    def now(): MinguoDate = ???

    /** Obtains the current MinguoDate from the specified clock. */
    @stub
    def now(clock: Clock): MinguoDate = ???

    /** Obtains the current MinguoDate from the system clock in the specified time-zone. */
    @stub
    def now(zone: ZoneId): MinguoDate = ???

    /** Obtains a MinguoDate representing a date in the Minguo calendar
     *  system from the proleptic-year, month-of-year and day-of-month fields.
     */
    @stub
    def of(prolepticYear: Int, month: Int, dayOfMonth: Int): MinguoDate = ???
}
