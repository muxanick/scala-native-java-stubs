package javax.swing

import java.lang.{Enum, Object, String}

// SortOrder is an enumeration of the possible sort orderings.
class SortOrder private (name: String, ordinal: Int) extends Enum[SortOrder](name, ordinal) {
}

object SortOrder {
    // Enumeration value indicating the items are sorted in increasing order.
    final val ASCENDING = new SortOrder(ASCENDING, 0)

    // Enumeration value indicating the items are sorted in decreasing order.
    final val DESCENDING = new SortOrder(DESCENDING, 1)

    @stub
    // Returns the enum constant of this type with the specified name.
    def valueOf(name: String): SortOrder = ???
}
