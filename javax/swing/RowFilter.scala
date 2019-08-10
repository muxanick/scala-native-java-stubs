package javax.swing

import java.lang.{Iterable, Number, Object, String}
import java.util.Date
import scala.scalanative.annotation.stub

/** RowFilter is used to filter out entries from the
 *  model so that they are not shown in the view.  For example, a
 *  RowFilter associated with a JTable might
 *  only allow rows that contain a column with a specific string. The
 *  meaning of entry depends on the component type.
 *  For example, when a filter is
 *  associated with a JTable, an entry corresponds to a
 *  row; when associated with a JTree, an entry corresponds
 *  to a node.
 *  
 *  Subclasses must override the include method to
 *  indicate whether the entry should be shown in the
 *  view.  The Entry argument can be used to obtain the values in
 *  each of the columns in that entry.  The following example shows an
 *  include method that allows only entries containing one or
 *  more values starting with the string "a":
 *  
 *  RowFilter<Object,Object> startsWithAFilter = new RowFilter<Object,Object>() {
 *    public boolean include(Entry<? extends Object, ? extends Object> entry) {
 *      for (int i = entry.getValueCount() - 1; i >= 0; i--) {
 *        if (entry.getStringValue(i).startsWith("a")) {
 *          // The value starts with "a", include it
 *          return true;
 *        }
 *      }
 *      // None of the columns start with "a"; return false so that this
 *      // entry is not shown
 *      return false;
 *    }
 *  };
 *  
 *  RowFilter has two formal type parameters that allow
 *  you to create a RowFilter for a specific model. For
 *  example, the following assumes a specific model that is wrapping
 *  objects of type Person.  Only Persons
 *  with an age over 20 will be shown:
 *  
 *  RowFilter<PersonModel,Integer> ageFilter = new RowFilter<PersonModel,Integer>() {
 *    public boolean include(Entry<? extends PersonModel, ? extends Integer> entry) {
 *      PersonModel personModel = entry.getModel();
 *      Person person = personModel.getPerson(entry.getIdentifier());
 *      if (person.getAge() > 20) {
 *        // Returning true indicates this row should be shown.
 *        return true;
 *      }
 *      // Age is <= 20, don't show it.
 *      return false;
 *    }
 *  };
 *  PersonModel model = createPersonModel();
 *  TableRowSorter<PersonModel> sorter = new TableRowSorter<PersonModel>(model);
 *  sorter.setRowFilter(ageFilter);
 *  
 */
abstract class RowFilter[M, I] extends Object {

    /**  */
    @stub
    def this() = ???

    /** Returns true if the specified entry should be shown;
     *  returns false if the entry should be hidden.
     */
    def include(entry: RowFilter.Entry[_ <: M, _ <: I]): Boolean
}

object RowFilter {
    /** Enumeration of the possible comparison values supported by
     *  some of the default RowFilters.
     */
    type ComparisonType = RowFilter_ComparisonType

    /** An Entry object is passed to instances of
     *  RowFilter, allowing the filter to get the value of the
     *  entry's data, and thus to determine whether the entry should be shown.
     */
    type Entry[M, I] = RowFilter_Entry[M, I]

    /** Returns a RowFilter that includes entries if all
     *  of the supplied filters include the entry.
     */
    @stub
    def andFilter[M, I](filters: Iterable[_ <: RowFilter[_ >: M, _ >: I]]): RowFilter[M, I] = ???

    /** Returns a RowFilter that includes entries that
     *  have at least one Date value meeting the specified
     *  criteria.
     */
    @stub
    def dateFilter[M, I](type: RowFilter.ComparisonType, date: Date, indices: int*): RowFilter[M, I] = ???

    /** Returns a RowFilter that includes entries if the
     *  supplied filter does not include the entry.
     */
    @stub
    def notFilter[M, I](filter: RowFilter[M, I]): RowFilter[M, I] = ???

    /** Returns a RowFilter that includes entries that
     *  have at least one Number value meeting the
     *  specified criteria.
     */
    @stub
    def numberFilter[M, I](type: RowFilter.ComparisonType, number: Number, indices: int*): RowFilter[M, I] = ???

    /** Returns a RowFilter that includes entries if any
     *  of the supplied filters includes the entry.
     */
    @stub
    def orFilter[M, I](filters: Iterable[_ <: RowFilter[_ >: M, _ >: I]]): RowFilter[M, I] = ???

    /** Returns a RowFilter that uses a regular
     *  expression to determine which entries to include.
     */
    @stub
    def regexFilter[M, I](regex: String, indices: int*): RowFilter[M, I] = ???
}
