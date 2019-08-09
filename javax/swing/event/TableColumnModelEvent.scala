package javax.swing.event

import java.lang.Object
import java.util.EventObject
import javax.swing.table.TableColumnModel
import scala.scalanative.annotation.stub

/** TableColumnModelEvent is used to notify listeners that a table
 *  column model has changed, such as a column was added, removed, or
 *  moved.
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
class TableColumnModelEvent extends EventObject {

    /** Constructs a TableColumnModelEvent object. */
    @stub
    def this(source: TableColumnModel, from: Int, to: Int) = ???

    /** The index of the column from where it was moved or removed */
    @stub
    protected val fromIndex: Int = ???

    /** The index of the column to where it was moved or added */
    @stub
    protected val toIndex: Int = ???

    /** Returns the fromIndex. */
    @stub
    def getFromIndex(): Int = ???

    /** Returns the toIndex. */
    @stub
    def getToIndex(): Int = ???
}
