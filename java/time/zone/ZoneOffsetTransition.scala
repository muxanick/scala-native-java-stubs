package java.time.zone

import java.io.Serializable
import java.lang.{Comparable, Object}
import java.time.{Duration, Instant, LocalDateTime, ZoneOffset}

// A transition between two offsets caused by a discontinuity in the local time-line.
// 
// A transition between two offsets is normally the result of a daylight savings cutover.
// The discontinuity is normally a gap in spring and an overlap in autumn.
// ZoneOffsetTransition models the transition between the two offsets.
// 
// Gaps occur where there are local date-times that simply do not exist.
// An example would be when the offset changes from +03:00 to +04:00.
// This might be described as 'the clocks will move forward one hour tonight at 1am'.
// 
// Overlaps occur where there are local date-times that exist twice.
// An example would be when the offset changes from +04:00 to +03:00.
// This might be described as 'the clocks will move back one hour tonight at 2am'.
final class ZoneOffsetTransition extends Object with Comparable[ZoneOffsetTransition], with Serializable {

    @stub
    // Compares this transition to another based on the transition instant.
    def compareTo(transition: ZoneOffsetTransition): Int = ???

    @stub
    // Checks if this object equals another.
    def equals(other: Object): Boolean = ???

    @stub
    // Gets the local transition date-time, as would be expressed with the 'after' offset.
    def getDateTimeAfter(): LocalDateTime = ???

    @stub
    // Gets the local transition date-time, as would be expressed with the 'before' offset.
    def getDateTimeBefore(): LocalDateTime = ???

    @stub
    // Gets the duration of the transition.
    def getDuration(): Duration = ???

    @stub
    // Gets the transition instant.
    def getInstant(): Instant = ???

    @stub
    // Gets the offset after the transition.
    def getOffsetAfter(): ZoneOffset = ???

    @stub
    // Gets the offset before the transition.
    def getOffsetBefore(): ZoneOffset = ???

    @stub
    // Returns a suitable hash code.
    def hashCode(): Int = ???

    @stub
    // Does this transition represent a gap in the local time-line.
    def isGap(): Boolean = ???

    @stub
    // Does this transition represent an overlap in the local time-line.
    def isOverlap(): Boolean = ???

    @stub
    // Checks if the specified offset is valid during this transition.
    def isValidOffset(offset: ZoneOffset): Boolean = ???

    @stub
    // Gets the transition instant as an epoch second.
    def toEpochSecond(): Long = ???
}

object ZoneOffsetTransition {
    @stub
    // Obtains an instance defining a transition between two offsets.
    def of(transition: LocalDateTime, offsetBefore: ZoneOffset, offsetAfter: ZoneOffset): ZoneOffsetTransition = ???
}
