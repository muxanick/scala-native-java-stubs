package javax.sql.rowset

import java.lang.{Object, String}
import javax.sql.RowSet
import scala.scalanative.annotation.stub

/** The standard interface that provides the framework for all
 *  FilteredRowSet objects to describe their filters.
 * 
 *  1.0 Background
 *  The Predicate interface is a standard interface that
 *  applications can implement to define the filter they wish to apply to a
 *  a FilteredRowSet object. A FilteredRowSet
 *  object consumes implementations of this interface and enforces the
 *  constraints defined in the implementation of the method evaluate.
 *  A FilteredRowSet object enforces the filter constraints in a
 *  bi-directional manner: It outputs only rows that are within
 *  the constraints of the filter; and conversely, it inserts, modifies, or updates
 *  only rows that are within the constraints of the filter.
 * 
 *  2.0 Implementation Guidelines
 *  In order to supply a predicate for the FilteredRowSet.
 *  this interface must be implemented.  At this time, the JDBC RowSet
 *  Implementations (JSR-114) does not specify any standard filters definitions.
 *  By specifying a standard means and mechanism for a range of filters to be
 *  defined and deployed with both the reference and vendor implementations
 *  of the FilteredRowSet interface, this allows for a flexible
 *  and application motivated implementations of Predicate to emerge.
 *  
 *  A sample implementation would look something like this:
 *  
 *     public class Range implements Predicate {
 * 
 *        private int[] lo;
 *        private int[] hi;
 *        private int[] idx;
 * 
 *        public Range(int[] lo, int[] hi, int[] idx) {
 *           this.lo = lo;
 *           this.hi = hi;
 *           this.idx = idx;
 *        }
 * 
 *       public boolean evaluate(RowSet rs) {
 * 
 *           // Check the present row determine if it lies
 *           // within the filtering criteria.
 * 
 *           for (int i = 0; i < idx.length; i++) {
 *              int value;
 *              try {
 *                  value = (Integer) rs.getObject(idx[i]);
 *              } catch (SQLException ex) {
 *                  Logger.getLogger(Range.class.getName()).log(Level.SEVERE, null, ex);
 *                  return false;
 *              }
 * 
 *              if (value < lo[i] && value > hi[i]) {
 *                  // outside of filter constraints
 *                  return false;
 *              }
 *          }
 *          // Within filter constraints
 *         return true;
 *       }
 *    }
 *  
 *  
 *  The example above implements a simple range predicate. Note, that
 *  implementations should but are not required to provide String
 *  and integer index based constructors to provide for JDBC RowSet Implementation
 *  applications that use both column identification conventions.
 */
trait Predicate {

    /** This method is called by a FilteredRowSet object
     *  to check whether the value lies between the filtering criterion (or criteria
     *  if multiple constraints exist) set using the setFilter() method.
     */
    @stub
    def evaluate(value: Object, column: Int): Boolean = ???

    /** This method is called by the FilteredRowSet object
     *  to check whether the value lies between the filtering criteria set
     *  using the setFilter method.
     */
    @stub
    def evaluate(value: Object, columnName: String): Boolean = ???

    /** This method is typically called a FilteredRowSet object
     *  internal methods (not public) that control the RowSet object's
     *  cursor moving  from row to the next.
     */
    @stub
    def evaluate(rs: RowSet): Boolean = ???
}
