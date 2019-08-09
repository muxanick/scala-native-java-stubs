package javax.swing.plaf.basic

import java.awt.event.ActionEvent
import java.lang.{Object, String}
import javax.swing.AbstractAction
import scala.scalanative.annotation.stub

/** TreePageAction handles page up and page down events. */
class BasicTreeUI.TreePageAction extends AbstractAction {

    /**  */
    @stub
    def TreePageAction(direction: Int, name: String) = ???

    /** Specifies the direction to adjust the selection by. */
    @stub
    protected val direction: Int = ???

    /** Invoked when an action occurs. */
    @stub
    def actionPerformed(e: ActionEvent): Unit = ???

    /** Returns true if the action is enabled. */
    @stub
    def isEnabled(): Boolean = ???
}
