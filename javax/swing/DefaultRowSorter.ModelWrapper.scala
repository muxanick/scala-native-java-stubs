package javax.swing

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** DefaultRowSorter.ModelWrapper is responsible for providing
 *  the data that gets sorted by DefaultRowSorter.  You
 *  normally do not interact directly with ModelWrapper.
 *  Subclasses of DefaultRowSorter provide an
 *  implementation of ModelWrapper wrapping another model.
 *  For example,
 *  TableRowSorter provides a ModelWrapper that
 *  wraps a TableModel.
 *  
 *  ModelWrapper makes a distinction between values as
 *  Objects and Strings.  This allows
 *  implementations to provide a custom string
 *  converter to be used instead of invoking toString on the
 *  object.
 */
object protected abstract DefaultRowSorter.ModelWrapper[M, I] extends Object {

    /** Creates a new ModelWrapper. */
    @stub
    protected def ModelWrapper() = ???

    /** Returns the number of columns in the model. */
    @stub
    def getColumnCount(): Int

    /** Returns the identifier for the specified row. */
    @stub
    def getIdentifier(row: Int): I

    /** Returns the underlying model that this Model is
     *  wrapping.
     */
    @stub
    def getModel(): M

    /** Returns the number of rows in the model. */
    @stub
    def getRowCount(): Int

    /** Returns the value as a String at the specified
     *  index.
     */
    @stub
    def getStringValueAt(row: Int, column: Int): String = ???

    /** Returns the value at the specified index. */
    @stub
    def getValueAt(row: Int, column: Int): Object
}
