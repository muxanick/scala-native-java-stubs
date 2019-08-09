package javax.swing

import java.lang.Object
import java.util.List
import javax.swing.event.RowSorterListener

/** RowSorter provides the basis for sorting and filtering.
 *  Beyond creating and installing a RowSorter, you very rarely
 *  need to interact with one directly.  Refer to
 *  TableRowSorter for a concrete
 *  implementation of RowSorter for JTable.
 *  
 *  RowSorter's primary role is to provide a mapping between
 *  two coordinate systems: that of the view (for example a
 *  JTable) and that of the underlying data source, typically a
 *  model.
 *  
 *  The view invokes the following methods on the RowSorter:
 *  
 *  toggleSortOrder — The view invokes this when the
 *      appropriate user gesture has occurred to trigger a sort.  For example,
 *      the user clicked a column header in a table.
 *  One of the model change methods — The view invokes a model
 *      change method when the underlying model
 *      has changed.  There may be order dependencies in how the events are
 *      delivered, so a RowSorter should not update its mapping
 *      until one of these methods is invoked.
 *  
 *  Because the view makes extensive use of  the
 *  convertRowIndexToModel,
 *  convertRowIndexToView and getViewRowCount methods,
 *  these methods need to be fast.
 *  
 *  RowSorter provides notification of changes by way of
 *  RowSorterListener.  Two types of notification are sent:
 *  
 *  RowSorterEvent.Type.SORT_ORDER_CHANGED — notifies
 *      listeners that the sort order has changed.  This is typically followed
 *      by a notification that the sort has changed.
 *  RowSorterEvent.Type.SORTED — notifies listeners that
 *      the mapping maintained by the RowSorter has changed in
 *      some way.
 *  
 *  RowSorter implementations typically don't have a one-to-one
 *  mapping with the underlying model, but they can.
 *  For example, if a database does the sorting,
 *  toggleSortOrder might call through to the database
 *  (on a background thread), and override the mapping methods to return the
 *  argument that is passed in.
 *  
 *  Concrete implementations of RowSorter
 *  need to reference a model such as TableModel or
 *  ListModel.  The view classes, such as
 *  JTable and JList, will also have a
 *  reference to the model.  To avoid ordering dependencies,
 *  RowSorter implementations should not install a
 *  listener on the model.  Instead the view class will call into the
 *  RowSorter when the model changes.  For
 *  example, if a row is updated in a TableModel
 *  JTable invokes rowsUpdated.
 *  When the model changes, the view may call into any of the following methods:
 *  modelStructureChanged, allRowsChanged,
 *  rowsInserted, rowsDeleted and
 *  rowsUpdated.
 */
abstract class RowSorter[M] extends Object {

    /** Adds a RowSorterListener to receive notification
     *  about this RowSorter.
     */
    def addRowSorterListener(l: RowSorterListener): Unit

    /** Invoked when the contents of the underlying model have
     *  completely changed.
     */
    def allRowsChanged(): Unit

    /** Returns the location of index in terms of the
     *  underlying model.
     */
    def convertRowIndexToModel(index: Int): Int

    /** Returns the location of index in terms of the
     *  view.
     */
    def convertRowIndexToView(index: Int): Int

    /** Notifies listener that the mapping has changed. */
    protected def fireRowSorterChanged(lastRowIndexToModel: Array[Int]): Unit

    /** Notifies listener that the sort order has changed. */
    protected def fireSortOrderChanged(): Unit

    /** Returns the underlying model. */
    def getModel(): M

    /** Returns the number of rows in the underlying model. */
    def getModelRowCount(): Int

    /** Returns the current sort keys. */
    def getSortKeys(): List[_ <: RowSorter.SortKey]

    /** Returns the number of rows in the view. */
    def getViewRowCount(): Int

    /** Invoked when the underlying model structure has completely
     *  changed.
     */
    def modelStructureChanged(): Unit

    /** Removes a RowSorterListener. */
    def removeRowSorterListener(l: RowSorterListener): Unit

    /** Invoked when rows have been deleted from the underlying model
     *  in the specified range (inclusive).
     */
    def rowsDeleted(firstRow: Int, endRow: Int): Unit

    /** Invoked when rows have been inserted into the underlying model
     *  in the specified range (inclusive).
     */
    def rowsInserted(firstRow: Int, endRow: Int): Unit

    /** Invoked when rows have been changed in the underlying model
     *  between the specified range (inclusive).
     */
    def rowsUpdated(firstRow: Int, endRow: Int): Unit

    /** Invoked when the column in the rows have been updated in
     *  the underlying model between the specified range.
     */
    def rowsUpdated(firstRow: Int, endRow: Int, column: Int): Unit

    /** Sets the current sort keys. */
    def setSortKeys(keys: List[_ <: RowSorter.SortKey]): Unit
}
