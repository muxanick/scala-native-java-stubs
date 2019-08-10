package javax.swing.plaf.basic

import java.awt.event.ActionEvent
import java.lang.{Object, String}
import javax.swing.AbstractAction
import scala.scalanative.annotation.stub

/** TreeTraverseAction is the action used for left/right keys.
 *  Will toggle the expandedness of a node, as well as potentially
 *  incrementing the selection.
 */
class BasicTreeUI_TreeTraverseAction extends AbstractAction {

    /**  */
    @stub
    def TreeTraverseAction(direction: Int, name: String) = ???

    /** Determines direction to traverse, 1 means expand, -1 means
     *  collapse.
     */
    @stub
    protected val direction: Int = ???

    /** Invoked when an action occurs. */
    @stub
    def actionPerformed(e: ActionEvent): Unit = ???

    /** Returns true if the action is enabled. */
    @stub
    def isEnabled(): Boolean = ???
}
