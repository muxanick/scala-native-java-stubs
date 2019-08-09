package javax.swing

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** A subclass of TransferHandler.DropLocation representing
 *  a drop location for a JTable.
 */
final object JTable.DropLocation extends TransferHandler.DropLocation {

    /** Returns the column index where a dropped item should be placed in the
     *  table.
     */
    @stub
    def getColumn(): Int = ???

    /** Returns the row index where a dropped item should be placed in the
     *  table.
     */
    @stub
    def getRow(): Int = ???

    /** Returns whether or not this location represents an insert
     *  of a column.
     */
    @stub
    def isInsertColumn(): Boolean = ???

    /** Returns whether or not this location represents an insert
     *  of a row.
     */
    @stub
    def isInsertRow(): Boolean = ???

    /** Returns a string representation of this drop location. */
    @stub
    def toString(): String = ???
}
