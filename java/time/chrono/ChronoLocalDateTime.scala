package java.time.chrono

import java.lang.{Comparable, Object, String}
import java.time.{Instant, LocalTime, ZoneId, ZoneOffset}
import java.time.format.DateTimeFormatter
import java.time.temporal.{Temporal, TemporalAccessor, TemporalAdjuster, TemporalAmount, TemporalField, TemporalQuery, TemporalUnit}
import java.util.Comparator
import scala.scalanative.annotation.stub

/** A date-time without a time-zone in an arbitrary chronology, intended
 *  for advanced globalization use cases.
 *  
 *  Most applications should declare method signatures, fields and variables
 *  as LocalDateTime, not this interface.
 *  
 *  A ChronoLocalDateTime is the abstract representation of a local date-time
 *  where the Chronology chronology, or calendar system, is pluggable.
 *  The date-time is defined in terms of fields expressed by TemporalField,
 *  where most common implementations are defined in ChronoField.
 *  The chronology defines how the calendar system operates and the meaning of
 *  the standard fields.
 * 
 *  When to use this interface
 *  The design of the API encourages the use of LocalDateTime rather than this
 *  interface, even in the case where the application needs to deal with multiple
 *  calendar systems. The rationale for this is explored in detail in ChronoLocalDate.
 *  
 *  Ensure that the discussion in ChronoLocalDate has been read and understood
 *  before using this interface.
 */
trait ChronoLocalDateTime[D <: ChronoLocalDate] extends Temporal with TemporalAdjuster with Comparable[ChronoLocalDateTime[_]] {

    /** Adjusts the specified temporal object to have the same date and time as this object. */
    @stub
    def adjustInto(temporal: Temporal): Temporal = ???

    /** Combines this time with a time-zone to create a ChronoZonedDateTime. */
    @stub
    def atZone(zone: ZoneId): ChronoZonedDateTime[D] = ???

    /** Compares this date-time to another date-time, including the chronology. */
    @stub
    def compareTo(other: ChronoLocalDateTime[_]): Int = ???

    /** Checks if this date-time is equal to another date-time, including the chronology. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Formats this date-time using the specified formatter. */
    @stub
    def format(formatter: DateTimeFormatter): String = ???

    /** Gets the chronology of this date-time. */
    @stub
    def getChronology(): Chronology = ???

    /** A hash code for this date-time. */
    @stub
    def hashCode(): Int = ???

    /** Checks if this date-time is after the specified date-time ignoring the chronology. */
    @stub
    def isAfter(other: ChronoLocalDateTime[_]): Boolean = ???

    /** Checks if this date-time is before the specified date-time ignoring the chronology. */
    @stub
    def isBefore(other: ChronoLocalDateTime[_]): Boolean = ???

    /** Checks if this date-time is equal to the specified date-time ignoring the chronology. */
    @stub
    def isEqual(other: ChronoLocalDateTime[_]): Boolean = ???

    /** Checks if the specified field is supported. */
    @stub
    def isSupported(field: TemporalField): Boolean = ???

    /** Checks if the specified unit is supported. */
    @stub
    def isSupported(unit: TemporalUnit): Boolean = ???

    /** Returns an object of the same type as this object with the specified period subtracted. */
    @stub
    def minus(amountToSubtract: Long, unit: TemporalUnit): ChronoLocalDateTime[D] = ???

    /** Returns an object of the same type as this object with an amount subtracted. */
    @stub
    def minus(amount: TemporalAmount): ChronoLocalDateTime[D] = ???

    /** Returns an object of the same type as this object with the specified period added. */
    @stub
    def plus(amountToAdd: Long, unit: TemporalUnit): ChronoLocalDateTime[D] = ???

    /** Returns an object of the same type as this object with an amount added. */
    @stub
    def plus(amount: TemporalAmount): ChronoLocalDateTime[D] = ???

    /** Queries this date-time using the specified query. */
    @stub
    val R: default[R] = ???

    /** Converts this date-time to the number of seconds from the epoch
     *  of 1970-01-01T00:00:00Z.
     */
    @stub
    def toEpochSecond(offset: ZoneOffset): Long = ???

    /** Converts this date-time to an Instant. */
    @stub
    def toInstant(offset: ZoneOffset): Instant = ???

    /** Gets the local date part of this date-time. */
    @stub
    def toLocalDate(): D = ???

    /** Gets the local time part of this date-time. */
    @stub
    def toLocalTime(): LocalTime = ???

    /** Outputs this date-time as a String. */
    @stub
    def toString(): String = ???

    /** Returns an adjusted object of the same type as this object with the adjustment made. */
    @stub
    def with(adjuster: TemporalAdjuster): ChronoLocalDateTime[D] = ???

    /** Returns an object of the same type as this object with the specified field altered. */
    @stub
    def with(field: TemporalField, newValue: Long): ChronoLocalDateTime[D] = ???
}

object ChronoLocalDateTime {
    /** Obtains an instance of ChronoLocalDateTime from a temporal object. */
    @stub
    def from(temporal: TemporalAccessor): ChronoLocalDateTime[_] = ???

    /** Gets a comparator that compares ChronoLocalDateTime in
     *  time-line order ignoring the chronology.
     */
    @stub
    def timeLineOrder(): Comparator[ChronoLocalDateTime[_]] = ???
}
