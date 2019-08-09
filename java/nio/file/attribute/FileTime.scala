package java.nio.file.attribute

import java.lang.{Comparable, Object}
import java.time.Instant
import java.util.concurrent.TimeUnit

// Represents the value of a file's time stamp attribute. For example, it may
// represent the time that the file was last
// modified,
// accessed,
// or created.
//
//  Instances of this class are immutable.
final class FileTime extends Object with Comparable[FileTime] {

    @stub
    // Compares the value of two FileTime objects for order.
    def compareTo(other: FileTime): Int = ???

    @stub
    // Tests this FileTime for equality with the given object.
    def equals(obj: Object): Boolean = ???

    @stub
    // Computes a hash code for this file time.
    def hashCode(): Int = ???

    @stub
    // Returns the value at the given unit of granularity.
    def to(unit: TimeUnit): Long = ???

    @stub
    // Converts this FileTime object to an Instant.
    def toInstant(): Instant = ???

    @stub
    // Returns the value in milliseconds.
    def toMillis(): Long = ???
}

object FileTime {
    @stub
    // Returns a FileTime representing the same point of time value
    // on the time-line as the provided Instant object.
    def from(instant: Instant): FileTime = ???

    @stub
    // Returns a FileTime representing a value at the given unit of
    // granularity.
    def from(value: Long, unit: TimeUnit): FileTime = ???

    @stub
    // Returns a FileTime representing the given value in milliseconds.
    def fromMillis(value: Long): FileTime = ???
}
