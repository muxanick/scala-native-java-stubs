package javax.swing

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/** Printing modes, used in printing JTables. */
class JTable.PrintMode private (name: String, ordinal: Int) extends Enum[JTable.PrintMode](name, ordinal) {
}

object JTable.PrintMode {
    /** Printing mode that scales the output smaller, if necessary,
     *  to fit the table's entire width (and thereby all columns) on each page;
     *  Rows are spread across multiple pages as necessary.
     */
    final val FIT_WIDTH = new JTable.PrintMode(FIT_WIDTH, 0)

    /** Printing mode that prints the table at its current size,
     *  spreading both columns and rows across multiple pages if necessary.
     */
    final val NORMAL = new JTable.PrintMode(NORMAL, 1)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): JTable.PrintMode = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[JTable.PrintMode] = ???
}
