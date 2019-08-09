package javax.swing

import java.awt.{Component.AccessibleAWTComponent, Container.AccessibleAWTContainer}
import java.lang.Object
import javax.accessibility.{AccessibleContext, AccessibleRole}

// This class implements accessibility support for the
// JToolBar class.  It provides an implementation of the
// Java Accessibility API appropriate to toolbar user-interface elements.
protected class JToolBar.AccessibleJToolBar extends JComponent.AccessibleJComponent {

    @stub
    // Get the role of this object.
    def getAccessibleRole(): AccessibleRole = ???
}
