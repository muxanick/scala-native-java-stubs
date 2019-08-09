package java.time

import java.io.Serializable
import java.lang.{CharSequence, Object, String}
import java.time.chrono.{ChronoPeriod, IsoChronology}
import java.time.temporal.{Temporal, TemporalAmount, TemporalUnit}
import java.util.List

// A date-based amount of time in the ISO-8601 calendar system,
// such as '2 years, 3 months and 4 days'.
// 
// This class models a quantity or amount of time in terms of years, months and days.
// See Duration for the time-based equivalent to this class.
// 
// Durations and periods differ in their treatment of daylight savings time
// when added to ZonedDateTime. A Duration will add an exact
// number of seconds, thus a duration of one day is always exactly 24 hours.
// By contrast, a Period will add a conceptual day, trying to maintain
// the local time.
// 
// For example, consider adding a period of one day and a duration of one day to
// 18:00 on the evening before a daylight savings gap. The Period will add
// the conceptual day and result in a ZonedDateTime at 18:00 the following day.
// By contrast, the Duration will add exactly 24 hours, resulting in a
// ZonedDateTime at 19:00 the following day (assuming a one hour DST gap).
// 
// The supported units of a period are YEARS,
// MONTHS and DAYS.
// All three fields are always present, but may be set to zero.
// 
// The ISO-8601 calendar system is the modern civil calendar system used today
// in most of the world. It is equivalent to the proleptic Gregorian calendar
// system, in which today's rules for leap years are applied for all time.
// 
// The period is modeled as a directed amount of time, meaning that individual parts of the
// period may be negative.
//
// 
// This is a value-based
// class; use of identity-sensitive operations (including reference equality
// (==), identity hash code, or synchronization) on instances of
// Period may have unpredictable results and should be avoided.
// The equals method should be used for comparisons.
final class Period extends Object with ChronoPeriod, with Serializable {

    @stub
    // Adds this period to the specified temporal object.
    def addTo(temporal: Temporal): Temporal = ???

    @stub
    // Checks if this period is equal to another period.
    def equals(obj: Object): Boolean = ???

    @stub
    // Gets the value of the requested unit.
    def get(unit: TemporalUnit): Long = ???

    @stub
    // Gets the chronology of this period, which is the ISO calendar system.
    def getChronology(): IsoChronology = ???

    @stub
    // Gets the amount of days of this period.
    def getDays(): Int = ???

    @stub
    // Gets the amount of months of this period.
    def getMonths(): Int = ???

    @stub
    // Gets the set of units supported by this period.
    def getUnits(): List[TemporalUnit] = ???

    @stub
    // Gets the amount of years of this period.
    def getYears(): Int = ???

    @stub
    // A hash code for this period.
    def hashCode(): Int = ???

    @stub
    // Checks if any of the three units of this period are negative.
    def isNegative(): Boolean = ???

    @stub
    // Checks if all three units of this period are zero.
    def isZero(): Boolean = ???

    @stub
    // Returns a copy of this period with the specified period subtracted.
    def minus(amountToSubtract: TemporalAmount): Period = ???

    @stub
    // Returns a copy of this period with the specified days subtracted.
    def minusDays(daysToSubtract: Long): Period = ???

    @stub
    // Returns a copy of this period with the specified months subtracted.
    def minusMonths(monthsToSubtract: Long): Period = ???

    @stub
    // Returns a copy of this period with the specified years subtracted.
    def minusYears(yearsToSubtract: Long): Period = ???

    @stub
    // Returns a new instance with each element in this period multiplied
    // by the specified scalar.
    def multipliedBy(scalar: Int): Period = ???

    @stub
    // Returns a new instance with each amount in this period negated.
    def negated(): Period = ???

    @stub
    // Returns a copy of this period with the years and months normalized.
    def normalized(): Period = ???

    @stub
    // Returns a copy of this period with the specified period added.
    def plus(amountToAdd: TemporalAmount): Period = ???

    @stub
    // Returns a copy of this period with the specified days added.
    def plusDays(daysToAdd: Long): Period = ???

    @stub
    // Returns a copy of this period with the specified months added.
    def plusMonths(monthsToAdd: Long): Period = ???

    @stub
    // Returns a copy of this period with the specified years added.
    def plusYears(yearsToAdd: Long): Period = ???

    @stub
    // Subtracts this period from the specified temporal object.
    def subtractFrom(temporal: Temporal): Temporal = ???

    @stub
    // Outputs this period as a String, such as P6Y3M1D.
    def toString(): String = ???

    @stub
    // Gets the total number of months in this period.
    def toTotalMonths(): Long = ???

    @stub
    // Returns a copy of this period with the specified amount of days.
    def withDays(days: Int): Period = ???

    @stub
    // Returns a copy of this period with the specified amount of months.
    def withMonths(months: Int): Period = ???
}

object Period {
    @stub
    // Obtains a Period consisting of the number of years, months,
    // and days between two dates.
    def between(startDateInclusive: LocalDate, endDateExclusive: LocalDate): Period = ???

    @stub
    // Obtains an instance of Period from a temporal amount.
    def from(amount: TemporalAmount): Period = ???

    @stub
    // Obtains a Period representing a number of years, months and days.
    def of(years: Int, months: Int, days: Int): Period = ???

    @stub
    // Obtains a Period representing a number of days.
    def ofDays(days: Int): Period = ???

    @stub
    // Obtains a Period representing a number of months.
    def ofMonths(months: Int): Period = ???

    @stub
    // Obtains a Period representing a number of weeks.
    def ofWeeks(weeks: Int): Period = ???

    @stub
    // Obtains a Period representing a number of years.
    def ofYears(years: Int): Period = ???

    @stub
    // Obtains a Period from a text string such as PnYnMnD.
    def parse(text: CharSequence): Period = ???
}
