package javax.swing

import java.lang.Object
import java.util.{Comparator, List}
import scala.scalanative.annotation.stub

/** An implementation of RowSorter that provides sorting and
 *  filtering around a grid-based data model.
 *  Beyond creating and installing a RowSorter, you very rarely
 *  need to interact with one directly.  Refer to
 *  TableRowSorter for a concrete
 *  implementation of RowSorter for JTable.
 *  
 *  Sorting is done based on the current SortKeys, in order.
 *  If two objects are equal (the Comparator for the
 *  column returns 0) the next SortKey is used.  If no
 *  SortKeys remain or the order is UNSORTED, then
 *  the order of the rows in the model is used.
 *  
 *  Sorting of each column is done by way of a Comparator
 *  that you can specify using the setComparator method.
 *  If a Comparator has not been specified, the
 *  Comparator returned by
 *  Collator.getInstance() is used on the results of
 *  calling toString on the underlying objects.  The
 *  Comparator is never passed null.  A
 *  null value is treated as occurring before a
 *  non-null value, and two null values are
 *  considered equal.
 *  
 *  If you specify a Comparator that casts its argument to
 *  a type other than that provided by the model, a
 *  ClassCastException will be thrown when the data is sorted.
 *  
 *  In addition to sorting, DefaultRowSorter provides the
 *  ability to filter rows.  Filtering is done by way of a
 *  RowFilter that is specified using the
 *  setRowFilter method.  If no filter has been specified all
 *  rows are included.
 *  
 *  By default, rows are in unsorted order (the same as the model) and
 *  every column is sortable. The default Comparators are
 *  documented in the subclasses (for example, TableRowSorter).
 *  
 *  If the underlying model structure changes (the
 *  modelStructureChanged method is invoked) the following
 *  are reset to their default values: Comparators by
 *  column, current sort order, and whether each column is sortable. To
 *  find the default Comparators, see the concrete
 *  implementation (for example, TableRowSorter).  The default
 *  sort order is unsorted (the same as the model), and columns are
 *  sortable by default.
 *  
 *  If the underlying model structure changes (the
 *  modelStructureChanged method is invoked) the following
 *  are reset to their default values: Comparators by column,
 *  current sort order and whether a column is sortable.
 *  
 *  DefaultRowSorter is an abstract class.  Concrete
 *  subclasses must provide access to the underlying data by invoking
 *  setModelWrapper. The setModelWrapper method
 *  must be invoked soon after the constructor is
 *  called, ideally from within the subclass's constructor.
 *  Undefined behavior will result if you use a DefaultRowSorter without specifying a ModelWrapper.
 *  
 *  DefaultRowSorter has two formal type parameters.  The
 *  first type parameter corresponds to the class of the model, for example
 *  DefaultTableModel.  The second type parameter
 *  corresponds to the class of the identifier passed to the
 *  RowFilter.  Refer to TableRowSorter and
 *  RowFilter for more details on the type parameters.
 */
abstract class DefaultRowSorter[M, I] extends RowSorter[M] {

    /** Creates an empty DefaultRowSorter. */
    @stub
    def this() = ???

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

    /** Returns the Comparator for the specified
     *  column.
     */
    def getComparator(column: Int): Comparator[_]

    /** Returns the maximum number of sort keys. */
    def getMaxSortKeys(): Int

    /** Returns the underlying model. */
    def getModel(): M

    /** Returns the number of rows in the underlying model. */
    def getModelRowCount(): Int

    /** Returns the model wrapper providing the data that is being sorted and
     *  filtered.
     */
    protected def getModelWrapper(): DefaultRowSorter.ModelWrapper[M, I]

    /** Returns the filter that determines which rows, if any, should
     *  be hidden from view.
     */
    def getRowFilter(): RowFilter[_ >: M, _ >: I]

    /** Returns the current sort keys. */
    def getSortKeys(): List[_ <: RowSorter.SortKey]

    /** Returns true if  a sort should happen when the underlying
     *  model is updated; otherwise, returns false.
     */
    def getSortsOnUpdates(): Boolean

    /** Returns the number of rows in the view. */
    def getViewRowCount(): Int

    /** Returns true if the specified column is sortable; otherwise, false. */
    def isSortable(column: Int): Boolean

    /** Invoked when the underlying model structure has completely
     *  changed.
     */
    def modelStructureChanged(): Unit

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

    /** Sets the Comparator to use when sorting the specified
     *  column.
     */
    def setComparator(column: Int, comparator: Comparator[_]): Unit

    /** Sets the maximum number of sort keys. */
    def setMaxSortKeys(max: Int): Unit

    /** Sets the model wrapper providing the data that is being sorted and
     *  filtered.
     */
    protected def setModelWrapper(modelWrapper: DefaultRowSorter.ModelWrapper[M, I]): Unit

    /** Sets the filter that determines which rows, if any, should be
     *  hidden from the view.
     */
    def setRowFilter(filter: RowFilter[_ >: M, _ >: I]): Unit

    /** Sets whether or not the specified column is sortable. */
    def setSortable(column: Int, sortable: Boolean): Unit

    /** Sets the sort keys. */
    def setSortKeys(sortKeys: List[_ <: RowSorter.SortKey]): Unit

    /** If true, specifies that a sort should happen when the underlying
     *  model is updated (rowsUpdated is invoked).
     */
    def setSortsOnUpdates(sortsOnUpdates: Boolean): Unit

    /** Sorts and filters the rows in the view based on the sort keys
     *  of the columns currently being sorted and the filter, if any,
     *  associated with this sorter.
     */
    def sort(): Unit

    /** Reverses the sort order from ascending to descending (or
     *  descending to ascending) if the specified column is already the
     *  primary sorted column; otherwise, makes the specified column
     *  the primary sorted column, with an ascending sort order.
     */
    def toggleSortOrder(column: Int): Unit

    /** Returns whether or not to convert the value to a string before
     *  doing comparisons when sorting.
     */
    protected def useToString(column: Int): Boolean
}

object DefaultRowSorter {
    /** DefaultRowSorter.ModelWrapper is responsible for providing
     *  the data that gets sorted by DefaultRowSorter.
     */
    @stub
    protected object ModelWrapper[M, I] extends DefaultRowSorter.ModelWrapper[M, I]
}
