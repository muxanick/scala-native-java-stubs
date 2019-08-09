package javax.accessibility

import java.lang.String

// The AccessibleAction interface should be supported by any object
// that can perform one or more actions.  This interface
// provides the standard mechanism for an assistive technology to determine
// what those actions are as well as tell the object to perform them.
// Any object that can be manipulated should support this
// interface.  Applications can determine if an object supports the
// AccessibleAction interface by first obtaining its AccessibleContext (see
// Accessible) and then calling the AccessibleContext.getAccessibleAction()
// method.  If the return value is not null, the object supports this interface.
trait AccessibleAction {

    @stub
    // Performs the specified Action on the object
    def doAccessibleAction(i: Int): Boolean = ???

    @stub
    // Returns the number of accessible actions available in this object
    // If there are more than one, the first one is considered the "default"
    // action of the object.
    def getAccessibleActionCount(): Int = ???
}

object AccessibleAction {
    @stub
    // An action which causes a component to execute its default action.
    def CLICK: String = ???

    @stub
    // An action which decrements a value.
    def DECREMENT: String = ???

    @stub
    // An action which increments a value.
    def INCREMENT: String = ???

    @stub
    // An action which causes a tree node to
    // collapse if expanded and expand if collapsed.
    def TOGGLE_EXPAND: String = ???
}
