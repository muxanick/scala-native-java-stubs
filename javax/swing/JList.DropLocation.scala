package javax.swing

import java.lang.Object

/** A subclass of TransferHandler.DropLocation representing
 *  a drop location for a JList.
 */
final object JList.DropLocation extends TransferHandler.DropLocation {

    /** Returns the index where dropped data should be placed in the
     *  list.
     */
    @stub
    def getIndex(): Int = ???

    /** Returns whether or not this location represents an insert
     *  location.
     */
    @stub
    def isInsert(): Boolean = ???
}
