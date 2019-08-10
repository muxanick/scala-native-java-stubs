package java.time.temporal

import java.io.Serializable
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** The range of valid values for a date-time field.
 *  
 *  All TemporalField instances have a valid range of values.
 *  For example, the ISO day-of-month runs from 1 to somewhere between 28 and 31.
 *  This class captures that valid range.
 *  
 *  It is important to be aware of the limitations of this class.
 *  Only the minimum and maximum values are provided.
 *  It is possible for there to be invalid values within the outer range.
 *  For example, a weird field may have valid values of 1, 2, 4, 6, 7, thus
 *  have a range of '1 - 7', despite that fact that values 3 and 5 are invalid.
 *  
 *  Instances of this class are not tied to a specific field.
 */
final class ValueRange extends Object with Serializable {

    /** Checks that the specified value is valid and fits in an int. */
    @stub
    def checkValidIntValue(value: Long, field: TemporalField): Int = ???

    /** Checks that the specified value is valid. */
    @stub
    def checkValidValue(value: Long, field: TemporalField): Long = ???

    /** Checks if this range is equal to another range. */
    @stub
    def equals(obj: Any): Boolean = ???

    /** Gets the largest possible minimum value that the field can take. */
    @stub
    def getLargestMinimum(): Long = ???

    /** Gets the maximum value that the field can take. */
    @stub
    def getMaximum(): Long = ???

    /** Gets the minimum value that the field can take. */
    @stub
    def getMinimum(): Long = ???

    /** Gets the smallest possible maximum value that the field can take. */
    @stub
    def getSmallestMaximum(): Long = ???

    /** A hash code for this range. */
    @stub
    def hashCode(): Int = ???

    /** Is the value range fixed and fully known. */
    @stub
    def isFixed(): Boolean = ???

    /** Checks if all values in the range fit in an int. */
    @stub
    def isIntValue(): Boolean = ???

    /** Checks if the value is within the valid range and that all values
     *  in the range fit in an int.
     */
    @stub
    def isValidIntValue(value: Long): Boolean = ???

    /** Checks if the value is within the valid range. */
    @stub
    def isValidValue(value: Long): Boolean = ???

    /** Outputs this range as a String. */
    @stub
    def toString(): String = ???
}

object ValueRange {
    /** Obtains a fixed value range. */
    @stub
    def of(min: Long, max: Long): ValueRange = ???

    /** Obtains a variable value range. */
    @stub
    def of(min: Long, maxSmallest: Long, maxLargest: Long): ValueRange = ???

    /** Obtains a fully variable value range. */
    @stub
    def of(minSmallest: Long, minLargest: Long, maxSmallest: Long, maxLargest: Long): ValueRange = ???
}
