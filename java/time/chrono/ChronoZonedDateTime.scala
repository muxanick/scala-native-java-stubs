package java.time.chrono

import java.lang.{Comparable, Object, String}
import java.time.{Instant, LocalTime, ZoneId, ZoneOffset}
import java.time.format.DateTimeFormatter
import java.time.temporal.{Temporal, TemporalAccessor, TemporalAdjuster, TemporalAmount, TemporalField, TemporalQuery, TemporalUnit, ValueRange}
import java.util.Comparator

// A date-time with a time-zone in an arbitrary chronology,
// intended for advanced globalization use cases.
// 
// Most applications should declare method signatures, fields and variables
// as ZonedDateTime, not this interface.
// 
// A ChronoZonedDateTime is the abstract representation of an offset date-time
// where the Chronology chronology, or calendar system, is pluggable.
// The date-time is defined in terms of fields expressed by TemporalField,
// where most common implementations are defined in ChronoField.
// The chronology defines how the calendar system operates and the meaning of
// the standard fields.
//
// When to use this interface
// The design of the API encourages the use of ZonedDateTime rather than this
// interface, even in the case where the application needs to deal with multiple
// calendar systems. The rationale for this is explored in detail in ChronoLocalDate.
// 
// Ensure that the discussion in ChronoLocalDate has been read and understood
// before using this interface.
trait ChronoZonedDateTime[D <: ChronoLocalDate] extends Temporal , Comparable[ChronoZonedDateTime[_]] {

    @stub
    // Compares this date-time to another date-time, including the chronology.
    def Int: default = ???

    @stub
    // Checks if this date-time is equal to another date-time.
    def equals(obj: Object): Boolean = ???

    @stub
    // Formats this date-time using the specified formatter.
    def String: default = ???

    @stub
    // Gets the value of the specified field as an int.
    def Int: default = ???

    @stub
    // Gets the chronology of this date-time.
    def Chronology: default = ???

    @stub
    // Gets the value of the specified field as a long.
    def Long: default = ???

    @stub
    // Gets the zone offset, such as '+01:00'.
    def getOffset(): ZoneOffset = ???

    @stub
    // Gets the zone ID, such as 'Europe/Paris'.
    def getZone(): ZoneId = ???

    @stub
    // A hash code for this date-time.
    def hashCode(): Int = ???

    @stub
    // Checks if the instant of this date-time is after that of the specified date-time.
    def Boolean: default = ???

    @stub
    // Checks if the instant of this date-time is before that of the specified date-time.
    def Boolean: default = ???

    @stub
    // Checks if the instant of this date-time is equal to that of the specified date-time.
    def Boolean: default = ???

    @stub
    // Checks if the specified field is supported.
    def isSupported(field: TemporalField): Boolean = ???

    @stub
    // Checks if the specified unit is supported.
    def Boolean: default = ???

    @stub
    // Returns an object of the same type as this object with the specified period subtracted.
    def ChronoZonedDateTime[D]: default = ???

    @stub
    // Returns an object of the same type as this object with an amount subtracted.
    def ChronoZonedDateTime[D]: default = ???

    @stub
    // Returns an object of the same type as this object with the specified period added.
    def plus(amountToAdd: Long, unit: TemporalUnit): ChronoZonedDateTime[D] = ???

    @stub
    // Returns an object of the same type as this object with an amount added.
    def ChronoZonedDateTime[D]: default = ???

    @stub
    // Queries this date-time using the specified query.
    def R: default[R] = ???

    @stub
    // Gets the range of valid values for the specified field.
    def ValueRange: default = ???

    @stub
    // Converts this date-time to the number of seconds from the epoch
    // of 1970-01-01T00:00:00Z.
    def Long: default = ???

    @stub
    // Converts this date-time to an Instant.
    def Instant: default = ???

    @stub
    // Gets the local date part of this date-time.
    def D: default = ???

    @stub
    // Gets the local date-time part of this date-time.
    def toLocalDateTime(): ChronoLocalDateTime[D] = ???

    @stub
    // Gets the local time part of this date-time.
    def LocalTime: default = ???

    @stub
    // Outputs this date-time as a String.
    def toString(): String = ???

    @stub
    // Returns an adjusted object of the same type as this object with the adjustment made.
    def ChronoZonedDateTime[D]: default = ???

    @stub
    // Returns an object of the same type as this object with the specified field altered.
    def with(field: TemporalField, newValue: Long): ChronoZonedDateTime[D] = ???

    @stub
    // Returns a copy of this date-time changing the zone offset to the
    // earlier of the two valid offsets at a local time-line overlap.
    def withEarlierOffsetAtOverlap(): ChronoZonedDateTime[D] = ???

    @stub
    // Returns a copy of this date-time changing the zone offset to the
    // later of the two valid offsets at a local time-line overlap.
    def withLaterOffsetAtOverlap(): ChronoZonedDateTime[D] = ???

    @stub
    // Returns a copy of this date-time with a different time-zone,
    // retaining the instant.
    def withZoneSameInstant(zone: ZoneId): ChronoZonedDateTime[D] = ???
}

object ChronoZonedDateTime {
    @stub
    // Obtains an instance of ChronoZonedDateTime from a temporal object.
    def from(temporal: TemporalAccessor): ChronoZonedDateTime[_] = ???

    @stub
    // Gets a comparator that compares ChronoZonedDateTime in
    // time-line order ignoring the chronology.
    def timeLineOrder(): Comparator[ChronoZonedDateTime[_]] = ???
}
