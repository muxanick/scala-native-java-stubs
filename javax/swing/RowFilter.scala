package javax.swing

import java.lang.{Iterable, Number, Object}
import java.util.Date

// RowFilter is used to filter out entries from the
// model so that they are not shown in the view.  For example, a
// RowFilter associated with a JTable might
// only allow rows that contain a column with a specific string. The
// meaning of entry depends on the component type.
// For example, when a filter is
// associated with a JTable, an entry corresponds to a
// row; when associated with a JTree, an entry corresponds
// to a node.
// 
// Subclasses must override the include method to
// indicate whether the entry should be shown in the
// view.  The Entry argument can be used to obtain the values in
// each of the columns in that entry.  The following example shows an
// include method that allows only entries containing one or
// more values starting with the string "a":
// 
// RowFilter<Object,Object> startsWithAFilter = new RowFilter<Object,Object>() {
//   public boolean include(Entry<? extends Object, ? extends Object> entry) {
//     for (int i = entry.getValueCount() - 1; i >= 0; i--) {
//       if (entry.getStringValue(i).startsWith("a")) {
//         // The value starts with "a", include it
//         return true;
//       }
//     }
//     // None of the columns start with "a"; return false so that this
//     // entry is not shown
//     return false;
//   }
// };
// 
// RowFilter has two formal type parameters that allow
// you to create a RowFilter for a specific model. For
// example, the following assumes a specific model that is wrapping
// objects of type Person.  Only Persons
// with an age over 20 will be shown:
// 
// RowFilter<PersonModel,Integer> ageFilter = new RowFilter<PersonModel,Integer>() {
//   public boolean include(Entry<? extends PersonModel, ? extends Integer> entry) {
//     PersonModel personModel = entry.getModel();
//     Person person = personModel.getPerson(entry.getIdentifier());
//     if (person.getAge() > 20) {
//       // Returning true indicates this row should be shown.
//       return true;
//     }
//     // Age is <= 20, don't show it.
//     return false;
//   }
// };
// PersonModel model = createPersonModel();
// TableRowSorter<PersonModel> sorter = new TableRowSorter<PersonModel>(model);
// sorter.setRowFilter(ageFilter);
// 
abstract class RowFilter[M, I] extends Object {

    // Returns true if the specified entry should be shown;
    // returns false if the entry should be hidden.
    def include(entry: RowFilter.Entry[_ <: M, _ <: I]): Boolean
}

object RowFilter {
    @stub
    // Enumeration of the possible comparison values supported by
    // some of the default RowFilters.
    def RowFilter.ComparisonType: class = ???

    @stub
    // Returns a RowFilter that includes entries if all
    // of the supplied filters include the entry.
    def RowFilter[M, I]: [M, I] = ???

    @stub
    // Returns a RowFilter that includes entries that
    // have at least one Date value meeting the specified
    // criteria.
    def RowFilter[M, I]: [M, I] = ???

    @stub
    // Returns a RowFilter that includes entries if the
    // supplied filter does not include the entry.
    def RowFilter[M, I]: [M, I] = ???

    @stub
    // Returns a RowFilter that includes entries that
    // have at least one Number value meeting the
    // specified criteria.
    def RowFilter[M, I]: [M, I] = ???

    @stub
    // Returns a RowFilter that includes entries if any
    // of the supplied filters includes the entry.
    def RowFilter[M, I]: [M, I] = ???
}
