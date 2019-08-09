package java.time

import java.io.Serializable
import java.lang.{Comparable, Object, String}
import java.time.temporal.{Temporal, TemporalAccessor, TemporalAdjuster, TemporalField, TemporalQuery, ValueRange}
import java.time.zone.ZoneRules

// A time-zone offset from Greenwich/UTC, such as +02:00.
// 
// A time-zone offset is the amount of time that a time-zone differs from Greenwich/UTC.
// This is usually a fixed number of hours and minutes.
// 
// Different parts of the world have different time-zone offsets.
// The rules for how offsets vary by place and time of year are captured in the
// ZoneId class.
// 
// For example, Paris is one hour ahead of Greenwich/UTC in winter and two hours
// ahead in summer. The ZoneId instance for Paris will reference two
// ZoneOffset instances - a +01:00 instance for winter,
// and a +02:00 instance for summer.
// 
// In 2008, time-zone offsets around the world extended from -12:00 to +14:00.
// To prevent any problems with that range being extended, yet still provide
// validation, the range of offsets is restricted to -18:00 to 18:00 inclusive.
// 
// This class is designed for use with the ISO calendar system.
// The fields of hours, minutes and seconds make assumptions that are valid for the
// standard ISO definitions of those fields. This class may be used with other
// calendar systems providing the definition of the time fields matches those
// of the ISO calendar system.
// 
// Instances of ZoneOffset must be compared using equals(java.lang.Object).
// Implementations may choose to cache certain common offsets, however
// applications must not rely on such caching.
//
// 
// This is a value-based
// class; use of identity-sensitive operations (including reference equality
// (==), identity hash code, or synchronization) on instances of
// ZoneOffset may have unpredictable results and should be avoided.
// The equals method should be used for comparisons.
final class ZoneOffset extends ZoneId with TemporalAccessor, with TemporalAdjuster, with Comparable[ZoneOffset], with Serializable {

    @stub
    // Adjusts the specified temporal object to have the same offset as this object.
    def adjustInto(temporal: Temporal): Temporal = ???

    @stub
    // Compares this offset to another offset in descending order.
    def compareTo(other: ZoneOffset): Int = ???

    @stub
    // Checks if this offset is equal to another offset.
    def equals(obj: Object): Boolean = ???

    @stub
    // Gets the value of the specified field from this offset as an int.
    def get(field: TemporalField): Int = ???

    @stub
    // Gets the normalized zone offset ID.
    def getId(): String = ???

    @stub
    // Gets the value of the specified field from this offset as a long.
    def getLong(field: TemporalField): Long = ???

    @stub
    // Gets the associated time-zone rules.
    def getRules(): ZoneRules = ???

    @stub
    // Gets the total zone offset in seconds.
    def getTotalSeconds(): Int = ???

    @stub
    // A hash code for this offset.
    def hashCode(): Int = ???

    @stub
    // Checks if the specified field is supported.
    def isSupported(field: TemporalField): Boolean = ???

    @stub
    // Queries this offset using the specified query.
    def R: [R] = ???

    @stub
    // Gets the range of valid values for the specified field.
    def range(field: TemporalField): ValueRange = ???
}

object ZoneOffset {
    @stub
    // Constant for the maximum supported offset.
    def MAX: ZoneOffset = ???

    @stub
    // Constant for the maximum supported offset.
    def MIN: ZoneOffset = ???

    @stub
    // Obtains an instance of ZoneOffset from a temporal object.
    def from(temporal: TemporalAccessor): ZoneOffset = ???

    @stub
    // Obtains an instance of ZoneOffset using the ID.
    def of(offsetId: String): ZoneOffset = ???

    @stub
    // Obtains an instance of ZoneOffset using an offset in hours.
    def ofHours(hours: Int): ZoneOffset = ???

    @stub
    // Obtains an instance of ZoneOffset using an offset in
    // hours and minutes.
    def ofHoursMinutes(hours: Int, minutes: Int): ZoneOffset = ???

    @stub
    // Obtains an instance of ZoneOffset using an offset in
    // hours, minutes and seconds.
    def ofHoursMinutesSeconds(hours: Int, minutes: Int, seconds: Int): ZoneOffset = ???

    @stub
    // Obtains an instance of ZoneOffset specifying the total offset in seconds
    def ofTotalSeconds(totalSeconds: Int): ZoneOffset = ???
}
