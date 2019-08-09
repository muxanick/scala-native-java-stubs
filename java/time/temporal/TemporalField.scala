package java.time.temporal

import java.lang.{Long, String}
import java.time.format.ResolverStyle
import java.util.{Locale, Map}

// A field of date-time, such as month-of-year or hour-of-minute.
// 
// Date and time is expressed using fields which partition the time-line into something
// meaningful for humans. Implementations of this interface represent those fields.
// 
// The most commonly used units are defined in ChronoField.
// Further fields are supplied in IsoFields, WeekFields and JulianFields.
// Fields can also be written by application code by implementing this interface.
// 
// The field works using double dispatch. Client code calls methods on a date-time like
// LocalDateTime which check if the field is a ChronoField.
// If it is, then the date-time must handle it.
// Otherwise, the method call is re-dispatched to the matching method in this interface.
trait TemporalField {

    @stub
    // Returns a copy of the specified temporal object with the value of this field set.
    def R: [R <: Temporal] = ???

    @stub
    // Gets the unit that the field is measured in.
    def getBaseUnit(): TemporalUnit = ???

    @stub
    // Gets the display name for the field in the requested locale.
    def String: default = ???

    @stub
    // Gets the value of this field from the specified temporal object.
    def getFrom(temporal: TemporalAccessor): Long = ???

    @stub
    // Gets the range that the field is bound by.
    def getRangeUnit(): TemporalUnit = ???

    @stub
    // Checks if this field represents a component of a date.
    def isDateBased(): Boolean = ???

    @stub
    // Checks if this field is supported by the temporal object.
    def isSupportedBy(temporal: TemporalAccessor): Boolean = ???

    @stub
    // Checks if this field represents a component of a time.
    def isTimeBased(): Boolean = ???

    @stub
    // Gets the range of valid values for the field.
    def range(): ValueRange = ???

    @stub
    // Get the range of valid values for this field using the temporal object to
    // refine the result.
    def rangeRefinedBy(temporal: TemporalAccessor): ValueRange = ???

    @stub
    // Resolves this field to provide a simpler alternative or a date.
    def TemporalAccessor: default = ???
}
