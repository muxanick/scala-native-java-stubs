package java.time.temporal

import java.lang.{Enum, Object, String}
import java.time.Duration
import scala.scalanative.annotation.stub

/** A standard set of date periods units.
 *  
 *  This set of units provide unit-based access to manipulate a date, time or date-time.
 *  The standard set of units can be extended by implementing TemporalUnit.
 *  
 *  These units are intended to be applicable in multiple calendar systems.
 *  For example, most non-ISO calendar systems define units of years, months and days,
 *  just with slightly different rules.
 *  The documentation of each unit explains how it operates.
 */
class ChronoUnit private (name: String, ordinal: Int) extends Enum[ChronoUnit](name, ordinal) with TemporalUnit {

    /** Returns a copy of the specified temporal object with the specified period added. */
    @stub
    def addTo[R <: Temporal](temporal: R, amount: Long): R = ???

    /** Calculates the amount of time between two temporal objects. */
    @stub
    def between(temporal1Inclusive: Temporal, temporal2Exclusive: Temporal): Long = ???

    /** Gets the estimated duration of this unit in the ISO calendar system. */
    @stub
    def getDuration(): Duration = ???

    /** Checks if this unit is a date unit. */
    @stub
    def isDateBased(): Boolean = ???

    /** Checks if the duration of the unit is an estimate. */
    @stub
    def isDurationEstimated(): Boolean = ???

    /** Checks if this unit is supported by the specified temporal object. */
    @stub
    def isSupportedBy(temporal: Temporal): Boolean = ???

    /** Checks if this unit is a time unit. */
    @stub
    def isTimeBased(): Boolean = ???

    /** Returns the name of this enum constant, as contained in the
     *  declaration.
     */
    @stub
    def toString(): String = ???
}

object ChronoUnit {
    /** Unit that represents the concept of a century. */
    final val CENTURIES: ChronoUnit = new ChronoUnit("CENTURIES", 0)

    /** Unit that represents the concept of a day. */
    final val DAYS: ChronoUnit = new ChronoUnit("DAYS", 1)

    /** Unit that represents the concept of a decade. */
    final val DECADES: ChronoUnit = new ChronoUnit("DECADES", 2)

    /** Unit that represents the concept of an era. */
    final val ERAS: ChronoUnit = new ChronoUnit("ERAS", 3)

    /** Artificial unit that represents the concept of forever. */
    final val FOREVER: ChronoUnit = new ChronoUnit("FOREVER", 4)

    /** Unit that represents the concept of half a day, as used in AM/PM. */
    final val HALF_DAYS: ChronoUnit = new ChronoUnit("HALF_DAYS", 5)

    /** Unit that represents the concept of an hour. */
    final val HOURS: ChronoUnit = new ChronoUnit("HOURS", 6)

    /** Unit that represents the concept of a microsecond. */
    final val MICROS: ChronoUnit = new ChronoUnit("MICROS", 7)

    /** Unit that represents the concept of a millennium. */
    final val MILLENNIA: ChronoUnit = new ChronoUnit("MILLENNIA", 8)

    /** Unit that represents the concept of a millisecond. */
    final val MILLIS: ChronoUnit = new ChronoUnit("MILLIS", 9)

    /** Unit that represents the concept of a minute. */
    final val MINUTES: ChronoUnit = new ChronoUnit("MINUTES", 10)

    /** Unit that represents the concept of a month. */
    final val MONTHS: ChronoUnit = new ChronoUnit("MONTHS", 11)

    /** Unit that represents the concept of a nanosecond, the smallest supported unit of time. */
    final val NANOS: ChronoUnit = new ChronoUnit("NANOS", 12)

    /** Unit that represents the concept of a second. */
    final val SECONDS: ChronoUnit = new ChronoUnit("SECONDS", 13)

    /** Unit that represents the concept of a week. */
    final val WEEKS: ChronoUnit = new ChronoUnit("WEEKS", 14)

    /** Unit that represents the concept of a year. */
    final val YEARS: ChronoUnit = new ChronoUnit("YEARS", 15)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): ChronoUnit = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[ChronoUnit] = ???
}
