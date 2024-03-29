package java.time.chrono

import java.lang.{Comparable, Object, String}
import java.time.{Instant, LocalTime, ZoneId, ZoneOffset}
import java.time.format.DateTimeFormatter
import java.time.temporal.{Temporal, TemporalAccessor, TemporalAdjuster, TemporalAmount, TemporalField, TemporalQuery, TemporalUnit, ValueRange}
import java.util.Comparator
import scala.scalanative.annotation.stub

/** A date-time with a time-zone in an arbitrary chronology,
 *  intended for advanced globalization use cases.
 *  
 *  Most applications should declare method signatures, fields and variables
 *  as ZonedDateTime, not this interface.
 *  
 *  A ChronoZonedDateTime is the abstract representation of an offset date-time
 *  where the Chronology chronology, or calendar system, is pluggable.
 *  The date-time is defined in terms of fields expressed by TemporalField,
 *  where most common implementations are defined in ChronoField.
 *  The chronology defines how the calendar system operates and the meaning of
 *  the standard fields.
 * 
 *  When to use this interface
 *  The design of the API encourages the use of ZonedDateTime rather than this
 *  interface, even in the case where the application needs to deal with multiple
 *  calendar systems. The rationale for this is explored in detail in ChronoLocalDate.
 *  
 *  Ensure that the discussion in ChronoLocalDate has been read and understood
 *  before using this interface.
 */
trait ChronoZonedDateTime[D <: ChronoLocalDate] extends Temporal with Comparable[ChronoZonedDateTime[_]] {

    /** Compares this date-time to another date-time, including the chronology. */
    @stub
    def compareTo(other: ChronoZonedDateTime[_]): Int = ???

    /** Checks if this date-time is equal to another date-time. */
    @stub
    def equals(obj: Any): Boolean = ???

    /** Formats this date-time using the specified formatter. */
    @stub
    def format(formatter: DateTimeFormatter): String = ???

    /** Gets the value of the specified field as an int. */
    @stub
    def get(field: TemporalField): Int = ???

    /** Gets the chronology of this date-time. */
    @stub
    def getChronology(): Chronology = ???

    /** Gets the value of the specified field as a long. */
    @stub
    def getLong(field: TemporalField): Long = ???

    /** Gets the zone offset, such as '+01:00'. */
    @stub
    def getOffset(): ZoneOffset = ???

    /** Gets the zone ID, such as 'Europe/Paris'. */
    @stub
    def getZone(): ZoneId = ???

    /** A hash code for this date-time. */
    @stub
    def hashCode(): Int = ???

    /** Checks if the instant of this date-time is after that of the specified date-time. */
    @stub
    def isAfter(other: ChronoZonedDateTime[_]): Boolean = ???

    /** Checks if the instant of this date-time is before that of the specified date-time. */
    @stub
    def isBefore(other: ChronoZonedDateTime[_]): Boolean = ???

    /** Checks if the instant of this date-time is equal to that of the specified date-time. */
    @stub
    def isEqual(other: ChronoZonedDateTime[_]): Boolean = ???

    /** Checks if the specified field is supported. */
    @stub
    def isSupported(field: TemporalField): Boolean = ???

    /** Checks if the specified unit is supported. */
    @stub
    def isSupported(unit: TemporalUnit): Boolean = ???

    /** Returns an object of the same type as this object with the specified period subtracted. */
    @stub
    def minus(amountToSubtract: Long, unit: TemporalUnit): ChronoZonedDateTime[D] = ???

    /** Returns an object of the same type as this object with an amount subtracted. */
    @stub
    def minus(amount: TemporalAmount): ChronoZonedDateTime[D] = ???

    /** Returns an object of the same type as this object with the specified period added. */
    @stub
    def plus(amountToAdd: Long, unit: TemporalUnit): ChronoZonedDateTime[D] = ???

    /** Returns an object of the same type as this object with an amount added. */
    @stub
    def plus(amount: TemporalAmount): ChronoZonedDateTime[D] = ???

    /** Queries this date-time using the specified query. */
    @stub
    val R: default[R] = ???

    /** Gets the range of valid values for the specified field. */
    @stub
    def range(field: TemporalField): ValueRange = ???

    /** Converts this date-time to the number of seconds from the epoch
     *  of 1970-01-01T00:00:00Z.
     */
    @stub
    def toEpochSecond(): Long = ???

    /** Converts this date-time to an Instant. */
    @stub
    def toInstant(): Instant = ???

    /** Gets the local date part of this date-time. */
    @stub
    def toLocalDate(): D = ???

    /** Gets the local date-time part of this date-time. */
    @stub
    def toLocalDateTime(): ChronoLocalDateTime[D] = ???

    /** Gets the local time part of this date-time. */
    @stub
    def toLocalTime(): LocalTime = ???

    /** Outputs this date-time as a String. */
    @stub
    def toString(): String = ???

    /** Returns an adjusted object of the same type as this object with the adjustment made. */
    @stub
    def with(adjuster: TemporalAdjuster): ChronoZonedDateTime[D] = ???

    /** Returns an object of the same type as this object with the specified field altered. */
    @stub
    def with(field: TemporalField, newValue: Long): ChronoZonedDateTime[D] = ???

    /** Returns a copy of this date-time changing the zone offset to the
     *  earlier of the two valid offsets at a local time-line overlap.
     */
    @stub
    def withEarlierOffsetAtOverlap(): ChronoZonedDateTime[D] = ???

    /** Returns a copy of this date-time changing the zone offset to the
     *  later of the two valid offsets at a local time-line overlap.
     */
    @stub
    def withLaterOffsetAtOverlap(): ChronoZonedDateTime[D] = ???

    /** Returns a copy of this date-time with a different time-zone,
     *  retaining the instant.
     */
    @stub
    def withZoneSameInstant(zone: ZoneId): ChronoZonedDateTime[D] = ???

    /** Returns a copy of this date-time with a different time-zone,
     *  retaining the local date-time if possible.
     */
    @stub
    def withZoneSameLocal(zone: ZoneId): ChronoZonedDateTime[D] = ???
}

object ChronoZonedDateTime {
    /** Obtains an instance of ChronoZonedDateTime from a temporal object. */
    @stub
    def from(temporal: TemporalAccessor): ChronoZonedDateTime[_] = ???

    /** Gets a comparator that compares ChronoZonedDateTime in
     *  time-line order ignoring the chronology.
     */
    @stub
    def timeLineOrder(): Comparator[ChronoZonedDateTime[_]] = ???
}
