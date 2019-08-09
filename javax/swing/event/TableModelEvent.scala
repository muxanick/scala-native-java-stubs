package javax.swing.event

import java.lang.Object
import java.util.EventObject
import javax.swing.table.TableModel
import scala.scalanative.annotation.stub

/** TableModelEvent is used to notify listeners that a table model
 *  has changed. The model event describes changes to a TableModel
 *  and all references to rows and columns are in the co-ordinate
 *  system of the model.
 *  Depending on the parameters used in the constructors, the TableModelevent
 *  can be used to specify the following types of changes:
 * 
 *  
 *  TableModelEvent(source);              //  The data, ie. all rows changed
 *  TableModelEvent(source, HEADER_ROW);  //  Structure change, reallocate TableColumns
 *  TableModelEvent(source, 1);           //  Row 1 changed
 *  TableModelEvent(source, 3, 6);        //  Rows 3 to 6 inclusive changed
 *  TableModelEvent(source, 2, 2, 6);     //  Cell at (2, 6) changed
 *  TableModelEvent(source, 3, 6, ALL_COLUMNS, INSERT); // Rows (3, 6) were inserted
 *  TableModelEvent(source, 3, 6, ALL_COLUMNS, DELETE); // Rows (3, 6) were deleted
 *  
 * 
 *  It is possible to use other combinations of the parameters, not all of them
 *  are meaningful. By subclassing, you can add other information, for example:
 *  whether the event WILL happen or DID happen. This makes the specification
 *  of rows in DELETE events more useful but has not been included in
 *  the swing package as the JTable only needs post-event notification.
 *  
 *  Warning:
 *  Serialized objects of this class will not be compatible with
 *  future Swing releases. The current serialization support is
 *  appropriate for short term storage or RMI between applications running
 *  the same version of Swing.  As of 1.4, support for long term storage
 *  of all JavaBeans™
 *  has been added to the java.beans package.
 *  Please see XMLEncoder.
 */
class TableModelEvent extends EventObject {

    /** All row data in the table has changed, listeners should discard any state
     *   that was based on the rows and requery the TableModel
     *   to get the new row count and all the appropriate values.
     */
    @stub
    def this(source: TableModel) = ???

    /** This row of data has been updated. */
    @stub
    def this(source: TableModel, row: Int) = ???

    /** The data in rows [firstRow, lastRow] have been updated. */
    @stub
    def this(source: TableModel, firstRow: Int, lastRow: Int) = ???

    /** The cells in column column in the range
     *   [firstRow, lastRow] have been updated.
     */
    @stub
    def this(source: TableModel, firstRow: Int, lastRow: Int, column: Int) = ???

    /** The cells from (firstRow, column) to (lastRow, column) have been changed. */
    @stub
    def this(source: TableModel, firstRow: Int, lastRow: Int, column: Int, type: Int) = ???

    /**  */
    @stub
    protected val column: Int = ???

    /**  */
    @stub
    protected val firstRow: Int = ???

    /**  */
    @stub
    protected val lastRow: Int = ???

    /**  */
    @stub
    protected val type: Int = ???

    /** Returns the column for the event. */
    @stub
    def getColumn(): Int = ???

    /** Returns the first row that changed. */
    @stub
    def getFirstRow(): Int = ???

    /** Returns the last row that changed. */
    @stub
    def getLastRow(): Int = ???

    /** Returns the type of event - one of: INSERT, UPDATE and DELETE. */
    @stub
    def getType(): Int = ???
}

object TableModelEvent {
    /** Specifies all columns in a row or rows. */
    @stub
    val ALL_COLUMNS: Int = ???

    /** Identifies the removal of rows or columns. */
    @stub
    val DELETE: Int = ???

    /** Identifies the header row. */
    @stub
    val HEADER_ROW: Int = ???

    /** Identifies the addition of new rows or columns. */
    @stub
    val INSERT: Int = ???

    /** Identifies a change to existing data. */
    @stub
    val UPDATE: Int = ???
}
