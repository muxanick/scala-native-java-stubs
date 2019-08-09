package javax.swing.undo

import java.util.Hashtable

/** StateEditable defines the interface for objects that can have
 *  their state undone/redone by a StateEdit.
 */
trait StateEditable {

    /** Upon receiving this message the receiver should extract any relevant
     *  state out of state.
     */
    @stub
    def restoreState(state: Hashtable[_, _]): Unit = ???
}
