package java.time.chrono

import java.lang.{Object, String}
import java.time.temporal.{Temporal, TemporalAmount, TemporalUnit}
import java.util.List
import scala.scalanative.annotation.stub

/** A date-based amount of time, such as '3 years, 4 months and 5 days' in an
 *  arbitrary chronology, intended for advanced globalization use cases.
 *  
 *  This interface models a date-based amount of time in a calendar system.
 *  While most calendar systems use years, months and days, some do not.
 *  Therefore, this interface operates solely in terms of a set of supported
 *  units that are defined by the Chronology.
 *  The set of supported units is fixed for a given chronology.
 *  The amount of a supported unit may be set to zero.
 *  
 *  The period is modeled as a directed amount of time, meaning that individual
 *  parts of the period may be negative.
 */
trait ChronoPeriod extends TemporalAmount {

    /** Adds this period to the specified temporal object. */
    @stub
    def addTo(temporal: Temporal): Temporal = ???

    /** Checks if this period is equal to another period, including the chronology. */
    @stub
    def equals(obj: Any): Boolean = ???

    /** Gets the value of the requested unit. */
    @stub
    def get(unit: TemporalUnit): Long = ???

    /** Gets the chronology that defines the meaning of the supported units. */
    @stub
    def getChronology(): Chronology = ???

    /** Gets the set of units supported by this period. */
    @stub
    def getUnits(): List[TemporalUnit] = ???

    /** A hash code for this period. */
    @stub
    def hashCode(): Int = ???

    /** Checks if any of the supported units of this period are negative. */
    @stub
    def isNegative(): Boolean = ???

    /** Checks if all the supported units of this period are zero. */
    @stub
    def isZero(): Boolean = ???

    /** Returns a copy of this period with the specified period subtracted. */
    @stub
    def minus(amountToSubtract: TemporalAmount): ChronoPeriod = ???

    /** Returns a new instance with each amount in this period in this period
     *  multiplied by the specified scalar.
     */
    @stub
    def multipliedBy(scalar: Int): ChronoPeriod = ???

    /** Returns a new instance with each amount in this period negated. */
    @stub
    def negated(): ChronoPeriod = ???

    /** Returns a copy of this period with the amounts of each unit normalized. */
    @stub
    def normalized(): ChronoPeriod = ???

    /** Returns a copy of this period with the specified period added. */
    @stub
    def plus(amountToAdd: TemporalAmount): ChronoPeriod = ???

    /** Subtracts this period from the specified temporal object. */
    @stub
    def subtractFrom(temporal: Temporal): Temporal = ???

    /** Outputs this period as a String. */
    @stub
    def toString(): String = ???
}

object ChronoPeriod {
    /** Obtains a ChronoPeriod consisting of amount of time between two dates. */
    @stub
    def between(startDateInclusive: ChronoLocalDate, endDateExclusive: ChronoLocalDate): ChronoPeriod = ???
}
