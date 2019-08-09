package javax.accessibility

import java.lang.String
import scala.scalanative.annotation.stub

/** The AccessibleAction interface should be supported by any object
 *  that can perform one or more actions.  This interface
 *  provides the standard mechanism for an assistive technology to determine
 *  what those actions are as well as tell the object to perform them.
 *  Any object that can be manipulated should support this
 *  interface.  Applications can determine if an object supports the
 *  AccessibleAction interface by first obtaining its AccessibleContext (see
 *  Accessible) and then calling the AccessibleContext.getAccessibleAction()
 *  method.  If the return value is not null, the object supports this interface.
 */
trait AccessibleAction {

    /** Performs the specified Action on the object */
    @stub
    def doAccessibleAction(i: Int): Boolean = ???

    /** Returns the number of accessible actions available in this object
     *  If there are more than one, the first one is considered the "default"
     *  action of the object.
     */
    @stub
    def getAccessibleActionCount(): Int = ???

    /** Returns a description of the specified action of the object. */
    @stub
    def getAccessibleActionDescription(i: Int): String = ???
}

object AccessibleAction {
    /** An action which causes a component to execute its default action. */
    @stub
    val CLICK: String = ???

    /** An action which decrements a value. */
    @stub
    val DECREMENT: String = ???

    /** An action which increments a value. */
    @stub
    val INCREMENT: String = ???

    /** An action which causes a tree node to
     *  collapse if expanded and expand if collapsed.
     */
    @stub
    val TOGGLE_EXPAND: String = ???

    /** An action which causes a popup to become visible if it is hidden and
     *  hidden if it is visible.
     */
    @stub
    val TOGGLE_POPUP: String = ???
}
