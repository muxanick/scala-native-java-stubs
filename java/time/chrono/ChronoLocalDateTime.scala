package java.time.chrono

import java.lang.{Comparable, Object, String}
import java.time.{Instant, LocalTime, ZoneId, ZoneOffset}
import java.time.format.DateTimeFormatter
import java.time.temporal.{Temporal, TemporalAccessor, TemporalAdjuster, TemporalAmount, TemporalField, TemporalQuery, TemporalUnit}
import java.util.Comparator

// A date-time without a time-zone in an arbitrary chronology, intended
// for advanced globalization use cases.
// 
// Most applications should declare method signatures, fields and variables
// as LocalDateTime, not this interface.
// 
// A ChronoLocalDateTime is the abstract representation of a local date-time
// where the Chronology chronology, or calendar system, is pluggable.
// The date-time is defined in terms of fields expressed by TemporalField,
// where most common implementations are defined in ChronoField.
// The chronology defines how the calendar system operates and the meaning of
// the standard fields.
//
// When to use this interface
// The design of the API encourages the use of LocalDateTime rather than this
// interface, even in the case where the application needs to deal with multiple
// calendar systems. The rationale for this is explored in detail in ChronoLocalDate.
// 
// Ensure that the discussion in ChronoLocalDate has been read and understood
// before using this interface.
trait ChronoLocalDateTime[D <: ChronoLocalDate] extends Temporal , TemporalAdjuster , Comparable[ChronoLocalDateTime[_]] {

    @stub
    // Adjusts the specified temporal object to have the same date and time as this object.
    def Temporal: default = ???

    @stub
    // Combines this time with a time-zone to create a ChronoZonedDateTime.
    def atZone(zone: ZoneId): ChronoZonedDateTime[D] = ???

    @stub
    // Compares this date-time to another date-time, including the chronology.
    def Int: default = ???

    @stub
    // Checks if this date-time is equal to another date-time, including the chronology.
    def equals(obj: Object): Boolean = ???

    @stub
    // Formats this date-time using the specified formatter.
    def String: default = ???

    @stub
    // Gets the chronology of this date-time.
    def Chronology: default = ???

    @stub
    // A hash code for this date-time.
    def hashCode(): Int = ???

    @stub
    // Checks if this date-time is after the specified date-time ignoring the chronology.
    def Boolean: default = ???

    @stub
    // Checks if this date-time is before the specified date-time ignoring the chronology.
    def Boolean: default = ???

    @stub
    // Checks if this date-time is equal to the specified date-time ignoring the chronology.
    def Boolean: default = ???

    @stub
    // Checks if the specified field is supported.
    def isSupported(field: TemporalField): Boolean = ???

    @stub
    // Checks if the specified unit is supported.
    def Boolean: default = ???

    @stub
    // Returns an object of the same type as this object with the specified period subtracted.
    def ChronoLocalDateTime[D]: default = ???

    @stub
    // Returns an object of the same type as this object with an amount subtracted.
    def ChronoLocalDateTime[D]: default = ???

    @stub
    // Returns an object of the same type as this object with the specified period added.
    def plus(amountToAdd: Long, unit: TemporalUnit): ChronoLocalDateTime[D] = ???

    @stub
    // Returns an object of the same type as this object with an amount added.
    def ChronoLocalDateTime[D]: default = ???

    @stub
    // Queries this date-time using the specified query.
    def R: default[R] = ???

    @stub
    // Converts this date-time to the number of seconds from the epoch
    // of 1970-01-01T00:00:00Z.
    def Long: default = ???

    @stub
    // Converts this date-time to an Instant.
    def Instant: default = ???

    @stub
    // Gets the local date part of this date-time.
    def toLocalDate(): D = ???

    @stub
    // Gets the local time part of this date-time.
    def toLocalTime(): LocalTime = ???

    @stub
    // Outputs this date-time as a String.
    def toString(): String = ???

    @stub
    // Returns an adjusted object of the same type as this object with the adjustment made.
    def ChronoLocalDateTime[D]: default = ???
}

object ChronoLocalDateTime {
    @stub
    // Obtains an instance of ChronoLocalDateTime from a temporal object.
    def from(temporal: TemporalAccessor): ChronoLocalDateTime[_] = ???

    @stub
    // Gets a comparator that compares ChronoLocalDateTime in
    // time-line order ignoring the chronology.
    def timeLineOrder(): Comparator[ChronoLocalDateTime[_]] = ???
}
