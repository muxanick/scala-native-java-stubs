package javax.swing.event

import java.lang.{Enum, Object, String}

// Enumeration of the types of RowSorterEvents.
class RowSorterEvent.Type private (name: String, ordinal: Int) extends Enum[RowSorterEvent.Type](name, ordinal) {
}

object RowSorterEvent.Type {
    // Indicates the sort order has changed.
    final val SORT_ORDER_CHANGED = new RowSorterEvent.Type(SORT_ORDER_CHANGED, 0)

    @stub
    // Returns the enum constant of this type with the specified name.
    def valueOf(name: String): RowSorterEvent.Type = ???
}
