package java.time.chrono

import java.lang.Object
import java.time.temporal.{Temporal, TemporalAmount, TemporalUnit}
import java.util.List

// A date-based amount of time, such as '3 years, 4 months and 5 days' in an
// arbitrary chronology, intended for advanced globalization use cases.
// 
// This interface models a date-based amount of time in a calendar system.
// While most calendar systems use years, months and days, some do not.
// Therefore, this interface operates solely in terms of a set of supported
// units that are defined by the Chronology.
// The set of supported units is fixed for a given chronology.
// The amount of a supported unit may be set to zero.
// 
// The period is modeled as a directed amount of time, meaning that individual
// parts of the period may be negative.
trait ChronoPeriod extends TemporalAmount {

    @stub
    // Adds this period to the specified temporal object.
    def addTo(temporal: Temporal): Temporal = ???

    @stub
    // Checks if this period is equal to another period, including the chronology.
    def equals(obj: Object): Boolean = ???

    @stub
    // Gets the value of the requested unit.
    def get(unit: TemporalUnit): Long = ???

    @stub
    // Gets the chronology that defines the meaning of the supported units.
    def getChronology(): Chronology = ???

    @stub
    // Gets the set of units supported by this period.
    def getUnits(): List[TemporalUnit] = ???

    @stub
    // A hash code for this period.
    def hashCode(): Int = ???

    @stub
    // Checks if any of the supported units of this period are negative.
    def Boolean: default = ???

    @stub
    // Checks if all the supported units of this period are zero.
    def Boolean: default = ???

    @stub
    // Returns a copy of this period with the specified period subtracted.
    def minus(amountToSubtract: TemporalAmount): ChronoPeriod = ???

    @stub
    // Returns a new instance with each amount in this period in this period
    // multiplied by the specified scalar.
    def multipliedBy(scalar: Int): ChronoPeriod = ???

    @stub
    // Returns a new instance with each amount in this period negated.
    def this: default = ???

    @stub
    // Returns a copy of this period with the amounts of each unit normalized.
    def normalized(): ChronoPeriod = ???

    @stub
    // Returns a copy of this period with the specified period added.
    def plus(amountToAdd: TemporalAmount): ChronoPeriod = ???

    @stub
    // Subtracts this period from the specified temporal object.
    def subtractFrom(temporal: Temporal): Temporal = ???
}

object ChronoPeriod {
    @stub
    // Obtains a ChronoPeriod consisting of amount of time between two dates.
    def between(startDateInclusive: ChronoLocalDate, endDateExclusive: ChronoLocalDate): ChronoPeriod = ???
}
