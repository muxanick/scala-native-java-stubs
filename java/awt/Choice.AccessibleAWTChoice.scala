package java.awt

import java.lang.{Object, String}
import javax.accessibility.{AccessibleAction, AccessibleContext, AccessibleRole}
import scala.scalanative.annotation.stub

/** This class implements accessibility support for the
 *  Choice class.  It provides an implementation of the
 *  Java Accessibility API appropriate to choice user-interface elements.
 */
protected class Choice.AccessibleAWTChoice extends Component.AccessibleAWTComponent with AccessibleAction {

    /**  */
    @stub
    def AccessibleAWTChoice() = ???

    /** Perform the specified Action on the object */
    @stub
    def doAccessibleAction(i: Int): Boolean = ???

    /** Get the AccessibleAction associated with this object. */
    @stub
    def getAccessibleAction(): AccessibleAction = ???

    /** Returns the number of accessible actions available in this object
     *  If there are more than one, the first one is considered the "default"
     *  action of the object.
     */
    @stub
    def getAccessibleActionCount(): Int = ???

    /** Returns a description of the specified action of the object. */
    @stub
    def getAccessibleActionDescription(i: Int): String = ???

    /** Get the role of this object. */
    @stub
    def getAccessibleRole(): AccessibleRole = ???
}
