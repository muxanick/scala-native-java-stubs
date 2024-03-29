package javax.swing.table

import java.lang.{Integer, Object}
import java.util.Comparator
import javax.swing.{DefaultRowSorter, RowSorter}
import scala.scalanative.annotation.stub

/** An implementation of RowSorter that provides sorting
 *  and filtering using a TableModel.
 *  The following example shows adding sorting to a JTable:
 *  
 *    TableModel myModel = createMyTableModel();
 *    JTable table = new JTable(myModel);
 *    table.setRowSorter(new TableRowSorter(myModel));
 *  
 *  This will do all the wiring such that when the user does the appropriate
 *  gesture, such as clicking on the column header, the table will
 *  visually sort.
 *  
 *  JTable's row-based methods and JTable's
 *  selection model refer to the view and not the underlying
 *  model. Therefore, it is necessary to convert between the two.  For
 *  example, to get the selection in terms of myModel
 *  you need to convert the indices:
 *  
 *    int[] selection = table.getSelectedRows();
 *    for (int i = 0; i < selection.length; i++) {
 *      selection[i] = table.convertRowIndexToModel(selection[i]);
 *    }
 *  
 *  Similarly to select a row in JTable based on
 *  a coordinate from the underlying model do the inverse:
 *  
 *    table.setRowSelectionInterval(table.convertRowIndexToView(row),
 *                                  table.convertRowIndexToView(row));
 *  
 *  
 *  The previous example assumes you have not enabled filtering.  If you
 *  have enabled filtering convertRowIndexToView will return
 *  -1 for locations that are not visible in the view.
 *  
 *  TableRowSorter uses Comparators for doing
 *  comparisons. The following defines how a Comparator is
 *  chosen for a column:
 *  
 *  If a Comparator has been specified for the column by the
 *      setComparator method, use it.
 *  If the column class as returned by getColumnClass is
 *      String, use the Comparator returned by
 *      Collator.getInstance().
 *  If the column class implements Comparable, use a
 *      Comparator that invokes the compareTo
 *      method.
 *  If a TableStringConverter has been specified, use it
 *      to convert the values to Strings and then use the
 *      Comparator returned by Collator.getInstance().
 *  Otherwise use the Comparator returned by
 *      Collator.getInstance() on the results from
 *      calling toString on the objects.
 *  
 *  
 *  In addition to sorting TableRowSorter provides the ability
 *  to filter.  A filter is specified using the setFilter
 *  method. The following example will only show rows containing the string
 *  "foo":
 *  
 *    TableModel myModel = createMyTableModel();
 *    TableRowSorter sorter = new TableRowSorter(myModel);
 *    sorter.setRowFilter(RowFilter.regexFilter(".*foo.*"));
 *    JTable table = new JTable(myModel);
 *    table.setRowSorter(sorter);
 *  
 *  
 *  If the underlying model structure changes (the
 *  modelStructureChanged method is invoked) the following
 *  are reset to their default values: Comparators by
 *  column, current sort order, and whether each column is sortable. The default
 *  sort order is natural (the same as the model), and columns are
 *  sortable by default.
 *  
 *  TableRowSorter has one formal type parameter: the type
 *  of the model.  Passing in a type that corresponds exactly to your
 *  model allows you to filter based on your model without casting.
 *  Refer to the documentation of RowFilter for an example
 *  of this.
 *  
 *  WARNING: DefaultTableModel returns a column
 *  class of Object.  As such all comparisons will
 *  be done using toString.  This may be unnecessarily
 *  expensive.  If the column only contains one type of value, such as
 *  an Integer, you should override getColumnClass and
 *  return the appropriate Class.  This will dramatically
 *  increase the performance of this class.
 */
class TableRowSorter[M <: TableModel] extends DefaultRowSorter[M, Integer] {

    /** Creates a TableRowSorter with an empty model. */
    @stub
    def this() = ???

    /** Creates a TableRowSorter using model
     *  as the underlying TableModel.
     */
    @stub
    def this(model: M) = ???

    /** Returns the Comparator for the specified
     *  column.
     */
    @stub
    def getComparator(column: Int): Comparator[_] = ???

    /** Returns the object responsible for converting values from the
     *  model to strings.
     */
    @stub
    def getStringConverter(): TableStringConverter = ???

    /** Sets the TableModel to use as the underlying model
     *  for this TableRowSorter.
     */
    @stub
    def setModel(model: M): Unit = ???

    /** Sets the object responsible for converting values from the
     *  model to strings.
     */
    @stub
    def setStringConverter(stringConverter: TableStringConverter): Unit = ???

    /** Returns whether or not to convert the value to a string before
     *  doing comparisons when sorting.
     */
    @stub
    protected def useToString(column: Int): Boolean = ???
}
