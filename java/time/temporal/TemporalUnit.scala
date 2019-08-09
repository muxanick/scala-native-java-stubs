package java.time.temporal

import java.lang.String
import java.time.Duration
import scala.scalanative.annotation.stub

/** A unit of date-time, such as Days or Hours.
 *  
 *  Measurement of time is built on units, such as years, months, days, hours, minutes and seconds.
 *  Implementations of this interface represent those units.
 *  
 *  An instance of this interface represents the unit itself, rather than an amount of the unit.
 *  See Period for a class that represents an amount in terms of the common units.
 *  
 *  The most commonly used units are defined in ChronoUnit.
 *  Further units are supplied in IsoFields.
 *  Units can also be written by application code by implementing this interface.
 *  
 *  The unit works using double dispatch. Client code calls methods on a date-time like
 *  LocalDateTime which check if the unit is a ChronoUnit.
 *  If it is, then the date-time must handle it.
 *  Otherwise, the method call is re-dispatched to the matching method in this interface.
 */
trait TemporalUnit {

    /** Returns a copy of the specified temporal object with the specified period added. */
    @stub
    def addTo[R <: Temporal](temporal: R, amount: Long): R = ???

    /** Calculates the amount of time between two temporal objects. */
    @stub
    def between(temporal1Inclusive: Temporal, temporal2Exclusive: Temporal): Long = ???

    /** Gets the duration of this unit, which may be an estimate. */
    @stub
    def getDuration(): Duration = ???

    /** Checks if this unit represents a component of a date. */
    @stub
    def isDateBased(): Boolean = ???

    /** Checks if the duration of the unit is an estimate. */
    @stub
    def isDurationEstimated(): Boolean = ???

    /** Checks if this unit is supported by the specified temporal object. */
    @stub
    def isSupportedBy(temporal: Temporal): Boolean = ???

    /** Checks if this unit represents a component of a time. */
    @stub
    def isTimeBased(): Boolean = ???

    /** Gets a descriptive name for the unit. */
    @stub
    def toString(): String = ???
}
