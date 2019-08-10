package java.time

import java.io.Serializable
import java.lang.{CharSequence, Object, String}
import java.time.chrono.{ChronoPeriod, IsoChronology}
import java.time.temporal.{Temporal, TemporalAmount, TemporalUnit}
import java.util.List
import scala.scalanative.annotation.stub

/** A date-based amount of time in the ISO-8601 calendar system,
 *  such as '2 years, 3 months and 4 days'.
 *  
 *  This class models a quantity or amount of time in terms of years, months and days.
 *  See Duration for the time-based equivalent to this class.
 *  
 *  Durations and periods differ in their treatment of daylight savings time
 *  when added to ZonedDateTime. A Duration will add an exact
 *  number of seconds, thus a duration of one day is always exactly 24 hours.
 *  By contrast, a Period will add a conceptual day, trying to maintain
 *  the local time.
 *  
 *  For example, consider adding a period of one day and a duration of one day to
 *  18:00 on the evening before a daylight savings gap. The Period will add
 *  the conceptual day and result in a ZonedDateTime at 18:00 the following day.
 *  By contrast, the Duration will add exactly 24 hours, resulting in a
 *  ZonedDateTime at 19:00 the following day (assuming a one hour DST gap).
 *  
 *  The supported units of a period are YEARS,
 *  MONTHS and DAYS.
 *  All three fields are always present, but may be set to zero.
 *  
 *  The ISO-8601 calendar system is the modern civil calendar system used today
 *  in most of the world. It is equivalent to the proleptic Gregorian calendar
 *  system, in which today's rules for leap years are applied for all time.
 *  
 *  The period is modeled as a directed amount of time, meaning that individual parts of the
 *  period may be negative.
 * 
 *  
 *  This is a value-based
 *  class; use of identity-sensitive operations (including reference equality
 *  (==), identity hash code, or synchronization) on instances of
 *  Period may have unpredictable results and should be avoided.
 *  The equals method should be used for comparisons.
 */
final class Period extends Object with ChronoPeriod with Serializable {

    /** Adds this period to the specified temporal object. */
    @stub
    def addTo(temporal: Temporal): Temporal = ???

    /** Checks if this period is equal to another period. */
    @stub
    def equals(obj: Any): Boolean = ???

    /** Gets the value of the requested unit. */
    @stub
    def get(unit: TemporalUnit): Long = ???

    /** Gets the chronology of this period, which is the ISO calendar system. */
    @stub
    def getChronology(): IsoChronology = ???

    /** Gets the amount of days of this period. */
    @stub
    def getDays(): Int = ???

    /** Gets the amount of months of this period. */
    @stub
    def getMonths(): Int = ???

    /** Gets the set of units supported by this period. */
    @stub
    def getUnits(): List[TemporalUnit] = ???

    /** Gets the amount of years of this period. */
    @stub
    def getYears(): Int = ???

    /** A hash code for this period. */
    @stub
    def hashCode(): Int = ???

    /** Checks if any of the three units of this period are negative. */
    @stub
    def isNegative(): Boolean = ???

    /** Checks if all three units of this period are zero. */
    @stub
    def isZero(): Boolean = ???

    /** Returns a copy of this period with the specified period subtracted. */
    @stub
    def minus(amountToSubtract: TemporalAmount): Period = ???

    /** Returns a copy of this period with the specified days subtracted. */
    @stub
    def minusDays(daysToSubtract: Long): Period = ???

    /** Returns a copy of this period with the specified months subtracted. */
    @stub
    def minusMonths(monthsToSubtract: Long): Period = ???

    /** Returns a copy of this period with the specified years subtracted. */
    @stub
    def minusYears(yearsToSubtract: Long): Period = ???

    /** Returns a new instance with each element in this period multiplied
     *  by the specified scalar.
     */
    @stub
    def multipliedBy(scalar: Int): Period = ???

    /** Returns a new instance with each amount in this period negated. */
    @stub
    def negated(): Period = ???

    /** Returns a copy of this period with the years and months normalized. */
    @stub
    def normalized(): Period = ???

    /** Returns a copy of this period with the specified period added. */
    @stub
    def plus(amountToAdd: TemporalAmount): Period = ???

    /** Returns a copy of this period with the specified days added. */
    @stub
    def plusDays(daysToAdd: Long): Period = ???

    /** Returns a copy of this period with the specified months added. */
    @stub
    def plusMonths(monthsToAdd: Long): Period = ???

    /** Returns a copy of this period with the specified years added. */
    @stub
    def plusYears(yearsToAdd: Long): Period = ???

    /** Subtracts this period from the specified temporal object. */
    @stub
    def subtractFrom(temporal: Temporal): Temporal = ???

    /** Outputs this period as a String, such as P6Y3M1D. */
    @stub
    def toString(): String = ???

    /** Gets the total number of months in this period. */
    @stub
    def toTotalMonths(): Long = ???

    /** Returns a copy of this period with the specified amount of days. */
    @stub
    def withDays(days: Int): Period = ???

    /** Returns a copy of this period with the specified amount of months. */
    @stub
    def withMonths(months: Int): Period = ???

    /** Returns a copy of this period with the specified amount of years. */
    @stub
    def withYears(years: Int): Period = ???
}

object Period {
    /** A constant for a period of zero. */
    @stub
    val ZERO: Period = ???

    /** Obtains a Period consisting of the number of years, months,
     *  and days between two dates.
     */
    @stub
    def between(startDateInclusive: LocalDate, endDateExclusive: LocalDate): Period = ???

    /** Obtains an instance of Period from a temporal amount. */
    @stub
    def from(amount: TemporalAmount): Period = ???

    /** Obtains a Period representing a number of years, months and days. */
    @stub
    def of(years: Int, months: Int, days: Int): Period = ???

    /** Obtains a Period representing a number of days. */
    @stub
    def ofDays(days: Int): Period = ???

    /** Obtains a Period representing a number of months. */
    @stub
    def ofMonths(months: Int): Period = ???

    /** Obtains a Period representing a number of weeks. */
    @stub
    def ofWeeks(weeks: Int): Period = ???

    /** Obtains a Period representing a number of years. */
    @stub
    def ofYears(years: Int): Period = ???

    /** Obtains a Period from a text string such as PnYnMnD. */
    @stub
    def parse(text: CharSequence): Period = ???
}
