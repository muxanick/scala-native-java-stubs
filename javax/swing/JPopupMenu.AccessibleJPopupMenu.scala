package javax.swing

import java.awt.{Component.AccessibleAWTComponent, Container.AccessibleAWTContainer}
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import javax.accessibility.{AccessibleContext, AccessibleRole}
import scala.scalanative.annotation.stub

/** This class implements accessibility support for the
 *  JPopupMenu class.  It provides an implementation of the
 *  Java Accessibility API appropriate to popup menu user-interface
 *  elements.
 */
protected class JPopupMenu_AccessibleJPopupMenu extends JComponent.AccessibleJComponent with PropertyChangeListener {

    /** AccessibleJPopupMenu constructor */
    @stub
    protected def AccessibleJPopupMenu() = ???

    /** Get the role of this object. */
    @stub
    def getAccessibleRole(): AccessibleRole = ???

    /** This method gets called when a bound property is changed. */
    @stub
    def propertyChange(e: PropertyChangeEvent): Unit = ???
}
