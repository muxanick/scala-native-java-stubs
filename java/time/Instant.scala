package java.time

import java.io.Serializable
import java.lang.{CharSequence, Comparable, Object, String}
import java.time.temporal.{Temporal, TemporalAccessor, TemporalAdjuster, TemporalAmount, TemporalField, TemporalQuery, TemporalUnit, ValueRange}
import scala.scalanative.annotation.stub

/** An instantaneous point on the time-line.
 *  
 *  This class models a single instantaneous point on the time-line.
 *  This might be used to record event time-stamps in the application.
 *  
 *  The range of an instant requires the storage of a number larger than a long.
 *  To achieve this, the class stores a long representing epoch-seconds and an
 *  int representing nanosecond-of-second, which will always be between 0 and 999,999,999.
 *  The epoch-seconds are measured from the standard Java epoch of 1970-01-01T00:00:00Z
 *  where instants after the epoch have positive values, and earlier instants have negative values.
 *  For both the epoch-second and nanosecond parts, a larger value is always later on the time-line
 *  than a smaller value.
 * 
 *  Time-scale
 *  
 *  The length of the solar day is the standard way that humans measure time.
 *  This has traditionally been subdivided into 24 hours of 60 minutes of 60 seconds,
 *  forming a 86400 second day.
 *  
 *  Modern timekeeping is based on atomic clocks which precisely define an SI second
 *  relative to the transitions of a Caesium atom. The length of an SI second was defined
 *  to be very close to the 86400th fraction of a day.
 *  
 *  Unfortunately, as the Earth rotates the length of the day varies.
 *  In addition, over time the average length of the day is getting longer as the Earth slows.
 *  As a result, the length of a solar day in 2012 is slightly longer than 86400 SI seconds.
 *  The actual length of any given day and the amount by which the Earth is slowing
 *  are not predictable and can only be determined by measurement.
 *  The UT1 time-scale captures the accurate length of day, but is only available some
 *  time after the day has completed.
 *  
 *  The UTC time-scale is a standard approach to bundle up all the additional fractions
 *  of a second from UT1 into whole seconds, known as leap-seconds.
 *  A leap-second may be added or removed depending on the Earth's rotational changes.
 *  As such, UTC permits a day to have 86399 SI seconds or 86401 SI seconds where
 *  necessary in order to keep the day aligned with the Sun.
 *  
 *  The modern UTC time-scale was introduced in 1972, introducing the concept of whole leap-seconds.
 *  Between 1958 and 1972, the definition of UTC was complex, with minor sub-second leaps and
 *  alterations to the length of the notional second. As of 2012, discussions are underway
 *  to change the definition of UTC again, with the potential to remove leap seconds or
 *  introduce other changes.
 *  
 *  Given the complexity of accurate timekeeping described above, this Java API defines
 *  its own time-scale, the Java Time-Scale.
 *  
 *  The Java Time-Scale divides each calendar day into exactly 86400
 *  subdivisions, known as seconds.  These seconds may differ from the
 *  SI second.  It closely matches the de facto international civil time
 *  scale, the definition of which changes from time to time.
 *  
 *  The Java Time-Scale has slightly different definitions for different
 *  segments of the time-line, each based on the consensus international
 *  time scale that is used as the basis for civil time. Whenever the
 *  internationally-agreed time scale is modified or replaced, a new
 *  segment of the Java Time-Scale must be defined for it.  Each segment
 *  must meet these requirements:
 *  
 *  the Java Time-Scale shall closely match the underlying international
 *   civil time scale;
 *  the Java Time-Scale shall exactly match the international civil
 *   time scale at noon each day;
 *  the Java Time-Scale shall have a precisely-defined relationship to
 *   the international civil time scale.
 *  
 *  There are currently, as of 2013, two segments in the Java time-scale.
 *  
 *  For the segment from 1972-11-03 (exact boundary discussed below) until
 *  further notice, the consensus international time scale is UTC (with
 *  leap seconds).  In this segment, the Java Time-Scale is identical to
 *  UTC-SLS.
 *  This is identical to UTC on days that do not have a leap second.
 *  On days that do have a leap second, the leap second is spread equally
 *  over the last 1000 seconds of the day, maintaining the appearance of
 *  exactly 86400 seconds per day.
 *  
 *  For the segment prior to 1972-11-03, extending back arbitrarily far,
 *  the consensus international time scale is defined to be UT1, applied
 *  proleptically, which is equivalent to the (mean) solar time on the
 *  prime meridian (Greenwich). In this segment, the Java Time-Scale is
 *  identical to the consensus international time scale. The exact
 *  boundary between the two segments is the instant where UT1 = UTC
 *  between 1972-11-03T00:00 and 1972-11-04T12:00.
 *  
 *  Implementations of the Java time-scale using the JSR-310 API are not
 *  required to provide any clock that is sub-second accurate, or that
 *  progresses monotonically or smoothly. Implementations are therefore
 *  not required to actually perform the UTC-SLS slew or to otherwise be
 *  aware of leap seconds. JSR-310 does, however, require that
 *  implementations must document the approach they use when defining a
 *  clock representing the current instant.
 *  See Clock for details on the available clocks.
 *  
 *  The Java time-scale is used for all date-time classes.
 *  This includes Instant, LocalDate, LocalTime, OffsetDateTime,
 *  ZonedDateTime and Duration.
 * 
 *  
 *  This is a value-based
 *  class; use of identity-sensitive operations (including reference equality
 *  (==), identity hash code, or synchronization) on instances of
 *  Instant may have unpredictable results and should be avoided.
 *  The equals method should be used for comparisons.
 */
final class Instant extends Object with Temporal with TemporalAdjuster with Comparable[Instant] with Serializable {

    /** Adjusts the specified temporal object to have this instant. */
    @stub
    def adjustInto(temporal: Temporal): Temporal = ???

    /** Combines this instant with an offset to create an OffsetDateTime. */
    @stub
    def atOffset(offset: ZoneOffset): OffsetDateTime = ???

    /** Combines this instant with a time-zone to create a ZonedDateTime. */
    @stub
    def atZone(zone: ZoneId): ZonedDateTime = ???

    /** Compares this instant to the specified instant. */
    @stub
    def compareTo(otherInstant: Instant): Int = ???

    /** Checks if this instant is equal to the specified instant. */
    @stub
    def equals(otherInstant: Object): Boolean = ???

    /** Gets the value of the specified field from this instant as an int. */
    @stub
    def get(field: TemporalField): Int = ???

    /** Gets the number of seconds from the Java epoch of 1970-01-01T00:00:00Z. */
    @stub
    def getEpochSecond(): Long = ???

    /** Gets the value of the specified field from this instant as a long. */
    @stub
    def getLong(field: TemporalField): Long = ???

    /** Gets the number of nanoseconds, later along the time-line, from the start
     *  of the second.
     */
    @stub
    def getNano(): Int = ???

    /** Returns a hash code for this instant. */
    @stub
    def hashCode(): Int = ???

    /** Checks if this instant is after the specified instant. */
    @stub
    def isAfter(otherInstant: Instant): Boolean = ???

    /** Checks if this instant is before the specified instant. */
    @stub
    def isBefore(otherInstant: Instant): Boolean = ???

    /** Checks if the specified field is supported. */
    @stub
    def isSupported(field: TemporalField): Boolean = ???

    /** Checks if the specified unit is supported. */
    @stub
    def isSupported(unit: TemporalUnit): Boolean = ???

    /** Returns a copy of this instant with the specified amount subtracted. */
    @stub
    def minus(amountToSubtract: Long, unit: TemporalUnit): Instant = ???

    /** Returns a copy of this instant with the specified amount subtracted. */
    @stub
    def minus(amountToSubtract: TemporalAmount): Instant = ???

    /** Returns a copy of this instant with the specified duration in milliseconds subtracted. */
    @stub
    def minusMillis(millisToSubtract: Long): Instant = ???

    /** Returns a copy of this instant with the specified duration in nanoseconds subtracted. */
    @stub
    def minusNanos(nanosToSubtract: Long): Instant = ???

    /** Returns a copy of this instant with the specified duration in seconds subtracted. */
    @stub
    def minusSeconds(secondsToSubtract: Long): Instant = ???

    /** Returns a copy of this instant with the specified amount added. */
    @stub
    def plus(amountToAdd: Long, unit: TemporalUnit): Instant = ???

    /** Returns a copy of this instant with the specified amount added. */
    @stub
    def plus(amountToAdd: TemporalAmount): Instant = ???

    /** Returns a copy of this instant with the specified duration in milliseconds added. */
    @stub
    def plusMillis(millisToAdd: Long): Instant = ???

    /** Returns a copy of this instant with the specified duration in nanoseconds added. */
    @stub
    def plusNanos(nanosToAdd: Long): Instant = ???

    /** Returns a copy of this instant with the specified duration in seconds added. */
    @stub
    def plusSeconds(secondsToAdd: Long): Instant = ???

    /** Queries this instant using the specified query. */
    @stub
    def query[R](query: TemporalQuery[R]): R = ???

    /** Gets the range of valid values for the specified field. */
    @stub
    def range(field: TemporalField): ValueRange = ???

    /** Converts this instant to the number of milliseconds from the epoch
     *  of 1970-01-01T00:00:00Z.
     */
    @stub
    def toEpochMilli(): Long = ???

    /** A string representation of this instant using ISO-8601 representation. */
    @stub
    def toString(): String = ???

    /** Returns a copy of this Instant truncated to the specified unit. */
    @stub
    def truncatedTo(unit: TemporalUnit): Instant = ???

    /** Calculates the amount of time until another instant in terms of the specified unit. */
    @stub
    def until(endExclusive: Temporal, unit: TemporalUnit): Long = ???

    /** Returns an adjusted copy of this instant. */
    @stub
    def with(adjuster: TemporalAdjuster): Instant = ???

    /** Returns a copy of this instant with the specified field set to a new value. */
    @stub
    def with(field: TemporalField, newValue: Long): Instant = ???
}

object Instant {
    /** Constant for the 1970-01-01T00:00:00Z epoch instant. */
    @stub
    val EPOCH: Instant = ???

    /** The maximum supported Instant, '1000000000-12-31T23:59:59.999999999Z'. */
    @stub
    val MAX: Instant = ???

    /** The minimum supported Instant, '-1000000000-01-01T00:00Z'. */
    @stub
    val MIN: Instant = ???

    /** Obtains an instance of Instant from a temporal object. */
    @stub
    def from(temporal: TemporalAccessor): Instant = ???

    /** Obtains the current instant from the system clock. */
    @stub
    def now(): Instant = ???

    /** Obtains the current instant from the specified clock. */
    @stub
    def now(clock: Clock): Instant = ???

    /** Obtains an instance of Instant using milliseconds from the
     *  epoch of 1970-01-01T00:00:00Z.
     */
    @stub
    def ofEpochMilli(epochMilli: Long): Instant = ???

    /** Obtains an instance of Instant using seconds from the
     *  epoch of 1970-01-01T00:00:00Z.
     */
    @stub
    def ofEpochSecond(epochSecond: Long): Instant = ???

    /** Obtains an instance of Instant using seconds from the
     *  epoch of 1970-01-01T00:00:00Z and nanosecond fraction of second.
     */
    @stub
    def ofEpochSecond(epochSecond: Long, nanoAdjustment: Long): Instant = ???

    /** Obtains an instance of Instant from a text string such as
     *  2007-12-03T10:15:30.00Z.
     */
    @stub
    def parse(text: CharSequence): Instant = ???
}
