package java.awt

import java.lang.Object
import javax.accessibility.{AccessibleContext, AccessibleRole}

// This class implements accessibility support for the
// Dialog class.  It provides an implementation of the
// Java Accessibility API appropriate to dialog user-interface elements.
protected class Dialog.AccessibleAWTDialog extends Window.AccessibleAWTWindow {

    @stub
    // Get the role of this object.
    def getAccessibleRole(): AccessibleRole = ???
}
