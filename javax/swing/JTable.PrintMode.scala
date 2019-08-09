package javax.swing

import java.lang.{Enum, Object, String}

// Printing modes, used in printing JTables.
class JTable.PrintMode private (name: String, ordinal: Int) extends Enum[JTable.PrintMode](name, ordinal) {
}

object JTable.PrintMode {
    // Printing mode that scales the output smaller, if necessary,
    // to fit the table's entire width (and thereby all columns) on each page;
    // Rows are spread across multiple pages as necessary.
    final val FIT_WIDTH = new JTable.PrintMode(FIT_WIDTH, 0)

    @stub
    // Returns the enum constant of this type with the specified name.
    def valueOf(name: String): JTable.PrintMode = ???
}
