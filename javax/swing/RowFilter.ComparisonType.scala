package javax.swing

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/** Enumeration of the possible comparison values supported by
 *  some of the default RowFilters.
 */
class RowFilter.ComparisonType private (name: String, ordinal: Int) extends Enum[RowFilter.ComparisonType](name, ordinal) {
}

object RowFilter.ComparisonType {
    /** Indicates that entries with a value after the supplied
     *  value should be included.
     */
    final val AFTER = new RowFilter.ComparisonType(AFTER, 0)

    /** Indicates that entries with a value before the supplied
     *  value should be included.
     */
    final val BEFORE = new RowFilter.ComparisonType(BEFORE, 1)

    /** Indicates that entries with a value equal to the supplied
     *  value should be included.
     */
    final val EQUAL = new RowFilter.ComparisonType(EQUAL, 2)

    /** Indicates that entries with a value not equal to the supplied
     *  value should be included.
     */
    final val NOT_EQUAL = new RowFilter.ComparisonType(NOT_EQUAL, 3)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): RowFilter.ComparisonType = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[RowFilter.ComparisonType] = ???
}
