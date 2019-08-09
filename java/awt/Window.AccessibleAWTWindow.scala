package java.awt

import java.lang.Object
import javax.accessibility.{AccessibleContext, AccessibleRole}

// This class implements accessibility support for the
// Window class.  It provides an implementation of the
// Java Accessibility API appropriate to window user-interface elements.
protected class Window.AccessibleAWTWindow extends Container.AccessibleAWTContainer {

    @stub
    // Get the role of this object.
    def getAccessibleRole(): AccessibleRole = ???
}
