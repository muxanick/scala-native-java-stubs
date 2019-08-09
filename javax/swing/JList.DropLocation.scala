package javax.swing

import java.lang.Object

// A subclass of TransferHandler.DropLocation representing
// a drop location for a JList.
object final JList.DropLocation extends TransferHandler.DropLocation {

    @stub
    // Returns the index where dropped data should be placed in the
    // list.
    def getIndex(): Int = ???

    @stub
    // Returns whether or not this location represents an insert
    // location.
    def isInsert(): Boolean = ???
}
