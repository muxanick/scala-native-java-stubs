package java.time.temporal

import java.lang.{Long, String}
import java.time.format.ResolverStyle
import java.util.{Locale, Map}

/** A field of date-time, such as month-of-year or hour-of-minute.
 *  
 *  Date and time is expressed using fields which partition the time-line into something
 *  meaningful for humans. Implementations of this interface represent those fields.
 *  
 *  The most commonly used units are defined in ChronoField.
 *  Further fields are supplied in IsoFields, WeekFields and JulianFields.
 *  Fields can also be written by application code by implementing this interface.
 *  
 *  The field works using double dispatch. Client code calls methods on a date-time like
 *  LocalDateTime which check if the field is a ChronoField.
 *  If it is, then the date-time must handle it.
 *  Otherwise, the method call is re-dispatched to the matching method in this interface.
 */
trait TemporalField {

    /** Returns a copy of the specified temporal object with the value of this field set. */
    @stub
    def adjustInto[R <: Temporal](temporal: R, newValue: Long): R = ???

    /** Gets the unit that the field is measured in. */
    @stub
    def getBaseUnit(): TemporalUnit = ???

    /** Gets the display name for the field in the requested locale. */
    @stub
    val String: default = ???

    /** Gets the value of this field from the specified temporal object. */
    @stub
    def getFrom(temporal: TemporalAccessor): Long = ???

    /** Gets the range that the field is bound by. */
    @stub
    def getRangeUnit(): TemporalUnit = ???

    /** Checks if this field represents a component of a date. */
    @stub
    def isDateBased(): Boolean = ???

    /** Checks if this field is supported by the temporal object. */
    @stub
    def isSupportedBy(temporal: TemporalAccessor): Boolean = ???

    /** Checks if this field represents a component of a time. */
    @stub
    def isTimeBased(): Boolean = ???

    /** Gets the range of valid values for the field. */
    @stub
    def range(): ValueRange = ???

    /** Get the range of valid values for this field using the temporal object to
     *  refine the result.
     */
    @stub
    def rangeRefinedBy(temporal: TemporalAccessor): ValueRange = ???

    /** Resolves this field to provide a simpler alternative or a date. */
    @stub
    val TemporalAccessor: default = ???
}
