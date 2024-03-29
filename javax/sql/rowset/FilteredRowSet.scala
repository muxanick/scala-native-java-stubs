package javax.sql.rowset

import scala.scalanative.annotation.stub

/** The standard interface that all standard implementations of
 *  FilteredRowSet must implement. The FilteredRowSetImpl class
 *  provides the reference implementation which may be extended if required.
 *  Alternatively, a vendor is free to implement its own version
 *  by implementing this interface.
 * 
 *  1.0 Background
 * 
 *  There are occasions when a RowSet object has a need to provide a degree
 *  of filtering to its contents. One possible solution is to provide
 *  a query language for all standard RowSet implementations; however,
 *  this is an impractical approach for lightweight components such as disconnected
 *  RowSet
 *  objects. The FilteredRowSet interface seeks to address this need
 *  without supplying a heavyweight query language along with the processing that
 *  such a query language would require.
 *  
 *  A JDBC FilteredRowSet standard implementation implements the
 *  RowSet interfaces and extends the
 *  CachedRowSet™ class. The
 *  CachedRowSet class provides a set of protected cursor manipulation
 *  methods, which a FilteredRowSet implementation can override
 *  to supply filtering support.
 * 
 *  2.0 Predicate Sharing
 * 
 *  If a FilteredRowSet implementation is shared using the
 *  inherited createShared method in parent interfaces, the
 *  Predicate should be shared without modification by all
 *  FilteredRowSet instance clones.
 * 
 *  3.0 Usage
 *  
 *  By implementing a Predicate (see example in Predicate
 *  class JavaDoc), a FilteredRowSet could then be used as described
 *  below.
 * 
 *  
 *  
 *      FilteredRowSet frs = new FilteredRowSetImpl();
 *      frs.populate(rs);
 * 
 *      Range name = new Range("Alpha", "Bravo", "columnName");
 *      frs.setFilter(name);
 * 
 *      frs.next() // only names from "Alpha" to "Bravo" will be returned
 *  
 *  
 *  In the example above, we initialize a Range object which
 *  implements the Predicate interface. This object expresses
 *  the following constraints: All rows outputted or modified from this
 *  FilteredRowSet object must fall between the values 'Alpha' and
 *  'Bravo' both values inclusive, in the column 'columnName'. If a filter is
 *  applied to a FilteredRowSet object that contains no data that
 *  falls within the range of the filter, no rows are returned.
 *  
 *  This framework allows multiple classes implementing predicates to be
 *  used in combination to achieved the required filtering result with
 *  out the need for query language processing.
 * 
 *  4.0 Updating a FilteredRowSet Object
 *  The predicate set on a FilteredRowSet object
 *  applies a criterion on all rows in a
 *  RowSet object to manage a subset of rows in a RowSet
 *  object. This criterion governs the subset of rows that are visible and also
 *  defines which rows can be modified, deleted or inserted.
 *  
 *  Therefore, the predicate set on a FilteredRowSet object must be
 *  considered as bi-directional and the set criterion as the gating mechanism
 *  for all views and updates to the FilteredRowSet object. Any attempt
 *  to update the FilteredRowSet that violates the criterion will
 *  result in a SQLException object being thrown.
 *  
 *  The FilteredRowSet range criterion can be modified by applying
 *  a new Predicate object to the FilteredRowSet
 *  instance at any time. This is  possible if no additional references to the
 *  FilteredRowSet object are detected. A new filter has has an
 *  immediate effect on criterion enforcement within the
 *  FilteredRowSet object, and all subsequent views and updates will be
 *  subject to similar enforcement.
 * 
 *  5.0 Behavior of Rows Outside the Filter
 *  Rows that fall outside of the filter set on a FilteredRowSet
 *  object cannot be modified until the filter is removed or a
 *  new filter is applied.
 *  
 *  Furthermore, only rows that fall within the bounds of a filter will be
 *  synchronized with the data source.
 */
trait FilteredRowSet extends WebRowSet {

    /** Retrieves the active filter for this FilteredRowSet object. */
    @stub
    def getFilter(): Predicate = ???

    /** Applies the given Predicate object to this
     *  FilteredRowSet
     *  object.
     */
    @stub
    def setFilter(p: Predicate): Unit = ???
}
