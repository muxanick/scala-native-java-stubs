package javax.swing.table

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** TableStringConverter is used to convert objects from the model into
 *  strings.  This is useful in filtering and searching when the model returns
 *  objects that do not have meaningful toString implementations.
 */
abstract class TableStringConverter extends Object {

    /**  */
    @stub
    def this() = ???

    /** Returns the string representation of the value at the specified
     *  location.
     */
    def toString(model: TableModel, row: Int, column: Int): String
}
