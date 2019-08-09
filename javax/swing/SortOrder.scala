package javax.swing

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/** SortOrder is an enumeration of the possible sort orderings. */
class SortOrder private (name: String, ordinal: Int) extends Enum[SortOrder](name, ordinal) {
}

object SortOrder {
    /** Enumeration value indicating the items are sorted in increasing order. */
    final val ASCENDING = new SortOrder(ASCENDING, 0)

    /** Enumeration value indicating the items are sorted in decreasing order. */
    final val DESCENDING = new SortOrder(DESCENDING, 1)

    /** Enumeration value indicating the items are unordered. */
    final val UNSORTED = new SortOrder(UNSORTED, 2)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): SortOrder = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[SortOrder] = ???
}
