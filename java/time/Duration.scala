package java.time

import java.io.Serializable
import java.lang.{CharSequence, Comparable, Object, String}
import java.time.temporal.{Temporal, TemporalAmount, TemporalUnit}
import java.util.List

/** A time-based amount of time, such as '34.5 seconds'.
 *  
 *  This class models a quantity or amount of time in terms of seconds and nanoseconds.
 *  It can be accessed using other duration-based units, such as minutes and hours.
 *  In addition, the DAYS unit can be used and is treated as
 *  exactly equal to 24 hours, thus ignoring daylight savings effects.
 *  See Period for the date-based equivalent to this class.
 *  
 *  A physical duration could be of infinite length.
 *  For practicality, the duration is stored with constraints similar to Instant.
 *  The duration uses nanosecond resolution with a maximum value of the seconds that can
 *  be held in a long. This is greater than the current estimated age of the universe.
 *  
 *  The range of a duration requires the storage of a number larger than a long.
 *  To achieve this, the class stores a long representing seconds and an int
 *  representing nanosecond-of-second, which will always be between 0 and 999,999,999.
 *  The model is of a directed duration, meaning that the duration may be negative.
 *  
 *  The duration is measured in "seconds", but these are not necessarily identical to
 *  the scientific "SI second" definition based on atomic clocks.
 *  This difference only impacts durations measured near a leap-second and should not affect
 *  most applications.
 *  See Instant for a discussion as to the meaning of the second and time-scales.
 * 
 *  
 *  This is a value-based
 *  class; use of identity-sensitive operations (including reference equality
 *  (==), identity hash code, or synchronization) on instances of
 *  Duration may have unpredictable results and should be avoided.
 *  The equals method should be used for comparisons.
 */
final class Duration extends Object with TemporalAmount with Comparable[Duration] with Serializable {

    /** Returns a copy of this duration with a positive length. */
    @stub
    def abs(): Duration = ???

    /** Adds this duration to the specified temporal object. */
    @stub
    def addTo(temporal: Temporal): Temporal = ???

    /** Compares this duration to the specified Duration. */
    @stub
    def compareTo(otherDuration: Duration): Int = ???

    /** Returns a copy of this duration divided by the specified value. */
    @stub
    def dividedBy(divisor: Long): Duration = ???

    /** Checks if this duration is equal to the specified Duration. */
    @stub
    def equals(otherDuration: Object): Boolean = ???

    /** Gets the value of the requested unit. */
    @stub
    def get(unit: TemporalUnit): Long = ???

    /** Gets the number of nanoseconds within the second in this duration. */
    @stub
    def getNano(): Int = ???

    /** Gets the number of seconds in this duration. */
    @stub
    def getSeconds(): Long = ???

    /** Gets the set of units supported by this duration. */
    @stub
    def getUnits(): List[TemporalUnit] = ???

    /** A hash code for this duration. */
    @stub
    def hashCode(): Int = ???

    /** Checks if this duration is negative, excluding zero. */
    @stub
    def isNegative(): Boolean = ???

    /** Checks if this duration is zero length. */
    @stub
    def isZero(): Boolean = ???

    /** Returns a copy of this duration with the specified duration subtracted. */
    @stub
    def minus(duration: Duration): Duration = ???

    /** Returns a copy of this duration with the specified duration subtracted. */
    @stub
    def minus(amountToSubtract: Long, unit: TemporalUnit): Duration = ???

    /** Returns a copy of this duration with the specified duration in standard 24 hour days subtracted. */
    @stub
    def minusDays(daysToSubtract: Long): Duration = ???

    /** Returns a copy of this duration with the specified duration in hours subtracted. */
    @stub
    def minusHours(hoursToSubtract: Long): Duration = ???

    /** Returns a copy of this duration with the specified duration in milliseconds subtracted. */
    @stub
    def minusMillis(millisToSubtract: Long): Duration = ???

    /** Returns a copy of this duration with the specified duration in minutes subtracted. */
    @stub
    def minusMinutes(minutesToSubtract: Long): Duration = ???

    /** Returns a copy of this duration with the specified duration in nanoseconds subtracted. */
    @stub
    def minusNanos(nanosToSubtract: Long): Duration = ???

    /** Returns a copy of this duration with the specified duration in seconds subtracted. */
    @stub
    def minusSeconds(secondsToSubtract: Long): Duration = ???

    /** Returns a copy of this duration multiplied by the scalar. */
    @stub
    def multipliedBy(multiplicand: Long): Duration = ???

    /** Returns a copy of this duration with the length negated. */
    @stub
    def negated(): Duration = ???

    /** Returns a copy of this duration with the specified duration added. */
    @stub
    def plus(duration: Duration): Duration = ???

    /** Returns a copy of this duration with the specified duration added. */
    @stub
    def plus(amountToAdd: Long, unit: TemporalUnit): Duration = ???

    /** Returns a copy of this duration with the specified duration in standard 24 hour days added. */
    @stub
    def plusDays(daysToAdd: Long): Duration = ???

    /** Returns a copy of this duration with the specified duration in hours added. */
    @stub
    def plusHours(hoursToAdd: Long): Duration = ???

    /** Returns a copy of this duration with the specified duration in milliseconds added. */
    @stub
    def plusMillis(millisToAdd: Long): Duration = ???

    /** Returns a copy of this duration with the specified duration in minutes added. */
    @stub
    def plusMinutes(minutesToAdd: Long): Duration = ???

    /** Returns a copy of this duration with the specified duration in nanoseconds added. */
    @stub
    def plusNanos(nanosToAdd: Long): Duration = ???

    /** Returns a copy of this duration with the specified duration in seconds added. */
    @stub
    def plusSeconds(secondsToAdd: Long): Duration = ???

    /** Subtracts this duration from the specified temporal object. */
    @stub
    def subtractFrom(temporal: Temporal): Temporal = ???

    /** Gets the number of days in this duration. */
    @stub
    def toDays(): Long = ???

    /** Gets the number of hours in this duration. */
    @stub
    def toHours(): Long = ???

    /** Converts this duration to the total length in milliseconds. */
    @stub
    def toMillis(): Long = ???

    /** Gets the number of minutes in this duration. */
    @stub
    def toMinutes(): Long = ???

    /** Converts this duration to the total length in nanoseconds expressed as a long. */
    @stub
    def toNanos(): Long = ???

    /** A string representation of this duration using ISO-8601 seconds
     *  based representation, such as PT8H6M12.345S.
     */
    @stub
    def toString(): String = ???

    /** Returns a copy of this duration with the specified nano-of-second. */
    @stub
    def withNanos(nanoOfSecond: Int): Duration = ???
}

object Duration {
    /** Obtains a Duration representing the duration between two temporal objects. */
    @stub
    def between(startInclusive: Temporal, endExclusive: Temporal): Duration = ???

    /** Obtains an instance of Duration from a temporal amount. */
    @stub
    def from(amount: TemporalAmount): Duration = ???

    /** Obtains a Duration representing an amount in the specified unit. */
    @stub
    def of(amount: Long, unit: TemporalUnit): Duration = ???

    /** Obtains a Duration representing a number of standard 24 hour days. */
    @stub
    def ofDays(days: Long): Duration = ???

    /** Obtains a Duration representing a number of standard hours. */
    @stub
    def ofHours(hours: Long): Duration = ???

    /** Obtains a Duration representing a number of milliseconds. */
    @stub
    def ofMillis(millis: Long): Duration = ???

    /** Obtains a Duration representing a number of standard minutes. */
    @stub
    def ofMinutes(minutes: Long): Duration = ???

    /** Obtains a Duration representing a number of nanoseconds. */
    @stub
    def ofNanos(nanos: Long): Duration = ???

    /** Obtains a Duration representing a number of seconds. */
    @stub
    def ofSeconds(seconds: Long): Duration = ???

    /** Obtains a Duration representing a number of seconds and an
     *  adjustment in nanoseconds.
     */
    @stub
    def ofSeconds(seconds: Long, nanoAdjustment: Long): Duration = ???

    /** Obtains a Duration from a text string such as PnDTnHnMn.nS. */
    @stub
    def parse(text: CharSequence): Duration = ???
}
