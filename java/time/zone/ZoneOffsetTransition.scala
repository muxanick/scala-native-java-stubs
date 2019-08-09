package java.time.zone

import java.io.Serializable
import java.lang.{Comparable, Object, String}
import java.time.{Duration, Instant, LocalDateTime, ZoneOffset}
import scala.scalanative.annotation.stub

/** A transition between two offsets caused by a discontinuity in the local time-line.
 *  
 *  A transition between two offsets is normally the result of a daylight savings cutover.
 *  The discontinuity is normally a gap in spring and an overlap in autumn.
 *  ZoneOffsetTransition models the transition between the two offsets.
 *  
 *  Gaps occur where there are local date-times that simply do not exist.
 *  An example would be when the offset changes from +03:00 to +04:00.
 *  This might be described as 'the clocks will move forward one hour tonight at 1am'.
 *  
 *  Overlaps occur where there are local date-times that exist twice.
 *  An example would be when the offset changes from +04:00 to +03:00.
 *  This might be described as 'the clocks will move back one hour tonight at 2am'.
 */
final class ZoneOffsetTransition extends Object with Comparable[ZoneOffsetTransition] with Serializable {

    /** Compares this transition to another based on the transition instant. */
    @stub
    def compareTo(transition: ZoneOffsetTransition): Int = ???

    /** Checks if this object equals another. */
    @stub
    def equals(other: Object): Boolean = ???

    /** Gets the local transition date-time, as would be expressed with the 'after' offset. */
    @stub
    def getDateTimeAfter(): LocalDateTime = ???

    /** Gets the local transition date-time, as would be expressed with the 'before' offset. */
    @stub
    def getDateTimeBefore(): LocalDateTime = ???

    /** Gets the duration of the transition. */
    @stub
    def getDuration(): Duration = ???

    /** Gets the transition instant. */
    @stub
    def getInstant(): Instant = ???

    /** Gets the offset after the transition. */
    @stub
    def getOffsetAfter(): ZoneOffset = ???

    /** Gets the offset before the transition. */
    @stub
    def getOffsetBefore(): ZoneOffset = ???

    /** Returns a suitable hash code. */
    @stub
    def hashCode(): Int = ???

    /** Does this transition represent a gap in the local time-line. */
    @stub
    def isGap(): Boolean = ???

    /** Does this transition represent an overlap in the local time-line. */
    @stub
    def isOverlap(): Boolean = ???

    /** Checks if the specified offset is valid during this transition. */
    @stub
    def isValidOffset(offset: ZoneOffset): Boolean = ???

    /** Gets the transition instant as an epoch second. */
    @stub
    def toEpochSecond(): Long = ???

    /** Returns a string describing this object. */
    @stub
    def toString(): String = ???
}

object ZoneOffsetTransition {
    /** Obtains an instance defining a transition between two offsets. */
    @stub
    def of(transition: LocalDateTime, offsetBefore: ZoneOffset, offsetAfter: ZoneOffset): ZoneOffsetTransition = ???
}
