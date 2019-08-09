package javax.swing.plaf.basic

import java.awt.event.ActionEvent
import java.lang.{Object, String}
import javax.swing.AbstractAction
import scala.scalanative.annotation.stub

/** TreeHomeAction is used to handle end/home actions.
 *  Scrolls either the first or last cell to be visible based on
 *  direction.
 */
class BasicTreeUI.TreeHomeAction extends AbstractAction {

    /**  */
    @stub
    def TreeHomeAction(direction: Int, name: String) = ???

    /**  */
    @stub
    protected val direction: Int = ???

    /** Invoked when an action occurs. */
    @stub
    def actionPerformed(e: ActionEvent): Unit = ???

    /** Returns true if the action is enabled. */
    @stub
    def isEnabled(): Boolean = ???
}
