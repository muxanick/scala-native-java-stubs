package javax.swing

import java.lang.Object

// A subclass of TransferHandler.DropLocation representing
// a drop location for a JTable.
object final JTable.DropLocation extends TransferHandler.DropLocation {

    @stub
    // Returns the column index where a dropped item should be placed in the
    // table.
    def getColumn(): Int = ???

    @stub
    // Returns the row index where a dropped item should be placed in the
    // table.
    def getRow(): Int = ???

    @stub
    // Returns whether or not this location represents an insert
    // of a column.
    def isInsertColumn(): Boolean = ???

    @stub
    // Returns whether or not this location represents an insert
    // of a row.
    def isInsertRow(): Boolean = ???
}
