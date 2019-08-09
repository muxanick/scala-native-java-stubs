package java.time.chrono

import java.io.Serializable
import java.lang.{Object, String}
import java.time.{Clock, LocalTime, ZoneId}
import java.time.temporal.{Temporal, TemporalAccessor, TemporalAdjuster, TemporalAmount, TemporalField, TemporalUnit, ValueRange}

/** A date in the Hijrah calendar system.
 *  
 *  This date operates using one of several variants of the
 *  Hijrah calendar.
 *  
 *  The Hijrah calendar has a different total of days in a year than
 *  Gregorian calendar, and the length of each month is based on the period
 *  of a complete revolution of the moon around the earth
 *  (as between successive new moons).
 *  Refer to the HijrahChronology for details of supported variants.
 *  
 *  Each HijrahDate is created bound to a particular HijrahChronology,
 *  The same chronology is propagated to each HijrahDate computed from the date.
 *  To use a different Hijrah variant, its HijrahChronology can be used
 *  to create new HijrahDate instances.
 *  Alternatively, the withVariant(java.time.chrono.HijrahChronology) method can be used to convert
 *  to a new HijrahChronology.
 * 
 *  
 *  This is a value-based
 *  class; use of identity-sensitive operations (including reference equality
 *  (==), identity hash code, or synchronization) on instances of
 *  HijrahDate may have unpredictable results and should be avoided.
 *  The equals method should be used for comparisons.
 */
final class HijrahDate extends Object with ChronoLocalDate with Serializable {

    /** Combines this date with a time to create a ChronoLocalDateTime. */
    @stub
    def atTime(localTime: LocalTime): ChronoLocalDateTime[HijrahDate] = ???

    /** Compares this date to another date, including the chronology. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Gets the chronology of this date, which is the Hijrah calendar system. */
    @stub
    def getChronology(): HijrahChronology = ???

    /** Gets the era applicable at this date. */
    @stub
    def getEra(): HijrahEra = ???

    /** Gets the value of the specified field as a long. */
    @stub
    def getLong(field: TemporalField): Long = ???

    /** A hash code for this date. */
    @stub
    def hashCode(): Int = ???

    /** Checks if the year is a leap year, according to the Hijrah calendar system rules. */
    @stub
    def isLeapYear(): Boolean = ???

    /** Returns the length of the month represented by this date. */
    @stub
    def lengthOfMonth(): Int = ???

    /** Returns the length of the year represented by this date. */
    @stub
    def lengthOfYear(): Int = ???

    /** Returns an object of the same type as this object with the specified period subtracted. */
    @stub
    def minus(amountToSubtract: Long, unit: TemporalUnit): HijrahDate = ???

    /** Returns an object of the same type as this object with an amount subtracted. */
    @stub
    def minus(amount: TemporalAmount): HijrahDate = ???

    /** Returns an object of the same type as this object with the specified period added. */
    @stub
    def plus(amountToAdd: Long, unit: TemporalUnit): HijrahDate = ???

    /** Returns an object of the same type as this object with an amount added. */
    @stub
    def plus(amount: TemporalAmount): HijrahDate = ???

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
    def with(adjuster: TemporalAdjuster): HijrahDate = ???

    /** Returns an object of the same type as this object with the specified field altered. */
    @stub
    def with(field: TemporalField, newValue: Long): HijrahDate = ???
}

object HijrahDate {
    /** Obtains a HijrahDate of the Islamic Umm Al-Qura calendar from a temporal object. */
    @stub
    def from(temporal: TemporalAccessor): HijrahDate = ???

    /** Obtains the current HijrahDate of the Islamic Umm Al-Qura calendar
     *  in the default time-zone.
     */
    @stub
    def now(): HijrahDate = ???

    /** Obtains the current HijrahDate of the Islamic Umm Al-Qura calendar
     *  from the specified clock.
     */
    @stub
    def now(clock: Clock): HijrahDate = ???

    /** Obtains the current HijrahDate of the Islamic Umm Al-Qura calendar
     *  in the specified time-zone.
     */
    @stub
    def now(zone: ZoneId): HijrahDate = ???

    /** Obtains a HijrahDate of the Islamic Umm Al-Qura calendar
     *  from the proleptic-year, month-of-year and day-of-month fields.
     */
    @stub
    def of(prolepticYear: Int, month: Int, dayOfMonth: Int): HijrahDate = ???
}
