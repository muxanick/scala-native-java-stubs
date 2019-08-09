package java.time

import java.io.Serializable
import java.lang.{Comparable, Object, String}
import java.time.temporal.{Temporal, TemporalAccessor, TemporalAdjuster, TemporalField, TemporalQuery, ValueRange}
import java.time.zone.ZoneRules
import scala.scalanative.annotation.stub

/** A time-zone offset from Greenwich/UTC, such as +02:00.
 *  
 *  A time-zone offset is the amount of time that a time-zone differs from Greenwich/UTC.
 *  This is usually a fixed number of hours and minutes.
 *  
 *  Different parts of the world have different time-zone offsets.
 *  The rules for how offsets vary by place and time of year are captured in the
 *  ZoneId class.
 *  
 *  For example, Paris is one hour ahead of Greenwich/UTC in winter and two hours
 *  ahead in summer. The ZoneId instance for Paris will reference two
 *  ZoneOffset instances - a +01:00 instance for winter,
 *  and a +02:00 instance for summer.
 *  
 *  In 2008, time-zone offsets around the world extended from -12:00 to +14:00.
 *  To prevent any problems with that range being extended, yet still provide
 *  validation, the range of offsets is restricted to -18:00 to 18:00 inclusive.
 *  
 *  This class is designed for use with the ISO calendar system.
 *  The fields of hours, minutes and seconds make assumptions that are valid for the
 *  standard ISO definitions of those fields. This class may be used with other
 *  calendar systems providing the definition of the time fields matches those
 *  of the ISO calendar system.
 *  
 *  Instances of ZoneOffset must be compared using equals(java.lang.Object).
 *  Implementations may choose to cache certain common offsets, however
 *  applications must not rely on such caching.
 * 
 *  
 *  This is a value-based
 *  class; use of identity-sensitive operations (including reference equality
 *  (==), identity hash code, or synchronization) on instances of
 *  ZoneOffset may have unpredictable results and should be avoided.
 *  The equals method should be used for comparisons.
 */
final class ZoneOffset extends ZoneId with TemporalAccessor with TemporalAdjuster with Comparable[ZoneOffset] with Serializable {

    /** Adjusts the specified temporal object to have the same offset as this object. */
    @stub
    def adjustInto(temporal: Temporal): Temporal = ???

    /** Compares this offset to another offset in descending order. */
    @stub
    def compareTo(other: ZoneOffset): Int = ???

    /** Checks if this offset is equal to another offset. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Gets the value of the specified field from this offset as an int. */
    @stub
    def get(field: TemporalField): Int = ???

    /** Gets the normalized zone offset ID. */
    @stub
    def getId(): String = ???

    /** Gets the value of the specified field from this offset as a long. */
    @stub
    def getLong(field: TemporalField): Long = ???

    /** Gets the associated time-zone rules. */
    @stub
    def getRules(): ZoneRules = ???

    /** Gets the total zone offset in seconds. */
    @stub
    def getTotalSeconds(): Int = ???

    /** A hash code for this offset. */
    @stub
    def hashCode(): Int = ???

    /** Checks if the specified field is supported. */
    @stub
    def isSupported(field: TemporalField): Boolean = ???

    /** Queries this offset using the specified query. */
    @stub
    def query[R](query: TemporalQuery[R]): R = ???

    /** Gets the range of valid values for the specified field. */
    @stub
    def range(field: TemporalField): ValueRange = ???

    /** Outputs this offset as a String, using the normalized ID. */
    @stub
    def toString(): String = ???
}

object ZoneOffset {
    /** Constant for the maximum supported offset. */
    @stub
    val MAX: ZoneOffset = ???

    /** Constant for the maximum supported offset. */
    @stub
    val MIN: ZoneOffset = ???

    /** The time-zone offset for UTC, with an ID of 'Z'. */
    @stub
    val UTC: ZoneOffset = ???

    /** Obtains an instance of ZoneOffset from a temporal object. */
    @stub
    def from(temporal: TemporalAccessor): ZoneOffset = ???

    /** Obtains an instance of ZoneOffset using the ID. */
    @stub
    def of(offsetId: String): ZoneOffset = ???

    /** Obtains an instance of ZoneOffset using an offset in hours. */
    @stub
    def ofHours(hours: Int): ZoneOffset = ???

    /** Obtains an instance of ZoneOffset using an offset in
     *  hours and minutes.
     */
    @stub
    def ofHoursMinutes(hours: Int, minutes: Int): ZoneOffset = ???

    /** Obtains an instance of ZoneOffset using an offset in
     *  hours, minutes and seconds.
     */
    @stub
    def ofHoursMinutesSeconds(hours: Int, minutes: Int, seconds: Int): ZoneOffset = ???

    /** Obtains an instance of ZoneOffset specifying the total offset in seconds */
    @stub
    def ofTotalSeconds(totalSeconds: Int): ZoneOffset = ???
}
