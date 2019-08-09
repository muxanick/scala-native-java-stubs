package javax.swing.event

import java.lang.Object
import java.util.EventObject
import javax.swing.RowSorter
import scala.scalanative.annotation.stub

/** RowSorterEvent provides notification of changes to
 *  a RowSorter.  Two types of notification are possible:
 *  
 *  Type.SORT_ORDER_CHANGED: indicates the sort order has
 *      changed.  This is typically followed by a notification of:
 *  Type.SORTED: indicates the contents of the model have
 *      been transformed in some way.  For example, the contents may have
 *      been sorted or filtered.
 *  
 */
class RowSorterEvent extends EventObject {

    /** Creates a RowSorterEvent of type
     *  SORT_ORDER_CHANGED.
     */
    @stub
    def this(source: RowSorter) = ???

    /** Creates a RowSorterEvent. */
    @stub
    def this(source: RowSorter, type: RowSorterEvent.Type, previousRowIndexToModel: Array[Int]) = ???

    /** Returns the location of index in terms of the
     *  model prior to the sort.
     */
    @stub
    def convertPreviousRowIndexToModel(index: Int): Int = ???

    /** Returns the number of rows before the sort. */
    @stub
    def getPreviousRowCount(): Int = ???

    /** Returns the source of the event as a RowSorter. */
    @stub
    def getSource(): RowSorter = ???

    /** Returns the type of event. */
    @stub
    def getType(): RowSorterEvent.Type = ???
}

object RowSorterEvent {
    /** Enumeration of the types of RowSorterEvents. */
    @stub
    object Type extends RowSorterEvent.Type
}
