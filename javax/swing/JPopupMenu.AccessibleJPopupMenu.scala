package javax.swing

import java.awt.{Component.AccessibleAWTComponent, Container.AccessibleAWTContainer}
import java.beans.PropertyChangeListener
import java.lang.Object
import javax.accessibility.{AccessibleContext, AccessibleRole}

/** This class implements accessibility support for the
 *  JPopupMenu class.  It provides an implementation of the
 *  Java Accessibility API appropriate to popup menu user-interface
 *  elements.
 */
protected class JPopupMenu.AccessibleJPopupMenu extends JComponent.AccessibleJComponent with PropertyChangeListener {

    /** Get the role of this object. */
    @stub
    def getAccessibleRole(): AccessibleRole = ???
}
