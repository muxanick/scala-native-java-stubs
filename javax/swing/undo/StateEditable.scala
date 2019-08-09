package javax.swing.undo

import java.lang.{Object, String}
import java.util.Hashtable
import scala.scalanative.annotation.stub

/** StateEditable defines the interface for objects that can have
 *  their state undone/redone by a StateEdit.
 */
trait StateEditable {

    /** Upon receiving this message the receiver should extract any relevant
     *  state out of state.
     */
    @stub
    def restoreState(state: Hashtable[_, _]): Unit = ???

    /** Upon receiving this message the receiver should place any relevant
     *  state into state.
     */
    @stub
    def storeState(state: Hashtable[Object, Object]): Unit = ???
}

object StateEditable {
    /** Resource ID for this class. */
    @stub
    val RCSID: String = ???
}
