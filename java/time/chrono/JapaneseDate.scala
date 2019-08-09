package java.time.chrono

import java.io.Serializable
import java.lang.{Object, String}
import java.time.{Clock, LocalTime, ZoneId}
import java.time.temporal.{Temporal, TemporalAccessor, TemporalAdjuster, TemporalAmount, TemporalField, TemporalUnit, ValueRange}

/** A date in the Japanese Imperial calendar system.
 *  
 *  This date operates using the Japanese Imperial calendar.
 *  This calendar system is primarily used in Japan.
 *  
 *  The Japanese Imperial calendar system is the same as the ISO calendar system
 *  apart from the era-based year numbering. The proleptic-year is defined to be
 *  equal to the ISO proleptic-year.
 *  
 *  Japan introduced the Gregorian calendar starting with Meiji 6.
 *  Only Meiji and later eras are supported;
 *  dates before Meiji 6, January 1 are not supported.
 *  
 *  For example, the Japanese year "Heisei 24" corresponds to ISO year "2012".
 *  Calling japaneseDate.get(YEAR_OF_ERA) will return 24.
 *  Calling japaneseDate.get(YEAR) will return 2012.
 *  Calling japaneseDate.get(ERA) will return 2, corresponding to
 *  JapaneseChronology.ERA_HEISEI.
 * 
 *  
 *  This is a value-based
 *  class; use of identity-sensitive operations (including reference equality
 *  (==), identity hash code, or synchronization) on instances of
 *  JapaneseDate may have unpredictable results and should be avoided.
 *  The equals method should be used for comparisons.
 */
final class JapaneseDate extends Object with ChronoLocalDate with Serializable {

    /** Combines this date with a time to create a ChronoLocalDateTime. */
    @stub
    def atTime(localTime: LocalTime): ChronoLocalDateTime[JapaneseDate] = ???

    /** Compares this date to another date, including the chronology. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Gets the chronology of this date, which is the Japanese calendar system. */
    @stub
    def getChronology(): JapaneseChronology = ???

    /** Gets the era applicable at this date. */
    @stub
    def getEra(): JapaneseEra = ???

    /** Gets the value of the specified field as a long. */
    @stub
    def getLong(field: TemporalField): Long = ???

    /** A hash code for this date. */
    @stub
    def hashCode(): Int = ???

    /** Checks if the specified field is supported. */
    @stub
    def isSupported(field: TemporalField): Boolean = ???

    /** Returns the length of the month represented by this date. */
    @stub
    def lengthOfMonth(): Int = ???

    /** Returns the length of the year represented by this date, as defined by the calendar system. */
    @stub
    def lengthOfYear(): Int = ???

    /** Returns an object of the same type as this object with the specified period subtracted. */
    @stub
    def minus(amountToAdd: Long, unit: TemporalUnit): JapaneseDate = ???

    /** Returns an object of the same type as this object with an amount subtracted. */
    @stub
    def minus(amount: TemporalAmount): JapaneseDate = ???

    /** Returns an object of the same type as this object with the specified period added. */
    @stub
    def plus(amountToAdd: Long, unit: TemporalUnit): JapaneseDate = ???

    /** Returns an object of the same type as this object with an amount added. */
    @stub
    def plus(amount: TemporalAmount): JapaneseDate = ???

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
    def with(adjuster: TemporalAdjuster): JapaneseDate = ???
}

object JapaneseDate {
    /** Obtains a JapaneseDate from a temporal object. */
    @stub
    def from(temporal: TemporalAccessor): JapaneseDate = ???

    /** Obtains the current JapaneseDate from the system clock in the default time-zone. */
    @stub
    def now(): JapaneseDate = ???

    /** Obtains the current JapaneseDate from the specified clock. */
    @stub
    def now(clock: Clock): JapaneseDate = ???

    /** Obtains the current JapaneseDate from the system clock in the specified time-zone. */
    @stub
    def now(zone: ZoneId): JapaneseDate = ???

    /** Obtains a JapaneseDate representing a date in the Japanese calendar
     *  system from the proleptic-year, month-of-year and day-of-month fields.
     */
    @stub
    def of(prolepticYear: Int, month: Int, dayOfMonth: Int): JapaneseDate = ???

    /** Obtains a JapaneseDate representing a date in the Japanese calendar
     *  system from the era, year-of-era, month-of-year and day-of-month fields.
     */
    @stub
    def of(era: JapaneseEra, yearOfEra: Int, month: Int, dayOfMonth: Int): JapaneseDate = ???
}
