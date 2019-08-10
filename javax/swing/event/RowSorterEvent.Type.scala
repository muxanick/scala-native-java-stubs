package javax.swing.event

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/** Enumeration of the types of RowSorterEvents. */
class RowSorterEvent_Type private (name: String, ordinal: Int) extends Enum[RowSorterEvent.Type](name, ordinal) {
}

object RowSorterEvent_Type {
    /** Indicates the sort order has changed. */
    final val SORT_ORDER_CHANGED = new RowSorterEvent.Type(SORT_ORDER_CHANGED, 0)

    /** Indicates the contents have been newly sorted or
     *  transformed in some way.
     */
    final val SORTED = new RowSorterEvent.Type(SORTED, 1)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): RowSorterEvent.Type = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[RowSorterEvent.Type] = ???
}
