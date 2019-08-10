package java.nio.file.attribute

import java.lang.{Comparable, Object, String}
import java.time.Instant
import java.util.concurrent.TimeUnit
import scala.scalanative.annotation.stub

/** Represents the value of a file's time stamp attribute. For example, it may
 *  represent the time that the file was last
 *  modified,
 *  accessed,
 *  or created.
 * 
 *   Instances of this class are immutable.
 */
final class FileTime extends Object with Comparable[FileTime] {

    /** Compares the value of two FileTime objects for order. */
    @stub
    def compareTo(other: FileTime): Int = ???

    /** Tests this FileTime for equality with the given object. */
    @stub
    def equals(obj: Any): Boolean = ???

    /** Computes a hash code for this file time. */
    @stub
    def hashCode(): Int = ???

    /** Returns the value at the given unit of granularity. */
    @stub
    def to(unit: TimeUnit): Long = ???

    /** Converts this FileTime object to an Instant. */
    @stub
    def toInstant(): Instant = ???

    /** Returns the value in milliseconds. */
    @stub
    def toMillis(): Long = ???

    /** Returns the string representation of this FileTime. */
    @stub
    def toString(): String = ???
}

object FileTime {
    /** Returns a FileTime representing the same point of time value
     *  on the time-line as the provided Instant object.
     */
    @stub
    def from(instant: Instant): FileTime = ???

    /** Returns a FileTime representing a value at the given unit of
     *  granularity.
     */
    @stub
    def from(value: Long, unit: TimeUnit): FileTime = ???

    /** Returns a FileTime representing the given value in milliseconds. */
    @stub
    def fromMillis(value: Long): FileTime = ???
}
