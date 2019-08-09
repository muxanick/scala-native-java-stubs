package java.awt

import java.lang.Object
import javax.accessibility.{AccessibleContext, AccessibleRole}

/** This class implements accessibility support for the
 *  Dialog class.  It provides an implementation of the
 *  Java Accessibility API appropriate to dialog user-interface elements.
 */
protected class Dialog.AccessibleAWTDialog extends Window.AccessibleAWTWindow {

    /** Get the role of this object. */
    @stub
    def getAccessibleRole(): AccessibleRole = ???
}
