package javax.swing

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** An Entry object is passed to instances of
 *  RowFilter, allowing the filter to get the value of the
 *  entry's data, and thus to determine whether the entry should be shown.
 *  An Entry object contains information about the model
 *  as well as methods for getting the underlying values from the model.
 */
object abstract RowFilter.Entry[M, I] extends Object {

    /** Creates an Entry. */
    @stub
    def Entry() = ???

    /** Returns the identifer (in the model) of the entry. */
    @stub
    def getIdentifier(): I

    /** Returns the underlying model. */
    @stub
    def getModel(): M

    /** Returns the string value at the specified index. */
    @stub
    def getStringValue(index: Int): String = ???

    /** Returns the value at the specified index. */
    @stub
    def getValue(index: Int): Object

    /** Returns the number of values in the entry. */
    @stub
    def getValueCount(): Int
}
