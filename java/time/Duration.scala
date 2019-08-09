package java.time

import java.io.Serializable
import java.lang.{CharSequence, Comparable, Object, String}
import java.time.temporal.{Temporal, TemporalAmount, TemporalUnit}
import java.util.List

// A time-based amount of time, such as '34.5 seconds'.
// 
// This class models a quantity or amount of time in terms of seconds and nanoseconds.
// It can be accessed using other duration-based units, such as minutes and hours.
// In addition, the DAYS unit can be used and is treated as
// exactly equal to 24 hours, thus ignoring daylight savings effects.
// See Period for the date-based equivalent to this class.
// 
// A physical duration could be of infinite length.
// For practicality, the duration is stored with constraints similar to Instant.
// The duration uses nanosecond resolution with a maximum value of the seconds that can
// be held in a long. This is greater than the current estimated age of the universe.
// 
// The range of a duration requires the storage of a number larger than a long.
// To achieve this, the class stores a long representing seconds and an int
// representing nanosecond-of-second, which will always be between 0 and 999,999,999.
// The model is of a directed duration, meaning that the duration may be negative.
// 
// The duration is measured in "seconds", but these are not necessarily identical to
// the scientific "SI second" definition based on atomic clocks.
// This difference only impacts durations measured near a leap-second and should not affect
// most applications.
// See Instant for a discussion as to the meaning of the second and time-scales.
//
// 
// This is a value-based
// class; use of identity-sensitive operations (including reference equality
// (==), identity hash code, or synchronization) on instances of
// Duration may have unpredictable results and should be avoided.
// The equals method should be used for comparisons.
final class Duration extends Object with TemporalAmount, with Comparable[Duration], with Serializable {

    @stub
    // Returns a copy of this duration with a positive length.
    def abs(): Duration = ???

    @stub
    // Adds this duration to the specified temporal object.
    def addTo(temporal: Temporal): Temporal = ???

    @stub
    // Compares this duration to the specified Duration.
    def compareTo(otherDuration: Duration): Int = ???

    @stub
    // Returns a copy of this duration divided by the specified value.
    def dividedBy(divisor: Long): Duration = ???

    @stub
    // Checks if this duration is equal to the specified Duration.
    def equals(otherDuration: Object): Boolean = ???

    @stub
    // Gets the value of the requested unit.
    def get(unit: TemporalUnit): Long = ???

    @stub
    // Gets the number of nanoseconds within the second in this duration.
    def getNano(): Int = ???

    @stub
    // Gets the number of seconds in this duration.
    def getSeconds(): Long = ???

    @stub
    // Gets the set of units supported by this duration.
    def getUnits(): List[TemporalUnit] = ???

    @stub
    // A hash code for this duration.
    def hashCode(): Int = ???

    @stub
    // Checks if this duration is negative, excluding zero.
    def isNegative(): Boolean = ???

    @stub
    // Checks if this duration is zero length.
    def isZero(): Boolean = ???

    @stub
    // Returns a copy of this duration with the specified duration subtracted.
    def minus(duration: Duration): Duration = ???

    @stub
    // Returns a copy of this duration with the specified duration subtracted.
    def minus(amountToSubtract: Long, unit: TemporalUnit): Duration = ???

    @stub
    // Returns a copy of this duration with the specified duration in standard 24 hour days subtracted.
    def minusDays(daysToSubtract: Long): Duration = ???

    @stub
    // Returns a copy of this duration with the specified duration in hours subtracted.
    def minusHours(hoursToSubtract: Long): Duration = ???

    @stub
    // Returns a copy of this duration with the specified duration in milliseconds subtracted.
    def minusMillis(millisToSubtract: Long): Duration = ???

    @stub
    // Returns a copy of this duration with the specified duration in minutes subtracted.
    def minusMinutes(minutesToSubtract: Long): Duration = ???

    @stub
    // Returns a copy of this duration with the specified duration in nanoseconds subtracted.
    def minusNanos(nanosToSubtract: Long): Duration = ???

    @stub
    // Returns a copy of this duration with the specified duration in seconds subtracted.
    def minusSeconds(secondsToSubtract: Long): Duration = ???

    @stub
    // Returns a copy of this duration multiplied by the scalar.
    def multipliedBy(multiplicand: Long): Duration = ???

    @stub
    // Returns a copy of this duration with the length negated.
    def negated(): Duration = ???

    @stub
    // Returns a copy of this duration with the specified duration added.
    def plus(duration: Duration): Duration = ???

    @stub
    // Returns a copy of this duration with the specified duration added.
    def plus(amountToAdd: Long, unit: TemporalUnit): Duration = ???

    @stub
    // Returns a copy of this duration with the specified duration in standard 24 hour days added.
    def plusDays(daysToAdd: Long): Duration = ???

    @stub
    // Returns a copy of this duration with the specified duration in hours added.
    def plusHours(hoursToAdd: Long): Duration = ???

    @stub
    // Returns a copy of this duration with the specified duration in milliseconds added.
    def plusMillis(millisToAdd: Long): Duration = ???

    @stub
    // Returns a copy of this duration with the specified duration in minutes added.
    def plusMinutes(minutesToAdd: Long): Duration = ???

    @stub
    // Returns a copy of this duration with the specified duration in nanoseconds added.
    def plusNanos(nanosToAdd: Long): Duration = ???

    @stub
    // Returns a copy of this duration with the specified duration in seconds added.
    def plusSeconds(secondsToAdd: Long): Duration = ???

    @stub
    // Subtracts this duration from the specified temporal object.
    def subtractFrom(temporal: Temporal): Temporal = ???

    @stub
    // Gets the number of days in this duration.
    def toDays(): Long = ???

    @stub
    // Gets the number of hours in this duration.
    def toHours(): Long = ???

    @stub
    // Converts this duration to the total length in milliseconds.
    def toMillis(): Long = ???

    @stub
    // Gets the number of minutes in this duration.
    def toMinutes(): Long = ???

    @stub
    // Converts this duration to the total length in nanoseconds expressed as a long.
    def toNanos(): Long = ???

    @stub
    // A string representation of this duration using ISO-8601 seconds
    // based representation, such as PT8H6M12.345S.
    def toString(): String = ???

    @stub
    // Returns a copy of this duration with the specified nano-of-second.
    def withNanos(nanoOfSecond: Int): Duration = ???
}

object Duration {
    @stub
    // Obtains a Duration representing the duration between two temporal objects.
    def between(startInclusive: Temporal, endExclusive: Temporal): Duration = ???

    @stub
    // Obtains an instance of Duration from a temporal amount.
    def from(amount: TemporalAmount): Duration = ???

    @stub
    // Obtains a Duration representing an amount in the specified unit.
    def of(amount: Long, unit: TemporalUnit): Duration = ???

    @stub
    // Obtains a Duration representing a number of standard 24 hour days.
    def ofDays(days: Long): Duration = ???

    @stub
    // Obtains a Duration representing a number of standard hours.
    def ofHours(hours: Long): Duration = ???

    @stub
    // Obtains a Duration representing a number of milliseconds.
    def ofMillis(millis: Long): Duration = ???

    @stub
    // Obtains a Duration representing a number of standard minutes.
    def ofMinutes(minutes: Long): Duration = ???

    @stub
    // Obtains a Duration representing a number of nanoseconds.
    def ofNanos(nanos: Long): Duration = ???

    @stub
    // Obtains a Duration representing a number of seconds.
    def ofSeconds(seconds: Long): Duration = ???

    @stub
    // Obtains a Duration representing a number of seconds and an
    // adjustment in nanoseconds.
    def ofSeconds(seconds: Long, nanoAdjustment: Long): Duration = ???

    @stub
    // Obtains a Duration from a text string such as PnDTnHnMn.nS.
    def parse(text: CharSequence): Duration = ???
}
