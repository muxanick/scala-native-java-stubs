package java.time

import java.io.Serializable
import java.lang.{CharSequence, Comparable, Object, String}
import java.time.temporal.{Temporal, TemporalAccessor, TemporalAdjuster, TemporalAmount, TemporalField, TemporalQuery, TemporalUnit, ValueRange}

// An instantaneous point on the time-line.
// 
// This class models a single instantaneous point on the time-line.
// This might be used to record event time-stamps in the application.
// 
// The range of an instant requires the storage of a number larger than a long.
// To achieve this, the class stores a long representing epoch-seconds and an
// int representing nanosecond-of-second, which will always be between 0 and 999,999,999.
// The epoch-seconds are measured from the standard Java epoch of 1970-01-01T00:00:00Z
// where instants after the epoch have positive values, and earlier instants have negative values.
// For both the epoch-second and nanosecond parts, a larger value is always later on the time-line
// than a smaller value.
//
// Time-scale
// 
// The length of the solar day is the standard way that humans measure time.
// This has traditionally been subdivided into 24 hours of 60 minutes of 60 seconds,
// forming a 86400 second day.
// 
// Modern timekeeping is based on atomic clocks which precisely define an SI second
// relative to the transitions of a Caesium atom. The length of an SI second was defined
// to be very close to the 86400th fraction of a day.
// 
// Unfortunately, as the Earth rotates the length of the day varies.
// In addition, over time the average length of the day is getting longer as the Earth slows.
// As a result, the length of a solar day in 2012 is slightly longer than 86400 SI seconds.
// The actual length of any given day and the amount by which the Earth is slowing
// are not predictable and can only be determined by measurement.
// The UT1 time-scale captures the accurate length of day, but is only available some
// time after the day has completed.
// 
// The UTC time-scale is a standard approach to bundle up all the additional fractions
// of a second from UT1 into whole seconds, known as leap-seconds.
// A leap-second may be added or removed depending on the Earth's rotational changes.
// As such, UTC permits a day to have 86399 SI seconds or 86401 SI seconds where
// necessary in order to keep the day aligned with the Sun.
// 
// The modern UTC time-scale was introduced in 1972, introducing the concept of whole leap-seconds.
// Between 1958 and 1972, the definition of UTC was complex, with minor sub-second leaps and
// alterations to the length of the notional second. As of 2012, discussions are underway
// to change the definition of UTC again, with the potential to remove leap seconds or
// introduce other changes.
// 
// Given the complexity of accurate timekeeping described above, this Java API defines
// its own time-scale, the Java Time-Scale.
// 
// The Java Time-Scale divides each calendar day into exactly 86400
// subdivisions, known as seconds.  These seconds may differ from the
// SI second.  It closely matches the de facto international civil time
// scale, the definition of which changes from time to time.
// 
// The Java Time-Scale has slightly different definitions for different
// segments of the time-line, each based on the consensus international
// time scale that is used as the basis for civil time. Whenever the
// internationally-agreed time scale is modified or replaced, a new
// segment of the Java Time-Scale must be defined for it.  Each segment
// must meet these requirements:
// 
// the Java Time-Scale shall closely match the underlying international
//  civil time scale;
// the Java Time-Scale shall exactly match the international civil
//  time scale at noon each day;
// the Java Time-Scale shall have a precisely-defined relationship to
//  the international civil time scale.
// 
// There are currently, as of 2013, two segments in the Java time-scale.
// 
// For the segment from 1972-11-03 (exact boundary discussed below) until
// further notice, the consensus international time scale is UTC (with
// leap seconds).  In this segment, the Java Time-Scale is identical to
// UTC-SLS.
// This is identical to UTC on days that do not have a leap second.
// On days that do have a leap second, the leap second is spread equally
// over the last 1000 seconds of the day, maintaining the appearance of
// exactly 86400 seconds per day.
// 
// For the segment prior to 1972-11-03, extending back arbitrarily far,
// the consensus international time scale is defined to be UT1, applied
// proleptically, which is equivalent to the (mean) solar time on the
// prime meridian (Greenwich). In this segment, the Java Time-Scale is
// identical to the consensus international time scale. The exact
// boundary between the two segments is the instant where UT1 = UTC
// between 1972-11-03T00:00 and 1972-11-04T12:00.
// 
// Implementations of the Java time-scale using the JSR-310 API are not
// required to provide any clock that is sub-second accurate, or that
// progresses monotonically or smoothly. Implementations are therefore
// not required to actually perform the UTC-SLS slew or to otherwise be
// aware of leap seconds. JSR-310 does, however, require that
// implementations must document the approach they use when defining a
// clock representing the current instant.
// See Clock for details on the available clocks.
// 
// The Java time-scale is used for all date-time classes.
// This includes Instant, LocalDate, LocalTime, OffsetDateTime,
// ZonedDateTime and Duration.
//
// 
// This is a value-based
// class; use of identity-sensitive operations (including reference equality
// (==), identity hash code, or synchronization) on instances of
// Instant may have unpredictable results and should be avoided.
// The equals method should be used for comparisons.
final class Instant extends Object with Temporal, with TemporalAdjuster, with Comparable[Instant], with Serializable {

    @stub
    // Adjusts the specified temporal object to have this instant.
    def adjustInto(temporal: Temporal): Temporal = ???

    @stub
    // Combines this instant with an offset to create an OffsetDateTime.
    def atOffset(offset: ZoneOffset): OffsetDateTime = ???

    @stub
    // Combines this instant with a time-zone to create a ZonedDateTime.
    def atZone(zone: ZoneId): ZonedDateTime = ???

    @stub
    // Compares this instant to the specified instant.
    def compareTo(otherInstant: Instant): Int = ???

    @stub
    // Checks if this instant is equal to the specified instant.
    def equals(otherInstant: Object): Boolean = ???

    @stub
    // Gets the value of the specified field from this instant as an int.
    def get(field: TemporalField): Int = ???

    @stub
    // Gets the number of seconds from the Java epoch of 1970-01-01T00:00:00Z.
    def getEpochSecond(): Long = ???

    @stub
    // Gets the value of the specified field from this instant as a long.
    def getLong(field: TemporalField): Long = ???

    @stub
    // Gets the number of nanoseconds, later along the time-line, from the start
    // of the second.
    def getNano(): Int = ???

    @stub
    // Returns a hash code for this instant.
    def hashCode(): Int = ???

    @stub
    // Checks if this instant is after the specified instant.
    def isAfter(otherInstant: Instant): Boolean = ???

    @stub
    // Checks if this instant is before the specified instant.
    def isBefore(otherInstant: Instant): Boolean = ???

    @stub
    // Checks if the specified field is supported.
    def isSupported(field: TemporalField): Boolean = ???

    @stub
    // Checks if the specified unit is supported.
    def isSupported(unit: TemporalUnit): Boolean = ???

    @stub
    // Returns a copy of this instant with the specified amount subtracted.
    def minus(amountToSubtract: Long, unit: TemporalUnit): Instant = ???

    @stub
    // Returns a copy of this instant with the specified amount subtracted.
    def minus(amountToSubtract: TemporalAmount): Instant = ???

    @stub
    // Returns a copy of this instant with the specified duration in milliseconds subtracted.
    def minusMillis(millisToSubtract: Long): Instant = ???

    @stub
    // Returns a copy of this instant with the specified duration in nanoseconds subtracted.
    def minusNanos(nanosToSubtract: Long): Instant = ???

    @stub
    // Returns a copy of this instant with the specified duration in seconds subtracted.
    def minusSeconds(secondsToSubtract: Long): Instant = ???

    @stub
    // Returns a copy of this instant with the specified amount added.
    def plus(amountToAdd: Long, unit: TemporalUnit): Instant = ???

    @stub
    // Returns a copy of this instant with the specified amount added.
    def plus(amountToAdd: TemporalAmount): Instant = ???

    @stub
    // Returns a copy of this instant with the specified duration in milliseconds added.
    def plusMillis(millisToAdd: Long): Instant = ???

    @stub
    // Returns a copy of this instant with the specified duration in nanoseconds added.
    def plusNanos(nanosToAdd: Long): Instant = ???

    @stub
    // Returns a copy of this instant with the specified duration in seconds added.
    def plusSeconds(secondsToAdd: Long): Instant = ???

    @stub
    // Queries this instant using the specified query.
    def R: [R] = ???

    @stub
    // Gets the range of valid values for the specified field.
    def range(field: TemporalField): ValueRange = ???

    @stub
    // Converts this instant to the number of milliseconds from the epoch
    // of 1970-01-01T00:00:00Z.
    def toEpochMilli(): Long = ???

    @stub
    // A string representation of this instant using ISO-8601 representation.
    def toString(): String = ???

    @stub
    // Returns a copy of this Instant truncated to the specified unit.
    def truncatedTo(unit: TemporalUnit): Instant = ???

    @stub
    // Calculates the amount of time until another instant in terms of the specified unit.
    def until(endExclusive: Temporal, unit: TemporalUnit): Long = ???

    @stub
    // Returns an adjusted copy of this instant.
    def with(adjuster: TemporalAdjuster): Instant = ???
}

object Instant {
    @stub
    // Constant for the 1970-01-01T00:00:00Z epoch instant.
    def EPOCH: Instant = ???

    @stub
    // The maximum supported Instant, '1000000000-12-31T23:59:59.999999999Z'.
    def MAX: Instant = ???

    @stub
    // Obtains an instance of Instant from a temporal object.
    def from(temporal: TemporalAccessor): Instant = ???

    @stub
    // Obtains the current instant from the system clock.
    def now(): Instant = ???

    @stub
    // Obtains the current instant from the specified clock.
    def now(clock: Clock): Instant = ???

    @stub
    // Obtains an instance of Instant using milliseconds from the
    // epoch of 1970-01-01T00:00:00Z.
    def ofEpochMilli(epochMilli: Long): Instant = ???

    @stub
    // Obtains an instance of Instant using seconds from the
    // epoch of 1970-01-01T00:00:00Z.
    def ofEpochSecond(epochSecond: Long): Instant = ???

    @stub
    // Obtains an instance of Instant using seconds from the
    // epoch of 1970-01-01T00:00:00Z and nanosecond fraction of second.
    def ofEpochSecond(epochSecond: Long, nanoAdjustment: Long): Instant = ???

    @stub
    // Obtains an instance of Instant from a text string such as
    // 2007-12-03T10:15:30.00Z.
    def parse(text: CharSequence): Instant = ???
}
