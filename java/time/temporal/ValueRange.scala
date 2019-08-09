package java.time.temporal

import java.io.Serializable
import java.lang.Object

// The range of valid values for a date-time field.
// 
// All TemporalField instances have a valid range of values.
// For example, the ISO day-of-month runs from 1 to somewhere between 28 and 31.
// This class captures that valid range.
// 
// It is important to be aware of the limitations of this class.
// Only the minimum and maximum values are provided.
// It is possible for there to be invalid values within the outer range.
// For example, a weird field may have valid values of 1, 2, 4, 6, 7, thus
// have a range of '1 - 7', despite that fact that values 3 and 5 are invalid.
// 
// Instances of this class are not tied to a specific field.
final class ValueRange extends Object with Serializable {

    @stub
    // Checks that the specified value is valid and fits in an int.
    def checkValidIntValue(value: Long, field: TemporalField): Int = ???

    @stub
    // Checks that the specified value is valid.
    def checkValidValue(value: Long, field: TemporalField): Long = ???

    @stub
    // Checks if this range is equal to another range.
    def equals(obj: Object): Boolean = ???

    @stub
    // Gets the largest possible minimum value that the field can take.
    def getLargestMinimum(): Long = ???

    @stub
    // Gets the maximum value that the field can take.
    def getMaximum(): Long = ???

    @stub
    // Gets the minimum value that the field can take.
    def getMinimum(): Long = ???

    @stub
    // Gets the smallest possible maximum value that the field can take.
    def getSmallestMaximum(): Long = ???

    @stub
    // A hash code for this range.
    def hashCode(): Int = ???

    @stub
    // Is the value range fixed and fully known.
    def isFixed(): Boolean = ???

    @stub
    // Checks if all values in the range fit in an int.
    def isIntValue(): Boolean = ???

    @stub
    // Checks if the value is within the valid range and that all values
    // in the range fit in an int.
    def isValidIntValue(value: Long): Boolean = ???

    @stub
    // Checks if the value is within the valid range.
    def isValidValue(value: Long): Boolean = ???
}

object ValueRange {
    @stub
    // Obtains a fixed value range.
    def of(min: Long, max: Long): ValueRange = ???

    @stub
    // Obtains a variable value range.
    def of(min: Long, maxSmallest: Long, maxLargest: Long): ValueRange = ???

    @stub
    // Obtains a fully variable value range.
    def of(minSmallest: Long, minLargest: Long, maxSmallest: Long, maxLargest: Long): ValueRange = ???
}
